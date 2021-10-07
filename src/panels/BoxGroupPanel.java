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
import javax.swing.border.LineBorder;

/**
 *
 * @author LENOVO
 */
public class BoxGroupPanel extends javax.swing.JPanel implements MainInterface{

    private Image groupImage;
    /**
     * Creates new form BoxGroupPanel
     */
    public BoxGroupPanel(String route) {
        initComponents();
        try {
            URL imageURL = new URL(route);
            groupImage = ImageIO.read(imageURL).getScaledInstance(182,182,Image.SCALE_SMOOTH);
            ImageIcon chatIcon = new ImageIcon(groupImage);
            jLabelFotoGrupo.setIcon(chatIcon);
            setColors(groupImage);
            chatIcon = null;
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

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(32767, 198));
        setMinimumSize(new java.awt.Dimension(649, 198));
        setPreferredSize(new java.awt.Dimension(649, 198));

        jLabelFotoGrupo.setMaximumSize(new java.awt.Dimension(182, 182));
        jLabelFotoGrupo.setMinimumSize(new java.awt.Dimension(182, 182));
        jLabelFotoGrupo.setPreferredSize(new java.awt.Dimension(182, 182));

        jLabelNombreGrupo.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelNombreGrupo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombreGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/group_1.png"))); // NOI18N
        jLabelNombreGrupo.setText("Nombre Del Grupo");

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
                .addGap(10, 10, 10)
                .addComponent(jLabelFotoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNumeroIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelChatDelGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFotoGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelClaseDelGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUltimaActualizacion)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelChatDelGrupo)
                            .addComponent(jLabelNumeroIntegrantes))))
                .addContainerGap(8, Short.MAX_VALUE))
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
                this.setBorder(javax.swing.BorderFactory.createLineBorder(fontColor));

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
        groupImage.flush();
        groupImage = null;
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
