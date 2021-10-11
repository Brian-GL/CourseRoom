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
        jLabelChatsTitle.setForeground(DashboardPanel.getFontColor());
        jLabelChatsTitle.setBackground(DashboardPanel.getFirstColor());
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

        jLabelChatsTitle = new javax.swing.JLabel();
        jScrollPaneChats = new javax.swing.JScrollPane();
        jPanelAllChats = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        jLabelChatsTitle.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabelChatsTitle.setText("Chats");
        jLabelChatsTitle.setMaximumSize(new java.awt.Dimension(416, 84));
        jLabelChatsTitle.setMinimumSize(new java.awt.Dimension(416, 84));
        jLabelChatsTitle.setOpaque(true);
        jLabelChatsTitle.setPreferredSize(new java.awt.Dimension(416, 84));

        jScrollPaneChats.setBackground(java.awt.Color.white);
        jScrollPaneChats.setBorder(null);
        jScrollPaneChats.setForeground(java.awt.Color.white);
        jScrollPaneChats.setOpaque(false);

        jPanelAllChats.setOpaque(false);
        jPanelAllChats.setLayout(new javax.swing.BoxLayout(jPanelAllChats, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneChats.setViewportView(jPanelAllChats);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneChats, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelChatsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelChatsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneChats, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void dispose(){
        jPanelAllChats.removeAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelChatsTitle;
    private javax.swing.JPanel jPanelAllChats;
    private javax.swing.JScrollPane jScrollPaneChats;
    // End of variables declaration//GEN-END:variables
}
