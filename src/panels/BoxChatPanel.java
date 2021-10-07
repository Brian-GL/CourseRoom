/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import data.collections.PairDoublyLinkedList;
import data.interfaces.MainInterface;
import data.structures.Pair;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO
 */
public class BoxChatPanel extends javax.swing.JPanel implements MainInterface{

    private Image chatImage;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public BoxChatPanel(String route) {
        initComponents();
        try {
            URL imageURL = new URL(route);
            chatImage = ImageIO.read(imageURL).getScaledInstance(114,114,Image.SCALE_SMOOTH);
            ImageIcon chatIcon = new ImageIcon(chatImage);
            jLabelFotoChat.setIcon(chatIcon);
            setColors(chatImage);
            chatIcon = null;
            imageURL = null;
        } catch (MalformedURLException ex) {
            Logger.getLogger(BoxChatPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BoxChatPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public void setColors(Image image){
        
        try {
            Random colorRandom = new Random(System.currentTimeMillis());
            int maximum = 0;
            Color firstColor = Color.BLACK;
            PairDoublyLinkedList<Integer, Color> colorList = new PairDoublyLinkedList<>();
            PixelGrabber pg = new PixelGrabber(image, 0, 0, -1, -1, false);
            
            if (pg.grabPixels()) {
                int[] pixels = (int[]) pg.getPixels();
                for(int i = 0; i < pixels.length; i++){
                    int pixel = pixels[i];
                    int  red = (pixel  & 0x00ff0000) >> 16;
                    int  green = (pixel & 0x0000ff00) >> 8;
                    int  blue = pixel & 0x000000ff;
                    Color color = new Color(red,green,blue);
                    Pair<Integer, Color> pair = colorList.get_from_second(color);
            
                    if (pair != null) {//exist
                        int number = pair.first()+ 1;
                        pair.first(number);
                        if (number > maximum) {
                            firstColor = color;
                            maximum = number;
                        }
                    } else {
                        colorList.push_back(1, color);
                    }

                    color = null;
                    i += colorRandom.nextInt(50);
                }

              
                int red = firstColor.getRed();
                Color fontColor = (red >= 155) ? Color.BLACK : Color.WHITE;

                colorList.clear();

                Component[] components = this.getComponents();
                for (Component component : components){
                    component.setForeground(fontColor);
                }
                this.setBackground(firstColor);

                fontColor = null;
                colorRandom = null;
                colorList = null;
                fontColor = null;
                pg = null;
                pixels = null;
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(MusicPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
  
    @Override
    public void dispose(){
        chatImage.flush();
        chatImage = null;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFotoChat = new javax.swing.JLabel();
        jLabelNombreChat = new javax.swing.JLabel();
        jLabelUltimoMensaje = new javax.swing.JLabel();
        jLabelNumeroMensajesNoLeidos = new javax.swing.JLabel();
        jLabelFechaHoraMensaje = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(32767, 134));
        setMinimumSize(new java.awt.Dimension(540, 134));
        setPreferredSize(new java.awt.Dimension(540, 134));

        jLabelFotoChat.setMaximumSize(new java.awt.Dimension(114, 114));
        jLabelFotoChat.setMinimumSize(new java.awt.Dimension(114, 114));
        jLabelFotoChat.setPreferredSize(new java.awt.Dimension(114, 114));
        jLabelFotoChat.setRequestFocusEnabled(false);

        jLabelNombreChat.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabelNombreChat.setForeground(java.awt.Color.white);
        jLabelNombreChat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombreChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/online-chat_1.png"))); // NOI18N
        jLabelNombreChat.setText("Nombre Del Chat");
        jLabelNombreChat.setMaximumSize(new java.awt.Dimension(488, 32));
        jLabelNombreChat.setMinimumSize(new java.awt.Dimension(488, 32));
        jLabelNombreChat.setPreferredSize(new java.awt.Dimension(488, 32));

        jLabelUltimoMensaje.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jLabelUltimoMensaje.setForeground(java.awt.Color.white);
        jLabelUltimoMensaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUltimoMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/messaging.png"))); // NOI18N
        jLabelUltimoMensaje.setText("Último Mensaje Recibido");
        jLabelUltimoMensaje.setMaximumSize(new java.awt.Dimension(417, 22));
        jLabelUltimoMensaje.setMinimumSize(new java.awt.Dimension(417, 22));
        jLabelUltimoMensaje.setPreferredSize(new java.awt.Dimension(417, 22));

        jLabelNumeroMensajesNoLeidos.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        jLabelNumeroMensajesNoLeidos.setForeground(java.awt.Color.white);
        jLabelNumeroMensajesNoLeidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumeroMensajesNoLeidos.setText("1");

        jLabelFechaHoraMensaje.setFont(new java.awt.Font("Gadugi", 2, 14)); // NOI18N
        jLabelFechaHoraMensaje.setForeground(java.awt.Color.white);
        jLabelFechaHoraMensaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaHoraMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/circular-clock.png"))); // NOI18N
        jLabelFechaHoraMensaje.setText("10/08/2021 05:42 P.M");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFotoChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelFechaHoraMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNumeroMensajesNoLeidos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelUltimoMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(jLabelNombreChat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreChat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUltimoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFechaHoraMensaje)
                            .addComponent(jLabelNumeroMensajesNoLeidos)))
                    .addComponent(jLabelFotoChat, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFechaHoraMensaje;
    private javax.swing.JLabel jLabelFotoChat;
    private javax.swing.JLabel jLabelNombreChat;
    private javax.swing.JLabel jLabelNumeroMensajesNoLeidos;
    private javax.swing.JLabel jLabelUltimoMensaje;
    // End of variables declaration//GEN-END:variables
}
