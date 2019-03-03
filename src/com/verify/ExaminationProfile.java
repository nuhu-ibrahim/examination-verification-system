package com.verify;

import static com.verify.MainMenu.desktop1;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExaminationProfile extends javax.swing.JInternalFrame {

    public ExaminationProfile() {      
        initComponents();
    }
    
    public ExaminationProfile(String examNo) {  
        this.examId.setText(examNo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        examId = new javax.swing.JTextField();
        validate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        firstname3 = new javax.swing.JTextField();
        accType2 = new javax.swing.JComboBox();
        insertBtn3 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        courseCode = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        courseTile = new javax.swing.JLabel();
        examDate = new javax.swing.JLabel();
        startTime = new javax.swing.JLabel();
        endTime = new javax.swing.JLabel();
        totalSignIn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Examination Profile");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(465, 445));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Verify Examination", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Examination ID");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 27, -1, 30));
        jPanel3.add(examId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 210, 30));

        validate.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        validate.setText("Validate");
        validate.setToolTipText("Click to validate Matric. Number");
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        jPanel3.add(validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Course Registration", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Firstname");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("User Accout-type");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel4.add(firstname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 30));

        accType2.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        accType2.setForeground(java.awt.Color.darkGray);
        accType2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select...", "ADMIN", "TECH USER" }));
        accType2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accType2ActionPerformed(evt);
            }
        });
        jPanel4.add(accType2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, 30));

        insertBtn3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        insertBtn3.setText("Insert the Information");
        insertBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtn3ActionPerformed(evt);
            }
        });
        jPanel4.add(insertBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 180, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 290, 270));

        refresh.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.setToolTipText("Click to validate Matric. Number");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel3.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 340, 110));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("EXAMINATION REPORT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 120, 30));

        courseCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseCode.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(courseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 230, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Course Code");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 0));
        jLabel16.setText("Examination Date");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 0));
        jLabel17.setText("Start Time");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Total Sign-In");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 0));
        jLabel18.setText("End Time");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Course Title");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 30));

        courseTile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseTile.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(courseTile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 230, 30));

        examDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examDate.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(examDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 230, 30));

        startTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startTime.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(startTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 230, 30));

        endTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        endTime.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(endTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 230, 30));

        totalSignIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalSignIn.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(totalSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        if(examId.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;
                String sql1= "select * from exam_info where exam_id = ?";
                st = DBConnection.con.prepareStatement(sql1);
                
                st.setString(1, examId.getText());
                DBConnection.rs = st.executeQuery();
                
                if (DBConnection.rs.next()){
                    courseTile.setText(DBConnection.rs.getString("course_title"));
                    courseCode.setText(DBConnection.rs.getString("course_code"));
                    examDate.setText(DBConnection.rs.getString("exam_date"));
                    startTime.setText(DBConnection.rs.getString("start_time"));
                    endTime.setText(DBConnection.rs.getString("end_time"));
                    
                    sql1= "select COUNT(*) from exam_sign_in where exam_id = ?";
                    st = DBConnection.con.prepareStatement(sql1);

                    st.setString(1, examId.getText());
                    DBConnection.rs = st.executeQuery();
                    DBConnection.rs.next();
                    
                    totalSignIn.setText(""+DBConnection.rs.getInt(1));
                }else{
                    JOptionPane.showMessageDialog(this, "Examination does not exist", "Issue!", JOptionPane.OK_OPTION);
                    refresh();
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_validateActionPerformed

    private void accType2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accType2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accType2ActionPerformed

    private void insertBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertBtn3ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        refresh();
    }//GEN-LAST:event_refreshActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_cancelActionPerformed

    public void refresh(){
        Thread runner = new Thread() {

            public void run() {
                ExaminationProfile addUsers= new ExaminationProfile(examId.getText());
                
                desktop1.add(addUsers);
                try {
                    addUsers.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        
        runner.start();
        this.hide();
        this.dispose();
    }    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox accType2;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel courseCode;
    private javax.swing.JLabel courseTile;
    private javax.swing.JLabel endTime;
    private javax.swing.JLabel examDate;
    private javax.swing.JTextField examId;
    private javax.swing.JTextField firstname3;
    private javax.swing.JButton insertBtn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel startTime;
    private javax.swing.JLabel totalSignIn;
    private javax.swing.JButton validate;
    // End of variables declaration//GEN-END:variables
}
