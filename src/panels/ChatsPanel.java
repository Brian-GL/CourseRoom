/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import panels.DashboardPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author LENOVO
 */
public class ChatsPanel extends javax.swing.JPanel {
    
   
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ChatsPanel(){
        
        initComponents();
        
        jScrollPaneChatsGrupales.getViewport().setOpaque(false);
        jScrollPaneChatsPersonales.getViewport().setOpaque(false);
        jScrollPaneChatsGrupales.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPaneChatsPersonales.getVerticalScrollBar().setUnitIncrement(15);
        
        TitledBorder border = (TitledBorder) jScrollPaneChatsGrupales.getBorder();
        border.setTitleColor(DashboardPanel.getSecondFontColor());
        border = (TitledBorder) jScrollPaneChatsPersonales.getBorder();
        border.setTitleColor(DashboardPanel.getSecondFontColor());
        
        for(int i = 0; i < 3; i++){
            BoxChatPanel boxChatPanel = new BoxChatPanel("https://source.unsplash.com/random");
            jPanelChatsPersonales.add(boxChatPanel);
            System.out.println("Getting Image From : https://source.unsplash.com/random");
        }
        
        for(int i = 0; i < 2; i++){
            BoxChatPanel boxChatPanel = new BoxChatPanel("https://source.unsplash.com/random");
            jPanelChatsGrupales.add(boxChatPanel);
            System.out.println("Getting Image From : https://source.unsplash.com/random");
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

        jScrollPaneChatsPersonales = new javax.swing.JScrollPane();
        jPanelChatsPersonales = new javax.swing.JPanel();
        jScrollPaneChatsGrupales = new javax.swing.JScrollPane();
        jPanelChatsGrupales = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));
        setLayout(new java.awt.GridLayout(1, 2));

        jScrollPaneChatsPersonales.setBackground(java.awt.Color.white);
        jScrollPaneChatsPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chats Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 24))); // NOI18N
        jScrollPaneChatsPersonales.setForeground(java.awt.Color.white);
        jScrollPaneChatsPersonales.setOpaque(false);

        jPanelChatsPersonales.setOpaque(false);
        jPanelChatsPersonales.setLayout(new javax.swing.BoxLayout(jPanelChatsPersonales, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneChatsPersonales.setViewportView(jPanelChatsPersonales);

        add(jScrollPaneChatsPersonales);

        jScrollPaneChatsGrupales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chats Grupales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 24))); // NOI18N
        jScrollPaneChatsGrupales.setOpaque(false);

        jPanelChatsGrupales.setOpaque(false);
        jPanelChatsGrupales.setLayout(new javax.swing.BoxLayout(jPanelChatsGrupales, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneChatsGrupales.setViewportView(jPanelChatsGrupales);

        add(jScrollPaneChatsGrupales);
    }// </editor-fold>//GEN-END:initComponents

    public void dispose(){
        jPanelChatsGrupales.removeAll();
        jPanelChatsPersonales.removeAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelChatsGrupales;
    private javax.swing.JPanel jPanelChatsPersonales;
    private javax.swing.JScrollPane jScrollPaneChatsGrupales;
    private javax.swing.JScrollPane jScrollPaneChatsPersonales;
    // End of variables declaration//GEN-END:variables
}
