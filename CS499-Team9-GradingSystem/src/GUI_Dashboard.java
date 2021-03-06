import java.io.IOException;
import java.util.Random;

/**
 * File: GUI_Login.java
 * Author(s): Jose Garcia Becerra
 */

public class GUI_Dashboard extends javax.swing.JFrame{
    // Initialize variables
    private StudentTable studentList;
    private AssignmentTable assignmentTableData;
    private AssignmentWeightTable AssignmentWeightTableData;
    private GradesTable gradedTableData;
    private Gradebook gradebook;
    private TermList termList = new TermList();
    private ClassList classList = new ClassList();
    private org.json.JSONArray coursesInfoList;

     /**
      * Class constructor
      */
    public GUI_Dashboard(org.json.JSONArray coursesInfo) {
        this.coursesInfoList = coursesInfo;
        for (int i = 0; i < coursesInfo.length(); i++) {
            org.json.JSONObject currCourse = coursesInfoList.getJSONObject(i);

            String cName = currCourse.getString("courseName");
            String cCode = currCourse.getString("courseCode");
            String tName = currCourse.getString("courseTerm");

            Term term = new Term(tName);
            Class newClass = new Class(cName, cCode);
            if (termList.searchTerm(term) == -1) {
                term.addClass(newClass);
                termList.addTerm(term);
                classList.addClass(newClass);
            } else {
                Term exTerm = termList.getTerm(tName);
                exTerm.addClass(newClass);
                classList.addClass(newClass);
            }

          }

        initComponenets();
    }

    // General class functions


     /**
      * Create the componenets for the ui
      */
	private void initComponenets() {
		// Componenet init
        navPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        coursePanel = new javax.swing.JPanel();
        courses = new javax.swing.JPanel();
        dashLabel = new javax.swing.JLabel();
        accountButtton = new javax.swing.JButton();
        dashButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        docButton = new javax.swing.JButton();
        optionsButton = new javax.swing.JButton();


		// Window Defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);


		// Panel Setup
        navPanel.setBackground(new java.awt.Color(131, 98, 158));
        navPanel.setForeground(new java.awt.Color(131, 98, 158));

		headerPanel.setBackground(new java.awt.Color(131, 98, 158));
		headerPanel.setForeground(new java.awt.Color(131, 98, 158));

		coursePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(0));


		// Label setup
		dashLabel.setFont(new java.awt.Font("Tahoma", 0, 28));
		dashLabel.setText("Dashboard");


		// Button Setup
        String currentPath = System.getProperty("user.dir");
        accountButtton.setBorder(null);
        accountButtton.setBackground(new java.awt.Color(131, 98, 158));
        accountButtton.setForeground(new java.awt.Color(131, 98, 158));
        accountButtton.setMaximumSize(new java.awt.Dimension(100, 100));
        accountButtton.setIcon(new javax.swing.ImageIcon(currentPath + "\\src\\Icons\\user.png"));

		dashButton.setBorder(null);
		dashButton.setBackground(new java.awt.Color(131, 98, 158));
		dashButton.setForeground(new java.awt.Color(131, 98, 158));
		dashButton.setMaximumSize(new java.awt.Dimension(100, 100));
		dashButton.setIcon(new javax.swing.ImageIcon(currentPath + "\\src\\Icons\\dashboard.png"));

		docButton.setBorder(null);
		docButton.setBackground(new java.awt.Color(131, 98, 158));
		docButton.setForeground(new java.awt.Color(131, 98, 158));
		docButton.setMaximumSize(new java.awt.Dimension(100, 100));
		docButton.setIcon(new javax.swing.ImageIcon(currentPath + "\\src\\Icons\\question.png"));

		logoutButton.setBorder(null);
		logoutButton.setBackground(new java.awt.Color(131, 98, 158));
		logoutButton.setForeground(new java.awt.Color(131, 98, 158));
		logoutButton.setMaximumSize(new java.awt.Dimension(100, 100));
		logoutButton.setIcon(new javax.swing.ImageIcon(currentPath + "\\src\\Icons\\logout.png"));

		optionsButton.setBorder(null);
		optionsButton.setBackground(new java.awt.Color(131, 98, 158));
		optionsButton.setForeground(new java.awt.Color(131, 98, 158));
		optionsButton.setMaximumSize(new java.awt.Dimension(100, 100));
		optionsButton.setIcon(new javax.swing.ImageIcon(currentPath + "\\src\\Icons\\64x64.png"));
        // Button Action Listeners
		accountButtton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountButtonMouseClicked(evt);
            }
        });
        dashButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashButtonMouseClicked(evt);
            }
        });
		docButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				docButtonMouseClicked(evt);
			}
		});
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lougoutButtonMouseClicked(evt);
            }
        });
		optionsButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				optionsButtonMouseClicked(evt);
			}
		});


		// Arranging Layouts
        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(dashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(docButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addComponent(accountButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        // Array of random colors can add more
        int[][] colors = { {128,0,0}, {255,0,0}, {255,140,0} , {218,165,32}, {255,255,0}, {124,252,0}, {0,128,0}, {144,238,144}, {32,178,170}, {95,158,160}, {230,230,250}};
        java.awt.GridBagLayout experimentLayout = new java.awt.GridBagLayout();
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        courses.setLayout(experimentLayout);
        int gridx = 0;
        int gridy = 0;
        
        for (int i = 0; i < coursesInfoList.length(); i++) {
            org.json.JSONObject currCourse = coursesInfoList.getJSONObject(i);

            String cName = currCourse.getString("courseName");
            String cCode = currCourse.getString("courseCode");
            String tName = currCourse.getString("courseTerm");
            int index = new Random().nextInt(colors.length);

            GUI_Course_Card card = new GUI_Course_Card(cName, cCode, tName, "", colors[index], termList, classList);
            if (gridx == 4){
                gridy++;
                gridx = 0;
            }
            
            c.gridx = gridx;
            c.gridy = gridy;
            courses.add(card, c);
            gridx++;
        }

        // Layout Setup
        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addComponent(courses))

        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursePanelLayout.createSequentialGroup()
                .addComponent(courses))
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 761, Short.MAX_VALUE)
                .addComponent(optionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );


		// Arranging main Frame layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(682, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
		setTitle("Dashboard");
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
	}

    // Listener Setup
	private void accountButtonMouseClicked(java.awt.event.MouseEvent evt) {                                      
        GUI_User_Settings userSettings = new GUI_User_Settings(termList, classList);
    }                                     

    private void dashButtonMouseClicked(java.awt.event.MouseEvent evt) {                                      
        dispose();
    	GUI_Dashboard g = new GUI_Dashboard(Database.getAllCoursesInfo());
    }                                     
    
    private void docButtonMouseClicked(java.awt.event.MouseEvent evt) {                                      
        String currentPath = System.getProperty("user.dir");                                    
        java.io.File htmlFile = new java.io.File(currentPath + "\\src\\index-3.html");
        try {
            java.awt.Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }                                     
    
    private void lougoutButtonMouseClicked(java.awt.event.MouseEvent evt) {                                      
    }                                     
    
    private void optionsButtonMouseClicked(java.awt.event.MouseEvent evt) {                                      
        dispose();
        GUI_Dashboard g = new GUI_Dashboard(Database.getAllCoursesInfo());
    }   

    // Initialize UI variables
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JPanel courses;
    private javax.swing.JLabel dashLabel;
	private javax.swing.JButton accountButtton;
    private javax.swing.JButton dashButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton docButton;
    private javax.swing.JButton optionsButton;
} 