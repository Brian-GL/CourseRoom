/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames.estudiantes;

import interfaces.Componentes_Interface;
import java.awt.Font;
import java.time.LocalDateTime;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import main.CourseRoom;
import paneles.estudiantes.Caja_Duda_Estudiante_Panel;
import paneles.estudiantes.Dudas_Estudiante_Panel;
import paneles.estudiantes.Perfil_Estudiante_Panel;
import paneles.estudiantes.Tablero_Estudiante_Panel;

/**
 *
 * @author LENOVO
 */
public class Crear_Duda_Estudiante_Frame extends javax.swing.JDialog implements Componentes_Interface{

    /**
     * Creates new form Crear_Duda_Estudiante_Frame
     */
    public Crear_Duda_Estudiante_Frame(Icon icono) {
        
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        preguntador_Imagen_JLabel.setIcon(icono);
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

        contenido_JPanel = new javax.swing.JPanel();
        preguntador_Imagen_JLabel = new javax.swing.JLabel();
        crear_Duda_JButton = new javax.swing.JButton();
        descripcion_Duda_JScrollPane = new javax.swing.JScrollPane();
        descripcion_Duda_JTextPane = new javax.swing.JTextPane();
        duda_JTextField = new javax.swing.JTextField();
        cerrar_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Nueva Duda");
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 227));
        setMinimumSize(new java.awt.Dimension(800, 227));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        contenido_JPanel.setPreferredSize(new java.awt.Dimension(800, 245));

        preguntador_Imagen_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preguntador_Imagen_JLabel.setPreferredSize(new java.awt.Dimension(164, 164));

        crear_Duda_JButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        crear_Duda_JButton.setText("Crear Duda");
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

        descripcion_Duda_JScrollPane.setBorder(null);

        descripcion_Duda_JTextPane.setBorder(null);
        descripcion_Duda_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        descripcion_Duda_JScrollPane.setViewportView(descripcion_Duda_JTextPane);

        duda_JTextField.setFont(new java.awt.Font("Gadugi", 1, 17)); // NOI18N
        duda_JTextField.setBorder(null);
        duda_JTextField.setOpaque(true);

        cerrar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/close.png"))); // NOI18N
        cerrar_JButton.setBorder(null);
        cerrar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion_Duda_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(cerrar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(duda_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(preguntador_Imagen_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crear_Duda_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(duda_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(cerrar_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descripcion_Duda_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(preguntador_Imagen_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crear_Duda_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crear_Duda_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Duda_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(!duda_JTextField.getText().isBlank() && !duda_JTextField.getText().isEmpty()){
                if (!descripcion_Duda_JTextPane.getText().isBlank() && !descripcion_Duda_JTextPane.getText().isEmpty()) {
                    int cuenta = Dudas_Estudiante_Panel.Numero_Dudas()+1;
                    LocalDateTime tiempo_Actual = LocalDateTime.now();
                    
                    String llave = CourseRoom.Concatenar("Duda_", cuenta);
                    
                    Caja_Duda_Estudiante_Panel caja_Duda_Estudiante_Panel =
                            new Caja_Duda_Estudiante_Panel(llave,duda_JTextField.getText(), descripcion_Duda_JTextPane.getText(),
                            Perfil_Estudiante_Panel.Nombre_Completo(),tiempo_Actual.toString(),preguntador_Imagen_JLabel.getIcon(),
                    CourseRoom.Primer_Color(),CourseRoom.Primer_Color_Fuente(), CourseRoom.Segundo_Color(), CourseRoom.Segundo_Color_Fuente(),
                    CourseRoom.Tercer_Color(), CourseRoom.Tercer_Color_Fuente());
                    
                    Dudas_Estudiante_Panel.Agregar_Caja_Dudas(caja_Duda_Estudiante_Panel);
                    
                    Tablero_Estudiante_Panel.Mostrar_Vista(llave);
                    
                    this.dispose();
                }
                
            }
        }
    }//GEN-LAST:event_crear_Duda_JButtonMouseClicked

    private void crear_Duda_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Duda_JButtonMouseEntered
        // TODO add your handling code here:
        crear_Duda_JButton.setBackground(CourseRoom.Segundo_Color());
        crear_Duda_JButton.setForeground(CourseRoom.Segundo_Color_Fuente());
    }//GEN-LAST:event_crear_Duda_JButtonMouseEntered

    private void crear_Duda_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Duda_JButtonMouseExited
        // TODO add your handling code here:
        crear_Duda_JButton.setBackground(CourseRoom.Tercer_Color());
        crear_Duda_JButton.setForeground(CourseRoom.Tercer_Color_Fuente());
    }//GEN-LAST:event_crear_Duda_JButtonMouseExited

    private void cerrar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.dispose();
        }
    }//GEN-LAST:event_cerrar_JButtonMouseClicked

    private void cerrar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseEntered
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Color_Azul_Claro());
    }//GEN-LAST:event_cerrar_JButtonMouseEntered

    private void cerrar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseExited
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Color_Azul_Oscuro());
    }//GEN-LAST:event_cerrar_JButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar_JButton;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JButton crear_Duda_JButton;
    private javax.swing.JScrollPane descripcion_Duda_JScrollPane;
    private javax.swing.JTextPane descripcion_Duda_JTextPane;
    private javax.swing.JTextField duda_JTextField;
    private javax.swing.JLabel preguntador_Imagen_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        this.setLocationRelativeTo(null);
        Font gadugi = new java.awt.Font("Gadugi", 1, 16);
        
        duda_JTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Duda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Tercer_Color_Fuente()));
        
        descripcion_Duda_JScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Descripcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Tercer_Color_Fuente()));
        
        descripcion_Duda_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        descripcion_Duda_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        
        descripcion_Duda_JTextPane.setBackground(CourseRoom.Tercer_Color());
        descripcion_Duda_JTextPane.setForeground(CourseRoom.Tercer_Color_Fuente());
        descripcion_Duda_JTextPane.setCaretColor(CourseRoom.Tercer_Color_Fuente());
        
        duda_JTextField.setBackground(CourseRoom.Tercer_Color());
        duda_JTextField.setForeground(CourseRoom.Tercer_Color_Fuente());
        duda_JTextField.setCaretColor(CourseRoom.Tercer_Color_Fuente());
        
        contenido_JPanel.setBackground(CourseRoom.Segundo_Color());
        
        crear_Duda_JButton.setBackground(CourseRoom.Tercer_Color());
        crear_Duda_JButton.setForeground(CourseRoom.Tercer_Color_Fuente());
               
    }
}
