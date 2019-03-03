package com.verify;

import static com.verify.MainMenu.desktop1;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EditUploadedPassport extends javax.swing.JInternalFrame {

    public EditUploadedPassport() {
        DBConnection.connect();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        we2 = new javax.swing.JLabel();
        we3 = new javax.swing.JLabel();
        us = new javax.swing.JPanel();
        me = new javax.swing.JLabel();
        me1 = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        validate1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        exitBtn = new javax.swing.JButton();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Edit Uploaded Passport");
        setPreferredSize(new java.awt.Dimension(564, 434));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("UPDATE PASSPORT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Upload Passport", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        update.setText("Update Student Information");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 258, 200, 30));
        update.getAccessibleContext().setAccessibleDescription("");

        we2.setText("* Image must be .jpg");
        jPanel1.add(we2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 20));

        we3.setText("* Image must not be larger than 150px X 150px");
        jPanel1.add(we3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 20));

        us.setBackground(new java.awt.Color(255, 255, 255));
        us.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
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

        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 160, -1));

        select.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        select.setText("Browse");
        select.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 160, 30));

        validate1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        validate1.setText("Refresh");
        validate1.setToolTipText("Click to validate Matric. Number");
        validate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validate1ActionPerformed(evt);
            }
        });
        jPanel1.add(validate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 310, 300));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 550, 10));

        exitBtn.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        exitBtn.setText("Cancel");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 100, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Reg. Number", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(regNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 100, 20));

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
        jLabel6.setText("Reg. Num.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(me1.getIcon()==null){
            JOptionPane.showMessageDialog(this,"Blank Passport", "Blank Passport", JOptionPane.OK_OPTION);
        }else{
            try{
                String address = "C:\\Users\\M Shuwa\\Desktop\\Examination Screening System\\src\\com\\passport\\";
                String passport=""+me1.getIcon();

                ImageIcon icon=new ImageIcon(passport);     
                Image image =icon.getImage();
                BufferedImage buffer=new BufferedImage(image.getWidth(null),image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                Graphics2D bGr=buffer.createGraphics();
                bGr.drawImage(image, 0, 0,null);
                bGr.dispose();
            
                //int index=passport.lastIndexOf('\\');
                //String imageName=passport.substring(index+1);

                String imageName = rn.replaceAll("/", "");
                File out=new File(address+imageName);
                ImageIO.write(buffer, "png", out);
                
                PreparedStatement st;
                String sql = "update student_pass set passport = ? where reg_no = ?";
                st = DBConnection.con.prepareStatement(sql);
                st.setString(1, ""+me1.getIcon());
                st.setString(2, regNum1.getText());
                st.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Student Passport Information Updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
                refresh();
                
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    public void refresh(){
        this.hide();
                this.dispose();
                Thread runner = new Thread() {

        public void run() {
            EditUploadedPassport editReg = new EditUploadedPassport();
            desktop1.add(editReg);
        try {
            editReg.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
        }
            };
        runner.start();    
    }
    
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.hide();
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void me1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_me1PropertyChange

    }//GEN-LAST:event_me1PropertyChange

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue;
        returnValue = fileChooser.showOpenDialog(this);
        if(returnValue== JFileChooser.APPROVE_OPTION){
            try{
                File file;
                file= fileChooser.getSelectedFile();
                String st= file.toString();
                int index=st.lastIndexOf('.');
                String test=st.substring(index+1);
                if(test.equals("jpg")){
                    Icon iicon= new ImageIcon(file.getPath());
                    int a= iicon.getIconHeight();
                    int b= iicon.getIconWidth();
                    if(a<=150 && b<=150){
                        me1.setIcon(iicon);
                    }else{
                        me1.setIcon(null);
                        JOptionPane.showMessageDialog(null, "Image must not be larger than 150px X 150px","Issue!", JOptionPane.OK_OPTION);
                    }
                }else{
                    me1.setIcon(null);
                    JOptionPane.showMessageDialog(null, "File is not .jpg format","Issue!", JOptionPane.OK_OPTION);
                }

            }catch(Exception ex){
                me1.setIcon(null);
            }

        }
    }//GEN-LAST:event_selectActionPerformed
    String rn = "";

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        if(regNum1.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Empty fields", "Empty fields", JOptionPane.OK_OPTION);
        }else{
            try{
                String regNum=regNum1.getText().trim();
                PreparedStatement st;
                String sql1= "select * from student_pass where reg_no=?";
                st = DBConnection.con.prepareStatement(sql1);
                st.setString(1, regNum);
                DBConnection.rs = st.executeQuery();
                
                rn = regNum;
                
                if (DBConnection.rs.next()){
                    regNum1.setEnabled(false);
                    Icon iicon= new ImageIcon(DBConnection.rs.getString("passport"));
                    me1.setIcon(iicon);
                }else{
                    JOptionPane.showMessageDialog(this,"Student does not exist", "Issue!", JOptionPane.OK_OPTION);
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
    }//GEN-LAST:event_validate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox accType2;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField firstname3;
    private javax.swing.JButton insertBtn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel me;
    private javax.swing.JLabel me1;
    private javax.swing.JTextField regNum1;
    private javax.swing.JButton select;
    private javax.swing.JButton update;
    private javax.swing.JPanel us;
    private javax.swing.JButton validate;
    private javax.swing.JButton validate1;
    private javax.swing.JLabel we2;
    private javax.swing.JLabel we3;
    // End of variables declaration//GEN-END:variables
}
