/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.generales;

import main.CourseRoom;
import interfaces.Componentes_Interface;
import javax.swing.ImageIcon;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author LENOVO
 */
public class Acerca_De_General_Panel extends javax.swing.JPanel implements Componentes_Interface{

    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Acerca_De_General_Panel() {
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

        logo_JLabel = new javax.swing.JLabel();
        titulo_JLabe = new javax.swing.JLabel();
        descripcion_JScrollPane = new javax.swing.JScrollPane();
        descripcion_JTextPane = new javax.swing.JTextPane();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        logo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_JLabel.setMaximumSize(new java.awt.Dimension(1071, 125));
        logo_JLabel.setMinimumSize(new java.awt.Dimension(1071, 125));
        logo_JLabel.setPreferredSize(new java.awt.Dimension(1071, 125));

        titulo_JLabe.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        titulo_JLabe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabe.setText("Acerca De CourseRoom");
        titulo_JLabe.setMaximumSize(new java.awt.Dimension(1071, 43));
        titulo_JLabe.setMinimumSize(new java.awt.Dimension(1071, 43));
        titulo_JLabe.setOpaque(true);
        titulo_JLabe.setPreferredSize(new java.awt.Dimension(1071, 43));

        descripcion_JScrollPane.setBorder(null);
        descripcion_JScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        descripcion_JScrollPane.setMinimumSize(new java.awt.Dimension(1071, 400));
        descripcion_JScrollPane.setOpaque(false);
        descripcion_JScrollPane.setPreferredSize(new java.awt.Dimension(1071, 400));

        descripcion_JTextPane.setEditable(false);
        descripcion_JTextPane.setBorder(null);
        descripcion_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 20)); // NOI18N
        descripcion_JTextPane.setText("CourseRoom consists mainly of a set of applications developed in the language Java programming and based on the client-server software design model. Has as main objective to organize the processes of an educational course and provide statistics respective of this to users in general. The general operation, broadly speaking, consists of three main modules: an application for the end user (be it student or teacher) who raises the general behavior of a course (student-teacher interaction, as well as the management of student learning within the course), in addition to other functionalities that allow the user to view multimedia content, view information and statistics on their courses, learn about common courses, work in groups, chat, among others stuff; a server program that controls client requests and generates responses such as uploading, editing, deleting and viewing files, establishing communication through chats and perform specific functions and / or processes, among others; and finally, a set of programs tasked with doing various specific tasks, such as generating random computers, send notifications to users, generate and obtain statistics and relevant information about students and teachers within the courses, among others.\n\nCourseRoom - All Rights Reserved");
        descripcion_JTextPane.setMinimumSize(new java.awt.Dimension(1071, 400));
        descripcion_JTextPane.setOpaque(false);
        descripcion_JTextPane.setPreferredSize(new java.awt.Dimension(1071, 400));
        descripcion_JScrollPane.setViewportView(descripcion_JTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo_JLabe, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(titulo_JLabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane descripcion_JScrollPane;
    private javax.swing.JTextPane descripcion_JTextPane;
    private javax.swing.JLabel logo_JLabel;
    private javax.swing.JLabel titulo_JLabe;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        descripcion_JScrollPane.getViewport().setOpaque(false);
        descripcion_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        
        ImageIcon icono = new ImageIcon(CourseRoom.Logo_Imagen());
        logo_JLabel.setIcon(icono);
        
        StyledDocument documento_Estilizado = descripcion_JTextPane.getStyledDocument();
        
        SimpleAttributeSet atributo_Centro = new SimpleAttributeSet();
        StyleConstants.setAlignment(atributo_Centro, StyleConstants.ALIGN_CENTER);
        documento_Estilizado.setParagraphAttributes(0, documento_Estilizado.getLength(), atributo_Centro, false);
    }

    @Override
    public void Colorear_Componentes() {
        titulo_JLabe.setBackground(CourseRoom.Segundo_Color());
        titulo_JLabe.setForeground(CourseRoom.Segundo_Color_Fuente());
        descripcion_JTextPane.setForeground(CourseRoom.Primer_Color_Fuente());
        descripcion_JTextPane.setCaretColor(CourseRoom.Primer_Color_Fuente());
    }
}
