/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import java.awt.Font;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;

/**
 *
 * @author LENOVO
 */
public class Cursos_Actuales_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface, Limpieza_Interface{

    /**
     * Creates new form Student_Courses_Panel
     */
    public Cursos_Actuales_Estudiante_Panel() {
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

        cursos_Actuales_JScrollPane = new javax.swing.JScrollPane();
        cursos_Actuales_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        ordenar_Por_JComboBox = new javax.swing.JComboBox<>();
        mostrar_Cursos_Por_JComboBox = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);

        cursos_Actuales_JScrollPane.setBorder(null);
        cursos_Actuales_JScrollPane.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cursos_Actuales_JScrollPane.setOpaque(false);

        cursos_Actuales_JPanel.setOpaque(false);
        cursos_Actuales_JPanel.setLayout(new java.awt.GridLayout(0, 2));
        cursos_Actuales_JScrollPane.setViewportView(cursos_Actuales_JPanel);

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setText("Cursos Actuales");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        ordenar_Por_JComboBox.setFont(new java.awt.Font("Gadugi", 0, 17)); // NOI18N
        ordenar_Por_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha: Más Reciente", "Fecha: Menos Reciente", "Nombre: A - Z", "Nombre: Z - A", "Nombre Del Profesor: A - Z", "Nombre Del Profesor: Z - A" }));
        ordenar_Por_JComboBox.setToolTipText("Ordenar Cursos Por");
        ordenar_Por_JComboBox.setBorder(null);
        ordenar_Por_JComboBox.setOpaque(true);

        mostrar_Cursos_Por_JComboBox.setFont(new java.awt.Font("Gadugi", 0, 17)); // NOI18N
        mostrar_Cursos_Por_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actuales", "Buscar", "Nuevos", "Recomendados", "Finalizados" }));
        mostrar_Cursos_Por_JComboBox.setToolTipText("Ordenar Cursos Por");
        mostrar_Cursos_Por_JComboBox.setBorder(null);
        mostrar_Cursos_Por_JComboBox.setOpaque(true);
        mostrar_Cursos_Por_JComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mostrar_Cursos_Por_JComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrar_Cursos_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cursos_Actuales_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrar_Cursos_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursos_Actuales_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mostrar_Cursos_Por_JComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mostrar_Cursos_Por_JComboBoxItemStateChanged
        // TODO add your handling code here:
        switch(mostrar_Cursos_Por_JComboBox.getSelectedIndex()){
            case 4:
                Tablero_Estudiante_Panel.Mostrar_Vista("Cursos_Finalizados");
            break;      
        }
        
    }//GEN-LAST:event_mostrar_Cursos_Por_JComboBoxItemStateChanged

    public void Cambiar_Mostrar_Curso(byte valor){
        mostrar_Cursos_Por_JComboBox.setSelectedIndex(valor);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cursos_Actuales_JPanel;
    private javax.swing.JScrollPane cursos_Actuales_JScrollPane;
    private javax.swing.JComboBox<String> mostrar_Cursos_Por_JComboBox;
    private javax.swing.JComboBox<String> ordenar_Por_JComboBox;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        Caja_Curso_Estudiante_Panel caja_Curso_Estudiante_Panel;
        String concatenacion;
        for(int i = 0; i < CourseRoom.Faker().number().numberBetween(1, 10);i++){
            concatenacion = CourseRoom.Concatenar("Curso_Actual_", i);
            caja_Curso_Estudiante_Panel = new Caja_Curso_Estudiante_Panel(concatenacion);
            cursos_Actuales_JPanel.add(caja_Curso_Estudiante_Panel);
        }
       
        cursos_Actuales_JScrollPane.getViewport().setOpaque(false);
        
        cursos_Actuales_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        
        cursos_Actuales_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);;
    }
    
    @Override
    public void Colorear_Componentes(){
        Font gadugi = new java.awt.Font("Gadugi", 1, 20);
        titulo_JLabel.setBackground(CourseRoom.Segundo_Color());
        titulo_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        ordenar_Por_JComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Segundo_Color_Fuente()));
        
        mostrar_Cursos_Por_JComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(),
                "Mostrar Cursos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                gadugi, CourseRoom.Segundo_Color_Fuente()));

        ordenar_Por_JComboBox.setBackground(CourseRoom.Segundo_Color());
        ordenar_Por_JComboBox.setForeground(CourseRoom.Segundo_Color_Fuente());
        
        mostrar_Cursos_Por_JComboBox.setBackground(CourseRoom.Segundo_Color());
        mostrar_Cursos_Por_JComboBox.setForeground(CourseRoom.Segundo_Color_Fuente());
        
    }

    @Override
    public void Limpiar() {
        cursos_Actuales_JPanel.removeAll();
    }
}
