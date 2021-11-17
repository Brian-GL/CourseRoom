/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.students;

import courseroom.MainFrame;
import data.interfaces.ColorComponents;
import data.interfaces.DisposeInterface;
import java.awt.Font;


/**
 *
 * @author LENOVO
 */
public class Student_Notices_Panel extends javax.swing.JPanel implements DisposeInterface, ColorComponents{

    /**
     * Creates new form AvisosPanel
     */
    public Student_Notices_Panel() {
        initComponents();
        
        jScrollPaneAllNotices.getViewport().setOpaque(false);
        jScrollPaneAllNotices.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPaneAllNotices.getHorizontalScrollBar().setUnitIncrement(15);
        
        Student_Box_Notice_Panel boxAvisoPanel;
        for(int i = 0; i < MainFrame.getFaker().number().numberBetween(1, 10);i++){
            boxAvisoPanel = new Student_Box_Notice_Panel();
            jPanelAllNotices.add(boxAvisoPanel);
        }
        
        
    }

    @Override
    public void ColorComponents(){
        Font gadugi = new java.awt.Font("Gadugi", 1, 20);
        jLabelNoticesTitle.setBackground(MainFrame.getSecondColor());
        jLabelNoticesTitle.setForeground(MainFrame.getSecondFontColor());
        jComboBoxOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(MainFrame.getSecondColor()), 
                "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                gadugi, MainFrame.getSecondFontColor()));
        
        jComboBoxOrderBy.setBackground(MainFrame.getSecondColor());
        jComboBoxOrderBy.setForeground(MainFrame.getSecondFontColor());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNoticesTitle = new javax.swing.JLabel();
        jScrollPaneAllNotices = new javax.swing.JScrollPane();
        jPanelAllNotices = new javax.swing.JPanel();
        jComboBoxOrderBy = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);

        jLabelNoticesTitle.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabelNoticesTitle.setText("Avisos");
        jLabelNoticesTitle.setMaximumSize(new java.awt.Dimension(416, 84));
        jLabelNoticesTitle.setMinimumSize(new java.awt.Dimension(416, 84));
        jLabelNoticesTitle.setOpaque(true);
        jLabelNoticesTitle.setPreferredSize(new java.awt.Dimension(416, 84));

        jScrollPaneAllNotices.setBorder(null);
        jScrollPaneAllNotices.setMinimumSize(new java.awt.Dimension(1085, 630));
        jScrollPaneAllNotices.setOpaque(false);
        jScrollPaneAllNotices.setPreferredSize(new java.awt.Dimension(1073, 516));

        jPanelAllNotices.setOpaque(false);
        jPanelAllNotices.setLayout(new javax.swing.BoxLayout(jPanelAllNotices, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneAllNotices.setViewportView(jPanelAllNotices);

        jComboBoxOrderBy.setFont(new java.awt.Font("Gadugi", 0, 17)); // NOI18N
        jComboBoxOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha: Más Reciente", "Fecha: Menos Reciente", " " }));
        jComboBoxOrderBy.setToolTipText("Ordenar Avisos Por");
        jComboBoxOrderBy.setBorder(null);
        jComboBoxOrderBy.setOpaque(true);
        jComboBoxOrderBy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOrderByItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneAllNotices, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNoticesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoticesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneAllNotices, javax.swing.GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOrderByItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOrderByItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOrderByItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxOrderBy;
    private javax.swing.JLabel jLabelNoticesTitle;
    private javax.swing.JPanel jPanelAllNotices;
    private javax.swing.JScrollPane jScrollPaneAllNotices;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Dispose() {
        jPanelAllNotices.removeAll();
    }
}
