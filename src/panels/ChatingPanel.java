/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.github.javafaker.Faker;
import components.ImageFilePreview;
import courseroom.MainFrame;
import data.interfaces.DisposeInterface;
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
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LENOVO
 */
public class ChatingPanel extends javax.swing.JPanel implements DisposeInterface{

    private Color firstColor, secondColor, fontColor;
    
    public ChatingPanel(String name, Color _firstColor, Color _fontColor, Color _secondColor) {
        initComponents();
        firstColor = _firstColor;
        secondColor = _secondColor;
        fontColor = _fontColor;
        jScrollPaneChatsCenter.getViewport().setOpaque(false);
        jScrollPaneChatsCenter.getVerticalScrollBar().setUnitIncrement(15);
        jLabelChatName.setText(name);
        paintMyComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelChatTop = new javax.swing.JPanel();
        jLabelChatName = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jPanelChatBottom = new javax.swing.JPanel();
        jTextFieldMessage = new javax.swing.JTextField();
        jButtonEnviarArchivo = new javax.swing.JButton();
        jButtonEnviarVideo = new javax.swing.JButton();
        jButtonEnviarAudio = new javax.swing.JButton();
        jButtonEnviarImagen = new javax.swing.JButton();
        jButtonEnviarTexto = new javax.swing.JButton();
        jScrollPaneChatsCenter = new javax.swing.JScrollPane();
        jPanelChatCenter = new javax.swing.JPanel();

        setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        jPanelChatTop.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanelChatTop.setMinimumSize(new java.awt.Dimension(1085, 50));
        jPanelChatTop.setPreferredSize(new java.awt.Dimension(1085, 50));

        jLabelChatName.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelChatName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChatName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/chat_1.png"))); // NOI18N
        jLabelChatName.setText("Nombre Del Chat O La Persona Con Quien Se Chatea");
        jLabelChatName.setToolTipText("Nombre Del Chat O La Persona Con Quien Se Chatea");

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/reply.png"))); // NOI18N
        jButtonRegresar.setToolTipText("Regresar A Mis Chats");
        jButtonRegresar.setBorder(null);
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelChatTopLayout = new javax.swing.GroupLayout(jPanelChatTop);
        jPanelChatTop.setLayout(jPanelChatTopLayout);
        jPanelChatTopLayout.setHorizontalGroup(
            jPanelChatTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChatTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabelChatName, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelChatTopLayout.setVerticalGroup(
            jPanelChatTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChatTopLayout.createSequentialGroup()
                .addGroup(jPanelChatTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelChatName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegresar))
                .addContainerGap())
        );

        jPanelChatBottom.setMinimumSize(new java.awt.Dimension(1085, 70));
        jPanelChatBottom.setPreferredSize(new java.awt.Dimension(1085, 70));

