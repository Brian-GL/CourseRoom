/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.students;

import panels.generals.General_About_Panel;
import panels.generals.General_Music_Panel;
import com.github.javafaker.Faker;
import courseroom.MainFrame;
import data.collections.PairDoublyLinkedList;
import data.interfaces.DisposeInterface;
import data.structures.Pair;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
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
public class Student_Dashboard_Panel extends javax.swing.JPanel implements DisposeInterface{

    private static Image userImage;
    
    private static Student_Chats_Panel chatsPanel;
    private static General_About_Panel aboutPanel;
    private static Student_Info_Profile_Panel infoProfilePanel;
    private static Student_Edit_Profile_Panel editProfilePanel;
    private static General_Music_Panel musicPanel;
    private static Student_Notices_Panel noticesPanel;
    private static Student_Groups_Panel groupsPanel;
    private static Student_Dates_Panel datesPanel;
    private static Student_Homeworks_Panel homeworksPanel;
    private static Student_Dashboard_Configuration_Panel configurationPanel;
    
    private static CardLayout panelLayout;
    private ServerDateTime serverDateTime;
    private volatile boolean server_time_stop;
    
    /**
     * Creates new form DashboardPanel
     */
    @SuppressWarnings({"CallToThreadStartDuringObjectConstruction", "OverridableMethodCallInConstructor"})
    public Student_Dashboard_Panel() {
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
            
            
            infoProfilePanel = new Student_Info_Profile_Panel();
            jPanelInformacion.add("infoProfilePanel",infoProfilePanel);
            
            editProfilePanel = new Student_Edit_Profile_Panel();
            jPanelInformacion.add("editProfilePanel",editProfilePanel);
            
            //home panel -> 2 en active page flag
            
            
            //classes panel -> 3 en active page flag
            
            
            homeworksPanel = new Student_Homeworks_Panel();
            jPanelInformacion.add("homeworksPanel",homeworksPanel);
            
            
            datesPanel = new Student_Dates_Panel();
            jPanelInformacion.add("datesPanel",datesPanel);
            
            noticesPanel = new Student_Notices_Panel();
            jPanelInformacion.add("noticesPanel",noticesPanel);
            
            groupsPanel = new Student_Groups_Panel();
            jPanelInformacion.add("groupsPanel",groupsPanel);
            
            
            chatsPanel = new Student_Chats_Panel();
            jPanelInformacion.add("chatsPanel",chatsPanel);
            
            
            aboutPanel = new General_About_Panel();
            jPanelInformacion.add("aboutPanel",aboutPanel);
            
            musicPanel = new General_Music_Panel();
            jPanelInformacion.add("musicPanel",musicPanel);
            
            configurationPanel = new Student_Dashboard_Configuration_Panel();
            jPanelInformacion.add("configurationPanel",configurationPanel);
            
            Faker faker = new Faker(new Locale("es","MX"));
            panelLayout = (CardLayout) jPanelInformacion.getLayout();
            jLabelUserName.setText(faker.name().username());
            
            serverDateTime = new ServerDateTime();
            serverDateTime.start();
            
            imageURL = null;
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Student_Dashboard_Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student_Dashboard_Panel.class.getName()).log(Level.SEVERE, null, ex);
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
        jButtonTareas = new javax.swing.JButton();
        jButtonFechas = new javax.swing.JButton();
        jButtonAvisos = new javax.swing.JButton();
        jButtonGrupos = new javax.swing.JButton();
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

        jLabelUserProfilePhoto.setToolTipText("Mostrar Perfil Del Usuario.");
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
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/house.png"))); // NOI18N
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
        jButtonClases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/training.png"))); // NOI18N
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

