/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import javax.swing.border.TitledBorder;

/**
 *
 * @author LENOVO
 */
public class NoticesPanel extends javax.swing.JPanel {

    /**
     * Creates new form AvisosPanel
     */
    public NoticesPanel() {
        initComponents();
        
        jScrollPaneMisAvisos.getViewport().setOpaque(false);
        jScrollPaneMisAvisos.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPaneMisAvisos.getVerticalScrollBar().setUnitIncrement(15);
        
        TitledBorder border = (TitledBorder) jScrollPaneMisAvisos.getBorder();
        border.setTitleColor(DashboardPanel.getSecondFontColor());
        
        for(int i = 0; i < 5; i++){
            BoxAvisoPanel boxAvisoPanel = new BoxAvisoPanel("https://source.unsplash.com/random");
            jPanelMisAvisos.add(boxAvisoPanel);
            System.out.println("Getting Image From : https://source.unsplash.com/random");
        }
        
    }

    public void dispose(){
        jPanelMisAvisos.removeAll();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneMisAvisos = new javax.swing.JScrollPane();
        jPanelMisAvisos = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setLayout(new java.awt.GridLayout(1, 1));

        jScrollPaneMisAvisos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tus Avisos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 18))); // NOI18N
        jScrollPaneMisAvisos.setMinimumSize(new java.awt.Dimension(1085, 630));
        jScrollPaneMisAvisos.setOpaque(false);
        jScrollPaneMisAvisos.setPreferredSize(new java.awt.Dimension(1085, 630));

        jPanelMisAvisos.setOpaque(false);
        jPanelMisAvisos.setLayout(new javax.swing.BoxLayout(jPanelMisAvisos, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneMisAvisos.setViewportView(jPanelMisAvisos);

        add(jScrollPaneMisAvisos);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelMisAvisos;
    private javax.swing.JScrollPane jScrollPaneMisAvisos;
    // End of variables declaration//GEN-END:variables
}
