/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.github.javafaker.Faker;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import courseroom.MainFrame;


/**
 *
 * @author LENOVO
 */
public class ChatsPanel extends javax.swing.JPanel {
    
    
   
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ChatsPanel(){
        
        initComponents();
        
        jLabelChatsTitle.setForeground(MainFrame.getSecondFontColor());
        jScrollPaneChats.getViewport().setOpaque(false);
        jScrollPaneChats.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPaneChats.getHorizontalScrollBar().setUnitIncrement(15);
        
       Faker faker = new Faker();
        for(int i = 0; i < faker.number().numberBetween(1, 10);i++){
            BoxChatPanel boxChatPanel = new BoxChatPanel(i);
            jPanelChats.add(boxChatPanel);
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
        jPanelChats = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        jLabelChatsTitle.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabelChatsTitle.setText("Chats Personales");
        jLabelChatsTitle.setMaximumSize(new java.awt.Dimension(416, 84));
        jLabelChatsTitle.setMinimumSize(new java.awt.Dimension(416, 84));
        jLabelChatsTitle.setPreferredSize(new java.awt.Dimension(416, 84));

        jScrollPaneChats.setBorder(null);
        jScrollPaneChats.setOpaque(false);

        jPanelChats.setOpaque(false);
        jPanelChats.setLayout(new javax.swing.BoxLayout(jPanelChats, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneChats.setViewportView(jPanelChats);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneChats, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelChatsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelChatsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneChats, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void dispose(){
        jPanelChats.removeAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelChatsTitle;
    private javax.swing.JPanel jPanelChats;
    private javax.swing.JScrollPane jScrollPaneChats;
    // End of variables declaration//GEN-END:variables
}
