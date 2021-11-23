/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.students;

import main.MainFrame;
import java.awt.Font;
import data.interfaces.Componentes_Interface;
import data.interfaces.Limpieza_Interface;

/**
 *
 * @author LENOVO
 */
public class Tareas_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Tareas_Estudiante_Panel() {
        
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

        titulo_JLabel = new javax.swing.JLabel();
        tareas_JScrollPane = new javax.swing.JScrollPane();
        tareas_JPanel = new javax.swing.JPanel();
        ordenar_Por_JComboBox = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setText("Tareas");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        tareas_JScrollPane.setBorder(null);
        tareas_JScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tareas_JScrollPane.setOpaque(false);

        tareas_JPanel.setOpaque(false);
        tareas_JPanel.setLayout(new javax.swing.BoxLayout(tareas_JPanel, javax.swing.BoxLayout.PAGE_AXIS));
        tareas_JScrollPane.setViewportView(tareas_JPanel);

        ordenar_Por_JComboBox.setFont(new java.awt.Font("Gadugi", 0, 17)); // NOI18N
        ordenar_Por_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha De Entrega: Más Reciente", "Fecha De Entrega: Menos Reciente", "Clase: De A - Z", "Clase: De Z - A", "Nombre: A - Z", "Nombre Z - A", " " }));
        ordenar_Por_JComboBox.setToolTipText("Ordenar Tareas Por");
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
                    .addComponent(tareas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tareas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ordenar_Por_JComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ordenar_Por_JComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenar_Por_JComboBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ordenar_Por_JComboBox;
    private javax.swing.JPanel tareas_JPanel;
    private javax.swing.JScrollPane tareas_JScrollPane;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void Iniciar_Componentes() {
        
        tareas_JScrollPane.getViewport().setOpaque(false);
        tareas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        
        String concatenacion;
        Caja_Tarea_Estudiante_Panel caja_Tarea_Estudiante_Panel;
        
        for(int i = 0; i < MainFrame.getFaker().number().numberBetween(1, 10);i++){
            
            concatenacion = MainFrame.Concatenar("Tarea_",i);
            caja_Tarea_Estudiante_Panel = new Caja_Tarea_Estudiante_Panel(concatenacion);
            tareas_JPanel.add(caja_Tarea_Estudiante_Panel);
        }
    }
    
    @Override
    public void Colorear_Componentes(){
        
        Font gadugi = new Font("Gadugi", 1, 20);
        titulo_JLabel.setBackground(MainFrame.getSecondColor());
        titulo_JLabel.setForeground(MainFrame.getSecondFontColor());
        ordenar_Por_JComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(MainFrame.getSecondColor()), 
                "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                gadugi, MainFrame.getSecondFontColor()));
        
        ordenar_Por_JComboBox.setBackground(MainFrame.getSecondColor());
        ordenar_Por_JComboBox.setForeground(MainFrame.getSecondFontColor());
    }

    @Override
    public void Limpiar() {
        tareas_JPanel.removeAll();
    }

}
