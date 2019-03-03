package com.verify;

import com.data_structure.MyTable;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class AllStudent extends javax.swing.JInternalFrame {

    public AllStudent() {
        initComponents();
        createTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("View all Student Information");
        setPreferredSize(new java.awt.Dimension(526, 337));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("View all Students");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        Close.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Close.setText("Close");
        Close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 120, 30));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createTable(){
        String sql="select reg_no, fname, mname, lname, dob, dept from student_info";

        JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;
        String meta[]={"Registration Number", "Firstname", "Middlename", "Lastname", "Date of Birth", "Course of Study"};
        table= MyTable.createTable(sql, meta);
        table.setPreferredScrollableViewportSize(new Dimension(490, 190));
        scrollPane = new JScrollPane(table);
        for (int i = 0; i < 6; i++) {
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
                if (i == 5) //ID
                        column.setPreferredWidth(100);  
        }
        contentPanel.removeAll();
        scrollPane.setViewportView(table);
        contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 190));
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }
    
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_CloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
