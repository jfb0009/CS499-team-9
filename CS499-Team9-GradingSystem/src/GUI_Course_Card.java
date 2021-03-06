/**
 * File: GUI_Course_Card.java
 * Author(s): Jose Garcia Becerra
 */
import java.util.LinkedList;

import javax.swing.BorderFactory;
import org.json.JSONObject;

public class GUI_Course_Card extends javax.swing.JPanel{
    // Initialize variables
	private String courseName;
	private String shortName;
	private String term;
    private StudentTable studentList = new StudentTable();
    private AssignmentTable assignmentTableData = new AssignmentTable();
    private AssignmentWeightTable AssignmentWeightTableData = new AssignmentWeightTable();
    private GradesTable gradedTableData = new GradesTable();
    private Gradebook gradebook;
    private TermList termList;
    private ClassList classList;

     /**
      * Class constructor
      */
    public GUI_Course_Card(String courseName, String shortName, String term, String link, int [] rgbColor, TermList termList, ClassList classList) {
        this.courseName = courseName;
        this.shortName = shortName;
        this.term = term;
        String filename = courseName + term + ".json";
        JSONObject[] students = Database.getStudents(filename);
        JSONObject[] assignmentWeights = Database.getAssignmentCat(filename);
        JSONObject[] assignments = Database.getAssignments(filename);
        this.gradebook = new Gradebook(gradedTableData, AssignmentWeightTableData);


        for (int i = 0; i < students.length; i++) {
            org.json.JSONObject currStudent = students[i];
            Student student = new Student(currStudent.getString("studentName").split(" ")[0], currStudent.getString("studentName").split(" ")[1], currStudent.getString("studentNumber"));
            studentList.addStudent(student);
        }
        for (int i = 0; i < assignmentWeights.length; i++) {
            org.json.JSONObject currAssignmentWeights = assignmentWeights[i];
            AssignmentCategory category = new AssignmentCategory(currAssignmentWeights.getString("categoryName"), String.valueOf(currAssignmentWeights.getDouble("categoryWeight")));
            AssignmentWeightTableData.addWeight(category);
        }
        for (int i = 0; i < assignments.length; i++) {
            org.json.JSONObject currAssignment = assignments[i];

            AssignmentCategory cat = AssignmentWeightTableData.getCategory(currAssignment.getString("assignmentCategory"));
            
            Assignment assignment = new Assignment(currAssignment.getString("assignmentName"), cat);
                
            assignmentTableData.addAssignment(assignment);
            
            LinkedList<Student> studentsList = studentList.getList();
            
            for(int j = 0; j < studentsList.size(); j++)
            {
                Student student = studentsList.get(j);

                gradebook.addEntry(student, assignment, currAssignment.getJSONObject("assignmentGrades").getDouble(student.getFullName()));

            }
        }
    	// this.studentList = studentList;
        // this.assignmentTableData = assignments;
        // this.AssignmentWeightTableData = weights;
        // this.gradedTableData = grades;

        
        this.termList = termList;
        this.classList = classList;
        initComponenets(courseName, shortName, term, link, rgbColor);
    }


     /**
      * Create the componenets for the ui
      */
    private void initComponenets(String courseName, String shortName, String term, String link, int [] rgbColor) {
        // Componenet init
        infoPanel = new javax.swing.JPanel();
        colorPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        abbrevLabel = new javax.swing.JLabel();
        termLabel = new javax.swing.JLabel();

        // Window Defaults
        setMaximumSize(new java.awt.Dimension(225, 213));
        setMinimumSize(new java.awt.Dimension(225, 213));
        setBorder(BorderFactory.createLineBorder(java.awt.Color.gray));

        // Panel Setup
        colorPanel.setForeground(new java.awt.Color(rgbColor[0], rgbColor[1], rgbColor[2]));
        colorPanel.setBackground(new java.awt.Color(rgbColor[0], rgbColor[1], rgbColor[2]));


        // Label Setup
        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
        nameLabel.setText(courseName);

        abbrevLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        abbrevLabel.setForeground(new java.awt.Color(51, 102, 255));
        abbrevLabel.setText(shortName);

        termLabel.setText(term);
        abbrevLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abbrevLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abbrevLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abbevLabelMouseExited(evt);
            }
        });


        // Layout Setup
        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(abbrevLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(termLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abbrevLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(termLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        // Arranging main Frame layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setVisible(true);
    }


    // Listener Setup
    private void abbrevLabelMouseClicked(java.awt.event.MouseEvent evt) {                                     
        GUI_compiled mainClass = new GUI_compiled(courseName, shortName, term, studentList, assignmentTableData, AssignmentWeightTableData, gradedTableData , gradebook, termList, classList);
    }                                    

    private void abbrevLabelMouseEntered(java.awt.event.MouseEvent evt) {                                     
        abbrevLabel.setFont(new java.awt.Font("Tahoma", 2, 12));   
        abbrevLabel.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void abbevLabelMouseExited(java.awt.event.MouseEvent evt) {                                    
        abbrevLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        abbrevLabel.setForeground(new java.awt.Color(51, 102, 255));
    } 

    // Initialize UI variables
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel abbrevLabel;
    private javax.swing.JLabel termLabel;
}