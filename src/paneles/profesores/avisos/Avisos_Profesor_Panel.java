/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.profesores.avisos;

import clases.Celda_Renderer;
import courseroom.CourseRoom;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author LENOVO
 */
public class Avisos_Profesor_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Avisos_Profesor_Panel(){
        
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

        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        actualizar_JButton = new javax.swing.JButton();
        avisos_JScrollPane = new javax.swing.JScrollPane();
        avisos_JTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1110, 630));
        setOpaque(false);

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(1068, 72));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Avisos");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

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
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        avisos_JScrollPane.setBorder(null);
        avisos_JScrollPane.setOpaque(false);

        avisos_JTable.setAutoCreateRowSorter(true);
        avisos_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Aviso", "Descripción", "Fecha"
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
                    for(int i = 0; i < avisos_JTable.getRowCount(); i++)
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
            avisos_JTable.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
            avisos_JTable.setOpaque(false);
            avisos_JTable.setRowHeight(80);
            avisos_JTable.setRowMargin(15);
            avisos_JTable.setShowGrid(true);
            avisos_JTable.setShowVerticalLines(false);
            avisos_JTable.setRowSorter(new TableRowSorter(avisos_JTable.getModel()));
            avisos_JScrollPane.setViewportView(avisos_JTable);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(avisos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                    .addGap(32, 32, 32))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(avisos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JScrollPane avisos_JScrollPane;
    private javax.swing.JTable avisos_JTable;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        avisos_JScrollPane.getViewport().setOpaque(false);
        avisos_JScrollPane.getVerticalScrollBar().setUnitIncrement(20);
        avisos_JScrollPane.getHorizontalScrollBar().setUnitIncrement(20);
        
        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        avisos_JTable.getTableHeader().setFont(gadugi);
        
        avisos_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        Celda_Renderer[] celdas = new Celda_Renderer[3];
        DefaultTableModel modelo = (DefaultTableModel) avisos_JTable.getModel();
        
        String id = "";
        ImageIcon aviso_Curso = new ImageIcon(getClass().getResource("/recursos/iconos/course_notification.png"));
        ImageIcon aviso_Notificacion = new ImageIcon(getClass().getResource("/recursos/iconos/homework_notification.png"));
        ImageIcon aviso_Grupo = new ImageIcon(getClass().getResource("/recursos/iconos/group_notification.png"));
        ImageIcon aviso_Chat = new ImageIcon(getClass().getResource("/recursos/iconos/chat_notification.png"));
        
        for(int i = 0; i < CourseRoom.Utilerias.number().numberBetween(1,10);i++){
            switch(CourseRoom.Utilerias.number().numberBetween(1,5)){
                case 1:
                    celdas[0] = new Celda_Renderer(aviso_Curso,"Curso",id);
                    break;
                case 2:
                    celdas[0] = new Celda_Renderer(aviso_Notificacion,"Notificación",id);
                    break;
                case 3:
                    celdas[0] = new Celda_Renderer(aviso_Grupo,"Grupo",id);
                    break;
                case 4:
                    celdas[0] = new Celda_Renderer(aviso_Chat,"Chat",id);
                    break;
            }
            
            celdas[1] = new Celda_Renderer(CourseRoom.Utilerias.lorem().paragraph(),id);
            celdas[2] = new Celda_Renderer(CourseRoom.Utilerias.date().birthday(0,1).toString(),id);
            
            modelo.addRow(celdas);
        }
    }

    @Override
    public void Colorear_Componentes() {
      
        contenido_Titulo_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());

        titulo_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());

        avisos_JTable.getTableHeader().setBackground(CourseRoom.Utilerias.Segundo_Color());
        avisos_JTable.getTableHeader().setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
        
        Celda_Renderer celda;
        DefaultTableModel modelo = (DefaultTableModel) avisos_JTable.getModel();
        for(int i = 0; i < avisos_JTable.getRowCount();i++){
            for(int j = 0; j < 3; j++){
                celda = (Celda_Renderer)modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias.Primer_Color_Fuente());
            }
        }
        
    }
    
    @Override
    public void Limpiar() {
        avisos_JTable.removeAll();
    }
    
    
}
