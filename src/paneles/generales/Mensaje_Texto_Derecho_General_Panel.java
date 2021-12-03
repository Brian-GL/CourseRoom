/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.generales;
import java.awt.Color;
import main.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Mensaje_Texto_Derecho_General_Panel extends javax.swing.JPanel{

    
    public Mensaje_Texto_Derecho_General_Panel(
            String emisor, 
            String fecha,
            String mensaje, 
            Color _tercer_Color,
            Color _tercer_Color_Fuente) {
        
        initComponents();
        
        
        fecha_JLabel.setText(fecha);
        emisor_JLabel.setText(emisor);
        mensaje_JTextPane.setText(CourseRoom.Formato_HTML_Central(mensaje));
        
        contenido_JPanel.setBackground(_tercer_Color);
        contenido_JPanel.setForeground(_tercer_Color_Fuente);

        fecha_JLabel.setForeground(_tercer_Color_Fuente);
        emisor_JLabel.setForeground(_tercer_Color_Fuente);
        mensaje_JTextPane.setForeground(_tercer_Color_Fuente);
        mensaje_JScrollPane.setForeground(_tercer_Color_Fuente);
        
        mensaje_JScrollPane.getViewport().setOpaque(false);
        mensaje_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        mensaje_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido_JPanel = new javax.swing.JPanel();
        fecha_JLabel = new javax.swing.JLabel();
        emisor_JLabel = new javax.swing.JLabel();
        mensaje_JScrollPane = new javax.swing.JScrollPane();
        mensaje_JTextPane = new javax.swing.JTextPane();
        auxiliar_JPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(32767, 224));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 224));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fecha_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        fecha_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fecha_JLabel.setToolTipText("Fecha & Hora Del Mensaje");
        fecha_JLabel.setFocusable(false);
        fecha_JLabel.setMaximumSize(new java.awt.Dimension(413, 25));
        fecha_JLabel.setPreferredSize(new java.awt.Dimension(467, 25));
        fecha_JLabel.setRequestFocusEnabled(false);
        fecha_JLabel.setVerifyInputWhenFocusTarget(false);

        emisor_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        emisor_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emisor_JLabel.setToolTipText("Emisor Del Mensaje");
        emisor_JLabel.setFocusable(false);
        emisor_JLabel.setPreferredSize(new java.awt.Dimension(467, 0));
        emisor_JLabel.setRequestFocusEnabled(false);
        emisor_JLabel.setVerifyInputWhenFocusTarget(false);

        mensaje_JScrollPane.setBorder(null);
        mensaje_JScrollPane.setFocusTraversalPolicyProvider(true);
        mensaje_JScrollPane.setOpaque(false);
        mensaje_JScrollPane.setPreferredSize(new java.awt.Dimension(467, 0));

        mensaje_JTextPane.setEditable(false);
        mensaje_JTextPane.setBorder(null);
        mensaje_JTextPane.setContentType("text/html"); // NOI18N
        mensaje_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        mensaje_JTextPane.setText("");
        mensaje_JTextPane.setFocusTraversalPolicyProvider(true);
        mensaje_JTextPane.setOpaque(false);
        mensaje_JScrollPane.setViewportView(mensaje_JTextPane);

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mensaje_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emisor_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emisor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensaje_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        auxiliar_JPanel.setOpaque(false);

        javax.swing.GroupLayout auxiliar_JPanelLayout = new javax.swing.GroupLayout(auxiliar_JPanel);
        auxiliar_JPanel.setLayout(auxiliar_JPanelLayout);
        auxiliar_JPanelLayout.setHorizontalGroup(
            auxiliar_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        auxiliar_JPanelLayout.setVerticalGroup(
            auxiliar_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(auxiliar_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(auxiliar_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel auxiliar_JPanel;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel emisor_JLabel;
    private javax.swing.JLabel fecha_JLabel;
    private javax.swing.JScrollPane mensaje_JScrollPane;
    private javax.swing.JTextPane mensaje_JTextPane;
    // End of variables declaration//GEN-END:variables


}