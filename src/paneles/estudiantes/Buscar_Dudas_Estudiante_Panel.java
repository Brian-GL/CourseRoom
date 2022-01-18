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
import main.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Buscar_Dudas_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    private static Lista<Duda_Estudiante_Panel> lista_Dudas;
    
    public Buscar_Dudas_Estudiante_Panel() {
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
        dudas_JButton = new javax.swing.JButton();
        dudas_JScrollPane = new javax.swing.JScrollPane();
        dudas_JTable = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 630));

        buscar_JTextField.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        buscar_JTextField.setToolTipText("<html>\n<h3>Buscar duda(s). Presiona ENTER para realizar la búsqueda</h3>\n</html>");
        buscar_JTextField.setBorder(null);
        buscar_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscar_JTextFieldKeyPressed(evt);
            }
        });

        dudas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/shrug.png"))); // NOI18N
        dudas_JButton.setToolTipText("<html>\n<h3>Regresar a la página de dudas</h3>\n</html>");
        dudas_JButton.setBorder(null);
        dudas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dudas_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dudas_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dudas_JButtonMouseExited(evt);
            }
        });

        dudas_JScrollPane.setBorder(null);
        dudas_JScrollPane.setOpaque(false);

        dudas_JTable.setAutoCreateRowSorter(true);
        dudas_JTable.setModel(

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
                    for(int i = 0; i < dudas_JTable.getRowCount(); i++)
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
            dudas_JTable.setOpaque(false);
            dudas_JTable.setRowHeight(100);
            dudas_JTable.setRowMargin(15);
            dudas_JTable.setShowGrid(true);
            dudas_JTable.setShowVerticalLines(false);
            dudas_JTable.setRowSorter(new TableRowSorter(dudas_JTable.getModel()));
            dudas_JScrollPane.setViewportView(dudas_JTable);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dudas_JButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buscar_JTextField))
                        .addComponent(dudas_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buscar_JTextField)
                        .addComponent(dudas_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dudas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    private void buscar_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_JTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_JTextFieldKeyPressed

    private void dudas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dudas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Dudas_Estudiante_Panel.Mostrar_Dudas();
        }
    }//GEN-LAST:event_dudas_JButtonMouseClicked

    private void dudas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dudas_JButtonMouseEntered
        // TODO add your handling code here:
        dudas_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_dudas_JButtonMouseEntered

    private void dudas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dudas_JButtonMouseExited
        // TODO add your handling code here:
        dudas_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_dudas_JButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar_JTextField;
    private javax.swing.JButton dudas_JButton;
    private javax.swing.JScrollPane dudas_JScrollPane;
    private static javax.swing.JTable dudas_JTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        dudas_JScrollPane.getViewport().setOpaque(false);
        dudas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        dudas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        lista_Dudas = new Lista<>();

        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        dudas_JTable.getTableHeader().setFont(gadugi);

        dudas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());

        dudas_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) dudas_JTable.getModel();

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
                "Buscar Duda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Tercer_Color_Fuente()));
        
        buscar_JTextField.setBackground(CourseRoom.Tercer_Color());
        buscar_JTextField.setForeground(CourseRoom.Tercer_Color_Fuente());
        buscar_JTextField.setCaretColor(CourseRoom.Tercer_Color_Fuente());
        
        dudas_JButton.setBackground(CourseRoom.Primer_Color());
        
        dudas_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        dudas_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        DefaultTableModel modelo = (DefaultTableModel) dudas_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < dudas_JTable.getRowCount(); i++) {
            for (int j = 0; j < 5; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }

        Duda_Estudiante_Panel duda_Estudiante_Panel;
        for (Nodo<Duda_Estudiante_Panel> nodo = lista_Dudas.front(); nodo != null; nodo = nodo.next()) {
            duda_Estudiante_Panel = nodo.element();
            duda_Estudiante_Panel.Colorear_Componentes();
        }
        
    }
    
    @Override
    public void Limpiar() {
        lista_Dudas.clear();
        dudas_JTable.removeAll();
    }

}
