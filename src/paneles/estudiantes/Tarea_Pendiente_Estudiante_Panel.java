/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import main.CourseRoom_Frame;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;

/**
 *
 * @author LENOVO
 */
public class Tarea_Pendiente_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface, Limpieza_Interface{
    
    private Color primer_Color,primer_Color_Fuente,segundo_Color, segundo_Color_Fuente;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Tarea_Pendiente_Estudiante_Panel(
            Icon member_Icon, 
            Color _primer_Color, 
            Color _primer_Color_Fuente,
            Color _segundo_Color, 
            Color _segundo_Color_Fuente, 
            String nombre, 
            String descripcion, 
            String fecha_Terminacion, 
            String nombre_Miembro) {
        
        initComponents();
        
        primer_Color = _primer_Color;
        primer_Color_Fuente = _primer_Color_Fuente;
        segundo_Color = _segundo_Color;
        segundo_Color_Fuente = _segundo_Color_Fuente;
        
        nombre_JLabel.setText(nombre);
        descripcion_JLabel.setText(CourseRoom.Formato_HTML_Centro(descripcion));
        fecha_Terminacion_jLabel.setText(fecha_Terminacion);
        miembro_Cargo_JLabel.setIcon(member_Icon);
        miembro_Cargo_JLabel.setToolTipText(CourseRoom.Concatenar("Miembro A Cargo: ",nombre_Miembro));
        
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
        miembro_Cargo_JLabel = new javax.swing.JLabel();
        nombre_JLabel = new javax.swing.JLabel();
        fecha_Terminacion_jLabel = new javax.swing.JLabel();
        estatus_JToggleButton = new javax.swing.JToggleButton();
        descripcion_JLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 178));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(717, 178));

        miembro_Cargo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miembro_Cargo_JLabel.setToolTipText("");
        miembro_Cargo_JLabel.setMaximumSize(new java.awt.Dimension(130, 130));
        miembro_Cargo_JLabel.setMinimumSize(new java.awt.Dimension(130, 130));
        miembro_Cargo_JLabel.setPreferredSize(new java.awt.Dimension(130, 130));

        nombre_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        nombre_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombre_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/schedule.png"))); // NOI18N
        nombre_JLabel.setText(" ");
        nombre_JLabel.setToolTipText("Nombre Del Pendiente A Realizar");

        fecha_Terminacion_jLabel.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        fecha_Terminacion_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/clock.png"))); // NOI18N
        fecha_Terminacion_jLabel.setToolTipText("Fecha Propuesta Para Terminar El Pendiente");

        estatus_JToggleButton.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        estatus_JToggleButton.setText("Pendiente");
        estatus_JToggleButton.setToolTipText("Estatus Del Pendiente");
        estatus_JToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estatus_JToggleButtonMouseClicked(evt);
            }
        });

        descripcion_JLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        descripcion_JLabel.setToolTipText("Descipción Del Pendiente");

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addComponent(fecha_Terminacion_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descripcion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(miembro_Cargo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(estatus_JToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(nombre_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(miembro_Cargo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estatus_JToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_Terminacion_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void estatus_JToggleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estatus_JToggleButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
            int resultado = JOptionPane.showConfirmDialog(this, "Mensaje De Confirmación", "Esta Segur@ De Terminar La Tarea Pendiente", JOptionPane.QUESTION_MESSAGE);
            
            if(resultado == JOptionPane.OK_OPTION){
                estatus_JToggleButton.setText("Terminado");
                estatus_JToggleButton.setEnabled(false);
            }
               
        }
    }//GEN-LAST:event_estatus_JToggleButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel descripcion_JLabel;
    private javax.swing.JToggleButton estatus_JToggleButton;
    private javax.swing.JLabel fecha_Terminacion_jLabel;
    private javax.swing.JLabel miembro_Cargo_JLabel;
    private javax.swing.JLabel nombre_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        Colorear_Componentes();
    }
    
    @Override
    public void Colorear_Componentes() {
        
        contenido_JPanel.setBackground(primer_Color);
        nombre_JLabel.setForeground(primer_Color_Fuente);
        descripcion_JLabel.setForeground(segundo_Color_Fuente);
        fecha_Terminacion_jLabel.setForeground(primer_Color_Fuente);
        estatus_JToggleButton.setForeground(segundo_Color_Fuente);
        estatus_JToggleButton.setBackground(segundo_Color);
        
    }

    @Override
    public void Limpiar() {
        primer_Color = primer_Color_Fuente = segundo_Color =  segundo_Color_Fuente = null;
    }

    
}