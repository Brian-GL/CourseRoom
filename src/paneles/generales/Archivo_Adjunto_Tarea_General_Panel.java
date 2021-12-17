/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.generales;

import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import java.awt.Color;
import javax.swing.SwingUtilities;
import main.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Archivo_Adjunto_Tarea_General_Panel extends javax.swing.JPanel implements Limpieza_Interface,Componentes_Interface{

    private Color segundo_Color, segundo_Color_Fuente, tercer_Color, tercer_Color_Fuente;
    
    public Archivo_Adjunto_Tarea_General_Panel(
            Color _segundo_Color, 
            Color _segundo_Color_Fuente,
            Color _tercer_Color,
            Color _tercer_Color_Fuente) {
        
        initComponents();
        
        segundo_Color = _segundo_Color;
        segundo_Color_Fuente = _segundo_Color_Fuente;
        tercer_Color = _tercer_Color;
        tercer_Color_Fuente = _tercer_Color_Fuente;
       
        Iniciar_Componentes();
        
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
        icono_JLabel = new javax.swing.JLabel();
        descargar_JButton = new javax.swing.JButton();
        abrir_JButton = new javax.swing.JButton();
        archivo_JScrollPane = new javax.swing.JScrollPane();
        archivo_JTextPane = new javax.swing.JTextPane();

        setMaximumSize(new java.awt.Dimension(325, 88));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(325, 88));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_JPanel.setMaximumSize(new java.awt.Dimension(338, 76));

        icono_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/file.png"))); // NOI18N

        descargar_JButton.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        descargar_JButton.setText("Descargar");
        descargar_JButton.setToolTipText("Descargar Archivo");
        descargar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descargar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                descargar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                descargar_JButtonMouseExited(evt);
            }
        });

        abrir_JButton.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        abrir_JButton.setText("Abrir");
        abrir_JButton.setToolTipText("Abrir Archivo");
        abrir_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrir_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abrir_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abrir_JButtonMouseExited(evt);
            }
        });

        archivo_JScrollPane.setBorder(null);
        archivo_JScrollPane.setOpaque(false);
        archivo_JScrollPane.setRequestFocusEnabled(false);
        archivo_JScrollPane.setVerifyInputWhenFocusTarget(false);
        archivo_JScrollPane.setWheelScrollingEnabled(false);

        archivo_JTextPane.setEditable(false);
        archivo_JTextPane.setBorder(null);
        archivo_JTextPane.setContentType("text/html"); // NOI18N
        archivo_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        archivo_JTextPane.setText("");
        archivo_JTextPane.setFocusCycleRoot(false);
        archivo_JTextPane.setFocusable(false);
        archivo_JTextPane.setOpaque(false);
        archivo_JTextPane.setRequestFocusEnabled(false);
        archivo_JTextPane.setVerifyInputWhenFocusTarget(false);
        archivo_JScrollPane.setViewportView(archivo_JTextPane);

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(archivo_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abrir_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descargar_JButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(contenido_JPanelLayout.createSequentialGroup()
                            .addComponent(abrir_JButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descargar_JButton))
                        .addComponent(archivo_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(icono_JLabel)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void abrir_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrir_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_abrir_JButtonMouseClicked

    private void descargar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descargar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_descargar_JButtonMouseClicked

    private void abrir_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrir_JButtonMouseEntered
        // TODO add your handling code here:
        abrir_JButton.setBackground(tercer_Color);
        abrir_JButton.setForeground(tercer_Color_Fuente);
        
    }//GEN-LAST:event_abrir_JButtonMouseEntered

    private void abrir_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrir_JButtonMouseExited
        // TODO add your handling code here:
        abrir_JButton.setBackground(segundo_Color);
        abrir_JButton.setForeground(segundo_Color_Fuente);
    }//GEN-LAST:event_abrir_JButtonMouseExited

    private void descargar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descargar_JButtonMouseEntered
        // TODO add your handling code here:
        descargar_JButton.setBackground(tercer_Color);
        descargar_JButton.setForeground(tercer_Color_Fuente);
    }//GEN-LAST:event_descargar_JButtonMouseEntered

    private void descargar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descargar_JButtonMouseExited
        // TODO add your handling code here:
        descargar_JButton.setBackground(segundo_Color);
        descargar_JButton.setForeground(segundo_Color_Fuente);
    }//GEN-LAST:event_descargar_JButtonMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrir_JButton;
    private javax.swing.JScrollPane archivo_JScrollPane;
    private javax.swing.JTextPane archivo_JTextPane;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JButton descargar_JButton;
    private javax.swing.JLabel icono_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        archivo_JScrollPane.getViewport().setOpaque(false);
        archivo_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        archivo_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        String informacion_Archivo = CourseRoom.Faker().file().fileName();
        archivo_JTextPane.setText(CourseRoom.Formato_HTML_Centro_Izquierda(informacion_Archivo));
        
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        
        contenido_JPanel.setBackground(tercer_Color);
        contenido_JPanel.setForeground(tercer_Color_Fuente);
        
        archivo_JTextPane.setForeground(tercer_Color_Fuente);
        
        abrir_JButton.setBackground(segundo_Color);
        abrir_JButton.setForeground(segundo_Color_Fuente);
        
        descargar_JButton.setBackground(segundo_Color);
        descargar_JButton.setForeground(segundo_Color_Fuente);
        
    }

    @Override
    public void Limpiar() {
        segundo_Color =  segundo_Color_Fuente =  tercer_Color =  tercer_Color_Fuente = null;
    }
}
