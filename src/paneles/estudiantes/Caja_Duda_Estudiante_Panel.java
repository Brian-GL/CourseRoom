/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import java.awt.Color;
import javax.swing.SwingUtilities;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import javax.swing.Icon;
import main.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Caja_Duda_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    private Color primer_Color, segundo_Color, tercer_Color,primer_Color_Fuente, segundo_Color_Fuente, tercer_Color_Fuente;
    private String id;
    private Duda_Estudiante_Panel duda_Estudiante_Panel;
    
    
    public Caja_Duda_Estudiante_Panel(String _id,
            String duda, 
            String descripcion_Duda,
            String preguntador_Nombre,
            String fecha,
            Icon preguntador_Icono,
            Color _primer_Color, 
            Color _primer_Color_Fuente, 
            Color _segundo_Color,
            Color _segundo_Color_Fuente,
            Color _tercer_Color,
            Color _tercer_Color_Fuente) {
        initComponents();
        
        this.id = _id;
        
        primer_Color = CourseRoom.Primer_Color();
        primer_Color_Fuente = CourseRoom.Primer_Color_Fuente();
        
        segundo_Color = CourseRoom.Segundo_Color();
        segundo_Color_Fuente = CourseRoom.Segundo_Color_Fuente();
        
        tercer_Color = CourseRoom.Tercer_Color();
        tercer_Color_Fuente = CourseRoom.Tercer_Color_Fuente();
        
        duda_JTextPane.setText(duda);
        preguntador_JLabel.setText(preguntador_Nombre);
        fecha_JLabel.setText(fecha);
        estatus_JLabel.setText("Abierta");
        
        imagen_Preguntador_JLabel.setIcon(preguntador_Icono);
        
        duda_Estudiante_Panel = new Duda_Estudiante_Panel(duda_JTextPane.getText(), descripcion_Duda,preguntador_JLabel.getText(),
           fecha_JLabel.getText(),imagen_Preguntador_JLabel.getIcon(),primer_Color, primer_Color_Fuente, segundo_Color, segundo_Color_Fuente, 
                   tercer_Color, tercer_Color_Fuente);
            
        
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
        imagen_Preguntador_JLabel = new javax.swing.JLabel();
        fecha_JLabel = new javax.swing.JLabel();
        preguntador_JLabel = new javax.swing.JLabel();
        estatus_JLabel = new javax.swing.JLabel();
        duda_JScrollPane = new javax.swing.JScrollPane();
        duda_JTextPane = new javax.swing.JTextPane();

        setMaximumSize(new java.awt.Dimension(32767, 136));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 136));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imagen_Preguntador_JLabel.setToolTipText("Imagen Del Curso");
        imagen_Preguntador_JLabel.setMaximumSize(new java.awt.Dimension(164, 164));
        imagen_Preguntador_JLabel.setMinimumSize(new java.awt.Dimension(164, 164));
        imagen_Preguntador_JLabel.setPreferredSize(new java.awt.Dimension(164, 164));
        imagen_Preguntador_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen_Preguntador_JLabelMouseClicked(evt);
            }
        });

        fecha_JLabel.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        fecha_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fecha_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/circular-clock.png"))); // NOI18N
        fecha_JLabel.setToolTipText("Fecha De Entrega");

        preguntador_JLabel.setFont(new java.awt.Font("Gadugi", 2, 16)); // NOI18N
        preguntador_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/problem.png"))); // NOI18N
        preguntador_JLabel.setToolTipText("Tipo De Tarea");

        estatus_JLabel.setFont(new java.awt.Font("Gadugi", 2, 16)); // NOI18N
        estatus_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/homework_3.png"))); // NOI18N
        estatus_JLabel.setToolTipText("Estatus De La Tarea");

        duda_JScrollPane.setBorder(null);
        duda_JScrollPane.setOpaque(false);

        duda_JTextPane.setEditable(false);
        duda_JTextPane.setBorder(null);
        duda_JTextPane.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        duda_JTextPane.setOpaque(false);
        duda_JScrollPane.setViewportView(duda_JTextPane);

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen_Preguntador_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(fecha_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estatus_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                    .addComponent(preguntador_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(duda_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen_Preguntador_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(duda_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preguntador_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estatus_JLabel)
                            .addComponent(fecha_JLabel))))
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

    private void imagen_Preguntador_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen_Preguntador_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Estudiante_Panel.Mostrar_Vista(this.id);
        }
    }//GEN-LAST:event_imagen_Preguntador_JLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JScrollPane duda_JScrollPane;
    private javax.swing.JTextPane duda_JTextPane;
    private javax.swing.JLabel estatus_JLabel;
    private javax.swing.JLabel fecha_JLabel;
    private javax.swing.JLabel imagen_Preguntador_JLabel;
    private javax.swing.JLabel preguntador_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {

        duda_JScrollPane.getViewport().setOpaque(false);
        duda_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        duda_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);


        Colorear_Componentes();

        Tablero_Estudiante_Panel.Agregar_Vista(duda_Estudiante_Panel, id);
    }

    @Override
    public void Colorear_Componentes() {
        estatus_JLabel.setForeground(primer_Color_Fuente);
        fecha_JLabel.setForeground(primer_Color_Fuente);
        duda_JTextPane.setForeground(primer_Color_Fuente);
        preguntador_JLabel.setForeground(primer_Color_Fuente);

        contenido_JPanel.setBackground(primer_Color);
        contenido_JPanel.setForeground(primer_Color_Fuente);
    }
    
     @Override
    public void Limpiar() {
        primer_Color = segundo_Color = tercer_Color =primer_Color_Fuente = segundo_Color_Fuente = tercer_Color_Fuente = null;
        id = null;
        duda_Estudiante_Panel.Limpiar();
    }
}
