/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import interfaces.Componentes_Interface;
import java.awt.Color;
import javax.swing.SwingUtilities;
import main.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Titulo_Curso_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface{

    private Color segundo_Color, tercer_Color, tercer_Color_Fuente;
    
    public Titulo_Curso_Estudiante_Panel(String nombre_Curso,
            Color _segundo_Color,
            Color _tercer_Color,
            Color _tercer_Color_Fuente) {
        initComponents();
        
        segundo_Color = _segundo_Color;
        tercer_Color = _tercer_Color;
        tercer_Color_Fuente = _tercer_Color_Fuente;
        
        titulo_JTextPane.setText(CourseRoom.Formato_HTML_Izquierda(nombre_Curso));
        
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
        acerca_Profesor_JButton = new javax.swing.JButton();
        miembros_JButton = new javax.swing.JButton();
        foro_JButton = new javax.swing.JButton();
        recursos_JButton = new javax.swing.JButton();
        informacion_JButton = new javax.swing.JButton();
        titulo_JScrollPane = new javax.swing.JScrollPane();
        titulo_JTextPane = new javax.swing.JTextPane();
        tablero_JButton = new javax.swing.JButton();
        nombre_Pagina_JLabel = new javax.swing.JLabel();
        tu_Trabajo_JButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(32767, 118));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 118));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));
        contenido_JPanel.setPreferredSize(new java.awt.Dimension(1068, 106));

        acerca_Profesor_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/teacher_1.png"))); // NOI18N
        acerca_Profesor_JButton.setBorder(null);
        acerca_Profesor_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        acerca_Profesor_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acerca_Profesor_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acerca_Profesor_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acerca_Profesor_JButtonMouseExited(evt);
            }
        });

        miembros_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/team.png"))); // NOI18N
        miembros_JButton.setBorder(null);
        miembros_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        miembros_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miembros_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miembros_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miembros_JButtonMouseExited(evt);
            }
        });

        foro_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/synergy.png"))); // NOI18N
        foro_JButton.setBorder(null);
        foro_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        foro_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foro_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foro_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                foro_JButtonMouseExited(evt);
            }
        });

        recursos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/book.png"))); // NOI18N
        recursos_JButton.setBorder(null);
        recursos_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        recursos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recursos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recursos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recursos_JButtonMouseExited(evt);
            }
        });

        informacion_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/info_2.png"))); // NOI18N
        informacion_JButton.setBorder(null);
        informacion_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        informacion_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informacion_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                informacion_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                informacion_JButtonMouseExited(evt);
            }
        });

        titulo_JScrollPane.setBorder(null);

        titulo_JTextPane.setEditable(false);
        titulo_JTextPane.setBorder(null);
        titulo_JTextPane.setContentType("text/html"); // NOI18N
        titulo_JTextPane.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        titulo_JTextPane.setText("");
        titulo_JScrollPane.setViewportView(titulo_JTextPane);

        tablero_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/dashboard.png"))); // NOI18N
        tablero_JButton.setBorder(null);
        tablero_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        tablero_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablero_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablero_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tablero_JButtonMouseExited(evt);
            }
        });

        nombre_Pagina_JLabel.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        nombre_Pagina_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_Pagina_JLabel.setOpaque(true);

        tu_Trabajo_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/working.png"))); // NOI18N
        tu_Trabajo_JButton.setBorder(null);
        tu_Trabajo_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        tu_Trabajo_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tu_Trabajo_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tu_Trabajo_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tu_Trabajo_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titulo_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(informacion_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tablero_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(tu_Trabajo_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(recursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(foro_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(miembros_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acerca_Profesor_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombre_Pagina_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acerca_Profesor_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miembros_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foro_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablero_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informacion_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tu_Trabajo_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombre_Pagina_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void acerca_Profesor_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acerca_Profesor_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Curso_Estudiante_Panel.Mostrar_Informacion_Profesor();
            nombre_Pagina_JLabel.setText("Sobre El Profesor");
        }
    }//GEN-LAST:event_acerca_Profesor_JButtonMouseClicked

    private void acerca_Profesor_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acerca_Profesor_JButtonMouseEntered
        // TODO add your handling code here:
        acerca_Profesor_JButton.setBackground(tercer_Color);
    }//GEN-LAST:event_acerca_Profesor_JButtonMouseEntered

    private void acerca_Profesor_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acerca_Profesor_JButtonMouseExited
        // TODO add your handling code here:
        acerca_Profesor_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_acerca_Profesor_JButtonMouseExited

    private void miembros_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miembros_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            nombre_Pagina_JLabel.setText("Miembros");
        }
    }//GEN-LAST:event_miembros_JButtonMouseClicked

    private void miembros_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miembros_JButtonMouseEntered
        // TODO add your handling code here:
        miembros_JButton.setBackground(tercer_Color);
    }//GEN-LAST:event_miembros_JButtonMouseEntered

    private void miembros_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miembros_JButtonMouseExited
        // TODO add your handling code here:
        miembros_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_miembros_JButtonMouseExited

    private void foro_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foro_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            nombre_Pagina_JLabel.setText("Foro");
        }
    }//GEN-LAST:event_foro_JButtonMouseClicked

    private void foro_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foro_JButtonMouseEntered
        // TODO add your handling code here:
        foro_JButton.setBackground(tercer_Color);
    }//GEN-LAST:event_foro_JButtonMouseEntered

    private void foro_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foro_JButtonMouseExited
        // TODO add your handling code here:
        foro_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_foro_JButtonMouseExited

    private void recursos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recursos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            nombre_Pagina_JLabel.setText("Recursos");
        }
    }//GEN-LAST:event_recursos_JButtonMouseClicked

    private void recursos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recursos_JButtonMouseEntered
        // TODO add your handling code here:
        recursos_JButton.setBackground(tercer_Color);
    }//GEN-LAST:event_recursos_JButtonMouseEntered

    private void recursos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recursos_JButtonMouseExited
        // TODO add your handling code here:
        recursos_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_recursos_JButtonMouseExited

    private void informacion_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacion_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Curso_Estudiante_Panel.Mostrar_Informacion_Curso();
            nombre_Pagina_JLabel.setText("Sobre El Curso");
        }
    }//GEN-LAST:event_informacion_JButtonMouseClicked

    private void informacion_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacion_JButtonMouseEntered
        // TODO add your handling code here:
        informacion_JButton.setBackground(tercer_Color);
    }//GEN-LAST:event_informacion_JButtonMouseEntered

    private void informacion_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacion_JButtonMouseExited
        // TODO add your handling code here:
        informacion_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_informacion_JButtonMouseExited

    private void tablero_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablero_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            nombre_Pagina_JLabel.setText("Tablero");
        }
    }//GEN-LAST:event_tablero_JButtonMouseClicked

    private void tablero_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablero_JButtonMouseEntered
        // TODO add your handling code here:
        tablero_JButton.setBackground(tercer_Color);
    }//GEN-LAST:event_tablero_JButtonMouseEntered

    private void tablero_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablero_JButtonMouseExited
        // TODO add your handling code here:
        tablero_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_tablero_JButtonMouseExited

    private void tu_Trabajo_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tu_Trabajo_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            nombre_Pagina_JLabel.setText("Tu Trabajo");
        }
    }//GEN-LAST:event_tu_Trabajo_JButtonMouseClicked

    private void tu_Trabajo_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tu_Trabajo_JButtonMouseEntered
        // TODO add your handling code here:
        tu_Trabajo_JButton.setBackground(tercer_Color);
    }//GEN-LAST:event_tu_Trabajo_JButtonMouseEntered

    private void tu_Trabajo_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tu_Trabajo_JButtonMouseExited
        // TODO add your handling code here:
        tu_Trabajo_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_tu_Trabajo_JButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acerca_Profesor_JButton;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JButton foro_JButton;
    private javax.swing.JButton informacion_JButton;
    private javax.swing.JButton miembros_JButton;
    private javax.swing.JLabel nombre_Pagina_JLabel;
    private javax.swing.JButton recursos_JButton;
    private javax.swing.JButton tablero_JButton;
    private javax.swing.JScrollPane titulo_JScrollPane;
    private javax.swing.JTextPane titulo_JTextPane;
    private javax.swing.JButton tu_Trabajo_JButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        titulo_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        titulo_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        nombre_Pagina_JLabel.setText("Sobre El Curso");
        
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        contenido_JPanel.setBackground(segundo_Color);
        
        titulo_JTextPane.setBackground(tercer_Color);
        titulo_JTextPane.setForeground(tercer_Color_Fuente);
        
        nombre_Pagina_JLabel.setBackground(tercer_Color);
        nombre_Pagina_JLabel.setForeground(tercer_Color_Fuente);
        
        informacion_JButton.setBackground(segundo_Color);
        tablero_JButton.setBackground(segundo_Color);
        tu_Trabajo_JButton.setBackground(segundo_Color);
        recursos_JButton.setBackground(segundo_Color);
        foro_JButton.setBackground(segundo_Color);
        miembros_JButton.setBackground(segundo_Color);
        acerca_Profesor_JButton.setBackground(segundo_Color);
    }
}
