/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.github.javafaker.Faker;
import data.collections.PairDoublyLinkedList;
import data.interfaces.MainInterface;
import data.structures.Pair;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.RenderingHints;
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

/**
 *
 * @author LENOVO
 */
public class BoxHomeworkPanel extends javax.swing.JPanel implements MainInterface{

    private Image homeworkImage;
    private int id;
    /**
     * Creates new form BoxHomeworkPanel
     */
    public BoxHomeworkPanel(int _id) {
        initComponents();
         try {
            Faker faker = new Faker(new Locale("es","MX"));
            jLabelNombreTarea.setText(faker.book().title());
            jLabelFechaDeEntrega.setText(faker.backToTheFuture().date());
            jLabelTipoDeTarea.setText(faker.book().genre());
            jLabelClaseDeLaTarea.setText(faker.book().publisher());
            jLabelEstado.setText((faker.bool().bool()) ? "Entregada" : "No Entregada Aún");
            this.id = _id;
            System.out.println("Homework ID: "+_id+" -> Getting Image From https://loremflickr.com/644/720/sunset,beach/all");
            URL imageURL = new URL("https://loremflickr.com/644/720/sunset,beach/all");
            Image getImage = ImageIO.read(imageURL);
            homeworkImage = getImage.getScaledInstance(164,164,Image.SCALE_SMOOTH);
            ImageIcon groupIcon = new ImageIcon(homeworkImage);
            jLabelFotoTarea.setIcon(groupIcon);
            setColors(getImage);
            getImage.flush();
            getImage = null;
            groupIcon = null;
            //imageURL = null;
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

        jLabelFotoTarea = new javax.swing.JLabel();
        jLabelClaseDeLaTarea = new javax.swing.JLabel();
        jLabelNombreTarea = new javax.swing.JLabel();
        jLabelFechaDeEntrega = new javax.swing.JLabel();
        jLabelTipoDeTarea = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 174));
        setMinimumSize(new java.awt.Dimension(1085, 174));
        setPreferredSize(new java.awt.Dimension(1085, 174));

        jLabelFotoTarea.setMaximumSize(new java.awt.Dimension(164, 164));
        jLabelFotoTarea.setMinimumSize(new java.awt.Dimension(164, 164));
        jLabelFotoTarea.setPreferredSize(new java.awt.Dimension(164, 164));

        jLabelClaseDeLaTarea.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelClaseDeLaTarea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelClaseDeLaTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/course.png"))); // NOI18N
        jLabelClaseDeLaTarea.setText("Clase Que Pertenece La Tarea");

        jLabelNombreTarea.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelNombreTarea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombreTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/homework_2.png"))); // NOI18N
        jLabelNombreTarea.setText("Nombre De La Tarea");

        jLabelFechaDeEntrega.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jLabelFechaDeEntrega.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaDeEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/homework_1.png"))); // NOI18N
        jLabelFechaDeEntrega.setText("Fecha De Entrega");

        jLabelTipoDeTarea.setFont(new java.awt.Font("Gadugi", 2, 16)); // NOI18N
        jLabelTipoDeTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/writing.png"))); // NOI18N
        jLabelTipoDeTarea.setText("Tipo De Tarea");

        jLabelEstado.setFont(new java.awt.Font("Gadugi", 2, 16)); // NOI18N
        jLabelEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/homework_3.png"))); // NOI18N
        jLabelEstado.setText("Estado De La Tarea");

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

    
    @Override
    public void setColors(Image image){
        
        try {
            Random colorRandom = new Random(System.currentTimeMillis());
            int maximum = 0;
            Color firstColor = Color.BLACK;
            PairDoublyLinkedList<Integer, Color> colorList = new PairDoublyLinkedList<>();
            PixelGrabber pg = new PixelGrabber(image, 0, 0, -1, -1, false);
            int large = (image.getWidth(null)/2);
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

               
                int red = firstColor.getRed();
                Color fontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                
                colorList.clear();

                
                jLabelEstado.setForeground(fontColor);
                jLabelClaseDeLaTarea.setForeground(fontColor);
                jLabelFechaDeEntrega.setForeground(fontColor);
                jLabelNombreTarea.setForeground(fontColor);
                jLabelTipoDeTarea.setForeground(fontColor);
                
                this.setBackground(firstColor);

                fontColor = null;
                colorRandom = null;
                colorList = null;
                firstColor = null;
                pg = null;
                pixels = null;
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(MusicPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void dispose(){
        homeworkImage.flush();
        homeworkImage = null;
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
