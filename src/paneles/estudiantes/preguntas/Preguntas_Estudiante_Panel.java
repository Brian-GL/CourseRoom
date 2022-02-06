/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes.preguntas;

import clases.Celda_Renderer;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import frames.estudiantes.Preguntar_Estudiante_Frame;
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
public class Preguntas_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    private static Lista<Pregunta_Estudiante_Panel> mostrar_Preguntas_Lista;
    private Lista<Pregunta_Estudiante_Panel> buscar_Preguntas_Lista;
    private static CardLayout layout;
    private static DefaultTableModel modelo_Estatico;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Preguntas_Estudiante_Panel(){
        
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

        preguntas_JLayeredPane = new javax.swing.JLayeredPane();
        mostrar_Preguntas_JPanel = new javax.swing.JPanel();
        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        buscar_Preguntas_JButton = new javax.swing.JButton();
        preguntar_JButton = new javax.swing.JButton();
        actualizar_JButton = new javax.swing.JButton();
        mostrar_Preguntas_JScrollPane = new javax.swing.JScrollPane();
        mostrar_Preguntas_JTable = new javax.swing.JTable();
        buscar_Preguntas_JPanel = new javax.swing.JPanel();
        buscar_Preguntas_JTextField = new javax.swing.JTextField();
        mostrar_Preguntas_JButton = new javax.swing.JButton();
        buscar_Preguntas_JScrollPane = new javax.swing.JScrollPane();
        buscar_Preguntas_JTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 630));
        setLayout(new java.awt.CardLayout());

        preguntas_JLayeredPane.setLayout(new java.awt.CardLayout());

        mostrar_Preguntas_JPanel.setOpaque(false);
        mostrar_Preguntas_JPanel.setPreferredSize(new java.awt.Dimension(1110, 630));

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 68));
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(276, 68));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Preguntas");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 68));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 68));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 68));

        buscar_Preguntas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/search.png"))); // NOI18N
        buscar_Preguntas_JButton.setBorder(null);
        ((ImageIcon)buscar_Preguntas_JButton.getIcon()).getImage().flush();
        buscar_Preguntas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_Preguntas_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_Preguntas_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscar_Preguntas_JButtonMouseExited(evt);
            }
        });

        preguntar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/wonder.png"))); // NOI18N
        preguntar_JButton.setBorder(null);
        ((ImageIcon)preguntar_JButton.getIcon()).getImage().flush();
        preguntar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preguntar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                preguntar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                preguntar_JButtonMouseExited(evt);
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
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(preguntar_JButton)
                .addGap(18, 18, 18)
                .addComponent(buscar_Preguntas_JButton)
                .addGap(18, 18, 18)
                .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_Preguntas_JButton)
                    .addComponent(preguntar_JButton)
                    .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mostrar_Preguntas_JScrollPane.setBorder(null);
        mostrar_Preguntas_JScrollPane.setOpaque(false);

        mostrar_Preguntas_JTable.setAutoCreateRowSorter(true);
        mostrar_Preguntas_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Preguntador", "Pregunta", "Descripción", "Fecha", "Estatus"
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
                    for(int i = 0; i < mostrar_Preguntas_JTable.getRowCount(); i++)
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
            mostrar_Preguntas_JTable.setOpaque(false);
            mostrar_Preguntas_JTable.setRowHeight(100);
            mostrar_Preguntas_JTable.setRowMargin(15);
            mostrar_Preguntas_JTable.setShowGrid(true);
            mostrar_Preguntas_JTable.setShowVerticalLines(false);
            mostrar_Preguntas_JTable.setRowSorter(new TableRowSorter(mostrar_Preguntas_JTable.getModel()));
            mostrar_Preguntas_JScrollPane.setViewportView(mostrar_Preguntas_JTable);

            javax.swing.GroupLayout mostrar_Preguntas_JPanelLayout = new javax.swing.GroupLayout(mostrar_Preguntas_JPanel);
            mostrar_Preguntas_JPanel.setLayout(mostrar_Preguntas_JPanelLayout);
            mostrar_Preguntas_JPanelLayout.setHorizontalGroup(
                mostrar_Preguntas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostrar_Preguntas_JPanelLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(mostrar_Preguntas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mostrar_Preguntas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                    .addGap(32, 32, 32))
            );
            mostrar_Preguntas_JPanelLayout.setVerticalGroup(
                mostrar_Preguntas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrar_Preguntas_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(mostrar_Preguntas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addContainerGap())
            );

            preguntas_JLayeredPane.add(mostrar_Preguntas_JPanel, "Mostrar");

            buscar_Preguntas_JPanel.setOpaque(false);
            buscar_Preguntas_JPanel.setPreferredSize(new java.awt.Dimension(1110, 630));

            buscar_Preguntas_JTextField.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
            buscar_Preguntas_JTextField.setToolTipText("<html>\n<h3>Buscar duda(s). Presiona ENTER para realizar la búsqueda</h3>\n</html>");
            buscar_Preguntas_JTextField.setBorder(null);
            buscar_Preguntas_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    buscar_Preguntas_JTextFieldKeyPressed(evt);
                }
            });

            mostrar_Preguntas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/shrug.png"))); // NOI18N
            mostrar_Preguntas_JButton.setToolTipText("<html>\n<h3>Regresar a la página de dudas</h3>\n</html>");
            mostrar_Preguntas_JButton.setBorder(null);
            ((ImageIcon)mostrar_Preguntas_JButton.getIcon()).getImage().flush();
            mostrar_Preguntas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    mostrar_Preguntas_JButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    mostrar_Preguntas_JButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    mostrar_Preguntas_JButtonMouseExited(evt);
                }
            });

            buscar_Preguntas_JScrollPane.setBorder(null);
            buscar_Preguntas_JScrollPane.setOpaque(false);

            buscar_Preguntas_JTable.setAutoCreateRowSorter(true);
            buscar_Preguntas_JTable.setModel(

                new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Preguntador", "Pregunta", "Descripción", "Fecha", "Estatus"
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
                        for(int i = 0; i < mostrar_Preguntas_JTable.getRowCount(); i++)
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
                buscar_Preguntas_JTable.setOpaque(false);
                buscar_Preguntas_JTable.setRowHeight(100);
                buscar_Preguntas_JTable.setRowMargin(15);
                buscar_Preguntas_JTable.setShowGrid(true);
                buscar_Preguntas_JTable.setShowVerticalLines(false);
                mostrar_Preguntas_JTable.setRowSorter(new TableRowSorter(mostrar_Preguntas_JTable.getModel()));
                buscar_Preguntas_JScrollPane.setViewportView(buscar_Preguntas_JTable);

                javax.swing.GroupLayout buscar_Preguntas_JPanelLayout = new javax.swing.GroupLayout(buscar_Preguntas_JPanel);
                buscar_Preguntas_JPanel.setLayout(buscar_Preguntas_JPanelLayout);
                buscar_Preguntas_JPanelLayout.setHorizontalGroup(
                    buscar_Preguntas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscar_Preguntas_JPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(buscar_Preguntas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscar_Preguntas_JPanelLayout.createSequentialGroup()
                                .addComponent(mostrar_Preguntas_JButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar_Preguntas_JTextField))
                            .addComponent(buscar_Preguntas_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                );
                buscar_Preguntas_JPanelLayout.setVerticalGroup(
                    buscar_Preguntas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscar_Preguntas_JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buscar_Preguntas_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscar_Preguntas_JTextField)
                            .addComponent(mostrar_Preguntas_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_Preguntas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                        .addContainerGap())
                );

                preguntas_JLayeredPane.add(buscar_Preguntas_JPanel, "Buscar");

                add(preguntas_JLayeredPane, "card2");
            }// </editor-fold>//GEN-END:initComponents

    private void buscar_Preguntas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Preguntas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            layout.show(preguntas_JLayeredPane, "Buscar");
        }
    }//GEN-LAST:event_buscar_Preguntas_JButtonMouseClicked

    private void buscar_Preguntas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Preguntas_JButtonMouseEntered
        // TODO add your handling code here:
        buscar_Preguntas_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_buscar_Preguntas_JButtonMouseEntered

    private void buscar_Preguntas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_Preguntas_JButtonMouseExited
        // TODO add your handling code here:
        buscar_Preguntas_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_buscar_Preguntas_JButtonMouseExited

    private void preguntar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preguntar_JButtonMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isLeftMouseButton(evt)) {

            Preguntar_Estudiante_Frame preguntar_Estudiante_Frame
            = new Preguntar_Estudiante_Frame();

            preguntar_Estudiante_Frame.setVisible(true);
        }
    }//GEN-LAST:event_preguntar_JButtonMouseClicked

    private void preguntar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preguntar_JButtonMouseEntered
        // TODO add your handling code here:
        preguntar_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_preguntar_JButtonMouseEntered

    private void preguntar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preguntar_JButtonMouseExited
        // TODO add your handling code here:
        preguntar_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_preguntar_JButtonMouseExited

    private void buscar_Preguntas_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_Preguntas_JTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_Preguntas_JTextFieldKeyPressed

    private void mostrar_Preguntas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Preguntas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            layout.show(preguntas_JLayeredPane, "Mostrar");
        }
    }//GEN-LAST:event_mostrar_Preguntas_JButtonMouseClicked

    private void mostrar_Preguntas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Preguntas_JButtonMouseEntered
        // TODO add your handling code here:
        mostrar_Preguntas_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_mostrar_Preguntas_JButtonMouseEntered

    private void mostrar_Preguntas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Preguntas_JButtonMouseExited
        // TODO add your handling code here:
        mostrar_Preguntas_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_mostrar_Preguntas_JButtonMouseExited

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

        }
    }//GEN-LAST:event_actualizar_JButtonMouseClicked

    private void actualizar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseEntered
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseEntered

    private void actualizar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseExited
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseExited

    public static int Numero_Preguntas(){
        return mostrar_Preguntas_Lista.size();
    }
    
    public static void Agregar_Pregunta(String nombre_Duda, 
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
        
        Pregunta_Estudiante_Panel pregunta_Estudiante_Panel = 
                new Pregunta_Estudiante_Panel(nombre_Duda, descripcion_Duda, preguntador_Nombre, fecha, id);
        mostrar_Preguntas_Lista.push_back(pregunta_Estudiante_Panel);
        Tablero_Estudiante_Panel.Agregar_Vista(pregunta_Estudiante_Panel, id);
        
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JButton buscar_Preguntas_JButton;
    private javax.swing.JPanel buscar_Preguntas_JPanel;
    private javax.swing.JScrollPane buscar_Preguntas_JScrollPane;
    private javax.swing.JTable buscar_Preguntas_JTable;
    private javax.swing.JTextField buscar_Preguntas_JTextField;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JButton mostrar_Preguntas_JButton;
    private javax.swing.JPanel mostrar_Preguntas_JPanel;
    private javax.swing.JScrollPane mostrar_Preguntas_JScrollPane;
    private javax.swing.JTable mostrar_Preguntas_JTable;
    private javax.swing.JButton preguntar_JButton;
    private javax.swing.JLayeredPane preguntas_JLayeredPane;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        layout = (CardLayout)preguntas_JLayeredPane.getLayout();

        mostrar_Preguntas_JScrollPane.getViewport().setOpaque(false);
        mostrar_Preguntas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        mostrar_Preguntas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        buscar_Preguntas_JScrollPane.getViewport().setOpaque(false);
        buscar_Preguntas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        buscar_Preguntas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        mostrar_Preguntas_Lista = buscar_Preguntas_Lista = new Lista<>();

        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        mostrar_Preguntas_JTable.getTableHeader().setFont(gadugi);
        mostrar_Preguntas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        buscar_Preguntas_JTable.getTableHeader().setFont(gadugi);
        buscar_Preguntas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        mostrar_Preguntas_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) mostrar_Preguntas_JTable.getModel();

                    Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                    Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                }
            }
        });
        
        buscar_Preguntas_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) buscar_Preguntas_JTable.getModel();

                    Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                    Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                }
            }
        });
        
        modelo_Estatico = (DefaultTableModel) mostrar_Preguntas_JTable.getModel();
        
    }

    @Override
    public void Colorear_Componentes() {
        contenido_Titulo_JPanel.setBackground(CourseRoom.Segundo_Color());
        titulo_JLabel.setBackground(CourseRoom.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Tercer_Color_Fuente());
        
        actualizar_JButton.setBackground(CourseRoom.Segundo_Color());

        buscar_Preguntas_JButton.setBackground(CourseRoom.Segundo_Color());
        preguntar_JButton.setBackground(CourseRoom.Segundo_Color());
        
        mostrar_Preguntas_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        mostrar_Preguntas_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        DefaultTableModel modelo = (DefaultTableModel) mostrar_Preguntas_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < mostrar_Preguntas_JTable.getRowCount(); i++) {
            for (int j = 0; j < 5; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }

        Pregunta_Estudiante_Panel pregunta_Estudiante_Panel;
        for (Nodo<Pregunta_Estudiante_Panel> nodo = mostrar_Preguntas_Lista.front(); nodo != null; nodo = nodo.next()) {
            pregunta_Estudiante_Panel = nodo.element();
            pregunta_Estudiante_Panel.Colorear_Componentes();
        }
        
        Font gadugi = new java.awt.Font("Gadugi", 1, 16);
        buscar_Preguntas_JTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Buscar Pregunta(s)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Tercer_Color_Fuente()));
        
        buscar_Preguntas_JTextField.setBackground(CourseRoom.Tercer_Color());
        buscar_Preguntas_JTextField.setForeground(CourseRoom.Tercer_Color_Fuente());
        buscar_Preguntas_JTextField.setCaretColor(CourseRoom.Tercer_Color_Fuente());
        
        mostrar_Preguntas_JButton.setBackground(CourseRoom.Primer_Color());
        
        buscar_Preguntas_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        buscar_Preguntas_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        modelo = (DefaultTableModel) buscar_Preguntas_JTable.getModel();
        for (int i = 0; i < buscar_Preguntas_JTable.getRowCount(); i++) {
            for (int j = 0; j < 5; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }

        for (Nodo<Pregunta_Estudiante_Panel> nodo = buscar_Preguntas_Lista.front(); nodo != null; nodo = nodo.next()) {
            pregunta_Estudiante_Panel = nodo.element();
            pregunta_Estudiante_Panel.Colorear_Componentes();
        }
    }
    
    @Override
    public void Limpiar() {
        mostrar_Preguntas_Lista.clear();
        mostrar_Preguntas_JTable.removeAll();
        buscar_Preguntas_Lista.clear();
        buscar_Preguntas_JTable.removeAll();
    }
}