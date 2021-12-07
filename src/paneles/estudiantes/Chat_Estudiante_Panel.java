/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import paneles.generales.Mensaje_Audio_Derecho_General_Panel;
import paneles.generales.Mensaje_Texto_Izquierdo_General_Panel;
import paneles.generales.Mensaje_Texto_Derecho_General_Panel;
import paneles.generales.Mensaje_Imagen_Izquierdo_General_Panel;
import paneles.generales.Mensaje_Imagen_Derecho_General_Panel;
import paneles.generales.Mensaje_Archivo_Derecho_General_Panel;
import paneles.generales.Mensaje_Archivo_Izquierdo_General_Panel;
import paneles.generales.Mensaje_Video_Derecho_General_Panel;
import paneles.generales.Mensaje_Video_Izquierdo_General_Panel;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import javax.swing.ImageIcon;
import paneles.generales.Mensaje_Audio_Izquierdo_General_Panel;

/**
 *
 * @author LENOVO
 */
public class Chat_Estudiante_Panel extends javax.swing.JPanel implements  Componentes_Interface, Limpieza_Interface{

    private Color primer_Color, primer_Color_Fuente, segundo_Color, segundo_Color_Fuente, tercer_Color, tercer_Color_Fuente;
    
    public Chat_Estudiante_Panel(
            String receptor_Nombre, 
            Image receptor_Imagen,
            Color _primer_Color, 
            Color _primer_Color_Fuente, 
            Color _segundo_Color,
            Color _segundo_Color_Fuente,
            Color _tercer_Color,
            Color _tercer_Color_Fuente) {
        initComponents();
        
        ImageIcon icono = new ImageIcon(receptor_Imagen);
        receptor_Imagen_JLabel.setIcon(icono);
        
        primer_Color = _primer_Color;
        primer_Color_Fuente = _primer_Color_Fuente;
        segundo_Color = _segundo_Color;
        segundo_Color_Fuente = _segundo_Color_Fuente;
        tercer_Color = _tercer_Color;
        tercer_Color_Fuente = _tercer_Color_Fuente;
        
        receptor_JLabel.setText(receptor_Nombre);
        
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

        informacion_JPanel = new javax.swing.JPanel();
        receptor_JLabel = new javax.swing.JLabel();
        regresar_JButton = new javax.swing.JButton();
        receptor_Imagen_JLabel = new javax.swing.JLabel();
        enviar_Mensajes_JPanel = new javax.swing.JPanel();
        mensaje_JTextField = new javax.swing.JTextField();
        enviar_Archivos_JButton = new javax.swing.JButton();
        enviar_Videos_JButton = new javax.swing.JButton();
        enviar_Audios_JButton = new javax.swing.JButton();
        enviar_Imagenes_JButton = new javax.swing.JButton();
        enviar_Mensaje_JButton = new javax.swing.JButton();
        mensajes_JScrollPane = new javax.swing.JScrollPane();
        mensajes_JPanel = new javax.swing.JPanel();

        setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        informacion_JPanel.setMaximumSize(new java.awt.Dimension(32767, 50));
        informacion_JPanel.setMinimumSize(new java.awt.Dimension(1085, 50));
        informacion_JPanel.setPreferredSize(new java.awt.Dimension(1085, 50));

        receptor_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        receptor_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receptor_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/chat_1.png"))); // NOI18N
        receptor_JLabel.setToolTipText("Nombre Del Chat O La Persona Con Quien Se Chatea");

        regresar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_JButton.setToolTipText("Regresar A Mis Chats");
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

        receptor_Imagen_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receptor_Imagen_JLabel.setPreferredSize(new java.awt.Dimension(48, 48));

        javax.swing.GroupLayout informacion_JPanelLayout = new javax.swing.GroupLayout(informacion_JPanel);
        informacion_JPanel.setLayout(informacion_JPanelLayout);
        informacion_JPanelLayout.setHorizontalGroup(
            informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacion_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(receptor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(receptor_Imagen_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        informacion_JPanelLayout.setVerticalGroup(
            informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacion_JPanelLayout.createSequentialGroup()
                .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacion_JPanelLayout.createSequentialGroup()
                        .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receptor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regresar_JButton))
                        .addGap(0, 0, 0))
                    .addComponent(receptor_Imagen_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        enviar_Mensajes_JPanel.setMaximumSize(new java.awt.Dimension(32767, 50));
        enviar_Mensajes_JPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        enviar_Mensajes_JPanel.setPreferredSize(new java.awt.Dimension(1085, 50));

        mensaje_JTextField.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        mensaje_JTextField.setToolTipText("Redactar Menssaje");
        mensaje_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mensaje_JTextFieldKeyPressed(evt);
            }
        });

