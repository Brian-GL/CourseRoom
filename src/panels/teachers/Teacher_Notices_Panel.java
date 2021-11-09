/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.teachers;

import com.github.javafaker.Faker;
import courseroom.MainFrame;
import data.interfaces.DisposeInterface;


/**
 *
 * @author LENOVO
 */
public class Teacher_Notices_Panel extends javax.swing.JPanel implements DisposeInterface{

    /**
     * Creates new form AvisosPanel
     */
    public Teacher_Notices_Panel() {
        initComponents();
        
        jScrollPaneMisAvisos.getViewport().setOpaque(false);
        jScrollPaneMisAvisos.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPaneMisAvisos.getHorizontalScrollBar().setUnitIncrement(15);
        
        
       Faker faker = new Faker();
        for(int i = 0; i < faker.number().numberBetween(1, 10);i++){
            Teacher_Box_Notice_Panel boxAvisoPanel = new Teacher_Box_Notice_Panel();
            jPanelMisAvisos.add(boxAvisoPanel);
        }
        
    }

    public void colorMyComponents(){
        jLabelNoticesTitle.setBackground(MainFrame.getSecondColor());
        jLabelNoticesTitle.setForeground(MainFrame.getSecondFontColor());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNoticesTitle = new javax.swing.JLabel();
        jScrollPaneMisAvisos = new javax.swing.JScrollPane();
        jPanelMisAvisos = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);

        jLabelNoticesTitle.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabelNoticesTitle.setText("Avisos");
        jLabelNoticesTitle.setMaximumSize(new java.awt.Dimension(416, 84));
        jLabelNoticesTitle.setMinimumSize(new java.awt.Dimension(416, 84));
        jLabelNoticesTitle.setOpaque(true);
        jLabelNoticesTitle.setPreferredSize(new java.awt.Dimension(416, 84));

        jScrollPaneMisAvisos.setBorder(null);
        jScrollPaneMisAvisos.setMinimumSize(new java.awt.Dimension(1085, 630));
        jScrollPaneMisAvisos.setOpaque(false);
        jScrollPaneMisAvisos.setPreferredSize(new java.awt.Dimension(1073, 516));

        jPanelMisAvisos.setOpaque(false);
        jPanelMisAvisos.setLayout(new javax.swing.BoxLayout(jPanelMisAvisos, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneMisAvisos.setViewportView(jPanelMisAvisos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMisAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNoticesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNoticesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneMisAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelNoticesTitle;
    private javax.swing.JPanel jPanelMisAvisos;
    private javax.swing.JScrollPane jScrollPaneMisAvisos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose() {
        jPanelMisAvisos.removeAll();
    }
}
