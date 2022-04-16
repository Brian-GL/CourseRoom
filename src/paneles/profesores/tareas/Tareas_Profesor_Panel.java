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
package paneles.profesores.tareas;

import clases.Celda_Renderer;
import courseroom.CourseRoom;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import datos.interfaces.Carta_Visibilidad_Interface;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import paneles.profesores.Tablero_Profesor_Panel;

/**
 *
 * @author LENOVO
 */
public class Tareas_Profesor_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface, Carta_Visibilidad_Interface{

    private Lista<Tarea_Por_Calificar_Profesor_Panel> tareas_Por_Calificar_Lista;
    private Lista<Tarea_Profesor_Panel> tareas_Creadas_Lista; 
    private byte carta_Visible;
    
    /**
     * Creates new form Tareas_Profesor_JPanel
     */
    public Tareas_Profesor_Panel() {
        initComponents();
        Iniciar_Componentes();
        //Obtener_Tareas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        acciones_JPanel = new javax.swing.JPanel();
        actualizar_JButton = new javax.swing.JButton();
        tareas_Creadas_JButton = new javax.swing.JButton();
        tareas_Por_Calificar_JButton = new javax.swing.JButton();
        contenido_JLayeredPane = new javax.swing.JLayeredPane();
        tareas_Por_Calificar_JScrollPane = new javax.swing.JScrollPane();
        tareas_Por_Calificar_JTable = new javax.swing.JTable();
        tareas_Creadas_JScrollPane = new javax.swing.JScrollPane();
        tareas_Creadas_JTable = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 630));

        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));
        contenido_Titulo_JPanel.setOpaque(false);
        contenido_Titulo_JPanel.setLayout(new java.awt.BorderLayout());

        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(450, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(450, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(450, 84));
        titulo_JLabel.setToolTipText("");
        contenido_Titulo_JPanel.add(titulo_JLabel, java.awt.BorderLayout.WEST);

        acciones_JPanel.setOpaque(false);

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

        tareas_Creadas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/homework_6.png"))); // NOI18N
        tareas_Creadas_JButton.setToolTipText("<html> <h3>Buscar tarea(s)</h3> </html>");
        tareas_Creadas_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)tareas_Creadas_JButton.getIcon()).getImage().flush();
        tareas_Creadas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tareas_Creadas_JButtonMouseClicked(evt);
            }
        });

        tareas_Por_Calificar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/homework_4.png"))); // NOI18N
        tareas_Por_Calificar_JButton.setToolTipText("<html> <h3>Buscar tarea(s)</h3> </html>");
        tareas_Por_Calificar_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)tareas_Por_Calificar_JButton.getIcon()).getImage().flush();
        tareas_Por_Calificar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tareas_Por_Calificar_JButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout acciones_JPanelLayout = new javax.swing.GroupLayout(acciones_JPanel);
        acciones_JPanel.setLayout(acciones_JPanelLayout);
        acciones_JPanelLayout.setHorizontalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tareas_Por_Calificar_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tareas_Creadas_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizar_JButton)
                .addGap(0, 0, 0))
        );
        acciones_JPanelLayout.setVerticalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tareas_Por_Calificar_JButton)
                    .addComponent(actualizar_JButton)
                    .addComponent(tareas_Creadas_JButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenido_Titulo_JPanel.add(acciones_JPanel, java.awt.BorderLayout.EAST);

        contenido_JLayeredPane.setLayout(new java.awt.CardLayout());

        tareas_Por_Calificar_JScrollPane.setBorder(null);
        tareas_Por_Calificar_JScrollPane.setOpaque(false);

        tareas_Por_Calificar_JTable.setAutoCreateRowSorter(true);
        tareas_Por_Calificar_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tareas_Por_Calificar_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Tarea", "Curso", "Estudiante", "Entregado El", "Fecha Entrega"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }

                @Override
                public Class getColumnClass(int column)
                {
                    for(int i = 0; i < tareas_Por_Calificar_JTable.getRowCount(); i++)
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
            tareas_Por_Calificar_JTable.setRowHeight(96);
            tareas_Por_Calificar_JTable.setShowGrid(true);
            tareas_Por_Calificar_JTable.setSurrendersFocusOnKeystroke(true);
            tareas_Por_Calificar_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
            tareas_Por_Calificar_JTable.setRowSorter(new TableRowSorter(tareas_Por_Calificar_JTable.getModel()));
            tareas_Por_Calificar_JTable.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    if (e.getClickCount() == 2) {

                        JTable tabla = (JTable)e.getComponent();
                        int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                        int columna = tabla.getSelectedColumn();
                        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                        Celda_Renderer celda = (Celda_Renderer)modelo.getValueAt(fila,columna);
                        Tablero_Profesor_Panel.Mostrar_Vista(celda.ID());
                    }
                }

            });
            tareas_Por_Calificar_JScrollPane.setViewportView(tareas_Por_Calificar_JTable);

            contenido_JLayeredPane.add(tareas_Por_Calificar_JScrollPane, "Calificar");

            tareas_Creadas_JScrollPane.setBorder(null);
            tareas_Creadas_JScrollPane.setOpaque(false);

            tareas_Creadas_JTable.setAutoCreateRowSorter(true);
            tareas_Creadas_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            tareas_Creadas_JTable.setModel(

                new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Tarea", "Curso", "Creada El", "Entrega", "Estatus"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }

                    @Override
                    public Class getColumnClass(int column)
                    {
                        for(int i = 0; i < tareas_Creadas_JTable.getRowCount(); i++)
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
                tareas_Creadas_JTable.setRowHeight(96);
                tareas_Creadas_JTable.setShowGrid(true);
                tareas_Creadas_JTable.setSurrendersFocusOnKeystroke(true);
                tareas_Creadas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
                tareas_Creadas_JTable.setRowSorter(new TableRowSorter(tareas_Creadas_JTable.getModel()));
                tareas_Creadas_JTable.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (e.getClickCount() == 2) {
                            JTable tabla = (JTable)e.getComponent();
                            int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                            int columna = tabla.getSelectedColumn();
                            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                            Celda_Renderer celda = (Celda_Renderer)modelo.getValueAt(fila,columna);
                            Tablero_Profesor_Panel.Mostrar_Vista(celda.ID());

                        }
                    }
                });
                tareas_Creadas_JScrollPane.setViewportView(tareas_Creadas_JTable);

                contenido_JLayeredPane.add(tareas_Creadas_JScrollPane, "Creadas");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contenido_JLayeredPane)
                            .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contenido_JLayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                        .addContainerGap())
                );
            }// </editor-fold>//GEN-END:initComponents

    private void tareas_Por_Calificar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareas_Por_Calificar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)contenido_JLayeredPane.getLayout()).show(contenido_JLayeredPane,"Calificar");
            carta_Visible = 0;
            Carta_Visible();
        }
    }//GEN-LAST:event_tareas_Por_Calificar_JButtonMouseClicked

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            //Obtener_Tareas();
        }
    }//GEN-LAST:event_actualizar_JButtonMouseClicked

    private void actualizar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseEntered
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseEntered

    private void actualizar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseExited
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseExited

    private void tareas_Creadas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareas_Creadas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)contenido_JLayeredPane.getLayout()).show(contenido_JLayeredPane,"Creadas");
            carta_Visible = 1;
            Carta_Visible();
        }
    }//GEN-LAST:event_tareas_Creadas_JButtonMouseClicked

    private void Agregar_Tarea_Creada(String nombre_Tarea, String ruta_Imagen_Curso, String nombre_Curso,
            String fecha_Entrega, String estatus_Tarea, String _id){
        DefaultTableModel modelo_Tareas_Creadas = (DefaultTableModel) tareas_Creadas_JTable.getModel();
        try {
            Celda_Renderer[] celdas = new Celda_Renderer[5];
            String fecha_Creacion = CourseRoom.Utilerias().Fecha_Hora_Local();
            Celda_Renderer celda;
            URL url_Imagen;
            Image imagen;
            ImageIcon icono;
            
            celda = new Celda_Renderer(nombre_Tarea, _id);
            celdas[0] = celda;
            url_Imagen = new URL(ruta_Imagen_Curso);
            imagen = ImageIO.read(url_Imagen);
            icono = new ImageIcon(imagen);
            celda = new Celda_Renderer(icono, nombre_Curso, _id);
            celdas[1] = celda;
            celda = new Celda_Renderer(fecha_Creacion, _id);
            celdas[2] = celda;
            celda = new Celda_Renderer(fecha_Entrega, _id);
            celdas[3] = celda;
            celda = new Celda_Renderer(estatus_Tarea, _id);
            celdas[4] = celda;
            
            Tarea_Profesor_Panel tarea_Profesor_Panel =
                    new Tarea_Profesor_Panel(/*nombre_Tarea,nombre_Curso,
                            fecha_Creacion, fecha_Entrega, estatus_Tarea, _id,*/-1);
            tareas_Creadas_Lista.push_back(tarea_Profesor_Panel);
            
            modelo_Tareas_Creadas.addRow(celdas);
            
            Tablero_Profesor_Panel.Agregar_Vista(tarea_Profesor_Panel, _id);
            
            imagen.flush();
            
        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            CourseRoom.Utilerias().Mensaje_Error("Error Al Agregar La Tarea Creada",ex.getMessage());
        }
    }
    
    private void Agregar_Tarea_Por_Calificar(String nombre_Tarea, String ruta_Imagen_Curso, String nombre_Curso, String ruta_Imagen_Estudiante,
            String nombre_Estudiante, String fecha_Creacion, String fecha_Entregada, String fecha_Entrega, String _id){
        
        Celda_Renderer[] celdas = new Celda_Renderer[5];
        Celda_Renderer celda;
        URL url_Imagen;
        Image imagen;
        ImageIcon icono;
        
        try {
           
            url_Imagen = new URL(ruta_Imagen_Curso);
            imagen = ImageIO.read(url_Imagen);
            icono = new ImageIcon(imagen);
            
            celda = new Celda_Renderer(nombre_Tarea,_id);
            celdas[0] = celda;
            celda = new Celda_Renderer(icono, nombre_Curso, _id);
            celdas[1] = celda;
            
            url_Imagen = new URL(ruta_Imagen_Estudiante);
            imagen = ImageIO.read(url_Imagen);
            
            icono = new ImageIcon(imagen);
            celda = new Celda_Renderer(icono,nombre_Estudiante, _id);
            celdas[2] = celda;
            celda = new Celda_Renderer(fecha_Entregada,_id);
            celdas[3] = celda;
            celda = new Celda_Renderer(fecha_Entrega, _id);
            celdas[4] = celda;
            
//            Tarea_Por_Calificar_Profesor_Panel tarea_Entregada_Profesor_Panel =
//                    new Tarea_Por_Calificar_Profesor_Panel(nombre_Tarea,nombre_Curso,
//                            fecha_Creacion, fecha_Entrega, fecha_Entregada, "Por Calificar");
//            
//            tareas_Por_Calificar_Lista.push_back(tarea_Entregada_Profesor_Panel);
            
            DefaultTableModel modelo = (DefaultTableModel) tareas_Por_Calificar_JTable.getModel();
            modelo.addRow(celdas);
            
//            Tablero_Profesor_Panel.Agregar_Vista(tarea_Entregada_Profesor_Panel, _id);
            
            imagen.flush();
            
        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            
        }
           
    }
    
    /*private void Obtener_Tareas(){
        
        DefaultTableModel modelo_Tareas_Creadas = (DefaultTableModel) tareas_Creadas_JTable.getModel();
        modelo_Tareas_Creadas.setRowCount(0);
        
        Tarea_Profesor_Panel tarea_Profesor_Panel;
        while(!mostrar_Tareas_Lista.is_empty()){
            tarea_Profesor_Panel  = mostrar_Tareas_Lista.delist();
            tarea_Profesor_Panel.Retirar_Vista(tarea_Profesor_Panel);
        }
        
        
        Lista<TareasEstudianteModel> tareas_Estudiante 
                = CourseRoom.Solicitudes().Obtener_Tareas_Estudiante(Tablero_Profesor_Panel.Id_Usuario());
        
        while(!tareas_Estudiante.is_empty()){
            Agregar_Tarea(tareas_Estudiante.delist());
        }
        
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acciones_JPanel;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JLayeredPane contenido_JLayeredPane;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JButton tareas_Creadas_JButton;
    private javax.swing.JScrollPane tareas_Creadas_JScrollPane;
    private javax.swing.JTable tareas_Creadas_JTable;
    private javax.swing.JButton tareas_Por_Calificar_JButton;
    private javax.swing.JScrollPane tareas_Por_Calificar_JScrollPane;
    private javax.swing.JTable tareas_Por_Calificar_JTable;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        carta_Visible = 0;
        tareas_Creadas_Lista = new Lista<>();
        tareas_Por_Calificar_Lista = new Lista<>();
        Font gadugi = new Font("Segoe UI", Font.BOLD, 16);
        
        tareas_Por_Calificar_JScrollPane.getViewport().setOpaque(false);
        tareas_Por_Calificar_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        tareas_Por_Calificar_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        tareas_Creadas_JScrollPane.getViewport().setOpaque(false);
        tareas_Creadas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        tareas_Creadas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        tareas_Creadas_JTable.getTableHeader().setFont(gadugi);
        tareas_Por_Calificar_JTable.getTableHeader().setFont(gadugi);
        
        DefaultTableModel modelo_Tareas_Creadas = (DefaultTableModel) tareas_Creadas_JTable.getModel();
        
        String _id, ruta_Imagen_Curso, ruta_Imagen_Estudiante;
        String nombre_Tarea,nombre_Curso, nombre_Estudiante, fecha_Creacion, fecha_Entregado, fecha_Entrega, estatus;
        
        _id = "Tarea_Por_Calificar_0";
        ruta_Imagen_Curso = "https://picsum.photos/96/96";
        ruta_Imagen_Estudiante = "https://i.pravatar.cc/96";
        nombre_Tarea = CourseRoom.Utilerias().job().title();
        nombre_Curso = CourseRoom.Utilerias().educator().course();
        nombre_Estudiante = CourseRoom.Utilerias().name().fullName();
        fecha_Creacion = CourseRoom.Utilerias().Fecha_Hora_Local();
        fecha_Entregado = CourseRoom.Utilerias().Fecha_Hora_Local();
        fecha_Entrega = CourseRoom.Utilerias().Fecha_Hora(CourseRoom.Utilerias().date().birthday(22, 23));
        Agregar_Tarea_Por_Calificar(nombre_Tarea, ruta_Imagen_Curso, nombre_Curso, ruta_Imagen_Estudiante,
                nombre_Estudiante, fecha_Creacion, fecha_Entregado, fecha_Entrega, _id);

        _id = "Tarea_Creada_0";

        nombre_Tarea = CourseRoom.Utilerias().university().name();
        nombre_Curso = CourseRoom.Utilerias().educator().course();
        fecha_Entrega = CourseRoom.Utilerias().Fecha_Hora(CourseRoom.Utilerias().date().birthday(22, 23));
        estatus = CourseRoom.Utilerias().bool().bool() ? "Asignada" : "Completada";

        Agregar_Tarea_Creada(nombre_Tarea,ruta_Imagen_Curso, nombre_Curso, fecha_Entrega, estatus, _id);
            
    }

    @Override
    public void Colorear_Componentes() {

        titulo_JLabel.setBackground(CourseRoom.Utilerias().Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());

        tareas_Por_Calificar_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        tareas_Por_Calificar_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        tareas_Por_Calificar_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        tareas_Por_Calificar_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        tareas_Por_Calificar_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        tareas_Por_Calificar_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        tareas_Por_Calificar_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        tareas_Creadas_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        tareas_Creadas_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        tareas_Creadas_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        tareas_Creadas_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        tareas_Creadas_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        tareas_Creadas_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        tareas_Creadas_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        DefaultTableModel modelo = (DefaultTableModel) tareas_Por_Calificar_JTable.getModel();
        DefaultTableModel modelo_Tareas_Creadas = (DefaultTableModel) tareas_Creadas_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }
        
        for (int i = 0; i < modelo_Tareas_Creadas.getRowCount(); i++) {
            for (int j = 0; j < modelo_Tareas_Creadas.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo_Tareas_Creadas.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }
        
        Tarea_Por_Calificar_Profesor_Panel tarea_Entregada_Profesor_Panel;
        for (Nodo<Tarea_Por_Calificar_Profesor_Panel> nodo = tareas_Por_Calificar_Lista.front(); nodo != null; nodo = nodo.next()) {
            tarea_Entregada_Profesor_Panel = nodo.element();
            tarea_Entregada_Profesor_Panel.Colorear_Componentes();
        }
        
        Tarea_Profesor_Panel tarea_Estudiante_Panel;
        for (Nodo<Tarea_Profesor_Panel> nodo = tareas_Creadas_Lista.front(); nodo != null; nodo = nodo.next()) {
            tarea_Estudiante_Panel = nodo.element();
            tarea_Estudiante_Panel.Colorear_Componentes();
        }
        
         Carta_Visible();

    }
    
    @Override
    public void Limpiar() {
        DefaultTableModel modelo_Tareas_Creadas = (DefaultTableModel) tareas_Creadas_JTable.getModel();
        modelo_Tareas_Creadas.setRowCount(0);
        DefaultTableModel modelo = (DefaultTableModel) tareas_Por_Calificar_JTable.getModel();
        modelo.setRowCount(0);
        tareas_Por_Calificar_Lista.clear();
        tareas_Creadas_Lista.clear();
    }

    @Override
    public void Carta_Visible() {
        switch(carta_Visible){
            case 0 -> {
                titulo_JLabel.setText("Tareas Por Calificar");
                tareas_Por_Calificar_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
                tareas_Creadas_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
            }
            case 1 -> {
                titulo_JLabel.setText("Tareas Creadas");
                tareas_Por_Calificar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
                tareas_Creadas_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
            }
        }
    }

}
