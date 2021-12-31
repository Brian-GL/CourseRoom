/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.generales;

import interfaces.Componentes_Interface;
import main.CourseRoom;
import interfaces.Limpieza_Interface;
import main.CourseRoom_Frame;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class Recuperar_Credenciales_General_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    private Session sesion;
    private StringBuilder mensaje_HTML;
    private MimeBodyPart parte_Cuerpo_MIME_HTML;
    private MimeMessage mensaje_MIME;
    private InternetAddress direccion_Internet;
    private Multipart multiparte;
    
    /**
     * Creates new form RecuperarCredencialesPanel
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Recuperar_Credenciales_General_Panel() {
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
        titulo_JLabel = new javax.swing.JLabel();
        frase_JLabel = new javax.swing.JLabel();
        correo_Electronico_JLabel = new javax.swing.JLabel();
        correo_Electronico_JTextField = new javax.swing.JTextField();
        recuperar_Credenciales_JButton = new javax.swing.JButton();
        regresar_JButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1260, 670));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1260, 670));

        logo_JLabel.setBackground(new java.awt.Color(14, 30, 64));
        logo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_JLabel.setToolTipText("CourseRoom Logo");
        logo_JLabel.setMaximumSize(new java.awt.Dimension(567, 125));
        logo_JLabel.setMinimumSize(new java.awt.Dimension(567, 125));
        logo_JLabel.setPreferredSize(new java.awt.Dimension(567, 125));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("¿Has Olvidado Tu Contraseña?");
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(500, 38));

        frase_JLabel.setFont(new java.awt.Font("Gadugi", 0, 21)); // NOI18N
        frase_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frase_JLabel.setText("<html><p style=\"text-align:center;\">No te preocupes. Solamente te pediremos que ingreses<br>el correo electrónico que registraste en tu cuenta.<br>Te mandaremos tu contraseña de inmediato.</p></html>");
        frase_JLabel.setPreferredSize(new java.awt.Dimension(500, 116));

        correo_Electronico_JLabel.setFont(new java.awt.Font("Gadugi", 1, 21)); // NOI18N
        correo_Electronico_JLabel.setText("Correo Electrónico");
        correo_Electronico_JLabel.setMaximumSize(new java.awt.Dimension(500, 30));
        correo_Electronico_JLabel.setMinimumSize(new java.awt.Dimension(500, 30));
        correo_Electronico_JLabel.setPreferredSize(new java.awt.Dimension(500, 30));

        correo_Electronico_JTextField.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        correo_Electronico_JTextField.setToolTipText("");
        correo_Electronico_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        correo_Electronico_JTextField.setPreferredSize(new java.awt.Dimension(500, 43));
        correo_Electronico_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                correo_Electronico_JTextFieldKeyPressed(evt);
            }
        });

        recuperar_Credenciales_JButton.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        recuperar_Credenciales_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/id-card_1.png"))); // NOI18N
        recuperar_Credenciales_JButton.setText(" Recuperar Credenciales ");
        recuperar_Credenciales_JButton.setToolTipText("");
        recuperar_Credenciales_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recuperar_Credenciales_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recuperar_Credenciales_JButton.setPreferredSize(new java.awt.Dimension(500, 54));
        recuperar_Credenciales_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recuperar_Credenciales_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recuperar_Credenciales_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recuperar_Credenciales_JButtonMouseExited(evt);
            }
        });

        regresar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_JButton.setToolTipText("<html>\n<h3>Regresar a la página de inicio de sesión</h3>\n</html>");
        regresar_JButton.setBorder(null);
        regresar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresar_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correo_Electronico_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correo_Electronico_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recuperar_Credenciales_JButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addComponent(frase_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(337, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 19, Short.MAX_VALUE)
                .addComponent(frase_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 19, Short.MAX_VALUE)
                .addComponent(correo_Electronico_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo_Electronico_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(recuperar_Credenciales_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regresar_JButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    
    private void correo_Electronico_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correo_Electronico_JTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Enviar_Informacion();
        }
    }//GEN-LAST:event_correo_Electronico_JTextFieldKeyPressed

    private void recuperar_Credenciales_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recuperar_Credenciales_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Enviar_Informacion();
        }

    }//GEN-LAST:event_recuperar_Credenciales_JButtonMouseClicked

    private void recuperar_Credenciales_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recuperar_Credenciales_JButtonMouseEntered
        // TODO add your handling code here:
        recuperar_Credenciales_JButton.setBackground(CourseRoom.Primer_Color());
        recuperar_Credenciales_JButton.setForeground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_recuperar_Credenciales_JButtonMouseEntered

    private void recuperar_Credenciales_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recuperar_Credenciales_JButtonMouseExited
        // TODO add your handling code here:
        
        recuperar_Credenciales_JButton.setBackground(CourseRoom.Segundo_Color());
        recuperar_Credenciales_JButton.setForeground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_recuperar_Credenciales_JButtonMouseExited

    private void regresar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            CourseRoom_Frame.Mostrar_Inicio_Sesion();
        }
    }//GEN-LAST:event_regresar_JButtonMouseClicked

    private void regresar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_regresar_JButtonMouseEntered

    private void regresar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_JButtonMouseExited
        // TODO add your handling code here:
        regresar_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_regresar_JButtonMouseExited

    private boolean esCorreoElectronico(String value){
        return Pattern.compile("[ -~]+@[ -~]+", Pattern.CASE_INSENSITIVE).matcher(value).find();
    }
    
    public boolean enviarCorreoRecuperacion() {
        //Buscar el nombre de usuario y la contraseña en la base de datos:
        String nombre_Usuario = "El Admin";
        String contrasena = "123456789";

       try {

            // Destinatario
            direccion_Internet.setAddress(correo_Electronico_JTextField.getText());
            
            // Agregar destinatario al mensaje
            mensaje_MIME.setRecipient(Message.RecipientType.TO,direccion_Internet);

            // Creo la parte del mensaje HTML
            MimeBodyPart mimeBodyPartMensaje = new MimeBodyPart();
            mimeBodyPartMensaje.setFileName("Informacion De La Cuenta.txt");
            mimeBodyPartMensaje.setText(
                    CourseRoom.Concatenar("Nombre De Usuario: ",nombre_Usuario,"\nContraseña: ",contrasena));

            // Agregar la parte del mensaje HTML al multiPart
            multiparte.addBodyPart(mimeBodyPartMensaje);

            // Agregar el multiparte al cuerpo del mensaje
            mensaje_MIME.setContent(multiparte);

           try ( // Enviar el mensaje
                Transport transporte = sesion.getTransport("smtp")) {
                transporte.connect("Course_Room@outlook.com","cuceiUDG");
                transporte.sendMessage(mensaje_MIME, mensaje_MIME.getAllRecipients());
           }
           
           mimeBodyPartMensaje = null;

       } catch (MessagingException ex) {
           
           return false;
       }
       
       
       return true;
    }
    
    public void Enviar_Informacion() {
 
        if(esCorreoElectronico(correo_Electronico_JTextField.getText())){
           
           if(enviarCorreoRecuperacion()){
                JOptionPane.showMessageDialog(null, """
                                                    Hemos enviado la informaci\u00f3n de tu cuenta a tal correo electr\u00f3nico que nos pasaste.
                                                    Si no te ha llegado la informaci\u00f3n dentro de una hora te recomendamos que revises bien la direcci\u00f3n de correo electr\u00f3nico que ingresaste o revisa en la carpeta de SPAM.
                                                    Recuerda que nosotros te enviamos la informaci\u00f3n siempre y cuando exista una cuenta vinculada con el correo electr\u00f3nico ingresado.""","Información",JOptionPane.INFORMATION_MESSAGE);
           }
           else{
               JOptionPane.showMessageDialog(null,"Mmmm...\nParece que el correo electrónico no existe o estamos experimentando problemas en el envío.\nIntenta de nuevo.","Error",JOptionPane.ERROR_MESSAGE);
           }
           
        }
        else{
            JOptionPane.showMessageDialog(null,"Mmmm...\nParece que el formato de texto que ingresaste no es el adecuado.\nIntenta de nuevo.","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        
        correo_Electronico_JTextField.setText("");
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correo_Electronico_JLabel;
    private javax.swing.JTextField correo_Electronico_JTextField;
    private javax.swing.JLabel frase_JLabel;
    private javax.swing.JLabel logo_JLabel;
    private javax.swing.JButton recuperar_Credenciales_JButton;
    private javax.swing.JButton regresar_JButton;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

  

    @Override
    public void Iniciar_Componentes() {
        
        try {
            //Crear las propiedades para mandar el correo
            Properties propiedades = new Properties();
            propiedades.put("mail.smtp.host", "smtp.outlook.com");
            propiedades.put("mail.smtp.starttls.enable", "true");
            propiedades.put("mail.smtp.port", "587");
            propiedades.put("mail.smtp.auth", "true");
            // Obtener la sesion
            sesion = Session.getInstance(propiedades, null);

            // Leer la plantilla
            try (InputStream stream_Entrada = getClass().getResourceAsStream("/recursos/html/mensaje.html")) {
                try (BufferedReader lector_Buffered = new BufferedReader(new InputStreamReader(stream_Entrada))) {
                    // Almacenar el contenido de la plantilla en un StringBuffer
                    String linea = "";
                    mensaje_HTML = new StringBuilder();

                    while ((linea = lector_Buffered.readLine()) != null) {
                        mensaje_HTML.append(linea);
                    }

                }
            }

            // Crear la parte del mensaje HTML
            parte_Cuerpo_MIME_HTML = new MimeBodyPart();
            parte_Cuerpo_MIME_HTML.setContent(mensaje_HTML.toString(), "text/html");

            // Crear el cuerpo del mensaje
            mensaje_MIME = new MimeMessage(sesion);

            // Agregar el asunto al correo
            mensaje_MIME.setSubject("Course Room -  Mensaje De Recuperación.");

            // Agregar quien envía el correo
            mensaje_MIME.setFrom(new InternetAddress("Course_Room@outlook.com", "Course Room Mensaje De Recuperación"));

            // Crear el multiparte para agregar la parte del mensaje anterior
            multiparte = new MimeMultipart();

            // Agregar la parte del mensaje  de recuperación HTML al multiPart
            multiparte.addBodyPart(parte_Cuerpo_MIME_HTML);

            direccion_Internet = new InternetAddress();
            propiedades.clear();

        } catch (IOException | MessagingException ex) {

        }

        ImageIcon icono = new ImageIcon(CourseRoom.Logo_Imagen());
        logo_JLabel.setIcon(icono);
       
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        correo_Electronico_JLabel.setForeground(CourseRoom.Segundo_Color());
        frase_JLabel.setForeground(CourseRoom.Segundo_Color());
        titulo_JLabel.setForeground(CourseRoom.Segundo_Color());
        correo_Electronico_JTextField.setBackground(CourseRoom.Segundo_Color());
        correo_Electronico_JTextField.setForeground(CourseRoom.Primer_Color());
        correo_Electronico_JTextField.setCaretColor(CourseRoom.Primer_Color());
        recuperar_Credenciales_JButton.setBackground(CourseRoom.Segundo_Color());
        regresar_JButton.setBackground(CourseRoom.Primer_Color());
        recuperar_Credenciales_JButton.setForeground(CourseRoom.Primer_Color());
    }
    
    @Override
    public void Limpiar() {
        sesion = null;
        mensaje_HTML = null;
        parte_Cuerpo_MIME_HTML = null;
        mensaje_MIME = null;
        direccion_Internet = null;
        multiparte = null;
    }
}
