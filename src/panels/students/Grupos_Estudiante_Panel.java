/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.students;

import courseroom.MainFrame;
import java.awt.Font;
import data.interfaces.Componentes_Interface;
import data.interfaces.Limpieza_Interface;


/**
 *
 * @author LENOVO
 */
public class Grupos_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    /**
     * Creates new form GroupsPanel
     */
    public Grupos_Estudiante_Panel() {
        
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

        grupos_JScrollPane = new javax.swing.JScrollPane();
        grupos_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        ordenar_Por_JComboBox = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        grupos_JScrollPane.setBorder(null);
        grupos_JScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        grupos_JScrollPane.setOpaque(false);

        grupos_JPanel.setOpaque(false);
        grupos_JPanel.setLayout(new javax.swing.BoxLayout(grupos_JPanel, javax.swing.BoxLayout.PAGE_AXIS));
        grupos_JScrollPane.setViewportView(grupos_JPanel);

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setText("Grupos");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

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
                    .addComponent(grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(grupos_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grupos_JPanel;
    private javax.swing.JScrollPane grupos_JScrollPane;
    private javax.swing.JComboBox<String> ordenar_Por_JComboBox;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables


    @Override
    public void Iniciar_Componentes() {
        grupos_JScrollPane.getViewport().setOpaque(false);
        grupos_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        
        String concatenacion;
        Caja_Grupo_Estudiante_Panel caja_Grupo_Estudiante_Panel;
        for(int i = 0; i < MainFrame.getFaker().number().numberBetween(1, 10);i++){
            
            concatenacion = MainFrame.Concatenar("Grupo_", i);
            caja_Grupo_Estudiante_Panel = new Caja_Grupo_Estudiante_Panel(concatenacion);
            grupos_JPanel.add(caja_Grupo_Estudiante_Panel);
        }
        
    }
    
    @Override
    public void Colorear_Componentes(){
        Font gadugi = new java.awt.Font("Gadugi", 1, 20);
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
        grupos_JPanel.removeAll();
    }
}
