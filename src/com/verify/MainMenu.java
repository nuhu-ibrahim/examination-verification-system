package com.verify;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class MainMenu extends javax.swing.JFrame {

    public String getStaffId(){
        return this.username.getText();
    }
    
    public MainMenu() {
        DBConnection.connect();
        initComponents();
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        //setSize(screenSize.width, screenSize.height - 30);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        iconm.setVisible(false);
        message.setVisible(false);
        register.setVisible(false);
        edit.setVisible(false);
        manage.setVisible(false);
        registerJMenu1.setVisible(false);
        verify.setVisible(false);
        jMenu4.setVisible(false);
    }
    public void techUserControls(){
        registerJMenu1.setVisible(true);
        register.setVisible(true);
        //manage.setVisible(true);
        jMenu4.setVisible(true);
        edit.setVisible(true);
        verify.setVisible(true);
        attendance.setVisible(false);
    }
    
    public void examinerUserControls(){
        registerJMenu1.setVisible(true);
        //register.setVisible(true);
        manage.setVisible(true);
        jMenu4.setVisible(true);
        //edit.setVisible(true);
        //verify.setVisible(true);
        allStudent.setVisible(false);
        allExams.setVisible(false);
        allLecturers.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        iconm = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registerJMenu1 = new javax.swing.JMenuItem();
        exitJMenu1 = new javax.swing.JMenuItem();
        register = new javax.swing.JMenu();
        addStudent = new javax.swing.JMenuItem();
        addExamination = new javax.swing.JMenuItem();
        addStudent1 = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        editReg = new javax.swing.JMenuItem();
        editPassport = new javax.swing.JMenuItem();
        addStudent2 = new javax.swing.JMenuItem();
        verify = new javax.swing.JMenu();
        verifyStudent = new javax.swing.JMenuItem();
        verifyStudent1 = new javax.swing.JMenuItem();
        manage = new javax.swing.JMenu();
        signIn = new javax.swing.JMenuItem();
        signOut = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        allStudent = new javax.swing.JMenuItem();
        allExams = new javax.swing.JMenuItem();
        allLecturers = new javax.swing.JMenuItem();
        studentProfile = new javax.swing.JMenuItem();
        examProfile = new javax.swing.JMenuItem();
        attendance = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Main Menu");

        desktop1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("USER LOGIN PAGE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        username.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 212, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        password.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 140, 30));

        iconm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ajax-loader2.gif"))); // NOI18N
        jPanel1.add(iconm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        message.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        message.setForeground(new java.awt.Color(0, 102, 0));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message.setText("Validating User...");
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 190, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/AdminLTELogo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        desktop1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktop1Layout = new javax.swing.GroupLayout(desktop1);
        desktop1.setLayout(desktop1Layout);
        desktop1Layout.setHorizontalGroup(
            desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktop1Layout.createSequentialGroup()
                .addContainerGap(511, Short.MAX_VALUE)
                .addGroup(desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktop1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(452, 452, 452))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktop1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(469, 469, 469))))
        );
        desktop1Layout.setVerticalGroup(
            desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktop1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jMenu1.setForeground(new java.awt.Color(0, 102, 0));
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        registerJMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerJMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/article32.jpg"))); // NOI18N
        registerJMenu1.setText("Logout");
        registerJMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJMenu1ActionPerformed(evt);
            }
        });
        jMenu1.add(registerJMenu1);

        exitJMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitJMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Exit16.gif"))); // NOI18N
        exitJMenu1.setText(" Exit");
        exitJMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenu1ActionPerformed(evt);
            }
        });
        jMenu1.add(exitJMenu1);

        jMenuBar1.add(jMenu1);

        register.setForeground(new java.awt.Color(0, 102, 0));
        register.setText("Register");
        register.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        addStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/article32.jpg"))); // NOI18N
        addStudent.setText("Add Student");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });
        register.add(addStudent);

        addExamination.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addExamination.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/article32.jpg"))); // NOI18N
        addExamination.setText("Add Examination");
        addExamination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExaminationActionPerformed(evt);
            }
        });
        register.add(addExamination);

        addStudent1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addStudent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/article32.jpg"))); // NOI18N
        addStudent1.setText("Add Lecturer/Examiner");
        addStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudent1ActionPerformed(evt);
            }
        });
        register.add(addStudent1);

        jMenuBar1.add(register);

        edit.setForeground(new java.awt.Color(0, 102, 0));
        edit.setText("Edit");
        edit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        editReg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/List16.gif"))); // NOI18N
        editReg.setText("Edit Student Record");
        editReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRegActionPerformed(evt);
            }
        });
        edit.add(editReg);

        editPassport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editPassport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/List16.gif"))); // NOI18N
        editPassport.setText("Edit Student Passport");
        editPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPassportActionPerformed(evt);
            }
        });
        edit.add(editPassport);

        addStudent2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addStudent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/article32.jpg"))); // NOI18N
        addStudent2.setText("Edit Lecturer/Examiner");
        addStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudent2ActionPerformed(evt);
            }
        });
        edit.add(addStudent2);

        jMenuBar1.add(edit);

        verify.setForeground(new java.awt.Color(0, 102, 0));
        verify.setText("Verification");
        verify.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        verifyStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verifyStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Find16.gif"))); // NOI18N
        verifyStudent.setText("Verify Student");
        verifyStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyStudentActionPerformed(evt);
            }
        });
        verify.add(verifyStudent);

        verifyStudent1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verifyStudent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Find16.gif"))); // NOI18N
        verifyStudent1.setText("Verify Examiner");
        verifyStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyStudent1ActionPerformed(evt);
            }
        });
        verify.add(verifyStudent1);

        jMenuBar1.add(verify);

        manage.setForeground(new java.awt.Color(0, 102, 0));
        manage.setText(" Manage-Exams");
        manage.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        signIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/article32.jpg"))); // NOI18N
        signIn.setText("Student Sign In");
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        manage.add(signIn);

        signOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/article32.jpg"))); // NOI18N
        signOut.setText("Student Sign Out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        manage.add(signOut);

        jMenuBar1.add(manage);

        jMenu4.setForeground(new java.awt.Color(0, 102, 0));
        jMenu4.setText(" Report");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        allStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        allStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Find16.gif"))); // NOI18N
        allStudent.setText("All Students");
        allStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentActionPerformed(evt);
            }
        });
        jMenu4.add(allStudent);

        allExams.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        allExams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Find16.gif"))); // NOI18N
        allExams.setText("All Examinations");
        allExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allExamsActionPerformed(evt);
            }
        });
        jMenu4.add(allExams);

        allLecturers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        allLecturers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Find16.gif"))); // NOI18N
        allLecturers.setText("All Lecturers");
        allLecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allLecturersActionPerformed(evt);
            }
        });
        jMenu4.add(allLecturers);

        studentProfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Find16.gif"))); // NOI18N
        studentProfile.setText("Student Profile");
        studentProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentProfileActionPerformed(evt);
            }
        });
        jMenu4.add(studentProfile);

        examProfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Find16.gif"))); // NOI18N
        examProfile.setText("Examination Profile");
        examProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examProfileActionPerformed(evt);
            }
        });
        jMenu4.add(examProfile);

        attendance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Find16.gif"))); // NOI18N
        attendance.setText("View Exam Attendance");
        attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceActionPerformed(evt);
            }
        });
        jMenu4.add(attendance);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1)
        );

        setSize(new java.awt.Dimension(1349, 758));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private StudentRegistration regJ;
