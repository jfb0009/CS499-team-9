import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import org.json.JSONObject;

public class ReportGenerator {
	
	private Gradebook gradebook;
	private GradesTable gradesTable;
	private AssignmentTable assignmentTable;
	private StudentTable studentTable;
	
	private boolean assignmentAverage;
	private boolean assignmentMedian;
	private boolean assignmentMode;
	private boolean assignmentStandardDeviation;
	private boolean finalAverage;
	private boolean finalMedian;
	private boolean finalMode;
	private boolean finalStandardDeviation;
	
	private boolean assignmentbased = false;
	private boolean finalbased = false;
	private boolean studentbased = false;
	
	public ReportGenerator(Gradebook gradebook, GradesTable gradesTable, AssignmentTable at, StudentTable st, boolean aa, boolean ame, boolean amo, boolean asd, boolean fa, boolean fme, boolean fmo, boolean fsd, boolean sb) throws IOException
	{
		this.gradebook = gradebook;
		this.gradesTable = gradesTable;
		this.assignmentTable = at;
		this.studentTable = st;
		this.assignmentAverage = aa;
		this.assignmentMedian = ame;
		this.assignmentMode = amo;
		this.assignmentStandardDeviation = asd;
		this.finalAverage = fa;
		this.finalMedian = fme;
		this.finalMode = fmo;
		this.finalStandardDeviation = fsd;
		this.studentbased = sb;
		
		if(assignmentAverage || assignmentMedian || assignmentMode || assignmentStandardDeviation)
			assignmentbased = true;
		
		if(finalAverage || finalMedian || finalMode || finalStandardDeviation)
			finalbased = true;
		
		GenerateReport();
	}
	
	public void GenerateReport() throws IOException
	{			
		// Handle the assignment-based reports
		if(assignmentbased)
		{
			AssignmentReport();
		}
		
		// Handle final grade-based reports
		if(finalbased)
		{
			FinalReport();
		}
		
		// Handle student-based reports
		if(studentbased)
		{
			StudentReport();
		}
	}
	
	public void AssignmentReport() throws IOException
	{
		PrintWriter outputStream = null;
		outputStream = new PrintWriter(new FileWriter("AssignmentReport.txt"));
		
		LinkedList<Assignment> assignmentList = assignmentTable.getTable();
		String output = "";
		
		for(int i = 0; i < assignmentList.size(); i++)
		{
			output = assignmentList.get(i).getAssignmentName();
			
			if(assignmentAverage)
			{
				output += "\tAverage: ";
				
				LinkedList<Grade> assignmentGrades = gradesTable.getAssignment(assignmentList.get(i).getAssignmentName());
				double average = gradebook.getAssignmentAverage(assignmentGrades);
				
				output += average;
			}
			
			if(assignmentMedian)
			{
				output += "\tMedian: ";
				
				LinkedList<Grade> assignmentGrades = gradesTable.getAssignment(assignmentList.get(i).getAssignmentName());
				double median = gradebook.getAssignmentMedian(assignmentGrades);
				
				output += median;
			}
			
			if(assignmentMode)
			{
				output += "\tMode: ";
				
				LinkedList<Grade> assignmentGrades = gradesTable.getAssignment(assignmentList.get(i).getAssignmentName());
				double mode = gradebook.getAssignmentMode(assignmentGrades);
				
				output += mode;
			}
			
			if(assignmentStandardDeviation)
			{
				output += "\tStandard Deviation: ";
				
				LinkedList<Grade> assignmentGrades = gradesTable.getAssignment(assignmentList.get(i).getAssignmentName());
				double standardDeviation = gradebook.getAssignmentMode(assignmentGrades);
				
				output += standardDeviation;
			}
			
			outputStream.println(output);
			outputStream.flush();
		}
	}
	
	public void FinalReport() throws IOException
	{
		PrintWriter outputStream = null;
		outputStream = new PrintWriter(new FileWriter("FinalReport.txt"));
		
		LinkedList<Student> studentList = studentTable.getList();
		String output = "Final Grades";
		
		if(finalAverage)
		{
			double average = gradebook.getFinalGradeAverage(studentList);
			output += "\tAverage: ";
			output += average;
		}
		
		if(finalMedian)
		{
			double median = gradebook.getFinalGradeMedian(studentList);
			output += "\tMedian: ";
			output += median;
		}
		
		if(finalMode)
		{
			double mode = gradebook.getFinalGradeMode(studentList);
			output += "\tMode: ";
			output += mode;		
		}
		
		if(finalStandardDeviation)
		{
			double standardDeviation = gradebook.getFinalGradeStandardDeviation(studentList);
			output += "\tStandard Deviation: ";
			output += standardDeviation;
		}
		
		outputStream.println(output);
		outputStream.flush();
	}

	public void StudentReport() throws IOException
	{
		PrintWriter outputStream = null;
		outputStream = new PrintWriter(new FileWriter("StudentReport.txt"));
		
		LinkedList<Student> studentList = studentTable.getList();
		
		for(int i = 0; i < studentList.size(); i++)
		{
			Student currentStudent = studentList.get(i);
			
			double grade = gradebook.getStudentClassAverage(currentStudent);
			
			String output = String.format("Student: %s\tGrade: %f", currentStudent.getFullName(), grade);
			
			outputStream.println(output);
			outputStream.flush();
		}
		
	}

	public void StudentInfoReport(String file) throws IOException
	{
		PrintWriter outputStream = null;
		outputStream = new PrintWriter(new FileWriter("StudentInfoReport.txt"));

		JSONObject[] students = Database.getStudents(file);
		for (int i = 0; i < students.length; i++) {
			JSONObject currStudent = students[i];

			String output = String.format("First Name: %s\t\tLast Name: %s\t\tStudent ID: %s", currStudent.getString("studentName").split(" ")[0], currStudent.getString("studentName").split(" ")[1], currStudent.getString("studentNumber"));

			outputStream.println(output);
			outputStream.flush();
		}
	}
	
}
