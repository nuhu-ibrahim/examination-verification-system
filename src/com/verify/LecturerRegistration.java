package com.verify;

import static com.verify.MainMenu.desktop1;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class LecturerRegistration extends javax.swing.JInternalFrame {

    public LecturerRegistration() {
        DBConnection.connect();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        next = new javax.swing.JButton();
        regNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        cancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Examiner Registration");
        setPreferredSize(new java.awt.Dimension(476, 451));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("EXAMINER INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Add a new Examiner", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Firstname");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 50, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 180, 50, -1));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, -1));

        gender.setFont(new java.awt.Font("Simplified Arabic", 0, 13)); // NOI18N
        gender.setForeground(java.awt.Color.darkGray);
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender...", "Male", "Female" }));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, 20));

        next.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 90, -1));
        jPanel1.add(regNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Staff ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Middlename");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 80, -1, 30));
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Date of Birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 140, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("Contact Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 200, -1, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Lastname");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 110, -1, 30));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, -1));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, -1));

        address.setColumns(20);
        address.setLineWrap(true);
        address.setRows(2);
        jScrollPane2.setViewportView(address);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 240, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 400, 310));

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 100, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 460, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String getRegNo(){
        return this.regNum.getText();
    }
    
    public void insert() throws Exception{
        String sql = "insert into lecturer_info (staff_id, fname, mname, lname, dob, gender, address) values (?,?,?,?,?,?,?)";
        PreparedStatement st;
        st = DBConnection.con.prepareStatement(sql);

        st.setString(1, regNum.getText());
        st.setString(2, fname.getText());
        st.setString(3, mname.getText());
        st.setString(4, lname.getText());
        st.setString(5, ""+new SimpleDateFormat("yyyy-MM-dd").format(dob.getDate()));
        st.setString(6, ""+gender.getSelectedItem());
        st.setString(7, address.getText());

        st.executeUpdate();
        
        sql = "insert into user (surname, Firstname, Username, Password, Usertype) values (?,?,?,?,?)";
            
        st = DBConnection.con.prepareStatement(sql);

        st.setString(1,  fname.getText());
        st.setString(2,  lname.getText());
        st.setString(3,  regNum.getText());
        st.setString(4,  fname.getText());
        st.setString(5,  "EXAMINER");

        st.executeUpdate();
    }
    
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(regNum.getText().equals("") || fname.getText().equals("") ||
            gender.getSelectedIndex()==0 || lname.getText().equals("")||
            dob.getDate() == null || address.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                String regNum=this.regNum.getText().trim();
                
                String sql1= "select * from lecturer_info where staff_id='"+regNum+"'";
                DBConnection.rs= DBConnection.st.executeQuery(sql1);
                if (DBConnection.rs.next()){
                    JOptionPane.showMessageDialog(this, "Examiner already exist",
                        "Examiner Exists", JOptionPane.OK_OPTION);
                }else{
                    this.dispose();
                    this.hide();
                    Thread runner;
                    runner = new Thread() {
                        public void run() {
                            UploadLecturerBio upload = new UploadLecturerBio(LecturerRegistration.this);
                            desktop1.add(upload);
                            try {
                                upload.setSelected(true);
                            } catch (java.beans.PropertyVetoException e) {
                                
                            }
                        }
                    };
                    runner.start();    
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_nextActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JButton next;
    private javax.swing.JTextField regNum;
    // End of variables declaration//GEN-END:variables
}
