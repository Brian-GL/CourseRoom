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
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.commons.logging.LogFactory;
import paneles.profesores.Tablero_Profesor_Panel;
import paneles.profesores.perfil.Perfil_Profesor_Panel;

/**
 *
 * @author LENOVO
 */
public class Tareas_Profesor_Panel extends JLayeredPane implements Limpieza_Interface, Componentes_Interface{

    private static Lista<Tarea_Profesor_Panel> mostrar_Tareas_Lista;
    
    /**
     * Creates new form Tareas_Estudiante
     */
    public Tareas_Profesor_Panel() {
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
        buscar_Tareas_JButton = new javax.swing.JButton();
        actualizar_JButton = new javax.swing.JButton();
        tareas_Por_Calificar_JScrollPane = new javax.swing.JScrollPane();
        tareas_Por_Calificar_JTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1110, 630));
        setLayout(new java.awt.CardLayout());

        mostrar_Tareas_JPanel.setOpaque(false);
        mostrar_Tareas_JPanel.setPreferredSize(new java.awt.Dimension(1080, 630));

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Tareas");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        buscar_Tareas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/search.png"))); // NOI18N
        buscar_Tareas_JButton.setToolTipText("<html> <h3>Buscar tarea(s)</h3> </html>");
        buscar_Tareas_JButton.setBorder(null);
        buscar_Tareas_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
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

        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/updated.png"))); // NOI18N
        actualizar_JButton.setBorder(null);
        actualizar_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
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

        javax.swing.GroupLayout contenido_Titulo_JPanelLayout = new javax.swing.GroupLayout(contenido_Titulo_JPanel);
        contenido_Titulo_JPanel.setLayout(contenido_Titulo_JPanelLayout);
        contenido_Titulo_JPanelLayout.setHorizontalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar_Tareas_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_Tareas_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tareas_Por_Calificar_JScrollPane.setBorder(null);
        tareas_Por_Calificar_JScrollPane.setOpaque(false);

        tareas_Por_Calificar_JTable.setAutoCreateRowSorter(true);
        tareas_Por_Calificar_JTable.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        tareas_Por_Calificar_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Tarea", "Curso", "Estudiante", "Modificado El", "Fecha Entrega"
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
            tareas_Por_Calificar_JTable.setOpaque(false);
            tareas_Por_Calificar_JTable.setRowHeight(100);
            tareas_Por_Calificar_JTable.setRowMargin(15);
            tareas_Por_Calificar_JTable.setShowGrid(true);
            tareas_Por_Calificar_JTable.setShowVerticalLines(false);
            tareas_Por_Calificar_JTable.setRowSorter(new TableRowSorter(tareas_Por_Calificar_JTable.getModel()));
            tareas_Por_Calificar_JScrollPane.setViewportView(tareas_Por_Calificar_JTable);

            javax.swing.GroupLayout mostrar_Tareas_JPanelLayout = new javax.swing.GroupLayout(mostrar_Tareas_JPanel);
            mostrar_Tareas_JPanel.setLayout(mostrar_Tareas_JPanelLayout);
            mostrar_Tareas_JPanelLayout.setHorizontalGroup(
                mostrar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Tareas_JPanelLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(mostrar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tareas_Por_Calificar_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                    .addGap(32, 32, 32))
            );
            mostrar_Tareas_JPanelLayout.setVerticalGroup(
                mostrar_Tareas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Tareas_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(tareas_Por_Calificar_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addContainerGap())
            );

            add(mostrar_Tareas_JPanel, "Mostrar");
        }// </editor-fold>//GEN-END:initComponents

    private void buscar_Tareas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Tareas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)this.getLayout()).show(this,"Buscar");
        }
    }//GEN-LAST:event_buscar_Tareas_JButtonMouseClicked

    private void buscar_Tareas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Tareas_JButtonMouseEntered
        // TODO add your handling code here:
        buscar_Tareas_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
    }//GEN-LAST:event_buscar_Tareas_JButtonMouseEntered

    private void buscar_Tareas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Tareas_JButtonMouseExited
        // TODO add your handling code here:
        buscar_Tareas_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_buscar_Tareas_JButtonMouseExited

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
    private javax.swing.JButton buscar_Tareas_JButton;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JPanel mostrar_Tareas_JPanel;
    private javax.swing.JScrollPane tareas_Por_Calificar_JScrollPane;
    private javax.swing.JTable tareas_Por_Calificar_JTable;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        tareas_Por_Calificar_JScrollPane.getViewport().setOpaque(false);
        tareas_Por_Calificar_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        tareas_Por_Calificar_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        mostrar_Tareas_Lista = new Lista<>();
        
        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        tareas_Por_Calificar_JTable.getTableHeader().setFont(gadugi);

        tareas_Por_Calificar_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        DefaultTableModel modelo = (DefaultTableModel) tareas_Por_Calificar_JTable.getModel();
        
        Celda_Renderer[] celdas = new Celda_Renderer[5];

        String _id;
        ImageIcon icono = null;
        URL url_Imagen;
        Image imagen;
        String nombre,nombre_Curso;
        for(int i = 0; i < CourseRoom.Utilerias.number().numberBetween(1, 5);i++){
            
            try {
                _id = CourseRoom.Utilerias.Concatenar("Tarea_Calificar_", i);
                System.out.println(_id + " -> Getting Image From https://picsum.photos/96/96");
                url_Imagen = new URL("https://picsum.photos/96/96");
                imagen = ImageIO.read(url_Imagen);

                icono = new ImageIcon(imagen);
                nombre = CourseRoom.Utilerias.job().title();
                celdas[0] = new Celda_Renderer(nombre,_id);
                nombre_Curso = CourseRoom.Utilerias.educator().course();
                celdas[1] = new Celda_Renderer(icono, nombre_Curso, _id);

                System.out.println(_id + " Profesor: -> Getting Image From https://i.pravatar.cc/96");
                url_Imagen = new URL("https://i.pravatar.cc/96");
                imagen = ImageIO.read(url_Imagen);
                
                icono = new ImageIcon(imagen);

                celdas[2] = new Celda_Renderer(icono,CourseRoom.Utilerias.name().fullName(), _id);
                celdas[3] = new Celda_Renderer(CourseRoom.Utilerias.Fecha_Hora_Local(),_id);
                celdas[4] = new Celda_Renderer(CourseRoom.Utilerias.Fecha_Hora_Local(), _id);
                Tarea_Profesor_Panel tarea_Profesor_Panel =
                        new Tarea_Profesor_Panel(nombre,nombre_Curso,
                                Perfil_Profesor_Panel.Nombre_Completo(), CourseRoom.Utilerias.Fecha_Hora_Local(), "Abierta", _id);
                mostrar_Tareas_Lista.push_back(tarea_Profesor_Panel);
                modelo.addRow(celdas);
                Tablero_Profesor_Panel.Agregar_Vista(tarea_Profesor_Panel, _id);
            }catch(IOException e){
                
            }
        }
        
        
        tareas_Por_Calificar_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    
                    JTable tabla = (JTable)e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();
                    
                    DefaultTableModel modelo = (DefaultTableModel) tareas_Por_Calificar_JTable.getModel();

                    Celda_Renderer celda = (Celda_Renderer)modelo.getValueAt(fila,columna);

                    Tablero_Profesor_Panel.Mostrar_Vista(celda.ID());
                    
                }
            }
        });
        
    }

    @Override
    public void Colorear_Componentes() {
        
        contenido_Titulo_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());

        titulo_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());

        buscar_Tareas_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());

        tareas_Por_Calificar_JTable.getTableHeader().setBackground(CourseRoom.Utilerias.Tercer_Color());
        tareas_Por_Calificar_JTable.getTableHeader().setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        tareas_Por_Calificar_JTable.setGridColor(CourseRoom.Utilerias.Segundo_Color());

        DefaultTableModel modelo = (DefaultTableModel) tareas_Por_Calificar_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < tareas_Por_Calificar_JTable.getRowCount(); i++) {
            for (int j = 0; j < 5; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias.Primer_Color_Fuente());
            }
        }
        
        Tarea_Profesor_Panel tarea_Profesor_Panel;
        for (Nodo<Tarea_Profesor_Panel> nodo = mostrar_Tareas_Lista.front(); nodo != null; nodo = nodo.next()) {
            tarea_Profesor_Panel = nodo.element();
            tarea_Profesor_Panel.Colorear_Componentes();
        }
        
       
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());

    }
    
    @Override
    public void Limpiar() {
        mostrar_Tareas_Lista.clear();
        tareas_Por_Calificar_JTable.removeAll();
    }


}
