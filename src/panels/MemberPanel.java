/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.github.javafaker.Faker;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import data.collections.PairDoublyLinkedList;
import data.structures.Pair;
import java.awt.image.PixelGrabber;

/**
 *
 * @author LENOVO
 */
public class MemberPanel extends javax.swing.JPanel {

    private Color firstColor,secondColor;
    /**
     * Creates new form MemberPanel
     */
    public MemberPanel() {
        initComponents();
        Random colorRandom = new Random(System.currentTimeMillis());
        try {
            firstColor = secondColor = Color.BLACK;
            System.out.println("Member -> Getting Image From https://source.unsplash.com/random/?nature,city,beach,sunset");
            URL imageURL = new URL("https://source.unsplash.com/random/?nature,city,beach,sunset");
            Image image = ImageIO.read(imageURL);
            setColors(image);
            Image cover = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(cover);
            jLabelMemberPhoto.setIcon(imageIcon);
            image.flush();
            cover.flush();
            image = null;
            cover = null;
            Faker faker = new Faker(new Locale("es","MX"));
            String nombre = faker.name().firstName() + " " +faker.name().firstName();
            String apellido = faker.name().lastName() + " " + faker.name().lastName();
            String username = faker.name().username();
            
            jLabelMemberLastName.setText(apellido);
            jLabelMemberName.setText(nombre);
            jLabelMemberUserName.setText(username);
            
            apellido = nombre = username = null;
            
            faker = null;
            
            this.setBackground(DashboardPanel.getFirstColor());
            jLabelMemberLastName.setForeground(DashboardPanel.getFontColor());
            jLabelMemberLastName.setForeground(DashboardPanel.getFontColor());
            jLabelMemberLastName.setForeground(DashboardPanel.getFontColor());
            
        } catch (IOException ex) {
            Logger.getLogger(MemberPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabelMemberPhoto = new javax.swing.JLabel();
        jLabelMemberName = new javax.swing.JLabel();
        jLabelMemberLastName = new javax.swing.JLabel();
        jLabelMemberUserName = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(252, 203));
        setMinimumSize(new java.awt.Dimension(252, 203));
        setPreferredSize(new java.awt.Dimension(252, 203));

        jLabelMemberPhoto.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelMemberPhoto.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelMemberPhoto.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabelMemberName.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabelMemberName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMemberName.setText("Nombre Del Miembro");

        jLabelMemberLastName.setFont(new java.awt.Font("Gadugi", 2, 14)); // NOI18N
        jLabelMemberLastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMemberLastName.setText("Apellido Del Miembro");

        jLabelMemberUserName.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        jLabelMemberUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMemberUserName.setText("Nombre De Usuario Del Miembro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelMemberName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelMemberLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMemberPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelMemberUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMemberPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMemberName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMemberLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMemberUserName)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, firstColor, 0, h, secondColor);
        graphics.setPaint(gp);
        graphics.fillRect(0, 0, w, h);
        graphics = null;
        gp = null;
        graphics = null;
        
    }
    
   
    public void setColors(Image image){
        
        try {
            Random colorRandom = new Random(System.currentTimeMillis());
            int maximum = 0;
            
            PairDoublyLinkedList<Integer, Color> colorList = new PairDoublyLinkedList<>();
            PixelGrabber pg = new PixelGrabber(image, 0, 0, -1, -1, false);
            int large = (image.getWidth(null)/3);
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
                Color fontColor = (red >= 155) ? Color.BLACK : Color.WHITE;

                colorList.clear();

                jLabelMemberLastName.setForeground(fontColor);
                jLabelMemberUserName.setForeground(fontColor);
                jLabelMemberName.setForeground(fontColor);

                fontColor = null;
                colorRandom = null;
                colorList = null;
                pg = null;
                pixels = null;
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(MusicPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelMemberLastName;
    private javax.swing.JLabel jLabelMemberName;
    private javax.swing.JLabel jLabelMemberPhoto;
    private javax.swing.JLabel jLabelMemberUserName;
    // End of variables declaration//GEN-END:variables
}
