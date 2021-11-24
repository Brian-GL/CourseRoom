/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import java.awt.Font;


/**
 *
 * @author LENOVO
 */
public class Chats_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Chats_Estudiante_Panel(){
        
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
        chats_JScrollPane = new javax.swing.JScrollPane();
        chats_JPanel = new javax.swing.JPanel();
        ordenar_Por_JComboBox = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setText("Chats Personales");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        chats_JScrollPane.setBorder(null);
        chats_JScrollPane.setOpaque(false);

        chats_JPanel.setOpaque(false);
        chats_JPanel.setLayout(new javax.swing.BoxLayout(chats_JPanel, javax.swing.BoxLayout.PAGE_AXIS));
        chats_JScrollPane.setViewportView(chats_JPanel);

        ordenar_Por_JComboBox.setFont(new java.awt.Font("Gadugi", 0, 17)); // NOI18N
        ordenar_Por_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha: Más Reciente", "Fecha: Menos Reciente", "Nombre: A - Z", "Nombre: Z - A" }));
        ordenar_Por_JComboBox.setToolTipText("Ordenar Grupos Por");
        ordenar_Por_JComboBox.setBorder(null);
        ordenar_Por_JComboBox.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chats_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ordenar_Por_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chats_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chats_JPanel;
    private javax.swing.JScrollPane chats_JScrollPane;
    private javax.swing.JComboBox<String> ordenar_Por_JComboBox;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        chats_JScrollPane.getViewport().setOpaque(false);
        chats_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        chats_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        Caja_Chat_Estudiante_Panel caja_Chat_Estudiante_Panel;
        String concatenacion;
        for(int i = 0; i < CourseRoom.Faker().number().numberBetween(1, 10);i++){
            concatenacion = CourseRoom.Concatenar("Chat_",i);
            caja_Chat_Estudiante_Panel = new Caja_Chat_Estudiante_Panel(concatenacion);
            chats_JPanel.add(caja_Chat_Estudiante_Panel);
        }
    }

    @Override
    public void Colorear_Componentes() {
        Font gadugi = new java.awt.Font("Gadugi", 1, 20);
        titulo_JLabel.setBackground(CourseRoom.Segundo_Color());
        titulo_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        ordenar_Por_JComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(CourseRoom.Segundo_Color()), 
                "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                gadugi, CourseRoom.Segundo_Color_Fuente()));
        
        ordenar_Por_JComboBox.setBackground(CourseRoom.Segundo_Color());
        ordenar_Por_JComboBox.setForeground(CourseRoom.Segundo_Color_Fuente());
    }
    
    @Override
    public void Limpiar() {
        chats_JPanel.removeAll();
    }
}