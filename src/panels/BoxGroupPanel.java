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
import javax.swing.border.TitledBorder;

/**
 *
 * @author LENOVO
 */
public class BoxGroupPanel extends javax.swing.JPanel implements ColorInterface{

    private Color firstColor , secondColor, thirdColor,fontColor, secondFontColor, thirdFontColor;
    private GroupingPanel groupingPanel;
    private int id;
    /**
     * Creates new form BoxGroupPanel
     */
    public BoxGroupPanel(int _id) {
        initComponents();
        try {
            firstColor = Color.BLACK;
            System.out.println("Group ID: "+_id+" -> Getting Image From https://loremflickr.com/644/720/sunset,beach/all");
            URL imageURL = new URL("https://loremflickr.com/644/720/sunset,beach/all");
            Image getImage = ImageIO.read(imageURL);
            Image groupImage = getImage.getScaledInstance(164,164,Image.SCALE_SMOOTH);
            ImageIcon groupIcon = new ImageIcon(groupImage);
            jLabelFotoGrupo.setIcon(groupIcon);
            setColors(getImage);
            Faker faker = new Faker(new Locale("es","MX"));
            jLabelNombreGrupo.setText(faker.team().sport());
            jLabelUltimaActualizacion.setText(faker.team().state());
            jLabelNumeroIntegrantes.setText(faker.number().digits(1) + " Integrantes" );
            jLabelClaseDelGrupo.setText(faker.team().name());
            jLabelChatDelGrupo.setText(faker.gameOfThrones().character());
            this.id = _id;
            groupingPanel = new GroupingPanel(getImage,jLabelNombreGrupo.getText(),firstColor,secondColor,thirdColor,fontColor,secondFontColor,thirdFontColor);
            DashboardPanel.addView(groupingPanel,"group"+_id);
            getImage.flush();
            getImage = null;
            groupImage.flush();
            groupImage = null;
            groupIcon = null;
            imageURL = null;
        } catch (MalformedURLException ex) {
            Logger.getLogger(BoxChatPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BoxChatPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabelFotoGrupo = new javax.swing.JLabel();
        jLabelNombreGrupo = new javax.swing.JLabel();
        jLabelClaseDelGrupo = new javax.swing.JLabel();
        jLabelNumeroIntegrantes = new javax.swing.JLabel();
        jLabelChatDelGrupo = new javax.swing.JLabel();
        jLabelUltimaActualizacion = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 174));
        setMinimumSize(new java.awt.Dimension(1085, 174));
        setPreferredSize(new java.awt.Dimension(1085, 174));

        jLabelFotoGrupo.setMaximumSize(new java.awt.Dimension(164, 164));
        jLabelFotoGrupo.setMinimumSize(new java.awt.Dimension(164, 164));
        jLabelFotoGrupo.setPreferredSize(new java.awt.Dimension(164, 164));
        jLabelFotoGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoGrupoMouseClicked(evt);
            }
        });

        jLabelNombreGrupo.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelNombreGrupo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombreGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/group_1.png"))); // NOI18N
        jLabelNombreGrupo.setText("Nombre Del Grupo");
        jLabelNombreGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNombreGrupoMouseClicked(evt);
            }
        });

        jLabelClaseDelGrupo.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelClaseDelGrupo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelClaseDelGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/teacher.png"))); // NOI18N
        jLabelClaseDelGrupo.setText("Clase De Proveniencia Del Grupo");

        jLabelNumeroIntegrantes.setFont(new java.awt.Font("Gadugi", 2, 16)); // NOI18N
        jLabelNumeroIntegrantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/chat.png"))); // NOI18N
        jLabelNumeroIntegrantes.setText("10 Integrantes");

        jLabelChatDelGrupo.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelChatDelGrupo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelChatDelGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/talking.png"))); // NOI18N
        jLabelChatDelGrupo.setText("Los Estudiosos Chat");

        jLabelUltimaActualizacion.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jLabelUltimaActualizacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUltimaActualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/volume.png"))); // NOI18N
        jLabelUltimaActualizacion.setText("User Ha Cambiado La Foto Del Grupo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFotoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNumeroIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelChatDelGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
                    .addComponent(jLabelNombreGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelClaseDelGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(jLabelUltimaActualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFotoGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelClaseDelGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelUltimaActualizacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelChatDelGrupo)
                            .addComponent(jLabelNumeroIntegrantes))))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFotoGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoGrupoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            DashboardPanel.showView("group"+id);
        }
    }//GEN-LAST:event_jLabelFotoGrupoMouseClicked

    private void jLabelNombreGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNombreGrupoMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isLeftMouseButton(evt)) {
            DashboardPanel.showView("group" + id);
        }
    }//GEN-LAST:event_jLabelNombreGrupoMouseClicked

    
    
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
                fontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                red = secondColor.getRed();
                secondFontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                red = thirdColor.getRed();
                thirdFontColor = (red >= 155) ? Color.BLACK : Color.WHITE;

                colorList.clear();
                
                jLabelChatDelGrupo.setForeground(fontColor);
                jLabelClaseDelGrupo.setForeground(fontColor);
                jLabelNombreGrupo.setForeground(fontColor);
                jLabelNumeroIntegrantes.setForeground(fontColor);
                jLabelUltimaActualizacion.setForeground(fontColor);
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
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelChatDelGrupo;
    private javax.swing.JLabel jLabelClaseDelGrupo;
    private javax.swing.JLabel jLabelFotoGrupo;
    private javax.swing.JLabel jLabelNombreGrupo;
    private javax.swing.JLabel jLabelNumeroIntegrantes;
    private javax.swing.JLabel jLabelUltimaActualizacion;
    // End of variables declaration//GEN-END:variables

}
