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
public class TextMessagePanel extends javax.swing.JPanel {

    
    /**
     * Creates new form TextMessagePanel
     */
    public TextMessagePanel(String sender, String message, String date) {
        initComponents();
        jLabelDate.setText(date);
        jLabelSender.setText(sender);
        jTextAreaMessage.setText(message);
        jLabelDate.setForeground(DashboardPanel.getSecondFontColor());
        jLabelSender.setForeground(DashboardPanel.getSecondFontColor());
        jLabelDate.setBackground(DashboardPanel.getSecondColor());
        jLabelSender.setBackground(DashboardPanel.getSecondColor());
        jTextAreaMessage.setForeground(DashboardPanel.getFontColor());
        jTextAreaMessage.setBackground(DashboardPanel.getFirstColor());
  
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

        setMaximumSize(new java.awt.Dimension(32767, 105));
        setMinimumSize(new java.awt.Dimension(600, 105));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 105));

        jLabelSender.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelSender.setText("Sender");
        jLabelSender.setOpaque(true);

        jLabelDate.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDate.setText("Date");
        jLabelDate.setOpaque(true);

        jScrollPaneMessage.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jTextAreaMessage.setRows(1);
        jScrollPaneMessage.setViewportView(jTextAreaMessage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMessage, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(347, 347, 347))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSender)
                .addGap(0, 0, 0)
                .addComponent(jScrollPaneMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelDate))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelSender;
    private javax.swing.JScrollPane jScrollPaneMessage;
    private javax.swing.JTextArea jTextAreaMessage;
    // End of variables declaration//GEN-END:variables
}
