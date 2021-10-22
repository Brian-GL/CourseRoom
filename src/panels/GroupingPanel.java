/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.github.javafaker.Faker;
import components.ImageFilePreview;
import data.collections.PairDoublyLinkedList;
import data.structures.Pair;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LENOVO
 */
public class GroupingPanel extends javax.swing.JPanel {

    private Image groupImage;
    private Color firstColor, secondColor, fontColor, secondFontColor;
    private GroupChatingPanel groupChatingPanel;
    
    /**
     * Creates new form GroupingPanel
     */
    public GroupingPanel(Image image, String name) {
        initComponents();
        firstColor = secondColor = fontColor = secondFontColor = Color.BLACK;
        //URL imageURL = new URL(route);
        groupImage = image.getScaledInstance(440,440,Image.SCALE_SMOOTH);
        ImageIcon groupIcon = new ImageIcon(groupImage);
        jLabelGroupImage.setIcon(groupIcon);
        setColors(image);
        jLabelGroupName.setText(name);
        groupChatingPanel = new GroupChatingPanel(firstColor);
        jPanelGrupalChat.add(groupChatingPanel);
        jScrollPaneMembers.getViewport().setOpaque(false);
        jScrollPaneMembers.getVerticalScrollBar().setUnitIncrement(15);
        //jScrollPaneGroupDescription.getHorizontalScrollBar().setUnitIncrement(15);
        image.flush();
        image = null;
        groupIcon = null;
        
       
        Faker faker = new Faker();
        for(int i = 0; i < faker.number().numberBetween(1, 10);i++){
            MemberPanel memberPanel = new MemberPanel();
            jPanelMembers.add(memberPanel);
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

        jTabbedPaneGrouping = new javax.swing.JTabbedPane();
        jPanelAboutGroup = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                Graphics2D graphics = (Graphics2D) g;
                int w = getWidth();
                int h = getHeight();
                GradientPaint gp = new GradientPaint(0, 0,firstColor, 0, h, secondColor);
                graphics.setPaint(gp);
                graphics.fillRect(0, 0, w, h);
                graphics = null;
                gp = null;
                graphics = null;

            }
        };
        jLabelGroupImage = new javax.swing.JLabel();
        jLabelGroupName = new javax.swing.JLabel();
        jScrollPaneMembers = new javax.swing.JScrollPane();
        jPanelMembers = new javax.swing.JPanel();
        jLabelGroupClass = new javax.swing.JLabel();
        jLabelFechaCreacion = new javax.swing.JLabel();
        jLabelReturn = new javax.swing.JLabel();
        jPanelGrupalChat = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                Graphics2D graphics = (Graphics2D) g;
                int w = getWidth();
                int h = getHeight();
                GradientPaint gp = new GradientPaint(0, 0,firstColor, 0, h, secondColor);
                graphics.setPaint(gp);
                graphics.fillRect(0, 0, w, h);
                graphics = null;
                gp = null;
                graphics = null;

            }
        };
        jPanelTareas = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                Graphics2D graphics = (Graphics2D) g;
                int w = getWidth();
                int h = getHeight();
                GradientPaint gp = new GradientPaint(0, 0,firstColor, 0, h, secondColor);
                graphics.setPaint(gp);
                graphics.fillRect(0, 0, w, h);
                graphics = null;
                gp = null;
                graphics = null;

            }
        };
        jPanelPorHacer = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                Graphics2D graphics = (Graphics2D) g;
                int w = getWidth();
                int h = getHeight();
                GradientPaint gp = new GradientPaint(0, 0,firstColor, 0, h, secondColor);
                graphics.setPaint(gp);
                graphics.fillRect(0, 0, w, h);
                graphics = null;
                gp = null;
                graphics = null;

            }
        };
        jPanelConfiguraciones = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                Graphics2D graphics = (Graphics2D) g;
                int w = getWidth();
                int h = getHeight();
                GradientPaint gp = new GradientPaint(0, 0,firstColor, 0, h, secondColor);
                graphics.setPaint(gp);
                graphics.fillRect(0, 0, w, h);
                graphics = null;
                gp = null;
                graphics = null;

            }
        };
        jButtonEditGroupImage = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setLayout(new java.awt.CardLayout());

        jTabbedPaneGrouping.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jTabbedPaneGrouping.setOpaque(true);

        jLabelGroupImage.setPreferredSize(new java.awt.Dimension(440, 440));

        jLabelGroupName.setFont(new java.awt.Font("Gadugi", 1, 26)); // NOI18N
        jLabelGroupName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGroupName.setText("Group Name");
        jLabelGroupName.setMaximumSize(new java.awt.Dimension(416, 84));
        jLabelGroupName.setMinimumSize(new java.awt.Dimension(416, 84));
        jLabelGroupName.setOpaque(true);
        jLabelGroupName.setPreferredSize(new java.awt.Dimension(416, 84));

        jScrollPaneMembers.setBorder(null);
        jScrollPaneMembers.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneMembers.setOpaque(false);

        jPanelMembers.setOpaque(false);
        jPanelMembers.setLayout(new javax.swing.BoxLayout(jPanelMembers, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneMembers.setViewportView(jPanelMembers);

        jLabelGroupClass.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelGroupClass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGroupClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/teacher.png"))); // NOI18N
        jLabelGroupClass.setText("De La Clase Sistemas Operativos");
        jLabelGroupClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGroupClassMouseClicked(evt);
            }
        });

        jLabelFechaCreacion.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabelFechaCreacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaCreacion.setText("Creado El 22 De Octubre De 2021");

        jLabelReturn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelReturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReturn.setText("←");
        jLabelReturn.setPreferredSize(new java.awt.Dimension(37, 20));
        jLabelReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReturnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAboutGroupLayout = new javax.swing.GroupLayout(jPanelAboutGroup);
        jPanelAboutGroup.setLayout(jPanelAboutGroupLayout);
        jPanelAboutGroupLayout.setHorizontalGroup(
            jPanelAboutGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAboutGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAboutGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAboutGroupLayout.createSequentialGroup()
                        .addGap(0, 102, Short.MAX_VALUE)
                        .addComponent(jLabelGroupImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addComponent(jLabelGroupName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGroupClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAboutGroupLayout.createSequentialGroup()
                        .addComponent(jLabelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFechaCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneMembers, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAboutGroupLayout.setVerticalGroup(
            jPanelAboutGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAboutGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAboutGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAboutGroupLayout.createSequentialGroup()
                        .addComponent(jLabelGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelGroupImage, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelGroupClass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAboutGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaCreacion)
                            .addComponent(jLabelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPaneMembers))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneGrouping.addTab("Información", new javax.swing.ImageIcon(getClass().getResource("/resources/icons/information.png")), jPanelAboutGroup); // NOI18N

        jPanelGrupalChat.setLayout(new java.awt.CardLayout());
        jTabbedPaneGrouping.addTab("Chat Grupal", new javax.swing.ImageIcon(getClass().getResource("/resources/icons/group_3.png")), jPanelGrupalChat); // NOI18N

        javax.swing.GroupLayout jPanelTareasLayout = new javax.swing.GroupLayout(jPanelTareas);
        jPanelTareas.setLayout(jPanelTareasLayout);
        jPanelTareasLayout.setHorizontalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1138, Short.MAX_VALUE)
        );
        jPanelTareasLayout.setVerticalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        jTabbedPaneGrouping.addTab("Tareas", new javax.swing.ImageIcon(getClass().getResource("/resources/icons/homework_4.png")), jPanelTareas); // NOI18N

        javax.swing.GroupLayout jPanelPorHacerLayout = new javax.swing.GroupLayout(jPanelPorHacer);
        jPanelPorHacer.setLayout(jPanelPorHacerLayout);
        jPanelPorHacerLayout.setHorizontalGroup(
            jPanelPorHacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1138, Short.MAX_VALUE)
        );
        jPanelPorHacerLayout.setVerticalGroup(
            jPanelPorHacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        jTabbedPaneGrouping.addTab("Por Hacer", new javax.swing.ImageIcon(getClass().getResource("/resources/icons/daily-tasks.png")), jPanelPorHacer); // NOI18N

        jButtonEditGroupImage.setFont(new java.awt.Font("Gadugi", 1, 26)); // NOI18N
        jButtonEditGroupImage.setText("Cambiar Imagen");
        jButtonEditGroupImage.setToolTipText("<html>Click Para Cargar Tu Foto De Perfil Desde Tu Ordenador.<br><b>NOTA: LA IMAGEN DE PERFIL TENDRÁ UNA RESOLUCIÓN DE 250x250 px.</b></html>");
        jButtonEditGroupImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEditGroupImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditGroupImage.setMaximumSize(new java.awt.Dimension(400, 40));
        jButtonEditGroupImage.setMinimumSize(new java.awt.Dimension(400, 40));
        jButtonEditGroupImage.setPreferredSize(new java.awt.Dimension(400, 40));
        jButtonEditGroupImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditGroupImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEditGroupImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEditGroupImageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelConfiguracionesLayout = new javax.swing.GroupLayout(jPanelConfiguraciones);
        jPanelConfiguraciones.setLayout(jPanelConfiguracionesLayout);
        jPanelConfiguracionesLayout.setHorizontalGroup(
            jPanelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfiguracionesLayout.createSequentialGroup()
                .addGap(829, 829, 829)
                .addComponent(jButtonEditGroupImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelConfiguracionesLayout.setVerticalGroup(
            jPanelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfiguracionesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButtonEditGroupImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );

        jTabbedPaneGrouping.addTab("Configuraciones", new javax.swing.ImageIcon(getClass().getResource("/resources/icons/edit-tool.png")), jPanelConfiguraciones); // NOI18N

        add(jTabbedPaneGrouping, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditGroupImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditGroupImageMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setAccessory(new ImageFilePreview(fileChooser));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos De Imagenes", "png", "jpg", "jpeg", "bmp");
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setAcceptAllFileFilterUsed(true);
            fileChooser.setApproveButtonText("Cargar Imagen");
            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                try {
                    Image openImage = ImageIO.read(file);
                    int large = jLabelGroupImage.getHeight();
                    ImageIcon autenticacionIcon = new ImageIcon(openImage.getScaledInstance(large,large,Image.SCALE_SMOOTH));

                    jLabelGroupImage.setIcon(autenticacionIcon);

                    DashboardPanel.setUserImage(autenticacionIcon.getImage());

                    openImage = null;
                    autenticacionIcon = null;

                } catch (IOException ex) {
                    Logger.getLogger(EditProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            fileChooser = null;
        }
    }//GEN-LAST:event_jButtonEditGroupImageMouseClicked

    private void jButtonEditGroupImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditGroupImageMouseEntered
        // TODO add your handling code here:
        jButtonEditGroupImage.setBackground(firstColor);
        jButtonEditGroupImage.setForeground(fontColor);
    }//GEN-LAST:event_jButtonEditGroupImageMouseEntered

    private void jButtonEditGroupImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditGroupImageMouseExited
        // TODO add your handling code here:
        jButtonEditGroupImage.setBackground(secondColor);
        jButtonEditGroupImage.setForeground(secondFontColor);
    }//GEN-LAST:event_jButtonEditGroupImageMouseExited

    private void jLabelGroupClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGroupClassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelGroupClassMouseClicked

    private void jLabelReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturnMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            DashboardPanel.showView("groupsPanel");
        }
    }//GEN-LAST:event_jLabelReturnMouseClicked

      public void setColors(Image image){
        
        try {
            Random colorRandom = new Random(System.currentTimeMillis());
            int maximum = 0;
            
            PairDoublyLinkedList<Integer, Color> colorList = new PairDoublyLinkedList<>();
            PixelGrabber pg = new PixelGrabber(image, 0, 0, -1, -1, false);
            int large = (image.getWidth(null)/3);
            if (pg.grabPixels()) {
                int[] pixels = (int[]) pg.getPixels();
                for(int i = 0; i < pixels.length; i++){
                    int pixel = pixels[i];
                    int  red = (pixel  & 0x00ff0000) >> 16;
                    int  green = (pixel & 0x0000ff00) >> 8;
                    int  blue = pixel & 0x000000ff;
                    Color color = new Color(red,green,blue);
                    Pair<Integer, Color> pair = colorList.get_from_second(color);
            
                    if (pair != null) {//exist
                        int number = pair.first()+ 1;
                        pair.first(number);
                        if (number > maximum) {
                            firstColor = color;
                            maximum = number;
                        }
                    } else {
                        colorList.push_back(1, color);
                    }

                    color = null;
                    i += colorRandom.nextInt(large+1) + large;
                }

                secondColor = firstColor;
            
                int iterations = 0;
                if(colorList.size() > 1){
                    
                    while(Math.abs(secondColor.getRGB() - firstColor.getRGB()) < 3000000){
                        int position = colorRandom.nextInt((int)colorList.size()-1);
                        secondColor = colorList.get(position).second();
                        iterations++;
                        if(iterations > 25){
                             while(firstColor.getRGB() == secondColor.getRGB()){
                                position = colorRandom.nextInt((int)colorList.size()-1);
                                secondColor = colorList.get(position).second();
                            }
                             break;
                        }
                    }
                }
              
                int red = firstColor.getRed();
                fontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                red = secondColor.getRed();
                secondFontColor = (red >= 155) ? Color.BLACK : Color.WHITE;

                colorList.clear();

                Component[] components = this.getComponents();
                for (Component component : components){
                    component.setForeground(fontColor);
                }
                
                jTabbedPaneGrouping.setBackground(firstColor);
                jTabbedPaneGrouping.setForeground(fontColor);

                jLabelGroupName.setForeground(secondFontColor);
                jLabelGroupName.setBackground(secondColor);
                
                jButtonEditGroupImage.setForeground(secondFontColor);
                jButtonEditGroupImage.setBackground(secondColor);
                
                jLabelGroupClass.setForeground(secondFontColor);
                jLabelFechaCreacion.setForeground(secondFontColor);
                jLabelReturn.setForeground(secondFontColor);
                
                colorRandom = null;
                colorList = null;
                pg = null;
                fontColor = secondFontColor = null;
                pixels = null;
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(MusicPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditGroupImage;
    private javax.swing.JLabel jLabelFechaCreacion;
    private javax.swing.JLabel jLabelGroupClass;
    private javax.swing.JLabel jLabelGroupImage;
    private javax.swing.JLabel jLabelGroupName;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JPanel jPanelAboutGroup;
    private javax.swing.JPanel jPanelConfiguraciones;
    private javax.swing.JPanel jPanelGrupalChat;
    private javax.swing.JPanel jPanelMembers;
    private javax.swing.JPanel jPanelPorHacer;
    private javax.swing.JPanel jPanelTareas;
    private javax.swing.JScrollPane jScrollPaneMembers;
    private javax.swing.JTabbedPane jTabbedPaneGrouping;
    // End of variables declaration//GEN-END:variables
}
