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
public class Grupos_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    private Lista<Grupo_Estudiante_Panel> lista_Grupos;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Grupos_Estudiante_Panel(){
        
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
        grupos_JScrollPane = new javax.swing.JScrollPane();
        grupos_JTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 630));

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
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                        .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        grupos_JScrollPane.setBorder(null);
        grupos_JScrollPane.setOpaque(false);

        grupos_JTable.setAutoCreateRowSorter(true);
        grupos_JTable.setModel(

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
                    for(int i = 0; i < grupos_JTable.getRowCount(); i++)
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
            grupos_JTable.setOpaque(false);
            grupos_JTable.setRowHeight(100);
            grupos_JTable.setRowMargin(15);
            grupos_JTable.setShowGrid(true);
            grupos_JTable.setShowVerticalLines(false);
            grupos_JTable.setRowSorter(new TableRowSorter(grupos_JTable.getModel()));
            grupos_JScrollPane.setViewportView(grupos_JTable);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    private void buscar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Grupos_Estudiante_Panel.Buscar_Grupos();
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

    public static int Numero_Grupos(){
        return grupos_JTable.getRowCount();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_JButton;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JScrollPane grupos_JScrollPane;
    private static javax.swing.JTable grupos_JTable;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        grupos_JScrollPane.getViewport().setOpaque(false);
        grupos_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        grupos_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        lista_Grupos = new Lista<>();

        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        grupos_JTable.getTableHeader().setFont(gadugi);

        grupos_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        
        Celda_Renderer[] celdas = new Celda_Renderer[4];
        DefaultTableModel modelo = (DefaultTableModel) grupos_JTable.getModel();

        String id;
        URL url_Imagen;
        Image obtener_Imagen,grupo;
        ImageIcon icono_Grupo;
        Grupo_Estudiante_Panel grupo_Estudiante_Panel;
        for (int i = 0; i < CourseRoom.Faker().number().numberBetween(1, 5); i++) {
            id = CourseRoom.Concatenar("Grupo_", i);
            try {
                System.out.println(id + " -> Getting Image From https://picsum.photos/450/450");
                url_Imagen = new URL("https://picsum.photos/450/450");
                obtener_Imagen = ImageIO.read(url_Imagen);
               
                celdas[1] = new Celda_Renderer(CourseRoom.Faker().lorem().sentence(), id);
                celdas[2] = new Celda_Renderer(CourseRoom.Faker().date().birthday(0, 1).toString(), id);
                celdas[3] = new Celda_Renderer(CourseRoom.Faker().educator().course(),id);

                grupo = obtener_Imagen.getScaledInstance(96, 96, Image.SCALE_SMOOTH);
                icono_Grupo = new ImageIcon(grupo);

                celdas[0] = new Celda_Renderer(icono_Grupo,CourseRoom.Faker().team().name(), id);
                
                grupo_Estudiante_Panel
                        = new Grupo_Estudiante_Panel(obtener_Imagen, celdas[0].Label().getText(), 
                                celdas[3].Label().getText(),celdas[2].Label().getText(),id);
                
                lista_Grupos.push_back(grupo_Estudiante_Panel);
                Tablero_Estudiante_Panel.Agregar_Vista(grupo_Estudiante_Panel, id);
                modelo.addRow(celdas);

                obtener_Imagen.flush();
                obtener_Imagen.getGraphics().dispose();
            } catch (MalformedURLException ex) {

            } catch (IOException ex) {

            }
        }

        grupos_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) grupos_JTable.getModel();

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

        buscar_JButton.setBackground(CourseRoom.Segundo_Color());

        grupos_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        grupos_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        Celda_Renderer celda;
        DefaultTableModel modelo = (DefaultTableModel) grupos_JTable.getModel();
        for (int i = 0; i < grupos_JTable.getRowCount(); i++) {
            for (int j = 0; j < 4; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }

        Grupo_Estudiante_Panel chat_Estudiante_Panel;
        for (Nodo<Grupo_Estudiante_Panel> nodo = lista_Grupos.front(); nodo != null; nodo = nodo.next()) {
            chat_Estudiante_Panel = nodo.element();
            chat_Estudiante_Panel.Establecer_Colores(CourseRoom.Primer_Color(), CourseRoom.Primer_Color_Fuente(),
                    CourseRoom.Segundo_Color(), CourseRoom.Segundo_Color_Fuente(),
                    CourseRoom.Tercer_Color(), CourseRoom.Tercer_Color_Fuente());
        }
    }
    
    @Override
    public void Limpiar() {
        lista_Grupos.clear();
        grupos_JTable.removeAll();
    }
}
