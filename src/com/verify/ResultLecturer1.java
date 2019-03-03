package com.verify;

import static com.verify.MainMenu.desktop1;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ResultLecturer1 extends javax.swing.JInternalFrame {

    LecturerVerificationPage main;
    public ResultLecturer1(LecturerVerificationPage main) {
        this.main = main;
        DBConnection.connect();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Verification Result");
        setPreferredSize(new java.awt.Dimension(406, 312));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update.setText("Ok");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Verification Result Page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/images.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        this.dispose();
        this.hide();
        main.hide();
        main.dispose();
        Thread runner = new Thread() {

            public void run() {
                LecturerVerificationPage regJ = new LecturerVerificationPage();
                desktop1.add(regJ);
                try {
                    regJ.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
                }
        };
        runner.start();
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