        jTextFieldMessage.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jTextFieldMessage.setToolTipText("Redactar Menssaje");
        jTextFieldMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMessageKeyPressed(evt);
            }
        });

        jButtonEnviarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/attachment.png"))); // NOI18N
        jButtonEnviarArchivo.setToolTipText("Enviar Archivo");
        jButtonEnviarArchivo.setBorder(null);
        jButtonEnviarArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnviarArchivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEnviarArchivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEnviarArchivoMouseExited(evt);
            }
        });

        jButtonEnviarVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/clapperboard.png"))); // NOI18N
        jButtonEnviarVideo.setToolTipText("Enviar Archivo De Video");
        jButtonEnviarVideo.setBorder(null);
        jButtonEnviarVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviarVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnviarVideoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEnviarVideoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEnviarVideoMouseExited(evt);
            }
        });

        jButtonEnviarAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/microphone.png"))); // NOI18N
        jButtonEnviarAudio.setToolTipText("Enviar Archivo De Audio");
        jButtonEnviarAudio.setBorder(null);
        jButtonEnviarAudio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviarAudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnviarAudioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEnviarAudioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEnviarAudioMouseExited(evt);
            }
        });

        jButtonEnviarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/edit-video.png"))); // NOI18N
        jButtonEnviarImagen.setToolTipText("Enviar Archivo De Imagen");
        jButtonEnviarImagen.setBorder(null);
        jButtonEnviarImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnviarImagenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEnviarImagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEnviarImagenMouseExited(evt);
            }
        });

        jButtonEnviarTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/send.png"))); // NOI18N
        jButtonEnviarTexto.setToolTipText("Enviar Mensaje");
        jButtonEnviarTexto.setBorder(null);
        jButtonEnviarTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviarTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnviarTextoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEnviarTextoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEnviarTextoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelChatBottomLayout = new javax.swing.GroupLayout(jPanelChatBottom);
        jPanelChatBottom.setLayout(jPanelChatBottomLayout);
        jPanelChatBottomLayout.setHorizontalGroup(
            jPanelChatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChatBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEnviarArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEnviarVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEnviarAudio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEnviarImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEnviarTexto)
                .addContainerGap())
        );
        jPanelChatBottomLayout.setVerticalGroup(
            jPanelChatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChatBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelChatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonEnviarArchivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEnviarVideo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEnviarAudio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEnviarImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldMessage, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEnviarTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                    .addComponent(jPanelChatTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneChatsCenter, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelChatBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelChatTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPaneChatsCenter, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelChatBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendMessage(){
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
    private void jTextFieldMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMessageKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            sendMessage();
        }
    }//GEN-LAST:event_jTextFieldMessageKeyPressed

    private void jButtonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
           DashboardPanel.showView("chatsPanel");
        }
    }//GEN-LAST:event_jButtonRegresarMouseClicked

    private void jButtonRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseEntered
        // TODO add your handling code here:
        jButtonRegresar.setBackground(secondColor);
    }//GEN-LAST:event_jButtonRegresarMouseEntered

    private void jButtonRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseExited
        // TODO add your handling code here:
        jButtonRegresar.setBackground(firstColor);
    }//GEN-LAST:event_jButtonRegresarMouseExited

    private void jButtonEnviarArchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarArchivoMouseExited
        // TODO add your handling code here:
        jButtonEnviarArchivo.setBackground(secondColor);
    }//GEN-LAST:event_jButtonEnviarArchivoMouseExited

    private void jButtonEnviarArchivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarArchivoMouseEntered
        // TODO add your handling code here:
        jButtonEnviarArchivo.setBackground(firstColor);
    }//GEN-LAST:event_jButtonEnviarArchivoMouseEntered

    private void jButtonEnviarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarArchivoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            attachFile();
        }
    }//GEN-LAST:event_jButtonEnviarArchivoMouseClicked

    private void jButtonEnviarVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarVideoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            attachVideo();
        }
    }//GEN-LAST:event_jButtonEnviarVideoMouseClicked

    private void jButtonEnviarVideoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarVideoMouseEntered
        // TODO add your handling code here:
        jButtonEnviarVideo.setBackground(firstColor);
    }//GEN-LAST:event_jButtonEnviarVideoMouseEntered

    private void jButtonEnviarVideoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarVideoMouseExited
        // TODO add your handling code here:
        jButtonEnviarVideo.setBackground(secondColor);
    }//GEN-LAST:event_jButtonEnviarVideoMouseExited

    private void jButtonEnviarAudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarAudioMouseClicked
        // TODO add your handling code here
        if(SwingUtilities.isLeftMouseButton(evt)){
            attachAudio();
        }
    }//GEN-LAST:event_jButtonEnviarAudioMouseClicked

    private void jButtonEnviarAudioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarAudioMouseEntered
        // TODO add your handling code here:
        jButtonEnviarAudio.setBackground(firstColor);
    }//GEN-LAST:event_jButtonEnviarAudioMouseEntered

    private void jButtonEnviarAudioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarAudioMouseExited
        // TODO add your handling code here:
        jButtonEnviarAudio.setBackground(secondColor);
    }//GEN-LAST:event_jButtonEnviarAudioMouseExited

    private void jButtonEnviarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarImagenMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            attachImagen();
        }
    }//GEN-LAST:event_jButtonEnviarImagenMouseClicked

    private void jButtonEnviarImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarImagenMouseEntered
        // TODO add your handling code here:
        jButtonEnviarImagen.setBackground(firstColor);
    }//GEN-LAST:event_jButtonEnviarImagenMouseEntered

    private void jButtonEnviarImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarImagenMouseExited
        // TODO add your handling code here:
        jButtonEnviarImagen.setBackground(secondColor);
    }//GEN-LAST:event_jButtonEnviarImagenMouseExited

    private void jButtonEnviarTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarTextoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            sendMessage();
        }
    }//GEN-LAST:event_jButtonEnviarTextoMouseClicked

    private void jButtonEnviarTextoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarTextoMouseEntered
        // TODO add your handling code here:
        jButtonEnviarTexto.setBackground(firstColor);
    }//GEN-LAST:event_jButtonEnviarTextoMouseEntered

    private void jButtonEnviarTextoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarTextoMouseExited
        // TODO add your handling code here:
        jButtonEnviarTexto.setBackground(secondColor);
    }//GEN-LAST:event_jButtonEnviarTextoMouseExited

    private void attachFile(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setApproveButtonText("Open File");
        fileChooser.setMultiSelectionEnabled(false);
        fileChooser.doLayout();
        int result = fileChooser.showOpenDialog(this);

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
            
    private void attachVideo(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Video Files", "mp4", "mkv", "wmv", "3gp","avi");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setApproveButtonText("Open Video File");
        fileChooser.setMultiSelectionEnabled(false);
        int result = fileChooser.showOpenDialog(this);

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
    
    private void attachImagen(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAccessory(new ImageFilePreview(fileChooser));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg", "bmp");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setApproveButtonText("Open Image File");
        fileChooser.setMultiSelectionEnabled(false);
        int result = fileChooser.showOpenDialog(this);

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
                    Logger.getLogger(ChatingPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        filter = null;
    }
    
    private void attachAudio(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Audio Files", "mp3", "flac", "ogg", "m4a");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setApproveButtonText("Open Music File");
        fileChooser.setMultiSelectionEnabled(false);
        int result = fileChooser.showOpenDialog(this);

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
    
    public void paintMyComponents(){
        
        jButtonRegresar.setBackground(firstColor);
        jLabelChatName.setForeground(fontColor);
        jTextFieldMessage.setBackground(firstColor);
        jTextFieldMessage.setForeground(fontColor);
        jLabelChatName.setForeground(fontColor);
        jPanelChatBottom.setBackground(secondColor);
        jPanelChatTop.setBackground(firstColor);
        
        jButtonEnviarArchivo.setBackground(secondColor);
        jButtonEnviarAudio.setBackground(secondColor);
        jButtonEnviarImagen.setBackground(secondColor);
        jButtonEnviarTexto.setBackground(secondColor);
        jButtonEnviarVideo.setBackground(secondColor);
        
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviarArchivo;
    private javax.swing.JButton jButtonEnviarAudio;
    private javax.swing.JButton jButtonEnviarImagen;
    private javax.swing.JButton jButtonEnviarTexto;
    private javax.swing.JButton jButtonEnviarVideo;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelChatName;
    private javax.swing.JPanel jPanelChatBottom;
    private javax.swing.JPanel jPanelChatCenter;
    private javax.swing.JPanel jPanelChatTop;
    private javax.swing.JScrollPane jScrollPaneChatsCenter;
    private javax.swing.JTextField jTextFieldMessage;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose()  {
        jPanelChatCenter.removeAll();
    }
}
