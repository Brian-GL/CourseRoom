/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.teachers;

import panels.generals.GeneralMusicPanel;
import panels.generals.GeneralDatesPanel;
import com.github.javafaker.Faker;
import courseroom.MainFrame;
import data.interfaces.ColorInterface;
import data.interfaces.DisposeInterface;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class TeacherDashboardPanel extends javax.swing.JPanel implements ColorInterface, DisposeInterface{

    private static Image userImage;
    
    private TeacherChatsPanel chatsPanel;
    private TeacherAboutPanel aboutPanel;
    private static TeacherInfoProfilePanel infoProfilePanel;
    private TeacherEditProfilePanel editProfilePanel;
    private GeneralMusicPanel musicPanel;
    private TeacherNoticesPanel noticesPanel;
    private GeneralDatesPanel datesPanel;
    private TeacherDashboardConfigurationPanel configurationPanel;
    
    private static CardLayout panelLayout;
    private ServerDateTime serverDateTime;
    private volatile boolean server_time_stop;
    
    /**
     * Creates new form DashboardPanel
     */
    @SuppressWarnings({"CallToThreadStartDuringObjectConstruction", "OverridableMethodCallInConstructor"})
    public TeacherDashboardPanel() {
        initComponents();
        try {
            server_time_stop = true;
            System.out.println("Dashboard -> Getting Image From https://loremflickr.com/450/450/sunset,beach/all");
            URL imageURL = new URL("https://loremflickr.com/450/450/sunset,beach/all");
            userImage = ImageIO.read(imageURL);
            Image image = userImage.getScaledInstance(175, 175, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(image);
            jLabelUserProfilePhoto.setIcon(imageIcon);
            //image.flush();
            //image = null;
            
            
            //info profile panel -> 0 en active page flag
            infoProfilePanel = new TeacherInfoProfilePanel();
            jPanelInformacion.add("infoProfilePanel",infoProfilePanel);
            
            //edit profile panel -> 1 en active page flag
            editProfilePanel = new TeacherEditProfilePanel();
            jPanelInformacion.add("editProfilePanel",editProfilePanel);
            
            //home panel -> 2 en active page flag
            
            
            //classes panel -> 3 en active page flag
            
            
        
            
            //dates panel -> 5 en active page flag
            datesPanel = new GeneralDatesPanel();
            jPanelInformacion.add("datesPanel",datesPanel);
            
            //notices panel -> 6 en active page flag
            noticesPanel = new TeacherNoticesPanel();
            jPanelInformacion.add("noticesPanel",noticesPanel);
            
           
            
            //chats panel -> 8 en active page flag
            chatsPanel = new TeacherChatsPanel();
            jPanelInformacion.add("chatsPanel",chatsPanel);
            
            //about panel -> 9 en active page flag
            aboutPanel = new TeacherAboutPanel();
            jPanelInformacion.add("aboutPanel",aboutPanel);
            
            //musica panel -> 10 en active page flag
            musicPanel = new GeneralMusicPanel();
            jPanelInformacion.add("musicPanel",musicPanel);
            
            configurationPanel = new TeacherDashboardConfigurationPanel();
            jPanelInformacion.add("configurationPanel",configurationPanel);
            
            
            Faker faker = new Faker(new Locale("es","MX"));
            panelLayout = (CardLayout) jPanelInformacion.getLayout();
            jLabelUserName.setText(faker.name().username());
            
            serverDateTime = new ServerDateTime();
            serverDateTime.start();
            
            imageURL = null;
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(TeacherDashboardPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TeacherDashboardPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanelMenu = new javax.swing.JPanel();
        jLabelUserProfilePhoto = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jButtonClases = new javax.swing.JButton();
        jButtonFechas = new javax.swing.JButton();
        jButtonAvisos = new javax.swing.JButton();
        jButtonChats = new javax.swing.JButton();
        jButtonMusica = new javax.swing.JButton();
        jButtonAcerca = new javax.swing.JButton();
        jButtonAjustes = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanelBarraSuperior = new javax.swing.JPanel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelFechaHoraServidor = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jPanelInformacion = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1260, 670));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1260, 670));

        jPanelMenu.setMinimumSize(new java.awt.Dimension(175, 630));
        jPanelMenu.setOpaque(false);
        jPanelMenu.setPreferredSize(new java.awt.Dimension(175, 630));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUserProfilePhoto.setBackground(new java.awt.Color(3, 111, 252));
        jLabelUserProfilePhoto.setToolTipText("Mostrar Perfil Del Usuario.");
        jLabelUserProfilePhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelUserProfilePhoto.setMaximumSize(new java.awt.Dimension(175, 175));
        jLabelUserProfilePhoto.setMinimumSize(new java.awt.Dimension(175, 175));
        jLabelUserProfilePhoto.setOpaque(true);
        jLabelUserProfilePhoto.setPreferredSize(new java.awt.Dimension(175, 175));
        jLabelUserProfilePhoto.setRequestFocusEnabled(false);
        jLabelUserProfilePhoto.setVerifyInputWhenFocusTarget(false);
        jLabelUserProfilePhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUserProfilePhotoMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelUserProfilePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButtonInicio.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonInicio.setText("Inicio");
        jButtonInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInicio.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonInicioMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, -1, -1));

        jButtonClases.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonClases.setText("Clases");
        jButtonClases.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonClases.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClases.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClasesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonClasesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonClasesMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jButtonFechas.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonFechas.setText("Fechas");
        jButtonFechas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFechas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFechas.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonFechas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFechasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonFechasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonFechasMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, -1, -1));

        jButtonAvisos.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonAvisos.setText("Avisos");
        jButtonAvisos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAvisos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAvisos.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonAvisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAvisosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAvisosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAvisosMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jButtonChats.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonChats.setText("Chats");
        jButtonChats.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonChats.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonChats.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonChats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonChatsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonChatsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonChatsMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, -1, -1));

        jButtonMusica.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonMusica.setText("Música");
        jButtonMusica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMusica.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMusicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMusicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMusicaMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jButtonAcerca.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonAcerca.setText("Acerca");
        jButtonAcerca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAcerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcerca.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAcercaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAcercaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAcercaMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        jButtonAjustes.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonAjustes.setText("Ajustes");
        jButtonAjustes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAjustes.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAjustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAjustesMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, -1, -1));

        jButtonSalir.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setToolTipText("");
        jButtonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, -1, -1));

        jPanelBarraSuperior.setBackground(java.awt.Color.black);
        jPanelBarraSuperior.setMinimumSize(new java.awt.Dimension(1260, 40));
        jPanelBarraSuperior.setOpaque(false);
        jPanelBarraSuperior.setPreferredSize(new java.awt.Dimension(1260, 40));

        jLabelUserName.setBackground(java.awt.Color.black);
        jLabelUserName.setFont(new java.awt.Font("Gadugi", 1, 17)); // NOI18N
        jLabelUserName.setForeground(java.awt.Color.white);
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelUserName.setText("UserName");
        jLabelUserName.setToolTipText("Usuario Con Sesión Iniciada");
        jLabelUserName.setMaximumSize(new java.awt.Dimension(237, 40));
        jLabelUserName.setMinimumSize(new java.awt.Dimension(237, 40));
        jLabelUserName.setPreferredSize(new java.awt.Dimension(237, 40));

        jLabelFechaHoraServidor.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabelFechaHoraServidor.setForeground(java.awt.Color.white);
        jLabelFechaHoraServidor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaHoraServidor.setText("Viernes 10/07/2021 13:55:09 P.M");
        jLabelFechaHoraServidor.setToolTipText("Horario Del Servidor");
        jLabelFechaHoraServidor.setMaximumSize(new java.awt.Dimension(127, 40));
        jLabelFechaHoraServidor.setMinimumSize(new java.awt.Dimension(127, 40));
        jLabelFechaHoraServidor.setPreferredSize(new java.awt.Dimension(127, 40));

        jButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/menu.png"))); // NOI18N
        jButtonMenu.setToolTipText("Mostrar/Ocultar Menú");
        jButtonMenu.setBorder(null);
        jButtonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu.setMaximumSize(new java.awt.Dimension(40, 40));
        jButtonMenu.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonMenu.setPreferredSize(new java.awt.Dimension(40, 40));
        jButtonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarraSuperiorLayout = new javax.swing.GroupLayout(jPanelBarraSuperior);
        jPanelBarraSuperior.setLayout(jPanelBarraSuperiorLayout);
        jPanelBarraSuperiorLayout.setHorizontalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelFechaHoraServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBarraSuperiorLayout.setVerticalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                .addGroup(jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaHoraServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelInformacion.setMinimumSize(new java.awt.Dimension(1085, 630));
        jPanelInformacion.setName(""); // NOI18N
        jPanelInformacion.setOpaque(false);
        jPanelInformacion.setPreferredSize(new java.awt.Dimension(1085, 630));
        jPanelInformacion.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jLabelUserProfilePhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserProfilePhotoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            panelLayout.show(jPanelInformacion, "infoProfilePanel");
        }
    }//GEN-LAST:event_jLabelUserProfilePhotoMouseClicked

    private void jButtonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMenuMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            jPanelMenu.setVisible(!jPanelMenu.isVisible());
        }
    }//GEN-LAST:event_jButtonMenuMouseClicked

    private void jButtonMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMenuMouseEntered
        // TODO add your handling code here:
        jButtonMenu.setBackground(MainFrame.getSecondColor());
    }//GEN-LAST:event_jButtonMenuMouseEntered

    private void jButtonMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMenuMouseExited
        // TODO add your handling code here:
        jButtonMenu.setBackground(MainFrame.getFirstColor());
    }//GEN-LAST:event_jButtonMenuMouseExited

    private void jButtonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInicioMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_jButtonInicioMouseClicked

    private void jButtonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInicioMouseEntered
        // TODO add your handling code here:
        jButtonInicio.setBackground(MainFrame.getThirdColor());
        jButtonInicio.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonInicioMouseEntered

    private void jButtonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInicioMouseExited
        // TODO add your handling code here:
        jButtonInicio.setBackground(MainFrame.getSecondColor());
        jButtonInicio.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonInicioMouseExited

    private void jButtonClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClasesMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_jButtonClasesMouseClicked

    private void jButtonClasesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClasesMouseEntered
        // TODO add your handling code here:
        jButtonClases.setBackground(MainFrame.getThirdColor());
        jButtonClases.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonClasesMouseEntered

    private void jButtonClasesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClasesMouseExited
        // TODO add your handling code here:
        jButtonClases.setBackground(MainFrame.getSecondColor());
        jButtonClases.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonClasesMouseExited

    private void jButtonFechasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFechasMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            TeacherDashboardPanel.showView("datesPanel");
        }
    }//GEN-LAST:event_jButtonFechasMouseClicked

    private void jButtonFechasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFechasMouseEntered
        // TODO add your handling code here:
        jButtonFechas.setBackground(MainFrame.getThirdColor());
        jButtonFechas.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonFechasMouseEntered

    private void jButtonFechasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFechasMouseExited
        // TODO add your handling code here:
        jButtonFechas.setBackground(MainFrame.getSecondColor());
        jButtonFechas.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonFechasMouseExited

    private void jButtonAvisosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAvisosMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            TeacherDashboardPanel.showView("noticesPanel");
        }
    }//GEN-LAST:event_jButtonAvisosMouseClicked

    private void jButtonAvisosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAvisosMouseEntered
        // TODO add your handling code here:
        jButtonAvisos.setBackground(MainFrame.getThirdColor());
        jButtonAvisos.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonAvisosMouseEntered

    private void jButtonAvisosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAvisosMouseExited
        // TODO add your handling code here:
        jButtonAvisos.setBackground(MainFrame.getSecondColor());
        jButtonAvisos.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonAvisosMouseExited

    private void jButtonChatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChatsMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            TeacherDashboardPanel.showView("chatsPanel");
        }
    }//GEN-LAST:event_jButtonChatsMouseClicked

    private void jButtonChatsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChatsMouseEntered
        // TODO add your handling code here:
        jButtonChats.setBackground(MainFrame.getThirdColor());
        jButtonChats.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonChatsMouseEntered

    private void jButtonChatsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChatsMouseExited
        // TODO add your handling code here:
        jButtonChats.setBackground(MainFrame.getSecondColor());
        jButtonChats.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonChatsMouseExited

    private void jButtonMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMusicaMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            TeacherDashboardPanel.showView("musicPanel");
        }
    }//GEN-LAST:event_jButtonMusicaMouseClicked

    private void jButtonMusicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMusicaMouseEntered
        // TODO add your handling code here:
        jButtonMusica.setBackground(MainFrame.getThirdColor());
        jButtonMusica.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonMusicaMouseEntered

    private void jButtonMusicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMusicaMouseExited
        // TODO add your handling code here:
        jButtonMusica.setBackground(MainFrame.getSecondColor());
        jButtonMusica.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonMusicaMouseExited

    private void jButtonAcercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAcercaMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            TeacherDashboardPanel.showView("aboutPanel");
        }
    }//GEN-LAST:event_jButtonAcercaMouseClicked

    private void jButtonAcercaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAcercaMouseEntered
        // TODO add your handling code here:
        jButtonAcerca.setBackground(MainFrame.getThirdColor());
        jButtonAcerca.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonAcercaMouseEntered

    private void jButtonAcercaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAcercaMouseExited
        // TODO add your handling code here:
        jButtonAcerca.setBackground(MainFrame.getSecondColor());
        jButtonAcerca.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonAcercaMouseExited

    private void jButtonAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAjustesMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            TeacherDashboardPanel.showView("configurationPanel");
        }
    }//GEN-LAST:event_jButtonAjustesMouseClicked

    private void jButtonAjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAjustesMouseEntered
        // TODO add your handling code here:
        jButtonAjustes.setBackground(MainFrame.getThirdColor());
        jButtonAjustes.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonAjustesMouseEntered

    private void jButtonAjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAjustesMouseExited
        // TODO add your handling code here:
        jButtonAjustes.setBackground(MainFrame.getSecondColor());
        jButtonAjustes.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonAjustesMouseExited

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            MainFrame.showLogin();
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        // TODO add your handling code here:
        jButtonSalir.setBackground(MainFrame.getThirdColor());
        jButtonSalir.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        // TODO add your handling code here:
        jButtonSalir.setBackground(MainFrame.getSecondColor());
        jButtonSalir.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonSalirMouseExited

    
    public void setColors(){
           
        Color firstColor,secondColor, thirdColor, fontColor, secondFontColor, thirdFontColor;
        firstColor = new Color(255,255,255,255);
        secondColor = Color.BLACK;
        thirdColor = new Color(30,30,30);
        fontColor = Color.BLACK;
        secondFontColor = Color.WHITE;
        thirdFontColor = Color.WHITE;

        Component[] components = jPanelMenu.getComponents();

        for(Component component: components){
            component.setForeground(secondFontColor);
            component.setBackground(secondColor);
        }
        jLabelFechaHoraServidor.setForeground(fontColor);
        jLabelUserName.setForeground(fontColor);

        MainFrame.setFirstColor(firstColor);
        MainFrame.setSecondColor(secondColor);
        MainFrame.setThirdColor(thirdColor);
        MainFrame.setFontColor(fontColor);
        MainFrame.setSecondFontColor(secondFontColor);
        MainFrame.setThirdFontColor(thirdFontColor);

        MainFrame.repainting();
        infoProfilePanel.colorMyComponents();
        editProfilePanel.colorMyComponents();
        aboutPanel.colorMyComponents();
        chatsPanel.colorMyComponents();
        noticesPanel.colorMyComponents();
        datesPanel.colorMyComponents();
        configurationPanel.colorMyComponents();
            
    }
    
    @Override
    public void dispose(){
        
        musicPanel.dispose();
        chatsPanel.dispose();
        noticesPanel.dispose();
        datesPanel.dispose();
        
    }
    
    public static void addView(Component component, String key){
        jPanelInformacion.add(key,component);
    }
    
    public static void showView(String key){
        panelLayout.show(jPanelInformacion, key);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcerca;
    private javax.swing.JButton jButtonAjustes;
    private javax.swing.JButton jButtonAvisos;
    private javax.swing.JButton jButtonChats;
    private javax.swing.JButton jButtonClases;
    private javax.swing.JButton jButtonFechas;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonMusica;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFechaHoraServidor;
    private javax.swing.JLabel jLabelUserName;
    private static javax.swing.JLabel jLabelUserProfilePhoto;
    private javax.swing.JPanel jPanelBarraSuperior;
    private static javax.swing.JPanel jPanelInformacion;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the userImage
     */
    public static Image getUserImage() {
        return userImage;
    }
    
    /**
     * @param aUserImage the userImage to set
     */
    public static void setUserImage(Image aUserImage) {
        userImage = aUserImage;
        ImageIcon imageProfile = new ImageIcon(userImage.getScaledInstance(175,175, Image.SCALE_SMOOTH));
        jLabelUserProfilePhoto.setIcon(imageProfile);
        int imageWidth = infoProfilePanel.getProfilePhotoLabel().getPreferredSize().width;
        int imageHeight = infoProfilePanel.getProfilePhotoLabel().getPreferredSize().height;
        ImageIcon icon = new ImageIcon(imageProfile.getImage().getScaledInstance(imageWidth,imageHeight,Image.SCALE_SMOOTH));
        infoProfilePanel.getProfilePhotoLabel().setIcon(icon);
        imageProfile.getImage().flush();
        imageProfile = null;
        icon = null;
    }

    @Override
    public void setColors(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class ServerDateTime extends Thread{
    

        public ServerDateTime(){
        }

        @Override
        @SuppressWarnings("SleepWhileInLoop")
        public void run(){
            
            while(server_time_stop){
                
                try {
                    Date date = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd/MM/yyyy hh:mm:ss a");
                    String time = dateFormat.format(date);
                    jLabelFechaHoraServidor.setText(time);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ServerDateTime.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    
    

}
