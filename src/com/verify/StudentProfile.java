package com.verify;

import static com.verify.MainMenu.desktop1;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class StudentProfile extends javax.swing.JInternalFrame {

    public StudentProfile() {
        initComponents();
    }
    
    public StudentProfile(String regNum) {
        initComponents();
        this.regNum.setText(regNum);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        regNum = new javax.swing.JTextField();
        validate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        firstname3 = new javax.swing.JTextField();
        accType2 = new javax.swing.JComboBox();
        insertBtn3 = new javax.swing.JButton();
        validate1 = new javax.swing.JButton();
        us = new javax.swing.JPanel();
        me = new javax.swing.JLabel();
        me1 = new javax.swing.JLabel();
        regNum1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        othername = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        mStatus = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        program = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        mstatus = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Student Profile");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(465, 445));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Reg. No", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Reg. No");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));
        jPanel3.add(regNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 140, 30));

        validate.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        validate.setText("Validate");
        validate.setToolTipText("Click to validate Matric. Number");
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        jPanel3.add(validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

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

        validate1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        validate1.setText("Refresh");
        validate1.setToolTipText("Click to validate Matric. Number");
        validate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validate1ActionPerformed(evt);
            }
        });
        jPanel3.add(validate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, 110));

        us.setBackground(new java.awt.Color(255, 255, 255));
        us.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        us.setMaximumSize(new java.awt.Dimension(150, 150));
        us.setMinimumSize(new java.awt.Dimension(150, 150));
        us.setPreferredSize(new java.awt.Dimension(150, 150));
        us.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        us.add(me, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        me1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                me1PropertyChange(evt);
            }
        });
        us.add(me1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        regNum1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        regNum1.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(regNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 310, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Firstname");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 250, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Middlename");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 280, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Lastname");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 310, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 340, 50, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Marital Status");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Date of birth");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Course of Study");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Registration Number");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 220, -1, 30));

        fname.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 310, 30));

        othername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        othername.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.add(othername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 290, 30));

        mname.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        mname.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 310, 30));

        lname.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 310, 30));

        mStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mStatus.setForeground(new java.awt.Color(255, 102, 0));
        jPanel1.add(mStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 160, 20));

        gender.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 310, 30));

        program.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        program.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(program, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 310, 30));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("STUDENT PROFILE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 360, -1));

        mstatus.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        mstatus.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(mstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 310, 30));

        dob.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 310, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        if(regNum.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;
                String sql1= "select * from student_info, student_pass where student_info.reg_no=? AND student_info.reg_no = student_pass.reg_no";
                st = DBConnection.con.prepareStatement(sql1);
                
                st.setString(1, regNum.getText());
                DBConnection.rs = st.executeQuery();
                
                if (DBConnection.rs.next()){
                    regNum1.setText(DBConnection.rs.getString("reg_no"));
                    fname.setText(DBConnection.rs.getString("fname"));
                    mname.setText(DBConnection.rs.getString("mname"));
                    lname.setText(DBConnection.rs.getString("lname"));
                    gender.setText(DBConnection.rs.getString("gender"));
                    mstatus.setText(DBConnection.rs.getString("mstatus"));
                    dob.setText(DBConnection.rs.getString("dob"));
                    program.setText(DBConnection.rs.getString("dept"));
                    me1.setIcon(new ImageIcon(DBConnection.rs.getString("passport")));
                }else{
                    JOptionPane.showMessageDialog(this,"Student does not exist", "Error", JOptionPane.OK_OPTION);
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

    private void validate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validate1ActionPerformed
        refresh();
        regNum.setText("");
    }//GEN-LAST:event_validate1ActionPerformed

    public void refresh(){
      
        Thread runner = new Thread() {

            public void run() {
            StudentProfile addUsers= new StudentProfile(regNum.getText());
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
    
    private void me1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_me1PropertyChange

    }//GEN-LAST:event_me1PropertyChange

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox accType2;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField firstname3;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel gender;
    private javax.swing.JButton insertBtn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel mStatus;
    private javax.swing.JLabel me;
    private javax.swing.JLabel me1;
    private javax.swing.JLabel mname;
    private javax.swing.JLabel mstatus;
    private javax.swing.JLabel othername;
    private javax.swing.JLabel program;
    private javax.swing.JTextField regNum;
    private javax.swing.JLabel regNum1;
    private javax.swing.JPanel us;
    private javax.swing.JButton validate;
    private javax.swing.JButton validate1;
    // End of variables declaration//GEN-END:variables
}
