/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import data.interfaces.MainInterface;
import about.AboutPanel;
import chat.ChatsPanel;
import com.github.javafaker.Faker;
import courseroom.MainFrame;
import data.collections.PairDoublyLinkedList;
import data.structures.Pair;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import media.MusicPanel;
import media.VideoPanel;
import profile.EditProfilePanel;
import profile.InfoProfilePanel;

/**
 *
 * @author LENOVO
 */
public class DashboardPanel extends javax.swing.JPanel implements MainInterface{

    private static Image userImage;
    private static Color firstColor,secondColor, thirdColor, fontColor, secondFontColor;
    private Random colorRandom;
    private static BufferedImage bufferedUserImage;
    
    private ChatsPanel chatsPanel;
    private AboutPanel aboutPanel;
    private VideoPanel videoPanel;
    private static InfoProfilePanel infoProfilePanel;
    private EditProfilePanel editProfilePanel;
    private MusicPanel musicPanel;
    
    private static CardLayout panelLayout;
    private static byte activePageFlag;
    
    
    
    /**
     * Creates new form DashboardPanel
     */
    @SuppressWarnings({"CallToThreadStartDuringObjectConstruction", "OverridableMethodCallInConstructor"})
    public DashboardPanel() {
        initComponents();
        
        
        try {
            
            firstColor = secondColor = thirdColor = fontColor = secondFontColor = Color.BLACK;
            colorRandom = new Random(System.currentTimeMillis());
            System.out.println("Getting Image From: https://source.unsplash.com/random");
            URL getImageURL = new URL("https://source.unsplash.com/random");
            userImage = ImageIO.read(getImageURL);
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
            
            
            //dates panel -> 5 en active page flag
            
            
            //notices panel -> 6 en active page flag
            
            //groups panel -> 7 en active page flag
            
            //chats panel -> 8 en active page flag
            chatsPanel = new ChatsPanel();
            jPanelInformacion.add("chatsPanel",chatsPanel);
            
            //about panel -> 9 en active page flag
            aboutPanel = new AboutPanel();
            jPanelInformacion.add("aboutPanel",aboutPanel);
            
            //musica panel -> 10 en active page flag
            musicPanel = new MusicPanel();
            jPanelInformacion.add("musicPanel",musicPanel);
            
            //video panel -> 11 en active page flag
            videoPanel = new VideoPanel();
            jPanelInformacion.add("videoPanel",videoPanel);
            
            Faker faker = new Faker(new Locale("es","MX"));
            panelLayout = (CardLayout) jPanelInformacion.getLayout();
            jLabelUserName.setText(faker.name().username());
            
            
            
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
        jLabelVideo = new javax.swing.JLabel();
        jPanelBarraSuperior = new javax.swing.JPanel();
        jLabelMenu = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelFechaHoraServidor = new javax.swing.JLabel();
        jPanelInformacion = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelMenu.setBackground(new java.awt.Color(3, 111, 252));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(175, 560));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUserProfilePhoto.setBackground(new java.awt.Color(3, 111, 252));
        jLabelUserProfilePhoto.setToolTipText("Mostrar Perfil Del Usuario.");
        jLabelUserProfilePhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelUserProfilePhoto.setMaximumSize(new java.awt.Dimension(175, 175));
        jLabelUserProfilePhoto.setMinimumSize(new java.awt.Dimension(175, 175));
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
        jLabelClasses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/video-lecture.png"))); // NOI18N
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
        jLabelHomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/home.png"))); // NOI18N
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
        jLabelGroups.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/meeting.png"))); // NOI18N
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
        jLabelDates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/calendar.png"))); // NOI18N
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
        jLabelChats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/feedback.png"))); // NOI18N
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
        jLabelAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/iconfinder_Smart_Watch__Help_About_4016160.png"))); // NOI18N
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
        jPanelMenu.add(jLabelAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, -1));

