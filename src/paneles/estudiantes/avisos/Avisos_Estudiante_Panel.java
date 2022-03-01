/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes.avisos;

import clases.Celda_Renderer;
import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author LENOVO
 */
public class Avisos_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Avisos_Estudiante_Panel(){
        
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
        acciones_JPanel = new javax.swing.JPanel();
        actualizar_JButton = new javax.swing.JButton();
        avisos_JScrollPane = new javax.swing.JScrollPane();
        avisos_JTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 630));

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(1068, 72));
        contenido_Titulo_JPanel.setLayout(new java.awt.BorderLayout());

        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Avisos");
        titulo_JLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));
        contenido_Titulo_JPanel.add(titulo_JLabel, java.awt.BorderLayout.WEST);

        acciones_JPanel.setOpaque(false);

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

        javax.swing.GroupLayout acciones_JPanelLayout = new javax.swing.GroupLayout(acciones_JPanel);
        acciones_JPanel.setLayout(acciones_JPanelLayout);
        acciones_JPanelLayout.setHorizontalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        acciones_JPanelLayout.setVerticalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenido_Titulo_JPanel.add(acciones_JPanel, java.awt.BorderLayout.EAST);

        avisos_JScrollPane.setBorder(null);
        avisos_JScrollPane.setOpaque(false);

        avisos_JTable.setAutoCreateRowSorter(true);
        avisos_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
            avisos_JTable.setRowHeight(100);
            avisos_JTable.setShowGrid(true);
            avisos_JTable.setSurrendersFocusOnKeystroke(true);
            avisos_JTable.setVerifyInputWhenFocusTarget(false);
            avisos_JTable.setRowSorter(new TableRowSorter(avisos_JTable.getModel()));
            avisos_JScrollPane.setViewportView(avisos_JTable);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addComponent(avisos_JScrollPane)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(avisos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))
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

    private void Agregar_Aviso(String tipo, String aviso, String fecha){
        
        Celda_Renderer[] celdas = new Celda_Renderer[3];
        Celda_Renderer celda;
        DefaultTableModel modelo = (DefaultTableModel) avisos_JTable.getModel();
            
        try {
            
            Image curso = ImageIO.read(getClass().getResource("/recursos/iconos/course_notification.png"));
            Image tarea = ImageIO.read(getClass().getResource("/recursos/iconos/homework_notification.png"));
            Image grupo = ImageIO.read(getClass().getResource("/recursos/iconos/group_notification.png"));
            Image chat = ImageIO.read(getClass().getResource("/recursos/iconos/chat_notification.png"));
            Image pregunta = ImageIO.read(getClass().getResource("/recursos/iconos/homework_make.png"));
            
            ImageIcon aviso_Curso = new ImageIcon(curso);
            ImageIcon aviso_Tarea = new ImageIcon(tarea);
            ImageIcon aviso_Grupo = new ImageIcon(grupo);
            ImageIcon aviso_Chat = new ImageIcon(chat);
            ImageIcon aviso_Pregunta = new ImageIcon(pregunta);
            
            switch(tipo){
                case "Curso":
                    celda = new Celda_Renderer(aviso_Curso,tipo,"");
                    celdas[0] = celda;
                    break;
                case "Tarea":
                    celda = new Celda_Renderer(aviso_Tarea,tipo,"");
                    celdas[0] = celda;
                    break;
                case "Grupo":
                    celda = new Celda_Renderer(aviso_Grupo,tipo,"");
                    celdas[0] = celda;
                    break;
                case "Chat":
                    celda = new Celda_Renderer(aviso_Chat,tipo,"");
                    celdas[0] = celda;
                    break;
                case "Pregunta":
                    celda = new Celda_Renderer(aviso_Pregunta,tipo,"");
                    celdas[0] = celda;
                    break;
            }
            
            celda = new Celda_Renderer(aviso,"");
            celdas[1] = celda;
            celda = new Celda_Renderer(fecha,"");
            celdas[2] = celda;
            
            modelo.addRow(celdas);
            avisos_JTable.setRowHeight(modelo.getRowCount()-1, CourseRoom.Utilerias.Altura_Fila_Tabla(aviso.length()));
            
            curso.flush();
            tarea.flush();
            grupo.flush();
            chat.flush();
            pregunta.flush();
            
        } catch (IOException ex) {
            
        }
        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acciones_JPanel;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JScrollPane avisos_JScrollPane;
    private javax.swing.JTable avisos_JTable;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        avisos_JScrollPane.getViewport().setOpaque(false);
        avisos_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        avisos_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        Font gadugi = new Font("Segoe UI", Font.BOLD, 16);
        avisos_JTable.getTableHeader().setFont(gadugi);
        
        avisos_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        String tipo, aviso, fecha;
        String[] opciones = {"Curso","Tarea","Grupo","Chat","Pregunta"};
        tipo = CourseRoom.Utilerias.options().nextElement(opciones);
        aviso = CourseRoom.Utilerias.lorem().sentence();
        fecha = CourseRoom.Utilerias.Fecha_Hora(CourseRoom.Utilerias.date().birthday(22, 23));

        Agregar_Aviso(tipo, aviso, fecha);
        
    }

    @Override
    public void Colorear_Componentes() {
      
        contenido_Titulo_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());

        titulo_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());

        avisos_JTable.setBackground(CourseRoom.Utilerias.Primer_Color());
        avisos_JTable.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
        
        avisos_JTable.getTableHeader().setBackground(CourseRoom.Utilerias.Tercer_Color());
        avisos_JTable.getTableHeader().setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        avisos_JTable.setGridColor(CourseRoom.Utilerias.Segundo_Color());
        
        avisos_JTable.setSelectionBackground(CourseRoom.Utilerias.Segundo_Color());
        avisos_JTable.setSelectionForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
        
        Celda_Renderer celda;
        DefaultTableModel modelo = (DefaultTableModel) avisos_JTable.getModel();
        for(int i = 0; i < modelo.getRowCount();i++){
            for(int j = 0; j < modelo.getColumnCount(); j++){
                celda = (Celda_Renderer)modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias.Primer_Color_Fuente());
            }
        }
        
    }
    
    @Override
    public void Limpiar() {
        DefaultTableModel modelo = (DefaultTableModel) avisos_JTable.getModel();
        modelo.setRowCount(0);
    }
    
    
}
