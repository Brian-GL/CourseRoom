/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import interfaces.Componentes_Interface;
import main.CourseRoom;
import java.io.File;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class Archivo_Subido_Tarea_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface{

    private File archivo_Subido;
    
    public Archivo_Subido_Tarea_Estudiante_Panel(
            File archivo) {
        initComponents();
        
        archivo_Subido = archivo;
        
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
        remover_JButton = new javax.swing.JButton();
        archivo_JScrollPane = new javax.swing.JScrollPane();
        archivo_JTextPane = new javax.swing.JTextPane();

        setMaximumSize(new java.awt.Dimension(32767, 98));
        setOpaque(false);

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_JPanel.setMaximumSize(new java.awt.Dimension(32767, 86));
        contenido_JPanel.setRequestFocusEnabled(false);
        contenido_JPanel.setVerifyInputWhenFocusTarget(false);

        icono_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/submit.png"))); // NOI18N

        remover_JButton.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        remover_JButton.setText("X");
        remover_JButton.setToolTipText("<html> <h3>Remover archivo</h3> </html>");
        remover_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remover_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remover_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remover_JButtonMouseExited(evt);
            }
        });

        archivo_JScrollPane.setBorder(null);

        archivo_JTextPane.setEditable(false);
        archivo_JTextPane.setBorder(null);
        archivo_JTextPane.setContentType("text/html"); // NOI18N
        archivo_JTextPane.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        archivo_JTextPane.setText("");
        archivo_JTextPane.setToolTipText("<html> <h3>Nombre del archivo subido</h3> </html>");
        archivo_JTextPane.setFocusCycleRoot(false);
        archivo_JTextPane.setFocusable(false);
        archivo_JTextPane.setRequestFocusEnabled(false);
        archivo_JTextPane.setVerifyInputWhenFocusTarget(false);
        archivo_JScrollPane.setViewportView(archivo_JTextPane);

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(archivo_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remover_JButton)
                    .addComponent(icono_JLabel))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(archivo_JScrollPane)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(icono_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remover_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void remover_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remover_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.setVisible(false);
        }
    }//GEN-LAST:event_remover_JButtonMouseClicked

    private void remover_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remover_JButtonMouseEntered
        // TODO add your handling code here:
        remover_JButton.setForeground(CourseRoom.Primer_Color_Fuente());
        remover_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_remover_JButtonMouseEntered

    private void remover_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remover_JButtonMouseExited
        // TODO add your handling code here:
        remover_JButton.setForeground(CourseRoom.Segundo_Color_Fuente());
        remover_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_remover_JButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane archivo_JScrollPane;
    private javax.swing.JTextPane archivo_JTextPane;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel icono_JLabel;
    private javax.swing.JButton remover_JButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        String informacion_Archivo = archivo_Subido.getName();
        archivo_JTextPane.setText(CourseRoom.Formato_HTML_Central(informacion_Archivo));
        archivo_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        archivo_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        archivo_JTextPane.setForeground(CourseRoom.Primer_Color_Fuente());
        archivo_JTextPane.setBackground(CourseRoom.Primer_Color());
        
        remover_JButton.setForeground(CourseRoom.Segundo_Color_Fuente());
        remover_JButton.setBackground(CourseRoom.Segundo_Color());
    }
    
    
}
