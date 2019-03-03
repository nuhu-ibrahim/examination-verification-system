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

public class StudentVerificationPage extends javax.swing.JInternalFrame {

    private DPFPCapture capturer = DPFPGlobal.getCaptureFactory().createCapture();
    private DPFPEnrollment enroller = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private DPFPVerification verificator = DPFPGlobal.getVerificationFactory().createVerification();
    public StudentVerificationPage main;
    private DPFPTemplate template;
    private DPFPFeatureSet features;
    private String regnum;
    
    public String getRegNo(){
        return regnum;
    }
    
    public StudentVerificationPage() {
        DBConnection.connect();
        initComponents();
       
        init();
        start(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        picture = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Student Verification");
        setPreferredSize(new java.awt.Dimension(324, 446));
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Verification Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tempus Sans ITC", 1, 14), java.awt.Color.darkGray)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        next.setText("Verify");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, -1));
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 250, 310));

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 100, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 310, 10));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText(" STUDENT VERIFICATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try{
            boolean error = true;
            if (features != null)
            {
                PreparedStatement st;
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
                        
                        Result regJ = new Result(StudentVerificationPage.this);
                        desktop1.add(regJ);
                        try {
                            regJ.setSelected(true);
                        } catch (java.beans.PropertyVetoException e) {

                        }
                        error = false;
                    }
                }
                if(error){
                    Result1 regJ = new Result1(StudentVerificationPage.this);
                    desktop1.add(regJ);
                    try {
                        regJ.setSelected(true);
                    } catch (java.beans.PropertyVetoException e) {
                    }
                }
                this.hide();
            }else{
                JOptionPane.showMessageDialog(StudentVerificationPage.this, "No fingerprint has been captured, please capture fingerprint and try again","Information", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Issue");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton next;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
