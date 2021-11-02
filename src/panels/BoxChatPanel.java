/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.github.javafaker.Faker;
import data.collections.PairDoublyLinkedList;
import data.structures.Pair;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import data.interfaces.ColorInterface;
import data.interfaces.DisposeInterface;

/**
 *
 * @author LENOVO
 */
public class BoxChatPanel extends javax.swing.JPanel implements ColorInterface, DisposeInterface{

    private Color firstColor, fontColor, secondColor;
    private ChatingPanel chatingPanel;
    private int id;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public BoxChatPanel(int _id) {
        initComponents();
        try {
            firstColor = Color.BLACK;
            System.out.println("Chat ID: "+_id+" -> Getting Image From https://loremflickr.com/644/720/sunset,beach/all");
            URL imageURL = new URL("https://loremflickr.com/644/720/sunset,beach/all");
            Image getImage = ImageIO.read(imageURL);
            Image chatImage = getImage.getScaledInstance(129,129,Image.SCALE_SMOOTH);
            ImageIcon chatIcon = new ImageIcon(chatImage);
            jLabelFotoChat.setIcon(chatIcon);
            setColors(getImage);
            Locale mx = new Locale("es","MX");
            Faker faker = new Faker(mx);
            jLabelNombreChat.setText(faker.rickAndMorty().character());
            jLabelUltimoMensaje.setText(faker.friends().character() + " Is There?");
            jLabelNumeroMensajesNoLeidos.setText(faker.number().digits(1));
            this.id = _id;
            chatingPanel = new ChatingPanel(jLabelNombreChat.getText(),firstColor, fontColor,secondColor);
            DashboardPanel.addView(chatingPanel,"chat"+id);
            
            getImage.flush();
            getImage = null;
            chatImage.flush();
            chatImage = null;
            chatIcon = null;
            imageURL = null;
            faker = null;
            mx = null;
            
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
            PairDoublyLinkedList<Integer, Color> colorList = new PairDoublyLinkedList<>();
            PixelGrabber pg = new PixelGrabber(image, 0, 0, -1, -1, false);
            int large = image.getWidth(null)/2;
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
                    i += colorRandom.nextInt(large+1) + large;
                }
                
                secondColor = firstColor;
            
                int iterations = 0;
                if(colorList.size() > 1){
                    
                    while(Math.abs(secondColor.getRGB() - firstColor.getRGB()) < 3000000){
                        int position = colorRandom.nextInt((int)colorList.size()-1);
                        secondColor = colorList.get(position).second();
                        iterations++;
                        if(iterations > 25){
                             while(firstColor.getRGB() == secondColor.getRGB()){
                                position = colorRandom.nextInt((int)colorList.size()-1);
                                secondColor = colorList.get(position).second();
                            }
                             break;
                        }
                    }
                }

                int red = firstColor.getRed();
                fontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
               
                colorList.clear();

                
                jLabelFechaHoraMensaje.setForeground(fontColor);
                jLabelNombreChat.setForeground(fontColor);
                jLabelNumeroMensajesNoLeidos.setForeground(fontColor);
                jLabelUltimoMensaje.setForeground(fontColor);
                this.setBackground(firstColor);
                this.setBorder(javax.swing.BorderFactory.createLineBorder(secondColor));

                colorRandom = null;
                colorList = null;
                pg = null;
                pixels = null;
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(MusicPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(32767, 139));
        setMinimumSize(new java.awt.Dimension(1085, 139));
        setPreferredSize(new java.awt.Dimension(1085, 139));

        jLabelFotoChat.setMaximumSize(new java.awt.Dimension(129, 129));
        jLabelFotoChat.setMinimumSize(new java.awt.Dimension(129, 129));
        jLabelFotoChat.setPreferredSize(new java.awt.Dimension(129, 129));
        jLabelFotoChat.setRequestFocusEnabled(false);
        jLabelFotoChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoChatMouseClicked(evt);
            }
        });

        jLabelNombreChat.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabelNombreChat.setForeground(java.awt.Color.white);
        jLabelNombreChat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombreChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/online-chat_1.png"))); // NOI18N
        jLabelNombreChat.setText("Nombre Del Chat");
        jLabelNombreChat.setToolTipText("Nombre Del Chat");
        jLabelNombreChat.setMaximumSize(new java.awt.Dimension(488, 32));
        jLabelNombreChat.setMinimumSize(new java.awt.Dimension(488, 32));
        jLabelNombreChat.setPreferredSize(new java.awt.Dimension(488, 32));
        jLabelNombreChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNombreChatMouseClicked(evt);
            }
        });

        jLabelUltimoMensaje.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jLabelUltimoMensaje.setForeground(java.awt.Color.white);
        jLabelUltimoMensaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUltimoMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/messaging.png"))); // NOI18N
        jLabelUltimoMensaje.setText("Último Mensaje Recibido");
        jLabelUltimoMensaje.setToolTipText("Último Mensaje Recibido");
        jLabelUltimoMensaje.setMaximumSize(new java.awt.Dimension(417, 22));
        jLabelUltimoMensaje.setMinimumSize(new java.awt.Dimension(417, 22));
        jLabelUltimoMensaje.setPreferredSize(new java.awt.Dimension(417, 22));

        jLabelNumeroMensajesNoLeidos.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        jLabelNumeroMensajesNoLeidos.setForeground(java.awt.Color.white);
        jLabelNumeroMensajesNoLeidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumeroMensajesNoLeidos.setText("1");
        jLabelNumeroMensajesNoLeidos.setToolTipText("Número De Mensajes No Leídos");

        jLabelFechaHoraMensaje.setFont(new java.awt.Font("Gadugi", 2, 14)); // NOI18N
        jLabelFechaHoraMensaje.setForeground(java.awt.Color.white);
        jLabelFechaHoraMensaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaHoraMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/circular-clock.png"))); // NOI18N
        jLabelFechaHoraMensaje.setText("10/08/2021 05:42 P.M");
        jLabelFechaHoraMensaje.setToolTipText("Fecha & Hora Del Último Mensaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFotoChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelFechaHoraMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNumeroMensajesNoLeidos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNombreChat, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                    .addComponent(jLabelUltimoMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFotoChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreChat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUltimoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaHoraMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumeroMensajesNoLeidos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFotoChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoChatMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            DashboardPanel.showView("chat"+id);
        }
    }//GEN-LAST:event_jLabelFotoChatMouseClicked

    private void jLabelNombreChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNombreChatMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            DashboardPanel.showView("chat"+id);
        }
    }//GEN-LAST:event_jLabelNombreChatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFechaHoraMensaje;
    private javax.swing.JLabel jLabelFotoChat;
    private javax.swing.JLabel jLabelNombreChat;
    private javax.swing.JLabel jLabelNumeroMensajesNoLeidos;
    private javax.swing.JLabel jLabelUltimoMensaje;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose() {
        chatingPanel.dispose();
    }

   
}
