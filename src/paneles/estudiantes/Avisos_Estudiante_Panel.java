/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import interfaces.Limpieza_Interface;
import java.awt.Font;
import interfaces.Componentes_Interface;


/**
 *
 * @author LENOVO
 */
public class Avisos_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Avisos_Estudiante_Panel() {
        
        initComponents();
        
        Iniciar_Componentes(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_JLabel = new javax.swing.JLabel();
        avisos_JScrollPane = new javax.swing.JScrollPane();
        avisos_JPanel = new javax.swing.JPanel();
        ordenar_Por_JComboBox = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setText("Avisos");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        avisos_JScrollPane.setBorder(null);
        avisos_JScrollPane.setMinimumSize(new java.awt.Dimension(1085, 630));
        avisos_JScrollPane.setOpaque(false);
        avisos_JScrollPane.setPreferredSize(new java.awt.Dimension(1073, 516));

        avisos_JPanel.setOpaque(false);
        avisos_JPanel.setLayout(new java.awt.GridLayout(0, 2));
        avisos_JScrollPane.setViewportView(avisos_JPanel);

        ordenar_Por_JComboBox.setFont(new java.awt.Font("Gadugi", 0, 17)); // NOI18N
        ordenar_Por_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha: Más Reciente", "Fecha: Menos Reciente", "Estatus: Leído", "Estatus: No Leído" }));
        ordenar_Por_JComboBox.setToolTipText("Ordenar Avisos Por");
        ordenar_Por_JComboBox.setBorder(null);
        ordenar_Por_JComboBox.setOpaque(true);
        ordenar_Por_JComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ordenar_Por_JComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avisos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avisos_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ordenar_Por_JComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ordenar_Por_JComboBoxItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ordenar_Por_JComboBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avisos_JPanel;
    private javax.swing.JScrollPane avisos_JScrollPane;
    private javax.swing.JComboBox<String> ordenar_Por_JComboBox;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        avisos_JScrollPane.getViewport().setOpaque(false);
        avisos_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        avisos_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        Caja_Aviso_Estudiante_Panel caja_Aviso_Estudiante_Panel;
        for(int i = 0; i < CourseRoom.Faker().number().numberBetween(1, 10);i++){
            caja_Aviso_Estudiante_Panel = new Caja_Aviso_Estudiante_Panel();
            avisos_JPanel.add(caja_Aviso_Estudiante_Panel);
        }
    }
    
    @Override
    public void Colorear_Componentes(){
        Font gadugi = new Font("Gadugi", 1, 20);
        titulo_JLabel.setBackground(CourseRoom.Segundo_Color());
        titulo_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        ordenar_Por_JComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(), 
                "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                gadugi, CourseRoom.Segundo_Color_Fuente()));
        
        ordenar_Por_JComboBox.setBackground(CourseRoom.Segundo_Color());
        ordenar_Por_JComboBox.setForeground(CourseRoom.Segundo_Color_Fuente());
        
    }
    
    @Override
    public void Limpiar() {
        avisos_JPanel.removeAll();
    }
}
