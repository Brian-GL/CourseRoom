/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import data.collections.PairDoublyLinkedList;
import data.structures.Pair;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
import panels.MusicPanel;

/**
 *
 * @author LENOVO
 */
public class BoxChatPanel extends javax.swing.JPanel implements data.interfaces.MainInterface{

    private Color firstColor, secondColor, thirdColor;
    private Image chatImage;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public BoxChatPanel(String route) {
        initComponents();
        try {
            URL imageURL = new URL(route);
            chatImage = ImageIO.read(imageURL).getScaledInstance(125,125,Image.SCALE_SMOOTH);
            ImageIcon chatIcon = new ImageIcon(chatImage);
            jLabelFotoChat.setIcon(chatIcon);
            firstColor = Color.BLACK;
            secondColor = Color.BLACK;
            chatIcon = null;
            setColors(chatImage);
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
                    i+= colorRandom.nextInt(401)+ 400;
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
                

                thirdColor = secondColor;
                if(colorList.size() > 2){
                    iterations = 0;
                    
                    while(Math.abs(thirdColor.getRGB() - firstColor.getRGB()) < 3000000 || Math.abs(secondColor.getRGB() - thirdColor.getRGB()) < 3000000){
                        int position = colorRandom.nextInt((int)colorList.size()-1);
                        thirdColor = colorList.get(position).second();
                        iterations++;
                        if(iterations > 50){
                            while(thirdColor.getRGB() == firstColor.getRGB() || thirdColor.getRGB() == secondColor.getRGB()){
                                position = colorRandom.nextInt((int)colorList.size()-1);
                                thirdColor = colorList.get(position).second();
                            }
                            break;
                        }
                    }
                }
                
                int red = firstColor.getRed();
                Color fontColor = (red >= 155) ? Color.BLACK : Color.WHITE;

                colorList.clear();

                jLabelNombreChat.setForeground(fontColor);
                jLabelUltimoMensaje.setForeground(fontColor);
                jLabelNumeroMensajesNoLeidos.setForeground(fontColor);
                jLabelFechaHoraMensaje.setForeground(fontColor);
                jLabelFotoChat.setForeground(fontColor);

                fontColor = null;
                colorRandom = null;
                colorList = null;
                fontColor = null;
                pg = null;
                pixels = null;
                this.repaint();
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(MusicPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = this.getWidth();
        int h = this.getHeight();
        Graphics2D graphics = (Graphics2D)g;
        Color noColor =  new Color(0, 0, 0, 0);
        GradientPaint primary = new GradientPaint(0f, 0f, secondColor, w, 0f, thirdColor);
        GradientPaint secondary = new GradientPaint( 0f, 0f, noColor,0f, h, firstColor);
        graphics.setPaint(primary);
        graphics.fillRect(0, 0, w, h);
        graphics.setPaint(secondary);
        graphics.fillRect(0, 0, w, h);
        primary = null;
        secondary = null;
        noColor = null;
        graphics = null;

    }

    @Override
    public void dispose(){
        firstColor = null;
        secondColor = null;
        thirdColor = null;
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
        setMaximumSize(new java.awt.Dimension(32767, 248));
        setMinimumSize(new java.awt.Dimension(291, 248));
        setPreferredSize(new java.awt.Dimension(291, 248));

        jLabelFotoChat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelFotoChat.setMaximumSize(new java.awt.Dimension(125, 125));
        jLabelFotoChat.setMinimumSize(new java.awt.Dimension(125, 125));
        jLabelFotoChat.setPreferredSize(new java.awt.Dimension(125, 125));
        jLabelFotoChat.setRequestFocusEnabled(false);

        jLabelNombreChat.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabelNombreChat.setForeground(java.awt.Color.white);
        jLabelNombreChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreChat.setText("Nombre Del Chat");
        jLabelNombreChat.setMaximumSize(new java.awt.Dimension(488, 32));
        jLabelNombreChat.setMinimumSize(new java.awt.Dimension(488, 32));
        jLabelNombreChat.setPreferredSize(new java.awt.Dimension(488, 32));

        jLabelUltimoMensaje.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabelUltimoMensaje.setForeground(java.awt.Color.white);
        jLabelUltimoMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUltimoMensaje.setText("Último Mensaje Recibido");
        jLabelUltimoMensaje.setMaximumSize(new java.awt.Dimension(417, 22));
        jLabelUltimoMensaje.setMinimumSize(new java.awt.Dimension(417, 22));
        jLabelUltimoMensaje.setPreferredSize(new java.awt.Dimension(417, 22));

        jLabelNumeroMensajesNoLeidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNumeroMensajesNoLeidos.setForeground(java.awt.Color.white);
        jLabelNumeroMensajesNoLeidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumeroMensajesNoLeidos.setText("1");
        jLabelNumeroMensajesNoLeidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));

        jLabelFechaHoraMensaje.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelFechaHoraMensaje.setForeground(java.awt.Color.white);
        jLabelFechaHoraMensaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaHoraMensaje.setText("10/08/2021 05:42 P.M");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFechaHoraMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumeroMensajesNoLeidos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNombreChat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelUltimoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 74, Short.MAX_VALUE)
                        .addComponent(jLabelFotoChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFotoChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombreChat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelUltimoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaHoraMensaje)
                    .addComponent(jLabelNumeroMensajesNoLeidos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
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
