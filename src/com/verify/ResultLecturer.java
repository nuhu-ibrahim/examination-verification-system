package com.verify;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static com.verify.MainMenu.desktop1;

public class ResultLecturer extends javax.swing.JInternalFrame {

    LecturerVerificationPage main;
    public ResultLecturer(LecturerVerificationPage main) {
        this.main = main;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        me2 = new javax.swing.JLabel();
        me1 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Verification Result");
        setPreferredSize(new java.awt.Dimension(406, 312));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel6.setMaximumSize(new java.awt.Dimension(150, 150));
        jPanel6.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        me2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cross-5122.jpg"))); // NOI18N
        jPanel6.add(me2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 0, 200, 170));

        me1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                me1PropertyChange(evt);
            }
        });
        jPanel6.add(me1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 320, 170));

        update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update.setText("Ok");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Verification Result Page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void me1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_me1PropertyChange
        
    }//GEN-LAST:event_me1PropertyChange
    
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel me1;
    private javax.swing.JLabel me2;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
