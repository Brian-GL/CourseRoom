package paneles.profesores.cursos;

import javax.swing.JLayeredPane;
import clases.Celda_Renderer;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import courseroom.CourseRoom;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import modelos.CursosCreadosProfesorModel;
import paneles.profesores.Tablero_Profesor_Panel;

/**
 *
 * @author LENOVO
 */
public class Cursos_Profesor_Panel extends JLayeredPane implements Limpieza_Interface, Componentes_Interface{

    private Lista<Curso_Profesor_Panel> cursos_Creados_Lista;
    
    /**
     * Creates new form Cursos_Profesor_Panel
     */
    public Cursos_Profesor_Panel() {
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
        crear_Curso_JButton = new javax.swing.JButton();
        actualizar_JButton = new javax.swing.JButton();
        cursos_Creados_JScrollPane = new javax.swing.JScrollPane();
        cursos_Creados_JTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1110, 630));

        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 68));
        contenido_Titulo_JPanel.setOpaque(false);
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(822, 68));
        contenido_Titulo_JPanel.setLayout(new java.awt.BorderLayout());

        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Cursos Creados");
        titulo_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));
        contenido_Titulo_JPanel.add(titulo_JLabel, java.awt.BorderLayout.WEST);

        acciones_JPanel.setOpaque(false);

        crear_Curso_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/training.png"))); // NOI18N
        crear_Curso_JButton.setToolTipText("<html><h3>Crear Un<br>Nuevo Curso</h3></html>");
        crear_Curso_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)crear_Curso_JButton.getIcon()).getImage().flush();
        crear_Curso_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_Curso_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crear_Curso_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crear_Curso_JButtonMouseExited(evt);
            }
        });

        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/updated.png"))); // NOI18N
        actualizar_JButton.setToolTipText("<html><h3>Actualizar<br>Página</h3></html>");
        actualizar_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addContainerGap()
                .addComponent(crear_Curso_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizar_JButton)
                .addGap(0, 0, 0))
        );
        acciones_JPanelLayout.setVerticalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crear_Curso_JButton)
                    .addComponent(actualizar_JButton))
                .addContainerGap())
        );

        contenido_Titulo_JPanel.add(acciones_JPanel, java.awt.BorderLayout.EAST);

        cursos_Creados_JScrollPane.setBorder(null);
        cursos_Creados_JScrollPane.setOpaque(false);

        cursos_Creados_JTable.setAutoCreateRowSorter(true);
        cursos_Creados_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cursos_Creados_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Curso", "Temáticas", "Creado", "Estatus"
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
                    for(int i = 0; i < cursos_Creados_JTable.getRowCount(); i++)
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
            cursos_Creados_JTable.setRowHeight(96);
            cursos_Creados_JTable.setRowMargin(5);
            cursos_Creados_JTable.setShowGrid(true);
            cursos_Creados_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
            cursos_Creados_JTable.setRowSorter(new TableRowSorter(cursos_Creados_JTable.getModel()));
            cursos_Creados_JTable.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    if (e.getClickCount() == 2) {

                        JTable tabla = (JTable) e.getComponent();
                        int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                        int columna = tabla.getSelectedColumn();
                        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                        Celda_Renderer celda = (Celda_Renderer) modelo.getValueAt(fila, columna);
                        Tablero_Profesor_Panel.Mostrar_Vista(celda.ID());
                    }
                }
            });
            cursos_Creados_JScrollPane.setViewportView(cursos_Creados_JTable);

            setLayer(contenido_Titulo_JPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
            setLayer(cursos_Creados_JScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cursos_Creados_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(40, 40, 40))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cursos_Creados_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    private void crear_Curso_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Curso_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            String id = "Curso_Temporal";
            Crear_Curso_Profesor_Panel crear_Curso_Profesor_Panel = new Crear_Curso_Profesor_Panel(-1,id);
            Tablero_Profesor_Panel.Agregar_Vista(crear_Curso_Profesor_Panel,id);
            Tablero_Profesor_Panel.Mostrar_Vista(id);
        }
    }//GEN-LAST:event_crear_Curso_JButtonMouseClicked

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            SwingUtilities.invokeLater(() -> {
                Obtener_Cursos_Creados_Profesor();
            });
        }
    }//GEN-LAST:event_actualizar_JButtonMouseClicked

    private void actualizar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseEntered
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseEntered

    private void actualizar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseExited
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseExited

    private void crear_Curso_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Curso_JButtonMouseEntered
        // TODO add your handling code here:
        crear_Curso_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
    }//GEN-LAST:event_crear_Curso_JButtonMouseEntered

    private void crear_Curso_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Curso_JButtonMouseExited
        // TODO add your handling code here:
        crear_Curso_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_crear_Curso_JButtonMouseExited

    private void Agregar_Curso_Actual(String id, byte[] imagen_Curso, String nombre_Curso,
            String intereses_Tematicas, String fecha_Creacion, String numero_Inscripciones){
        
        Image imagen;
        BufferedImage obtener_Imagen_Curso;
        Celda_Renderer[] celdas = new Celda_Renderer[5];
        Celda_Renderer celda;
        ImageIcon icono;
        String vacio = new String();
        
        try {
            
            try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imagen_Curso)){
                obtener_Imagen_Curso = ImageIO.read(byteArrayInputStream);
                imagen = obtener_Imagen_Curso.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
                icono = new ImageIcon(imagen);
                celda = new Celda_Renderer(icono, nombre_Curso, id);
                celdas[0] = celda;
                //icono.getImage().flush();
            } 
            
            celda = new Celda_Renderer(intereses_Tematicas, id);
            celdas[1] = celda;
            celda = new Celda_Renderer(fecha_Creacion, id);
            celdas[2] = celda;
            celda = new Celda_Renderer(numero_Inscripciones, id);
            celdas[3] = celda;
            imagen = ImageIO.read(getClass().getResource("/recursos/iconos/close.png"));
            icono  = new ImageIcon(imagen);
            celda = new Celda_Renderer(icono,vacio);
            celdas[4] = celda;
            
            DefaultTableModel modelo = (DefaultTableModel) cursos_Creados_JTable.getModel();
            
            Curso_Profesor_Panel curso_Profesor_Panel
                    = new Curso_Profesor_Panel(/*nombre_Curso, obtener_Imagen_Curso,fecha_Creacion,  id,*/-1);
            
            cursos_Creados_Lista.push_back(curso_Profesor_Panel);
            Tablero_Profesor_Panel.Agregar_Vista(curso_Profesor_Panel, id);
            modelo.addRow(celdas);
            imagen.flush();
            obtener_Imagen_Curso.flush();
            obtener_Imagen_Curso.getGraphics().dispose();
        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            CourseRoom.Utilerias().Mensaje_Error("Error Al Agregar El Curso",ex.getMessage());
        }
    }
    
    private void Agregar_Curso_Creado(CursosCreadosProfesorModel cursosCreadosProfesorModel){
        
        DefaultTableModel modelo = (DefaultTableModel) cursos_Creados_JTable.getModel();
        Celda_Renderer[] celdas = new Celda_Renderer[5];
        Celda_Renderer celda;
        
        Image imagen;
        ImageIcon icono;
        
        String id = CourseRoom.Utilerias().Concatenar("Agregar_Curso_Creado_", cursosCreadosProfesorModel.Id_Curso());
        
        celda = new Celda_Renderer(cursosCreadosProfesorModel.Nombre(),id);
        celdas[0] = celda;
        
        byte[] bytes_Imagen = CourseRoom.Solicitudes().Obtener_Imagen_Curso(cursosCreadosProfesorModel.Id_Curso());
        
        if (bytes_Imagen != null){
            
            if(bytes_Imagen.length > 0){
            
                imagen = CourseRoom.Utilerias().Obtener_Imagen(bytes_Imagen);

                if(imagen != null){

                    imagen = imagen.getScaledInstance(95, 95, Image.SCALE_SMOOTH);
                    icono = new ImageIcon(imagen);
                    celda = new Celda_Renderer(icono,cursosCreadosProfesorModel.Nombre(), id);
                    celdas[0] = celda;
                    
                    imagen.flush();
                }
            }
            else{
                celda = new Celda_Renderer(cursosCreadosProfesorModel.Nombre(), id);
                celdas[0] = celda;
            }
            
        }else{
            celda = new Celda_Renderer(cursosCreadosProfesorModel.Nombre(), id);
            celdas[0] = celda;
        }
        
        celda = new Celda_Renderer(cursosCreadosProfesorModel.Tematicas(),id);
        celdas[1] = celda;
        celda = new Celda_Renderer(cursosCreadosProfesorModel.Fecha_Creacion(),id);
        celdas[2] = celda;
        celda = new Celda_Renderer(cursosCreadosProfesorModel.Estatus(),id);
        celdas[3] = celda;
        modelo.addRow(celdas);
        Curso_Profesor_Panel curso_Profesor_Panel =
                new Curso_Profesor_Panel(cursosCreadosProfesorModel.Id_Curso());

        cursos_Creados_Lista.push_back(curso_Profesor_Panel);

        Tablero_Profesor_Panel.Agregar_Vista(curso_Profesor_Panel, id);


    }
    
    private void Obtener_Cursos_Creados_Profesor(){
        
        // Limpieza:
        DefaultTableModel modelo = (DefaultTableModel) cursos_Creados_JTable.getModel();
        modelo.setRowCount(0);
        
        Curso_Profesor_Panel curso_Profesor_Panel;
        while(!cursos_Creados_Lista.is_empty()){
            curso_Profesor_Panel = cursos_Creados_Lista.delist();
            curso_Profesor_Panel.Limpiar();
            Tablero_Profesor_Panel.Retirar_Vista(curso_Profesor_Panel);
        }
        
        // Obtención:
        
        Lista<CursosCreadosProfesorModel> response 
                = CourseRoom.Solicitudes().Obtener_Cursos_Creados_Profesor(Tablero_Profesor_Panel.Id_Usuario());
        
        if(!response.is_empty()){
            while(!response.is_empty()){
                Agregar_Curso_Creado(response.delist());
            }
        }else{
            CourseRoom.Utilerias().Mensaje_Alerta("Cursos Creados", "No Se Encontraron Cursos Nuevos");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acciones_JPanel;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JButton crear_Curso_JButton;
    private javax.swing.JScrollPane cursos_Creados_JScrollPane;
    private static javax.swing.JTable cursos_Creados_JTable;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        Font gadugi = new Font("Segoe UI", Font.BOLD, 16);
       
        // Cursos actuales:
        cursos_Creados_JScrollPane.getViewport().setOpaque(false);
        cursos_Creados_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        cursos_Creados_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        cursos_Creados_Lista = new Lista<>();
        cursos_Creados_JTable.getTableHeader().setFont(gadugi);
        cursos_Creados_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
    }

    @Override
    public void Colorear_Componentes() {
        
        //Titulo cursos:
        titulo_JLabel.setBackground(CourseRoom.Utilerias().Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        
        crear_Curso_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        actualizar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        
        cursos_Creados_JTable.setBackground(CourseRoom.Utilerias().Primer_Color());
        cursos_Creados_JTable.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        cursos_Creados_JTable.getTableHeader().setBackground(CourseRoom.Utilerias().Tercer_Color());
        cursos_Creados_JTable.getTableHeader().setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        cursos_Creados_JTable.setGridColor(CourseRoom.Utilerias().Segundo_Color());
        
        cursos_Creados_JTable.setSelectionBackground(CourseRoom.Utilerias().Segundo_Color());
        cursos_Creados_JTable.setSelectionForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        DefaultTableModel modelo = (DefaultTableModel) cursos_Creados_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias().Primer_Color_Fuente());
            }
        }
        
        Curso_Profesor_Panel curso_Profesor_Panel;
        for (Nodo<Curso_Profesor_Panel> nodo = cursos_Creados_Lista.front(); nodo != null; nodo = nodo.next()) {
            curso_Profesor_Panel = nodo.element();
            curso_Profesor_Panel.Colorear_Componentes();
        }
        
    }

    @Override
    public void Limpiar() {
        DefaultTableModel modelo = (DefaultTableModel) cursos_Creados_JTable.getModel();
        modelo.setRowCount(0);
        cursos_Creados_Lista.clear();
        
    }
}
