package com.verify;

import static com.verify.MainMenu.desktop1;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class ExamRegistration extends javax.swing.JInternalFrame {

    public ExamRegistration() {
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
        courseTitle = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        examId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        courseCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        examDate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        shh = new javax.swing.JComboBox<>();
        smm = new javax.swing.JComboBox<>();
        emm = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ehh = new javax.swing.JComboBox<>();
        sss = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ess = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Examination Registration");
        setPreferredSize(new java.awt.Dimension(476, 386));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText(" EXAMINATION INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Add a new Examination", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("eg hh:mm:ss");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 90, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("End Time");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 170, 80, 30));
        jPanel1.add(courseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 220, 20));

        insert.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        insert.setText("Insert the Information");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 180, -1));
        jPanel1.add(examId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 220, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Course Code");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 80, -1, 30));
        jPanel1.add(courseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 220, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Start Time");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 140, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Examination Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 110, -1, 30));
        jPanel1.add(examDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Examination ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 30, -1, -1));

        shh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel1.add(shh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 40, -1));

        smm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel1.add(smm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 40, -1));

        emm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel1.add(emm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 40, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("  :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 30, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Course Title");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 50, 90, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("  :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 30, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("eg hh:mm:ss");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, 30));

        ehh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel1.add(ehh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 40, -1));

        sss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel1.add(sss, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 40, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("  :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 30, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("  :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 30, 40));

        ess.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel1.add(ess, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 400, 250));

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 100, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 460, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        if(examId.getText().equals("") || courseTitle.getText().equals("") ||
                courseCode.getText().equals("") || examDate.getDate() == null){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                String examNum=this.examId.getText().trim();
                PreparedStatement st;
                String sql1= "select * from exam_info where exam_id=?";
                st = DBConnection.con.prepareStatement(sql1);
                st.setString(1, examNum);
                DBConnection.rs = st.executeQuery();
                if (DBConnection.rs.next()){
                    JOptionPane.showMessageDialog(this, "Examination ID already exist",
                        "Issue!", JOptionPane.OK_OPTION);
                }else{
                    java.util.Date t0 = new java.util.Date();
                    String d1 = new SimpleDateFormat("yyyy/MM/dd").format(t0);
                    String startTime = shh.getSelectedItem()+":"+smm.getSelectedItem()+":"+sss.getSelectedItem();
                    String endTime = ehh.getSelectedItem()+":"+emm.getSelectedItem()+":"+ess.getSelectedItem();
                    java.util.Date t1 = new java.util.Date(d1+" "+startTime);
                    java.util.Date t2 = new java.util.Date(d1+" "+endTime);
                    if(t1.after(t2)){
                        JOptionPane.showMessageDialog(this, "Start time can not be later of end time",
                        "Issue!", JOptionPane.OK_OPTION);
                    }else{
                        t1.setTime(t1.getTime() + 3600000); 
                        if(t1.before(t2)){
                            String sql2 = "insert into exam_info (exam_id, course_title, course_code, exam_date, start_time, end_time) values (?,?,?,?,?,?)";
                            st = DBConnection.con.prepareStatement(sql2);
                            st.setString(1, examId.getText());
                            st.setString(2, courseTitle.getText());
                            st.setString(3, courseCode.getText());
                            st.setString(4, "" + new SimpleDateFormat("yyyy-MM-dd").format(examDate.getDate()));
                            st.setString(5, startTime);
                            st.setString(6, endTime);

                            st.executeUpdate();

                            JOptionPane.showMessageDialog(this, "Examination succesfully registered",
                                "Information", JOptionPane.INFORMATION_MESSAGE);
                            refresh();
                        }else{
                            JOptionPane.showMessageDialog(this, "Examination time can not be less than an hour",
                                "Issue!", JOptionPane.OK_OPTION);
                        }
                        
                    }
                    
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_insertActionPerformed

    public void refresh(){
        this.dispose();
        this.hide();
        
        Thread runner = new Thread() {

            public void run() {
                ExamRegistration regJ = new ExamRegistration();
                desktop1.add(regJ);
                try {
                    regJ.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    
                }
            }
        };
        runner.start(); 
    }
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField courseCode;
    private javax.swing.JTextField courseTitle;
    private javax.swing.JComboBox<String> ehh;
    private javax.swing.JComboBox<String> emm;
    private javax.swing.JComboBox<String> ess;
    private com.toedter.calendar.JDateChooser examDate;
    private javax.swing.JTextField examId;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> shh;
    private javax.swing.JComboBox<String> smm;
    private javax.swing.JComboBox<String> sss;
    // End of variables declaration//GEN-END:variables
}