        enviar_Archivos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/attachment.png"))); // NOI18N
        enviar_Archivos_JButton.setToolTipText("Enviar Archivo");
        enviar_Archivos_JButton.setBorder(null);
        enviar_Archivos_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_Archivos_JButton.setPreferredSize(new java.awt.Dimension(42, 42));
        enviar_Archivos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_Archivos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviar_Archivos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviar_Archivos_JButtonMouseExited(evt);
            }
        });

        enviar_Videos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/clapperboard.png"))); // NOI18N
        enviar_Videos_JButton.setToolTipText("Enviar Archivo De Video");
        enviar_Videos_JButton.setBorder(null);
        enviar_Videos_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_Videos_JButton.setPreferredSize(new java.awt.Dimension(42, 42));
        enviar_Videos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_Videos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviar_Videos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviar_Videos_JButtonMouseExited(evt);
            }
        });

        enviar_Audios_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/microphone.png"))); // NOI18N
        enviar_Audios_JButton.setToolTipText("Enviar Archivo De Audio");
        enviar_Audios_JButton.setBorder(null);
        enviar_Audios_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_Audios_JButton.setPreferredSize(new java.awt.Dimension(42, 42));
        enviar_Audios_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_Audios_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviar_Audios_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviar_Audios_JButtonMouseExited(evt);
            }
        });

        enviar_Imagenes_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/edit-video.png"))); // NOI18N
        enviar_Imagenes_JButton.setToolTipText("Enviar Archivo De Imagen");
        enviar_Imagenes_JButton.setBorder(null);
        enviar_Imagenes_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_Imagenes_JButton.setPreferredSize(new java.awt.Dimension(42, 42));
        enviar_Imagenes_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_Imagenes_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviar_Imagenes_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviar_Imagenes_JButtonMouseExited(evt);
            }
        });

        enviar_Mensaje_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/send.png"))); // NOI18N
        enviar_Mensaje_JButton.setToolTipText("Enviar Mensaje");
        enviar_Mensaje_JButton.setBorder(null);
        enviar_Mensaje_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_Mensaje_JButton.setPreferredSize(new java.awt.Dimension(42, 42));
        enviar_Mensaje_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_Mensaje_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviar_Mensaje_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviar_Mensaje_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout enviar_Mensajes_JPanelLayout = new javax.swing.GroupLayout(enviar_Mensajes_JPanel);
        enviar_Mensajes_JPanel.setLayout(enviar_Mensajes_JPanelLayout);
        enviar_Mensajes_JPanelLayout.setHorizontalGroup(
            enviar_Mensajes_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enviar_Mensajes_JPanelLayout.createSequentialGroup()
                .addComponent(enviar_Archivos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviar_Videos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviar_Audios_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviar_Imagenes_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensaje_JTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviar_Mensaje_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        enviar_Mensajes_JPanelLayout.setVerticalGroup(
            enviar_Mensajes_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enviar_Mensajes_JPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(enviar_Mensajes_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enviar_Mensaje_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar_Archivos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar_Videos_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(enviar_Mensajes_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mensaje_JTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(enviar_Audios_JButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviar_Imagenes_JButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        mensajes_JScrollPane.setOpaque(false);

        mensajes_JPanel.setOpaque(false);
        mensajes_JPanel.setLayout(new java.awt.GridLayout(0, 1));
        mensajes_JScrollPane.setViewportView(mensajes_JPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(informacion_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mensajes_JScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enviar_Mensajes_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(informacion_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mensajes_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(enviar_Mensajes_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Enviar_Mensaje(){
        
        
        String mensaje = mensaje_JTextField.getText();
        if(!mensaje.isEmpty() && !mensaje.isBlank()){
            String emisor = CourseRoom.Faker().dune().character();
            String fecha = CourseRoom.Faker().date().birthday(0, 1).toString();
            if(CourseRoom.Random().nextInt(10) < 5){
                Mensaje_Texto_Izquierdo_General_Panel mensaje_Texto_General_Panel = 
                        new Mensaje_Texto_Izquierdo_General_Panel(emisor,fecha,mensaje,segundo_Color, segundo_Color_Fuente);
                mensajes_JPanel.add(mensaje_Texto_General_Panel);
            }else{
                Mensaje_Texto_Derecho_General_Panel mensaje_Texto_General_Panel
                        = new Mensaje_Texto_Derecho_General_Panel(emisor, fecha,mensaje,tercer_Color,tercer_Color_Fuente);
                mensajes_JPanel.add(mensaje_Texto_General_Panel);
            }
            mensaje_JTextField.setText("");
        }
    }
    
    private void mensaje_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mensaje_JTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Enviar_Mensaje();
        }
    }//GEN-LAST:event_mensaje_JTextFieldKeyPressed

    private void regresar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
           Tablero_Estudiante_Panel.Mostrar_Vista("Chats");
        }
    }//GEN-LAST:event_regresar_JButtonMouseClicked

    private void regresar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_regresar_JButtonMouseEntered

    private void regresar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseExited
        // TODO add your handling code here:
        regresar_JButton.setBackground(primer_Color);
    }//GEN-LAST:event_regresar_JButtonMouseExited

    private void enviar_Archivos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Archivos_JButtonMouseExited
        // TODO add your handling code here:
        enviar_Archivos_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_enviar_Archivos_JButtonMouseExited

    private void enviar_Archivos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Archivos_JButtonMouseEntered
        // TODO add your handling code here:
        enviar_Archivos_JButton.setBackground(primer_Color);
    }//GEN-LAST:event_enviar_Archivos_JButtonMouseEntered

    private void enviar_Archivos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Archivos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Enviar_Archivos();
        }
    }//GEN-LAST:event_enviar_Archivos_JButtonMouseClicked

    private void enviar_Videos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Videos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Enviar_Videos();
        }
    }//GEN-LAST:event_enviar_Videos_JButtonMouseClicked

    private void enviar_Videos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Videos_JButtonMouseEntered
        // TODO add your handling code here:
        enviar_Videos_JButton.setBackground(primer_Color);
    }//GEN-LAST:event_enviar_Videos_JButtonMouseEntered

    private void enviar_Videos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Videos_JButtonMouseExited
        // TODO add your handling code here:
        enviar_Videos_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_enviar_Videos_JButtonMouseExited

    private void enviar_Audios_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Audios_JButtonMouseClicked
        // TODO add your handling code here
        if(SwingUtilities.isLeftMouseButton(evt)){
            Enviar_Audios();
        }
    }//GEN-LAST:event_enviar_Audios_JButtonMouseClicked

    private void enviar_Audios_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Audios_JButtonMouseEntered
        // TODO add your handling code here:
        enviar_Audios_JButton.setBackground(primer_Color);
    }//GEN-LAST:event_enviar_Audios_JButtonMouseEntered

    private void enviar_Audios_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Audios_JButtonMouseExited
        // TODO add your handling code here:
        enviar_Audios_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_enviar_Audios_JButtonMouseExited

    private void enviar_Imagenes_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Imagenes_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Enviar_Imagenes();
        }
    }//GEN-LAST:event_enviar_Imagenes_JButtonMouseClicked

    private void enviar_Imagenes_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Imagenes_JButtonMouseEntered
        // TODO add your handling code here:
        enviar_Imagenes_JButton.setBackground(primer_Color);
    }//GEN-LAST:event_enviar_Imagenes_JButtonMouseEntered

    private void enviar_Imagenes_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Imagenes_JButtonMouseExited
        // TODO add your handling code here:
        enviar_Imagenes_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_enviar_Imagenes_JButtonMouseExited

    private void enviar_Mensaje_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Mensaje_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Enviar_Mensaje();
        }
    }//GEN-LAST:event_enviar_Mensaje_JButtonMouseClicked

    private void enviar_Mensaje_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Mensaje_JButtonMouseEntered
        // TODO add your handling code here:
        enviar_Mensaje_JButton.setBackground(primer_Color);
    }//GEN-LAST:event_enviar_Mensaje_JButtonMouseEntered

    private void enviar_Mensaje_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Mensaje_JButtonMouseExited
        // TODO add your handling code here:
        enviar_Mensaje_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_enviar_Mensaje_JButtonMouseExited

    private void Enviar_Archivos(){
        JFileChooser escogedor_Archivos = new JFileChooser();
        escogedor_Archivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
        escogedor_Archivos.setApproveButtonText("Enviar Archivo(s)");
        escogedor_Archivos.setMultiSelectionEnabled(true);
        int resultado = escogedor_Archivos.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File[] archivos_Abiertos = escogedor_Archivos.getSelectedFiles();
            
            if(archivos_Abiertos != null){
                
                File archivo_Abierto;
                String emisor;
                String fecha;
                
                if(CourseRoom.Random().nextInt(10) < 5){
                    Mensaje_Archivo_Izquierdo_General_Panel mensaje_Archivo_Panel;
                    for (int i = 0; i < archivos_Abiertos.length; i++) {
                        archivo_Abierto = archivos_Abiertos[i];
                        emisor = CourseRoom.Faker().dune().character();
                        fecha = CourseRoom.Faker().date().birthday(0, 1).toString();
                        mensaje_Archivo_Panel
                                = new Mensaje_Archivo_Izquierdo_General_Panel(emisor, fecha, archivo_Abierto, segundo_Color,segundo_Color_Fuente);
                        mensajes_JPanel.add(mensaje_Archivo_Panel);
                    }
                }
                else{
                    Mensaje_Archivo_Derecho_General_Panel mensaje_Archivo_Panel;
                    for (int i = 0; i < archivos_Abiertos.length; i++) {
                        archivo_Abierto = archivos_Abiertos[i];
                        emisor = CourseRoom.Faker().dune().character();
                        fecha = CourseRoom.Faker().date().birthday(0, 1).toString();
                        mensaje_Archivo_Panel
                                = new Mensaje_Archivo_Derecho_General_Panel(emisor, fecha, archivo_Abierto, tercer_Color, tercer_Color_Fuente);
                        mensajes_JPanel.add(mensaje_Archivo_Panel);
                    }
                }
                
            }
            
        }
    
    }
            
    private void Enviar_Videos(){
        JFileChooser escogedor_Archivos = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos De Video", "mp4", "mkv", "wmv", "3gp","avi");
        escogedor_Archivos.addChoosableFileFilter(filtro);
        escogedor_Archivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
        escogedor_Archivos.setAcceptAllFileFilterUsed(true);
        escogedor_Archivos.setApproveButtonText("Enviar Video(s)");
        escogedor_Archivos.setMultiSelectionEnabled(true);
        
        int resultado = escogedor_Archivos.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File[] archivos_Abiertos = escogedor_Archivos.getSelectedFiles();
            
            if(archivos_Abiertos != null){
                
                File archivo_Abierto;
                String emisor;
                String fecha;

                if (CourseRoom.Random().nextInt(10) < 5) {
                    Mensaje_Video_Izquierdo_General_Panel mensaje_Video_Panel;
                    for (int i = 0; i < archivos_Abiertos.length; i++) {
                        archivo_Abierto = archivos_Abiertos[i];
                        emisor = CourseRoom.Faker().dune().character();
                        fecha = CourseRoom.Faker().date().birthday(0, 1).toString();
                        mensaje_Video_Panel = new Mensaje_Video_Izquierdo_General_Panel(emisor, fecha, archivo_Abierto.getAbsolutePath(),
                                archivo_Abierto.getName(), segundo_Color, segundo_Color_Fuente);
                        mensajes_JPanel.add(mensaje_Video_Panel);
                    }
                }
                else{
                    Mensaje_Video_Derecho_General_Panel mensaje_Video_Panel;
                    for (int i = 0; i < archivos_Abiertos.length; i++) {
                        archivo_Abierto = archivos_Abiertos[i];
                        emisor = CourseRoom.Faker().dune().character();
                        fecha = CourseRoom.Faker().date().birthday(0, 1).toString();
                        mensaje_Video_Panel = new Mensaje_Video_Derecho_General_Panel(emisor, fecha, archivo_Abierto.getAbsolutePath(), 
                                archivo_Abierto.getName(), tercer_Color, tercer_Color_Fuente);
                        mensajes_JPanel.add(mensaje_Video_Panel);
                    }
                }
               
                
            }
            
        }

    }
    
    private void Enviar_Imagenes(){
        JFileChooser escogedor_Archivos = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos De Imágenes", "png", "jpg", "jpeg", "bmp");
        escogedor_Archivos.addChoosableFileFilter(filtro);
        escogedor_Archivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
        escogedor_Archivos.setAcceptAllFileFilterUsed(true);
        escogedor_Archivos.setApproveButtonText("Enviar Imagen(es)");
        escogedor_Archivos.setMultiSelectionEnabled(true);
        int resultado = escogedor_Archivos.showOpenDialog(this);
        
        if (resultado == JFileChooser.APPROVE_OPTION) {
            
            File[] archivos_Abiertos = escogedor_Archivos.getSelectedFiles();
            
            if(archivos_Abiertos != null){
                
                File archivo_Abierto;
                String emisor;
                String fecha;
                Image abrir_Imagen;

                if (CourseRoom.Random().nextInt(10) < 5) {
                    Mensaje_Imagen_Izquierdo_General_Panel mensaje_Imagen_Panel;
                    for (int i = 0; i < archivos_Abiertos.length; i++) {
                        archivo_Abierto = archivos_Abiertos[i];
                        try {
                            abrir_Imagen = ImageIO.read(archivo_Abierto);
                            emisor = CourseRoom.Faker().dune().character();
                            fecha = CourseRoom.Faker().date().birthday(0,1).toString();
                            mensaje_Imagen_Panel
                                    = new Mensaje_Imagen_Izquierdo_General_Panel(emisor, fecha, abrir_Imagen,
                                            archivo_Abierto.getName(), segundo_Color, segundo_Color_Fuente);
                            mensajes_JPanel.add(mensaje_Imagen_Panel);
                        } catch (IOException ex) {
                        }
                    }
                }
                else{
                    Mensaje_Imagen_Derecho_General_Panel mensaje_Imagen_Panel;
                    for (int i = 0; i < archivos_Abiertos.length; i++) {
                        archivo_Abierto = archivos_Abiertos[i];
                        try {
                            abrir_Imagen = ImageIO.read(archivo_Abierto);
                            emisor = CourseRoom.Faker().dune().character();
                            fecha = CourseRoom.Faker().date().birthday(0,1).toString();
                            mensaje_Imagen_Panel
                                    = new Mensaje_Imagen_Derecho_General_Panel(emisor, fecha, abrir_Imagen,
                                            archivo_Abierto.getName(), tercer_Color, tercer_Color_Fuente);
                            mensajes_JPanel.add(mensaje_Imagen_Panel);
                        } catch (IOException ex) {
                        }
                    }
                }
                
                
            }
            
        }
    }
    
    private void Enviar_Audios(){
        JFileChooser escogedor_Archivos = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos De Audio", "mp3", "flac", "ogg", "m4a");
        escogedor_Archivos.addChoosableFileFilter(filtro);
        escogedor_Archivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
        escogedor_Archivos.setAcceptAllFileFilterUsed(true);
        escogedor_Archivos.setApproveButtonText("Enviar Audio(s)");
        escogedor_Archivos.setMultiSelectionEnabled(true);
        
        int resultado = escogedor_Archivos.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File[] archivos_Abiertos = escogedor_Archivos.getSelectedFiles();
            
            if(archivos_Abiertos != null){
                
                File archivo_Abierto;
                String emisor;
                String fecha;
                if(CourseRoom.Random().nextInt(10) < 5){
                    Mensaje_Audio_Izquierdo_General_Panel mensaje_Audio_Panel;
                    for (int i = 0; i < archivos_Abiertos.length; i++) {
                        archivo_Abierto = archivos_Abiertos[i];
                        emisor = CourseRoom.Faker().dune().character();
                        fecha = CourseRoom.Faker().date().birthday(0,1).toString();
                        mensaje_Audio_Panel = new Mensaje_Audio_Izquierdo_General_Panel(emisor, fecha, archivo_Abierto.getAbsolutePath(),
                                archivo_Abierto.getName(), segundo_Color, segundo_Color_Fuente);
                        mensajes_JPanel.add(mensaje_Audio_Panel);
                    }
                }
                else{
                    Mensaje_Audio_Derecho_General_Panel mensaje_Audio_Panel;
                    for (int i = 0; i < archivos_Abiertos.length; i++) {
                        archivo_Abierto = archivos_Abiertos[i];
                        emisor = CourseRoom.Faker().dune().character();
                        fecha = CourseRoom.Faker().date().birthday(0,1).toString();
                        mensaje_Audio_Panel = new Mensaje_Audio_Derecho_General_Panel(emisor, fecha, archivo_Abierto.getAbsolutePath(),
                                archivo_Abierto.getName(), tercer_Color, tercer_Color_Fuente);
                        mensajes_JPanel.add(mensaje_Audio_Panel);
                    }
                }
                
                
            }
            
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviar_Archivos_JButton;
    private javax.swing.JButton enviar_Audios_JButton;
    private javax.swing.JButton enviar_Imagenes_JButton;
    private javax.swing.JButton enviar_Mensaje_JButton;
    private javax.swing.JPanel enviar_Mensajes_JPanel;
    private javax.swing.JButton enviar_Videos_JButton;
    private javax.swing.JPanel informacion_JPanel;
    private javax.swing.JTextField mensaje_JTextField;
    private javax.swing.JPanel mensajes_JPanel;
    private javax.swing.JScrollPane mensajes_JScrollPane;
    private javax.swing.JLabel receptor_Imagen_JLabel;
    private javax.swing.JLabel receptor_JLabel;
    private javax.swing.JButton regresar_JButton;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void Iniciar_Componentes() {
        mensajes_JScrollPane.getViewport().setOpaque(false);
        mensajes_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        Colorear_Componentes();
    }
    
    @Override
    public void Colorear_Componentes(){
        
        regresar_JButton.setBackground(primer_Color);
        receptor_JLabel.setForeground(primer_Color_Fuente);
        mensaje_JTextField.setBackground(primer_Color);
        mensaje_JTextField.setForeground(primer_Color_Fuente);
        receptor_JLabel.setForeground(primer_Color_Fuente);
        enviar_Mensajes_JPanel.setBackground(segundo_Color);
        informacion_JPanel.setBackground(primer_Color);
        
        enviar_Archivos_JButton.setBackground(segundo_Color);
        enviar_Audios_JButton.setBackground(segundo_Color);
        enviar_Imagenes_JButton.setBackground(segundo_Color);
        enviar_Mensaje_JButton.setBackground(segundo_Color);
        enviar_Videos_JButton.setBackground(segundo_Color);
        
    }

    @Override
    public void Limpiar() {
        mensajes_JPanel.removeAll();
        primer_Color = segundo_Color = primer_Color_Fuente = segundo_Color_Fuente = tercer_Color = tercer_Color_Fuente =  null; 
    }
}
