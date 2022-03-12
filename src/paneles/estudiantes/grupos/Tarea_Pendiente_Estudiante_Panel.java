/*
 * Copyright (C) 2022 LENOVO
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package paneles.estudiantes.grupos;

import javax.swing.SwingUtilities;
import paneles.estudiantes.Tablero_Estudiante_Panel;
import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author LENOVO
 */
public class Tarea_Pendiente_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface{

    
    private String grupo_ID;
    /**
     * Creates new form Tarea_Pendiente_Estudiante_Panel
     */
    public Tarea_Pendiente_Estudiante_Panel(String nombre_Tarea, Image miembro_A_Cargo, 
            String nombre_Miembro_A_Cargo, String descripcion, String fecha_Creacion, String fecha_Finalizacion,
            String estatus,String _grupo_ID) {
        initComponents();
        
        titulo_JLabel.setText(nombre_Tarea);
        ImageIcon icono = new ImageIcon(miembro_A_Cargo);
        miembro_A_Cargo_JLabel.setIcon(icono);
        nombre_Miembro_A_Cargo_JLabel.setText(nombre_Miembro_A_Cargo);
        fecha_Creacion_JLabel.setText(CourseRoom.Utilerias.Formato_HTML_Central(CourseRoom.Utilerias.Concatenar("Creada El ",fecha_Creacion)));
        fecha_Finalizacion_JLabel.setText(CourseRoom.Utilerias.Formato_HTML_Central(CourseRoom.Utilerias.Concatenar("Fecha A Finalizar: ",fecha_Finalizacion)));
        descripcion_JTextPane.setText(CourseRoom.Utilerias.Formato_HTML_Izquierda(descripcion));
        
        estatus_Tarea_JComboBox.setSelectedItem(estatus);
        
        if(estatus.equals("Realizando")){
            estatus_Tarea_JComboBox.removeItemAt(0);
        }
        
        if(estatus.equals("Finalizado")){
            estatus_Tarea_JComboBox.removeItemAt(0);
        }
        
        grupo_ID = _grupo_ID;
        
        System.out.println(grupo_ID);
        
        
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

        titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        regresar_JButton = new javax.swing.JButton();
        actualizar_JButton = new javax.swing.JButton();
        miembro_A_Cargo_JLabel = new javax.swing.JLabel();
        descripcion_JScrollPane = new javax.swing.JScrollPane();
        descripcion_JTextPane = new javax.swing.JTextPane();
        nombre_Miembro_A_Cargo_JLabel = new javax.swing.JLabel();
        fecha_Creacion_JLabel = new javax.swing.JLabel();
        fecha_Finalizacion_JLabel = new javax.swing.JLabel();
        estatus_Tarea_JComboBox = new javax.swing.JComboBox<>();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 630));

        titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 72));
        titulo_JPanel.setOpaque(false);
        titulo_JPanel.setPreferredSize(new java.awt.Dimension(982, 72));

        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(818, 68));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(818, 68));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(818, 68));

        regresar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_JButton.setToolTipText("Regresar A Mis Chats");
        regresar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ((ImageIcon)regresar_JButton.getIcon()).getImage().flush();
        regresar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresar_JButtonMouseExited(evt);
            }
        });

        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/updated.png"))); // NOI18N
        actualizar_JButton.setPreferredSize(new java.awt.Dimension(32, 32));
        ((ImageIcon)actualizar_JButton.getIcon()).getImage().flush();
        actualizar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout titulo_JPanelLayout = new javax.swing.GroupLayout(titulo_JPanel);
        titulo_JPanel.setLayout(titulo_JPanelLayout);
        titulo_JPanelLayout.setHorizontalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulo_JPanelLayout.createSequentialGroup()
                .addComponent(regresar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titulo_JPanelLayout.setVerticalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulo_JPanelLayout.createSequentialGroup()
                .addGroup(titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        miembro_A_Cargo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miembro_A_Cargo_JLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        miembro_A_Cargo_JLabel.setMaximumSize(new java.awt.Dimension(400, 400));
        miembro_A_Cargo_JLabel.setMinimumSize(new java.awt.Dimension(400, 400));
        miembro_A_Cargo_JLabel.setPreferredSize(new java.awt.Dimension(400, 400));
        miembro_A_Cargo_JLabel.setToolTipText("Imagen Del Grupo");

        descripcion_JScrollPane.setBorder(null);
        descripcion_JScrollPane.setOpaque(false);

        descripcion_JTextPane.setEditable(false);
        descripcion_JTextPane.setBorder(null);
        descripcion_JTextPane.setContentType("text/html"); // NOI18N
        descripcion_JTextPane.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        descripcion_JTextPane.setText("");
        descripcion_JTextPane.setOpaque(false);
        descripcion_JScrollPane.setViewportView(descripcion_JTextPane);

        nombre_Miembro_A_Cargo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nombre_Miembro_A_Cargo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_Miembro_A_Cargo_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/computer.png"))); // NOI18N
        nombre_Miembro_A_Cargo_JLabel.setToolTipText("Curso De Proveniencia Del Grupo");
        nombre_Miembro_A_Cargo_JLabel.setOpaque(true);
        ((ImageIcon)nombre_Miembro_A_Cargo_JLabel.getIcon()).getImage().flush();

        fecha_Creacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_Creacion_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/calendar_1.png"))); // NOI18N
        fecha_Creacion_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fecha_Creacion_JLabel.setMaximumSize(new java.awt.Dimension(354, 20));
        fecha_Creacion_JLabel.setMinimumSize(new java.awt.Dimension(354, 20));
        fecha_Creacion_JLabel.setPreferredSize(new java.awt.Dimension(354, 20));
        fecha_Creacion_JLabel.setToolTipText("Fecha De Creación Del Grupo");
        ((ImageIcon)fecha_Creacion_JLabel.getIcon()).getImage().flush();

        fecha_Finalizacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_Finalizacion_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/circular-clock.png"))); // NOI18N
        fecha_Finalizacion_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fecha_Finalizacion_JLabel.setMaximumSize(new java.awt.Dimension(354, 20));
        fecha_Finalizacion_JLabel.setMinimumSize(new java.awt.Dimension(354, 20));
        fecha_Finalizacion_JLabel.setPreferredSize(new java.awt.Dimension(354, 20));
        fecha_Finalizacion_JLabel.setToolTipText("Fecha De Creación Del Grupo");
        ((ImageIcon)fecha_Finalizacion_JLabel.getIcon()).getImage().flush();

        estatus_Tarea_JComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatus_Tarea_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Realizando", "Finalizada" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha_Creacion_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fecha_Finalizacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(estatus_Tarea_JComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre_Miembro_A_Cargo_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(miembro_A_Cargo_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miembro_A_Cargo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_Miembro_A_Cargo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_Creacion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estatus_Tarea_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_Finalizacion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regresar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Estudiante_Panel.Mostrar_Vista(grupo_ID);
        }
    }//GEN-LAST:event_regresar_JButtonMouseClicked

    private void regresar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
    }//GEN-LAST:event_regresar_JButtonMouseEntered

    private void regresar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseExited
        // TODO add your handling code here:
        regresar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_regresar_JButtonMouseExited

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

        }
    }//GEN-LAST:event_actualizar_JButtonMouseClicked

    private void actualizar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseEntered
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseEntered

    private void actualizar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseExited
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JScrollPane descripcion_JScrollPane;
    private javax.swing.JTextPane descripcion_JTextPane;
    private javax.swing.JComboBox<String> estatus_Tarea_JComboBox;
    private javax.swing.JLabel fecha_Creacion_JLabel;
    private javax.swing.JLabel fecha_Finalizacion_JLabel;
    private javax.swing.JLabel miembro_A_Cargo_JLabel;
    private javax.swing.JLabel nombre_Miembro_A_Cargo_JLabel;
    private javax.swing.JButton regresar_JButton;
    private javax.swing.JLabel titulo_JLabel;
    private javax.swing.JPanel titulo_JPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        descripcion_JScrollPane.getViewport().setOpaque(false);
        descripcion_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        descripcion_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        
        titulo_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());
        
        titulo_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        titulo_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        
        regresar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        
        Font fuente = new Font("Segoe UI", 1, 18);
        LineBorder borde_Linea = new LineBorder(CourseRoom.Utilerias.Tercer_Color(),3);
        TitledBorder borde_Titulo = new TitledBorder(borde_Linea, "Descripción", TitledBorder.CENTER,
                TitledBorder.TOP,  fuente, CourseRoom.Utilerias.Primer_Color_Fuente());

        descripcion_JScrollPane.setBorder(borde_Titulo);
        
        descripcion_JTextPane.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
        
        nombre_Miembro_A_Cargo_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
        nombre_Miembro_A_Cargo_JLabel.setBackground(CourseRoom.Utilerias.Segundo_Color());
        
        estatus_Tarea_JComboBox.setBackground(CourseRoom.Utilerias.Tercer_Color());
        estatus_Tarea_JComboBox.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        
        fecha_Creacion_JLabel.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
        fecha_Finalizacion_JLabel.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
        
    }
}
