/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import java.awt.Color;

/**
 *
 * @author LENOVO
 */
public class Curso_Tablero_Estudiante_Panel extends javax.swing.JPanel{

    
    public Curso_Tablero_Estudiante_Panel(
        Color _segundo_Color,
        Color _segundo_Color_Fuente) {
        
        initComponents();
     
        titulo_JLabel.setBackground(_segundo_Color);
        titulo_JLabel.setForeground(_segundo_Color_Fuente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 1100));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 1100));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 68));
        titulo_JPanel.setOpaque(false);
        titulo_JPanel.setPreferredSize(new java.awt.Dimension(1080, 68));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        titulo_JLabel.setText("Tablero");
        titulo_JLabel.setOpaque(true);

        javax.swing.GroupLayout titulo_JPanelLayout = new javax.swing.GroupLayout(titulo_JPanel);
        titulo_JPanel.setLayout(titulo_JPanelLayout);
        titulo_JPanelLayout.setHorizontalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(titulo_JPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        titulo_JPanelLayout.setVerticalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(titulo_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        add(titulo_JPanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel titulo_JLabel;
    private javax.swing.JPanel titulo_JPanel;
    // End of variables declaration//GEN-END:variables

}
