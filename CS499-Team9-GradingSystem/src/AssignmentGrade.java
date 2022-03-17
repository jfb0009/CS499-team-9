/**
 * File: AssignmentGrade.java
 * Author(s): Jose Garcia Becerra
 */
public class AssignmentGrade extends javax.swing.JPanel {
    // Initialize variables


    /**
      * Class constructor
      */
    public AssignmentGrade() {
        initComponents();
    }


    // General class functions
     /** 
      * Create the componenets for the ui
      */
    private void initComponents() {
        nameLabel = new javax.swing.JLabel();
        dueLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        outOfLabel = new javax.swing.JLabel();
        sampleNameLabel = new javax.swing.JLabel();
        sampleDateLabel = new javax.swing.JLabel();
        sampleScoreLabel = new javax.swing.JLabel();
        sampleOutOfLabel = new javax.swing.JLabel();
        scoreDetailsLabel = new javax.swing.JLabel();
        meanLabel = new javax.swing.JLabel();
        meanValueLabel = new javax.swing.JLabel();
        highLabel = new javax.swing.JLabel();
        highValueLabel = new javax.swing.JLabel();
        lowLabel = new javax.swing.JLabel();
        lowValueLabel = new javax.swing.JLabel();
        seperator1 = new javax.swing.JSeparator();
        seperator2 = new javax.swing.JSeparator();


        // Label setup
        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        nameLabel.setText("Name");

        dueLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        dueLabel.setText("Due");

        scoreLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        scoreLabel.setText("Score");

        statusLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        statusLabel.setText("Status");

        outOfLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        outOfLabel.setText("Out of");

        sampleNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleNameLabel.setText("SampleName");

        sampleDateLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleDateLabel.setText("Sample Date");

        sampleScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleScoreLabel.setText("10");

        sampleOutOfLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleOutOfLabel.setText("10");

        scoreDetailsLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        scoreDetailsLabel.setText("Score Details");

        meanLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        meanLabel.setText("Mean:");

        meanValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        meanValueLabel.setText("10");

        highLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        highLabel.setText("High:");

        highValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        highValueLabel.setText("10");

        lowLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        lowLabel.setText("Low:");

        lowValueLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        lowValueLabel.setText("10");


        // Arranging Layouts
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seperator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sampleNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sampleDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(sampleScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(outOfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(sampleOutOfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
            .addComponent(seperator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(meanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meanValueLabel)
                .addGap(160, 160, 160)
                .addComponent(highLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highValueLabel)
                .addGap(160, 160, 160)
                .addComponent(lowLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowValueLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(443, 443, 443))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outOfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sampleNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(sampleDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sampleScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sampleOutOfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(meanValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(highLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(highValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lowLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(lowValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                .addContainerGap())
        );
    }

    /**
     * Functions to update from event actions
     */

    // Initialize UI variables
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel sampleOutOfLabel;
    private javax.swing.JLabel scoreDetailsLabel;
    private javax.swing.JLabel meanLabel;
    private javax.swing.JLabel meanValueLabel;
    private javax.swing.JLabel highLabel;
    private javax.swing.JLabel highValueLabel;
    private javax.swing.JLabel lowLabel;
    private javax.swing.JLabel lowValueLabel;
    private javax.swing.JLabel dueLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel outOfLabel;
    private javax.swing.JLabel sampleNameLabel;
    private javax.swing.JLabel sampleDateLabel;
    private javax.swing.JLabel sampleScoreLabel;
    private javax.swing.JSeparator seperator1;
    private javax.swing.JSeparator seperator2;
}
