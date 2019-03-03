
package com.verify;

import static com.verify.MainMenu.desktop1;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class UploadPassport extends javax.swing.JInternalFrame {

    private UploadBio main;
    public UploadPassport(UploadBio main) {
        this.main = main;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        insertBtn = new javax.swing.JButton();
        us = new javax.swing.JPanel();
        me = new javax.swing.JLabel();
        me1 = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        we2 = new javax.swing.JLabel();
        we3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        exitBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Passport Upload");
        setPreferredSize(new java.awt.Dimension(410, 436));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText(" UPLOAD PASSPORT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 10, 240, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Upload Passport", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertBtn.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        insertBtn.setText("Insert Student Information");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        jPanel1.add(insertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 252, 210, 30));

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

        we2.setText("* Image must be .jpg");
        jPanel1.add(we2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 20));

        we3.setText("* Image must not be larger than 150px X 150px");
        jPanel1.add(we3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 240, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 310, 290));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 390, 10));

        exitBtn.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        exitBtn.setText("Cancel");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void upload(){
        try{
            DBConnection.con.setAutoCommit(false);
            
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
            
            String imageName=main.main.getRegNo().replaceAll("/", "");
            File out=new File(address+imageName);
            ImageIO.write(buffer, "png", out);
            
            String sql = "insert into student_pass (reg_no, passport) values (?,?)";
            PreparedStatement st;
            st = DBConnection.con.prepareStatement(sql);
            
            st.setString(1,  main.main.getRegNo());
            st.setString(2,  ""+me1.getIcon());
            
            st.executeUpdate();
            
            main.insert();
            JOptionPane.showMessageDialog(this, "Student successfully registered", "Student Registered", JOptionPane.INFORMATION_MESSAGE);
            DBConnection.con.commit();
            refresh();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Trouble executing query", "Issue!", JOptionPane.OK_OPTION);
        } 
        
    }
    
    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        if(me1.getIcon()==null){
            JOptionPane.showMessageDialog(this,"Blank Passport", "Blank Passport", JOptionPane.OK_OPTION);
        }else{
            try{
                upload();   
            }catch(Exception ex){
                try{
                    DBConnection.con.rollback();
                }catch(Exception ex2){
                    System.out.println(ex2.getMessage());
                }
                System.out.println(ex.getMessage());
            }finally{
                try{
                    DBConnection.con.setAutoCommit(true);
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_insertBtnActionPerformed
    public void refresh(){
        
        this.hide();
        this.dispose();
        Thread runner = new Thread() {

            public void run() {
                StudentRegistration courseReg = new StudentRegistration();
                desktop1.add(courseReg);
                try {
                    courseReg.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start(); 
    }
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
        this.hide();   
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel me;
    private javax.swing.JLabel me1;
    private javax.swing.JButton select;
    private javax.swing.JPanel us;
    private javax.swing.JLabel we2;
    private javax.swing.JLabel we3;
    // End of variables declaration//GEN-END:variables
}
