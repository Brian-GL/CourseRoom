/*
 * Copyright (C) 2022 LENOVO
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package frames.estudiantes;

import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class Agregar_Usuario_Grupo_Frame extends javax.swing.JFrame implements Componentes_Interface{

    private int Id_Curso;
    /**
     * Creates new form Agregar_Usuario_Grupo_Frame
     */
    public Agregar_Usuario_Grupo_Frame(int id_Curso) {
        initComponents();
        Id_Curso = id_Curso;
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

        contenido_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        usuario_JLabel = new javax.swing.JLabel();
        grupo_JLabel = new javax.swing.JLabel();
        usuario_AutoCompletionComboBox = new com.jidesoft.swing.AutoCompletionComboBox();
        grupo_AutoCompletionComboBox = new com.jidesoft.swing.AutoCompletionComboBox();
        cerrar_JButton = new javax.swing.JButton();
        agregar_Usuario_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Usuario Grupo");
        setMaximumSize(new java.awt.Dimension(1000, 400));
        setMinimumSize(new java.awt.Dimension(1000, 400));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_JLabel.setText("Agregar Usuario A Grupo Del Curso");

        usuario_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        usuario_JLabel.setText("Usuario");

        grupo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        grupo_JLabel.setText("Grupo");

        usuario_AutoCompletionComboBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        grupo_AutoCompletionComboBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        cerrar_JButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cerrar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/close.png"))); // NOI18N
        cerrar_JButton.setText("Cancelar");
        ((ImageIcon)cerrar_JButton.getIcon()).getImage().flush();
        cerrar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrar_JButtonMouseExited(evt);
            }
        });

        agregar_Usuario_JButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        agregar_Usuario_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conversation.png"))); // NOI18N
        agregar_Usuario_JButton.setText("Agregar Usuario");
        agregar_Usuario_JButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ((ImageIcon)agregar_Usuario_JButton.getIcon()).getImage().flush();
        agregar_Usuario_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregar_Usuario_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregar_Usuario_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregar_Usuario_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usuario_AutoCompletionComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(usuario_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grupo_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                                .addComponent(grupo_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(cerrar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 582, Short.MAX_VALUE)
                        .addComponent(agregar_Usuario_JButton)))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_JLabel)
                    .addComponent(grupo_JLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grupo_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(214, 214, 214)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(agregar_Usuario_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(contenido_JPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.dispose();
        }
    }//GEN-LAST:event_cerrar_JButtonMouseClicked

    private void cerrar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseEntered
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        cerrar_JButton.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
    }//GEN-LAST:event_cerrar_JButtonMouseEntered

    private void cerrar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_JButtonMouseExited
        // TODO add your handling code here:
        cerrar_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
        cerrar_JButton.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
    }//GEN-LAST:event_cerrar_JButtonMouseExited

    private void agregar_Usuario_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_Usuario_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

        }
    }//GEN-LAST:event_agregar_Usuario_JButtonMouseClicked

    private void agregar_Usuario_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_Usuario_JButtonMouseEntered
        // TODO add your handling code here:
        agregar_Usuario_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        agregar_Usuario_JButton.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
    }//GEN-LAST:event_agregar_Usuario_JButtonMouseEntered

    private void agregar_Usuario_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_Usuario_JButtonMouseExited
        // TODO add your handling code here:
        agregar_Usuario_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        agregar_Usuario_JButton.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
    }//GEN-LAST:event_agregar_Usuario_JButtonMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_Usuario_JButton;
    private javax.swing.JButton cerrar_JButton;
    private javax.swing.JPanel contenido_JPanel;
    private com.jidesoft.swing.AutoCompletionComboBox grupo_AutoCompletionComboBox;
    private javax.swing.JLabel grupo_JLabel;
    private javax.swing.JLabel titulo_JLabel;
    private com.jidesoft.swing.AutoCompletionComboBox usuario_AutoCompletionComboBox;
    private javax.swing.JLabel usuario_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        this.setLocationRelativeTo(null);
        

        try {
            Image logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand_Blue.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(75, 62, Image.SCALE_SMOOTH);
            this.setIconImage(logo_Imagen);
            logo_Imagen.flush();
        } catch (IOException ex) {

        }
        
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        
        titulo_JLabel.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        grupo_JLabel.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        usuario_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        contenido_JPanel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        
        usuario_AutoCompletionComboBox.setBackground(CourseRoom.Utilerias().Primer_Color());
        usuario_AutoCompletionComboBox.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        grupo_AutoCompletionComboBox.setBackground(CourseRoom.Utilerias().Tercer_Color());
        grupo_AutoCompletionComboBox.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        
        cerrar_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
        cerrar_JButton.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        agregar_Usuario_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        agregar_Usuario_JButton.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
    }
}
