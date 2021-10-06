/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import com.github.javafaker.Faker;
import panels.DashboardPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class InfoProfilePanel extends javax.swing.JPanel {

    
    /**
     * Creates new form ProfilePanel
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public InfoProfilePanel() {
        initComponents();
        Component[] components = this.getComponents();
        for(Component component : components){
            component.setForeground(DashboardPanel.getFontColor());
        }
        jScrollPaneDescripcion.getViewport().setOpaque(false);
        jTextAreaDescripcion.setForeground(DashboardPanel.getFontColor());
        Faker faker = new Faker(new Locale("es","MX"));
        jLabelNombres.setText(faker.name().firstName() + " " + faker.name().firstName());
        jLabelApellidos.setText(faker.name().lastName() + " " + faker.name().lastName());
        jLabelCorreoElectronico.setText(faker.internet().emailAddress());
        jLabelLocalidad.setText(faker.address().fullAddress());
        jLabelNombreDeUsuario.setText(faker.name().username());
        jLabelNumeroTelefono.setText(faker.phoneNumber().cellPhone());
        jTextAreaDescripcion.setText(faker.lorem().paragraph());
        jLabelGenero.setText(faker.demographic().sex());
        jLabelFechaDeNacimiento.setText(faker.backToTheFuture().date());
        faker = null;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelProfilePhoto = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelNombres = new javax.swing.JLabel();
        jLabelNombreDeUsuario = new javax.swing.JLabel();
        jLabelCorreoElectronico = new javax.swing.JLabel();
        jLabelNumeroTelefono = new javax.swing.JLabel();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelFechaDeNacimiento = new javax.swing.JLabel();
        jLabelLocalidad = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jScrollPaneDescripcion = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabelEditarPerfil = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        jLabelProfilePhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProfilePhoto.setToolTipText("Imagen De Perfil");
        jLabelProfilePhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelProfilePhoto.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jLabelProfilePhoto.setMinimumSize(new java.awt.Dimension(450, 450));
        jLabelProfilePhoto.setPreferredSize(new java.awt.Dimension(450, 450));

        jLabelApellidos.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabelApellidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelApellidos.setText("Apellido(s) Del Usuario");
        jLabelApellidos.setToolTipText("Apellido(s)");
        jLabelApellidos.setMaximumSize(new java.awt.Dimension(380, 50));
        jLabelApellidos.setMinimumSize(new java.awt.Dimension(380, 50));
        jLabelApellidos.setName("label"); // NOI18N
        jLabelApellidos.setPreferredSize(new java.awt.Dimension(380, 50));

        jLabelNombres.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabelNombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombres.setText("Nombre(s) Del Usuario");
        jLabelNombres.setToolTipText("Nombre(s)");
        jLabelNombres.setMaximumSize(new java.awt.Dimension(380, 50));
        jLabelNombres.setMinimumSize(new java.awt.Dimension(380, 50));
        jLabelNombres.setName("label"); // NOI18N
        jLabelNombres.setPreferredSize(new java.awt.Dimension(380, 50));

        jLabelNombreDeUsuario.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabelNombreDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreDeUsuario.setText("Nombre De Usuario");
        jLabelNombreDeUsuario.setToolTipText("User Name");
        jLabelNombreDeUsuario.setMaximumSize(new java.awt.Dimension(430, 30));
        jLabelNombreDeUsuario.setMinimumSize(new java.awt.Dimension(430, 30));
        jLabelNombreDeUsuario.setPreferredSize(new java.awt.Dimension(430, 30));

        jLabelCorreoElectronico.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelCorreoElectronico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCorreoElectronico.setText("correo.electronico@courseroom.com");
        jLabelCorreoElectronico.setToolTipText("Correo Electrónico");
        jLabelCorreoElectronico.setMaximumSize(new java.awt.Dimension(380, 25));
        jLabelCorreoElectronico.setMinimumSize(new java.awt.Dimension(380, 25));
        jLabelCorreoElectronico.setName("label"); // NOI18N
        jLabelCorreoElectronico.setPreferredSize(new java.awt.Dimension(380, 25));

        jLabelNumeroTelefono.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelNumeroTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumeroTelefono.setText("33-34-35-36-37");
        jLabelNumeroTelefono.setToolTipText("Número De Teléfono");
        jLabelNumeroTelefono.setMaximumSize(new java.awt.Dimension(163, 25));
        jLabelNumeroTelefono.setMinimumSize(new java.awt.Dimension(163, 25));
        jLabelNumeroTelefono.setName("label"); // NOI18N
        jLabelNumeroTelefono.setPreferredSize(new java.awt.Dimension(163, 25));

        jLabelPerfil.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabelPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPerfil.setText("Alumno");
        jLabelPerfil.setToolTipText("Tipo De Perfil");
        jLabelPerfil.setMaximumSize(new java.awt.Dimension(163, 25));
        jLabelPerfil.setMinimumSize(new java.awt.Dimension(163, 25));
        jLabelPerfil.setName("label"); // NOI18N
        jLabelPerfil.setPreferredSize(new java.awt.Dimension(163, 25));

        jLabelFechaDeNacimiento.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelFechaDeNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaDeNacimiento.setText("2021-02-22 (18 Años)");
        jLabelFechaDeNacimiento.setToolTipText("Fecha De Nacimiento");
        jLabelFechaDeNacimiento.setMaximumSize(new java.awt.Dimension(163, 25));
        jLabelFechaDeNacimiento.setMinimumSize(new java.awt.Dimension(163, 25));
        jLabelFechaDeNacimiento.setName("label"); // NOI18N
        jLabelFechaDeNacimiento.setPreferredSize(new java.awt.Dimension(163, 25));

        jLabelLocalidad.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabelLocalidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLocalidad.setText("<html>Blvd. Gral. Marcelino García Barragán 1421,<br>Olímpica, 44430 Guadalajara, Jal.</html>");
        jLabelLocalidad.setToolTipText("Localidad");
        jLabelLocalidad.setMinimumSize(new java.awt.Dimension(380, 60));
        jLabelLocalidad.setName("label"); // NOI18N
        jLabelLocalidad.setPreferredSize(new java.awt.Dimension(380, 60));

        jLabelGenero.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabelGenero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelGenero.setText("Mujer");
        jLabelGenero.setToolTipText("Género");
        jLabelGenero.setMaximumSize(new java.awt.Dimension(163, 25));
        jLabelGenero.setMinimumSize(new java.awt.Dimension(163, 25));
        jLabelGenero.setName("label"); // NOI18N
        jLabelGenero.setPreferredSize(new java.awt.Dimension(163, 25));

        jScrollPaneDescripcion.setMinimumSize(new java.awt.Dimension(380, 180));
        jScrollPaneDescripcion.setOpaque(false);
        jScrollPaneDescripcion.setPreferredSize(new java.awt.Dimension(380, 180));

        jTextAreaDescripcion.setEditable(false);
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setText("This Is Me...");
        jTextAreaDescripcion.setToolTipText("Descripción");
        jTextAreaDescripcion.setBorder(null);
        jTextAreaDescripcion.setOpaque(false);
        jScrollPaneDescripcion.setViewportView(jTextAreaDescripcion);

        jLabelEditarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEditarPerfil.setText("Editar Perfil");
        jLabelEditarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditarPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEditarPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEditarPerfilMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelProfilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabelFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelEditarPerfil)
                                .addComponent(jScrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProfilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabelLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEditarPerfil)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelProfilePhoto.getAccessibleContext().setAccessibleName("jLabelProfilePhoto");
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditarPerfilMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt))
            DashboardPanel.showEditProfilePanel();
        
    }//GEN-LAST:event_jLabelEditarPerfilMouseClicked

    private void jLabelEditarPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditarPerfilMouseEntered
        // TODO add your handling code here:
        jLabelEditarPerfil.setForeground(DashboardPanel.getThirdColor());
    }//GEN-LAST:event_jLabelEditarPerfilMouseEntered

    private void jLabelEditarPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditarPerfilMouseExited
        // TODO add your handling code here:
        jLabelEditarPerfil.setForeground(DashboardPanel.getFontColor());
    }//GEN-LAST:event_jLabelEditarPerfilMouseExited

    public void setProfileImage(Image image){
        ImageIcon profileIcon = new ImageIcon(image.getScaledInstance(400,400,Image.SCALE_SMOOTH)); 
        jLabelProfilePhoto.setIcon(profileIcon);
        profileIcon = null;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int imageHeight = jLabelProfilePhoto.getHeight();
        int imageWidth = jLabelProfilePhoto.getWidth();
        ImageIcon icon = new ImageIcon(DashboardPanel.getUserImage().getScaledInstance(imageWidth,imageHeight,Image.SCALE_SMOOTH));
        jLabelProfilePhoto.setIcon(icon);
        icon = null;
    }

    public JLabel getProfilePhotoLabel(){
        return InfoProfilePanel.jLabelProfilePhoto;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCorreoElectronico;
    private javax.swing.JLabel jLabelEditarPerfil;
    private javax.swing.JLabel jLabelFechaDeNacimiento;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelLocalidad;
    private javax.swing.JLabel jLabelNombreDeUsuario;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelNumeroTelefono;
    private javax.swing.JLabel jLabelPerfil;
    private static javax.swing.JLabel jLabelProfilePhoto;
    private javax.swing.JScrollPane jScrollPaneDescripcion;
    private javax.swing.JTextArea jTextAreaDescripcion;
    // End of variables declaration//GEN-END:variables
}
