/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import courseroom.MainFrame;
import data.interfaces.DisposeInterface;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class RecuperarCredencialesPanel extends javax.swing.JPanel implements DisposeInterface{

    private Session session;
    private StringBuilder msjHTML;
    private MimeBodyPart mimeBodyPartHTML;
    private MimeMessage mimeMessage;
    private InternetAddress internetAddress;
    private Multipart multipart;
    
    /**
     * Creates new form RecuperarCredencialesPanel
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public RecuperarCredencialesPanel() {
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

        jLabelBrandImagen = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFrase = new javax.swing.JLabel();
        jLabelCorreoElectronico = new javax.swing.JLabel();
        jTextFieldCorreoElectronico = new javax.swing.JTextField();
        jButtonRecuperarCredenciales = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1260, 670));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1260, 670));

        jLabelBrandImagen.setBackground(new java.awt.Color(14, 30, 64));
        jLabelBrandImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBrandImagen.setToolTipText("CourseRoom Logo");
        jLabelBrandImagen.setMaximumSize(new java.awt.Dimension(567, 125));
        jLabelBrandImagen.setMinimumSize(new java.awt.Dimension(567, 125));
        jLabelBrandImagen.setPreferredSize(new java.awt.Dimension(567, 125));

        jLabelTitulo.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("¿Has Olvidado Tu Usuario Y/O Contraseña?");
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(500, 38));

        jLabelFrase.setFont(new java.awt.Font("Gadugi", 0, 21)); // NOI18N
        jLabelFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFrase.setText("<html><p style=\"text-align:center;\">No te preocupes. Solamente te pediremos que ingreses<br>el correo electrónico que registraste en tu cuenta.<br>Te mandaremos tu nombre de usuario y contraseña.</p></html>");
        jLabelFrase.setPreferredSize(new java.awt.Dimension(500, 116));

        jLabelCorreoElectronico.setFont(new java.awt.Font("Gadugi", 1, 21)); // NOI18N
        jLabelCorreoElectronico.setText("Correo Electrónico");
        jLabelCorreoElectronico.setMaximumSize(new java.awt.Dimension(500, 30));
        jLabelCorreoElectronico.setMinimumSize(new java.awt.Dimension(500, 30));
        jLabelCorreoElectronico.setPreferredSize(new java.awt.Dimension(500, 30));

        jTextFieldCorreoElectronico.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jTextFieldCorreoElectronico.setToolTipText("Ingresa Aquí Tu Correo Electrónico De Tu Cuenta Para Enviarte Tus Credenciales");
        jTextFieldCorreoElectronico.setCaretColor(new java.awt.Color(104, 194, 232));
        jTextFieldCorreoElectronico.setPreferredSize(new java.awt.Dimension(500, 43));
        jTextFieldCorreoElectronico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoElectronicoKeyPressed(evt);
            }
        });

        jButtonRecuperarCredenciales.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jButtonRecuperarCredenciales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/id-card_1.png"))); // NOI18N
        jButtonRecuperarCredenciales.setText(" Recuperar Credenciales ");
        jButtonRecuperarCredenciales.setToolTipText("Click Para Enviar Correo De Recuperación De Credenciales");
        jButtonRecuperarCredenciales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRecuperarCredenciales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRecuperarCredenciales.setPreferredSize(new java.awt.Dimension(500, 54));
        jButtonRecuperarCredenciales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRecuperarCredencialesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRecuperarCredencialesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRecuperarCredencialesMouseExited(evt);
            }
        });

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/reply.png"))); // NOI18N
        jButtonRegresar.setToolTipText("Regresar Al Login");
        jButtonRegresar.setBorder(null);
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBrandImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRecuperarCredenciales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addComponent(jLabelFrase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(337, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBrandImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 19, Short.MAX_VALUE)
                .addComponent(jLabelFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 19, Short.MAX_VALUE)
                .addComponent(jLabelCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButtonRecuperarCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegresar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    
    private void jTextFieldCorreoElectronicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoElectronicoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            enviarInformacion();
    }//GEN-LAST:event_jTextFieldCorreoElectronicoKeyPressed

    private void jButtonRecuperarCredencialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecuperarCredencialesMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt))
            enviarInformacion();

    }//GEN-LAST:event_jButtonRecuperarCredencialesMouseClicked

    private void jButtonRecuperarCredencialesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecuperarCredencialesMouseEntered
        // TODO add your handling code here:
        jButtonRecuperarCredenciales.setBackground(MainFrame.getFirstColor());
        jButtonRecuperarCredenciales.setForeground(MainFrame.getSecondColor());
    }//GEN-LAST:event_jButtonRecuperarCredencialesMouseEntered

    private void jButtonRecuperarCredencialesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecuperarCredencialesMouseExited
        // TODO add your handling code here:
        
        jButtonRecuperarCredenciales.setBackground(MainFrame.getSecondColor());
        jButtonRecuperarCredenciales.setForeground(MainFrame.getFirstColor());
    }//GEN-LAST:event_jButtonRecuperarCredencialesMouseExited

    private void jButtonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            this.setVisible(false);
            MainFrame.showLogin();
        }
    }//GEN-LAST:event_jButtonRegresarMouseClicked

    private void jButtonRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseEntered
        // TODO add your handling code here:
        jButtonRegresar.setBackground(MainFrame.getSecondColor());
    }//GEN-LAST:event_jButtonRegresarMouseEntered

    private void jButtonRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseExited
        // TODO add your handling code here:
        jButtonRegresar.setBackground(MainFrame.getFirstColor());
    }//GEN-LAST:event_jButtonRegresarMouseExited

    private boolean esCorreoElectronico(String value){
        Pattern pattern = Pattern.compile("[ -~]+@[ -~]+", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(value).find();
    }
    
    public boolean enviarCorreoRecuperacion() {
        //Buscar el nombre de usuario y la contraseña en la base de datos:
        String nombreDeUsuario = "El Admin";
        String contrasena = "123456789";

       try {

            // Destinatario
            internetAddress.setAddress(jTextFieldCorreoElectronico.getText());
            
            // Agregar destinatario al mensaje
            mimeMessage.setRecipient(Message.RecipientType.TO,internetAddress);

            // Creo la parte del mensaje HTML
            MimeBodyPart mimeBodyPartMensaje = new MimeBodyPart();
            mimeBodyPartMensaje.setFileName("Informacion De La Cuenta.txt");
            mimeBodyPartMensaje.setText("Nombre De Usuario: "+nombreDeUsuario+"\nContraseña: "+contrasena);

            // Agregar la parte del mensaje HTML al multiPart
            multipart.addBodyPart(mimeBodyPartMensaje);

            // Agregar el multipart al cuerpo del mensaje
            mimeMessage.setContent(multipart);

           try ( // Enviar el mensaje
                Transport transport = session.getTransport("smtp")) {
                transport.connect("Course_Room@outlook.com","cuceiUDG");
                transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
           }
           
           mimeBodyPartMensaje = null;

       } catch (MessagingException ex) {
           System.out.println("main.RecuperarCredencialesController.mandarCorreoRecuperacion(): "+ex.getMessage());
           return false;
       }
       
        nombreDeUsuario = null;
        contrasena = null;
       
       return true;
    }
    
    public void enviarInformacion() {
 
        if(esCorreoElectronico(jTextFieldCorreoElectronico.getText())){
           
           if(enviarCorreoRecuperacion()){
                JOptionPane.showMessageDialog(null,"Hemos enviado la información de tu cuenta a tal correo electrónico que nos pasaste.\nSi no te ha llegado la información "
                + "dentro de una hora te recomendamos que revises bien la dirección de correo electrónico que ingresaste o revisa en la carpeta de SPAM.\nRecuerda que nosotros te enviamos la información siempre y cuando exista una cuenta vinculada con el correo electrónico ingresado.","Información",JOptionPane.INFORMATION_MESSAGE);
           }
           else{
               JOptionPane.showMessageDialog(null,"Mmmm...\nParece que el correo electrónico no existe o estamos experimentando problemas en el envío.\nIntenta de nuevo.","Error",JOptionPane.ERROR_MESSAGE);
           }
           
        }
        else{
            JOptionPane.showMessageDialog(null,"Mmmm...\nParece que el formato de texto que ingresaste no es el adecuado.\nIntenta de nuevo.","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        
        jTextFieldCorreoElectronico.setText("");
        
    }
    
    private void initMyComponents(){
        

        try {
            //Crear las propiedades para mandar el correo
            Properties properties = new Properties();
            properties.put("mail.smtp.host", "smtp.outlook.com");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.auth", "true");
            // Obtener la sesion
            session = Session.getInstance(properties, null);

            // Leer la plantilla
            try(InputStream inputStream = getClass().getResourceAsStream("/resources/html/mensaje.html")){
                try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
                     // Almacenar el contenido de la plantilla en un StringBuffer
                    String strLine = "";
                    msjHTML = new StringBuilder();

                    while ((strLine = bufferedReader.readLine()) != null) {
                        msjHTML.append(strLine);
                    }
                    
                    strLine = null;
                }
            }
           

           

            // Crear la parte del mensaje HTML
            mimeBodyPartHTML = new MimeBodyPart();
            mimeBodyPartHTML.setContent(msjHTML.toString(), "text/html");

            // Crear el cuerpo del mensaje
            mimeMessage = new MimeMessage(session);

            // Agregar el asunto al correo
            mimeMessage.setSubject("Course Room -  Mensaje De Recuperación.");

            // Agregar quien envía el correo
            mimeMessage.setFrom(new InternetAddress("Course_Room@outlook.com", "Course Room Mensaje De Recuperación"));

            // Crear el multipart para agregar la parte del mensaje anterior
            multipart = new MimeMultipart();

            // Agregar la parte del mensaje  de recuperación HTML al multiPart
            multipart.addBodyPart(mimeBodyPartHTML);

            internetAddress = new InternetAddress();
            properties.clear();
            properties = null;

        } catch (IOException | MessagingException ex) {
            System.out.println("main.RecuperarCredencialesController.initialize(): " + ex.getMessage());
        }
        
        jLabelBrandImagen.setIcon(MainFrame.getLogoImage());
        jLabelCorreoElectronico.setForeground(MainFrame.getSecondColor());
        jLabelFrase.setForeground(MainFrame.getSecondColor());
        jLabelTitulo.setForeground(MainFrame.getSecondColor());
        jTextFieldCorreoElectronico.setBackground(MainFrame.getSecondColor());
        jTextFieldCorreoElectronico.setForeground(MainFrame.getFirstColor());
        jTextFieldCorreoElectronico.setCaretColor(MainFrame.getFirstColor());
        jButtonRecuperarCredenciales.setBackground(MainFrame.getSecondColor());
        jButtonRegresar.setBackground(MainFrame.getFirstColor());
        jButtonRecuperarCredenciales.setForeground(MainFrame.getFirstColor());
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRecuperarCredenciales;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelBrandImagen;
    private javax.swing.JLabel jLabelCorreoElectronico;
    private javax.swing.JLabel jLabelFrase;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldCorreoElectronico;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose() {
        session = null;
        msjHTML = null;
        mimeBodyPartHTML = null;
        mimeMessage = null;
        internetAddress = null;
        multipart = null;
    }
}
