/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import java.awt.Font;
import javax.swing.SwingUtilities;
import main.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Buscar_Dudas_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    /**
     * Creates new form Cursos_Agrupados_Estudiante_Panel
     */
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

        contenido_JScrollPane = new javax.swing.JScrollPane();
        contenido_JPanel = new javax.swing.JPanel();
        buscar_JTextField = new javax.swing.JTextField();
        dudas_JButton = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 630));

        contenido_JScrollPane.setBorder(null);
        contenido_JScrollPane.setOpaque(false);

        contenido_JPanel.setOpaque(false);
        contenido_JPanel.setLayout(new java.awt.GridLayout(0, 2));
        contenido_JScrollPane.setViewportView(contenido_JPanel);

        buscar_JTextField.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        buscar_JTextField.setBorder(null);
        buscar_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscar_JTextFieldKeyPressed(evt);
            }
        });

        dudas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/shrug.png"))); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenido_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dudas_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_JTextField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar_JTextField)
                    .addComponent(dudas_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_JTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_JTextFieldKeyPressed

    private void dudas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dudas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Pagina_Tareas_Estudiante_Panel.Mostrar_Tareas();
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
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JScrollPane contenido_JScrollPane;
    private javax.swing.JButton dudas_JButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        contenido_JScrollPane.getViewport().setOpaque(false);
        contenido_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        contenido_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
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
        
    }
    
    @Override
    public void Limpiar() {
        contenido_JPanel.removeAll();
    }

}
