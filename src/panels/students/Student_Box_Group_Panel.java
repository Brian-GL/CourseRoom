/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.students;

import courseroom.MainFrame;
import data.collections.PairDoublyLinkedList;
import data.structures.Pair;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import data.interfaces.ColorInterface;

/**
 *
 * @author LENOVO
 */
public class Student_Box_Group_Panel extends javax.swing.JPanel implements ColorInterface{

    private Color firstColor , secondColor, thirdColor,fontColor, secondFontColor, thirdFontColor;
    private Student_Group_Panel groupPanel;
    private String id;
    /**
     * Creates new form BoxGroupPanel
     */
    public Student_Box_Group_Panel(String _id) {
        initComponents();
        try {
            firstColor = Color.BLACK;
            System.out.println("Group ID: "+_id+" -> Getting Image From https://loremflickr.com/644/720/sunset,beach/all");
            URL imageURL = new URL("https://loremflickr.com/131/131/sunset,beach/all");
            Image getImage = ImageIO.read(imageURL);
            ImageIcon groupIcon = new ImageIcon(getImage);
            jLabelFotoGrupo.setIcon(groupIcon);
            setColors(getImage);
            jLabelNombreGrupo.setText(MainFrame.getFaker().team().sport());
            jLabelUltimaActualizacion.setText(MainFrame.getFaker().team().state());
            jLabelClaseDelGrupo.setText(MainFrame.getFaker().team().name());
            this.id = _id;
            groupPanel = new Student_Group_Panel(getImage,jLabelNombreGrupo.getText(),firstColor,secondColor,thirdColor,fontColor,secondFontColor,thirdFontColor);
            Student_Dashboard_Panel.addView(groupPanel,id);
            getImage.flush();
        } catch (MalformedURLException ex) {
            MainFrame.getLogger().log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            MainFrame.getLogger().log(Level.SEVERE, null, ex);
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
        jLabelUltimaActualizacion = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 131));
        setMinimumSize(new java.awt.Dimension(1085, 131));
        setPreferredSize(new java.awt.Dimension(1085, 131));

        jLabelFotoGrupo.setToolTipText("Abrir Grupo");
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
        jLabelNombreGrupo.setToolTipText("Nombre Del grupo");
        jLabelNombreGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNombreGrupoMouseClicked(evt);
            }
        });

        jLabelClaseDelGrupo.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelClaseDelGrupo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelClaseDelGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/teacher.png"))); // NOI18N
        jLabelClaseDelGrupo.setToolTipText("Clase De Proveniencia Del Grupo");
        jLabelClaseDelGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClaseDelGrupoMouseClicked(evt);
            }
        });

        jLabelUltimaActualizacion.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jLabelUltimaActualizacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUltimaActualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/volume.png"))); // NOI18N
        jLabelUltimaActualizacion.setToolTipText("Actualización Más Reciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFotoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelClaseDelGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(jLabelNombreGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUltimaActualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFotoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelClaseDelGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelUltimaActualizacion)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFotoGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoGrupoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Student_Dashboard_Panel.showView(this.id);
        }
    }//GEN-LAST:event_jLabelFotoGrupoMouseClicked

    private void jLabelNombreGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNombreGrupoMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isLeftMouseButton(evt)) {
            Student_Dashboard_Panel.showView(this.id);
        }
    }//GEN-LAST:event_jLabelNombreGrupoMouseClicked

    private void jLabelClaseDelGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClaseDelGrupoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_jLabelClaseDelGrupoMouseClicked

    
    
    @Override
    public void setColors(Image image){
        
        try {
            Random colorRandom = new Random(System.currentTimeMillis());
            int maximum = 0;
            firstColor = Color.BLACK;
            PairDoublyLinkedList<Integer, Color> colorList = new PairDoublyLinkedList<>();
            PixelGrabber pg = new PixelGrabber(image, 0, 0, -1, -1, false);
            int large = image.getWidth(null)/2;
            int[] pixels;
            int pixel;
            int red;
            int green;
            int blue;
            Color color;
            Pair<Integer, Color> pair;
            int number;
            int position;
            if (pg.grabPixels()) {
                pixels = (int[]) pg.getPixels();
                for(int i = 0; i < pixels.length; i++){
                    pixel = pixels[i];
                    red = (pixel  & 0x00ff0000) >> 16;
                    green = (pixel & 0x0000ff00) >> 8;
                    blue = pixel & 0x000000ff;
                    color = new Color(red,green,blue);
                    pair = colorList.get_from_second(color);
            
                    if (pair != null) {//exist
                        number = pair.first()+ 1;
                        pair.first(number);
                        if (number > maximum) {
                            firstColor = color;
                            maximum = number;
                        }
                    } else {
                        colorList.push_back(1, color);
                    }

                    i += colorRandom.nextInt(large+1) + large;
                }

                secondColor = firstColor;
            
                int iterations = 0;
                if(colorList.size() > 1){
                    
                    while(Math.abs(secondColor.getRGB() - firstColor.getRGB()) < 3000000){
                        position = colorRandom.nextInt((int)colorList.size()-1);
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
                        position = colorRandom.nextInt((int)colorList.size()-1);
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
                
                red = firstColor.getRed();
                fontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                red = secondColor.getRed();
                secondFontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                red = thirdColor.getRed();
                thirdFontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                colorList.clear();
                
                jLabelClaseDelGrupo.setForeground(fontColor);
                jLabelNombreGrupo.setForeground(fontColor);
                jLabelUltimaActualizacion.setForeground(fontColor);
                this.setBackground(firstColor);
                this.setBorder(javax.swing.BorderFactory.createLineBorder(secondColor));
            }
            
        } catch (InterruptedException ex) {
            MainFrame.getLogger().log(Level.SEVERE, null, ex);
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelClaseDelGrupo;
    private javax.swing.JLabel jLabelFotoGrupo;
    private javax.swing.JLabel jLabelNombreGrupo;
    private javax.swing.JLabel jLabelUltimaActualizacion;
    // End of variables declaration//GEN-END:variables

}
