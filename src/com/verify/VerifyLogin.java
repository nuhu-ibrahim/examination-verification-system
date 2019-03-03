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
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class VerifyLogin extends javax.swing.JDialog {

    MainMenu main;
    private DPFPCapture capturer = DPFPGlobal.getCaptureFactory().createCapture();
    private DPFPEnrollment enroller = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private DPFPVerification verificator = DPFPGlobal.getVerificationFactory().createVerification();
    private DPFPTemplate template;
    private DPFPFeatureSet features;
    
    public VerifyLogin(java.awt.Frame parent, boolean modal, MainMenu main) {
        super(parent, modal);
        this.main=main;
        initComponents();
        
                
        onLoad(main.getStaffId().replaceAll("/", "")+".fpt");
        
        init();
        start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        validate1 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("EXAMINER VERIFICATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, -1, -1));
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 280));

        validate1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        validate1.setText("Verify");
        validate1.setToolTipText("Click to validate Matric. Number");
        validate1.setEnabled(false);
        validate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validate1ActionPerformed(evt);
            }
        });
        jPanel1.add(validate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 180, 30));

        refresh.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        refresh.setText("Cancel");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {                                         
        stop();
    }                                        
    
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

        validate1.setEnabled(true);
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
        JOptionPane.showMessageDialog(this, "Using the fingerprint reader, scan your fingerprint.");
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
    
    private void validate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validate1ActionPerformed
        // Check quality of the sample and start verification if it's good
        if (features != null)
        {
            // Compare the feature set with our template
            DPFPVerificationResult result = 
                verificator.verify(features, template);
            //updateStatus(result.getFalseAcceptRate());
            if (result.isVerified()){
                JOptionPane.showMessageDialog(this, "The fingerprint was VERIFIED.");
                main.examinerUserControls();
                this.dispose();
                this.hide();
            }else{ 
                JOptionPane.showMessageDialog(this, "The fingerprint was not VERIFIED.","Information", JOptionPane.OK_OPTION);
                /*this.dispose();
                this.hide();

                main.dispose();
                main.hide();

                new MainMenu().setVisible(true);*/
            }
        }
    }//GEN-LAST:event_validate1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        this.dispose();
        this.hide();
        
        main.dispose();
        main.hide();
        
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_refreshActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        stop();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel picture;
    private javax.swing.JButton refresh;
    private javax.swing.JButton validate1;
    // End of variables declaration//GEN-END:variables
}
