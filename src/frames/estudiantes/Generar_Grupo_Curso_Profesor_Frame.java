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
public class Generar_Grupo_Curso_Profesor_Frame extends javax.swing.JFrame implements Componentes_Interface{

    private int Id_Curso;
    /**
     * Creates new form Generar_Grupo_Curso_Profesor_Frame
     */
    public Generar_Grupo_Curso_Profesor_Frame(int id_Curso) {
        initComponents();
        this.Id_Curso = id_Curso;
        
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
        numero_Usuarios_Curso_JLabel = new javax.swing.JLabel();
        numero_Grupos_Generar_JLabel = new javax.swing.JLabel();
        numero_Grupos_Generar_JFormattedTextField = new javax.swing.JFormattedTextField();
        generar_Grupos_JButton = new javax.swing.JButton();
        cerrar_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generar Grupos Para El Curso");
        setMaximumSize(new java.awt.Dimension(500, 250));
        setMinimumSize(new java.awt.Dimension(500, 250));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        numero_Usuarios_Curso_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        numero_Usuarios_Curso_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        numero_Usuarios_Curso_JLabel.setOpaque(true);

        numero_Grupos_Generar_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numero_Grupos_Generar_JLabel.setText("Número De Grupos A Generar");

        numero_Grupos_Generar_JFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        numero_Grupos_Generar_JFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_Grupos_Generar_JFormattedTextField.setText("0");
        numero_Grupos_Generar_JFormattedTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        generar_Grupos_JButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        generar_Grupos_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/group-therapy.png"))); // NOI18N
        generar_Grupos_JButton.setText("Generar Grupos");
        generar_Grupos_JButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ((ImageIcon)generar_Grupos_JButton.getIcon()).getImage().flush();
        generar_Grupos_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generar_Grupos_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generar_Grupos_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generar_Grupos_JButtonMouseExited(evt);
            }
        });

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

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numero_Usuarios_Curso_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numero_Grupos_Generar_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numero_Grupos_Generar_JFormattedTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(cerrar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(generar_Grupos_JButton)))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numero_Usuarios_Curso_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numero_Grupos_Generar_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numero_Grupos_Generar_JFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(generar_Grupos_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(contenido_JPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void generar_Grupos_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generar_Grupos_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_generar_Grupos_JButtonMouseClicked

    private void generar_Grupos_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generar_Grupos_JButtonMouseEntered
        // TODO add your handling code here:
        generar_Grupos_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        generar_Grupos_JButton.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
    }//GEN-LAST:event_generar_Grupos_JButtonMouseEntered

    private void generar_Grupos_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generar_Grupos_JButtonMouseExited
        // TODO add your handling code here:
        generar_Grupos_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        generar_Grupos_JButton.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
    }//GEN-LAST:event_generar_Grupos_JButtonMouseExited

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar_JButton;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JButton generar_Grupos_JButton;
    private javax.swing.JFormattedTextField numero_Grupos_Generar_JFormattedTextField;
    private javax.swing.JLabel numero_Grupos_Generar_JLabel;
    private javax.swing.JLabel numero_Usuarios_Curso_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);

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
        
        numero_Usuarios_Curso_JLabel.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
        numero_Usuarios_Curso_JLabel.setBackground(CourseRoom.Utilerias().Tercer_Color());
        
        numero_Grupos_Generar_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color_Fuente());
        
        contenido_JPanel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        
        numero_Grupos_Generar_JFormattedTextField.setBackground(CourseRoom.Utilerias().Primer_Color());
        numero_Grupos_Generar_JFormattedTextField.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        numero_Grupos_Generar_JFormattedTextField.setCaretColor(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        cerrar_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
        cerrar_JButton.setForeground(CourseRoom.Utilerias().Primer_Color_Fuente());
        
        generar_Grupos_JButton.setBackground(CourseRoom.Utilerias().Tercer_Color());
        generar_Grupos_JButton.setForeground(CourseRoom.Utilerias().Tercer_Color_Fuente());
    }
}