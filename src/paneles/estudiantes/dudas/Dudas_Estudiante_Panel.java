/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes.dudas;

import clases.Celda_Renderer;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import frames.estudiantes.Crear_Duda_Estudiante_Frame;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
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
import courseroom.CourseRoom;
import paneles.estudiantes.Tablero_Estudiante_Panel;


/**
 *
 * @author LENOVO
 */
public class Dudas_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    private static Lista<Duda_Estudiante_Panel> mostrar_Dudas_Lista;
    private Lista<Duda_Estudiante_Panel> buscar_Dudas_Lista;
    private static CardLayout layout;
    private static DefaultTableModel modelo_Estatico;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Dudas_Estudiante_Panel(){
        
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

        dudas_JLayeredPane = new javax.swing.JLayeredPane();
        mostrar_Dudas_JPanel = new javax.swing.JPanel();
        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        buscar_Dudas_JButton = new javax.swing.JButton();
        crear_Duda_JButton = new javax.swing.JButton();
        mostrar_Dudas_JScrollPane = new javax.swing.JScrollPane();
        mostrar_Dudas_JTable = new javax.swing.JTable();
        buscar_Dudas_JPanel = new javax.swing.JPanel();
        buscar_Dudas_JTextField = new javax.swing.JTextField();
        mostrar_Dudas_JButton = new javax.swing.JButton();
        buscar_Dudas_JScrollPane = new javax.swing.JScrollPane();
        buscar_Dudas_JTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 630));
        setLayout(new java.awt.CardLayout());

        dudas_JLayeredPane.setLayout(new java.awt.CardLayout());

        mostrar_Dudas_JPanel.setOpaque(false);
        mostrar_Dudas_JPanel.setPreferredSize(new java.awt.Dimension(1110, 630));

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 68));
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(276, 68));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Dudas");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 68));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 68));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 68));

        buscar_Dudas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/search.png"))); // NOI18N
        buscar_Dudas_JButton.setBorder(null);
        ((ImageIcon)buscar_Dudas_JButton.getIcon()).getImage().flush();
        buscar_Dudas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_Dudas_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_Dudas_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscar_Dudas_JButtonMouseExited(evt);
            }
        });

        crear_Duda_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/wonder.png"))); // NOI18N
        crear_Duda_JButton.setBorder(null);
        ((ImageIcon)crear_Duda_JButton.getIcon()).getImage().flush();
        crear_Duda_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_Duda_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crear_Duda_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crear_Duda_JButtonMouseExited(evt);
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
                .addComponent(crear_Duda_JButton)
                .addGap(18, 18, 18)
                .addComponent(buscar_Dudas_JButton)
                .addGap(0, 0, 0))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                        .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar_Dudas_JButton)
                            .addComponent(crear_Duda_JButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        mostrar_Dudas_JScrollPane.setBorder(null);
        mostrar_Dudas_JScrollPane.setOpaque(false);

        mostrar_Dudas_JTable.setAutoCreateRowSorter(true);
        mostrar_Dudas_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Preguntador", "Duda", "Descripción", "Fecha", "Estatus"
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
                    for(int i = 0; i < mostrar_Dudas_JTable.getRowCount(); i++)
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
            mostrar_Dudas_JTable.setOpaque(false);
            mostrar_Dudas_JTable.setRowHeight(100);
            mostrar_Dudas_JTable.setRowMargin(15);
            mostrar_Dudas_JTable.setShowGrid(true);
            mostrar_Dudas_JTable.setShowVerticalLines(false);
            mostrar_Dudas_JTable.setRowSorter(new TableRowSorter(mostrar_Dudas_JTable.getModel()));
            mostrar_Dudas_JScrollPane.setViewportView(mostrar_Dudas_JTable);

            javax.swing.GroupLayout mostrar_Dudas_JPanelLayout = new javax.swing.GroupLayout(mostrar_Dudas_JPanel);
            mostrar_Dudas_JPanel.setLayout(mostrar_Dudas_JPanelLayout);
            mostrar_Dudas_JPanelLayout.setHorizontalGroup(
                mostrar_Dudas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostrar_Dudas_JPanelLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(mostrar_Dudas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mostrar_Dudas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE))
                    .addGap(64, 64, 64))
            );
            mostrar_Dudas_JPanelLayout.setVerticalGroup(
                mostrar_Dudas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Dudas_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(mostrar_Dudas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addContainerGap())
            );

            dudas_JLayeredPane.add(mostrar_Dudas_JPanel, "Mostrar");

            buscar_Dudas_JPanel.setOpaque(false);
            buscar_Dudas_JPanel.setPreferredSize(new java.awt.Dimension(1110, 630));

            buscar_Dudas_JTextField.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
            buscar_Dudas_JTextField.setToolTipText("<html>\n<h3>Buscar duda(s). Presiona ENTER para realizar la búsqueda</h3>\n</html>");
            buscar_Dudas_JTextField.setBorder(null);
            buscar_Dudas_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    buscar_Dudas_JTextFieldKeyPressed(evt);
                }
            });

            mostrar_Dudas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/shrug.png"))); // NOI18N
            mostrar_Dudas_JButton.setToolTipText("<html>\n<h3>Regresar a la página de dudas</h3>\n</html>");
            mostrar_Dudas_JButton.setBorder(null);
            ((ImageIcon)mostrar_Dudas_JButton.getIcon()).getImage().flush();
            mostrar_Dudas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    mostrar_Dudas_JButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    mostrar_Dudas_JButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    mostrar_Dudas_JButtonMouseExited(evt);
                }
            });

            buscar_Dudas_JScrollPane.setBorder(null);
            buscar_Dudas_JScrollPane.setOpaque(false);

            buscar_Dudas_JTable.setAutoCreateRowSorter(true);
            buscar_Dudas_JTable.setModel(

                new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Preguntador", "Duda", "Descripción", "Fecha", "Estatus"
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
                        for(int i = 0; i < mostrar_Dudas_JTable.getRowCount(); i++)
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
                buscar_Dudas_JTable.setOpaque(false);
                buscar_Dudas_JTable.setRowHeight(100);
                buscar_Dudas_JTable.setRowMargin(15);
                buscar_Dudas_JTable.setShowGrid(true);
                buscar_Dudas_JTable.setShowVerticalLines(false);
                mostrar_Dudas_JTable.setRowSorter(new TableRowSorter(mostrar_Dudas_JTable.getModel()));
                buscar_Dudas_JScrollPane.setViewportView(buscar_Dudas_JTable);

                javax.swing.GroupLayout buscar_Dudas_JPanelLayout = new javax.swing.GroupLayout(buscar_Dudas_JPanel);
                buscar_Dudas_JPanel.setLayout(buscar_Dudas_JPanelLayout);
                buscar_Dudas_JPanelLayout.setHorizontalGroup(
                    buscar_Dudas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscar_Dudas_JPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(buscar_Dudas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscar_Dudas_JPanelLayout.createSequentialGroup()
                                .addComponent(mostrar_Dudas_JButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar_Dudas_JTextField))
                            .addComponent(buscar_Dudas_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE))
                        .addGap(64, 64, 64))
                );
                buscar_Dudas_JPanelLayout.setVerticalGroup(
                    buscar_Dudas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscar_Dudas_JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buscar_Dudas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscar_Dudas_JTextField)
                            .addComponent(mostrar_Dudas_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_Dudas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                        .addContainerGap())
                );

                dudas_JLayeredPane.add(buscar_Dudas_JPanel, "Buscar");

                add(dudas_JLayeredPane, "card2");
            }// </editor-fold>//GEN-END:initComponents

    private void buscar_Dudas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Dudas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            layout.show(dudas_JLayeredPane, "Buscar");
        }
    }//GEN-LAST:event_buscar_Dudas_JButtonMouseClicked

    private void buscar_Dudas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Dudas_JButtonMouseEntered
        // TODO add your handling code here:
        buscar_Dudas_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_buscar_Dudas_JButtonMouseEntered

    private void buscar_Dudas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Dudas_JButtonMouseExited
        // TODO add your handling code here:
        buscar_Dudas_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_buscar_Dudas_JButtonMouseExited

    private void crear_Duda_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Duda_JButtonMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isLeftMouseButton(evt)) {

            Crear_Duda_Estudiante_Frame crear_Duda_Estudiante_Frame
            = new Crear_Duda_Estudiante_Frame();

            crear_Duda_Estudiante_Frame.setVisible(true);
        }
    }//GEN-LAST:event_crear_Duda_JButtonMouseClicked

    private void crear_Duda_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Duda_JButtonMouseEntered
        // TODO add your handling code here:
        crear_Duda_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_crear_Duda_JButtonMouseEntered

    private void crear_Duda_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Duda_JButtonMouseExited
        // TODO add your handling code here:
        crear_Duda_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_crear_Duda_JButtonMouseExited

    private void buscar_Dudas_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_Dudas_JTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_Dudas_JTextFieldKeyPressed

    private void mostrar_Dudas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Dudas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            layout.show(dudas_JLayeredPane, "Mostrar");
        }
    }//GEN-LAST:event_mostrar_Dudas_JButtonMouseClicked

    private void mostrar_Dudas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Dudas_JButtonMouseEntered
        // TODO add your handling code here:
        mostrar_Dudas_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_mostrar_Dudas_JButtonMouseEntered

    private void mostrar_Dudas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Dudas_JButtonMouseExited
        // TODO add your handling code here:
        mostrar_Dudas_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_mostrar_Dudas_JButtonMouseExited

     public static int Numero_Dudas(){
        return mostrar_Dudas_Lista.size();
    }
    
    public static void Agregar_Duda(String nombre_Duda, 
            String descripcion_Duda,
            String preguntador_Nombre,
            String fecha,
            String id) {
        
        
        Celda_Renderer[] celdas = new Celda_Renderer[5];
        Image imagen_usuario = Tablero_Estudiante_Panel.Imagen_Usuario().getScaledInstance(96, 96, Image.SCALE_AREA_AVERAGING);
        ImageIcon icono_Usuario = new ImageIcon(imagen_usuario);
        
        
        celdas[0] = new Celda_Renderer(icono_Usuario, preguntador_Nombre,id);
        celdas[1] = new Celda_Renderer(nombre_Duda,id);
        celdas[2] = new Celda_Renderer(descripcion_Duda,id);
        celdas[3] = new Celda_Renderer(fecha,id);
        celdas[4] = new Celda_Renderer("Abierta",id);
        
        modelo_Estatico.addRow(celdas);
        
        Duda_Estudiante_Panel duda_Estudiante_Panel = 
                new Duda_Estudiante_Panel(nombre_Duda, descripcion_Duda, preguntador_Nombre, fecha, id);
        mostrar_Dudas_Lista.push_back(duda_Estudiante_Panel);
        Tablero_Estudiante_Panel.Agregar_Vista(duda_Estudiante_Panel, id);
        
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_Dudas_JButton;
    private javax.swing.JPanel buscar_Dudas_JPanel;
    private javax.swing.JScrollPane buscar_Dudas_JScrollPane;
    private javax.swing.JTable buscar_Dudas_JTable;
    private javax.swing.JTextField buscar_Dudas_JTextField;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JButton crear_Duda_JButton;
    private javax.swing.JLayeredPane dudas_JLayeredPane;
    private javax.swing.JButton mostrar_Dudas_JButton;
    private javax.swing.JPanel mostrar_Dudas_JPanel;
    private javax.swing.JScrollPane mostrar_Dudas_JScrollPane;
    private javax.swing.JTable mostrar_Dudas_JTable;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        layout = (CardLayout)dudas_JLayeredPane.getLayout();
        

        mostrar_Dudas_JScrollPane.getViewport().setOpaque(false);
        mostrar_Dudas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        mostrar_Dudas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        buscar_Dudas_JScrollPane.getViewport().setOpaque(false);
        buscar_Dudas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        buscar_Dudas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        mostrar_Dudas_Lista = buscar_Dudas_Lista = new Lista<>();

        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        mostrar_Dudas_JTable.getTableHeader().setFont(gadugi);
        mostrar_Dudas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        buscar_Dudas_JTable.getTableHeader().setFont(gadugi);
        buscar_Dudas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        mostrar_Dudas_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) mostrar_Dudas_JTable.getModel();

                    Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                    Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                }
            }
        });
        
        buscar_Dudas_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) buscar_Dudas_JTable.getModel();

                    Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                    Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                }
            }
        });
        
        modelo_Estatico = (DefaultTableModel) mostrar_Dudas_JTable.getModel();
        
    }

    @Override
    public void Colorear_Componentes() {
        contenido_Titulo_JPanel.setBackground(CourseRoom.Segundo_Color());
        titulo_JLabel.setBackground(CourseRoom.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Tercer_Color_Fuente());

        buscar_Dudas_JButton.setBackground(CourseRoom.Segundo_Color());
        crear_Duda_JButton.setBackground(CourseRoom.Segundo_Color());
        
        mostrar_Dudas_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        mostrar_Dudas_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        DefaultTableModel modelo = (DefaultTableModel) mostrar_Dudas_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < mostrar_Dudas_JTable.getRowCount(); i++) {
            for (int j = 0; j < 5; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }

        Duda_Estudiante_Panel duda_Estudiante_Panel;
        for (Nodo<Duda_Estudiante_Panel> nodo = mostrar_Dudas_Lista.front(); nodo != null; nodo = nodo.next()) {
            duda_Estudiante_Panel = nodo.element();
            duda_Estudiante_Panel.Colorear_Componentes();
        }
        
        Font gadugi = new java.awt.Font("Gadugi", 1, 16);
        buscar_Dudas_JTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Buscar Duda(s)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Tercer_Color_Fuente()));
        
        buscar_Dudas_JTextField.setBackground(CourseRoom.Tercer_Color());
        buscar_Dudas_JTextField.setForeground(CourseRoom.Tercer_Color_Fuente());
        buscar_Dudas_JTextField.setCaretColor(CourseRoom.Tercer_Color_Fuente());
        
        mostrar_Dudas_JButton.setBackground(CourseRoom.Primer_Color());
        
        buscar_Dudas_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        buscar_Dudas_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        modelo = (DefaultTableModel) buscar_Dudas_JTable.getModel();
        for (int i = 0; i < buscar_Dudas_JTable.getRowCount(); i++) {
            for (int j = 0; j < 5; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }

        for (Nodo<Duda_Estudiante_Panel> nodo = buscar_Dudas_Lista.front(); nodo != null; nodo = nodo.next()) {
            duda_Estudiante_Panel = nodo.element();
            duda_Estudiante_Panel.Colorear_Componentes();
        }
    }
    
    @Override
    public void Limpiar() {
        mostrar_Dudas_Lista.clear();
        mostrar_Dudas_JTable.removeAll();
        buscar_Dudas_Lista.clear();
        buscar_Dudas_JTable.removeAll();
    }
}
