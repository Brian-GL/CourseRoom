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
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import data.interfaces.ColorInterface;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class Student_Box_Homework_Panel extends javax.swing.JPanel implements ColorInterface{

    private Color firstColor, secondColor,thirdColor,fontColor, secondFontColor, thirdFontColor;
    private String id;
    private Student_Homework_Panel homeworkPanel;
    
    
    public Student_Box_Homework_Panel(String _id) {
        initComponents();
        this.id = _id;
        InitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFotoTarea = new javax.swing.JLabel();
        jLabelClaseDeLaTarea = new javax.swing.JLabel();
        jLabelNombreTarea = new javax.swing.JLabel();
        jLabelFechaDeEntrega = new javax.swing.JLabel();
        jLabelTipoDeTarea = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 174));
        setMinimumSize(new java.awt.Dimension(1085, 174));
        setPreferredSize(new java.awt.Dimension(1085, 174));

        jLabelFotoTarea.setToolTipText("Abrir Tarea");
        jLabelFotoTarea.setMaximumSize(new java.awt.Dimension(164, 164));
        jLabelFotoTarea.setMinimumSize(new java.awt.Dimension(164, 164));
        jLabelFotoTarea.setPreferredSize(new java.awt.Dimension(164, 164));
        jLabelFotoTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoTareaMouseClicked(evt);
            }
        });

        jLabelClaseDeLaTarea.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelClaseDeLaTarea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelClaseDeLaTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/course.png"))); // NOI18N
        jLabelClaseDeLaTarea.setToolTipText("Clase Que Pertenece La Tarea");
        jLabelClaseDeLaTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClaseDeLaTareaMouseClicked(evt);
            }
        });

        jLabelNombreTarea.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelNombreTarea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombreTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/homework_2.png"))); // NOI18N
        jLabelNombreTarea.setToolTipText("Nombre De La Tarea");
        jLabelNombreTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNombreTareaMouseClicked(evt);
            }
        });

        jLabelFechaDeEntrega.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jLabelFechaDeEntrega.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaDeEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/homework_1.png"))); // NOI18N
        jLabelFechaDeEntrega.setToolTipText("Fecha De Entrega");

        jLabelTipoDeTarea.setFont(new java.awt.Font("Gadugi", 2, 16)); // NOI18N
        jLabelTipoDeTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/writing.png"))); // NOI18N
        jLabelTipoDeTarea.setToolTipText("Tipo De Tarea");

        jLabelEstado.setFont(new java.awt.Font("Gadugi", 2, 16)); // NOI18N
        jLabelEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/homework_3.png"))); // NOI18N
        jLabelEstado.setToolTipText("Estado De La Tarea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFotoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClaseDeLaTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTipoDeTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFechaDeEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                        .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNombreTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFotoTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelClaseDeLaTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTipoDeTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEstado)
                            .addComponent(jLabelFechaDeEntrega))))
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFotoTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoTareaMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Student_Dashboard_Panel.showView(this.id);
        }
    }//GEN-LAST:event_jLabelFotoTareaMouseClicked

    private void jLabelNombreTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNombreTareaMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Student_Dashboard_Panel.showView(this.id);
        }
    }//GEN-LAST:event_jLabelNombreTareaMouseClicked

    private void jLabelClaseDeLaTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClaseDeLaTareaMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_jLabelClaseDeLaTareaMouseClicked

    
    @Override
    public void SetColors(Image image){
        
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

                jLabelEstado.setForeground(fontColor);
                jLabelClaseDeLaTarea.setForeground(fontColor);
                jLabelFechaDeEntrega.setForeground(fontColor);
                jLabelNombreTarea.setForeground(fontColor);
                jLabelTipoDeTarea.setForeground(fontColor);
                
                this.setBackground(firstColor);
                this.setBorder(javax.swing.BorderFactory.createLineBorder(secondColor));
            }
            
        } catch (InterruptedException ex) {
            MainFrame.getLogger().log(Level.SEVERE, null, ex);
        }
    }
    
    public void InitComponents(){
        try {

            jLabelNombreTarea.setText(MainFrame.getFaker().book().title());
            jLabelFechaDeEntrega.setText(MainFrame.getFaker().backToTheFuture().date());
            jLabelTipoDeTarea.setText(MainFrame.getFaker().book().genre());
            jLabelClaseDeLaTarea.setText(MainFrame.getFaker().book().publisher());
            jLabelEstado.setText((MainFrame.getFaker().bool().bool()) ? "Entregada" : "No Entregada Aún");
            
            System.out.println("Homework ID: " + this.id + " -> Getting Image From https://loremflickr.com/644/720/sunset,beach/all");
            URL imageURL = new URL("https://loremflickr.com/164/164/sunset,beach/all");
            Image getImage = ImageIO.read(imageURL);
            ImageIcon groupIcon = new ImageIcon(getImage);
            jLabelFotoTarea.setIcon(groupIcon);
            SetColors(getImage);
            homeworkPanel = new Student_Homework_Panel(jLabelNombreTarea.getText(), firstColor, secondColor, thirdColor, fontColor, secondFontColor, thirdFontColor);
            Student_Dashboard_Panel.addView(homeworkPanel, id);
            getImage.flush();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Student_Box_Homework_Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student_Box_Homework_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelClaseDeLaTarea;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFechaDeEntrega;
    private javax.swing.JLabel jLabelFotoTarea;
    private javax.swing.JLabel jLabelNombreTarea;
    private javax.swing.JLabel jLabelTipoDeTarea;
    // End of variables declaration//GEN-END:variables
}
