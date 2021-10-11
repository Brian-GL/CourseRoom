/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import data.interfaces.MainInterface;
import com.github.javafaker.Faker;
import courseroom.MainFrame;
import data.collections.PairDoublyLinkedList;
import data.structures.Pair;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class DashboardPanel extends javax.swing.JPanel implements MainInterface{

    private static Image userImage;
    private static Color firstColor,secondColor, thirdColor, fontColor, secondFontColor, thirdFontColor;
    private Random colorRandom;
    private static BufferedImage bufferedUserImage;
    
    private ChatsPanel chatsPanel;
    private AboutPanel aboutPanel;
    private static InfoProfilePanel infoProfilePanel;
    private EditProfilePanel editProfilePanel;
    private MusicPanel musicPanel;
    private NoticesPanel noticesPanel;
    private GroupsPanel groupsPanel;
    private DatesPanel datesPanel;
    private HomeworksPanel homeworksPanel;
    
    private static CardLayout panelLayout;
    private static byte activePageFlag;
    private ServerDateTime serverDateTime;
    private volatile boolean server_time_stop;
    
    /**
     * Creates new form DashboardPanel
     */
    @SuppressWarnings({"CallToThreadStartDuringObjectConstruction", "OverridableMethodCallInConstructor"})
    public DashboardPanel() {
        initComponents();
        try {
            server_time_stop = true;
            firstColor = secondColor = thirdColor = fontColor = secondFontColor = Color.BLACK;
            colorRandom = new Random(System.currentTimeMillis());
            String imageName = "/resources/images/image"+(colorRandom.nextInt(15)+1)+".jpg";
            userImage = ImageIO.read(getClass().getResource(imageName));
            bufferedUserImage = new BufferedImage(userImage.getWidth(null), userImage.getHeight(null), BufferedImage.TYPE_INT_ARGB);

            // Draw the image on to the buffered image
            Graphics2D bGr = bufferedUserImage.createGraphics();
            bGr.drawImage(DashboardPanel.getUserImage(), 0, 0, null);
            bGr.dispose();
            ImageIcon imageProfile  = new ImageIcon(userImage.getScaledInstance(175,175, Image.SCALE_SMOOTH));
            setColors(userImage);
            jLabelUserProfilePhoto.setIcon(imageProfile);
            imageProfile = null;
            activePageFlag = 0;
            imageProfile = null;
            
            //info profile panel -> 0 en active page flag
            infoProfilePanel = new InfoProfilePanel();
            jPanelInformacion.add("infoProfilePanel",infoProfilePanel);
            
            //edit profile panel -> 1 en active page flag
            editProfilePanel = new EditProfilePanel();
            jPanelInformacion.add("editProfilePanel",editProfilePanel);
            
            //home panel -> 2 en active page flag
            
            
            //classes panel -> 3 en active page flag
            
            
            //homeworks panel -> 4 en active page flag
            homeworksPanel = new HomeworksPanel();
            jPanelInformacion.add("homeworksPanel",homeworksPanel);
            
            //dates panel -> 5 en active page flag
            datesPanel = new DatesPanel();
            jPanelInformacion.add("datesPanel",datesPanel);
            
            
            //notices panel -> 6 en active page flag
            noticesPanel = new NoticesPanel();
            jPanelInformacion.add("noticesPanel",noticesPanel);
            
            //groups panel -> 7 en active page flag
            groupsPanel = new GroupsPanel();
            jPanelInformacion.add("groupsPanel",groupsPanel);
            
            //chats panel -> 8 en active page flag
            chatsPanel = new ChatsPanel();
            jPanelInformacion.add("chatsPanel",chatsPanel);
            
            //about panel -> 9 en active page flag
            aboutPanel = new AboutPanel();
            jPanelInformacion.add("aboutPanel",aboutPanel);
            
            //musica panel -> 10 en active page flag
            musicPanel = new MusicPanel();
            jPanelInformacion.add("musicPanel",musicPanel);
            
            Faker faker = new Faker(new Locale("es","MX"));
            panelLayout = (CardLayout) jPanelInformacion.getLayout();
            jLabelUserName.setText(faker.name().username());
            
            serverDateTime = new ServerDateTime();
            serverDateTime.start();
            
            imageName = null;
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(DashboardPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DashboardPanel.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabelClasses = new javax.swing.JLabel();
        jLabelHomePage = new javax.swing.JLabel();
        jLabelGroups = new javax.swing.JLabel();
        jLabelHomeWorks = new javax.swing.JLabel();
        jLabelDates = new javax.swing.JLabel();
        jLabelChats = new javax.swing.JLabel();
        jLabelNotices = new javax.swing.JLabel();
        jLabelAbout = new javax.swing.JLabel();
        jLabelLogOut = new javax.swing.JLabel();
        jLabelMusic = new javax.swing.JLabel();
        jPanelBarraSuperior = new javax.swing.JPanel();
        jLabelMenu = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelFechaHoraServidor = new javax.swing.JLabel();
        jPanelInformacion = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1260, 670));
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

        jLabelClasses.setBackground(new java.awt.Color(3, 111, 252));
        jLabelClasses.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelClasses.setForeground(java.awt.Color.white);
        jLabelClasses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClasses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/training.png"))); // NOI18N
        jLabelClasses.setText("<html>&nbsp;Clases&nbsp;</html>");
        jLabelClasses.setToolTipText("Mostrar Clases");
        jLabelClasses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelClasses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClasses.setOpaque(true);
        jLabelClasses.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelClasses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClassesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelClassesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelClassesMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabelHomePage.setBackground(new java.awt.Color(3, 111, 252));
        jLabelHomePage.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelHomePage.setForeground(java.awt.Color.white);
        jLabelHomePage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/house.png"))); // NOI18N
        jLabelHomePage.setText("<html>&nbsp;Inicio&nbsp;</html>");
        jLabelHomePage.setToolTipText("Mostrar Mi Inicio");
        jLabelHomePage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelHomePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomePage.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelHomePage.setOpaque(true);
        jLabelHomePage.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomePageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomePageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomePageMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, -1, -1));

        jLabelGroups.setBackground(new java.awt.Color(3, 111, 252));
        jLabelGroups.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelGroups.setForeground(java.awt.Color.white);
        jLabelGroups.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGroups.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/group-meeting.png"))); // NOI18N
        jLabelGroups.setText("<html>&nbsp;Grupos&nbsp;</html>");
        jLabelGroups.setToolTipText("Mostrar Mis Grupos");
        jLabelGroups.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelGroups.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelGroups.setOpaque(true);
        jLabelGroups.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelGroups.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGroupsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelGroupsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelGroupsMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelGroups, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jLabelHomeWorks.setBackground(new java.awt.Color(3, 111, 252));
        jLabelHomeWorks.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelHomeWorks.setForeground(java.awt.Color.white);
        jLabelHomeWorks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHomeWorks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/homework.png"))); // NOI18N
        jLabelHomeWorks.setText("<html>&nbsp;Tareas&nbsp;</html>");
        jLabelHomeWorks.setToolTipText("Mostrar Tareas");
        jLabelHomeWorks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelHomeWorks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeWorks.setOpaque(true);
        jLabelHomeWorks.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelHomeWorks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeWorksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeWorksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeWorksMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelHomeWorks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, -1, -1));

        jLabelDates.setBackground(new java.awt.Color(3, 111, 252));
        jLabelDates.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelDates.setForeground(java.awt.Color.white);
        jLabelDates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/schedule.png"))); // NOI18N
        jLabelDates.setText("<html>&nbsp;Fechas&nbsp;</html>");
        jLabelDates.setToolTipText("Mostrar Calendario");
        jLabelDates.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelDates.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDates.setOpaque(true);
        jLabelDates.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelDates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDatesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDatesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDatesMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelDates, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jLabelChats.setBackground(new java.awt.Color(3, 111, 252));
        jLabelChats.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelChats.setForeground(java.awt.Color.white);
        jLabelChats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/online-chat.png"))); // NOI18N
        jLabelChats.setText("<html>&nbsp;Chats&nbsp;</html>");
        jLabelChats.setToolTipText("Mostrar Mis Chats");
        jLabelChats.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelChats.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelChats.setOpaque(true);
        jLabelChats.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelChats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelChatsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelChatsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelChatsMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, -1, -1));

        jLabelNotices.setBackground(new java.awt.Color(3, 111, 252));
        jLabelNotices.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelNotices.setForeground(java.awt.Color.white);
        jLabelNotices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bell.png"))); // NOI18N
        jLabelNotices.setText("<html>&nbsp;Avisos&nbsp;</html>");
        jLabelNotices.setToolTipText("Mostrar Avisos");
        jLabelNotices.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelNotices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelNotices.setOpaque(true);
        jLabelNotices.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelNotices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNoticesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNoticesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNoticesMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelNotices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, -1, -1));

        jLabelAbout.setBackground(new java.awt.Color(3, 111, 252));
        jLabelAbout.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelAbout.setForeground(java.awt.Color.white);
        jLabelAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/info.png"))); // NOI18N
        jLabelAbout.setText("<html>&nbsp;Acerca&nbsp;</html>");
        jLabelAbout.setToolTipText("Acerca Del Programa");
        jLabelAbout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAbout.setOpaque(true);
        jLabelAbout.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAboutMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, -1, -1));

        jLabelLogOut.setBackground(new java.awt.Color(3, 111, 252));
        jLabelLogOut.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelLogOut.setForeground(java.awt.Color.white);
        jLabelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/exit-door.png"))); // NOI18N
        jLabelLogOut.setText("<html>&nbsp;Salir&nbsp;</html>");
        jLabelLogOut.setToolTipText("Cierre Sesión Y Salga De Su Cuenta En Este Dipositivo.");
        jLabelLogOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogOut.setOpaque(true);
        jLabelLogOut.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, -1));

        jLabelMusic.setBackground(new java.awt.Color(3, 111, 252));
        jLabelMusic.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelMusic.setForeground(java.awt.Color.white);
        jLabelMusic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/audio_1.png"))); // NOI18N
        jLabelMusic.setText("<html>&nbsp;Música&nbsp;</html>");
        jLabelMusic.setToolTipText("Music Player");
        jLabelMusic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMusic.setOpaque(true);
        jLabelMusic.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMusicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMusicMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        jPanelBarraSuperior.setBackground(java.awt.Color.black);
        jPanelBarraSuperior.setMinimumSize(new java.awt.Dimension(1260, 40));
        jPanelBarraSuperior.setOpaque(false);
        jPanelBarraSuperior.setPreferredSize(new java.awt.Dimension(1260, 40));

        jLabelMenu.setBackground(new java.awt.Color(3, 111, 252));
        jLabelMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMenu.setForeground(java.awt.Color.white);
        jLabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/menu.png"))); // NOI18N
        jLabelMenu.setToolTipText("Muestra/Oculta El Menú");
        jLabelMenu.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabelMenu.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabelMenu.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseClicked(evt);
            }
        });

        jLabelUserName.setBackground(java.awt.Color.black);
        jLabelUserName.setFont(new java.awt.Font("Gadugi", 1, 17)); // NOI18N
        jLabelUserName.setForeground(java.awt.Color.white);
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/id-card.png"))); // NOI18N
        jLabelUserName.setText("UserName");
        jLabelUserName.setToolTipText("Usuario Con Sesión Iniciada");
        jLabelUserName.setMaximumSize(new java.awt.Dimension(237, 40));
        jLabelUserName.setMinimumSize(new java.awt.Dimension(237, 40));
        jLabelUserName.setPreferredSize(new java.awt.Dimension(237, 40));

        jLabelFechaHoraServidor.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabelFechaHoraServidor.setForeground(java.awt.Color.white);
        jLabelFechaHoraServidor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaHoraServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/clock_2.png"))); // NOI18N
        jLabelFechaHoraServidor.setText("Viernes 10/07/2021 13:55:09 P.M");
        jLabelFechaHoraServidor.setMaximumSize(new java.awt.Dimension(127, 40));
        jLabelFechaHoraServidor.setMinimumSize(new java.awt.Dimension(127, 40));
        jLabelFechaHoraServidor.setPreferredSize(new java.awt.Dimension(127, 40));

        javax.swing.GroupLayout jPanelBarraSuperiorLayout = new javax.swing.GroupLayout(jPanelBarraSuperior);
        jPanelBarraSuperior.setLayout(jPanelBarraSuperiorLayout);
        jPanelBarraSuperiorLayout.setHorizontalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFechaHoraServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBarraSuperiorLayout.setVerticalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                .addGroup(jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFechaHoraServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        int w = this.getWidth();
        int h = this.getHeight();
        Graphics2D graphics = (Graphics2D)g;
        graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Color noColor =  new Color(0, 0, 0, 0);
        GradientPaint primary = new GradientPaint(0f, 0f, secondColor, w, 0f, thirdColor);
        GradientPaint secondary = new GradientPaint( 0f, 0f, noColor,0f, h, firstColor);
        graphics.setPaint(primary);
        graphics.fillRect(0, 0, w, h);
        graphics.setPaint(secondary);
        graphics.fillRect(0, 0, w, h);
        primary = null;
        secondary = null;
        noColor = null;
    }
    
    private void jLabelHomePageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomePageMouseExited
        // TODO add your handling code here:
        jLabelHomePage.setBackground(secondColor);
        jLabelHomePage.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelHomePageMouseExited

    private void jLabelHomePageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomePageMouseEntered
        // TODO add your handling code here:
        jLabelHomePage.setBackground(firstColor);
        jLabelHomePage.setForeground(fontColor);
    }//GEN-LAST:event_jLabelHomePageMouseEntered

    private void jLabelClassesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClassesMouseExited
        // TODO add your handling code here:
        jLabelClasses.setBackground(secondColor);
        jLabelClasses.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelClassesMouseExited

    private void jLabelClassesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClassesMouseEntered
        // TODO add your handling code here:
        jLabelClasses.setBackground(firstColor);
        jLabelClasses.setForeground(fontColor);
    }//GEN-LAST:event_jLabelClassesMouseEntered

    private void jLabelHomeWorksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeWorksMouseExited
        // TODO add your handling code here:
        jLabelHomeWorks.setBackground(secondColor);
        jLabelHomeWorks.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelHomeWorksMouseExited

    private void jLabelHomeWorksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeWorksMouseEntered
        // TODO add your handling code here:
        jLabelHomeWorks.setBackground(firstColor);
        jLabelHomeWorks.setForeground(fontColor);
    }//GEN-LAST:event_jLabelHomeWorksMouseEntered

    private void jLabelDatesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDatesMouseExited
        // TODO add your handling code here:
        jLabelDates.setBackground(secondColor);
        jLabelDates.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelDatesMouseExited

    private void jLabelDatesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDatesMouseEntered
        // TODO add your handling code here:
        jLabelDates.setBackground(firstColor);
        jLabelDates.setForeground(fontColor);
    }//GEN-LAST:event_jLabelDatesMouseEntered

    private void jLabelNoticesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNoticesMouseExited
        // TODO add your handling code here:
        jLabelNotices.setBackground(secondColor);
        jLabelNotices.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelNoticesMouseExited

    private void jLabelNoticesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNoticesMouseEntered
        // TODO add your handling code here:
        jLabelNotices.setBackground(firstColor);
        jLabelNotices.setForeground(fontColor);
    }//GEN-LAST:event_jLabelNoticesMouseEntered

    private void jLabelGroupsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGroupsMouseExited
        // TODO add your handling code here:
        jLabelGroups.setBackground(secondColor);
        jLabelGroups.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelGroupsMouseExited

    private void jLabelGroupsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGroupsMouseEntered
        // TODO add your handling code here:
        jLabelGroups.setBackground(firstColor);
        jLabelGroups.setForeground(fontColor);
    }//GEN-LAST:event_jLabelGroupsMouseEntered

    private void jLabelChatsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChatsMouseEntered
        // TODO add your handling code here:
        jLabelChats.setBackground(firstColor);
        jLabelChats.setForeground(fontColor);
    }//GEN-LAST:event_jLabelChatsMouseEntered

    private void jLabelChatsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChatsMouseExited
        // TODO add your handling code here:
        jLabelChats.setBackground(secondColor);
        jLabelChats.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelChatsMouseExited

    private void jLabelAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutMouseExited
        // TODO add your handling code here:
        jLabelAbout.setBackground(secondColor);
        jLabelAbout.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelAboutMouseExited

    private void jLabelAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutMouseEntered
        // TODO add your handling code here:
        jLabelAbout.setBackground(firstColor);
        jLabelAbout.setForeground(fontColor);
    }//GEN-LAST:event_jLabelAboutMouseEntered

    private void jLabelAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutMouseClicked
        // TODO add your handling code here:
        
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 9){
                panelLayout.show(jPanelInformacion, "aboutPanel");
                activePageFlag = 9;
            }
        }
        
    }//GEN-LAST:event_jLabelAboutMouseClicked

    private void jLabelChatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChatsMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 8){
                panelLayout.show(jPanelInformacion, "chatsPanel");
                activePageFlag = 8;
            }
        }
        
    }//GEN-LAST:event_jLabelChatsMouseClicked

    private void jLabelGroupsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGroupsMouseClicked
        // TODO add your handling code here:
         if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 7){
                panelLayout.show(jPanelInformacion, "groupsPanel");
                activePageFlag = 7;
            }
        }
    }//GEN-LAST:event_jLabelGroupsMouseClicked

    private void jLabelNoticesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNoticesMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 6){
                panelLayout.show(jPanelInformacion, "noticesPanel");
                activePageFlag = 6;
            }
        }
        
    }//GEN-LAST:event_jLabelNoticesMouseClicked

    private void jLabelDatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDatesMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 5){
                panelLayout.show(jPanelInformacion, "datesPanel");
                activePageFlag = 5;
            }
        }
        
    }//GEN-LAST:event_jLabelDatesMouseClicked

    private void jLabelHomeWorksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeWorksMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 4){
                panelLayout.show(jPanelInformacion, "homeworksPanel");
                activePageFlag = 4;
            }
        }
        
    }//GEN-LAST:event_jLabelHomeWorksMouseClicked

    private void jLabelClassesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClassesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabelClassesMouseClicked

    
    private void jLabelHomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomePageMouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jLabelHomePageMouseClicked

    private void jLabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(jPanelMenu.isVisible())
                jPanelMenu.setVisible(false);
            else
                jPanelMenu.setVisible(true);
        }
    }//GEN-LAST:event_jLabelMenuMouseClicked

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            MainFrame.logOut();
        }
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jLabelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseEntered
        // TODO add your handling code here:
        jLabelLogOut.setBackground(firstColor);
        jLabelLogOut.setForeground(fontColor);
    }//GEN-LAST:event_jLabelLogOutMouseEntered

    private void jLabelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseExited
        // TODO add your handling code here:
        jLabelLogOut.setBackground(secondColor);
        jLabelLogOut.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelLogOutMouseExited

    private void jLabelUserProfilePhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserProfilePhotoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 0){
                panelLayout.show(jPanelInformacion, "infoProfilePanel");
                activePageFlag = 0;
            }
        }
    }//GEN-LAST:event_jLabelUserProfilePhotoMouseClicked

    private void jLabelMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMouseClicked
        // TODO add your handling code here:
       if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 10){
                panelLayout.show(jPanelInformacion, "musicPanel");
                activePageFlag =10;
            }
        }
    }//GEN-LAST:event_jLabelMusicMouseClicked

    private void jLabelMusicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMouseEntered
        // TODO add your handling code here:
        jLabelMusic.setBackground(firstColor);
        jLabelMusic.setForeground(fontColor);
    }//GEN-LAST:event_jLabelMusicMouseEntered

    private void jLabelMusicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMouseExited
        // TODO add your handling code here:
        jLabelMusic.setBackground(secondColor);
        jLabelMusic.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelMusicMouseExited

    public static void showInfoProfilePanel(){
        if(activePageFlag != 0){
            panelLayout.show(jPanelInformacion, "infoProfilePanel");
            activePageFlag = 0;
        }
    }
    
    public static void showEditProfilePanel(){
        if(activePageFlag != 1){
            panelLayout.show(jPanelInformacion, "editProfilePanel");
            activePageFlag = 1;
        }
    }
    
    @Override
    public void setColors(Image image){
        try {
            
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
                    i+= colorRandom.nextInt(large + 1)+ large;
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
                

                thirdColor = secondColor;
                if(colorList.size() > 2){
                    iterations = 0;
                    
                    while(Math.abs(thirdColor.getRGB() - firstColor.getRGB()) < 3000000 || Math.abs(secondColor.getRGB() - thirdColor.getRGB()) < 3000000){
                        int position = colorRandom.nextInt((int)colorList.size()-1);
                        thirdColor = colorList.get(position).second();
                        iterations++;
                        if(iterations > 50){
                            while(thirdColor.getRGB() == firstColor.getRGB() || thirdColor.getRGB() == secondColor.getRGB()){
                                position = colorRandom.nextInt((int)colorList.size()-1);
                                thirdColor = colorList.get(position).second();
                            }
                            break;
                        }
                    }
                }
                
                int red = firstColor.getRed();
                fontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                
                colorList.clear();
                red = secondColor.getRed();
                secondFontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                red = thirdColor.getRed();
                thirdFontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                
                Component[] components = jPanelMenu.getComponents();

                for(Component component: components){
                    component.setForeground(secondFontColor);
                    component.setBackground(secondColor);
                }
                colorList = null;
                pg = null;
                pixels = null;
                this.repaint();
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(MusicPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    @Override
    public void dispose(){
        server_time_stop = false;
        serverDateTime.interrupt();
        userImage = null;
        musicPanel.dispose();
        chatsPanel.dispose();
        noticesPanel.dispose();
        noticesPanel.dispose();
        groupsPanel.dispose();
        homeworksPanel.dispose();
        musicPanel = null;
        setFirstColor(null);
        setSecondColor(null);
        colorRandom = null;
        chatsPanel = null;
        aboutPanel = null;
        infoProfilePanel = null;
        editProfilePanel = null;
        panelLayout = null;
        noticesPanel = null;
        homeworksPanel = null;
        datesPanel = null;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAbout;
    private javax.swing.JLabel jLabelChats;
    private javax.swing.JLabel jLabelClasses;
    private javax.swing.JLabel jLabelDates;
    private javax.swing.JLabel jLabelFechaHoraServidor;
    private javax.swing.JLabel jLabelGroups;
    private javax.swing.JLabel jLabelHomePage;
    private javax.swing.JLabel jLabelHomeWorks;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelMusic;
    private javax.swing.JLabel jLabelNotices;
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
     * @return the userImage
     */
    public static BufferedImage getBufferedUserImage() {
        return bufferedUserImage;
    }
    
    /**
     * @param aUserImage the userImage to set
     */
    public static void setUserImage(Image aUserImage) {
        userImage = aUserImage;
        ImageIcon imageProfile  = new ImageIcon(userImage.getScaledInstance(175,175, Image.SCALE_SMOOTH));
        jLabelUserProfilePhoto.setIcon(imageProfile);
        int imageWidth = infoProfilePanel.getProfilePhotoLabel().getPreferredSize().width;
        int imageHeight = infoProfilePanel.getProfilePhotoLabel().getPreferredSize().height;
        ImageIcon icon = new ImageIcon(imageProfile.getImage().getScaledInstance(imageWidth,imageHeight,Image.SCALE_SMOOTH));
        infoProfilePanel.getProfilePhotoLabel().setIcon(icon);
        imageProfile = null;
        icon = null;
    }

    /**
     * @return the firstColor
     */
    public static Color getFirstColor() {
        return firstColor;
    }

    /**
     * @param aFirstColor the firstColor to set
     */
    public static void setFirstColor(Color aFirstColor) {
        firstColor = aFirstColor;
    }

    /**
     * @return the secondColor
     */
    public static Color getSecondColor() {
        return secondColor;
    }

    /**
     * @param aSecondColor the secondColor to set
     */
    public static void setSecondColor(Color aSecondColor) {
        secondColor = aSecondColor;
    }

    /**
     * @return the thirdColor
     */
    public static Color getThirdColor() {
        return thirdColor;
    }

    /**
     * @param aThirdColor the thirdColor to set
     */
    public static void setThirdColor(Color aThirdColor) {
        thirdColor = aThirdColor;
    }

    /**
     * @return the fontColor
     */
    public static Color getFontColor() {
        return fontColor;
    }

    /**
     * @param aFontColor the fontColor to set
     */
    public static void setFontColor(Color aFontColor) {
        fontColor = aFontColor;
    }

     /**
     * @return the fontColor
     */
    public static Color getSecondFontColor() {
        return secondFontColor;
    }

    /**
     * @param aFontColor the fontColor to set
     */
    public static void setSecondFontColor(Color aFontColor) {
        secondFontColor = aFontColor;
    }
    
     /**
     * @return the fontColor
     */
    public static Color getThirdFontColor() {
        return thirdFontColor;
    }

    /**
     * @param aFontColor the fontColor to set
     */
    public static void setThirdFontColor(Color aFontColor) {
        thirdFontColor = aFontColor;
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
                    date = null;
                    time = null;
                    dateFormat = null;
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ServerDateTime.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    
    

}