        jLabelLogOut.setBackground(new java.awt.Color(3, 111, 252));
        jLabelLogOut.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelLogOut.setForeground(java.awt.Color.white);
        jLabelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logout.png"))); // NOI18N
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
        jPanelMenu.add(jLabelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 525, -1, -1));

        jLabelMusic.setBackground(new java.awt.Color(3, 111, 252));
        jLabelMusic.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelMusic.setForeground(java.awt.Color.white);
        jLabelMusic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/ic_album_128_28113.png"))); // NOI18N
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

        jLabelVideo.setBackground(new java.awt.Color(3, 111, 252));
        jLabelVideo.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelVideo.setForeground(java.awt.Color.white);
        jLabelVideo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/iconfinder-videoslideslayersplayerui-3993849_112664.png"))); // NOI18N
        jLabelVideo.setText("<html>&nbsp;Video&nbsp;</html>");
        jLabelVideo.setToolTipText("Video Player");
        jLabelVideo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVideo.setOpaque(true);
        jLabelVideo.setPreferredSize(new java.awt.Dimension(175, 35));
        jLabelVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVideoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelVideoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelVideoMouseExited(evt);
            }
        });
        jPanelMenu.add(jLabelVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, -1, -1));

        jPanelBarraSuperior.setBackground(new java.awt.Color(35, 64, 102));
        jPanelBarraSuperior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBarraSuperior.setPreferredSize(new java.awt.Dimension(800, 40));

        jLabelMenu.setBackground(new java.awt.Color(3, 111, 252));
        jLabelMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMenu.setForeground(java.awt.Color.white);
        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/menu (1).png"))); // NOI18N
        jLabelMenu.setToolTipText("Muestra/Oculta El Menú");
        jLabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseClicked(evt);
            }
        });

        jLabelUserName.setBackground(new java.awt.Color(3, 111, 252));
        jLabelUserName.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabelUserName.setForeground(java.awt.Color.white);
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUserName.setText(" ");
        jLabelUserName.setToolTipText("Usuario Con Sesión Iniciada");
        jLabelUserName.setMaximumSize(new java.awt.Dimension(237, 25));
        jLabelUserName.setMinimumSize(new java.awt.Dimension(237, 25));
        jLabelUserName.setPreferredSize(new java.awt.Dimension(237, 26));

        jLabelFechaHoraServidor.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jLabelFechaHoraServidor.setForeground(java.awt.Color.white);
        jLabelFechaHoraServidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaHoraServidor.setText("10/07/2021 13:55:09 P.M");

        javax.swing.GroupLayout jPanelBarraSuperiorLayout = new javax.swing.GroupLayout(jPanelBarraSuperior);
        jPanelBarraSuperior.setLayout(jPanelBarraSuperiorLayout);
        jPanelBarraSuperiorLayout.setHorizontalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabelMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFechaHoraServidor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBarraSuperiorLayout.setVerticalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFechaHoraServidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
            .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                .addGroup(jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelMenu))
                    .addGroup(jPanelBarraSuperiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelInformacion.setBackground(java.awt.Color.black);
        jPanelInformacion.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jPanelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    }//GEN-LAST:event_jLabelGroupsMouseClicked

    private void jLabelNoticesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNoticesMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 6){
                panelLayout.show(jPanelInformacion, "pdfPanel");
                activePageFlag = 6;
            }
        }
        
    }//GEN-LAST:event_jLabelNoticesMouseClicked

    private void jLabelDatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDatesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabelDatesMouseClicked

    private void jLabelHomeWorksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeWorksMouseClicked
        // TODO add your handling code here:
        
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

    private void jLabelVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVideoMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(activePageFlag != 11){
                panelLayout.show(jPanelInformacion, "videoPanel");
                activePageFlag =11;
            }
        }
    }//GEN-LAST:event_jLabelVideoMouseClicked

    private void jLabelVideoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVideoMouseEntered
        // TODO add your handling code here:
        jLabelVideo.setBackground(firstColor);
        jLabelVideo.setForeground(fontColor);
    }//GEN-LAST:event_jLabelVideoMouseEntered

    private void jLabelVideoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVideoMouseExited
        // TODO add your handling code here:
        jLabelVideo.setBackground(secondColor);
        jLabelVideo.setForeground(secondFontColor);
    }//GEN-LAST:event_jLabelVideoMouseExited

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
                        colorList.add_back(1, color);
                    }

                    color = null;
                    i+= colorRandom.nextInt(401)+ 400;
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

                secondFontColor = (secondColor.getRed() >= 155) ? Color.BLACK : Color.WHITE;
                jPanelMenu.setBackground(secondColor);
                Component[] components = jPanelMenu.getComponents();

                for(Component component: components){
                    component.setBackground(secondColor);
                    component.setForeground(secondFontColor);
                }

                jLabelUserName.setForeground(secondFontColor);
                jLabelFechaHoraServidor.setForeground(secondFontColor);
                jPanelBarraSuperior.setBackground(secondColor);
                jLabelUserName.setForeground(secondFontColor);
                jLabelMusic.setForeground(secondFontColor);
                jLabelClasses.setForeground(secondFontColor);
                jLabelHomePage.setForeground(secondFontColor);
                jLabelHomeWorks.setForeground(secondFontColor);
                jLabelVideo.setForeground(secondFontColor);
                jLabelNotices.setForeground(secondFontColor);
                jLabelDates.setForeground(secondFontColor);
                jLabelAbout.setForeground(secondFontColor);
                jLabelChats.setForeground(secondFontColor);
                jLabelGroups.setForeground(secondFontColor);
                jLabelLogOut.setForeground(secondFontColor);
                
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
        userImage = null;
        musicPanel.dispose();
        chatsPanel.dispose();
        musicPanel = null;
        setFirstColor(null);
        setSecondColor(null);
        colorRandom = null;
        chatsPanel = null;
        aboutPanel = null;
        infoProfilePanel = null;
        editProfilePanel = null;
        panelLayout = null;
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
    private javax.swing.JLabel jLabelVideo;
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



}
