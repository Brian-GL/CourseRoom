/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import clases.Celda_Renderer;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import courseroom.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Buscar_Tareas_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    private Lista<Pagina_Tarea_Estudiante_Panel> lista_Tareas;
    
    /**
     * Creates new form Cursos_Agrupados_Estudiante_Panel
     */
    public Buscar_Tareas_Estudiante_Panel() {
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

        buscar_JTextField = new javax.swing.JTextField();
        tareas_JButton = new javax.swing.JButton();
        tareas_JScrollPane = new javax.swing.JScrollPane();
        tareas_JTable = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 630));

        buscar_JTextField.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        buscar_JTextField.setToolTipText("<html>\n<h3>Buscar tarea(s). Presiona ENTER para realizar la búsqueda</h3>\n</html>");
        buscar_JTextField.setBorder(null);
        buscar_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscar_JTextFieldKeyPressed(evt);
            }
        });

        tareas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/homework_5.png"))); // NOI18N
        tareas_JButton.setToolTipText("<html>\n<h3>Regresar a la página de tareas</h3>\n</html>");
        tareas_JButton.setBorder(null);
        tareas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tareas_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tareas_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tareas_JButtonMouseExited(evt);
            }
        });

        tareas_JScrollPane.setBorder(null);
        tareas_JScrollPane.setOpaque(false);

        tareas_JTable.setAutoCreateRowSorter(true);
        tareas_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Tipo", "Tarea", "Curso", "Fecha", "Estatus"
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
                    for(int i = 0; i < tareas_JTable.getRowCount(); i++)
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
            tareas_JTable.setOpaque(false);
            tareas_JTable.setRowHeight(100);
            tareas_JTable.setRowMargin(15);
            tareas_JTable.setShowGrid(true);
            tareas_JTable.setShowVerticalLines(false);
            tareas_JTable.setRowSorter(new TableRowSorter(tareas_JTable.getModel()));
            tareas_JScrollPane.setViewportView(tareas_JTable);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tareas_JButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buscar_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE))
                        .addComponent(tareas_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tareas_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar_JTextField))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(tareas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    private void buscar_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_JTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_JTextFieldKeyPressed

    private void tareas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Tareas_Estudiante_Panel.Mostrar_Tareas();
        }
    }//GEN-LAST:event_tareas_JButtonMouseClicked

    private void tareas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareas_JButtonMouseEntered
        // TODO add your handling code here:
        tareas_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_tareas_JButtonMouseEntered

    private void tareas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareas_JButtonMouseExited
        // TODO add your handling code here:
        tareas_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_tareas_JButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar_JTextField;
    private javax.swing.JButton tareas_JButton;
    private javax.swing.JScrollPane tareas_JScrollPane;
    private static javax.swing.JTable tareas_JTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        tareas_JScrollPane.getViewport().setOpaque(false);
        tareas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        tareas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        lista_Tareas = new Lista<>();

        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        tareas_JTable.getTableHeader().setFont(gadugi);

        tareas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        tareas_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) tareas_JTable.getModel();

                    Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);

                    Tablero_Estudiante_Panel.Mostrar_Vista(celda.ID());

                }
            }
        });
    }

    @Override
    public void Colorear_Componentes() {
        Font gadugi = new java.awt.Font("Gadugi", 1, 16);
        buscar_JTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Buscar Tarea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Tercer_Color_Fuente()));
        
        buscar_JTextField.setBackground(CourseRoom.Tercer_Color());
        buscar_JTextField.setForeground(CourseRoom.Tercer_Color_Fuente());
        buscar_JTextField.setCaretColor(CourseRoom.Tercer_Color_Fuente());
        
        tareas_JButton.setBackground(CourseRoom.Primer_Color());

        tareas_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        tareas_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        DefaultTableModel modelo = (DefaultTableModel) tareas_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < tareas_JTable.getRowCount(); i++) {
            for (int j = 0; j < 5; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }

        Pagina_Tarea_Estudiante_Panel tarea_Estudiante_Panel;
        for (Nodo<Pagina_Tarea_Estudiante_Panel> nodo = lista_Tareas.front(); nodo != null; nodo = nodo.next()) {
            tarea_Estudiante_Panel = nodo.element();
            tarea_Estudiante_Panel.Colorear_Componentes();
        }
       
    }
    
    @Override
    public void Limpiar() {
        lista_Tareas.clear();
        tareas_JTable.removeAll();
    }

}
