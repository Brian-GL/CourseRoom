/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.generals;

import courseroom.MainFrame;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class General_Login_Panel extends javax.swing.JPanel{

    
    /**
     * Creates new form LoginPanel
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public General_Login_Panel() {
        initComponents();
        initMyComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCrearCuenta = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jButtonIniciarSesion = new javax.swing.JButton();
        jLabelBrand = new javax.swing.JLabel();
        jLabelRecuperarCredenciales = new javax.swing.JLabel();
        jCheckBoxMostrarPassword = new javax.swing.JCheckBox();
        jLabelBrandImage = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1260, 670));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1260, 670));

        jLabelCrearCuenta.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCrearCuenta.setText("¿No Tienes Cuenta? Crea Tu Cuenta Aquí");
        jLabelCrearCuenta.setToolTipText("Crea Tu Cuenta Aquí");
        jLabelCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCrearCuenta.setOpaque(true);
        jLabelCrearCuenta.setPreferredSize(new java.awt.Dimension(430, 22));
        jLabelCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCrearCuentaMouseClicked(evt);
            }
        });

        jPasswordFieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jPasswordFieldPassword.setToolTipText("Ingresa Aquí Tu Contraseña");
        jPasswordFieldPassword.setMinimumSize(new java.awt.Dimension(430, 45));
        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(430, 45));

        jLabelNombreUsuario.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelNombreUsuario.setText("Usuario");
        jLabelNombreUsuario.setMaximumSize(new java.awt.Dimension(430, 30));
        jLabelNombreUsuario.setMinimumSize(new java.awt.Dimension(430, 30));
        jLabelNombreUsuario.setPreferredSize(new java.awt.Dimension(430, 30));

        jTextFieldNombreUsuario.setFont(new java.awt.Font("Gadugi", 0, 25)); // NOI18N
        jTextFieldNombreUsuario.setToolTipText("Ingresa Aquí Tu Nombre De Usuario");
        jTextFieldNombreUsuario.setMinimumSize(new java.awt.Dimension(430, 45));
        jTextFieldNombreUsuario.setPreferredSize(new java.awt.Dimension(430, 45));

        jButtonIniciarSesion.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jButtonIniciarSesion.setText(" Iniciar Sesión ");
        jButtonIniciarSesion.setToolTipText("Click Para Iniciar Sesión Con Tus Credenciales");
        jButtonIniciarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIniciarSesion.setPreferredSize(new java.awt.Dimension(430, 54));
        jButtonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIniciarSesionMouseExited(evt);
            }
        });

        jLabelBrand.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBrand.setText("2021 - CourseRoom®");
        jLabelBrand.setToolTipText("Año De Creación - Todos Los Derechos Reservados");
        jLabelBrand.setPreferredSize(new java.awt.Dimension(430, 22));
        jLabelBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBrandMouseClicked(evt);
            }
        });

        jLabelRecuperarCredenciales.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelRecuperarCredenciales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRecuperarCredenciales.setText("¿Olvidaste Tus Credenciales? Recupera Aquí");
        jLabelRecuperarCredenciales.setToolTipText("Recuperar Credenciales");
        jLabelRecuperarCredenciales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRecuperarCredenciales.setOpaque(true);
        jLabelRecuperarCredenciales.setPreferredSize(new java.awt.Dimension(430, 22));
        jLabelRecuperarCredenciales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRecuperarCredencialesMouseClicked(evt);
            }
        });

        jCheckBoxMostrarPassword.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jCheckBoxMostrarPassword.setText("Mostrar Contraseña");
        jCheckBoxMostrarPassword.setToolTipText("Muestra La Contraseña");
        jCheckBoxMostrarPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxMostrarPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBoxMostrarPassword.setMaximumSize(new java.awt.Dimension(430, 30));
        jCheckBoxMostrarPassword.setMinimumSize(new java.awt.Dimension(430, 30));
        jCheckBoxMostrarPassword.setPreferredSize(new java.awt.Dimension(430, 30));
        jCheckBoxMostrarPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMostrarPasswordMouseClicked(evt);
            }
        });

        jLabelBrandImage.setBackground(new java.awt.Color(14, 30, 64));
        jLabelBrandImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBrandImage.setToolTipText("CourseRoom Logo");
        jLabelBrandImage.setMinimumSize(new java.awt.Dimension(150, 125));
        jLabelBrandImage.setPreferredSize(new java.awt.Dimension(400, 125));

        jLabelPassword.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelPassword.setText("<html>\n<p style=\"text-align:center;\">\n Contraseña\n</p>\n</html>");
        jLabelPassword.setMaximumSize(new java.awt.Dimension(430, 30));
        jLabelPassword.setMinimumSize(new java.awt.Dimension(430, 30));
        jLabelPassword.setPreferredSize(new java.awt.Dimension(430, 30));

        jLabelImagen.setBackground(java.awt.Color.black);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBrandImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                            .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCheckBoxMostrarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelRecuperarCredenciales, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelBrandImage, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jCheckBoxMostrarPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelRecuperarCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void jCheckBoxMostrarPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMostrarPasswordMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if (jCheckBoxMostrarPassword.isSelected()){
                jPasswordFieldPassword.setEchoChar((char)0);
            }
            else{
                jPasswordFieldPassword.setEchoChar('\u25CF');
            }
        }
    }//GEN-LAST:event_jCheckBoxMostrarPasswordMouseClicked

    private void jButtonIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            MainFrame.ShowDashboard();
        }
    }//GEN-LAST:event_jButtonIniciarSesionMouseClicked

    private void jLabelRecuperarCredencialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRecuperarCredencialesMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.setVisible(false);
            MainFrame.ShowRecuperarCredenciales();  
        }
           
    }//GEN-LAST:event_jLabelRecuperarCredencialesMouseClicked

    private void jLabelCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCrearCuentaMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.setVisible(false);
            MainFrame.ShowCrearCuenta();
        }
    }//GEN-LAST:event_jLabelCrearCuentaMouseClicked

    private void jLabelBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBrandMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

        }
    }//GEN-LAST:event_jLabelBrandMouseClicked

    private void jButtonIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionMouseEntered
        // TODO add your handling code here:
        jButtonIniciarSesion.setBackground(MainFrame.getFirstColor());
        jButtonIniciarSesion.setForeground(MainFrame.getSecondColor());
    }//GEN-LAST:event_jButtonIniciarSesionMouseEntered

    private void jButtonIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionMouseExited
        // TODO add your handling code here:
        
        jButtonIniciarSesion.setBackground(MainFrame.getSecondColor());
        jButtonIniciarSesion.setForeground(MainFrame.getFirstColor());
    }//GEN-LAST:event_jButtonIniciarSesionMouseExited

    
    private void initMyComponents(){
        
        jLabelBrandImage.setIcon(MainFrame.getLogoImage());
        
        System.out.println("Login -> Getting Image From https://loremflickr.com/644/720/university,school/all");
        try {
            URL imageURL = new URL("https://loremflickr.com/644/720/university,school/all");
            ImageIcon imageIcon = new ImageIcon(imageURL);
            jLabelImagen.setIcon(imageIcon);
            String tooltip = "Image from " + imageURL.getHost();
            jLabelImagen.setToolTipText(tooltip);
            imageIcon.getImage().flush();
            imageIcon = null;
            imageURL = null;
            tooltip = null;
        } catch (MalformedURLException ex) {
            Logger.getLogger(General_Login_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Font gadugi_18 = new Font("Gadugi", 3, 16);
        jLabelCrearCuenta.setFont(gadugi_18);
        jLabelRecuperarCredenciales.setFont(gadugi_18);
        
        gadugi_18 = null;
        
        jLabelNombreUsuario.setForeground(MainFrame.getSecondColor());
        jLabelPassword.setForeground(MainFrame.getSecondColor());
        
        jTextFieldNombreUsuario.setBackground(MainFrame.getSecondColor());
        jTextFieldNombreUsuario.setForeground(MainFrame.getFirstColor());
        jTextFieldNombreUsuario.setCaretColor(MainFrame.getFirstColor());
        
        jPasswordFieldPassword.setBackground(MainFrame.getSecondColor());
        jPasswordFieldPassword.setForeground(MainFrame.getFirstColor());
        jPasswordFieldPassword.setCaretColor(MainFrame.getFirstColor());
        
        jLabelRecuperarCredenciales.setBackground(MainFrame.getSecondColor());
        jLabelCrearCuenta.setBackground(MainFrame.getSecondColor());
        
        jLabelRecuperarCredenciales.setForeground(MainFrame.getFirstColor());
        jLabelCrearCuenta.setForeground(MainFrame.getFirstColor());
        
        
        jLabelBrand.setForeground(MainFrame.getSecondColor());
        
        jButtonIniciarSesion.setBackground(MainFrame.getSecondColor());
        jButtonIniciarSesion.setForeground(MainFrame.getFirstColor());
        
        jCheckBoxMostrarPassword.setForeground(MainFrame.getSecondColor());
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JCheckBox jCheckBoxMostrarPassword;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelBrandImage;
    private javax.swing.JLabel jLabelCrearCuenta;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRecuperarCredenciales;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
