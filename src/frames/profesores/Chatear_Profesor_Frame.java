/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames.profesores;

import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import paneles.profesores.chats.Chats_Profesor_Panel;

/**
 *
 * @author LENOVO
 */
public class Chatear_Profesor_Frame extends javax.swing.JDialog implements Componentes_Interface{

    
    public Chatear_Profesor_Frame() {
        
        initComponents();
        
        Iniciar_Componentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido_JPanel = new javax.swing.JPanel();
        chatear_JButton = new javax.swing.JButton();
        cerrar_JButton = new javax.swing.JButton();
        chatear_AutoCompletionComboBox = new com.jidesoft.swing.AutoCompletionComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(800, 140));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new java.awt.CardLayout());

        contenido_JPanel.setMaximumSize(new java.awt.Dimension(800, 140));
        contenido_JPanel.setMinimumSize(new java.awt.Dimension(800, 140));
        contenido_JPanel.setPreferredSize(new java.awt.Dimension(800, 140));

        chatear_JButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        chatear_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/online-chat_1.png"))); // NOI18N
        chatear_JButton.setText("Chatear");
        ((ImageIcon)chatear_JButton.getIcon()).getImage().flush();
        chatear_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatear_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chatear_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chatear_JButtonMouseExited(evt);
            }
        });

        cerrar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/close.png"))); // NOI18N
        cerrar_JButton.setBorder(null);
        ((ImageIcon)cerrar_JButton.getIcon()).getImage().flush();
        cerrar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseExited(evt);
            }
        });

        chatear_AutoCompletionComboBox.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chatear_AutoCompletionComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(cerrar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 614, Short.MAX_VALUE)
                        .addComponent(chatear_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chatear_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chatear_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(contenido_JPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chatear_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatear_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(chatear_AutoCompletionComboBox.getSelectedItem() != null){
                if(!((String)chatear_AutoCompletionComboBox.getSelectedItem()).isBlank() && !((String)chatear_AutoCompletionComboBox.getSelectedItem()).isEmpty()){

                    int cuenta = Chats_Profesor_Panel.Numero_Chats()+1;
                    String id = CourseRoom.Utilerias.Concatenar("Chat_", cuenta);

                    // Chat_Profesor_Panel.Agregar_Chat();
                    //Tablero_Estudiante_Panel.Mostrar_Vista(id);

                    this.dispose();


                }
            }
        }
    }//GEN-LAST:event_chatear_JButtonMouseClicked

    private void chatear_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatear_JButtonMouseEntered
        // TODO add your handling code here:
        chatear_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        chatear_JButton.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
    }//GEN-LAST:event_chatear_JButtonMouseEntered

    private void chatear_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatear_JButtonMouseExited
        // TODO add your handling code here:
        chatear_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
        chatear_JButton.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
    }//GEN-LAST:event_chatear_JButtonMouseExited

    private void cerrar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.dispose();
        }
    }//GEN-LAST:event_cerrar_JButtonMouseClicked

    private void cerrar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseEntered
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
    }//GEN-LAST:event_cerrar_JButtonMouseEntered

    private void cerrar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseExited
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_cerrar_JButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar_JButton;
    private com.jidesoft.swing.AutoCompletionComboBox chatear_AutoCompletionComboBox;
    private javax.swing.JButton chatear_JButton;
    private javax.swing.JPanel contenido_JPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        Font gadugi = new java.awt.Font("Gadugi", 1, 16);
        
        chatear_AutoCompletionComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Chatear Con", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Utilerias.Tercer_Color_Fuente()));
        
       
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        
        chatear_AutoCompletionComboBox.setBackground(CourseRoom.Utilerias.Tercer_Color());
        chatear_AutoCompletionComboBox.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        
        contenido_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());
        
        cerrar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        
        chatear_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
        chatear_JButton.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
               
    }
}