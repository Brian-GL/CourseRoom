/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.generales.tablero;

import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author LENOVO
 */
public class Acerca_General_Panel extends javax.swing.JPanel implements Componentes_Interface{

    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Acerca_General_Panel() {
        initComponents();
        
        Iniciar_Componentes();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descripcion_JScrollPane = new javax.swing.JScrollPane();
        descripcion_JTextPane = new javax.swing.JTextPane();
        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1110, 630));
        setOpaque(false);

        descripcion_JScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        descripcion_JScrollPane.setBorder(null);
        descripcion_JScrollPane.setMinimumSize(new java.awt.Dimension(1071, 400));
        descripcion_JScrollPane.setOpaque(false);
        descripcion_JScrollPane.setPreferredSize(new java.awt.Dimension(1071, 400));

        descripcion_JTextPane.setBorder(null);
        descripcion_JTextPane.setContentType("text/html"); // NOI18N
        descripcion_JTextPane.setEditable(false);
        descripcion_JTextPane.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        descripcion_JTextPane.setText("<html>\n<head>\nCourseRoom\n</head>\n<body>\n<p style=\"text-align:center\"> CourseRoom consists mainly of a set of applications developed in the language Java \nprogramming and based on the client-server software design model. \nHas as main objective to organize the processes of an educational course and provide statistics respective of this to users in general. \nThe general operation, broadly speaking, consists of three main modules: an application for the end user (be it student or teacher) who raises the\n general behavior of a course (student-teacher interaction, as well as the management of student learning within the course), \nin addition to other functionalities that allow the user to view multimedia content, view information and statistics on their courses,\n learn about common courses, work in groups, chat, among others stuff; a server program that controls client requests and generates responses such as \nuploading, editing, deleting and viewing files, establishing communication through\n chats and perform specific functions and / or processes, among others; and finally, a set of programs\n tasked with doing various specific tasks, such as generating random computers, send notifications to users, generate and obtain statistics and \nrelevant information about students and teachers within the courses, among others.  \\n<br><br>CourseRoom - All Rights Reserved\n</p>\n<br>\n<br>\n</body>\n</html>");
        descripcion_JTextPane.setMinimumSize(new java.awt.Dimension(1071, 400));
        descripcion_JTextPane.setOpaque(false);
        descripcion_JTextPane.setPreferredSize(new java.awt.Dimension(1071, 400));
        descripcion_JScrollPane.setViewportView(descripcion_JTextPane);

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 72));
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(1068, 72));

        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Acerca De");
        titulo_JLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 84));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 84));

        javax.swing.GroupLayout contenido_Titulo_JPanelLayout = new javax.swing.GroupLayout(contenido_Titulo_JPanel);
        contenido_Titulo_JPanel.setLayout(contenido_Titulo_JPanelLayout);
        contenido_Titulo_JPanelLayout.setHorizontalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
                    .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JScrollPane descripcion_JScrollPane;
    private javax.swing.JTextPane descripcion_JTextPane;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        descripcion_JScrollPane.getViewport().setOpaque(false);
        descripcion_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        descripcion_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        StyledDocument documento = descripcion_JTextPane.getStyledDocument();
        SimpleAttributeSet centro = new SimpleAttributeSet();
        StyleConstants.setAlignment(centro, StyleConstants.ALIGN_CENTER);
        documento.setParagraphAttributes(0, documento.getLength(), centro, false);
        
        Image logo_Imagen;
        try {
            logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(175, 150, Image.SCALE_SMOOTH);
            ImageIcon icono = new ImageIcon(logo_Imagen);
            descripcion_JTextPane.insertIcon(icono);
            logo_Imagen.flush();
            icono.getImage().flush();
        } catch (IOException ex) {
            
        }
       
    }

    @Override
    public void Colorear_Componentes() {
        contenido_Titulo_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());

        titulo_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        descripcion_JTextPane.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
        descripcion_JTextPane.setCaretColor(CourseRoom.Utilerias.Primer_Color_Fuente());
    }
}
