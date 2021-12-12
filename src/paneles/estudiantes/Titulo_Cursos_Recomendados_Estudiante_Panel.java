/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import interfaces.Componentes_Interface;
import java.awt.Font;
import javax.swing.SwingUtilities;
import main.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Titulo_Cursos_Recomendados_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface{

    /**
     * Creates new form Titulo_Chats_Estudiante_Panel
     */
    public Titulo_Cursos_Recomendados_Estudiante_Panel() {
        initComponents();
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
        titulo_JLabel = new javax.swing.JLabel();
        ordenar_Por_JComboBox = new javax.swing.JComboBox<>();
        buscar_JButton = new javax.swing.JButton();
        nuevos_Cursos_JButton = new javax.swing.JButton();
        recomendados_Cursos_JButton = new javax.swing.JButton();
        finalizados_Cursos_JButton = new javax.swing.JButton();
        actuales_Cursos_JButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(32767, 118));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 118));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Cursos Recomendados");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        ordenar_Por_JComboBox.setFont(new java.awt.Font("Gadugi", 0, 17)); // NOI18N
        ordenar_Por_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Defecto", "Fecha: Más Reciente", "Fecha: Menos Reciente", "Nombre: A - Z", "Nombre: Z - A", "Nombre Del Profesor: A - Z", "Nombre Del Profesor: Z - A", "Calificación: Mayor A Menor", "Calificación: Menor A Mayor", "Categoria: A - Z", "Categoria: Z - A" }));
        ordenar_Por_JComboBox.setToolTipText("Ordenar Cursos Por");
        ordenar_Por_JComboBox.setBorder(null);
        ordenar_Por_JComboBox.setOpaque(true);

        buscar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/search.png"))); // NOI18N
        buscar_JButton.setBorder(null);
        buscar_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        buscar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscar_JButtonMouseExited(evt);
            }
        });

        nuevos_Cursos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/new.png"))); // NOI18N
        nuevos_Cursos_JButton.setBorder(null);
        nuevos_Cursos_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        nuevos_Cursos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevos_Cursos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevos_Cursos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevos_Cursos_JButtonMouseExited(evt);
            }
        });

        recomendados_Cursos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/quality.png"))); // NOI18N
        recomendados_Cursos_JButton.setBorder(null);
        recomendados_Cursos_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        recomendados_Cursos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recomendados_Cursos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recomendados_Cursos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recomendados_Cursos_JButtonMouseExited(evt);
            }
        });

        finalizados_Cursos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/woman.png"))); // NOI18N
        finalizados_Cursos_JButton.setBorder(null);
        finalizados_Cursos_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        finalizados_Cursos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizados_Cursos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finalizados_Cursos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finalizados_Cursos_JButtonMouseExited(evt);
            }
        });

        actuales_Cursos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/work-from-home.png"))); // NOI18N
        actuales_Cursos_JButton.setBorder(null);
        actuales_Cursos_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actuales_Cursos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actuales_Cursos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actuales_Cursos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actuales_Cursos_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(actuales_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(finalizados_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(recomendados_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nuevos_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ordenar_Por_JComboBox, 0, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevos_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recomendados_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalizados_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actuales_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Cursos_Estudiante_Panel.Buscar_Cursos();
        }
    }//GEN-LAST:event_buscar_JButtonMouseClicked

    private void buscar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_JButtonMouseEntered
        // TODO add your handling code here:
        buscar_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_buscar_JButtonMouseEntered

    private void buscar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_JButtonMouseExited
        // TODO add your handling code here:
        buscar_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_buscar_JButtonMouseExited

    private void nuevos_Cursos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevos_Cursos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Cursos_Estudiante_Panel.Mostrar_Cursos_Nuevos();
        }
    }//GEN-LAST:event_nuevos_Cursos_JButtonMouseClicked

    private void nuevos_Cursos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevos_Cursos_JButtonMouseEntered
        // TODO add your handling code here:
        nuevos_Cursos_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_nuevos_Cursos_JButtonMouseEntered

    private void nuevos_Cursos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevos_Cursos_JButtonMouseExited
        // TODO add your handling code here:
        nuevos_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_nuevos_Cursos_JButtonMouseExited

    private void recomendados_Cursos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recomendados_Cursos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Cursos_Estudiante_Panel.Mostrar_Cursos_Recomendados();
        }
    }//GEN-LAST:event_recomendados_Cursos_JButtonMouseClicked

    private void recomendados_Cursos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recomendados_Cursos_JButtonMouseEntered
        // TODO add your handling code here:
        recomendados_Cursos_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_recomendados_Cursos_JButtonMouseEntered

    private void recomendados_Cursos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recomendados_Cursos_JButtonMouseExited
        // TODO add your handling code here:
        recomendados_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_recomendados_Cursos_JButtonMouseExited

    private void finalizados_Cursos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizados_Cursos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Cursos_Estudiante_Panel.Mostrar_Cursos_Finalizados();
        }
    }//GEN-LAST:event_finalizados_Cursos_JButtonMouseClicked

    private void finalizados_Cursos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizados_Cursos_JButtonMouseEntered
        // TODO add your handling code here:
        finalizados_Cursos_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_finalizados_Cursos_JButtonMouseEntered

    private void finalizados_Cursos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizados_Cursos_JButtonMouseExited
        // TODO add your handling code here:
        finalizados_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_finalizados_Cursos_JButtonMouseExited

    private void actuales_Cursos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuales_Cursos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Cursos_Estudiante_Panel.Mostrar_Cursos_Actuales();
        }
    }//GEN-LAST:event_actuales_Cursos_JButtonMouseClicked

    private void actuales_Cursos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuales_Cursos_JButtonMouseEntered
        // TODO add your handling code here:
        actuales_Cursos_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_actuales_Cursos_JButtonMouseEntered

    private void actuales_Cursos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuales_Cursos_JButtonMouseExited
        // TODO add your handling code here:
        actuales_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_actuales_Cursos_JButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actuales_Cursos_JButton;
    private javax.swing.JButton buscar_JButton;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JButton finalizados_Cursos_JButton;
    private javax.swing.JButton nuevos_Cursos_JButton;
    private javax.swing.JComboBox<String> ordenar_Por_JComboBox;
    private javax.swing.JButton recomendados_Cursos_JButton;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        //No soportado
    }

    @Override
    public void Colorear_Componentes() {
        contenido_JPanel.setBackground(CourseRoom.Segundo_Color());
        
        Font gadugi = new java.awt.Font("Gadugi", 1, 16);
        
        titulo_JLabel.setBackground(CourseRoom.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Tercer_Color_Fuente());
        
        ordenar_Por_JComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(), 
                "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                gadugi, CourseRoom.Tercer_Color_Fuente()));
        ordenar_Por_JComboBox.setBackground(CourseRoom.Tercer_Color());
        ordenar_Por_JComboBox.setForeground(CourseRoom.Tercer_Color_Fuente());
        
        actuales_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
        finalizados_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
        recomendados_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
        nuevos_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
        buscar_JButton.setBackground(CourseRoom.Segundo_Color());
    }
}
