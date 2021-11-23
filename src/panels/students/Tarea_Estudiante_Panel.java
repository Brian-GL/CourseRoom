/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template archivo_Abierto, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.students;

import panels.generals.Archivo_Subido_Tarea_General_Panel;
import main.MainFrame;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import panels.generals.Archivo_Adjunto_Tarea_General_Panel;
import panels.generals.Comentario_Tarea_General_Panel;
import data.interfaces.Componentes_Interface;
import data.interfaces.Limpieza_Interface;

/**
 *
 * @author LENOVO
 */
public class Tarea_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    private Color primer_Color, segundo_Color,tercer_Color,primer_Color_Fuente, segundo_Color_Fuente, tercer_Color_Fuente;
    
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Tarea_Estudiante_Panel(
            String nombre, 
            Color _primer_Color, 
            Color _segundo_Color, 
            Color _tercer_Color, 
            Color _primer_Color_Fuente, 
            Color _segundo_Color_Fuente,
            Color _tercer_Color_Fuente ) {
        
        initComponents();
        
        primer_Color = _primer_Color;
        segundo_Color = _segundo_Color;
        primer_Color_Fuente = _primer_Color_Fuente;
        segundo_Color_Fuente = _segundo_Color_Fuente;
        tercer_Color = _tercer_Color;
        tercer_Color_Fuente = _tercer_Color_Fuente;
        nombre_JLabel.setText(nombre);
      
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

        nombre_JLabel = new javax.swing.JLabel();
        nombre_Profersor_JLabel = new javax.swing.JLabel();
        mi_Trabajo_JPanel = new javax.swing.JPanel();
        subir_Archivos_JButton = new javax.swing.JButton();
        archivos_Subidos_JScrollPane = new javax.swing.JScrollPane();
        archivos_Subidos_JPanel = new javax.swing.JPanel();
        comentarios_JPanel = new javax.swing.JPanel();
        enviar_Comentarios_JPanel = new javax.swing.JPanel();
        enviar_Comentarios_JTextField = new javax.swing.JTextField();
        enviar_Comentarios_JButton = new javax.swing.JButton();
        comentarios_JScrollPane = new javax.swing.JScrollPane();
        comentarios_Subidos_JPanel = new javax.swing.JPanel();
        enviar_Tarea_JButton = new javax.swing.JButton();
        fecha_Entrega_JLabel = new javax.swing.JLabel();
        regresar_JButton = new javax.swing.JButton();
        curso_JLabel = new javax.swing.JLabel();
        estatus_JLabel = new javax.swing.JLabel();
        archivos_Adjuntos_JScrollPane = new javax.swing.JScrollPane();
        archivos_Adjuntos_JPanel = new javax.swing.JPanel();
        descripcion_JLabel = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1085, 630));

        nombre_JLabel.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        nombre_JLabel.setText("Nombre De La Tarea");
        nombre_JLabel.setToolTipText("Nombre De La Tarea");
        nombre_JLabel.setOpaque(true);

        nombre_Profersor_JLabel.setFont(new java.awt.Font("Gadugi", 3, 15)); // NOI18N
        nombre_Profersor_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombre_Profersor_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/avatar.png"))); // NOI18N
        nombre_Profersor_JLabel.setText("Nombre Del Profesor");
        nombre_Profersor_JLabel.setToolTipText("Nombre Del Profesor");

        mi_Trabajo_JPanel.setOpaque(false);

        subir_Archivos_JButton.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        subir_Archivos_JButton.setText("Añadir Archivo(s)");
        subir_Archivos_JButton.setToolTipText("Sube Un Archivo (O Varios) A Entregar");
        subir_Archivos_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subir_Archivos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subir_Archivos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subir_Archivos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subir_Archivos_JButtonMouseExited(evt);
            }
        });

        archivos_Subidos_JScrollPane.setBorder(null);
        archivos_Subidos_JScrollPane.setOpaque(false);

        archivos_Subidos_JPanel.setToolTipText("Mis Archivos Adjuntos A Entregar");
        archivos_Subidos_JPanel.setOpaque(false);
        archivos_Subidos_JPanel.setLayout(new javax.swing.BoxLayout(archivos_Subidos_JPanel, javax.swing.BoxLayout.PAGE_AXIS));
        archivos_Subidos_JScrollPane.setViewportView(archivos_Subidos_JPanel);

        javax.swing.GroupLayout mi_Trabajo_JPanelLayout = new javax.swing.GroupLayout(mi_Trabajo_JPanel);
        mi_Trabajo_JPanel.setLayout(mi_Trabajo_JPanelLayout);
        mi_Trabajo_JPanelLayout.setHorizontalGroup(
            mi_Trabajo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mi_Trabajo_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mi_Trabajo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subir_Archivos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(archivos_Subidos_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        mi_Trabajo_JPanelLayout.setVerticalGroup(
            mi_Trabajo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mi_Trabajo_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(archivos_Subidos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subir_Archivos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        comentarios_JPanel.setOpaque(false);

        enviar_Comentarios_JPanel.setOpaque(false);

        enviar_Comentarios_JTextField.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        enviar_Comentarios_JTextField.setToolTipText("Redacta aquí tu comentario");
        enviar_Comentarios_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enviar_Comentarios_JTextFieldKeyPressed(evt);
            }
        });

        enviar_Comentarios_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/send.png"))); // NOI18N
        enviar_Comentarios_JButton.setToolTipText("Enviar Comentario");
        enviar_Comentarios_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_Comentarios_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_Comentarios_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviar_Comentarios_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviar_Comentarios_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout enviar_Comentarios_JPanelLayout = new javax.swing.GroupLayout(enviar_Comentarios_JPanel);
        enviar_Comentarios_JPanel.setLayout(enviar_Comentarios_JPanelLayout);
        enviar_Comentarios_JPanelLayout.setHorizontalGroup(
            enviar_Comentarios_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enviar_Comentarios_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enviar_Comentarios_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviar_Comentarios_JButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        enviar_Comentarios_JPanelLayout.setVerticalGroup(
            enviar_Comentarios_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enviar_Comentarios_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enviar_Comentarios_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enviar_Comentarios_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar_Comentarios_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        comentarios_JScrollPane.setBorder(null);
        comentarios_JScrollPane.setOpaque(false);

        comentarios_Subidos_JPanel.setToolTipText("Comentarios De La Tarea");
        comentarios_Subidos_JPanel.setOpaque(false);
        comentarios_Subidos_JPanel.setLayout(new javax.swing.BoxLayout(comentarios_Subidos_JPanel, javax.swing.BoxLayout.PAGE_AXIS));
        comentarios_JScrollPane.setViewportView(comentarios_Subidos_JPanel);

        javax.swing.GroupLayout comentarios_JPanelLayout = new javax.swing.GroupLayout(comentarios_JPanel);
        comentarios_JPanel.setLayout(comentarios_JPanelLayout);
        comentarios_JPanelLayout.setHorizontalGroup(
            comentarios_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enviar_Comentarios_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(comentarios_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        comentarios_JPanelLayout.setVerticalGroup(
            comentarios_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comentarios_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comentarios_JScrollPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviar_Comentarios_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        enviar_Tarea_JButton.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        enviar_Tarea_JButton.setText("Enviar Tarea");
        enviar_Tarea_JButton.setToolTipText("Enviar Tarea A Revisión");
        enviar_Tarea_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_Tarea_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_Tarea_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviar_Tarea_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviar_Tarea_JButtonMouseExited(evt);
            }
        });

        fecha_Entrega_JLabel.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        fecha_Entrega_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_Entrega_JLabel.setText("Fecha & Hora De Entrega De La Tarea");
        fecha_Entrega_JLabel.setToolTipText("Fecha & Hora De Entrega");

        regresar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/reply.png"))); // NOI18N
        regresar_JButton.setToolTipText("Regresar A Mis Tareas");
        regresar_JButton.setBorder(null);
        regresar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        curso_JLabel.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        curso_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        curso_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/training.png"))); // NOI18N
        curso_JLabel.setText("Del Curso Sistemas Operativos");
        curso_JLabel.setToolTipText("Curso De Proveniencia");
        curso_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        curso_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curso_JLabelMouseClicked(evt);
            }
        });

        estatus_JLabel.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        estatus_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estatus_JLabel.setText("Pendiente");
        estatus_JLabel.setToolTipText("Estatus De La Tarea");

        archivos_Adjuntos_JScrollPane.setBorder(null);
        archivos_Adjuntos_JScrollPane.setOpaque(false);

        archivos_Adjuntos_JPanel.setToolTipText("Archivos Adjuntos");
        archivos_Adjuntos_JPanel.setOpaque(false);
        archivos_Adjuntos_JPanel.setLayout(new javax.swing.BoxLayout(archivos_Adjuntos_JPanel, javax.swing.BoxLayout.LINE_AXIS));
        archivos_Adjuntos_JScrollPane.setViewportView(archivos_Adjuntos_JPanel);

        descripcion_JLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        descripcion_JLabel.setToolTipText("Descripción De La Tarea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comentarios_JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(curso_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nombre_Profersor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(regresar_JButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nombre_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(archivos_Adjuntos_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descripcion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estatus_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mi_Trabajo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_Entrega_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar_Tarea_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regresar_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(curso_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre_Profersor_JLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descripcion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(archivos_Adjuntos_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(comentarios_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(estatus_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mi_Trabajo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha_Entrega_JLabel)
                        .addGap(131, 131, 131)
                        .addComponent(enviar_Tarea_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enviar_Tarea_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Tarea_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_enviar_Tarea_JButtonMouseClicked

    private void enviar_Tarea_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Tarea_JButtonMouseEntered
        // TODO add your handling code here:
        enviar_Tarea_JButton.setBackground(tercer_Color);
        enviar_Tarea_JButton.setForeground(tercer_Color_Fuente);
    }//GEN-LAST:event_enviar_Tarea_JButtonMouseEntered

    private void enviar_Tarea_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Tarea_JButtonMouseExited
        // TODO add your handling code here:
        enviar_Tarea_JButton.setBackground(segundo_Color);
        enviar_Tarea_JButton.setForeground(segundo_Color_Fuente);
    }//GEN-LAST:event_enviar_Tarea_JButtonMouseExited

    private void enviar_Comentarios_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Comentarios_JButtonMouseClicked
        // TODO add your handling code here:
        if(!enviar_Comentarios_JTextField.getText().isEmpty() && !enviar_Comentarios_JTextField.getText().isBlank()){
            Enviar_Comentario();
        }
    }//GEN-LAST:event_enviar_Comentarios_JButtonMouseClicked

    private void enviar_Comentarios_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Comentarios_JButtonMouseExited
        // TODO add your handling code here:
        enviar_Comentarios_JButton.setBackground(tercer_Color);
        enviar_Comentarios_JButton.setForeground(tercer_Color_Fuente);
    }//GEN-LAST:event_enviar_Comentarios_JButtonMouseExited

    private void enviar_Comentarios_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enviar_Comentarios_JTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!enviar_Comentarios_JTextField.getText().isEmpty() && !enviar_Comentarios_JTextField.getText().isBlank()){
                Enviar_Comentario();
            }
        }
    }//GEN-LAST:event_enviar_Comentarios_JTextFieldKeyPressed

    private void subir_Archivos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subir_Archivos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Subir_Archivos();
        }
    }//GEN-LAST:event_subir_Archivos_JButtonMouseClicked

    private void subir_Archivos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subir_Archivos_JButtonMouseExited
        // TODO add your handling code here:
        subir_Archivos_JButton.setBackground(tercer_Color);
        subir_Archivos_JButton.setForeground(tercer_Color_Fuente);
    }//GEN-LAST:event_subir_Archivos_JButtonMouseExited

    private void subir_Archivos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subir_Archivos_JButtonMouseEntered
        // TODO add your handling code here:
        subir_Archivos_JButton.setBackground(segundo_Color);
        subir_Archivos_JButton.setForeground(segundo_Color_Fuente);
    }//GEN-LAST:event_subir_Archivos_JButtonMouseEntered

    private void regresar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Estudiante_Panel.showView("Tareas");
        }
    }//GEN-LAST:event_regresar_JButtonMouseClicked

    private void regresar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_regresar_JButtonMouseEntered

    private void regresar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseExited
        // TODO add your handling code here:
        regresar_JButton.setBackground(tercer_Color);
    }//GEN-LAST:event_regresar_JButtonMouseExited

    private void curso_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_curso_JLabelMouseClicked

    private void enviar_Comentarios_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Comentarios_JButtonMouseEntered
        // TODO add your handling code here:
        enviar_Comentarios_JButton.setBackground(segundo_Color);
        enviar_Comentarios_JButton.setForeground(segundo_Color_Fuente);
    }//GEN-LAST:event_enviar_Comentarios_JButtonMouseEntered

    private void Enviar_Comentario(){
        try {
            
            System.out.println("Comment Getting Image From https://loremflickr.com/50/50/sunset,beach/all");
            URL url_imagen = new URL("https://loremflickr.com/50/50/sunset,beach/all");
            Image obtener_imagen = ImageIO.read(url_imagen);
            Comentario_Tarea_General_Panel comentario_Tarea_General_Panel = 
                    new Comentario_Tarea_General_Panel(obtener_imagen,MainFrame.getFaker().name().fullName(),
                            enviar_Comentarios_JTextField.getText(),segundo_Color,segundo_Color_Fuente);
            comentarios_Subidos_JPanel.add(comentario_Tarea_General_Panel,LEFT_ALIGNMENT);
            obtener_imagen.flush();
            enviar_Comentarios_JTextField.setText("");
            
        } catch (MalformedURLException ex) {
            MainFrame.getLogger().log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            MainFrame.getLogger().log(Level.SEVERE, null, ex);
        }
    }
    
    private void Subir_Archivos(){
        
        JFileChooser escogedor_Archivos = new JFileChooser();
        escogedor_Archivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
        escogedor_Archivos.setMultiSelectionEnabled(true);
        escogedor_Archivos.setApproveButtonText("Abrir Archivos");
        escogedor_Archivos.setMultiSelectionEnabled(true);
        escogedor_Archivos.doLayout();
        int result = escogedor_Archivos.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File[] archivos_Abiertos = escogedor_Archivos.getSelectedFiles();
            File archivo_Abierto;
            Archivo_Subido_Tarea_General_Panel archivo_Subido_Tarea_General_Panel;
            for(int i = 0; i < archivos_Abiertos.length;i++){
                archivo_Abierto = archivos_Abiertos[i];
                archivo_Subido_Tarea_General_Panel = 
                        new Archivo_Subido_Tarea_General_Panel(archivo_Abierto,
                        tercer_Color,tercer_Color_Fuente,segundo_Color, segundo_Color_Fuente);
                archivos_Subidos_JPanel.add(archivo_Subido_Tarea_General_Panel);
            }     
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel archivos_Adjuntos_JPanel;
    private javax.swing.JScrollPane archivos_Adjuntos_JScrollPane;
    private javax.swing.JPanel archivos_Subidos_JPanel;
    private javax.swing.JScrollPane archivos_Subidos_JScrollPane;
    private javax.swing.JPanel comentarios_JPanel;
    private javax.swing.JScrollPane comentarios_JScrollPane;
    private javax.swing.JPanel comentarios_Subidos_JPanel;
    private javax.swing.JLabel curso_JLabel;
    private javax.swing.JLabel descripcion_JLabel;
    private javax.swing.JButton enviar_Comentarios_JButton;
    private javax.swing.JPanel enviar_Comentarios_JPanel;
    private javax.swing.JTextField enviar_Comentarios_JTextField;
    private javax.swing.JButton enviar_Tarea_JButton;
    private javax.swing.JLabel estatus_JLabel;
    private javax.swing.JLabel fecha_Entrega_JLabel;
    private javax.swing.JPanel mi_Trabajo_JPanel;
    private javax.swing.JLabel nombre_JLabel;
    private javax.swing.JLabel nombre_Profersor_JLabel;
    private javax.swing.JButton regresar_JButton;
    private javax.swing.JButton subir_Archivos_JButton;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void Iniciar_Componentes() {
          
        comentarios_JScrollPane.getViewport().setOpaque(false);
        comentarios_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);

        archivos_Subidos_JScrollPane.getViewport().setOpaque(false);
        archivos_Subidos_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        
        archivos_Adjuntos_JScrollPane.getViewport().setOpaque(false);
        archivos_Adjuntos_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        Colorear_Componentes();
    }
    
    @Override
    public void Colorear_Componentes() {
        
        subir_Archivos_JButton.setBackground(tercer_Color);
        subir_Archivos_JButton.setForeground(tercer_Color_Fuente);
        
        enviar_Comentarios_JTextField.setForeground(tercer_Color_Fuente);
        enviar_Comentarios_JTextField.setCaretColor(tercer_Color_Fuente);
        enviar_Comentarios_JTextField.setBackground(tercer_Color);

        nombre_JLabel.setForeground(segundo_Color_Fuente);
        nombre_JLabel.setBackground(segundo_Color);

        nombre_Profersor_JLabel.setForeground(primer_Color_Fuente);

        curso_JLabel.setForeground(primer_Color_Fuente);

        fecha_Entrega_JLabel.setForeground(primer_Color_Fuente);
        
        descripcion_JLabel.setForeground(primer_Color_Fuente);
        descripcion_JLabel.setText(MainFrame.ToHTMLLeftFormat(MainFrame.getFaker().lorem().paragraph(6)));

        enviar_Tarea_JButton.setBackground(segundo_Color);
        enviar_Tarea_JButton.setForeground(segundo_Color_Fuente);

        regresar_JButton.setBackground(tercer_Color);
        
        estatus_JLabel.setForeground(primer_Color_Fuente);

        enviar_Comentarios_JButton.setBackground(tercer_Color);
        enviar_Comentarios_JButton.setForeground(tercer_Color_Fuente);

        this.setBackground(primer_Color);
        
        mi_Trabajo_JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(primer_Color_Fuente), "Mi Trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18),primer_Color_Fuente));
        comentarios_JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(primer_Color_Fuente), "Comentarios De La Tarea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 0, 18),primer_Color_Fuente));
        
        Archivo_Adjunto_Tarea_General_Panel archivo_Adjunto_Tarea_General_Panel;
        for(int i = 0; i < MainFrame.getFaker().number().numberBetween(1,10); i++){
            archivo_Adjunto_Tarea_General_Panel = 
                    new Archivo_Adjunto_Tarea_General_Panel(primer_Color_Fuente, segundo_Color, segundo_Color_Fuente);
            archivos_Adjuntos_JPanel.add(archivo_Adjunto_Tarea_General_Panel);
        }
    }
    

    @Override
    public void Limpiar() {
        comentarios_Subidos_JPanel.removeAll();
        archivos_Adjuntos_JPanel.removeAll();
        archivos_Subidos_JPanel.removeAll();
        primer_Color =  segundo_Color = tercer_Color = 
        primer_Color_Fuente =  segundo_Color_Fuente =  tercer_Color_Fuente = null;
    }

}
