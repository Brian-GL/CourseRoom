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
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
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
import paneles.estudiantes.Tablero_Estudiante_Panel;
import java.awt.event.KeyEvent;

/**
 *
 * @author LENOVO
 */
public class Grupos_Estudiante_Panel extends JLayeredPane implements Limpieza_Interface, Componentes_Interface{

    private static Lista<Grupo_Estudiante_Panel> mostrar_Grupos_Lista;
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

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 72));
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(1068, 72));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Grupos");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        buscar_Grupos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/search.png"))); // NOI18N
        buscar_Grupos_JButton.setBorder(null);
        buscar_Grupos_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
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

        javax.swing.GroupLayout contenido_Titulo_JPanelLayout = new javax.swing.GroupLayout(contenido_Titulo_JPanel);
        contenido_Titulo_JPanel.setLayout(contenido_Titulo_JPanelLayout);
        contenido_Titulo_JPanelLayout.setHorizontalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar_Grupos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                        .addComponent(buscar_Grupos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        mostrar_Grupos_JScrollPane.setBorder(null);
        mostrar_Grupos_JScrollPane.setOpaque(false);

        mostrar_Grupos_JTable.setAutoCreateRowSorter(true);
        mostrar_Grupos_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Grupo", "Ultimo Aviso", "Fecha", "Curso"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
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
            mostrar_Grupos_JTable.setOpaque(false);
            mostrar_Grupos_JTable.setRowHeight(100);
            mostrar_Grupos_JTable.setRowMargin(15);
            mostrar_Grupos_JTable.setShowGrid(true);
            mostrar_Grupos_JTable.setShowVerticalLines(false);
            mostrar_Grupos_JTable.setRowSorter(new TableRowSorter(mostrar_Grupos_JTable.getModel()));
            mostrar_Grupos_JScrollPane.setViewportView(mostrar_Grupos_JTable);

            javax.swing.GroupLayout mostrar_Grupos_JPanelLayout = new javax.swing.GroupLayout(mostrar_Grupos_JPanel);
            mostrar_Grupos_JPanel.setLayout(mostrar_Grupos_JPanelLayout);
            mostrar_Grupos_JPanelLayout.setHorizontalGroup(
                mostrar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Grupos_JPanelLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(mostrar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                        .addComponent(mostrar_Grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE))
                    .addGap(64, 64, 64))
            );
            mostrar_Grupos_JPanelLayout.setVerticalGroup(
                mostrar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Grupos_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(mostrar_Grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addContainerGap())
            );

            add(mostrar_Grupos_JPanel, "Mostrar");

            buscar_Grupos_JPanel.setOpaque(false);
            buscar_Grupos_JPanel.setPreferredSize(new java.awt.Dimension(1080, 630));

            buscar_JTextField.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
            buscar_JTextField.setToolTipText("<html>\n<h3>Buscar grupo(s). Presiona ENTER para realizar la búsqueda</h3>\n</html>");
            buscar_JTextField.setBorder(null);
            buscar_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    buscar_JTextFieldKeyPressed(evt);
                }
            });

            mostrar_Grupos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/vegan.png"))); // NOI18N
            mostrar_Grupos_JButton.setToolTipText("<html> <h3>Regresar a mis grupos</h3> </html>");
            mostrar_Grupos_JButton.setBorder(null);
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
            buscar_Grupos_JTable.setModel(

                new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Grupo", "Ultimo Aviso", "Fecha", "Curso"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false
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
                buscar_Grupos_JTable.setOpaque(false);
                buscar_Grupos_JTable.setRowHeight(100);
                buscar_Grupos_JTable.setRowMargin(15);
                buscar_Grupos_JTable.setShowGrid(true);
                buscar_Grupos_JTable.setShowVerticalLines(false);
                buscar_Grupos_JTable.setRowSorter(new TableRowSorter(buscar_Grupos_JTable.getModel()));
                buscar_Grupos_JScrollPane.setViewportView(buscar_Grupos_JTable);

                javax.swing.GroupLayout buscar_Grupos_JPanelLayout = new javax.swing.GroupLayout(buscar_Grupos_JPanel);
                buscar_Grupos_JPanel.setLayout(buscar_Grupos_JPanelLayout);
                buscar_Grupos_JPanelLayout.setHorizontalGroup(
                    buscar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscar_Grupos_JPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(buscar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscar_Grupos_JPanelLayout.createSequentialGroup()
                                .addComponent(mostrar_Grupos_JButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE))
                            .addComponent(buscar_Grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE))
                        .addGap(64, 64, 64))
                );
                buscar_Grupos_JPanelLayout.setVerticalGroup(
                    buscar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscar_Grupos_JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buscar_Grupos_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscar_JTextField)
                            .addComponent(mostrar_Grupos_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_Grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
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
        buscar_Grupos_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_buscar_Grupos_JButtonMouseEntered

    private void buscar_Grupos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Grupos_JButtonMouseExited
        // TODO add your handling code here:
        buscar_Grupos_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_buscar_Grupos_JButtonMouseExited

    private void buscar_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_JTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

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
        mostrar_Grupos_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_mostrar_Grupos_JButtonMouseEntered

    private void mostrar_Grupos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Grupos_JButtonMouseExited
        // TODO add your handling code here:
        mostrar_Grupos_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_mostrar_Grupos_JButtonMouseExited

    public static int Numero_Grupos() {
        return mostrar_Grupos_Lista.size();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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

        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        mostrar_Grupos_JTable.getTableHeader().setFont(gadugi);

        mostrar_Grupos_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());

        Celda_Renderer[] celdas = new Celda_Renderer[4];
        DefaultTableModel modelo = (DefaultTableModel) mostrar_Grupos_JTable.getModel();

        String id;
        URL url_Imagen;
        Image obtener_Imagen, grupo;
        ImageIcon icono_Grupo;
        Grupo_Estudiante_Panel grupo_Estudiante_Panel;
        String nombre, curso, fecha;
        for (int i = 0; i < CourseRoom.Faker().number().numberBetween(1, 5); i++) {
            id = CourseRoom.Concatenar("Grupo_", i);
            try {
                System.out.println(id + " -> Getting Image From https://picsum.photos/450/450");
                url_Imagen = new URL("https://picsum.photos/400/400");
                obtener_Imagen = ImageIO.read(url_Imagen);

                celdas[1] = new Celda_Renderer(CourseRoom.Faker().lorem().sentence(), id);
                fecha = CourseRoom.Faker().date().birthday(0, 1).toString();
                celdas[2] = new Celda_Renderer(fecha, id);
                curso = CourseRoom.Faker().educator().course();
                celdas[3] = new Celda_Renderer(curso, id);

                grupo = obtener_Imagen.getScaledInstance(96, 96, Image.SCALE_SMOOTH);
                icono_Grupo = new ImageIcon(grupo);

                nombre = CourseRoom.Faker().team().name();
                celdas[0] = new Celda_Renderer(icono_Grupo, nombre , id);

                grupo_Estudiante_Panel
                        = new Grupo_Estudiante_Panel(obtener_Imagen, nombre,
                                curso, fecha, id);

                mostrar_Grupos_Lista.push_back(grupo_Estudiante_Panel);
                Tablero_Estudiante_Panel.Agregar_Vista(grupo_Estudiante_Panel, id);
                modelo.addRow(celdas);

                obtener_Imagen.flush();
                obtener_Imagen.getGraphics().dispose();
            } catch (MalformedURLException ex) {

            } catch (IOException ex) {

            }
        }

        mostrar_Grupos_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) mostrar_Grupos_JTable.getModel();

                    Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                    Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                }
            }
        });
        
        buscar_Grupos_JScrollPane.getViewport().setOpaque(false);
        buscar_Grupos_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        buscar_Grupos_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        buscar_Grupos_Lista = new Lista<>();

        buscar_Grupos_JTable.getTableHeader().setFont(gadugi);

        buscar_Grupos_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());

        buscar_Grupos_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) buscar_Grupos_JTable.getModel();

                    Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                    Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                }
            }
        });

    }

    @Override
    public void Colorear_Componentes() {
        contenido_Titulo_JPanel.setBackground(CourseRoom.Segundo_Color());

        titulo_JLabel.setBackground(CourseRoom.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Tercer_Color_Fuente());

        buscar_Grupos_JButton.setBackground(CourseRoom.Segundo_Color());

        mostrar_Grupos_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        mostrar_Grupos_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        Celda_Renderer celda;
        DefaultTableModel modelo = (DefaultTableModel) mostrar_Grupos_JTable.getModel();
        for (int i = 0; i < mostrar_Grupos_JTable.getRowCount(); i++) {
            for (int j = 0; j < 4; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }

        Grupo_Estudiante_Panel grupo_Estudiante_Panel;
        for (Nodo<Grupo_Estudiante_Panel> nodo = mostrar_Grupos_Lista.front(); nodo != null; nodo = nodo.next()) {
            grupo_Estudiante_Panel = nodo.element();
            grupo_Estudiante_Panel.Colorear_Componentes();
        }
        
        Font gadugi = new java.awt.Font("Gadugi", 1, 16);
        buscar_JTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Buscar Grupos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Tercer_Color_Fuente()));

        buscar_JTextField.setBackground(CourseRoom.Tercer_Color());
        buscar_JTextField.setForeground(CourseRoom.Tercer_Color_Fuente());
        buscar_JTextField.setCaretColor(CourseRoom.Tercer_Color_Fuente());

        mostrar_Grupos_JButton.setBackground(CourseRoom.Primer_Color());

        buscar_Grupos_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        buscar_Grupos_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        modelo = (DefaultTableModel) buscar_Grupos_JTable.getModel();
        for (int i = 0; i < buscar_Grupos_JTable.getRowCount(); i++) {
            for (int j = 0; j < 4; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
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
        mostrar_Grupos_JTable.removeAll();
        buscar_Grupos_Lista.clear();
        buscar_Grupos_JTable.removeAll();
    }


}
