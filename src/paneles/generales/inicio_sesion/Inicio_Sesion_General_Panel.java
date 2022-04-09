package paneles.generales.inicio_sesion;

import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import modelos.ResponseModel;

public class Inicio_Sesion_General_Panel extends javax.swing.JPanel implements Componentes_Interface{
  
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Inicio_Sesion_General_Panel() {
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

        imagen_JLabel = new javax.swing.JLabel();
        contenido_JPanel = new javax.swing.JPanel();
        crear_Cuenta_JLabel = new javax.swing.JLabel();
        contrasena_JPasswordField = new javax.swing.JPasswordField();
        correo_Electronico_JLabel = new javax.swing.JLabel();
        correo_Electronico_JTextField = new javax.swing.JTextField();
        iniciar_Sesion_JButton = new javax.swing.JButton();
        marca_JLabel = new javax.swing.JLabel();
        recuperar_Credenciales_JLabel = new javax.swing.JLabel();
        mostrar_Contrasena_JCheckBox = new javax.swing.JCheckBox();
        logo_JLabel = new javax.swing.JLabel();
        contrasena_JLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1260, 670));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1260, 670));

        imagen_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        contenido_JPanel.setOpaque(false);

        crear_Cuenta_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        crear_Cuenta_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crear_Cuenta_JLabel.setText("¿No Tienes Cuenta? Crea Tu Cuenta Aquí");
        crear_Cuenta_JLabel.setToolTipText("");
        crear_Cuenta_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear_Cuenta_JLabel.setOpaque(true);
        crear_Cuenta_JLabel.setPreferredSize(new java.awt.Dimension(430, 22));
        crear_Cuenta_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_Cuenta_JLabelMouseClicked(evt);
            }
        });

        contrasena_JPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        contrasena_JPasswordField.setToolTipText("<html> <h3>Ingresa Tu Contraseña</h3> </html>");
        contrasena_JPasswordField.setMinimumSize(new java.awt.Dimension(430, 45));
        contrasena_JPasswordField.setPreferredSize(new java.awt.Dimension(430, 45));
        contrasena_JPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contrasena_JPasswordFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contrasena_JPasswordFieldKeyTyped(evt);
            }
        });

        correo_Electronico_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        correo_Electronico_JLabel.setText("Correo Electrónico");
        correo_Electronico_JLabel.setToolTipText("");
        correo_Electronico_JLabel.setMaximumSize(new java.awt.Dimension(430, 30));
        correo_Electronico_JLabel.setMinimumSize(new java.awt.Dimension(430, 30));
        correo_Electronico_JLabel.setPreferredSize(new java.awt.Dimension(430, 30));

        correo_Electronico_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        correo_Electronico_JTextField.setToolTipText("<html>\n<h3>Ingresa tu nombre de usuario o correo electrónico<br>\nCon el que te registraste</h3></html>");
        correo_Electronico_JTextField.setMinimumSize(new java.awt.Dimension(430, 45));
        correo_Electronico_JTextField.setPreferredSize(new java.awt.Dimension(430, 45));
        correo_Electronico_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                correo_Electronico_JTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correo_Electronico_JTextFieldKeyTyped(evt);
            }
        });

        iniciar_Sesion_JButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        iniciar_Sesion_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/house.png"))); // NOI18N
        iniciar_Sesion_JButton.setText(" Iniciar Sesión ");
        iniciar_Sesion_JButton.setToolTipText("");
        iniciar_Sesion_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciar_Sesion_JButton.setPreferredSize(new java.awt.Dimension(430, 54));
        ((ImageIcon)iniciar_Sesion_JButton.getIcon()).getImage().flush();
        iniciar_Sesion_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciar_Sesion_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciar_Sesion_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iniciar_Sesion_JButtonMouseExited(evt);
            }
        });

        marca_JLabel.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        marca_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marca_JLabel.setText("2022 - CourseRoom®");
        marca_JLabel.setToolTipText("Año De Creación - Todos Los Derechos Reservados");
        marca_JLabel.setPreferredSize(new java.awt.Dimension(430, 22));
        marca_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marca_JLabelMouseClicked(evt);
            }
        });

        recuperar_Credenciales_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        recuperar_Credenciales_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recuperar_Credenciales_JLabel.setText("¿Olvidaste Tus Credenciales? Recupera Aquí");
        recuperar_Credenciales_JLabel.setToolTipText("");
        recuperar_Credenciales_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recuperar_Credenciales_JLabel.setOpaque(true);
        recuperar_Credenciales_JLabel.setPreferredSize(new java.awt.Dimension(430, 22));
        recuperar_Credenciales_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recuperar_Credenciales_JLabelMouseClicked(evt);
            }
        });

        mostrar_Contrasena_JCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mostrar_Contrasena_JCheckBox.setText("Mostrar Contraseña");
        mostrar_Contrasena_JCheckBox.setToolTipText("Muestra La Contraseña");
        mostrar_Contrasena_JCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar_Contrasena_JCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mostrar_Contrasena_JCheckBox.setMaximumSize(new java.awt.Dimension(430, 30));
        mostrar_Contrasena_JCheckBox.setMinimumSize(new java.awt.Dimension(430, 30));
        mostrar_Contrasena_JCheckBox.setPreferredSize(new java.awt.Dimension(430, 30));
        mostrar_Contrasena_JCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar_Contrasena_JCheckBoxMouseClicked(evt);
            }
        });

        logo_JLabel.setBackground(new java.awt.Color(14, 30, 64));
        logo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_JLabel.setToolTipText("CourseRoom Logo");
        logo_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_JLabel.setPreferredSize(new java.awt.Dimension(400, 125));

        contrasena_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        contrasena_JLabel.setText("<html>\n<p style=\"text-align:center;\">\n Contraseña\n</p>\n</html>");
        contrasena_JLabel.setMaximumSize(new java.awt.Dimension(430, 30));
        contrasena_JLabel.setMinimumSize(new java.awt.Dimension(430, 30));
        contrasena_JLabel.setPreferredSize(new java.awt.Dimension(430, 30));

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrar_Contrasena_JCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasena_JPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iniciar_Sesion_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marca_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(recuperar_Credenciales_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(crear_Cuenta_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE))
                    .addComponent(logo_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contrasena_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correo_Electronico_JTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correo_Electronico_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo_Electronico_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(correo_Electronico_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasena_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contrasena_JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrar_Contrasena_JCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iniciar_Sesion_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recuperar_Credenciales_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crear_Cuenta_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(marca_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(imagen_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagen_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void mostrar_Contrasena_JCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Contrasena_JCheckBoxMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if (mostrar_Contrasena_JCheckBox.isSelected()){
                contrasena_JPasswordField.setEchoChar((char)0);
            }
            else{
                contrasena_JPasswordField.setEchoChar('\u25CF');
            }
        }
    }//GEN-LAST:event_mostrar_Contrasena_JCheckBoxMouseClicked

    private void iniciar_Sesion_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar_Sesion_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){ 
            verificar_Campos();
        }
        
    }//GEN-LAST:event_iniciar_Sesion_JButtonMouseClicked

    private void recuperar_Credenciales_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recuperar_Credenciales_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            CourseRoom.Frame().Mostrar_Vista("Recuperar_Credenciales");  
        }
           
    }//GEN-LAST:event_recuperar_Credenciales_JLabelMouseClicked

    private void crear_Cuenta_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Cuenta_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            CourseRoom.Frame().Mostrar_Vista("Crear_Cuenta");
        }
    }//GEN-LAST:event_crear_Cuenta_JLabelMouseClicked

    private void marca_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marca_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

        }
    }//GEN-LAST:event_marca_JLabelMouseClicked

    private void iniciar_Sesion_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar_Sesion_JButtonMouseEntered
        // TODO add your handling code here:
        iniciar_Sesion_JButton.setBackground(CourseRoom.Utilerias().Primer_Color());
        iniciar_Sesion_JButton.setForeground(CourseRoom.Utilerias().Segundo_Color());
    }//GEN-LAST:event_iniciar_Sesion_JButtonMouseEntered

    private void iniciar_Sesion_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar_Sesion_JButtonMouseExited
        // TODO add your handling code here:
        
        iniciar_Sesion_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        iniciar_Sesion_JButton.setForeground(CourseRoom.Utilerias().Primer_Color());
    }//GEN-LAST:event_iniciar_Sesion_JButtonMouseExited

    private void correo_Electronico_JTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correo_Electronico_JTextFieldKeyTyped
        int longitud = correo_Electronico_JTextField.getText().length();
        if(longitud > 149){
            correo_Electronico_JTextField.setText(correo_Electronico_JTextField.getText().substring(0,longitud-1));
        }
    }//GEN-LAST:event_correo_Electronico_JTextFieldKeyTyped

    private void contrasena_JPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contrasena_JPasswordFieldKeyTyped
        int longitud = contrasena_JPasswordField.getText().length();
        if (longitud > 29) {
            contrasena_JPasswordField.setText(contrasena_JPasswordField.getText().substring(0, longitud - 1));
        }
    }//GEN-LAST:event_contrasena_JPasswordFieldKeyTyped

    private void correo_Electronico_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correo_Electronico_JTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            verificar_Campos();
        }
    }//GEN-LAST:event_correo_Electronico_JTextFieldKeyPressed

    private void contrasena_JPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contrasena_JPasswordFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            verificar_Campos();
        }
    }//GEN-LAST:event_contrasena_JPasswordFieldKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel contrasena_JLabel;
    private javax.swing.JPasswordField contrasena_JPasswordField;
    private javax.swing.JLabel correo_Electronico_JLabel;
    private javax.swing.JTextField correo_Electronico_JTextField;
    private javax.swing.JLabel crear_Cuenta_JLabel;
    private javax.swing.JLabel imagen_JLabel;
    private javax.swing.JButton iniciar_Sesion_JButton;
    private javax.swing.JLabel logo_JLabel;
    private javax.swing.JLabel marca_JLabel;
    private javax.swing.JCheckBox mostrar_Contrasena_JCheckBox;
    private javax.swing.JLabel recuperar_Credenciales_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        try {
            Image logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand_Blue.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(150, 125, Image.SCALE_SMOOTH);
            ImageIcon icono = new ImageIcon(logo_Imagen);
            logo_JLabel.setIcon(icono);
            logo_Imagen.flush();
            icono.getImage().flush();

        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            
        }
        
        System.out.println("Obteniendo Imagen Inicio De Sesion...");
        byte[] respuesta = CourseRoom.Solicitudes().Imagen_Inicio_Sesion();
        BufferedImage obtener_Imagen = CourseRoom.Utilerias().Obtener_Imagen(respuesta);
        if(obtener_Imagen != null){
            ImageIcon icono_Imagen = new ImageIcon(obtener_Imagen);
            imagen_JLabel.setIcon(icono_Imagen);
            icono_Imagen.getImage().flush();
            obtener_Imagen.flush();
            obtener_Imagen.getGraphics().dispose();
        }
        System.out.println("Imagen Inicio De Sesion Obtenida...");
        Font fuente = new Font("Segoe UI", 3, 16);
        crear_Cuenta_JLabel.setFont(fuente);
        recuperar_Credenciales_JLabel.setFont(fuente);
       
        Colorear_Componentes();
        correo_Electronico_JTextField.requestFocus();
        
    }

    @Override
    public void Colorear_Componentes() {
        correo_Electronico_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color());
        contrasena_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color());
        correo_Electronico_JTextField.setBackground(CourseRoom.Utilerias().Segundo_Color());
        correo_Electronico_JTextField.setForeground(CourseRoom.Utilerias().Primer_Color());
        correo_Electronico_JTextField.setCaretColor(CourseRoom.Utilerias().Primer_Color());
        
        contrasena_JPasswordField.setBackground(CourseRoom.Utilerias().Segundo_Color());
        contrasena_JPasswordField.setForeground(CourseRoom.Utilerias().Primer_Color());
        contrasena_JPasswordField.setCaretColor(CourseRoom.Utilerias().Primer_Color());
        
        recuperar_Credenciales_JLabel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        crear_Cuenta_JLabel.setBackground(CourseRoom.Utilerias().Segundo_Color());
        
        recuperar_Credenciales_JLabel.setForeground(CourseRoom.Utilerias().Primer_Color());
        crear_Cuenta_JLabel.setForeground(CourseRoom.Utilerias().Primer_Color());
        
        marca_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color());
        
        iniciar_Sesion_JButton.setBackground(CourseRoom.Utilerias().Segundo_Color());
        iniciar_Sesion_JButton.setForeground(CourseRoom.Utilerias().Primer_Color());
        
        mostrar_Contrasena_JCheckBox.setForeground(CourseRoom.Utilerias().Segundo_Color());
        imagen_JLabel.setForeground(CourseRoom.Utilerias().Segundo_Color());
    }
    
    public void validar_Correo(String correo) {
        
        if(CourseRoom.Utilerias().Regex_Correo_Electronico_Valido(correo)) {
            String password = String.valueOf(contrasena_JPasswordField.getPassword());
            ResponseModel response = CourseRoom.Solicitudes().Obtener_Usuario(correo, password);

            if(response.Is_Success()){
                CourseRoom.Esconder_Frame();
                CourseRoom.Frame().Mostrar_Tablero(response.Mensaje().equals("Estudiante"),response.Codigo());
            }else{
                getToolkit().beep();
                CourseRoom.Utilerias().Mensaje_Alerta("Alerta", response.Mensaje());
                correo_Electronico_JTextField.setText("");
                contrasena_JPasswordField.setText("");
                correo_Electronico_JTextField.requestFocus();   
            }
            correo_Electronico_JTextField.setText("");
            contrasena_JPasswordField.setText("");
            
            CourseRoom.Mostrar_Frame();
        } else {
            getToolkit().beep();
            CourseRoom.Utilerias().Mensaje_Alerta("Alerta", "El Correo Electrónico <br>*" + correo + "*<br>No Cuenta Con El Formato Adecuado");
            correo_Electronico_JTextField.setText("");
            contrasena_JPasswordField.setText("");
            correo_Electronico_JTextField.requestFocus();   
        }
    }
    
    public void verificar_Campos() {
        String password = String.valueOf(contrasena_JPasswordField.getPassword());
        // Checa Los Campos Vacíos.
        if (password.isEmpty() || password.isBlank()){
            getToolkit().beep();
            // Si Los Campos Estan Vacíos Manda Mensaje De Error.
            CourseRoom.Utilerias().Mensaje_Alerta("Alerta", "No Se Permiten Campos Vacios");
        } else {
            validar_Correo(correo_Electronico_JTextField.getText().trim());
        }
    }
}
