/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames.profesores;

import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class Calificar_Profesor_Frame extends javax.swing.JDialog implements Componentes_Interface{

    
    public Calificar_Profesor_Frame() {
        
        initComponents();
        
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
        calificar_JButton = new javax.swing.JButton();
        cerrar_JButton = new javax.swing.JButton();
        calificacion_JFormattedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(460, 140));
        setMinimumSize(new java.awt.Dimension(460, 140));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(460, 140));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new java.awt.CardLayout());

        contenido_JPanel.setMaximumSize(new java.awt.Dimension(800, 140));
        contenido_JPanel.setMinimumSize(new java.awt.Dimension(800, 140));
        contenido_JPanel.setPreferredSize(new java.awt.Dimension(800, 140));

        calificar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/quality.png"))); // NOI18N
        calificar_JButton.setText("Calificar");
        calificar_JButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ((ImageIcon)calificar_JButton.getIcon()).getImage().flush();
        calificar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calificar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calificar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calificar_JButtonMouseExited(evt);
            }
        });

        cerrar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/close.png"))); // NOI18N
        cerrar_JButton.setText("Cerrar");
        cerrar_JButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ((ImageIcon)cerrar_JButton.getIcon()).getImage().flush();
        cerrar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseExited(evt);
            }
        });

        calificacion_JFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));
        calificacion_JFormattedTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calificacion_JFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(cerrar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calificar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calificacion_JFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calificar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(contenido_JPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calificar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calificar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(calificacion_JFormattedTextField.getText() != null){
                if(!calificacion_JFormattedTextField.getText().isBlank() && !calificacion_JFormattedTextField.getText().isEmpty()){

                    

                    this.dispose();


                }
            }
        }
    }//GEN-LAST:event_calificar_JButtonMouseClicked

    private void calificar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calificar_JButtonMouseEntered
        // TODO add your handling code here:
        calificar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        calificar_JButton.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
    }//GEN-LAST:event_calificar_JButtonMouseEntered

    private void calificar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calificar_JButtonMouseExited
        // TODO add your handling code here:
        calificar_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        calificar_JButton.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
    }//GEN-LAST:event_calificar_JButtonMouseExited

    private void cerrar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.dispose();
        }
    }//GEN-LAST:event_cerrar_JButtonMouseClicked

    private void cerrar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseEntered
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        cerrar_JButton.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
    }//GEN-LAST:event_cerrar_JButtonMouseEntered

    private void cerrar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseExited
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        cerrar_JButton.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
    }//GEN-LAST:event_cerrar_JButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField calificacion_JFormattedTextField;
    private javax.swing.JButton calificar_JButton;
    private javax.swing.JButton cerrar_JButton;
    private javax.swing.JPanel contenido_JPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        Font gadugi = new java.awt.Font("Segoe UI", 1, 16);
        
        calificacion_JFormattedTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Calificación (0 - 100)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Utilerias.Tercer_Color_Fuente()));
        
       
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        
        calificacion_JFormattedTextField.setBackground(CourseRoom.Utilerias.Tercer_Color());
        calificacion_JFormattedTextField.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        
        contenido_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());
        
        cerrar_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        cerrar_JButton.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
        
        calificar_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        calificar_JButton.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
               
    }
}
