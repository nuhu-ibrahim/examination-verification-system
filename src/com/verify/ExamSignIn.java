package com.verify;

import com.digitalpersona.onetouch.DPFPCaptureFeedback;
import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPImageQualityAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPImageQualityEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import static com.verify.MainMenu.desktop1;
import java.awt.Image;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ExamSignIn extends javax.swing.JInternalFrame {

    private DPFPCapture capturer = DPFPGlobal.getCaptureFactory().createCapture();
    private DPFPEnrollment enroller = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private DPFPVerification verificator = DPFPGlobal.getVerificationFactory().createVerification();
    public ExamSignIn main;
    private DPFPTemplate template;
    private DPFPFeatureSet features;
    private String regnum;
    
    public String getRegNo(){
        return this.regnum;
    }
    
    public ExamSignIn() {
        DBConnection.connect();
        initComponents();
        Thread runner = new Thread() {

            public void run() {
                try {
                    while(true){
                        String selected = ""+exam.getSelectedItem();
                        int a=1;

                        java.util.Date date = new java.util.Date();
                        String d1 = new SimpleDateFormat("yyyy-MM-dd").format(date);
                        String t1 = new SimpleDateFormat("HH:mm:ss").format(date);
                        /*
                        java.util.Date date2 = new java.util.Date(d1+" "+time1);
                        String t1 = new SimpleDateFormat("yyyy-MM-dd").format(date2);

                        java.util.Date date3 = new java.util.Date(d1+" "+time2);
                        String t2 = new SimpleDateFormat("yyyy-MM-dd").format(date3);
                        */
                        PreparedStatement st;
                        String sql2= "select exam_id from exam_info where exam_date=? AND start_time <= ? AND end_time >=? ";
                        st = DBConnection.con.prepareStatement(sql2);
                        st.setString(1, d1);
                        st.setString(2, t1);
                        st.setString(3, t1);
                        DBConnection.rs = st.executeQuery();
                        while(DBConnection.rs.next()){
                            a=a+1;
                        }
                        String sql1= "select exam_id from exam_info where exam_date =? AND start_time <= ? AND end_time >=? ORDER BY exam_id DESC";
                        st = DBConnection.con.prepareStatement(sql1);
                        st.setString(1, d1);
                        st.setString(2, t1);
                        st.setString(3, t1);
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
       
        init();
        start(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        exam = new javax.swing.JComboBox();
        picture = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Examination Sign In");
        setPreferredSize(new java.awt.Dimension(476, 528));
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText(" EXAMINATION SIGN-IN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Sign In Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        next.setText("Verify");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 210, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Examination");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        exam.setFont(new java.awt.Font("Simplified Arabic", 0, 13)); // NOI18N
        exam.setForeground(java.awt.Color.darkGray);
        exam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Examination..." }));
        jPanel1.add(exam, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, 220, 20));
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 240, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 360, 390));

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 100, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 460, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String getExamId(){
        return ""+this.exam.getSelectedItem();
    }
    
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(exam.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Please select an examination", "Exam not selected!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            try{
                PreparedStatement st;
                String sql1= "select * from exam_info where exam_id = ?";
                st = DBConnection.con.prepareStatement(sql1);
                st.setString(1, ""+exam.getSelectedItem());

                DBConnection.rs = st.executeQuery();
                DBConnection.rs.next();
                String start_time  = DBConnection.rs.getString("start_time");
                String exam_date = DBConnection.rs.getString("exam_date");
                java.util.Date exam  = new java.util.Date(exam_date.replaceAll("-", "/")+" "+start_time);
                java.util.Date today  = new java.util.Date();
                exam.setTime(exam.getTime() + 1800000);
                //System.out.println(exam);
                boolean error = true;
                if(today.before(exam)){
                    // Check quality of the sample and start verification if it's good
                    if (features != null)
                    {
                        String sql = "select * from student_bio";
                        st = DBConnection.con.prepareStatement(sql);
                        DBConnection.rs = st.executeQuery();
                        while(DBConnection.rs.next()){
                            regnum = DBConnection.rs.getString("reg_no");
                            onLoad(regnum.replaceAll("/", "")+".fpt");
                            // Compare the feature set with our template
                            DPFPVerificationResult result = 
                                verificator.verify(features, template);
                            //updateStatus(result.getFalseAcceptRate());
                            if (result.isVerified()){
                                makeReport("The fingerprint was VERIFIED.");

                                sql = "select * from exam_sign_in where reg_no = ? and exam_id = ?";
                                st = DBConnection.con.prepareStatement(sql);

                                st.setString(1, regnum);
                                st.setString(2, ""+this.exam.getSelectedItem());

                                DBConnection.rs = st.executeQuery();

                                if(DBConnection.rs.next()){
                                    JOptionPane.showMessageDialog(this, "Student has already been signed in for thesame examination", "Issue", JOptionPane.OK_OPTION);
                                }else{
                                    ResultSignIn regJ = new ResultSignIn(ExamSignIn.this);
                                    desktop1.add(regJ);
                                    try {
                                        regJ.setSelected(true);
                                    } catch (java.beans.PropertyVetoException e) {

                                    }
                                }
                                error = false;
                            }
                        }
                        if(error){
                            makeReport("The fingerprint was NOT VERIFIED.");
                            JOptionPane.showMessageDialog(ExamSignIn.this, "The fingerprint does not match any student.","Information", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(ExamSignIn.this, "No fingerprint has been captured, please capture fingerprint and try again","Information", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "No candidate is permitted to enter the examination hall after 30 minutes of examination commencement", "Issue", JOptionPane.OK_OPTION);
                }
            }catch(Exception ex){
		JOptionPane.showMessageDialog(this, "Issue");
		System.out.println(ex.getMessage());
		ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_nextActionPerformed

    private void onLoad(String string) {
        try{
            String address = "C:\\Users\\M Shuwa\\Desktop\\Examination Screening System\\src\\com\\passport\\";
            
            FileInputStream stream = new FileInputStream(address+string);
            byte[] data = new byte[stream.available()];
            stream.read(data);
            stream.close();
            DPFPTemplate t = DPFPGlobal.getTemplateFactory().createTemplate();
            t.deserialize(data);
            setTemplate(t);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), "Fingerprint loading", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    protected void init(){
        capturer.addDataListener(new DPFPDataAdapter() {
            @Override public void dataAcquired(final DPFPDataEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint sample was captured.");
                    setPrompt("Scan the same fingerprint again.");
                    process(e.getSample());
                }});
            }
        });
        capturer.addReaderStatusListener(new DPFPReaderStatusAdapter() {
            @Override public void readerConnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint reader was connected.");
                }});
            }
            @Override public void readerDisconnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint reader was disconnected.");
                }});
            }
        });
        capturer.addSensorListener(new DPFPSensorAdapter() {
            @Override public void fingerTouched(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint reader was touched.");
                }});
            }
            @Override public void fingerGone(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The finger was removed from the fingerprint reader.");
                }});
            }
        });
        capturer.addImageQualityListener(new DPFPImageQualityAdapter() {
            @Override public void onImageQuality(final DPFPImageQualityEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    if (e.getFeedback().equals(DPFPCaptureFeedback.CAPTURE_FEEDBACK_GOOD))
                        makeReport("The quality of the fingerprint sample is good.");
                    else
                        makeReport("The quality of the fingerprint sample is poor.");
                }});
            }
        });
    }

    protected void process(DPFPSample sample)
    {
        // Draw fingerprint sample image.
        drawPicture(convertSampleToBitmap(sample));
        
        // Process the sample and create a feature set for the enrollment purpose.
        features = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);
    }

    public DPFPTemplate getTemplate() {
        return template;
    }
    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
    }
    
    protected void start()
    {
        capturer.startCapture();
        setPrompt("Using the fingerprint reader, scan your fingerprint.");
        //JOptionPane.showMessageDialog(this, "Using the fingerprint reader, scan your fingerprint.");
    }

    protected void stop()
    {
        capturer.stopCapture();
    }

    public void setStatus(String string) {
        //status.setText(string);
        System.out.println(string);
    }
    public void setPrompt(String string) {
        //prompt.setText(string);
        System.out.println(string);
    }
    public void makeReport(String string) {
        //log.append(string + "\n");
        System.out.println(string);
    }

    public void drawPicture(Image image) {
        picture.setIcon(new ImageIcon(
        image.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_DEFAULT)));
    }

    protected Image convertSampleToBitmap(DPFPSample sample) {
        return DPFPGlobal.getSampleConversionFactory().createImage(sample);
    }

    protected DPFPFeatureSet extractFeatures(DPFPSample sample, DPFPDataPurpose purpose)
    {
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try {
                return extractor.createFeatureSet(sample, purpose);
        } catch (DPFPImageQualityException e) {
                return null;
        }
    }
    
    private void updateStatus()
	{
            int count = enroller.getFeaturesNeeded();
            
            if(count > 0){
                JOptionPane.showMessageDialog(this, "Using the fingerprint reader, scan your fingerprint again","Information", JOptionPane.INFORMATION_MESSAGE);
            } 
            setStatus(String.format("Fingerprint samples needed: %1$s", enroller.getFeaturesNeeded()));
	}
    
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        this.hide();
    }//GEN-LAST:event_cancelActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        stop();
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox exam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton next;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
