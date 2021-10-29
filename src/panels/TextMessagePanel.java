/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;
import courseroom.MainFrame;
import data.interfaces.DisposeInterface;

/**
 *
 * @author LENOVO
 */
public class TextMessagePanel extends javax.swing.JPanel implements DisposeInterface{

    public TextMessagePanel(String sender, String message, String date) {
        initComponents();
        jLabelDate.setText(date);
        jLabelSender.setText(sender);
        jTextAreaMessage.setText(message);
        jLabelDate.setForeground(MainFrame.getFontColor());
        jLabelSender.setForeground(MainFrame.getFontColor());
        jLabelDate.setBackground(MainFrame.getFirstColor());
        jLabelSender.setBackground(MainFrame.getFirstColor());
        jTextAreaMessage.setForeground(MainFrame.getSecondFontColor());
        jTextAreaMessage.setBackground(MainFrame.getSecondColor());
        sender = message = date = null;
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSender = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jScrollPaneMessage = new javax.swing.JScrollPane();
        jTextAreaMessage = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(800, 185));
        setMinimumSize(new java.awt.Dimension(800, 185));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 185));

        jLabelSender.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelSender.setText("USERNAME_10APSL0192L");
        jLabelSender.setOpaque(true);

        jLabelDate.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDate.setText("MIÉRCOLES 31 DE OCTUBRE DE 20201 - 10:00 P.M");
        jLabelDate.setOpaque(true);

        jScrollPaneMessage.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        jTextAreaMessage.setRows(1);
        jScrollPaneMessage.setViewportView(jTextAreaMessage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSender, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSender)
                    .addComponent(jLabelDate))
                .addGap(0, 0, 0)
                .addComponent(jScrollPaneMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelSender;
    private javax.swing.JScrollPane jScrollPaneMessage;
    private javax.swing.JTextArea jTextAreaMessage;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose() {
        jTextAreaMessage.setText("");
    }
}
