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
package paneles.estudiantes.cursos;

import clases.Celda_Renderer;
import courseroom.CourseRoom;
import courseroom.CourseRoom_Frame;
import datos.colecciones.Lista;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelos.ComboOptionModel;
import modelos.DatosGeneralesCursoModel;
import modelos.ResponseModel;
import paneles.estudiantes.Tablero_Estudiante_Panel;

/**
 *
 * @author LENOVO
 */
public class Vista_Previa_Curso_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface, Limpieza_Interface{

    private String ID;
    private String nombre_Curso;
    private Image imagen_Curso;
    private String nombre_Profesor;
    private Image imagen_Profesor;
    private String fecha_Creacion;
    private String nuevo_Curso_ID;
    private boolean tipo_Curso; // 0 -> Recomendado | 1 -> Nuevo
     private int Id_Curso;
    
    public Vista_Previa_Curso_Estudiante_Panel(int id_Curso) {
        initComponents();
        Id_Curso = id_Curso;
        
        /*titulo_JLabel.setText(_nombre_Curso);
        ImageIcon icono = new ImageIcon(_imagen_Curso);
        imagen_Curso_JLabel.setIcon(icono);
        icono = new ImageIcon(_imagen_Profesor);
        imagen_Profesor_JLabel.setIcon(icono);
        this.ID = _id;
        fecha_Creacion_JLabel.setText(CourseRoom.Utilerias().Formato_HTML_Central(CourseRoom.Utilerias().Concatenar("Creado El ",_fecha_Creacion)));
        descripcion_Profesor_JTextPane.setText(CourseRoom.Utilerias().Formato_HTML_Izquierda(CourseRoom.Utilerias().Concatenar("<b>",_nombre_Profesor, ":<b><br> <br>",CourseRoom.Utilerias().lorem().paragraph(10))));
        
        nombre_Curso = _nombre_Curso;
        imagen_Curso = _imagen_Curso;
        nombre_Profesor = _nombre_Profesor;
        imagen_Profesor = _imagen_Profesor;
        fecha_Creacion = _fecha_Creacion;
        nuevo_Curso_ID = _nuevo_Curso_ID;
        tipo_Curso = _tipo_Curso;*/
        
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
        enrolarme_JButton = new javax.swing.JButton();
        regresar_JButton = new javax.swing.JButton();
        informacion_Curso_JScrollPane = new javax.swing.JScrollPane();
        informacion_Curso_JPanel = new javax.swing.JPanel();
        imagen_Curso_JLabel = new javax.swing.JLabel();
        descripcion_Curso_JScrollPane = new javax.swing.JScrollPane();
        descripcion_Curso_JTextPane = new javax.swing.JTextPane();
        descripcion_Profesor_JScrollPane = new javax.swing.JScrollPane();
        descripcion_Profesor_JTextPane = new javax.swing.JTextPane();
        imagen_Profesor_JLabel = new javax.swing.JLabel();
        fecha_Creacion_JLabel = new javax.swing.JLabel();
        intereses_Tematicas_JScrollPane = new javax.swing.JScrollPane();
        intereses_Tematicas_JTable = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 630));

        titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 72));
        titulo_JPanel.setOpaque(false);
        titulo_JPanel.setPreferredSize(new java.awt.Dimension(982, 72));

        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(818, 68));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(818, 68));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(818, 68));

        enrolarme_JButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        enrolarme_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/working.png"))); // NOI18N
        enrolarme_JButton.setText("Enrolarme");
        enrolarme_JButton.setToolTipText("<html> <h4>Registrarme En<br> Este Curso</h4> </html>");
        enrolarme_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enrolarme_JButton.setMaximumSize(new java.awt.Dimension(171, 32));
        enrolarme_JButton.setMinimumSize(new java.awt.Dimension(171, 32));
        enrolarme_JButton.setPreferredSize(new java.awt.Dimension(171, 32));
        ((ImageIcon)enrolarme_JButton.getIcon()).getImage().flush();
        enrolarme_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enrolarme_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enrolarme_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enrolarme_JButtonMouseExited(evt);
            }
        });

        regresar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_JButton.setToolTipText("<html> <h3>Regresar A Mis Cursos</h3> </html>");
        regresar_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        javax.swing.GroupLayout titulo_JPanelLayout = new javax.swing.GroupLayout(titulo_JPanel);
        titulo_JPanel.setLayout(titulo_JPanelLayout);
        titulo_JPanelLayout.setHorizontalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulo_JPanelLayout.createSequentialGroup()
                .addComponent(regresar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(enrolarme_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titulo_JPanelLayout.setVerticalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulo_JPanelLayout.createSequentialGroup()
                .addGroup(titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresar_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(titulo_JPanelLayout.createSequentialGroup()
                        .addGroup(titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enrolarme_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        informacion_Curso_JScrollPane.setBorder(null);
        informacion_Curso_JScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        informacion_Curso_JScrollPane.setMinimumSize(new java.awt.Dimension(0, 0));
        informacion_Curso_JScrollPane.setOpaque(false);
        informacion_Curso_JScrollPane.setPreferredSize(new java.awt.Dimension(1046, 1128));

        informacion_Curso_JPanel.setOpaque(false);
        informacion_Curso_JPanel.setPreferredSize(new java.awt.Dimension(1046, 1128));

        imagen_Curso_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_Curso_JLabel.setToolTipText("Imagen Del Grupo");
        imagen_Curso_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagen_Curso_JLabel.setMaximumSize(new java.awt.Dimension(400, 400));
        imagen_Curso_JLabel.setMinimumSize(new java.awt.Dimension(400, 400));
        imagen_Curso_JLabel.setPreferredSize(new java.awt.Dimension(400, 400));

        descripcion_Curso_JScrollPane.setBorder(null);
        descripcion_Curso_JScrollPane.setOpaque(false);

        descripcion_Curso_JTextPane.setEditable(false);
        descripcion_Curso_JTextPane.setBorder(null);
        descripcion_Curso_JTextPane.setContentType("text/html"); // NOI18N
        descripcion_Curso_JTextPane.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descripcion_Curso_JTextPane.setText("");
        descripcion_Curso_JTextPane.setOpaque(false);
        descripcion_Curso_JScrollPane.setViewportView(descripcion_Curso_JTextPane);

        descripcion_Profesor_JScrollPane.setBorder(null);
        descripcion_Profesor_JScrollPane.setOpaque(false);

        descripcion_Profesor_JTextPane.setEditable(false);
        descripcion_Profesor_JTextPane.setBorder(null);
        descripcion_Profesor_JTextPane.setContentType("text/html"); // NOI18N
        descripcion_Profesor_JTextPane.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descripcion_Profesor_JTextPane.setText("");
        descripcion_Profesor_JTextPane.setOpaque(false);
        descripcion_Profesor_JScrollPane.setViewportView(descripcion_Profesor_JTextPane);

        imagen_Profesor_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_Profesor_JLabel.setToolTipText("Imagen Del Grupo");
        imagen_Profesor_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagen_Profesor_JLabel.setMaximumSize(new java.awt.Dimension(400, 400));
        imagen_Profesor_JLabel.setMinimumSize(new java.awt.Dimension(400, 400));
        imagen_Profesor_JLabel.setPreferredSize(new java.awt.Dimension(400, 400));

        fecha_Creacion_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fecha_Creacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_Creacion_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/calendar_1.png"))); // NOI18N
        fecha_Creacion_JLabel.setToolTipText("Fecha De Creación Del Grupo");
        fecha_Creacion_JLabel.setMaximumSize(new java.awt.Dimension(354, 20));
        fecha_Creacion_JLabel.setMinimumSize(new java.awt.Dimension(354, 20));
        fecha_Creacion_JLabel.setPreferredSize(new java.awt.Dimension(354, 20));
        ((ImageIcon)fecha_Creacion_JLabel.getIcon()).getImage().flush();

        intereses_Tematicas_JScrollPane.setBorder(null);
        intereses_Tematicas_JScrollPane.setOpaque(false);

        intereses_Tematicas_JTable.setAutoCreateRowSorter(true);
        intereses_Tematicas_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        intereses_Tematicas_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Interes / Temática"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }

                @Override
                public Class getColumnClass(int column)
                {
                    for(int i = 0; i < intereses_Tematicas_JTable.getRowCount(); i++)
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
            intereses_Tematicas_JTable.setRowHeight(32);
            intereses_Tematicas_JTable.setShowGrid(true);
            intereses_Tematicas_JTable.setSurrendersFocusOnKeystroke(true);
            intereses_Tematicas_JTable.setRowSorter(new TableRowSorter(intereses_Tematicas_JTable.getModel()));
            intereses_Tematicas_JScrollPane.setViewportView(intereses_Tematicas_JTable);

            javax.swing.GroupLayout informacion_Curso_JPanelLayout = new javax.swing.GroupLayout(informacion_Curso_JPanel);
            informacion_Curso_JPanel.setLayout(informacion_Curso_JPanelLayout);
            informacion_Curso_JPanelLayout.setHorizontalGroup(
                informacion_Curso_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(informacion_Curso_JPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(informacion_Curso_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(descripcion_Curso_JScrollPane)
                        .addComponent(intereses_Tematicas_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                        .addComponent(descripcion_Profesor_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(18, 18, 18)
                    .addGroup(informacion_Curso_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacion_Curso_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imagen_Profesor_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fecha_Creacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(imagen_Curso_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0))
            );
            informacion_Curso_JPanelLayout.setVerticalGroup(
                informacion_Curso_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(informacion_Curso_JPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(informacion_Curso_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imagen_Curso_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descripcion_Curso_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(informacion_Curso_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(descripcion_Profesor_JScrollPane)
                        .addComponent(imagen_Profesor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(informacion_Curso_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(intereses_Tematicas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addComponent(fecha_Creacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, 0))
            );

            informacion_Curso_JScrollPane.setViewportView(informacion_Curso_JPanel);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                        .addComponent(informacion_Curso_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(32, 32, 32))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(informacion_Curso_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    private void enrolarme_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolarme_JButtonMouseClicked
        if(SwingUtilities.isLeftMouseButton(evt)){
            
            int resultado = JOptionPane.showConfirmDialog(CourseRoom_Frame.getInstance(),
                    "¿Estás Segur@ De Enrolarte En El Curso?", "Pregunta De Confirmación", 
                    JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if(resultado == JOptionPane.YES_OPTION){
                SwingUtilities.invokeLater(() -> {
                    ResponseModel response = CourseRoom.Solicitudes().Enrolar_Usuario_Curso(Id_Curso,
                            Tablero_Estudiante_Panel.Id_Usuario());

                    if (response.Is_Success()) {
                        Curso_Estudiante_Panel curso_Estudiante_Panel
                                = new Curso_Estudiante_Panel(/*nombre_Curso, imagen_Curso, nombre_Profesor, imagen_Profesor, fecha_Creacion, ID,*/-1);
                        Tablero_Estudiante_Panel.Agregar_Vista(curso_Estudiante_Panel, ID);
                        CourseRoom.Utilerias().Mensaje_Informativo("Enrolar Curso", response.Mensaje());
                    } else {
                        CourseRoom.Utilerias().Mensaje_Alerta("Enrolar Curso", response.Mensaje());
                    }
                });
                Tablero_Estudiante_Panel.Mostrar_Vista("Cursos");
                Tablero_Estudiante_Panel.Retirar_Vista(this);
                this.Limpiar();
            }
        }
    }//GEN-LAST:event_enrolarme_JButtonMouseClicked

    private void regresar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Estudiante_Panel.Mostrar_Vista("Cursos");
        }
    }//GEN-LAST:event_regresar_JButtonMouseClicked

    private void regresar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_regresar_JButtonMouseEntered

    private void regresar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseExited
        // TODO add your handling code here:
        regresar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_regresar_JButtonMouseExited

    private void enrolarme_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolarme_JButtonMouseEntered
        // TODO add your handling code here:
        enrolarme_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        enrolarme_JButton.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
    }//GEN-LAST:event_enrolarme_JButtonMouseEntered

    private void enrolarme_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolarme_JButtonMouseExited
        // TODO add your handling code here:
        enrolarme_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        enrolarme_JButton.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
    }//GEN-LAST:event_enrolarme_JButtonMouseExited

    private void Agregar_Interes_Tematica(String id, String interes_Tematica){
        
        DefaultTableModel modelo = (DefaultTableModel) intereses_Tematicas_JTable.getModel();
        Celda_Renderer[] celdas = new Celda_Renderer[1];
        Celda_Renderer celda;
        
        celda = new Celda_Renderer(interes_Tematica,id);
        celdas[0] = celda;
        modelo.addRow(celdas);
        
        intereses_Tematicas_JTable.setRowHeight(modelo.getRowCount()-1, CourseRoom.Utilerias().Altura_Fila_Tabla(interes_Tematica.length()));
        
    }
    
    public int Id_Curso() {
        return Id_Curso;
    }
    
    private void Obtener_Datos_Generales_Curso(){
        
        DatosGeneralesCursoModel datosGeneralesCursoModel = 
                CourseRoom.Solicitudes().Obtener_Datos_Generales_Curso(Id_Curso);
        
        if(!datosGeneralesCursoModel.Nombre().isBlank()){
            titulo_JLabel.setText(datosGeneralesCursoModel.Nombre());
            fecha_Creacion_JLabel.setText(CourseRoom.Utilerias().Concatenar("Creado el ", datosGeneralesCursoModel.Fecha_Creacion()));
            descripcion_Profesor_JTextPane.setText(CourseRoom.Utilerias().Formato_HTML_Izquierda(
                    CourseRoom.Utilerias().Concatenar(datosGeneralesCursoModel.Nombre_Completo(),":<br>",datosGeneralesCursoModel.Descripcion_Profesor())));
            descripcion_Curso_JTextPane.setText(CourseRoom.Utilerias().Formato_HTML_Izquierda(datosGeneralesCursoModel.Descripcion()));
            
            byte[] bytes_Imagen = CourseRoom.Solicitudes().Obtener_Imagen_Perfil(datosGeneralesCursoModel.Id_Profesor());
            Image imagen;
            ImageIcon icono;
            if (bytes_Imagen != null) {

                if (bytes_Imagen.length > 0) {

                    imagen = CourseRoom.Utilerias().Obtener_Imagen(bytes_Imagen);

                    if (imagen != null) {

                        imagen = imagen.getScaledInstance(450, 450, Image.SCALE_SMOOTH);
                        icono = new ImageIcon(imagen);
                        imagen_Profesor_JLabel.setIcon(icono);

                    }
                }
            }

            bytes_Imagen = CourseRoom.Solicitudes().Obtener_Imagen_Curso(Id_Curso);
            if (bytes_Imagen != null) {

                if (bytes_Imagen.length > 0) {

                    imagen = CourseRoom.Utilerias().Obtener_Imagen(bytes_Imagen);

                    if (imagen != null) {

                        imagen = imagen.getScaledInstance(450, 450, Image.SCALE_SMOOTH);
                        icono = new ImageIcon(imagen);
                        imagen_Curso_JLabel.setIcon(icono);
                        imagen.flush();

                    }
                }
            }
            
        }    
          
    }
    
    private void Obtener_Tematicas_Curso(){
        
        DefaultTableModel modelo = (DefaultTableModel) intereses_Tematicas_JTable.getModel();
        modelo.setRowCount(0);
        
        Lista<ComboOptionModel> tematicas = CourseRoom.Solicitudes().Obtener_Tematicas_Curso(Id_Curso);
        
        while(!tematicas.is_empty()){
            Agregar_Tematica(tematicas.delist());
        }
        
    }
    
    private void Agregar_Tematica(ComboOptionModel comboOptionModel){
        
        DefaultTableModel modelo = (DefaultTableModel) intereses_Tematicas_JTable.getModel();
        
        Celda_Renderer[] celdas = new Celda_Renderer[1];
        
        Celda_Renderer celda = new Celda_Renderer(comboOptionModel.Valor(), comboOptionModel.Id().toString());
        celdas[0] = celda;
        
        modelo.addRow(celdas);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane descripcion_Curso_JScrollPane;
    private javax.swing.JTextPane descripcion_Curso_JTextPane;
    private javax.swing.JScrollPane descripcion_Profesor_JScrollPane;
    private javax.swing.JTextPane descripcion_Profesor_JTextPane;
    private javax.swing.JButton enrolarme_JButton;
    private javax.swing.JLabel fecha_Creacion_JLabel;
    private javax.swing.JLabel imagen_Curso_JLabel;
    private javax.swing.JLabel imagen_Profesor_JLabel;
    private javax.swing.JPanel informacion_Curso_JPanel;
    private javax.swing.JScrollPane informacion_Curso_JScrollPane;
    private javax.swing.JScrollPane intereses_Tematicas_JScrollPane;
    private javax.swing.JTable intereses_Tematicas_JTable;
    private javax.swing.JButton regresar_JButton;
    private javax.swing.JLabel titulo_JLabel;
    private javax.swing.JPanel titulo_JPanel;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void Iniciar_Componentes() {
      
        //Informacion curso:
        
        informacion_Curso_JScrollPane.getViewport().setOpaque(false);
        informacion_Curso_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        informacion_Curso_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        descripcion_Curso_JScrollPane.getViewport().setOpaque(false);
        descripcion_Curso_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        descripcion_Curso_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        descripcion_Profesor_JScrollPane.getViewport().setOpaque(false);
        descripcion_Profesor_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        descripcion_Profesor_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        intereses_Tematicas_JScrollPane.getViewport().setOpaque(false);
        intereses_Tematicas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        intereses_Tematicas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        Font gadugi = new Font("Segoe UI", Font.BOLD, 16);
        intereses_Tematicas_JTable.getTableHeader().setFont(gadugi);
        intereses_Tematicas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());       
    }

    @Override
    public void Colorear_Componentes() {
        
        titulo_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        titulo_JLabel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        regresar_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        enrolarme_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        enrolarme_JButton.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
      
        // Informacion curso:        
        Font fuente = new Font("Segoe UI", 0, 18);
        BevelBorder borde_Linea = new BevelBorder(BevelBorder.LOWERED);
        TitledBorder borde_Titulo = new TitledBorder(borde_Linea, "Descripción Del Curso", TitledBorder.CENTER,
                TitledBorder.TOP,  fuente, CourseRoom.Utilerias().Tercer_Color_Fuente());

        descripcion_Curso_JScrollPane.setBorder(borde_Titulo);
        
        borde_Titulo = new TitledBorder(borde_Linea, "Descripción Del Profesor", TitledBorder.CENTER,
                TitledBorder.TOP,  fuente, CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        descripcion_Profesor_JScrollPane.setBorder(borde_Titulo);
        
        descripcion_Curso_JTextPane.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        descripcion_Profesor_JTextPane.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        fecha_Creacion_JLabel.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        DefaultTableModel modelo = (DefaultTableModel) intereses_Tematicas_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            celda = (Celda_Renderer) modelo.getValueAt(i, 0);
            celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
        }
        
        intereses_Tematicas_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        intereses_Tematicas_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        intereses_Tematicas_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        intereses_Tematicas_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        intereses_Tematicas_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        intereses_Tematicas_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        intereses_Tematicas_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
    }

    @Override
    public void Limpiar() {
        DefaultTableModel modelo = (DefaultTableModel) intereses_Tematicas_JTable.getModel();
        modelo.setRowCount(0);
    }
}
