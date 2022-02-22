/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames.profesores;

import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import paneles.profesores.perfil.Perfil_Profesor_Panel;
import paneles.profesores.Tablero_Profesor_Panel;
import paneles.profesores.preguntas.Preguntas_Profesor_Panel;

/**
 *
 * @author LENOVO
 */
public class Preguntar_Profesor_Frame extends javax.swing.JDialog implements Componentes_Interface{

    
    public Preguntar_Profesor_Frame() {
        
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

        contenido_JPanel = new javax.swing.JPanel();
        preguntar_JButton = new javax.swing.JButton();
        descripcion_Pregunta_JScrollPane = new javax.swing.JScrollPane();
        descripcion_Pregunta_JTextPane = new javax.swing.JTextPane();
        pregunta_JTextField = new javax.swing.JTextField();
        cerrar_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1000, 300));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new java.awt.CardLayout());

        contenido_JPanel.setMaximumSize(new java.awt.Dimension(800, 227));
        contenido_JPanel.setMinimumSize(new java.awt.Dimension(800, 227));
        contenido_JPanel.setPreferredSize(new java.awt.Dimension(800, 227));

        preguntar_JButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        preguntar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/doubt.png"))); // NOI18N
        preguntar_JButton.setText("Preguntar");
        ((ImageIcon)preguntar_JButton.getIcon()).getImage().flush();
        preguntar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preguntar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                preguntar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                preguntar_JButtonMouseExited(evt);
            }
        });

        descripcion_Pregunta_JScrollPane.setBorder(null);

        descripcion_Pregunta_JTextPane.setBorder(null);
        descripcion_Pregunta_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        descripcion_Pregunta_JScrollPane.setViewportView(descripcion_Pregunta_JTextPane);

        pregunta_JTextField.setFont(new java.awt.Font("Gadugi", 1, 17)); // NOI18N
        pregunta_JTextField.setBorder(null);
        pregunta_JTextField.setOpaque(true);

        cerrar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/close.png"))); // NOI18N
        cerrar_JButton.setBorder(null);
        ((ImageIcon)cerrar_JButton.getIcon()).getImage().flush();
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
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(cerrar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(preguntar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descripcion_Pregunta_JScrollPane)
                    .addComponent(pregunta_JTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcion_Pregunta_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cerrar_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(preguntar_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(contenido_JPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preguntar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preguntar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(!pregunta_JTextField.getText().isBlank() && !pregunta_JTextField.getText().isEmpty()){
                if (!descripcion_Pregunta_JTextPane.getText().isBlank() && !descripcion_Pregunta_JTextPane.getText().isEmpty()) {
                    int cuenta = Preguntas_Profesor_Panel.Numero_Preguntas()+1;
                    String id = CourseRoom.Utilerias.Concatenar("Pregunta_", cuenta);
                    
                    Preguntas_Profesor_Panel.Agregar_Pregunta(pregunta_JTextField.getText(), descripcion_Pregunta_JTextPane.getText(),
                    Perfil_Profesor_Panel.Nombre_Completo(),CourseRoom.Utilerias.Fecha_Hora_Local(),id);
                    Tablero_Profesor_Panel.Mostrar_Vista(id);
                    
                    this.dispose();
                }
                
            }
        }
    }//GEN-LAST:event_preguntar_JButtonMouseClicked

    private void preguntar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preguntar_JButtonMouseEntered
        // TODO add your handling code here:
        preguntar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        preguntar_JButton.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
    }//GEN-LAST:event_preguntar_JButtonMouseEntered

    private void preguntar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preguntar_JButtonMouseExited
        // TODO add your handling code here:
        preguntar_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
        preguntar_JButton.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
    }//GEN-LAST:event_preguntar_JButtonMouseExited

    private void cerrar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.dispose();
        }
    }//GEN-LAST:event_cerrar_JButtonMouseClicked

    private void cerrar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseEntered
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
    }//GEN-LAST:event_cerrar_JButtonMouseEntered

    private void cerrar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseExited
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_cerrar_JButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar_JButton;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JScrollPane descripcion_Pregunta_JScrollPane;
    private javax.swing.JTextPane descripcion_Pregunta_JTextPane;
    private javax.swing.JTextField pregunta_JTextField;
    private javax.swing.JButton preguntar_JButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        Font gadugi = new java.awt.Font("Gadugi", 1, 16);
        
        pregunta_JTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Pregunta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Utilerias.Tercer_Color_Fuente()));
        
        descripcion_Pregunta_JScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Descripcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Utilerias.Tercer_Color_Fuente()));
        
        descripcion_Pregunta_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        descripcion_Pregunta_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        
        descripcion_Pregunta_JScrollPane.setBackground(CourseRoom.Utilerias.Tercer_Color());
        descripcion_Pregunta_JScrollPane.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        
        descripcion_Pregunta_JTextPane.setBackground(CourseRoom.Utilerias.Tercer_Color());
        descripcion_Pregunta_JTextPane.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        descripcion_Pregunta_JTextPane.setCaretColor(CourseRoom.Utilerias.Tercer_Color_Fuente());
        
        pregunta_JTextField.setBackground(CourseRoom.Utilerias.Tercer_Color());
        pregunta_JTextField.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        pregunta_JTextField.setCaretColor(CourseRoom.Utilerias.Tercer_Color_Fuente());
        
        contenido_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());
        
        cerrar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        
        preguntar_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
        preguntar_JButton.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
               
    }
}
