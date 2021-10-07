/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;


/**
 *
 * @author LENOVO
 */
public class ChatsPanel extends javax.swing.JPanel {
    
   
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ChatsPanel(){
        
        initComponents();
        
        jScrollPaneChats.getViewport().setOpaque(false);
        jScrollPaneChats.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPaneChats.getHorizontalScrollBar().setUnitIncrement(15);
        
        
        for(int i = 0; i < 3; i++){
            BoxChatPanel boxChatPanel = new BoxChatPanel("https://source.unsplash.com/random");
            jPanelAllChats.add(boxChatPanel);
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

        jScrollPaneChats = new javax.swing.JScrollPane();
        jPanelAllChats = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));
        setLayout(new java.awt.GridLayout(1, 2));

        jScrollPaneChats.setBackground(java.awt.Color.white);
        jScrollPaneChats.setBorder(null);
        jScrollPaneChats.setForeground(java.awt.Color.white);
        jScrollPaneChats.setOpaque(false);

        jPanelAllChats.setOpaque(false);
        jPanelAllChats.setLayout(new javax.swing.BoxLayout(jPanelAllChats, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneChats.setViewportView(jPanelAllChats);

        add(jScrollPaneChats);
    }// </editor-fold>//GEN-END:initComponents

    public void dispose(){
        jPanelAllChats.removeAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelAllChats;
    private javax.swing.JScrollPane jScrollPaneChats;
    // End of variables declaration//GEN-END:variables
}
