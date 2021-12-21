/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import frames.estudiantes.Crear_Duda_Estudiante_Frame;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import main.CourseRoom;


/**
 *
 * @author LENOVO
 */
public class Dudas_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    private ImageIcon icono_Usuario;
    
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

        contenido_JScrollPane = new javax.swing.JScrollPane();
        contenido_JPanel = new javax.swing.JPanel();
        titulo_JPanel = new javax.swing.JPanel();
        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        ordenar_Por_JComboBox = new javax.swing.JComboBox<>();
        buscar_JButton = new javax.swing.JButton();
        crear_Duda_JButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));
        setLayout(new java.awt.CardLayout());

        contenido_JScrollPane.setBorder(null);
        contenido_JScrollPane.setOpaque(false);

        contenido_JPanel.setOpaque(false);
        contenido_JPanel.setLayout(new javax.swing.BoxLayout(contenido_JPanel, javax.swing.BoxLayout.PAGE_AXIS));

        titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));
        titulo_JPanel.setOpaque(false);
        titulo_JPanel.setPreferredSize(new java.awt.Dimension(1080, 118));

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Dudas");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        ordenar_Por_JComboBox.setFont(new java.awt.Font("Gadugi", 0, 17)); // NOI18N
        ordenar_Por_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Defecto", "Fecha: Más Reciente", "Fecha: Menos Reciente", "Nombre: A - Z", "Nombre: Z - A", "Curso: A - Z", "Curso: Z - A", "Pendientes", "Entregadas" }));
        ordenar_Por_JComboBox.setToolTipText("Ordenar Cursos Por");
        ordenar_Por_JComboBox.setBorder(null);
        ordenar_Por_JComboBox.setOpaque(true);

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

        crear_Duda_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/wonder.png"))); // NOI18N
        crear_Duda_JButton.setBorder(null);
        crear_Duda_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 672, Short.MAX_VALUE)
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                        .addComponent(crear_Duda_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                        .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crear_Duda_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout titulo_JPanelLayout = new javax.swing.GroupLayout(titulo_JPanel);
        titulo_JPanel.setLayout(titulo_JPanelLayout);
        titulo_JPanelLayout.setHorizontalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titulo_JPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titulo_JPanelLayout.setVerticalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulo_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contenido_JPanel.add(titulo_JPanel);

        contenido_JScrollPane.setViewportView(contenido_JPanel);

        add(contenido_JScrollPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Dudas_Estudiante_Panel.Buscar_Dudas();
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

    private void crear_Duda_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Duda_JButtonMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isLeftMouseButton(evt)) {

            Crear_Duda_Estudiante_Frame crear_Duda_Estudiante_Frame
            = new Crear_Duda_Estudiante_Frame(icono_Usuario);

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

    public static int Numero_Dudas(){
        return contenido_JPanel.getComponentCount()-1;
    }
    
    public static void Agregar_Caja_Dudas(Caja_Duda_Estudiante_Panel caja_Duda_Estudiante_Panel) {
        contenido_JPanel.add(caja_Duda_Estudiante_Panel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_JButton;
    private static javax.swing.JPanel contenido_JPanel;
    private javax.swing.JScrollPane contenido_JScrollPane;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JButton crear_Duda_JButton;
    private javax.swing.JComboBox<String> ordenar_Por_JComboBox;
    private javax.swing.JLabel titulo_JLabel;
    private javax.swing.JPanel titulo_JPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        Image imagen_usuario = Tablero_Estudiante_Panel.Imagen_Usuario().getScaledInstance(164, 164, Image.SCALE_SMOOTH);
        icono_Usuario = new ImageIcon(imagen_usuario);

        imagen_usuario.flush();
        contenido_JScrollPane.getViewport().setOpaque(false);
        contenido_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        contenido_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
    }

    @Override
    public void Colorear_Componentes() {
        contenido_Titulo_JPanel.setBackground(CourseRoom.Segundo_Color());

        Font gadugi = new java.awt.Font("Gadugi", 1, 16);

        titulo_JLabel.setBackground(CourseRoom.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Tercer_Color_Fuente());

        ordenar_Por_JComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Tercer_Color_Fuente()));
        ordenar_Por_JComboBox.setBackground(CourseRoom.Tercer_Color());
        ordenar_Por_JComboBox.setForeground(CourseRoom.Tercer_Color_Fuente());

        buscar_JButton.setBackground(CourseRoom.Segundo_Color());
        crear_Duda_JButton.setBackground(CourseRoom.Segundo_Color());
    }
    
    @Override
    public void Limpiar() {
        contenido_JPanel.removeAll();
    }
}
