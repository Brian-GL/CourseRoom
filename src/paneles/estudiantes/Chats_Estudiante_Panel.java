/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import clases.Celda_Renderer;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import main.CourseRoom;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
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


/**
 *
 * @author LENOVO
 */
public class Chats_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    private Lista<Chat_Estudiante_Panel> lista_Chats;
   
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Chats_Estudiante_Panel(){
        
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
        buscar_JButton = new javax.swing.JButton();
        chats_JScrollPane = new javax.swing.JScrollPane();
        chats_JTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 630));

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Chats Personales");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        buscar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/search.png"))); // NOI18N
        buscar_JButton.setBorder(null);
        buscar_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        buscar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscar_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenido_Titulo_JPanelLayout = new javax.swing.GroupLayout(contenido_Titulo_JPanel);
        contenido_Titulo_JPanel.setLayout(contenido_Titulo_JPanelLayout);
        contenido_Titulo_JPanelLayout.setHorizontalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        chats_JScrollPane.setBorder(null);
        chats_JScrollPane.setOpaque(false);

        chats_JTable.setAutoCreateRowSorter(true);
        chats_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Imagen", "Chat", "Ultimo Mensaje", "Fecha", "No Leídos"
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
                    for(int i = 0; i < chats_JTable.getRowCount(); i++)
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
            chats_JTable.setOpaque(false);
            chats_JTable.setRowHeight(100);
            chats_JTable.setRowMargin(15);
            chats_JTable.setShowGrid(true);
            chats_JTable.setShowVerticalLines(false);
            chats_JTable.setRowSorter(new TableRowSorter(chats_JTable.getModel()));
            chats_JScrollPane.setViewportView(chats_JTable);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chats_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(chats_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    private void buscar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Chats_Estudiante_Panel.Buscar_Chats();
        }
    }//GEN-LAST:event_buscar_JButtonMouseClicked

    private void buscar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_JButtonMouseEntered
        // TODO add your handling code here:
        buscar_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_buscar_JButtonMouseEntered

    private void buscar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_JButtonMouseExited
        // TODO add your handling code here:
        buscar_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_buscar_JButtonMouseExited

    public static int Numero_Chats() {
        return chats_JTable.getRowCount();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_JButton;
    private javax.swing.JScrollPane chats_JScrollPane;
    private static javax.swing.JTable chats_JTable;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        chats_JScrollPane.getViewport().setOpaque(false);
        chats_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        chats_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        lista_Chats = new Lista<>();
        
        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        chats_JTable.getTableHeader().setFont(gadugi);

        chats_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        Celda_Renderer[] celdas = new Celda_Renderer[5];
        DefaultTableModel modelo = (DefaultTableModel) chats_JTable.getModel();

        String id;
        URL url_Imagen ;
        Image obtener_Imagen = null;
        ImageIcon icono_Chat = null;
        Chat_Estudiante_Panel chat_Estudiante_Panel;
        for (int i = 0; i < CourseRoom.Faker().number().numberBetween(5, 20); i++) {
            id = CourseRoom.Concatenar("Chat_",i);
            try {
                System.out.println("Chat ID: " + i + " -> Getting Image From https://i.pravatar.cc/96");
                url_Imagen = new URL("https://i.pravatar.cc/96");
                obtener_Imagen = ImageIO.read(url_Imagen);
                icono_Chat = new ImageIcon(obtener_Imagen);
                
                celdas[0] = new Celda_Renderer(icono_Chat,id);
                celdas[1] = new Celda_Renderer(CourseRoom.Faker().name().fullName(),id);
                celdas[2] = new Celda_Renderer(CourseRoom.Faker().lorem().sentence(),id);
                celdas[3] = new Celda_Renderer(CourseRoom.Faker().date().birthday(0, 1).toString(),id);
                celdas[4] = new Celda_Renderer(String.valueOf(CourseRoom.Faker().number().numberBetween(1, 10)),id);
                
                chat_Estudiante_Panel = new Chat_Estudiante_Panel(celdas[1].Label().getText(),id);
                lista_Chats.push_back(chat_Estudiante_Panel);
                Tablero_Estudiante_Panel.Agregar_Vista(chat_Estudiante_Panel,id);
                modelo.addRow(celdas);
                
                obtener_Imagen.flush();
                obtener_Imagen.getGraphics().dispose();
            } catch (MalformedURLException ex) {
                
            } catch (IOException ex) {
                
            }
        }

        chats_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    
                    JTable tabla = (JTable)e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();
                    
                    DefaultTableModel modelo = (DefaultTableModel) chats_JTable.getModel();

                    Celda_Renderer celda = (Celda_Renderer)modelo.getValueAt(fila,columna);

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

        buscar_JButton.setBackground(CourseRoom.Segundo_Color());
        
        chats_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        chats_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());
        
        DefaultTableModel modelo = (DefaultTableModel) chats_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < chats_JTable.getRowCount(); i++) {
            for (int j = 0; j < 5; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }
        
        Chat_Estudiante_Panel chat_Estudiante_Panel;
        for(Nodo<Chat_Estudiante_Panel> nodo = lista_Chats.front(); nodo != null; nodo = nodo.next()){
            chat_Estudiante_Panel = nodo.element();
            chat_Estudiante_Panel.Establecer_Colores(CourseRoom.Primer_Color(), CourseRoom.Primer_Color_Fuente(), 
                    CourseRoom.Segundo_Color(), CourseRoom.Segundo_Color_Fuente(), 
                    CourseRoom.Tercer_Color(), CourseRoom.Tercer_Color_Fuente());
        }
    }
    
    @Override
    public void Limpiar() {
        lista_Chats.clear();
        chats_JTable.removeAll();
    }
}
