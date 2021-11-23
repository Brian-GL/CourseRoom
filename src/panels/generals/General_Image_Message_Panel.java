/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.generals;

import data.interfaces.Limpieza_Interface;
import java.awt.Image;
import javax.swing.ImageIcon;
import main.MainFrame;

/**
 *
 * @author LENOVO
 */
public class General_Image_Message_Panel extends javax.swing.JPanel implements Limpieza_Interface{

    public General_Image_Message_Panel(String sender, String date, Image image, String filename) {
        initComponents();
        jLabelDate.setText(date);
        jLabelSender.setText(sender);
        
        jLabelDate.setForeground(MainFrame.getFontColor());
        jLabelDate.setBackground(MainFrame.getFirstColor());
        jLabelSender.setForeground(MainFrame.getFontColor());
        jLabelSender.setBackground(MainFrame.getFirstColor());
        
        jLabelImageMessage.setBackground(MainFrame.getSecondColor());
        jLabelImageMessage.setToolTipText(filename);
        
        Image resizedImage =  image.getScaledInstance(789, 500, Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(resizedImage);
        jLabelImageMessage.setIcon(icon);
        image.flush();
        image = null;
        resizedImage.flush();
        resizedImage = null;
        icon = null;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImageMessage = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelSender = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 535));
        setMinimumSize(new java.awt.Dimension(800, 535));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 535));

        jLabelImageMessage.setBackground(java.awt.Color.black);
        jLabelImageMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImageMessage.setMaximumSize(new java.awt.Dimension(789, 500));
        jLabelImageMessage.setMinimumSize(new java.awt.Dimension(789, 500));
        jLabelImageMessage.setOpaque(true);
        jLabelImageMessage.setPreferredSize(new java.awt.Dimension(789, 500));

        jLabelDate.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDate.setText("MIÉRCOLES 30 DE SEPTIEMBRE DE 20201 - 22:22 A.M");
        jLabelDate.setToolTipText("Fecha & Hora Del Mensaje");
        jLabelDate.setOpaque(true);

        jLabelSender.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelSender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSender.setText("OALDPAMDOLAMDONALODP");
        jLabelSender.setToolTipText("Emisor Del Mensaje");
        jLabelSender.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImageMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelSender))
                .addGap(0, 0, 0)
                .addComponent(jLabelImageMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelImageMessage;
    private javax.swing.JLabel jLabelSender;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Limpiar() {
    }
}
