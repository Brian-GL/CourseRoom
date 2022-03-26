/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.profesores.preguntas;

import clases.Celda_Renderer;
import clases.Escogedor_Archivos;
import courseroom.CourseRoom;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Envio_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.commons.io.FilenameUtils;
import paneles.profesores.Tablero_Profesor_Panel;
import paneles.profesores.perfil.Perfil_Profesor_Panel;

/**
 *
 * @author LENOVO
 */
public class Pregunta_Profesor_Panel extends javax.swing.JPanel implements  Componentes_Interface, Envio_Interface, Limpieza_Interface{

    public Pregunta_Profesor_Panel(
            Image imagen_Preguntador,
            String _pregunta, 
            String _preguntador_Nombre,
            String _descripcion_Pregunta,
            String _fecha,
            String estatus) {
        
        initComponents();
        
        ImageIcon icono_Usuario = new ImageIcon(imagen_Preguntador);
        preguntador_Imagen_JLabel.setIcon(icono_Usuario);
        preguntador_Imagen_JLabel.setToolTipText(CourseRoom.Utilerias().Concatenar("Pregunta Por ", _preguntador_Nombre));
        
        String valor = CourseRoom.Utilerias().Concatenar(_pregunta, " - ",estatus);
        pregunta_JLabel.setText(valor);
        
        valor = CourseRoom.Utilerias().Concatenar(_descripcion_Pregunta, "<br><br>Por ",_preguntador_Nombre," A ",_fecha);
        
        
        descripcion_Pregunta_JTextPane.setText(CourseRoom.Utilerias().Formato_HTML_Izquierda(valor));
        
        imagen_Preguntador.flush();
        icono_Usuario.getImage().flush();
        
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
        regresar_JButton = new javax.swing.JButton();
        preguntador_Imagen_JLabel = new javax.swing.JLabel();
        pregunta_JLabel = new javax.swing.JLabel();
        descripcion_Pregunta_JScrollPane = new javax.swing.JScrollPane();
        descripcion_Pregunta_JTextPane = new javax.swing.JTextPane();
        actualizar_JButton = new javax.swing.JButton();
        marcar_Solucionada_JButton = new javax.swing.JButton();
        eliminar_Pregunta_JButton = new javax.swing.JButton();
        chat_JPanel = new javax.swing.JPanel();
        mensajes_Chat_JScrollPane = new javax.swing.JScrollPane();
        mensajes_Chat_JTable = new javax.swing.JTable();
        enviar_Mensaje_Chat_JPanel = new javax.swing.JPanel();
        enviar_Archivo_Chat_JButton = new javax.swing.JButton();
        redactar_Mensaje_Chat_JTextField = new javax.swing.JTextField();

        setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 630));

        informacion_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        informacion_JPanel.setMaximumSize(new java.awt.Dimension(32767, 150));
        informacion_JPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        informacion_JPanel.setPreferredSize(new java.awt.Dimension(982, 150));

        regresar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_JButton.setToolTipText("Regresar A Mis Chats");
        regresar_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        regresar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_JButton.setMaximumSize(new java.awt.Dimension(48, 64));
        regresar_JButton.setMinimumSize(new java.awt.Dimension(48, 64));
        regresar_JButton.setPreferredSize(new java.awt.Dimension(48, 64));
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

        preguntador_Imagen_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preguntador_Imagen_JLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        preguntador_Imagen_JLabel.setMaximumSize(new java.awt.Dimension(48, 48));
        preguntador_Imagen_JLabel.setMinimumSize(new java.awt.Dimension(48, 48));
        preguntador_Imagen_JLabel.setPreferredSize(new java.awt.Dimension(48, 48));

        pregunta_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pregunta_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        descripcion_Pregunta_JScrollPane.setBorder(null);
        descripcion_Pregunta_JScrollPane.setOpaque(false);

        descripcion_Pregunta_JTextPane.setEditable(false);
        descripcion_Pregunta_JTextPane.setBorder(null);
        descripcion_Pregunta_JTextPane.setContentType("text/html"); // NOI18N
        descripcion_Pregunta_JTextPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descripcion_Pregunta_JTextPane.setText("");
        descripcion_Pregunta_JTextPane.setOpaque(false);
        descripcion_Pregunta_JScrollPane.setViewportView(descripcion_Pregunta_JTextPane);

        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/updated.png"))); // NOI18N
        actualizar_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        marcar_Solucionada_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/problem-solving.png"))); // NOI18N
        marcar_Solucionada_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)marcar_Solucionada_JButton.getIcon()).getImage().flush();
        marcar_Solucionada_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marcar_Solucionada_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marcar_Solucionada_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                marcar_Solucionada_JButtonMouseExited(evt);
            }
        });

        eliminar_Pregunta_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/close.png"))); // NOI18N
        eliminar_Pregunta_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)eliminar_Pregunta_JButton.getIcon()).getImage().flush();
        eliminar_Pregunta_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_Pregunta_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminar_Pregunta_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminar_Pregunta_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout informacion_JPanelLayout = new javax.swing.GroupLayout(informacion_JPanel);
        informacion_JPanel.setLayout(informacion_JPanelLayout);
        informacion_JPanelLayout.setHorizontalGroup(
            informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacion_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(preguntador_Imagen_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regresar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pregunta_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descripcion_Pregunta_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(marcar_Solucionada_JButton)
                        .addComponent(actualizar_JButton))
                    .addComponent(eliminar_Pregunta_JButton)))
        );
        informacion_JPanelLayout.setVerticalGroup(
            informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacion_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacion_JPanelLayout.createSequentialGroup()
                        .addComponent(pregunta_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion_Pregunta_JScrollPane))
                    .addGroup(informacion_JPanelLayout.createSequentialGroup()
                        .addComponent(preguntador_Imagen_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(regresar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(informacion_JPanelLayout.createSequentialGroup()
                        .addComponent(actualizar_JButton)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(eliminar_Pregunta_JButton)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(marcar_Solucionada_JButton))))
        );

        chat_JPanel.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        chat_JPanel.setOpaque(false);
        chat_JPanel.setPreferredSize(new java.awt.Dimension(1110, 630));
        chat_JPanel.setLayout(new java.awt.BorderLayout());

        mensajes_Chat_JScrollPane.setBorder(null);
        mensajes_Chat_JScrollPane.setOpaque(false);

        mensajes_Chat_JTable.setAutoCreateRowSorter(true);
        mensajes_Chat_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mensajes_Chat_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Emisor", "Mensaje", "Fecha"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }

                @Override
                public Class getColumnClass(int column)
                {
                    for(int i = 0; i < mensajes_Chat_JTable.getRowCount(); i++)
                    {
                        //The first valid value of a cell of given column is retrieved.
                        if(getValueAt(i,column) != null)
                        {
                            return getValueAt(i, column).getClass();
                        }
                    }
                    //if no valid value is found, default renderer is returned.
                    return super.getColumnClass(column);
                }
            });
            mensajes_Chat_JTable.setRowHeight(80);
            mensajes_Chat_JTable.setShowGrid(true);
            mensajes_Chat_JTable.setSurrendersFocusOnKeystroke(true);
            mensajes_Chat_JTable.setRowSorter(new TableRowSorter(mensajes_Chat_JTable.getModel()));
            mensajes_Chat_JTable.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    if (e.getClickCount() == 2) {

                        JTable tabla = (JTable) e.getComponent();
                        int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                        int columna = tabla.getSelectedColumn();

                        // Abrir
                        if (columna == 1) {
                            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                            Celda_Renderer celda = (Celda_Renderer)modelo.getValueAt(fila, columna);

                            if(celda.Tiene_Icono()){
                                String extension = FilenameUtils.getExtension(celda.Texto());
                                String ruta = celda.ID();
                                CourseRoom.Utilerias().Abrir_Archivo(ruta, extension, celda.Texto());
                            }
                        }

                    }
                }
            });
            mensajes_Chat_JScrollPane.setViewportView(mensajes_Chat_JTable);

            chat_JPanel.add(mensajes_Chat_JScrollPane, java.awt.BorderLayout.CENTER);

            enviar_Mensaje_Chat_JPanel.setMaximumSize(new java.awt.Dimension(32767, 44));
            enviar_Mensaje_Chat_JPanel.setPreferredSize(new java.awt.Dimension(1085, 44));
            enviar_Mensaje_Chat_JPanel.setLayout(new java.awt.BorderLayout());

            enviar_Archivo_Chat_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/attachment.png"))); // NOI18N
            enviar_Archivo_Chat_JButton.setToolTipText("Enviar Archivo");
            enviar_Archivo_Chat_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            enviar_Archivo_Chat_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ((ImageIcon)enviar_Archivo_Chat_JButton.getIcon()).getImage().flush();
            enviar_Archivo_Chat_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    enviar_Archivo_Chat_JButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    enviar_Archivo_Chat_JButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    enviar_Archivo_Chat_JButtonMouseExited(evt);
                }
            });
            enviar_Mensaje_Chat_JPanel.add(enviar_Archivo_Chat_JButton, java.awt.BorderLayout.WEST);

            redactar_Mensaje_Chat_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            redactar_Mensaje_Chat_JTextField.setPreferredSize(new java.awt.Dimension(71, 34));
            redactar_Mensaje_Chat_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    redactar_Mensaje_Chat_JTextFieldKeyPressed(evt);
                }
            });
            enviar_Mensaje_Chat_JPanel.add(redactar_Mensaje_Chat_JTextField, java.awt.BorderLayout.CENTER);

            chat_JPanel.add(enviar_Mensaje_Chat_JPanel, java.awt.BorderLayout.SOUTH);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(informacion_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                        .addComponent(chat_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                    .addGap(32, 32, 32))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(informacion_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(chat_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    
    
    private void regresar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseExited
        // TODO add your handling code here:
        regresar_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
    }//GEN-LAST:event_regresar_JButtonMouseExited

    private void regresar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_regresar_JButtonMouseEntered

    private void regresar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Profesor_Panel.Mostrar_Vista("Preguntas");
        }
    }//GEN-LAST:event_regresar_JButtonMouseClicked

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

        }
    }//GEN-LAST:event_actualizar_JButtonMouseClicked

    private void actualizar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseEntered
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseEntered

    private void actualizar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseExited
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseExited

    private void marcar_Solucionada_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcar_Solucionada_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_marcar_Solucionada_JButtonMouseClicked

    private void marcar_Solucionada_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcar_Solucionada_JButtonMouseEntered
        // TODO add your handling code here:
        marcar_Solucionada_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
    }//GEN-LAST:event_marcar_Solucionada_JButtonMouseEntered

    private void marcar_Solucionada_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcar_Solucionada_JButtonMouseExited
        // TODO add your handling code here:
        marcar_Solucionada_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_marcar_Solucionada_JButtonMouseExited

    private void enviar_Archivo_Chat_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Archivo_Chat_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Enviar_Archivos();
        }
    }//GEN-LAST:event_enviar_Archivo_Chat_JButtonMouseClicked

    private void enviar_Archivo_Chat_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Archivo_Chat_JButtonMouseEntered
        // TODO add your handling code here:
        enviar_Archivo_Chat_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
    }//GEN-LAST:event_enviar_Archivo_Chat_JButtonMouseEntered

    private void enviar_Archivo_Chat_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_Archivo_Chat_JButtonMouseExited
        // TODO add your handling code here:
        enviar_Archivo_Chat_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_enviar_Archivo_Chat_JButtonMouseExited

    private void redactar_Mensaje_Chat_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_redactar_Mensaje_Chat_JTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Enviar_Mensaje();
        }
    }//GEN-LAST:event_redactar_Mensaje_Chat_JTextFieldKeyPressed

    private void eliminar_Pregunta_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_Pregunta_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_eliminar_Pregunta_JButtonMouseClicked

    private void eliminar_Pregunta_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_Pregunta_JButtonMouseEntered
        // TODO add your handling code here:
        eliminar_Pregunta_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
    }//GEN-LAST:event_eliminar_Pregunta_JButtonMouseEntered

    private void eliminar_Pregunta_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_Pregunta_JButtonMouseExited
        // TODO add your handling code here:
        eliminar_Pregunta_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_eliminar_Pregunta_JButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JPanel chat_JPanel;
    private javax.swing.JScrollPane descripcion_Pregunta_JScrollPane;
    private javax.swing.JTextPane descripcion_Pregunta_JTextPane;
    private javax.swing.JButton eliminar_Pregunta_JButton;
    private javax.swing.JButton enviar_Archivo_Chat_JButton;
    private javax.swing.JPanel enviar_Mensaje_Chat_JPanel;
    private javax.swing.JPanel informacion_JPanel;
    private javax.swing.JButton marcar_Solucionada_JButton;
    private javax.swing.JScrollPane mensajes_Chat_JScrollPane;
    private javax.swing.JTable mensajes_Chat_JTable;
    private javax.swing.JLabel pregunta_JLabel;
    private javax.swing.JLabel preguntador_Imagen_JLabel;
    private javax.swing.JTextField redactar_Mensaje_Chat_JTextField;
    private javax.swing.JButton regresar_JButton;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void Iniciar_Componentes() {
        
        
        descripcion_Pregunta_JTextPane.setCaretPosition(0);
        descripcion_Pregunta_JScrollPane.getViewport().setOpaque(false);
        descripcion_Pregunta_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        descripcion_Pregunta_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        mensajes_Chat_JScrollPane.getViewport().setOpaque(false);
        mensajes_Chat_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        mensajes_Chat_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        Font gadugi = new Font("Segoe UI", Font.BOLD, 16);
        mensajes_Chat_JTable.getTableHeader().setFont(gadugi);
        
        mensajes_Chat_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        Colorear_Componentes();
        
    }
    
    @Override
    public void Colorear_Componentes(){
        
        eliminar_Pregunta_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
        eliminar_Pregunta_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        
        regresar_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
        pregunta_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        descripcion_Pregunta_JTextPane.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
       
        informacion_JPanel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        
        redactar_Mensaje_Chat_JTextField.setBackground(CourseRoom.Utilerias().Primer_Color());
        redactar_Mensaje_Chat_JTextField.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        enviar_Mensaje_Chat_JPanel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        enviar_Archivo_Chat_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        marcar_Solucionada_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        
        mensajes_Chat_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        mensajes_Chat_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        mensajes_Chat_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        mensajes_Chat_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        mensajes_Chat_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        mensajes_Chat_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        mensajes_Chat_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        DefaultTableModel modelo = (DefaultTableModel) mensajes_Chat_JTable.getModel();
        Celda_Renderer celda;
        for(int i = 0; i < modelo.getRowCount();i++){
            for(int j = 0; j < modelo.getColumnCount(); j++){
                celda = (Celda_Renderer)modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }
    }
    
        @Override
    public void Enviar_Mensaje() {
        
        String mensaje = redactar_Mensaje_Chat_JTextField.getText();
        if (!mensaje.isEmpty() && !mensaje.isBlank()) {
            String emisor = Perfil_Profesor_Panel.Nombre_Completo();
            String fecha = CourseRoom.Utilerias().Fecha_Hora_Local();
            Celda_Renderer[] celdas = new Celda_Renderer[3];
  
            Celda_Renderer celda;
            celda = new Celda_Renderer(emisor);
            celdas[0] = celda;
            celda = new Celda_Renderer(mensaje);
            celdas[1] = celda;
            celda = new Celda_Renderer(fecha);
            celdas[2] = celda;
            DefaultTableModel modelo = (DefaultTableModel) mensajes_Chat_JTable.getModel();
            modelo.addRow(celdas);
            mensajes_Chat_JTable.setRowHeight(mensajes_Chat_JTable.getRowCount()-1, CourseRoom.Utilerias().Altura_Fila_Tabla(mensaje.length()));
            
            redactar_Mensaje_Chat_JTextField.setText("");
            redactar_Mensaje_Chat_JTextField.setCaretPosition(0);
        }
    }

    @Override
    public void Enviar_Archivos() {
        Escogedor_Archivos escogedor_Archivos = new Escogedor_Archivos();
        int resultado = escogedor_Archivos.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File[] archivos_Abiertos = escogedor_Archivos.getSelectedFiles();

            if (archivos_Abiertos != null) {

                try {
                    String emisor;
                    String fecha;
                    String ruta;
                    String nombre_Archivo;
                    Celda_Renderer[] celdas = new Celda_Renderer[3];
                    DefaultTableModel modelo = (DefaultTableModel) mensajes_Chat_JTable.getModel();
                    Celda_Renderer celda;
                    Image icono = ImageIO.read(getClass().getResource("/recursos/iconos/box.png"));
                    ImageIcon icono_Abrir = new ImageIcon(icono);
                    for (File archivo_Abierto : archivos_Abiertos) {
                        ruta = archivo_Abierto.getAbsolutePath();
                        nombre_Archivo = archivo_Abierto.getName();
                        emisor = Perfil_Profesor_Panel.Nombre_Completo();
                        fecha = CourseRoom.Utilerias().Fecha_Hora_Local();
                        
                        celda = new Celda_Renderer(emisor);
                        celdas[0] = celda;
                        celda = new Celda_Renderer(icono_Abrir,nombre_Archivo,ruta);
                        celdas[1] = celda;
                        celda = new Celda_Renderer(fecha);
                        celdas[2] = celda;
                        
                        modelo.addRow(celdas);
                        
                        mensajes_Chat_JTable.setRowHeight(mensajes_Chat_JTable.getRowCount()-1, CourseRoom.Utilerias().Altura_Fila_Tabla(nombre_Archivo.length()));
                    }
                    
                    icono.flush();
                } catch (IOException ex) {
                }

            }

        }

    }

    @Override
    public void Limpiar() {
        DefaultTableModel modelo = (DefaultTableModel) mensajes_Chat_JTable.getModel();
        modelo.setRowCount(0);
    }
}
