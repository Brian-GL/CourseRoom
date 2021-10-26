/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.github.javafaker.Faker;
import components.ImageFilePreview;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LENOVO
 */
public class GroupChatingPanel extends JPanel{

   
    public GroupChatingPanel(Color firstColor, Color secondColor, Color secondFontColor) {
        initComponents();
        jScrollPaneChatsCenter.getViewport().setOpaque(false);
        jScrollPaneChatsCenter.getVerticalScrollBar().setUnitIncrement(15);
        jPanelChatBottom.setBackground(firstColor);
        jTextFieldMessage.setBackground(secondColor);
        jTextFieldMessage.setForeground(secondFontColor);
        jTextFieldMessage.setCaretColor(secondFontColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelChatBottom = new javax.swing.JPanel();
        jLabelAttachFile = new javax.swing.JLabel();
        jLabelSendMessage = new javax.swing.JLabel();
        jLabelAttatchVideo = new javax.swing.JLabel();
        jLabelAttachAudio = new javax.swing.JLabel();
        jLabelAttachImage = new javax.swing.JLabel();
        jTextFieldMessage = new javax.swing.JTextField();
        jScrollPaneChatsCenter = new javax.swing.JScrollPane();
        jPanelChatCenter = new javax.swing.JPanel();

        setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        jPanelChatBottom.setMinimumSize(new java.awt.Dimension(1085, 70));
        jPanelChatBottom.setPreferredSize(new java.awt.Dimension(1085, 70));

        jLabelAttachFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/attachment.png"))); // NOI18N
        jLabelAttachFile.setToolTipText("Enviar Archivo");
        jLabelAttachFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAttachFileMouseClicked(evt);
            }
        });

        jLabelSendMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/send.png"))); // NOI18N
        jLabelSendMessage.setToolTipText("Enviar Mensaje De Texto");
        jLabelSendMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSendMessageMouseClicked(evt);
            }
        });

        jLabelAttatchVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/clapperboard.png"))); // NOI18N
        jLabelAttatchVideo.setToolTipText("Enviar Video");
        jLabelAttatchVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAttatchVideoMouseClicked(evt);
            }
        });

        jLabelAttachAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/microphone_1.png"))); // NOI18N
        jLabelAttachAudio.setToolTipText("Enviar Audio");
        jLabelAttachAudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAttachAudioMouseClicked(evt);
            }
        });

        jLabelAttachImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/edit-video.png"))); // NOI18N
        jLabelAttachImage.setToolTipText("Enviar Imagen");
        jLabelAttachImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAttachImageMouseClicked(evt);
            }
        });

        jTextFieldMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMessageKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelChatBottomLayout = new javax.swing.GroupLayout(jPanelChatBottom);
        jPanelChatBottom.setLayout(jPanelChatBottomLayout);
        jPanelChatBottomLayout.setHorizontalGroup(
            jPanelChatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChatBottomLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelAttachFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAttatchVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAttachAudio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAttachImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSendMessage)
                .addContainerGap())
        );
        jPanelChatBottomLayout.setVerticalGroup(
            jPanelChatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChatBottomLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelChatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAttachFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSendMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAttatchVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAttachAudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAttachImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldMessage)))
        );

        jScrollPaneChatsCenter.setOpaque(false);

        jPanelChatCenter.setOpaque(false);
        jPanelChatCenter.setLayout(new javax.swing.BoxLayout(jPanelChatCenter, javax.swing.BoxLayout.Y_AXIS));
        jScrollPaneChatsCenter.setViewportView(jPanelChatCenter);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneChatsCenter, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelChatBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPaneChatsCenter, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelChatBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SendMessage(){
        String text = jTextFieldMessage.getText();
        if(!text.isEmpty() && !text.isBlank()){
            Faker faker = new Faker(new Locale("es","MX"));
            String sender = faker.dune().character();
            String date = faker.backToTheFuture().date();
            TextMessagePanel textMessagePanel = new TextMessagePanel(sender,text,date);
            textMessagePanel.setMaximumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width-400,200));
            jPanelChatCenter.add(textMessagePanel);
            jTextFieldMessage.setText("");
                    
        }
    }
    private void jLabelSendMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSendMessageMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
           SendMessage();
        }
    }//GEN-LAST:event_jLabelSendMessageMouseClicked

    private void jLabelAttachFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAttachFileMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setApproveButtonText("Open File");
            fileChooser.setMultiSelectionEnabled(false);
            fileChooser.doLayout();
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if(file != null){
                    
                    Faker faker = new Faker(new Locale("es","MX"));
                    String sender = faker.dune().character();
                    String date = faker.backToTheFuture().date();
                    FileMessagePanel fileMessagePanel = new FileMessagePanel(sender,date,file);
                    fileMessagePanel.setMaximumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width-400,200));
                    jPanelChatCenter.add(fileMessagePanel);
                  
                }
            }
        }
        
    }//GEN-LAST:event_jLabelAttachFileMouseClicked

    private void jLabelAttachImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAttachImageMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setAccessory(new ImageFilePreview(fileChooser));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg", "bmp");
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setAcceptAllFileFilterUsed(true);
            fileChooser.setApproveButtonText("Open Image File");
            fileChooser.setMultiSelectionEnabled(false);
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if(file != null){
                    
                    try {
                        Image openImage = ImageIO.read(file);
                        Faker faker = new Faker(new Locale("es","MX"));
                        String sender = faker.dune().character();
                        String date = faker.backToTheFuture().date();
                        ImageMessagePanel imageMessagePanel = new ImageMessagePanel(sender,date,openImage,file.getName());
                        imageMessagePanel.setMaximumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width-400,600));
                        jPanelChatCenter.add(imageMessagePanel);
                        openImage.flush();
                        openImage = null;
                        file = null;
                    } catch (IOException ex) {
                        Logger.getLogger(GroupChatingPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  
                }
            }

            filter = null;
        }
    }//GEN-LAST:event_jLabelAttachImageMouseClicked

    private void jLabelAttatchVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAttatchVideoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Video Files", "mp4", "mkv", "wmv", "3gp","avi");
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setAcceptAllFileFilterUsed(true);
            fileChooser.setApproveButtonText("Open Video File");
            fileChooser.setMultiSelectionEnabled(false);
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if(file != null){
                    Faker faker = new Faker(new Locale("es","MX"));
                    String sender = faker.dune().character();
                    String date = faker.backToTheFuture().date();
                    VideoMessagePanel videoMessagePanel  = new VideoMessagePanel(sender,date,file.getAbsolutePath(),file.getName());
                    videoMessagePanel.setMaximumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width-400,569));
                    jPanelChatCenter.add(videoMessagePanel);
                    file = null;
                }
            }

            filter = null;
        }
    }//GEN-LAST:event_jLabelAttatchVideoMouseClicked

    private void jLabelAttachAudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAttachAudioMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Audio Files", "mp3", "flac", "ogg", "m4a");
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setAcceptAllFileFilterUsed(true);
            fileChooser.setApproveButtonText("Open Music File");
            fileChooser.setMultiSelectionEnabled(false);
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if(file != null){
                    Faker faker = new Faker(new Locale("es","MX"));
                    String sender = faker.dune().character();
                    String date = faker.backToTheFuture().date();
                    AudioMessagePanel audioMessagePanel  = new AudioMessagePanel(sender,date,file.getAbsolutePath(),file.getName());
                    audioMessagePanel.setMaximumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width-400,474));
                    jPanelChatCenter.add(audioMessagePanel);
                    file = null;
                }
            }

            filter = null;
        }
    }//GEN-LAST:event_jLabelAttachAudioMouseClicked

    private void jTextFieldMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMessageKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            SendMessage();
        }
    }//GEN-LAST:event_jTextFieldMessageKeyPressed

    
    public void dispose(){
        jPanelChatCenter.removeAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAttachAudio;
    private javax.swing.JLabel jLabelAttachFile;
    private javax.swing.JLabel jLabelAttachImage;
    private javax.swing.JLabel jLabelAttatchVideo;
    private javax.swing.JLabel jLabelSendMessage;
    private javax.swing.JPanel jPanelChatBottom;
    private javax.swing.JPanel jPanelChatCenter;
    private javax.swing.JScrollPane jScrollPaneChatsCenter;
    private javax.swing.JTextField jTextFieldMessage;
    // End of variables declaration//GEN-END:variables
}
