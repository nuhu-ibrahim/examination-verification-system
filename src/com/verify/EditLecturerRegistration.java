package com.verify;

import static com.verify.MainMenu.desktop1;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class EditLecturerRegistration extends javax.swing.JInternalFrame {

    public static String matricNumber1;
    public EditLecturerRegistration() {
        DBConnection.connect();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        regNum1 = new javax.swing.JTextField();
        validate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        firstname3 = new javax.swing.JTextField();
        accType2 = new javax.swing.JComboBox();
        insertBtn3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();
        regNum2 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        gender = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Edit Examiner Registration");
        setPreferredSize(new java.awt.Dimension(655, 451));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Staff ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(regNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 120, 20));

        validate.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        validate.setText("Validate");
        validate.setToolTipText("Click to validate Matric. Number");
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        jPanel3.add(validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Staff ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 110));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("EDIT EXAMINER INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Edit Examiner Record", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refresh.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 90, -1));

        regNum2.setEditable(false);
        jPanel1.add(regNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, 20));

        update.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        update.setText("Update the Information");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Staff ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 30, -1, -1));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Firstname");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 50, 70, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Middlename");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 80, -1, 30));
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 20));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Lastname");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 110, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Date of Birth");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 140, -1, 30));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, -1));

        gender.setFont(new java.awt.Font("Simplified Arabic", 0, 13)); // NOI18N
        gender.setForeground(java.awt.Color.darkGray);
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender...", "Male", "Female" }));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 180, 50, -1));

        address.setColumns(20);
        address.setLineWrap(true);
        address.setRows(2);
        jScrollPane2.setViewportView(address);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 240, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("Contact Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 200, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 400, 310));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 640, 10));

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private UploadPassport upload;
    private EditLecturerRegistration editReg;
    public static String me1;
    private EditUploadedPassport editUpload;
    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        if(regNum1.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                String regNum=regNum1.getText().trim();
                PreparedStatement st;
                String sql1= "select * from lecturer_info where staff_id=?";
                st = DBConnection.con.prepareStatement(sql1);
                st.setString(1, regNum);
                DBConnection.rs = st.executeQuery();
                if (DBConnection.rs.next()){
                    regNum2.setText(regNum1.getText());
                    fname.setText(DBConnection.rs.getString("fname"));
                    mname.setText(DBConnection.rs.getString("mname"));
                    lname.setText(DBConnection.rs.getString("lname"));
                    dob.setDate(new java.util.Date(DBConnection.rs.getString("dob").replaceAll("-", "/")));
                    gender.setSelectedItem(DBConnection.rs.getString("gender"));
                    address.setText(DBConnection.rs.getString("address"));  
                }else{
                    JOptionPane.showMessageDialog(this,"Examiner does not exist", "Issue!", JOptionPane.OK_OPTION);
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
    
    public void refresh(){
        this.dispose();
        this.hide();
        
        Thread runner = new Thread() {

        public void run() {
            editReg = new EditLecturerRegistration();
            desktop1.add(editReg);
        try {
            editReg.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
        }
            };
        runner.start();    
    }
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(regNum2.getText().equals("") || fname.getText().equals("") || 
                lname.getText().equals("") || dob.getDate()==null || 
                address.getText().equals("") || gender.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{ 
            try{
                PreparedStatement st;
                String sql = "update lecturer_info set fname =?, mname=?, lname=?, dob=?, gender=?, address=? where staff_id=?";
                st = DBConnection.con.prepareStatement(sql);
                st.setString(1, fname.getText());
                st.setString(2, mname.getText());
                st.setString(3, lname.getText());
                st.setString(4, new SimpleDateFormat("yyyy-MM-dd").format(dob.getDate()));
                st.setString(5, ""+gender.getSelectedItem());
                st.setString(6, address.getText());
                st.setString(7, regNum2.getText());
                
                st.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Examiner information successfully updated", "Information", JOptionPane.INFORMATION_MESSAGE);
                refresh();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox accType2;
    private javax.swing.JTextArea address;
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField firstname3;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton insertBtn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField regNum1;
    public static javax.swing.JTextField regNum2;
    private javax.swing.JButton update;
    private javax.swing.JButton validate;
    // End of variables declaration//GEN-END:variables
}
