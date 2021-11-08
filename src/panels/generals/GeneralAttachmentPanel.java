/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.generals;

import courseroom.MainFrame;
import java.awt.Color;

/**
 *
 * @author LENOVO
 */
public class GeneralAttachmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form GeneralAttachmentPanel
     */
    public GeneralAttachmentPanel(Color fontColor, Color secondColor, Color secondFontColor) {
        initComponents();
        jScrollPaneAttachmentName.getViewport().setOpaque(false);
        jTextAreaAttachmentName.setForeground(fontColor);
        jButtonDownload.setForeground(secondFontColor);
        jButtonOpen.setForeground(secondFontColor);
        jButtonDownload.setBackground(secondColor);
        jButtonOpen.setBackground(secondColor);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcon = new javax.swing.JLabel();
        jButtonDownload = new javax.swing.JButton();
        jButtonOpen = new javax.swing.JButton();
        jScrollPaneAttachmentName = new javax.swing.JScrollPane();
        jTextAreaAttachmentName = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(300, 60));
        setMinimumSize(new java.awt.Dimension(300, 60));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(300, 60));

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/file.png"))); // NOI18N
        jLabelIcon.setPreferredSize(new java.awt.Dimension(58, 58));

        jButtonDownload.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jButtonDownload.setText("Descargar");

        jButtonOpen.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jButtonOpen.setText("Abrir");

        jScrollPaneAttachmentName.setBorder(null);
        jScrollPaneAttachmentName.setOpaque(false);

        jTextAreaAttachmentName.setEditable(false);
        jTextAreaAttachmentName.setColumns(10);
        jTextAreaAttachmentName.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jTextAreaAttachmentName.setRows(1);
        jTextAreaAttachmentName.setText("Nombre Del Archivo");
        jTextAreaAttachmentName.setBorder(null);
        jTextAreaAttachmentName.setOpaque(false);
        jScrollPaneAttachmentName.setViewportView(jTextAreaAttachmentName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addComponent(jButtonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDownload))
                    .addComponent(jScrollPaneAttachmentName))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneAttachmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonOpen)
                            .addComponent(jButtonDownload))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDownload;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JScrollPane jScrollPaneAttachmentName;
    private javax.swing.JTextArea jTextAreaAttachmentName;
    // End of variables declaration//GEN-END:variables
}
