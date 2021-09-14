/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import courseroom.MainFrame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class LoginPanel extends javax.swing.JPanel{

    /**
     * Creates new form LoginPanel
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LoginPanel() {
        initComponents();
        jLabelLogo.setIcon(MainFrame.getLogoImage());
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
        jTextFieldNombreDeUsuario = new javax.swing.JTextField();
        jButtonIniciarSesion = new javax.swing.JButton();
        jLabelBrand = new javax.swing.JLabel();
        jLabelRecuperarCredenciales = new javax.swing.JLabel();
        jCheckBoxMostrarPassword = new javax.swing.JCheckBox();
        jLabelLogo = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        imagePanel = new components.ImagePanel();

        setBackground(new java.awt.Color(0, 0, 51));
        setForeground(new java.awt.Color(104, 194, 232));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabelCrearCuenta.setBackground(new java.awt.Color(14, 30, 64));
        jLabelCrearCuenta.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelCrearCuenta.setForeground(new java.awt.Color(14, 30, 64));
        jLabelCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCrearCuenta.setText("¿No Tienes Cuenta? Crea Tu Cuenta Aquí");
        jLabelCrearCuenta.setToolTipText("Crea Tu Cuenta Aquí");
        jLabelCrearCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCrearCuenta.setPreferredSize(new java.awt.Dimension(430, 22));
        jLabelCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCrearCuentaMouseClicked(evt);
            }
        });

        jPasswordFieldPassword.setBackground(new java.awt.Color(104, 194, 232));
        jPasswordFieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(14, 30, 64));
        jPasswordFieldPassword.setToolTipText("Ingresa Aquí Tu Contraseña");
        jPasswordFieldPassword.setCaretColor(new java.awt.Color(14, 30, 64));
        jPasswordFieldPassword.setMinimumSize(new java.awt.Dimension(430, 45));
        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(430, 45));

        jLabelNombreUsuario.setBackground(new java.awt.Color(14, 30, 64));
        jLabelNombreUsuario.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(104, 194, 232));
        jLabelNombreUsuario.setText("Usuario");
        jLabelNombreUsuario.setMaximumSize(new java.awt.Dimension(430, 30));
        jLabelNombreUsuario.setMinimumSize(new java.awt.Dimension(430, 30));
        jLabelNombreUsuario.setPreferredSize(new java.awt.Dimension(430, 30));

        jTextFieldNombreDeUsuario.setBackground(new java.awt.Color(104, 194, 232));
        jTextFieldNombreDeUsuario.setFont(new java.awt.Font("Gadugi", 0, 25)); // NOI18N
        jTextFieldNombreDeUsuario.setForeground(new java.awt.Color(14, 30, 64));
        jTextFieldNombreDeUsuario.setToolTipText("Ingresa Aquí Tu Nombre De Usuario");
        jTextFieldNombreDeUsuario.setCaretColor(new java.awt.Color(14, 30, 64));
        jTextFieldNombreDeUsuario.setMinimumSize(new java.awt.Dimension(430, 45));
        jTextFieldNombreDeUsuario.setPreferredSize(new java.awt.Dimension(430, 45));

        jButtonIniciarSesion.setBackground(new java.awt.Color(104, 194, 232));
        jButtonIniciarSesion.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(14, 30, 64));
        jButtonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/account.png"))); // NOI18N
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

        jLabelBrand.setBackground(new java.awt.Color(14, 30, 64));
        jLabelBrand.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelBrand.setForeground(new java.awt.Color(14, 30, 64));
        jLabelBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBrand.setText("2021 - CourseRoom®");
        jLabelBrand.setToolTipText("Año De Creación - Todos Los Derechos Reservados");
        jLabelBrand.setPreferredSize(new java.awt.Dimension(430, 22));
        jLabelBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBrandMouseClicked(evt);
            }
        });

        jLabelRecuperarCredenciales.setBackground(new java.awt.Color(14, 30, 64));
        jLabelRecuperarCredenciales.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        jLabelRecuperarCredenciales.setForeground(new java.awt.Color(14, 30, 64));
        jLabelRecuperarCredenciales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRecuperarCredenciales.setText("¿Olvidaste Tus Credenciales? Recupera Aquí");
        jLabelRecuperarCredenciales.setToolTipText("Recuperar Credenciales");
        jLabelRecuperarCredenciales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelRecuperarCredenciales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRecuperarCredenciales.setPreferredSize(new java.awt.Dimension(430, 22));
        jLabelRecuperarCredenciales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRecuperarCredencialesMouseClicked(evt);
            }
        });

        jCheckBoxMostrarPassword.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jCheckBoxMostrarPassword.setForeground(new java.awt.Color(104, 194, 232));
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

        jLabelLogo.setBackground(new java.awt.Color(14, 30, 64));
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setToolTipText("CourseRoom Logo");
        jLabelLogo.setMinimumSize(new java.awt.Dimension(150, 125));
        jLabelLogo.setPreferredSize(new java.awt.Dimension(400, 125));

        jLabelPassword.setBackground(new java.awt.Color(14, 30, 64));
        jLabelPassword.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(104, 194, 232));
        jLabelPassword.setText("<html>\n<p style=\"text-align:center;\">\n Contraseña\n</p>\n</html>");
        jLabelPassword.setMaximumSize(new java.awt.Dimension(430, 30));
        jLabelPassword.setMinimumSize(new java.awt.Dimension(430, 30));
        jLabelPassword.setPreferredSize(new java.awt.Dimension(430, 30));

        imagePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagePanel.setPreferredSize(new java.awt.Dimension(380, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelRecuperarCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxMostrarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldNombreDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jCheckBoxMostrarPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelRecuperarCredenciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabelBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, MainFrame.getDarkBlue(), 0, h, MainFrame.getLightBlue());
        graphics.setPaint(gp);
        graphics.fillRect(0, 0, w, h);
        graphics = null;
        gp = null;
        graphics = null;
        
    }
    
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

        }
    }//GEN-LAST:event_jButtonIniciarSesionMouseClicked

    private void jLabelRecuperarCredencialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRecuperarCredencialesMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.setVisible(false);
            MainFrame.showRecuperarCredenciales();  
        }
           
    }//GEN-LAST:event_jLabelRecuperarCredencialesMouseClicked

    private void jLabelCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCrearCuentaMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.setVisible(false);
            MainFrame.showCrearCuenta();
        }
    }//GEN-LAST:event_jLabelCrearCuentaMouseClicked

    private void jLabelBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBrandMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

        }
    }//GEN-LAST:event_jLabelBrandMouseClicked

    private void jButtonIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionMouseEntered
        // TODO add your handling code here:
        jButtonIniciarSesion.setBackground(MainFrame.getLightBlue());
        jButtonIniciarSesion.setForeground(MainFrame.getDarkBlue());
    }//GEN-LAST:event_jButtonIniciarSesionMouseEntered

    private void jButtonIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionMouseExited
        // TODO add your handling code here:
        
        jButtonIniciarSesion.setBackground(MainFrame.getDarkBlue());
        jButtonIniciarSesion.setForeground(MainFrame.getLightBlue());
    }//GEN-LAST:event_jButtonIniciarSesionMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ImagePanel imagePanel;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JCheckBox jCheckBoxMostrarPassword;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelCrearCuenta;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRecuperarCredenciales;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldNombreDeUsuario;
    // End of variables declaration//GEN-END:variables
}
