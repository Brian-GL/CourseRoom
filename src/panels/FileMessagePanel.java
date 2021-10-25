/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.io.File;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author LENOVO
 */
public class FileMessagePanel extends javax.swing.JPanel {

    /**
     * Creates new form FileMessagePanel
     */
    public FileMessagePanel(String sender, String date, File file) {
        initComponents();
        jLabelDate.setText(date);
        jLabelSender.setText(sender);
        jLabelFileName.setText(file.getName());
        jLabelExtension.setText( FilenameUtils.getExtension(file.getName()));
        jLabelDate.setForeground(DashboardPanel.getFontColor());
        jLabelSender.setForeground(DashboardPanel.getFontColor());
        jLabelDate.setBackground(DashboardPanel.getFirstColor());
        jLabelSender.setBackground(DashboardPanel.getFirstColor());
        jPanelFileInfo.setBackground(DashboardPanel.getSecondColor());
        jLabelFileName.setForeground(DashboardPanel.getSecondFontColor());
        jLabelExtension.setForeground(DashboardPanel.getSecondFontColor());
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
        jPanelFileInfo = new javax.swing.JPanel();
        jLabelExtension = new javax.swing.JLabel();
        jLabelFileName = new javax.swing.JLabel();
        jLabelFileIcon = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 165));
        setMinimumSize(new java.awt.Dimension(800, 165));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 165));

        jLabelSender.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelSender.setText("USER_NAME10_APLDOAL1");
        jLabelSender.setOpaque(true);

        jLabelDate.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDate.setText("MIÉRCOLES 31 DE SEPTIEMBRE DE 2021 - 14:59 A.M");
        jLabelDate.setOpaque(true);

        jPanelFileInfo.setPreferredSize(new java.awt.Dimension(234, 130));

        jLabelExtension.setFont(new java.awt.Font("Gadugi", 2, 18)); // NOI18N
        jLabelExtension.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExtension.setText("Extension");

        jLabelFileName.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelFileName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFileName.setText("File Name");

        jLabelFileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ImageIcons/documents.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFileInfoLayout = new javax.swing.GroupLayout(jPanelFileInfo);
        jPanelFileInfo.setLayout(jPanelFileInfoLayout);
        jPanelFileInfoLayout.setHorizontalGroup(
            jPanelFileInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFileInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFileInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelExtension, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFileInfoLayout.setVerticalGroup(
            jPanelFileInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFileInfoLayout.createSequentialGroup()
                .addGroup(jPanelFileInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFileInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelFileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFileInfoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabelFileName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelExtension)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelSender, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelFileInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)))
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
                .addComponent(jPanelFileInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelExtension;
    private javax.swing.JLabel jLabelFileIcon;
    private javax.swing.JLabel jLabelFileName;
    private javax.swing.JLabel jLabelSender;
    private javax.swing.JPanel jPanelFileInfo;
    // End of variables declaration//GEN-END:variables
}
