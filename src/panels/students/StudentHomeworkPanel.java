/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.students;

import panels.generals.GeneralHomeworkUploadFile;
import com.github.javafaker.Faker;
import data.interfaces.DisposeInterface;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import panels.generals.GeneralAttachmentPanel;
import panels.generals.GeneralHomeworkCommentPanel;

/**
 *
 * @author LENOVO
 */
public class StudentHomeworkPanel extends javax.swing.JPanel implements DisposeInterface{
    
    private Color firstColor, secondColor,thirdColor,fontColor, secondFontColor, thirdFontColor;
    
    
    public StudentHomeworkPanel(String name, Color _firstColor, Color _secondColor, Color _thirdColor, Color _fontColor, Color _secondFontColor,Color _thirdFontColor ) {
        initComponents();
        firstColor = _firstColor;
        secondColor = _secondColor;
        fontColor = _fontColor;
        secondFontColor = _secondFontColor;
        thirdColor = _thirdColor;
        thirdFontColor = _thirdFontColor;
        jLabelHomeworkName.setText(name);
        
        jScrollPaneComments.getViewport().setOpaque(false);
        jScrollPaneComments.getVerticalScrollBar().setUnitIncrement(15);

        jScrollPaneHomeworkDescription.getViewport().setOpaque(false);
        jScrollPaneHomeworkDescription.getVerticalScrollBar().setUnitIncrement(15);

        jScrollPaneUploadedFiles.getViewport().setOpaque(false);
        jScrollPaneUploadedFiles.getVerticalScrollBar().setUnitIncrement(15);
        
        jScrollPaneAttachments.getViewport().setOpaque(false);
        jScrollPaneAttachments.getHorizontalScrollBar().setUnitIncrement(15);
        
        colorMyComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelHomeworkName = new javax.swing.JLabel();
        jLabelTeacherName = new javax.swing.JLabel();
        jPanelMyWork = new javax.swing.JPanel();
        jButtonUploadFile = new javax.swing.JButton();
        jScrollPaneUploadedFiles = new javax.swing.JScrollPane();
        jPanelUploadedFiles = new javax.swing.JPanel();
        jScrollPaneHomeworkDescription = new javax.swing.JScrollPane();
        jTextPaneHomeworkDescription = new javax.swing.JTextPane();
        jPanelHomeworkComments = new javax.swing.JPanel();
        jPanelSendComment = new javax.swing.JPanel();
        jTextFieldComment = new javax.swing.JTextField();
        jComboBoxCommentType = new javax.swing.JComboBox<>();
        jButtonSendComment = new javax.swing.JButton();
        jScrollPaneComments = new javax.swing.JScrollPane();
        jPanelComments = new javax.swing.JPanel();
        jButtonSendWork = new javax.swing.JButton();
        jLabelDateTimeFinished = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jLabelHomeworkClass = new javax.swing.JLabel();
        jLabelHomeworkStatus = new javax.swing.JLabel();
        jScrollPaneAttachments = new javax.swing.JScrollPane();
        jPanelAttachments = new javax.swing.JPanel();

        setBackground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1085, 630));

        jLabelHomeworkName.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelHomeworkName.setText("Nombre De La Tarea");
        jLabelHomeworkName.setToolTipText("Nombre De La Tarea");
        jLabelHomeworkName.setOpaque(true);

        jLabelTeacherName.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelTeacherName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTeacherName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/avatar.png"))); // NOI18N
        jLabelTeacherName.setText("Nombre Del Profesor");
        jLabelTeacherName.setToolTipText("Nombre Del Profesor");

        jPanelMyWork.setOpaque(false);

        jButtonUploadFile.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        jButtonUploadFile.setText("Añadir Archivo");
        jButtonUploadFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUploadFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUploadFileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonUploadFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonUploadFileMouseExited(evt);
            }
        });

        jScrollPaneUploadedFiles.setBorder(null);
        jScrollPaneUploadedFiles.setOpaque(false);

        jPanelUploadedFiles.setOpaque(false);
        jPanelUploadedFiles.setLayout(new javax.swing.BoxLayout(jPanelUploadedFiles, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneUploadedFiles.setViewportView(jPanelUploadedFiles);

        javax.swing.GroupLayout jPanelMyWorkLayout = new javax.swing.GroupLayout(jPanelMyWork);
        jPanelMyWork.setLayout(jPanelMyWorkLayout);
        jPanelMyWorkLayout.setHorizontalGroup(
            jPanelMyWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMyWorkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMyWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneUploadedFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelMyWorkLayout.setVerticalGroup(
            jPanelMyWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMyWorkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneUploadedFiles, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPaneHomeworkDescription.setBorder(null);
        jScrollPaneHomeworkDescription.setOpaque(false);

        jTextPaneHomeworkDescription.setEditable(false);
        jTextPaneHomeworkDescription.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jTextPaneHomeworkDescription.setText("Texto\nDe\nPrueba");
        jTextPaneHomeworkDescription.setOpaque(false);
        jScrollPaneHomeworkDescription.setViewportView(jTextPaneHomeworkDescription);

        jPanelHomeworkComments.setOpaque(false);

        jPanelSendComment.setOpaque(false);

        jTextFieldComment.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextFieldComment.setToolTipText("Redacta aquí tu comentario");
        jTextFieldComment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCommentKeyPressed(evt);
            }
        });

        jComboBoxCommentType.setFont(new java.awt.Font("Gadugi", 2, 14)); // NOI18N
        jComboBoxCommentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Público", "Privado" }));
        jComboBoxCommentType.setToolTipText("Seleccionar Tipo De Comentario");

        jButtonSendComment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/send.png"))); // NOI18N
        jButtonSendComment.setToolTipText("Enviar Comentario");
        jButtonSendComment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSendComment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSendCommentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSendCommentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSendCommentMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelSendCommentLayout = new javax.swing.GroupLayout(jPanelSendComment);
        jPanelSendComment.setLayout(jPanelSendCommentLayout);
        jPanelSendCommentLayout.setHorizontalGroup(
            jPanelSendCommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSendCommentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldComment, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCommentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSendComment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSendCommentLayout.setVerticalGroup(
            jPanelSendCommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSendCommentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSendCommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelSendCommentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxCommentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSendComment, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPaneComments.setBorder(null);
        jScrollPaneComments.setOpaque(false);

        jPanelComments.setOpaque(false);
        jPanelComments.setLayout(new javax.swing.BoxLayout(jPanelComments, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneComments.setViewportView(jPanelComments);

        javax.swing.GroupLayout jPanelHomeworkCommentsLayout = new javax.swing.GroupLayout(jPanelHomeworkComments);
        jPanelHomeworkComments.setLayout(jPanelHomeworkCommentsLayout);
        jPanelHomeworkCommentsLayout.setHorizontalGroup(
            jPanelHomeworkCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSendComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPaneComments, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelHomeworkCommentsLayout.setVerticalGroup(
            jPanelHomeworkCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeworkCommentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneComments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSendComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jButtonSendWork.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonSendWork.setText("Enviar Trabajo");
        jButtonSendWork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSendWork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSendWorkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSendWorkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSendWorkMouseExited(evt);
            }
        });

        jLabelDateTimeFinished.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        jLabelDateTimeFinished.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDateTimeFinished.setText("Fecha & Hora De Entrega De La Tarea");
        jLabelDateTimeFinished.setToolTipText("Fecha & Hora De Entrega");

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/reply.png"))); // NOI18N
        jButtonRegresar.setToolTipText("Regresar A Mis Tareas");
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

        jLabelHomeworkClass.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        jLabelHomeworkClass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHomeworkClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/training.png"))); // NOI18N
        jLabelHomeworkClass.setText("De La Clase Sistemas Operativos");
        jLabelHomeworkClass.setToolTipText("Clase De Proveniencia");
        jLabelHomeworkClass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeworkClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeworkClassMouseClicked(evt);
            }
        });

        jLabelHomeworkStatus.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelHomeworkStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHomeworkStatus.setText("Pendiente");

        jScrollPaneAttachments.setBorder(null);
        jScrollPaneAttachments.setOpaque(false);

        jPanelAttachments.setOpaque(false);
        jPanelAttachments.setLayout(new javax.swing.BoxLayout(jPanelAttachments, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPaneAttachments.setViewportView(jPanelAttachments);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelHomeworkComments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneHomeworkDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHomeworkClass, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelHomeworkName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPaneAttachments, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHomeworkStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMyWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDateTimeFinished, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSendWork, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHomeworkName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelHomeworkClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTeacherName))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneHomeworkDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPaneAttachments, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanelHomeworkComments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHomeworkStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMyWork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDateTimeFinished)
                        .addGap(131, 131, 131)
                        .addComponent(jButtonSendWork, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSendWorkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendWorkMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_jButtonSendWorkMouseClicked

    private void jButtonSendWorkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendWorkMouseEntered
        // TODO add your handling code here:
        jButtonSendWork.setBackground(thirdColor);
        jButtonSendWork.setForeground(thirdFontColor);
    }//GEN-LAST:event_jButtonSendWorkMouseEntered

    private void jButtonSendWorkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendWorkMouseExited
        // TODO add your handling code here:
        jButtonSendWork.setBackground(secondColor);
        jButtonSendWork.setForeground(secondFontColor);
    }//GEN-LAST:event_jButtonSendWorkMouseExited

    private void jButtonSendCommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendCommentMouseClicked
        // TODO add your handling code here:
        if(!jTextFieldComment.getText().isEmpty() && !jTextFieldComment.getText().isBlank()){
            sendComment();
        }
    }//GEN-LAST:event_jButtonSendCommentMouseClicked

    private void jButtonSendCommentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendCommentMouseExited
        // TODO add your handling code here:
        jButtonSendComment.setBackground(thirdColor);
        jButtonSendComment.setForeground(thirdFontColor);
    }//GEN-LAST:event_jButtonSendCommentMouseExited

    private void jTextFieldCommentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCommentKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!jTextFieldComment.getText().isEmpty() && !jTextFieldComment.getText().isBlank()){
                sendComment();
            }
        }
    }//GEN-LAST:event_jTextFieldCommentKeyPressed

    private void jButtonUploadFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUploadFileMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            attachFile();
        }
    }//GEN-LAST:event_jButtonUploadFileMouseClicked

    private void jButtonUploadFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUploadFileMouseExited
        // TODO add your handling code here:
        jButtonUploadFile.setBackground(thirdColor);
        jButtonUploadFile.setForeground(thirdFontColor);
    }//GEN-LAST:event_jButtonUploadFileMouseExited

    private void jButtonUploadFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUploadFileMouseEntered
        // TODO add your handling code here:
        jButtonUploadFile.setBackground(secondColor);
        jButtonUploadFile.setForeground(secondFontColor);
    }//GEN-LAST:event_jButtonUploadFileMouseEntered

    private void jButtonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            StudentDashboardPanel.showView("homeworksPanel");
        }
    }//GEN-LAST:event_jButtonRegresarMouseClicked

    private void jButtonRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseEntered
        // TODO add your handling code here:
        jButtonRegresar.setBackground(secondColor);
    }//GEN-LAST:event_jButtonRegresarMouseEntered

    private void jButtonRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseExited
        // TODO add your handling code here:
        jButtonRegresar.setBackground(thirdColor);
    }//GEN-LAST:event_jButtonRegresarMouseExited

    private void jLabelHomeworkClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeworkClassMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_jLabelHomeworkClassMouseClicked

    private void jButtonSendCommentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendCommentMouseEntered
        // TODO add your handling code here:
        jButtonSendComment.setBackground(secondColor);
        jButtonSendComment.setForeground(secondFontColor);
    }//GEN-LAST:event_jButtonSendCommentMouseEntered

    private void sendComment(){
        try {
            
            Locale mx = new Locale("es","MX");
            Faker faker = new Faker(mx);
            System.out.println("Comment Getting Image From https://loremflickr.com/50/50/sunset,beach/all");
            URL imageURL = new URL("https://loremflickr.com/50/50/sunset,beach/all");
            Image getImage = ImageIO.read(imageURL);
            GeneralHomeworkCommentPanel homeworkCommentPanel = new GeneralHomeworkCommentPanel(getImage,faker.name().fullName()+":",jTextFieldComment.getText(),secondColor,secondFontColor);
            jPanelComments.add(homeworkCommentPanel,LEFT_ALIGNMENT);
            getImage.flush();
            getImage = null;
            imageURL = null;
            jTextFieldComment.setText("");
        } catch (MalformedURLException ex) {
            Logger.getLogger(StudentHomeworkPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentHomeworkPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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

                GeneralHomeworkUploadFile homeworkUploadFile = new GeneralHomeworkUploadFile(file,thirdColor,thirdFontColor,secondColor, secondFontColor);
                jPanelUploadedFiles.add(homeworkUploadFile);

            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonSendComment;
    private javax.swing.JButton jButtonSendWork;
    private javax.swing.JButton jButtonUploadFile;
    private javax.swing.JComboBox<String> jComboBoxCommentType;
    private javax.swing.JLabel jLabelDateTimeFinished;
    private javax.swing.JLabel jLabelHomeworkClass;
    private javax.swing.JLabel jLabelHomeworkName;
    private javax.swing.JLabel jLabelHomeworkStatus;
    private javax.swing.JLabel jLabelTeacherName;
    private javax.swing.JPanel jPanelAttachments;
    private javax.swing.JPanel jPanelComments;
    private javax.swing.JPanel jPanelHomeworkComments;
    private javax.swing.JPanel jPanelMyWork;
    private javax.swing.JPanel jPanelSendComment;
    private javax.swing.JPanel jPanelUploadedFiles;
    private javax.swing.JScrollPane jScrollPaneAttachments;
    private javax.swing.JScrollPane jScrollPaneComments;
    private javax.swing.JScrollPane jScrollPaneHomeworkDescription;
    private javax.swing.JScrollPane jScrollPaneUploadedFiles;
    private javax.swing.JTextField jTextFieldComment;
    private javax.swing.JTextPane jTextPaneHomeworkDescription;
    // End of variables declaration//GEN-END:variables

    public void colorMyComponents() {
        
        jButtonUploadFile.setBackground(thirdColor);
        jButtonUploadFile.setForeground(thirdFontColor);
        
        jTextFieldComment.setForeground(thirdFontColor);
        jTextFieldComment.setCaretColor(thirdFontColor);
        jTextFieldComment.setBackground(thirdColor);
        
        jComboBoxCommentType.setForeground(thirdFontColor);
        jComboBoxCommentType.setBackground(thirdColor);

        jLabelHomeworkName.setForeground(secondFontColor);
        jLabelHomeworkName.setBackground(secondColor);

        jLabelTeacherName.setForeground(fontColor);

        jLabelHomeworkClass.setForeground(fontColor);

        jLabelDateTimeFinished.setForeground(fontColor);

        Locale mx = new Locale("es","MX");
        Faker faker = new Faker(mx);

        jTextPaneHomeworkDescription.setForeground(fontColor);
        jTextPaneHomeworkDescription.setText(faker.lorem().paragraph(6));

        jButtonSendWork.setBackground(secondColor);
        jButtonSendWork.setForeground(secondFontColor);

        jButtonRegresar.setBackground(thirdColor);
        
        jLabelHomeworkStatus.setForeground(fontColor);

        jButtonSendComment.setBackground(thirdColor);
        jButtonSendComment.setForeground(thirdFontColor);

        this.setBackground(firstColor);
        
        jPanelMyWork.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(fontColor), "Mi Trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18),fontColor));
        jPanelHomeworkComments.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(fontColor), "Comentarios De La Tarea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18),fontColor));
        
        for(int i = 0; i < 4; i++){
            GeneralAttachmentPanel generalAttachmentPanel = new GeneralAttachmentPanel(fontColor, secondColor, secondFontColor);
            jPanelAttachments.add(generalAttachmentPanel);
        }
    }
    
    @Override
    public void dispose() {
        jPanelComments.removeAll();
        jPanelUploadedFiles.removeAll();
    }
}
