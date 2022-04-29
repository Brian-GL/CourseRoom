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
package paneles.estudiantes.tareas;

import clases.Celda_Renderer;
import courseroom.CourseRoom;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelos.TareasEstudianteModel;
import paneles.estudiantes.Tablero_Estudiante_Panel;

/**
 *
 * @author LENOVO
 */
public class Tareas_Estudiante_Panel extends JLayeredPane implements Limpieza_Interface, Componentes_Interface{

    private static Lista<Tarea_Estudiante_Panel> mostrar_Tareas_Lista;
    private Lista<Tarea_Estudiante_Panel> buscar_Tareas_Lista;
    
    /**
     * Creates new form Tareas_Estudiante
     */
    public Tareas_Estudiante_Panel() {
        initComponents();
        
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

        mostrar_Tareas_JPanel = new javax.swing.JPanel();
        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        acciones_JPanel = new javax.swing.JPanel();
        actualizar_JButton = new javax.swing.JButton();
        buscar_Tareas_JButton = new javax.swing.JButton();
        mostrar_Tareas_JScrollPane = new javax.swing.JScrollPane();
        mostrar_Tareas_JTable = new javax.swing.JTable();
        buscar_Tareas_JPanel = new javax.swing.JPanel();
        buscar_JTextField = new javax.swing.JTextField();
        mostrar_Tareas_JButton = new javax.swing.JButton();
        buscar_Tareas_JScrollPane = new javax.swing.JScrollPane();
        buscar_Tareas_JTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1110, 630));
        setLayout(new java.awt.CardLayout());

        mostrar_Tareas_JPanel.setOpaque(false);
        mostrar_Tareas_JPanel.setPreferredSize(new java.awt.Dimension(1080, 630));

        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));
        contenido_Titulo_JPanel.setOpaque(false);
        contenido_Titulo_JPanel.setLayout(new java.awt.BorderLayout());

        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Tareas");
        titulo_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));
        contenido_Titulo_JPanel.add(titulo_JLabel, java.awt.BorderLayout.WEST);

        acciones_JPanel.setOpaque(false);

        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/updated.png"))); // NOI18N
        actualizar_JButton.setToolTipText("<html> <h4>Actulizar<br>Página</h4> </html>");
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

        buscar_Tareas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/search.png"))); // NOI18N
        buscar_Tareas_JButton.setToolTipText("<html> <h3>Buscar<br>tarea(s)</h3> </html>");
        buscar_Tareas_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)buscar_Tareas_JButton.getIcon()).getImage().flush();
        buscar_Tareas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_Tareas_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_Tareas_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscar_Tareas_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout acciones_JPanelLayout = new javax.swing.GroupLayout(acciones_JPanel);
        acciones_JPanel.setLayout(acciones_JPanelLayout);
        acciones_JPanelLayout.setHorizontalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(buscar_Tareas_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizar_JButton)
                .addGap(0, 0, 0))
        );
        acciones_JPanelLayout.setVerticalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_Tareas_JButton)
                    .addComponent(actualizar_JButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenido_Titulo_JPanel.add(acciones_JPanel, java.awt.BorderLayout.EAST);

        mostrar_Tareas_JScrollPane.setBorder(null);
        mostrar_Tareas_JScrollPane.setOpaque(false);

        mostrar_Tareas_JTable.setAutoCreateRowSorter(true);
        mostrar_Tareas_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mostrar_Tareas_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Tarea", "Curso", "Creada El", "Entrega", "Estatus"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false,false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }

                @Override
                public Class getColumnClass(int column)
                {
                    for(int i = 0; i < mostrar_Tareas_JTable.getRowCount(); i++)
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
            mostrar_Tareas_JTable.setRowHeight(96);
            mostrar_Tareas_JTable.setShowGrid(true);
            mostrar_Tareas_JTable.setSurrendersFocusOnKeystroke(true);
            mostrar_Tareas_JTable.setRowSorter(new TableRowSorter(mostrar_Tareas_JTable.getModel()));
            mostrar_Tareas_JTable.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    if (e.getClickCount() == 2) {

                        JTable tabla = (JTable)e.getComponent();
                        int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                        int columna = tabla.getSelectedColumn();

                        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

                        Celda_Renderer celda = (Celda_Renderer)modelo.getValueAt(fila,columna);

                        Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                    }
                }
            });
            mostrar_Tareas_JScrollPane.setViewportView(mostrar_Tareas_JTable);

            javax.swing.GroupLayout mostrar_Tareas_JPanelLayout = new javax.swing.GroupLayout(mostrar_Tareas_JPanel);
            mostrar_Tareas_JPanel.setLayout(mostrar_Tareas_JPanelLayout);
            mostrar_Tareas_JPanelLayout.setHorizontalGroup(
                mostrar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Tareas_JPanelLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(mostrar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrar_Tareas_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(32, 32, 32))
            );
            mostrar_Tareas_JPanelLayout.setVerticalGroup(
                mostrar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Tareas_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(mostrar_Tareas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addContainerGap())
            );

            add(mostrar_Tareas_JPanel, "Mostrar");

            buscar_Tareas_JPanel.setOpaque(false);
            buscar_Tareas_JPanel.setPreferredSize(new java.awt.Dimension(1080, 630));

            buscar_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
            buscar_JTextField.setToolTipText("<html>\n<h3>Buscar tarea(s). Presiona ENTER para realizar la búsqueda</h3>\n</html>");
            buscar_JTextField.setBorder(null);
            buscar_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    buscar_JTextFieldKeyPressed(evt);
                }
            });

            mostrar_Tareas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/homework_5.png"))); // NOI18N
            mostrar_Tareas_JButton.setToolTipText("<html>\n<h3>Regresar a la página de tareas</h3>\n</html>");
            mostrar_Tareas_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            mostrar_Tareas_JButton.setMaximumSize(new java.awt.Dimension(64, 64));
            mostrar_Tareas_JButton.setMinimumSize(new java.awt.Dimension(64, 64));
            mostrar_Tareas_JButton.setPreferredSize(new java.awt.Dimension(64, 64));
            ((ImageIcon)mostrar_Tareas_JButton.getIcon()).getImage().flush();
            mostrar_Tareas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    mostrar_Tareas_JButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    mostrar_Tareas_JButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    mostrar_Tareas_JButtonMouseExited(evt);
                }
            });

            buscar_Tareas_JScrollPane.setBorder(null);
            buscar_Tareas_JScrollPane.setOpaque(false);

            buscar_Tareas_JTable.setAutoCreateRowSorter(true);
            buscar_Tareas_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            buscar_Tareas_JTable.setModel(

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
                        for(int i = 0; i < buscar_Tareas_JTable.getRowCount(); i++)
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
                buscar_Tareas_JTable.setRowHeight(96);
                buscar_Tareas_JTable.setShowGrid(true);
                buscar_Tareas_JTable.setSurrendersFocusOnKeystroke(true);
                buscar_Tareas_JTable.setRowSorter(new TableRowSorter(buscar_Tareas_JTable.getModel()));
                buscar_Tareas_JTable.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (e.getClickCount() == 2) {

                            JTable tabla = (JTable) e.getComponent();
                            int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                            int columna = tabla.getSelectedColumn();

                            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

                            Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                            Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                        }
                    }
                });
                buscar_Tareas_JScrollPane.setViewportView(buscar_Tareas_JTable);

                javax.swing.GroupLayout buscar_Tareas_JPanelLayout = new javax.swing.GroupLayout(buscar_Tareas_JPanel);
                buscar_Tareas_JPanel.setLayout(buscar_Tareas_JPanelLayout);
                buscar_Tareas_JPanelLayout.setHorizontalGroup(
                    buscar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscar_Tareas_JPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(buscar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscar_Tareas_JPanelLayout.createSequentialGroup()
                                .addComponent(mostrar_Tareas_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscar_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
                            .addComponent(buscar_Tareas_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                );
                buscar_Tareas_JPanelLayout.setVerticalGroup(
                    buscar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscar_Tareas_JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buscar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mostrar_Tareas_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar_JTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_Tareas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                        .addContainerGap())
                );

                add(buscar_Tareas_JPanel, "Buscar");
            }// </editor-fold>//GEN-END:initComponents

    private void buscar_Tareas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Tareas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)this.getLayout()).show(this,"Buscar");
        }
    }//GEN-LAST:event_buscar_Tareas_JButtonMouseClicked

    private void buscar_Tareas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Tareas_JButtonMouseEntered
        // TODO add your handling code here:
        buscar_Tareas_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_buscar_Tareas_JButtonMouseEntered

    private void buscar_Tareas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Tareas_JButtonMouseExited
        // TODO add your handling code here:
        buscar_Tareas_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_buscar_Tareas_JButtonMouseExited

    private void buscar_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_JTextFieldKeyPressed
        int longitud = buscar_JTextField.getText().length();
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            if (longitud > 99) {
            buscar_JTextField.setText(buscar_JTextField.getText().substring(0, longitud - 1));
            CourseRoom.Utilerias().Mensaje_Alerta("Alerta!!!","La Busqueda De Tareas<br>Rebasa Los 100 Caracteres");
          }else{
                SwingUtilities.invokeLater(() -> {
                    Buscar_Tareas(buscar_JTextField.getText());
                });
            }
        }
    }//GEN-LAST:event_buscar_JTextFieldKeyPressed

    private void mostrar_Tareas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Tareas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)this.getLayout()).show(this,"Mostrar");
        }
    }//GEN-LAST:event_mostrar_Tareas_JButtonMouseClicked

    private void mostrar_Tareas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Tareas_JButtonMouseEntered
        // TODO add your handling code here:
        mostrar_Tareas_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_mostrar_Tareas_JButtonMouseEntered

    private void mostrar_Tareas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Tareas_JButtonMouseExited
        // TODO add your handling code here:
        mostrar_Tareas_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
    }//GEN-LAST:event_mostrar_Tareas_JButtonMouseExited

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Obtener_Tareas(true);
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

    private void Agregar_Tarea(TareasEstudianteModel tareasEstudianteModel){
        
        DefaultTableModel modelo_Mostrar_Tareas = (DefaultTableModel) mostrar_Tareas_JTable.getModel();
        
        String id_Tarea = CourseRoom.Utilerias().Concatenar("Tarea_", tareasEstudianteModel.Id_Tarea());
        
        Celda_Renderer[] celdas = new Celda_Renderer[5];
        Celda_Renderer celda;
        
        celda = new Celda_Renderer(tareasEstudianteModel.Nombre(), id_Tarea);
        celdas[0] = celda;
        
        byte[] bytes_Imagen_Curso = CourseRoom.Solicitudes().Obtener_Imagen_Curso(tareasEstudianteModel.Id_Curso());
        
        if(bytes_Imagen_Curso.length > 0 ){
            
            Image imagen_Curso = CourseRoom.Utilerias().Obtener_Imagen(bytes_Imagen_Curso);
            if(imagen_Curso != null){
                imagen_Curso = imagen_Curso.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
                
                ImageIcon icono_Curso = new ImageIcon(imagen_Curso);
                celda = new Celda_Renderer(icono_Curso,tareasEstudianteModel.Nombre_Curso(),id_Tarea);
                celdas[1] = celda;
                
                icono_Curso.getImage().flush();
                
            }else{
                celda = new Celda_Renderer(tareasEstudianteModel.Nombre_Curso(),id_Tarea);
                celdas[1] = celda;
            }
            
        }else{
            celda = new Celda_Renderer(tareasEstudianteModel.Nombre_Curso(),id_Tarea);
            celdas[1] = celda;
        }
        
        celda = new Celda_Renderer(tareasEstudianteModel.Fecha_Creacion(), id_Tarea);
        celdas[2] = celda;
        celda = new Celda_Renderer(tareasEstudianteModel.Fecha_Entrega(), id_Tarea);
        celdas[3] = celda;
        celda = new Celda_Renderer(tareasEstudianteModel.Estatus(), id_Tarea);
        celdas[4] = celda;
        
        modelo_Mostrar_Tareas.addRow(celdas);
        
        Tarea_Estudiante_Panel tarea_Estudiante_Panel =
                new Tarea_Estudiante_Panel(tareasEstudianteModel.Id_Tarea());
        
        mostrar_Tareas_Lista.push_back(tarea_Estudiante_Panel);
        
        Tablero_Estudiante_Panel.Agregar_Vista(tarea_Estudiante_Panel, id_Tarea);
    }
    
    private void Obtener_Tareas(boolean bandera){
        
        DefaultTableModel modelo = (DefaultTableModel) mostrar_Tareas_JTable.getModel();
        modelo.setRowCount(0);
        
        Tarea_Estudiante_Panel tarea_Estudiante_Panel;
        while(!mostrar_Tareas_Lista.is_empty()){
            tarea_Estudiante_Panel  = mostrar_Tareas_Lista.delist();
            Tablero_Estudiante_Panel.Retirar_Vista(tarea_Estudiante_Panel);
        }
        SwingUtilities.invokeLater(() -> {
            Lista<TareasEstudianteModel> tareas_Estudiante
                    = CourseRoom.Solicitudes().Obtener_Tareas_Estudiante(Tablero_Estudiante_Panel.Id_Usuario());
            if(!tareas_Estudiante.is_empty()){
                while (!tareas_Estudiante.is_empty()) {
                    Agregar_Tarea(tareas_Estudiante.delist());
                }
            }else{
                if(bandera){
                    CourseRoom.Utilerias().Mensaje_Alerta("Obtener Tareas", "No Se Obtuvieron Las Tareas");
                }
            }
        });
    }
    
    private void Buscar_Tareas(String busqueda){
        
        DefaultTableModel modelo = (DefaultTableModel) buscar_Tareas_JTable.getModel();
        modelo.setRowCount(0);
        
        Tarea_Estudiante_Panel tarea_Estudiante_Panel;
        while(!buscar_Tareas_Lista.is_empty()){
            tarea_Estudiante_Panel = buscar_Tareas_Lista.delist();
            Tablero_Estudiante_Panel.Retirar_Vista(tarea_Estudiante_Panel);
            tarea_Estudiante_Panel.Limpiar();
        }
        
        
        SwingUtilities.invokeLater(() -> {
            Lista<TareasEstudianteModel> lista
                    = CourseRoom.Solicitudes().Buscar_Tareas(busqueda, Tablero_Estudiante_Panel.Id_Usuario());
            if (!lista.is_empty()) {
                while (!lista.is_empty()) {
                    Agregar_Tarea_Busqueda(lista.delist());
                }
            } else {
                CourseRoom.Utilerias().Mensaje_Alerta("Alerta", "No Se Encontraron Registros");
            }
        });
    }
    
    public void Agregar_Tarea_Busqueda(TareasEstudianteModel tareasEstudianteModel) {
        String id_Tarea = CourseRoom.Utilerias().Concatenar("Tarea_",tareasEstudianteModel.Id_Tarea());
        
        Celda_Renderer[] celdas = new Celda_Renderer[5];
        Celda_Renderer celda;
        
        Image imagen;
        byte[] bytes_Imagen = CourseRoom.Solicitudes().Obtener_Imagen_Curso(tareasEstudianteModel.Id_Curso());
        
        if(bytes_Imagen.length > 0){
            
            imagen = CourseRoom.Utilerias().Obtener_Imagen(bytes_Imagen);
            
            if(imagen != null){
                
                imagen = imagen.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
                ImageIcon icono_Imagen = new ImageIcon(imagen);
                celda =  new Celda_Renderer(icono_Imagen,tareasEstudianteModel.Nombre_Curso(), id_Tarea);
                celdas[1] = celda;
            }else{
                celda =  new Celda_Renderer(tareasEstudianteModel.Nombre_Curso(), id_Tarea);
                celdas[1] = celda;
            }
        }
        
        celda = new Celda_Renderer(tareasEstudianteModel.Nombre(),id_Tarea);
        celdas[0] = celda;
        celda = new Celda_Renderer(tareasEstudianteModel.Fecha_Creacion(),id_Tarea);
        celdas[2] = celda;
        celda = new Celda_Renderer(tareasEstudianteModel.Fecha_Entrega(),id_Tarea);
        celdas[3] = celda;
        celda = new Celda_Renderer(tareasEstudianteModel.Estatus(),id_Tarea);
        celdas[4] = celda;
        
        DefaultTableModel modelo = (DefaultTableModel) buscar_Tareas_JTable.getModel();
        modelo.insertRow(0, celdas);
        buscar_Tareas_JTable.setRowHeight(modelo.getRowCount()-1, CourseRoom.Utilerias().Altura_Fila_Tabla_Icono(tareasEstudianteModel.Nombre().length()));
        
        if(!Existe_Tarea(tareasEstudianteModel.Id_Tarea())){

            Tarea_Estudiante_Panel tarea_Estudiante_Panel = 
                    new Tarea_Estudiante_Panel(tareasEstudianteModel.Id_Tarea());

            buscar_Tareas_Lista.push_back(tarea_Estudiante_Panel);

            Tablero_Estudiante_Panel.Agregar_Vista(tarea_Estudiante_Panel, id_Tarea);
        }
    }
    
    public static boolean Existe_Tarea(int id_Tarea){
        Nodo<Tarea_Estudiante_Panel> first = mostrar_Tareas_Lista.front();
        Nodo<Tarea_Estudiante_Panel> last = mostrar_Tareas_Lista.back();

        int middle_index = (mostrar_Tareas_Lista.size())/2;

        if(middle_index % 2 == 0){
            for (int i = 0; i < middle_index; i++) {

                if (first.element().Id_Tarea() == id_Tarea){
                    return true;
                }
                if (last.element().Id_Tarea() == id_Tarea){
                    return true;
                }
                first = first.next();
                last = last.previous();
            }
            return false;
        }else{
            for(int i = 0; i < middle_index;i++) {
                if(first.element().Id_Tarea() == id_Tarea){
                    return true;
                }
                if(last.element().Id_Tarea() == id_Tarea){
                    return true;
                }
                first = first.next();
                last = last.previous();
            }
            return mostrar_Tareas_Lista.medium().Id_Tarea() == id_Tarea;
        }      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acciones_JPanel;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JTextField buscar_JTextField;
    private javax.swing.JButton buscar_Tareas_JButton;
    private javax.swing.JPanel buscar_Tareas_JPanel;
    private javax.swing.JScrollPane buscar_Tareas_JScrollPane;
    private static javax.swing.JTable buscar_Tareas_JTable;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JButton mostrar_Tareas_JButton;
    private javax.swing.JPanel mostrar_Tareas_JPanel;
    private javax.swing.JScrollPane mostrar_Tareas_JScrollPane;
    private javax.swing.JTable mostrar_Tareas_JTable;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        mostrar_Tareas_JScrollPane.getViewport().setOpaque(false);
        mostrar_Tareas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        mostrar_Tareas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        mostrar_Tareas_Lista = new Lista<>();
        
        Font gadugi = new Font("Segoe UI", Font.BOLD, 16);
        mostrar_Tareas_JTable.getTableHeader().setFont(gadugi);

        mostrar_Tareas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());

        buscar_Tareas_JScrollPane.getViewport().setOpaque(false);
        buscar_Tareas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        buscar_Tareas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        buscar_Tareas_Lista = new Lista<>();

        buscar_Tareas_JTable.getTableHeader().setFont(gadugi);

        buscar_Tareas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        Obtener_Tareas(false);
    }

    @Override
    public void Colorear_Componentes() {
        
        contenido_Titulo_JPanel.setBackground(CourseRoom.Utilerias().Segundo_Color());

        titulo_JLabel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());

        buscar_Tareas_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());

        mostrar_Tareas_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        mostrar_Tareas_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        mostrar_Tareas_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        mostrar_Tareas_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        mostrar_Tareas_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        mostrar_Tareas_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        mostrar_Tareas_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        buscar_Tareas_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        buscar_Tareas_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        buscar_Tareas_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        buscar_Tareas_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        buscar_Tareas_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        buscar_Tareas_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        buscar_Tareas_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());

        DefaultTableModel modelo = (DefaultTableModel) mostrar_Tareas_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }
        
        Tarea_Estudiante_Panel tarea_Estudiante_Panel;
        for (Nodo<Tarea_Estudiante_Panel> nodo = mostrar_Tareas_Lista.front(); nodo != null; nodo = nodo.next()) {
            tarea_Estudiante_Panel = nodo.element();
            tarea_Estudiante_Panel.Colorear_Componentes();
        }
        
        Font fuente = new java.awt.Font("Segoe UI", 1, 14);
        BevelBorder borde_Linea = new BevelBorder(BevelBorder.LOWERED);
        TitledBorder borde_Titulo = new TitledBorder(borde_Linea, "Buscar Tarea(s)", TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.TOP,  fuente, CourseRoom.Utilerias().Tercer_Color_Fuente());
        
        buscar_JTextField.setBorder(borde_Titulo);

        buscar_JTextField.setBackground(CourseRoom.Utilerias().Segundo_Color());
        buscar_JTextField.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        buscar_JTextField.setCaretColor(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());

        mostrar_Tareas_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());

        modelo = (DefaultTableModel) buscar_Tareas_JTable.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }
        
        for (Nodo<Tarea_Estudiante_Panel> nodo = buscar_Tareas_Lista.front(); nodo != null; nodo = nodo.next()) {
            tarea_Estudiante_Panel = nodo.element();
            tarea_Estudiante_Panel.Colorear_Componentes();
        }
    }
    
    @Override
    public void Limpiar() {
        mostrar_Tareas_Lista.clear();
        DefaultTableModel modelo = (DefaultTableModel) mostrar_Tareas_JTable.getModel();
        modelo.setRowCount(0);
        buscar_Tareas_Lista.clear();
        modelo = (DefaultTableModel) buscar_Tareas_JTable.getModel();
        modelo.setRowCount(0);
    }
}
