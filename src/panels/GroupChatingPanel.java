/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.github.javafaker.Faker;
import data.interfaces.DisposeInterface;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class GroupChatingPanel extends JPanel implements  DisposeInterface{

    private Color firstColor, secondColor;
   
    public GroupChatingPanel(Color _firstColor, Color _secondColor, Color _secondFontColor) {
        initComponents();
        firstColor = _firstColor;
        secondColor = _secondColor;
        jScrollPaneChatsCenter.getViewport().setOpaque(false);
        jScrollPaneChatsCenter.getVerticalScrollBar().setUnitIncrement(15);
        jPanelChatBottom.setBackground(firstColor);
        jTextFieldMessage.setBackground(secondColor);
        jTextFieldMessage.setForeground(_secondFontColor);
        jTextFieldMessage.setCaretColor(_secondFontColor);
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
        jTextFieldMessage = new javax.swing.JTextField();
        jButtonEnviarTexto = new javax.swing.JButton();
        jScrollPaneChatsCenter = new javax.swing.JScrollPane();
        jPanelChatCenter = new javax.swing.JPanel();

        setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        jPanelChatBottom.setMinimumSize(new java.awt.Dimension(1085, 70));
        jPanelChatBottom.setPreferredSize(new java.awt.Dimension(1085, 70));

        jTextFieldMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMessageKeyPressed(evt);
            }
        });

        jButtonEnviarTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/send.png"))); // NOI18N
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
                .addComponent(jTextFieldMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEnviarTexto)
                .addContainerGap())
        );
        jPanelChatBottomLayout.setVerticalGroup(
            jPanelChatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChatBottomLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelChatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEnviarTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelChatBottomLayout.createSequentialGroup()
                        .addComponent(jTextFieldMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviarTexto;
    private javax.swing.JPanel jPanelChatBottom;
    private javax.swing.JPanel jPanelChatCenter;
    private javax.swing.JScrollPane jScrollPaneChatsCenter;
    private javax.swing.JTextField jTextFieldMessage;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose(){
        jPanelChatCenter.removeAll();
    }
}