private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
    Thread runner = new Thread() {

        public void run() {
            regJ = new StudentRegistration();
            desktop1.add(regJ);
            try {
                regJ.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
            }
    };
    runner.start();    
}//GEN-LAST:event_addStudentActionPerformed
private EditStudentRegistration editreg;
private void editRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRegActionPerformed
    Thread runner = new Thread() {

        public void run() {
            editreg = new EditStudentRegistration();
            desktop1.add(editreg);
        try {
            editreg.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
        }
            };
        runner.start();    
}//GEN-LAST:event_editRegActionPerformed
private void allStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentActionPerformed
    Thread runner = new Thread() {

        public void run() {
            AllStudent viewSt = new AllStudent();
            desktop1.add(viewSt);
        try {
            viewSt.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
        }
            };
        runner.start();  
}//GEN-LAST:event_allStudentActionPerformed

    private void exitJMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenu1ActionPerformed
        this.setCursor(Cursor.WAIT_CURSOR);
        int option=JOptionPane.showConfirmDialog(this,"Are You sure You want to "
                + "Exit", "Exit", JOptionPane.YES_NO_OPTION);
        if (option ==0){
            System.exit(0);
        }
        else{

        }
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_exitJMenu1ActionPerformed
    private String usertype;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if("".equals(username.getText()) || "".equals(password.getText())){
            JOptionPane.showMessageDialog(this,"Empty fields, try again","Empty Field", JOptionPane.OK_OPTION);
        }else{
            Thread runner = new Thread() {
                public void run() {
                    message.setForeground(Color.GREEN);
                    message.setText("Validating User...");
                    try {
                        message.setVisible(true);
                        iconm.setVisible(true);
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    String pass="";
                    String user="";
                    try{
                        String sql1= "select * from User where Username='"+username.getText()+"'";
                        DBConnection.rs= DBConnection.st.executeQuery(sql1);
                        if(DBConnection.rs.next()){
                            pass=DBConnection.rs.getString("Password");
                            user=DBConnection.rs.getString("Username");
                            usertype=DBConnection.rs.getString("Usertype");
                        }
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,ex.getMessage());
                    }
                    if (pass.equals(password.getText()) && user.equalsIgnoreCase(username.getText()) ){
                        Thread runner2 = new Thread() {
                            public void run() {
                                message.setForeground(new java.awt.Color(0, 102, 0));
                                message.setText("Login Successful, Opening...");
                                try {
                                    if(usertype.equals("TECH USER")){
                                        //Check if he is a lecturer and validate
                                        message.setVisible(true);
                                        iconm.setVisible(true);
                                        Thread.sleep(2000);
                                        jPanel1.setVisible(false);
                                        jLabel1.setVisible(false);
                                        techUserControls();
                                    }else{
                                        message.setVisible(true);
                                        iconm.setVisible(true);
                                        Thread.sleep(2000);
                                        jPanel1.setVisible(false);
                                        jLabel1.setVisible(false);
                                        
                                        VerifyLogin c= new VerifyLogin(MainMenu.this, true, MainMenu.this);
                                        c.setLocationRelativeTo(null);
                                        c.setVisible(true);   
                                    } 
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                        };
                        runner2.start();
                    }
                    else{
                        iconm.setVisible(false);
                        message.setForeground(Color.red);
                        message.setText("Invalid Login Details, try again.");
                    }
                }
            };
            runner.start();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registerJMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJMenu1ActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Continue Logout?","Confirm logout",JOptionPane.YES_NO_OPTION);
        if (a==0){
            new MainMenu().setVisible(true);
            this.dispose();
            this.hide();
        }else{
            
        }
    }//GEN-LAST:event_registerJMenu1ActionPerformed

    private void verifyStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyStudentActionPerformed
        Thread runner = new Thread() {

            public void run() {
            StudentVerificationPage addUsers= new StudentVerificationPage();
                desktop1.add(addUsers);
                try {
                    addUsers.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_verifyStudentActionPerformed

    private void studentProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentProfileActionPerformed
        Thread runner = new Thread() {

            public void run() {
            StudentProfile addUsers= new StudentProfile();
                desktop1.add(addUsers);
                try {
                    addUsers.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_studentProfileActionPerformed

    private void editPassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPassportActionPerformed
        Thread runner = new Thread() {

            public void run() {
                EditUploadedPassport addUsers= new EditUploadedPassport();
                desktop1.add(addUsers);
                try {
                    addUsers.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();    }//GEN-LAST:event_editPassportActionPerformed

    private void addExaminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExaminationActionPerformed
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
    }//GEN-LAST:event_addExaminationActionPerformed

    private void examProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examProfileActionPerformed
        Thread runner = new Thread() {

        public void run() {
            ExaminationProfile regJ = new ExaminationProfile();
            desktop1.add(regJ);
            try {
                regJ.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_examProfileActionPerformed

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        Thread runner = new Thread() {

        public void run() {
            ExamSignIn regJ = new ExamSignIn();
            desktop1.add(regJ);
            try {
                regJ.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_signInActionPerformed

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        Thread runner = new Thread() {

        public void run() {
            ExamSignOut regJ = new ExamSignOut();
            desktop1.add(regJ);
            try {
                regJ.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_signOutActionPerformed

    private void allExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allExamsActionPerformed
        Thread runner = new Thread() {

        public void run() {
            AllExamination regJ = new AllExamination();
            desktop1.add(regJ);
            try {
                regJ.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_allExamsActionPerformed

    private void attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceActionPerformed
        Thread runner = new Thread() {

        public void run() {
            ViewExaminationAttendance regJ = new ViewExaminationAttendance();
            desktop1.add(regJ);
            try {
                regJ.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_attendanceActionPerformed

    private void addStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudent1ActionPerformed
        Thread runner = new Thread() {

        public void run() {
            LecturerRegistration regJ = new LecturerRegistration();
            desktop1.add(regJ);
            try {
                regJ.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_addStudent1ActionPerformed

    private void addStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudent2ActionPerformed
        Thread runner = new Thread() {

        public void run() {
            EditLecturerRegistration regJ = new EditLecturerRegistration();
            desktop1.add(regJ);
            try {
                regJ.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_addStudent2ActionPerformed

    private void allLecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allLecturersActionPerformed
        Thread runner = new Thread() {

        public void run() {
            AllLecturer regJ = new AllLecturer();
            desktop1.add(regJ);
            try {
                regJ.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_allLecturersActionPerformed

    private void verifyStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyStudent1ActionPerformed
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
    }//GEN-LAST:event_verifyStudent1ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addExamination;
    private javax.swing.JMenuItem addStudent;
    private javax.swing.JMenuItem addStudent1;
    private javax.swing.JMenuItem addStudent2;
    private javax.swing.JMenuItem allExams;
    private javax.swing.JMenuItem allLecturers;
    private javax.swing.JMenuItem allStudent;
    private javax.swing.JMenuItem attendance;
    public static javax.swing.JDesktopPane desktop1;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem editPassport;
    private javax.swing.JMenuItem editReg;
    private javax.swing.JMenuItem examProfile;
    private javax.swing.JMenuItem exitJMenu1;
    private javax.swing.JLabel iconm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu manage;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField password;
    private javax.swing.JMenu register;
    private javax.swing.JMenuItem registerJMenu1;
    private javax.swing.JMenuItem signIn;
    private javax.swing.JMenuItem signOut;
    private javax.swing.JMenuItem studentProfile;
    public static javax.swing.JTextField username;
    private javax.swing.JMenu verify;
    private javax.swing.JMenuItem verifyStudent;
    private javax.swing.JMenuItem verifyStudent1;
    // End of variables declaration//GEN-END:variables
}
