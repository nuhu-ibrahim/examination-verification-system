package com.verify;

import com.data_structure.MyTable;
import static com.verify.MainMenu.desktop1;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class ViewExaminationAttendance extends javax.swing.JInternalFrame {

    public ViewExaminationAttendance() {
        DBConnection.connect();
        initComponents();
        Thread runner = new Thread() {

            public void run() {
                try {
                    while(true){
                        String selected = ""+exam.getSelectedItem();
                        int a=1;
                        
                        PreparedStatement st;
                        String sql2= "select exam_id from exam_info";
                        st = DBConnection.con.prepareStatement(sql2);
                        DBConnection.rs = st.executeQuery();
                        
                        while(DBConnection.rs.next()){
                            a=a+1;
                        }
                        String sql1= "select exam_id from exam_info";
                        st = DBConnection.con.prepareStatement(sql1);
                        DBConnection.rs = st.executeQuery();
                        String sch[]= new String[a];

                        while(DBConnection.rs.next()){
                            a--;
                            String school1=DBConnection.rs.getString("exam_id");
                            sch[a]=school1;
                        }
                        sch[0]="Select Examination...";
                        exam.setModel(new javax.swing.DefaultComboBoxModel(sch));
                        exam.setSelectedItem(selected);
                        Thread.sleep(3000);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        runner.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        exam = new javax.swing.JComboBox();
        next1 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        contentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Exam Information");
        setPreferredSize(new java.awt.Dimension(690, 480));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("VIEW EXAMINATION ATTENDANCE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 440, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Examination", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        next.setText("View Attendance");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Examination");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 30, -1, -1));

        exam.setFont(new java.awt.Font("Simplified Arabic", 0, 13)); // NOI18N
        exam.setForeground(java.awt.Color.darkGray);
        exam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Examination..." }));
        jPanel1.add(exam, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 220, 20));

        next1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        next1.setText("Print Attendance Sheet");
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });
        jPanel1.add(next1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 360, 100));

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 100, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 680, 10));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 160, 650, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(exam.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Empty fields!", "Issue!", JOptionPane.OK_OPTION);
        }else{
            try{
                createTable();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Issue");
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_nextActionPerformed

    private void createTable(){
        String sql="select fname, lname, student_info.reg_no, sign_in, sign_out from exam_sign_in, student_info where student_info.reg_no = exam_sign_in.reg_no AND exam_sign_in.exam_id = '"+exam.getSelectedItem()+"' ORDER BY sign_in_time ASC";

        JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;
        String meta[]={"Firstname", "Lastname", "Reg. Number", "Sign In Time", "Sign Out Time"};
        table= MyTable.createTable(sql, meta);
        table.setPreferredScrollableViewportSize(new Dimension(650, 210));
        scrollPane = new JScrollPane(table);
        for (int i = 0; i < 5; i++) {
                column = table.getColumnModel().getColumn(i);
                if (i == 0) //MemberID
                        column.setPreferredWidth(100);
                if (i == 1) //ID
                        column.setPreferredWidth(100);  
                if (i == 2) //MemberID
                        column.setPreferredWidth(100);
                if (i == 3) //ID
                        column.setPreferredWidth(100);  
                if (i == 4) //MemberID
                        column.setPreferredWidth(100);  
        }
        contentPanel.removeAll();
        scrollPane.setViewportView(table);
        contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 210));
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_cancelActionPerformed

    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
        if(exam.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Empty fields!", "Issue!", JOptionPane.OK_OPTION);
        }else{
            try{
                final String DEFAULT_QUERY = "select fname, lname, student_info.reg_no, sign_in, sign_out, dept from exam_sign_in, student_info where student_info.reg_no = exam_sign_in.reg_no AND exam_sign_in.exam_id = '"+exam.getSelectedItem()+"' ORDER BY sign_in_time ASC";
                
                Thread runner = new Thread() {
                    public void run() {
                        try {
                            PrinterJob prnJob = PrinterJob.getPrinterJob();
                            final PrintingAttendanceSheet pt = new PrintingAttendanceSheet(DEFAULT_QUERY, ""+exam.getSelectedItem());
                            
                            Thread runner = new Thread() {

                                public void run() {
                                    desktop1.add(pt);
                                try {
                                    pt.setSelected(true);
                                } catch (java.beans.PropertyVetoException e) {
                                }
                                }
                                    };
                                runner.start();   
                            
                            prnJob.setPrintable(pt);
                            if (!prnJob.printDialog())
                                    return;
                            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                            prnJob.print();
                            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                        }
                        catch (Exception ex) {
                                System.out.println("Printing error: " + ex.toString());
                        }
                    }
                };
                runner.start();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Issue");
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_next1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JComboBox exam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton next;
    private javax.swing.JButton next1;
    // End of variables declaration//GEN-END:variables
}