        jButtonTareas.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/homework.png"))); // NOI18N
        jButtonTareas.setText("Tareas");
        jButtonTareas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTareas.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTareasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTareasMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, -1, -1));

        jButtonFechas.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonFechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/schedule.png"))); // NOI18N
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
        jPanelMenu.add(jButtonFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jButtonAvisos.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonAvisos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bell.png"))); // NOI18N
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
        jPanelMenu.add(jButtonAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, -1, -1));

        jButtonGrupos.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/group-meeting.png"))); // NOI18N
        jButtonGrupos.setText("Grupos");
        jButtonGrupos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGrupos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGrupos.setPreferredSize(new java.awt.Dimension(175, 35));
        jButtonGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGruposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonGruposMouseExited(evt);
            }
        });
        jPanelMenu.add(jButtonGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jButtonChats.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonChats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/online-chat.png"))); // NOI18N
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
        jPanelMenu.add(jButtonChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, -1, -1));

        jButtonMusica.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/audio.png"))); // NOI18N
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
        jPanelMenu.add(jButtonMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        jButtonAcerca.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/info.png"))); // NOI18N
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
        jPanelMenu.add(jButtonAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, -1));

        jButtonAjustes.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/settings.png"))); // NOI18N
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
        jPanelMenu.add(jButtonAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, -1, -1));

        jButtonSalir.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/exit-door.png"))); // NOI18N
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
        jPanelMenu.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 525, -1, -1));

        jPanelBarraSuperior.setBackground(java.awt.Color.black);
        jPanelBarraSuperior.setMinimumSize(new java.awt.Dimension(1260, 40));
        jPanelBarraSuperior.setOpaque(false);
        jPanelBarraSuperior.setPreferredSize(new java.awt.Dimension(1260, 40));

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

    private void jButtonTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTareasMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Student_Dashboard_Panel.showView("homeworksPanel");
        }
        
    }//GEN-LAST:event_jButtonTareasMouseClicked

    private void jButtonTareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTareasMouseEntered
        // TODO add your handling code here:
        jButtonTareas.setBackground(MainFrame.getThirdColor());
        jButtonTareas.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonTareasMouseEntered

    private void jButtonTareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTareasMouseExited
        // TODO add your handling code here:
        jButtonTareas.setBackground(MainFrame.getSecondColor());
        jButtonTareas.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonTareasMouseExited

    private void jButtonFechasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFechasMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Student_Dashboard_Panel.showView("datesPanel");
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
            Student_Dashboard_Panel.showView("noticesPanel");
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

    private void jButtonGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGruposMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Student_Dashboard_Panel.showView("groupsPanel");
        }
    }//GEN-LAST:event_jButtonGruposMouseClicked

    private void jButtonGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGruposMouseEntered
        // TODO add your handling code here:
        jButtonGrupos.setBackground(MainFrame.getThirdColor());
        jButtonGrupos.setForeground(MainFrame.getThirdFontColor());
    }//GEN-LAST:event_jButtonGruposMouseEntered

    private void jButtonGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGruposMouseExited
        // TODO add your handling code here:
        jButtonGrupos.setBackground(MainFrame.getSecondColor());
        jButtonGrupos.setForeground(MainFrame.getSecondFontColor());
    }//GEN-LAST:event_jButtonGruposMouseExited

    private void jButtonChatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChatsMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Student_Dashboard_Panel.showView("chatsPanel");
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
            Student_Dashboard_Panel.showView("musicPanel");
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
            Student_Dashboard_Panel.showView("aboutPanel");
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
            Student_Dashboard_Panel.showView("configurationPanel");
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
        try {
            
            int maximum = 0;
            Color firstColor,secondColor, thirdColor, fontColor, secondFontColor, thirdFontColor;
            firstColor = secondColor = thirdColor =  fontColor =  secondFontColor = thirdFontColor = Color.BLACK;
            Random colorRandom = new Random(System.currentTimeMillis());
            PairDoublyLinkedList<Integer, Color> colorList = new PairDoublyLinkedList<>();
            PixelGrabber pg = new PixelGrabber(userImage, 0, 0, -1, -1, false);
            int large = userImage.getWidth(null)/2;
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
                    i+= colorRandom.nextInt(large + 1) + large;
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
                red = secondColor.getRed();
                secondFontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                red = thirdColor.getRed();
                thirdFontColor = (red >= 155) ? Color.BLACK : Color.WHITE;
                colorList.clear();
                
                colorList = null;
                pg = null;
                pixels = null;
                colorRandom = null;
                
                MainFrame.setFirstColor(firstColor);
                MainFrame.setSecondColor(secondColor);
                MainFrame.setThirdColor(thirdColor);
                MainFrame.setFontColor(fontColor);
                MainFrame.setSecondFontColor(secondFontColor);
                MainFrame.setThirdFontColor(thirdFontColor);

                MainFrame.repainting();              
                colorMyComponents();
                
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(General_Music_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public static void colorMyComponents(){
        
        jButtonAcerca.setForeground(MainFrame.getSecondFontColor()); 
        jButtonAjustes.setForeground(MainFrame.getSecondFontColor());
        jButtonAvisos.setForeground(MainFrame.getSecondFontColor()); 
        jButtonChats.setForeground(MainFrame.getSecondFontColor());
        jButtonClases.setForeground(MainFrame.getSecondFontColor()); 
        jButtonFechas.setForeground(MainFrame.getSecondFontColor());
        jButtonGrupos.setForeground(MainFrame.getSecondFontColor()); 
        jButtonInicio.setForeground(MainFrame.getSecondFontColor());
        jButtonMusica.setForeground(MainFrame.getSecondFontColor()); 
        jButtonSalir.setForeground(MainFrame.getSecondFontColor());
        jButtonTareas.setForeground(MainFrame.getSecondFontColor()); 
        
        jButtonAcerca.setBackground(MainFrame.getSecondColor()); 
        jButtonAjustes.setBackground(MainFrame.getSecondColor());
        jButtonAvisos.setBackground(MainFrame.getSecondColor()); 
        jButtonChats.setBackground(MainFrame.getSecondColor());
        jButtonClases.setBackground(MainFrame.getSecondColor()); 
        jButtonFechas.setBackground(MainFrame.getSecondColor());
        jButtonGrupos.setBackground(MainFrame.getSecondColor()); 
        jButtonInicio.setBackground(MainFrame.getSecondColor());
        jButtonMusica.setBackground(MainFrame.getSecondColor()); 
        jButtonSalir.setBackground(MainFrame.getSecondColor());
        jButtonTareas.setBackground(MainFrame.getSecondColor()); 
        
        jLabelFechaHoraServidor.setForeground(MainFrame.getFontColor());
        jLabelUserName.setForeground(MainFrame.getFontColor());
        
        jLabelFechaHoraServidor.setForeground(MainFrame.getFontColor());
        jLabelUserName.setForeground(MainFrame.getFontColor());
        infoProfilePanel.colorMyComponents();
        editProfilePanel.colorMyComponents();
        aboutPanel.colorMyComponents();
        chatsPanel.colorMyComponents();
        homeworksPanel.colorMyComponents();
        groupsPanel.colorMyComponents();
        noticesPanel.colorMyComponents();
        datesPanel.colorMyComponents();
        configurationPanel.colorMyComponents();
    }
    
    @Override
    public void dispose(){
        homeworksPanel.dispose();
        musicPanel.dispose();
        chatsPanel.dispose();
        noticesPanel.dispose();
        datesPanel.dispose();
        groupsPanel.dispose();
        
    }
    
    public static void addView(Component component, String key){
        jPanelInformacion.add(key,component);
    }
    
    public static void showView(String key){
        panelLayout.show(jPanelInformacion, key);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButtonAcerca;
    private static javax.swing.JButton jButtonAjustes;
    private static javax.swing.JButton jButtonAvisos;
    private static javax.swing.JButton jButtonChats;
    private static javax.swing.JButton jButtonClases;
    private static javax.swing.JButton jButtonFechas;
    private static javax.swing.JButton jButtonGrupos;
    private static javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonMenu;
    private static javax.swing.JButton jButtonMusica;
    private static javax.swing.JButton jButtonSalir;
    private static javax.swing.JButton jButtonTareas;
    private static javax.swing.JLabel jLabelFechaHoraServidor;
    private static javax.swing.JLabel jLabelUserName;
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
