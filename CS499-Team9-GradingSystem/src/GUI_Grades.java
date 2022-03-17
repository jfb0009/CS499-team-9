/**
 * File: GUI_Login.java
 * Author(s): Jose Garcia Becerra
 */
public class GUI_Grades extends javax.swing.JPanel {
    // Initialize variables


     /**
      * Class constructor
      */
    public GUI_Grades() {
        initComponenets();
    }


    // General class functions


     /**
      * Create the componenets for the ui
      */
    private void initComponenets() {
        reportButton = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        studentCombo = new javax.swing.JComboBox<>();
        courseLabel = new javax.swing.JLabel();
        termLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        totalValueLabel = new javax.swing.JLabel();
        sampleLabel1 = new javax.swing.JLabel();
        sampleLabel1Value = new javax.swing.JLabel();
        sampleLabel2 = new javax.swing.JLabel();
        sampleLabel2Value = new javax.swing.JLabel();
        Gradescrollpane = new javax.swing.JScrollPane();


        // Window DefaultsQ
        setPreferredSize(new java.awt.Dimension(1400, 900));

        // Button Setup
        reportButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        reportButton.setText("Idk Print grades or sum");
        jToggleButton1.setText("Enable edit values");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testGradeToggleButtonActionPerformed(evt);
            }
        });


        // Combo Box setup
        studentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        studentCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentComboBoxActionPerformed(evt);
            }
        });


        // Label Setup
        courseLabel.setFont(new java.awt.Font("Tahoma", 0, 15));
        courseLabel.setText("Course");

        termLabel.setFont(new java.awt.Font("Tahoma", 0, 15));
        termLabel.setText("Term");

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        totalLabel.setText("Total: ");

        totalValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        totalValueLabel.setText("100%");

        sampleLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleLabel1.setText("Tests:");

        sampleLabel1Value.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleLabel1Value.setText("100%");

        sampleLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleLabel2.setText("Quizes:");

        sampleLabel2Value.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleLabel2Value.setText("100%");


        // Arranding Layouts
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(termLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(504, 504, 504)
                        .addComponent(reportButton))
                    .addComponent(Gradescrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalValueLabel))
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sampleLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sampleLabel1Value))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sampleLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sampleLabel2Value)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(termLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Gradescrollpane))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sampleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sampleLabel1Value, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sampleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sampleLabel2Value, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(233, 233, 233)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 471, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }


    /**
     * Functions to update from event actions
     */
    private void testGradeToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO Code here for the function of allowing trying sample grades
    }                                              

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Code for pringing report
    }                                        

    private void studentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO Code for selecting student to view grades
    }     
    // Initialize UI variables
    private javax.swing.JButton reportButton;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> studentCombo;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel termLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalValueLabel;
    private javax.swing.JLabel sampleLabel1;
    private javax.swing.JLabel sampleLabel1Value;
    private javax.swing.JLabel sampleLabel2;
    private javax.swing.JLabel sampleLabel2Value;
    private javax.swing.JScrollPane Gradescrollpane;
}