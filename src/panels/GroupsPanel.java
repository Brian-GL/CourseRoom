/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.Color;


/**
 *
 * @author LENOVO
 */
public class GroupsPanel extends javax.swing.JPanel {

    /**
     * Creates new form GroupsPanel
     */
    public GroupsPanel() {
        initComponents();
        jLabelGroupsTitle.setForeground(DashboardPanel.getFontColor());
        jLabelGroupsTitle.setBackground(DashboardPanel.getFirstColor());
        jScrollPaneMisGrupos.getViewport().setOpaque(false);
        jScrollPaneMisGrupos.getVerticalScrollBar().setUnitIncrement(15);
        
        for(int i = 0; i < 3; i++){
            BoxGroupPanel boxGroupPanel = new BoxGroupPanel(i);
            jPanelMisGrupos.add(boxGroupPanel);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneMisGrupos = new javax.swing.JScrollPane();
        jPanelMisGrupos = new javax.swing.JPanel();
        jLabelGroupsTitle = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        jScrollPaneMisGrupos.setBorder(null);
        jScrollPaneMisGrupos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneMisGrupos.setOpaque(false);

        jPanelMisGrupos.setOpaque(false);
        jPanelMisGrupos.setLayout(new javax.swing.BoxLayout(jPanelMisGrupos, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneMisGrupos.setViewportView(jPanelMisGrupos);

        jLabelGroupsTitle.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabelGroupsTitle.setText("Grupos");
        jLabelGroupsTitle.setMaximumSize(new java.awt.Dimension(416, 84));
        jLabelGroupsTitle.setMinimumSize(new java.awt.Dimension(416, 84));
        jLabelGroupsTitle.setOpaque(true);
        jLabelGroupsTitle.setPreferredSize(new java.awt.Dimension(416, 84));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMisGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelGroupsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGroupsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneMisGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void dispose(){
        jPanelMisGrupos.removeAll();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelGroupsTitle;
    private javax.swing.JPanel jPanelMisGrupos;
    private javax.swing.JScrollPane jScrollPaneMisGrupos;
    // End of variables declaration//GEN-END:variables
}
