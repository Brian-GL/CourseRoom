/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import clases.Celda_Renderer;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import courseroom.CourseRoom;
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
public class Cursos_Nuevos_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    private Lista<Pagina_Curso_Estudiante_Panel> lista_Cursos_Nuevos;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Cursos_Nuevos_Estudiante_Panel(){
        
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
        recomendados_Cursos_JButton = new javax.swing.JButton();
        finalizados_Cursos_JButton = new javax.swing.JButton();
        actuales_Cursos_JButton = new javax.swing.JButton();
        cursos_Nuevos_JScrollPane = new javax.swing.JScrollPane();
        cursos_Nuevos_JTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 630));

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Cursos Nuevos");
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

        recomendados_Cursos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/quality.png"))); // NOI18N
        recomendados_Cursos_JButton.setBorder(null);
        recomendados_Cursos_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        recomendados_Cursos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recomendados_Cursos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recomendados_Cursos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recomendados_Cursos_JButtonMouseExited(evt);
            }
        });

        finalizados_Cursos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/woman.png"))); // NOI18N
        finalizados_Cursos_JButton.setBorder(null);
        finalizados_Cursos_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        finalizados_Cursos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizados_Cursos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finalizados_Cursos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finalizados_Cursos_JButtonMouseExited(evt);
            }
        });

        actuales_Cursos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/work-from-home.png"))); // NOI18N
        actuales_Cursos_JButton.setBorder(null);
        actuales_Cursos_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        actuales_Cursos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actuales_Cursos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actuales_Cursos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actuales_Cursos_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenido_Titulo_JPanelLayout = new javax.swing.GroupLayout(contenido_Titulo_JPanel);
        contenido_Titulo_JPanel.setLayout(contenido_Titulo_JPanelLayout);
        contenido_Titulo_JPanelLayout.setHorizontalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actuales_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(finalizados_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recomendados_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recomendados_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalizados_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actuales_Cursos_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        cursos_Nuevos_JScrollPane.setBorder(null);
        cursos_Nuevos_JScrollPane.setOpaque(false);

        cursos_Nuevos_JTable.setAutoCreateRowSorter(true);
        cursos_Nuevos_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Curso", "Profesor", "Temáticas", "Fecha" ,"Calificación"
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
                    for(int i = 0; i < cursos_Nuevos_JTable.getRowCount(); i++)
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
            cursos_Nuevos_JTable.setOpaque(false);
            cursos_Nuevos_JTable.setRowHeight(100);
            cursos_Nuevos_JTable.setRowMargin(15);
            cursos_Nuevos_JTable.setShowGrid(true);
            cursos_Nuevos_JTable.setShowVerticalLines(false);
            cursos_Nuevos_JTable.setRowSorter(new TableRowSorter(cursos_Nuevos_JTable.getModel()));
            cursos_Nuevos_JScrollPane.setViewportView(cursos_Nuevos_JTable);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursos_Nuevos_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cursos_Nuevos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    private void buscar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
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

    private void recomendados_Cursos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recomendados_Cursos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_recomendados_Cursos_JButtonMouseClicked

    private void recomendados_Cursos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recomendados_Cursos_JButtonMouseEntered
        // TODO add your handling code here:
        recomendados_Cursos_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_recomendados_Cursos_JButtonMouseEntered

    private void recomendados_Cursos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recomendados_Cursos_JButtonMouseExited
        // TODO add your handling code here:
        recomendados_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_recomendados_Cursos_JButtonMouseExited

    private void finalizados_Cursos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizados_Cursos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_finalizados_Cursos_JButtonMouseClicked

    private void finalizados_Cursos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizados_Cursos_JButtonMouseEntered
        // TODO add your handling code here:
        finalizados_Cursos_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_finalizados_Cursos_JButtonMouseEntered

    private void finalizados_Cursos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizados_Cursos_JButtonMouseExited
        // TODO add your handling code here:
        finalizados_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_finalizados_Cursos_JButtonMouseExited

    private void actuales_Cursos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuales_Cursos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_actuales_Cursos_JButtonMouseClicked

    private void actuales_Cursos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuales_Cursos_JButtonMouseEntered
        // TODO add your handling code here:
        actuales_Cursos_JButton.setBackground(CourseRoom.Tercer_Color());
    }//GEN-LAST:event_actuales_Cursos_JButtonMouseEntered

    private void actuales_Cursos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actuales_Cursos_JButtonMouseExited
        // TODO add your handling code here:
        actuales_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_actuales_Cursos_JButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actuales_Cursos_JButton;
    private javax.swing.JButton buscar_JButton;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JScrollPane cursos_Nuevos_JScrollPane;
    private static javax.swing.JTable cursos_Nuevos_JTable;
    private javax.swing.JButton finalizados_Cursos_JButton;
    private javax.swing.JButton recomendados_Cursos_JButton;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        cursos_Nuevos_JScrollPane.getViewport().setOpaque(false);
        cursos_Nuevos_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        cursos_Nuevos_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        lista_Cursos_Nuevos = new Lista<>();

        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        cursos_Nuevos_JTable.getTableHeader().setFont(gadugi);

        cursos_Nuevos_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        Celda_Renderer[] celdas = new Celda_Renderer[5];
        DefaultTableModel modelo = (DefaultTableModel) cursos_Nuevos_JTable.getModel();

        String id;
        URL url_Imagen;
        Image obtener_Imagen_Curso, obtener_Imagen_Profesor, imagen = null;
        ImageIcon icono = null;
        Pagina_Curso_Estudiante_Panel curso_Estudiante_Panel;
        for (int i = 0; i < CourseRoom.Faker().number().numberBetween(1, 5); i++) {
            id = CourseRoom.Concatenar("Curso_Nuevo_", i);
            try {
                System.out.println(id + " -> Getting Image From https://picsum.photos/450/450");
                url_Imagen = new URL("https://picsum.photos/450/450");
                obtener_Imagen_Curso = ImageIO.read(url_Imagen);

                imagen = obtener_Imagen_Curso.getScaledInstance(96, 96, Image.SCALE_SMOOTH);
                icono = new ImageIcon(imagen);

                celdas[0] = new Celda_Renderer(icono, CourseRoom.Faker().educator().course(), id);

                System.out.println(id + " Profesor: -> Getting Image From https://i.pravatar.cc/450");
                url_Imagen = new URL("https://i.pravatar.cc/450");
                obtener_Imagen_Profesor = ImageIO.read(url_Imagen);

                imagen = obtener_Imagen_Profesor.getScaledInstance(96, 96, Image.SCALE_SMOOTH);
                icono = new ImageIcon(imagen);

                celdas[1] = new Celda_Renderer(icono, CourseRoom.Faker().name().fullName(), id);

                celdas[2] = new Celda_Renderer(CourseRoom.Faker().programmingLanguage().name(), id);
                celdas[3] = new Celda_Renderer(CourseRoom.Faker().date().birthday(21, 22).toString(), id);
                celdas[4] = new Celda_Renderer(CourseRoom.Concatenar(
                        String.valueOf(CourseRoom.Faker().number().numberBetween(0, 6)), "/",
                        String.valueOf(CourseRoom.Faker().number().numberBetween(0, 6))), id);

                curso_Estudiante_Panel = new Pagina_Curso_Estudiante_Panel(celdas[0].Label().getText(), obtener_Imagen_Curso,
                        celdas[1].Label().getText(), obtener_Imagen_Profesor, celdas[2].Label().getText(), celdas[3].Label().getText(), id);
                lista_Cursos_Nuevos.push_back(curso_Estudiante_Panel);
                Tablero_Estudiante_Panel.Agregar_Vista(curso_Estudiante_Panel, id);
                modelo.addRow(celdas);

                obtener_Imagen_Curso.flush();
                obtener_Imagen_Curso.getGraphics().dispose();

                obtener_Imagen_Profesor.flush();
                obtener_Imagen_Profesor.getGraphics().dispose();
            } catch (MalformedURLException ex) {

            } catch (IOException ex) {

            }
        }

        cursos_Nuevos_JTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    JTable tabla = (JTable) e.getComponent();
                    int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                    int columna = tabla.getSelectedColumn();

                    DefaultTableModel modelo = (DefaultTableModel) cursos_Nuevos_JTable.getModel();

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

        actuales_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
        finalizados_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
        recomendados_Cursos_JButton.setBackground(CourseRoom.Segundo_Color());
        buscar_JButton.setBackground(CourseRoom.Segundo_Color());
        
        cursos_Nuevos_JTable.getTableHeader().setBackground(CourseRoom.Segundo_Color());
        cursos_Nuevos_JTable.getTableHeader().setForeground(CourseRoom.Segundo_Color_Fuente());

        DefaultTableModel modelo = (DefaultTableModel) cursos_Nuevos_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < cursos_Nuevos_JTable.getRowCount(); i++) {
            for (int j = 0; j < 5; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Primer_Color_Fuente());
            }
        }

        Pagina_Curso_Estudiante_Panel curso_Estudiante_Panel;
        for (Nodo<Pagina_Curso_Estudiante_Panel> nodo = lista_Cursos_Nuevos.front(); nodo != null; nodo = nodo.next()) {
            curso_Estudiante_Panel = nodo.element();
            curso_Estudiante_Panel.Establecer_Colores(CourseRoom.Primer_Color(), CourseRoom.Primer_Color_Fuente(),
                    CourseRoom.Segundo_Color(), CourseRoom.Segundo_Color_Fuente(),
                    CourseRoom.Tercer_Color(), CourseRoom.Tercer_Color_Fuente());
        }
    }

    @Override
    public void Limpiar() {
        lista_Cursos_Nuevos.clear();
        cursos_Nuevos_JTable.removeAll();
    }
}
