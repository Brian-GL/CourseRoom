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

import javax.swing.JLayeredPane;
import clases.Celda_Renderer;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import paneles.estudiantes.Tablero_Estudiante_Panel;
import java.awt.event.KeyEvent;
import modelos.GruposModel;

/**
 *
 * @author LENOVO
 */
public class Grupos_Estudiante_Panel extends JLayeredPane implements Limpieza_Interface, Componentes_Interface{

    private Lista<Grupo_Estudiante_Panel> mostrar_Grupos_Lista;
    private Lista<Grupo_Estudiante_Panel> buscar_Grupos_Lista;
    
    /**
     * Creates new form Pagina_Grupo_Estudiante_PAnel
     */
    public Grupos_Estudiante_Panel() {
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

        mostrar_Grupos_JPanel = new javax.swing.JPanel();
        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        acciones_JPanel = new javax.swing.JPanel();
        actualizar_JButton = new javax.swing.JButton();
        buscar_Grupos_JButton = new javax.swing.JButton();
        mostrar_Grupos_JScrollPane = new javax.swing.JScrollPane();
        mostrar_Grupos_JTable = new javax.swing.JTable();
        buscar_Grupos_JPanel = new javax.swing.JPanel();
        buscar_JTextField = new javax.swing.JTextField();
        mostrar_Grupos_JButton = new javax.swing.JButton();
        buscar_Grupos_JScrollPane = new javax.swing.JScrollPane();
        buscar_Grupos_JTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1110, 630));
        setLayout(new java.awt.CardLayout());

        mostrar_Grupos_JPanel.setOpaque(false);
        mostrar_Grupos_JPanel.setPreferredSize(new java.awt.Dimension(1080, 630));

        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 72));
        contenido_Titulo_JPanel.setOpaque(false);
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(1068, 72));
        contenido_Titulo_JPanel.setLayout(new java.awt.BorderLayout());

        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Grupos");
        titulo_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));
        contenido_Titulo_JPanel.add(titulo_JLabel, java.awt.BorderLayout.WEST);

        acciones_JPanel.setOpaque(false);

        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/updated.png"))); // NOI18N
        actualizar_JButton.setToolTipText("<html><h4>Actualizar<br>Página</h4></html>");
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

        buscar_Grupos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/search.png"))); // NOI18N
        buscar_Grupos_JButton.setToolTipText("<html><h3>Buscar<br>Grupo</h3></html>");
        buscar_Grupos_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)buscar_Grupos_JButton.getIcon()).getImage().flush();
        buscar_Grupos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_Grupos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_Grupos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscar_Grupos_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout acciones_JPanelLayout = new javax.swing.GroupLayout(acciones_JPanel);
        acciones_JPanel.setLayout(acciones_JPanelLayout);
        acciones_JPanelLayout.setHorizontalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(buscar_Grupos_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizar_JButton)
                .addGap(0, 0, 0))
        );
        acciones_JPanelLayout.setVerticalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_Grupos_JButton)
                    .addComponent(actualizar_JButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenido_Titulo_JPanel.add(acciones_JPanel, java.awt.BorderLayout.EAST);

        mostrar_Grupos_JScrollPane.setBorder(null);
        mostrar_Grupos_JScrollPane.setOpaque(false);

        mostrar_Grupos_JTable.setAutoCreateRowSorter(true);
        mostrar_Grupos_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mostrar_Grupos_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Grupo", "Curso","Creado"
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
                    for(int i = 0; i < mostrar_Grupos_JTable.getRowCount(); i++)
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
            mostrar_Grupos_JTable.setRowHeight(110);
            mostrar_Grupos_JTable.setShowGrid(true);
            mostrar_Grupos_JTable.setSurrendersFocusOnKeystroke(true);
            mostrar_Grupos_JTable.setRowSorter(new TableRowSorter(mostrar_Grupos_JTable.getModel()));
            mostrar_Grupos_JTable.addMouseListener(new MouseAdapter() {

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
            mostrar_Grupos_JScrollPane.setViewportView(mostrar_Grupos_JTable);

            javax.swing.GroupLayout mostrar_Grupos_JPanelLayout = new javax.swing.GroupLayout(mostrar_Grupos_JPanel);
            mostrar_Grupos_JPanel.setLayout(mostrar_Grupos_JPanelLayout);
            mostrar_Grupos_JPanelLayout.setHorizontalGroup(
                mostrar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Grupos_JPanelLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(mostrar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                        .addComponent(mostrar_Grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                    .addGap(32, 32, 32))
            );
            mostrar_Grupos_JPanelLayout.setVerticalGroup(
                mostrar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Grupos_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(mostrar_Grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addContainerGap())
            );

            add(mostrar_Grupos_JPanel, "Mostrar");

            buscar_Grupos_JPanel.setOpaque(false);
            buscar_Grupos_JPanel.setPreferredSize(new java.awt.Dimension(1080, 630));

            buscar_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
            buscar_JTextField.setToolTipText("<html>\n<h3>Buscar grupo(s). Presiona ENTER para realizar la búsqueda</h3>\n</html>");
            buscar_JTextField.setBorder(null);
            buscar_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    buscar_JTextFieldKeyPressed(evt);
                }
            });

            mostrar_Grupos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/vegan.png"))); // NOI18N
            mostrar_Grupos_JButton.setToolTipText("<html> <h3>Regresar A Mis Grupos</h3> </html>");
            mostrar_Grupos_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            mostrar_Grupos_JButton.setMaximumSize(new java.awt.Dimension(64, 64));
            mostrar_Grupos_JButton.setMinimumSize(new java.awt.Dimension(64, 64));
            mostrar_Grupos_JButton.setPreferredSize(new java.awt.Dimension(64, 64));
            ((ImageIcon)mostrar_Grupos_JButton.getIcon()).getImage().flush();
            mostrar_Grupos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    mostrar_Grupos_JButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    mostrar_Grupos_JButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    mostrar_Grupos_JButtonMouseExited(evt);
                }
            });

            buscar_Grupos_JScrollPane.setBorder(null);
            buscar_Grupos_JScrollPane.setOpaque(false);

            buscar_Grupos_JTable.setAutoCreateRowSorter(true);
            buscar_Grupos_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            buscar_Grupos_JTable.setModel(

                new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Grupo", "Curso","Creado"
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
                        for(int i = 0; i < buscar_Grupos_JTable.getRowCount(); i++)
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
                buscar_Grupos_JTable.setRowHeight(110);
                buscar_Grupos_JTable.setShowGrid(true);
                buscar_Grupos_JTable.setSurrendersFocusOnKeystroke(true);
                buscar_Grupos_JTable.setRowSorter(new TableRowSorter(buscar_Grupos_JTable.getModel()));
                buscar_Grupos_JTable.addMouseListener(new MouseAdapter() {

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
                buscar_Grupos_JScrollPane.setViewportView(buscar_Grupos_JTable);

                javax.swing.GroupLayout buscar_Grupos_JPanelLayout = new javax.swing.GroupLayout(buscar_Grupos_JPanel);
                buscar_Grupos_JPanel.setLayout(buscar_Grupos_JPanelLayout);
                buscar_Grupos_JPanelLayout.setHorizontalGroup(
                    buscar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscar_Grupos_JPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(buscar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscar_Grupos_JPanelLayout.createSequentialGroup()
                                .addComponent(mostrar_Grupos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscar_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
                            .addComponent(buscar_Grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                );
                buscar_Grupos_JPanelLayout.setVerticalGroup(
                    buscar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscar_Grupos_JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buscar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscar_JTextField)
                            .addComponent(mostrar_Grupos_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_Grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                        .addContainerGap())
                );

                add(buscar_Grupos_JPanel, "Buscar");
            }// </editor-fold>//GEN-END:initComponents

    private void buscar_Grupos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Grupos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout) this.getLayout()).show(this, "Buscar");
        }
    }//GEN-LAST:event_buscar_Grupos_JButtonMouseClicked

    private void buscar_Grupos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Grupos_JButtonMouseEntered
        // TODO add your handling code here:
        buscar_Grupos_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_buscar_Grupos_JButtonMouseEntered

    private void buscar_Grupos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Grupos_JButtonMouseExited
        // TODO add your handling code here:
        buscar_Grupos_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_buscar_Grupos_JButtonMouseExited

    private void buscar_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_JTextFieldKeyPressed
        int longitud = buscar_JTextField.getText().length();
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            if (longitud > 99) {
                buscar_JTextField.setText(buscar_JTextField.getText().substring(0, longitud - 1));
                CourseRoom.Utilerias().Mensaje_Alerta("Alerta!!!","La Busqueda De Grupos<br>Rebasa Los 100 Caracteres");
              }else{
                    SwingUtilities.invokeLater(() -> {
                        Buscar_Grupos(buscar_JTextField.getText());
                    });
                }
            }
    }//GEN-LAST:event_buscar_JTextFieldKeyPressed

    private void mostrar_Grupos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Grupos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)this.getLayout()).show(this, "Mostrar");
        }
    }//GEN-LAST:event_mostrar_Grupos_JButtonMouseClicked

    private void mostrar_Grupos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Grupos_JButtonMouseEntered
        // TODO add your handling code here:
        mostrar_Grupos_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_mostrar_Grupos_JButtonMouseEntered

    private void mostrar_Grupos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Grupos_JButtonMouseExited
        // TODO add your handling code here:
        mostrar_Grupos_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
    }//GEN-LAST:event_mostrar_Grupos_JButtonMouseExited

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        if(SwingUtilities.isLeftMouseButton(evt)){
            SwingUtilities.invokeLater(() -> {
                Obtener_Grupos();
            });
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
   
    private void Agregar_Grupo(GruposModel gruposModel) {

        String Id_Grupo = CourseRoom.Utilerias().Concatenar("Grupo_",gruposModel.Id_Grupo());
        
        DefaultTableModel modelo =  (DefaultTableModel)mostrar_Grupos_JTable.getModel();

        Celda_Renderer[] celdas = new Celda_Renderer[3];
        Celda_Renderer celda;
        Image imagen;
        byte[] bytes_Imagen_Grupo = CourseRoom.Solicitudes().Obtener_Imagen_Grupo(gruposModel.Id_Grupo());
        
        if(bytes_Imagen_Grupo.length > 0){
            imagen = CourseRoom.Utilerias().Obtener_Imagen(bytes_Imagen_Grupo);
            
            if(imagen != null){
                
                imagen = imagen.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
                ImageIcon icono_Imagen = new ImageIcon(imagen);
                celda =  new Celda_Renderer(icono_Imagen,gruposModel.Nombre(),Id_Grupo);
                celdas[0] = celda;
                icono_Imagen.getImage().flush();
            }else{
                celda =  new Celda_Renderer(gruposModel.Nombre_Curso(), Id_Grupo);
                celdas[0] = celda;
            }
        }
        
        celda =  new Celda_Renderer(gruposModel.Nombre_Curso(), Id_Grupo);
        celdas[1] = celda;
        celda = new Celda_Renderer(gruposModel.Fecha_Creacion(), Id_Grupo);
        celdas[2] = celda;

        modelo.addRow(celdas);

        mostrar_Grupos_JTable.setRowHeight(modelo.getRowCount()-1, 
                CourseRoom.Utilerias().Altura_Fila_Tabla_Icono(0));

        Grupo_Estudiante_Panel grupo_Estudiante_Panel
            = new Grupo_Estudiante_Panel(gruposModel.Id_Grupo(), Id_Grupo);
        mostrar_Grupos_Lista.push_back(grupo_Estudiante_Panel);

        Tablero_Estudiante_Panel.Agregar_Vista(grupo_Estudiante_Panel, Id_Grupo);
        
    }
    
    private void Obtener_Grupos(){
        
        DefaultTableModel modelo = (DefaultTableModel) mostrar_Grupos_JTable.getModel();
        modelo.setRowCount(0);
        
        Grupo_Estudiante_Panel grupo_Estudiante_Panel;
        while(!mostrar_Grupos_Lista.is_empty()){
            grupo_Estudiante_Panel= mostrar_Grupos_Lista.delist();
            Tablero_Estudiante_Panel.Retirar_Vista(grupo_Estudiante_Panel);
            grupo_Estudiante_Panel.Limpiar();
        }
        SwingUtilities.invokeLater(() -> {
            Lista<GruposModel> lista
                    = CourseRoom.Solicitudes().Obtener_Grupos(Tablero_Estudiante_Panel.Id_Usuario());

            while (!lista.is_empty()) {
                Agregar_Grupo(lista.delist());
            }
        });
    }
    
    private void Buscar_Grupos(String busqueda){
        
        DefaultTableModel modelo = (DefaultTableModel) buscar_Grupos_JTable.getModel();
        modelo.setRowCount(0);
        
        Grupo_Estudiante_Panel grupo_Estudiante_Panel;
        while(!buscar_Grupos_Lista.is_empty()){
            grupo_Estudiante_Panel= buscar_Grupos_Lista.delist();
            Tablero_Estudiante_Panel.Retirar_Vista(grupo_Estudiante_Panel);
            grupo_Estudiante_Panel.Limpiar();
        }
        SwingUtilities.invokeLater(() -> {
            Lista<GruposModel> lista
                    = CourseRoom.Solicitudes().Buscar_Grupos(busqueda, Tablero_Estudiante_Panel.Id_Usuario());

            if (!lista.is_empty()) {
                while (!lista.is_empty()) {
                    Agregar_Grupos_Busqueda(lista.delist());
                }
            } else {
                CourseRoom.Utilerias().Mensaje_Alerta("Alerta", "No Se Encontraron Grupos");
            }
        });
    }
    
    private void Agregar_Grupos_Busqueda(GruposModel gruposModel) {

        String Id_Grupo = CourseRoom.Utilerias().Concatenar("Grupo_",gruposModel.Id_Grupo());
        
        DefaultTableModel modelo = (DefaultTableModel) buscar_Grupos_JTable.getModel();

        Celda_Renderer[] celdas = new Celda_Renderer[3];
        Celda_Renderer celda;
        Image imagen;
        byte[] bytes_Imagen_Grupo = CourseRoom.Solicitudes().Obtener_Imagen_Grupo(gruposModel.Id_Grupo());
        
        if(bytes_Imagen_Grupo.length > 0){
            imagen = CourseRoom.Utilerias().Obtener_Imagen(bytes_Imagen_Grupo);
            
            if(imagen != null){
                
                imagen = imagen.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
                ImageIcon icono_Imagen = new ImageIcon(imagen);
                celda =  new Celda_Renderer(icono_Imagen,gruposModel.Nombre(),Id_Grupo);
                celdas[0] = celda;
                icono_Imagen.getImage().flush();
            }else{
                celda =  new Celda_Renderer(gruposModel.Nombre_Curso(), Id_Grupo);
                celdas[0] = celda;
            }
        }
        
        celda =  new Celda_Renderer(gruposModel.Nombre_Curso(), Id_Grupo);
        celdas[1] = celda;
        celda = new Celda_Renderer(gruposModel.Fecha_Creacion(), Id_Grupo);
        celdas[2] = celda;

        modelo.addRow(celdas);

        buscar_Grupos_JTable.setRowHeight(modelo.getRowCount()-1, CourseRoom.Utilerias().Altura_Fila_Tabla_Icono(0));

        if(!Existe_Grupo(gruposModel.Id_Grupo())){
            Grupo_Estudiante_Panel grupo_Estudiante_Panel
                = new Grupo_Estudiante_Panel(gruposModel.Id_Grupo(), Id_Grupo);
            buscar_Grupos_Lista.push_back(grupo_Estudiante_Panel);

            Tablero_Estudiante_Panel.Agregar_Vista(grupo_Estudiante_Panel, Id_Grupo);
        }

    }
       
    private boolean Existe_Grupo(int id_Grupo){
        Nodo<Grupo_Estudiante_Panel> first = mostrar_Grupos_Lista.front();
        Nodo<Grupo_Estudiante_Panel> last = mostrar_Grupos_Lista.back();

        int middle_index = (mostrar_Grupos_Lista.size())/2;

        if(middle_index % 2 == 0){
            for (int i = 0; i < middle_index; i++) {

                if (first.element().Id_Grupo() == id_Grupo){
                    return true;
                }

                if (last.element().Id_Grupo() == id_Grupo){
                    return true;
                }

                first = first.next();
                last = last.previous();
            }
            return false;
        }else{
            for(int i = 0; i < middle_index;i++) {

                if(first.element().Id_Grupo() == id_Grupo){
                    return true;
                }

                if(last.element().Id_Grupo() == id_Grupo){
                    return true;
                }

                first = first.next();
                last = last.previous();
            }

            return mostrar_Grupos_Lista.medium().Id_Grupo() == id_Grupo;
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acciones_JPanel;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JButton buscar_Grupos_JButton;
    private javax.swing.JPanel buscar_Grupos_JPanel;
    private javax.swing.JScrollPane buscar_Grupos_JScrollPane;
    private javax.swing.JTable buscar_Grupos_JTable;
    private javax.swing.JTextField buscar_JTextField;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JButton mostrar_Grupos_JButton;
    private javax.swing.JPanel mostrar_Grupos_JPanel;
    private javax.swing.JScrollPane mostrar_Grupos_JScrollPane;
    private javax.swing.JTable mostrar_Grupos_JTable;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {

        mostrar_Grupos_JScrollPane.getViewport().setOpaque(false);
        mostrar_Grupos_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        mostrar_Grupos_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        mostrar_Grupos_Lista = new Lista<>();

        Font gadugi = new Font("Segoe UI", Font.BOLD, 16);
        mostrar_Grupos_JTable.getTableHeader().setFont(gadugi);

        mostrar_Grupos_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        buscar_Grupos_JScrollPane.getViewport().setOpaque(false);
        buscar_Grupos_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        buscar_Grupos_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        buscar_Grupos_Lista = new Lista<>();

        buscar_Grupos_JTable.getTableHeader().setFont(gadugi);

        buscar_Grupos_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
    }

    @Override
    public void Colorear_Componentes() {
        contenido_Titulo_JPanel.setBackground(CourseRoom.Utilerias().Segundo_Color());

        titulo_JLabel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());

        buscar_Grupos_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());

        actualizar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        
        mostrar_Grupos_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        mostrar_Grupos_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        mostrar_Grupos_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        mostrar_Grupos_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        mostrar_Grupos_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        mostrar_Grupos_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        mostrar_Grupos_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        buscar_Grupos_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        buscar_Grupos_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        buscar_Grupos_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        buscar_Grupos_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        buscar_Grupos_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        buscar_Grupos_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        buscar_Grupos_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());

        Font fuente = new java.awt.Font("Segoe UI", 1, 14);
        BevelBorder borde_Linea = new BevelBorder(BevelBorder.LOWERED);
        TitledBorder borde_Titulo = new TitledBorder(borde_Linea, "Buscar Grupo(s)", TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.TOP,  fuente, CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        buscar_JTextField.setBorder(borde_Titulo);

        buscar_JTextField.setBackground(CourseRoom.Utilerias().Segundo_Color());
        buscar_JTextField.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        buscar_JTextField.setCaretColor(CourseRoom.Utilerias().Segundo_Color_Fuente());

        mostrar_Grupos_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
        
        DefaultTableModel modelo = (DefaultTableModel) mostrar_Grupos_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }

        Grupo_Estudiante_Panel grupo_Estudiante_Panel;
        for (Nodo<Grupo_Estudiante_Panel> nodo = mostrar_Grupos_Lista.front(); nodo != null; nodo = nodo.next()) {
            grupo_Estudiante_Panel = nodo.element();
            grupo_Estudiante_Panel.Colorear_Componentes();
        }

        modelo = (DefaultTableModel) buscar_Grupos_JTable.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }
        
        for (Nodo<Grupo_Estudiante_Panel> nodo = buscar_Grupos_Lista.front(); nodo != null; nodo = nodo.next()) {
            grupo_Estudiante_Panel = nodo.element();
            grupo_Estudiante_Panel.Colorear_Componentes();
        }
    }

    @Override
    public void Limpiar() {
        mostrar_Grupos_Lista.clear();
        buscar_Grupos_Lista.clear();
        DefaultTableModel modelo  = (DefaultTableModel) buscar_Grupos_JTable.getModel();
        modelo.setRowCount(0);
        modelo  = (DefaultTableModel) mostrar_Grupos_JTable.getModel();
        modelo.setRowCount(0);
    }
}
