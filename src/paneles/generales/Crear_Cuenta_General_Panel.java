package paneles.generales;

import sql.Conexion;
import interfaces.Componentes_Interface;
import java.awt.HeadlessException;
import main.CourseRoom;
import main.CourseRoom_Frame;
import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Crear_Cuenta_General_Panel extends javax.swing.JPanel implements Componentes_Interface{
    
    Conexion con = new Conexion();
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Crear_Cuenta_General_Panel() {
        initComponents();
        conn = Conexion.ConnectDb();
        Iniciar_Componentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visualizador_JTabbedPane = new javax.swing.JTabbedPane();
        inicio_JPanel = new javax.swing.JPanel();
        logo_Inicio_JLabel = new javax.swing.JLabel();
        titulo_Inicio_JLabel = new javax.swing.JLabel();
        informacion_Inicio_JLabel = new javax.swing.JLabel();
        continuar_Autenticacion_JButton = new javax.swing.JButton();
        regresar_Inicio_Sesion_JButton = new javax.swing.JButton();
        autenticacion_JPanel = new javax.swing.JPanel();
        logo_Autenticacion_JLabel = new javax.swing.JLabel();
        contrasena_Autenticacion_JLabel = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        titulo_Autenticacion_JLabel = new javax.swing.JLabel();
        correo_Electronico_Autenticacion_JLabel = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        repetir_Contrasena_Autenticacion_JLabel = new javax.swing.JLabel();
        Pass2 = new javax.swing.JPasswordField();
        informacion_Repetir_Contrasena_Autenticacion_JLabel = new javax.swing.JLabel();
        informacion_Correo_Electronico_Autenticacion_JLabel = new javax.swing.JLabel();
        informacion_Contrasena_Autenticacion_JLabel = new javax.swing.JLabel();
        regresar_Inicio_JButton = new javax.swing.JButton();
        continuar_Datos_Personales_JButton = new javax.swing.JButton();
        datos_Personales_JPanel = new javax.swing.JPanel();
        logo_Datos_Personales_JLabel = new javax.swing.JLabel();
        titulo_Datos_Personales_JLabel = new javax.swing.JLabel();
        nombres_JLabel = new javax.swing.JLabel();
        nombres_JTextField = new javax.swing.JTextField();
        apellido_Paterno_JLabel = new javax.swing.JLabel();
        apellido_Paterno_JTextField = new javax.swing.JTextField();
        localidad_JLabel = new javax.swing.JLabel();
        genero_JTextField = new javax.swing.JTextField();
        genero_JLabel = new javax.swing.JLabel();
        fecha_Nacimiento_JLabel = new javax.swing.JLabel();
        continuar_Perfil_JButton = new javax.swing.JButton();
        regresar_Autenticacion_JButton = new javax.swing.JButton();
        apellido_Materno_JLabel = new javax.swing.JLabel();
        apellido_Materno_JTextField = new javax.swing.JTextField();
        fecha_Nacimiento_JPanel = new javax.swing.JPanel();
        estado_JLabel = new javax.swing.JLabel();
        estado_JComboBox = new javax.swing.JComboBox<>();
        localidad_JComboBox = new javax.swing.JComboBox<>();
        perfil_JPanel = new javax.swing.JPanel();
        logo_Perfil_JLabel = new javax.swing.JLabel();
        titulo_Perfil_JLabel = new javax.swing.JLabel();
        tipo_Perfil_JLabel = new javax.swing.JLabel();
        tipo_Perfil_JComboBox = new javax.swing.JComboBox<>();
        imagen_Perfil_JLabel = new javax.swing.JLabel();
        cargar_Imagen_Perfil_JButton = new javax.swing.JButton();
        continuar_Tablero_JButton = new javax.swing.JButton();
        regresar_Datos_Personales_JButton = new javax.swing.JButton();
        informacion_Extra_JPanel = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1260, 670));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1260, 670));
        setLayout(new java.awt.CardLayout());

        visualizador_JTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        visualizador_JTabbedPane.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        visualizador_JTabbedPane.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        visualizador_JTabbedPane.setMinimumSize(new java.awt.Dimension(1024, 700));
        visualizador_JTabbedPane.setPreferredSize(new java.awt.Dimension(1024, 700));
        visualizador_JTabbedPane.setRequestFocusEnabled(false);

        inicio_JPanel.setBackground(new java.awt.Color(14, 30, 64));
        inicio_JPanel.setToolTipText("");
        inicio_JPanel.setMinimumSize(new java.awt.Dimension(1260, 629));
        inicio_JPanel.setName("crearCuentaFrame"); // NOI18N
        inicio_JPanel.setOpaque(false);

        logo_Inicio_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Inicio_JLabel.setMaximumSize(new java.awt.Dimension(150, 125));
        logo_Inicio_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_Inicio_JLabel.setPreferredSize(new java.awt.Dimension(150, 125));

        titulo_Inicio_JLabel.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        titulo_Inicio_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Inicio_JLabel.setText("Registra Los Datos De Tu Nueva Cuenta");
        titulo_Inicio_JLabel.setPreferredSize(new java.awt.Dimension(670, 48));

        informacion_Inicio_JLabel.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        informacion_Inicio_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informacion_Inicio_JLabel.setText("<html>\n\n<p style=\"text-align:center;\">\n\nA continuación te pediremos algunos datos personales que requerimos<br>\nde tu parte para que puedas acceder al sistema y puedas disfrutar de tu nueva<br> forma de aprendizaje.\nNo te preocupes,  no toma demasiado tiempo y<br>, sobre todo, tus datos no serán utilizados para un uso indebido.\n</p>\n\n</html>");
        informacion_Inicio_JLabel.setPreferredSize(new java.awt.Dimension(670, 104));

        continuar_Autenticacion_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Autenticacion_JButton.setToolTipText("<html> <h3>Continuar a la pestaña de autenticación</h3> </html>");
        continuar_Autenticacion_JButton.setBorder(null);
        continuar_Autenticacion_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar_Autenticacion_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuar_Autenticacion_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuar_Autenticacion_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuar_Autenticacion_JButtonMouseExited(evt);
            }
        });

        regresar_Inicio_Sesion_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_Inicio_Sesion_JButton.setToolTipText("<html> <h3>Regresar a la página de inicio de sesión</h3> </html>");
        regresar_Inicio_Sesion_JButton.setBorder(null);
        regresar_Inicio_Sesion_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Inicio_Sesion_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_Inicio_Sesion_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresar_Inicio_Sesion_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresar_Inicio_Sesion_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout inicio_JPanelLayout = new javax.swing.GroupLayout(inicio_JPanel);
        inicio_JPanel.setLayout(inicio_JPanelLayout);
        inicio_JPanelLayout.setHorizontalGroup(
            inicio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicio_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inicio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo_Inicio_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(inicio_JPanelLayout.createSequentialGroup()
                        .addComponent(regresar_Inicio_Sesion_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continuar_Autenticacion_JButton))
                    .addComponent(titulo_Inicio_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
                    .addComponent(informacion_Inicio_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        inicio_JPanelLayout.setVerticalGroup(
            inicio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicio_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_Inicio_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_Inicio_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(informacion_Inicio_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addGroup(inicio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Autenticacion_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Inicio_Sesion_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        visualizador_JTabbedPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/info_1.png")), inicio_JPanel, "<html> <h3>Página de inicio<br>para crear cuenta</h3> </html>"); // NOI18N

        autenticacion_JPanel.setBackground(new java.awt.Color(14, 30, 64));
        autenticacion_JPanel.setMinimumSize(new java.awt.Dimension(1260, 629));
        autenticacion_JPanel.setOpaque(false);

        logo_Autenticacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Autenticacion_JLabel.setMaximumSize(new java.awt.Dimension(150, 125));
        logo_Autenticacion_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_Autenticacion_JLabel.setPreferredSize(new java.awt.Dimension(150, 125));

        contrasena_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        contrasena_Autenticacion_JLabel.setText("Contraseña");

        Pass.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        Pass.setToolTipText("<html>  <h3>Contraseña </h3>  <ul>    <li>Debe contener mínimo 8 caráteres</li>    <li>Debe contener mínimo un carácter especial</li> \n<li>Debe contener mínimo un carácter en mayúscula</li><li>Debe contener mínimo un carácter numérico</li></ul>  </html>");
        Pass.setCaretColor(new java.awt.Color(104, 194, 232));
        Pass.setPreferredSize(new java.awt.Dimension(350, 43));

        titulo_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        titulo_Autenticacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Autenticacion_JLabel.setText("Registra Tus Credenciales Para Acceder Al Sistema");

        correo_Electronico_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        correo_Electronico_Autenticacion_JLabel.setText("Correo Electrónico");

        txtCorreo.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        txtCorreo.setToolTipText("");
        txtCorreo.setCaretColor(new java.awt.Color(104, 194, 232));
        txtCorreo.setPreferredSize(new java.awt.Dimension(350, 43));

        repetir_Contrasena_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        repetir_Contrasena_Autenticacion_JLabel.setText("Repetir Contraseña");

        Pass2.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        Pass2.setToolTipText("");
        Pass2.setCaretColor(new java.awt.Color(104, 194, 232));
        Pass2.setPreferredSize(new java.awt.Dimension(350, 43));

        informacion_Repetir_Contrasena_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        informacion_Repetir_Contrasena_Autenticacion_JLabel.setText("información de la repetición de la contraseña");
        informacion_Repetir_Contrasena_Autenticacion_JLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        informacion_Correo_Electronico_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        informacion_Correo_Electronico_Autenticacion_JLabel.setText("información sobre el correo electrónico");
        informacion_Correo_Electronico_Autenticacion_JLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        informacion_Contrasena_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        informacion_Contrasena_Autenticacion_JLabel.setText("Información de la seguridad de la contraseña");
        informacion_Contrasena_Autenticacion_JLabel.setToolTipText("Información de la seguridad de la contraseña");
        informacion_Contrasena_Autenticacion_JLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        regresar_Inicio_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_Inicio_JButton.setToolTipText("<html>\n<h3>Regresar a la pestaña de inicio</h3>\n</html>");
        regresar_Inicio_JButton.setBorder(null);
        regresar_Inicio_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Inicio_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_Inicio_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresar_Inicio_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresar_Inicio_JButtonMouseExited(evt);
            }
        });

        continuar_Datos_Personales_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Datos_Personales_JButton.setToolTipText("<html>\n<h3>Continuar a la pestaña de datos personales</h3>\n</html>");
        continuar_Datos_Personales_JButton.setBorder(null);
        continuar_Datos_Personales_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar_Datos_Personales_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuar_Datos_Personales_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuar_Datos_Personales_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuar_Datos_Personales_JButtonMouseExited(evt);
            }
        });
        continuar_Datos_Personales_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuar_Datos_Personales_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout autenticacion_JPanelLayout = new javax.swing.GroupLayout(autenticacion_JPanel);
        autenticacion_JPanel.setLayout(autenticacion_JPanelLayout);
        autenticacion_JPanelLayout.setHorizontalGroup(
            autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, autenticacion_JPanelLayout.createSequentialGroup()
                        .addComponent(regresar_Inicio_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continuar_Datos_Personales_JButton))
                    .addComponent(logo_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
                    .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(informacion_Correo_Electronico_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repetir_Contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                            .addComponent(correo_Electronico_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(informacion_Contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pass2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(informacion_Repetir_Contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        autenticacion_JPanelLayout.setVerticalGroup(
            autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_Autenticacion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_Autenticacion_JLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(correo_Electronico_Autenticacion_JLabel)
                .addGap(2, 2, 2)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacion_Correo_Electronico_Autenticacion_JLabel)
                .addGap(18, 18, 18)
                .addComponent(contrasena_Autenticacion_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacion_Contrasena_Autenticacion_JLabel)
                .addGap(18, 18, 18)
                .addComponent(repetir_Contrasena_Autenticacion_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacion_Repetir_Contrasena_Autenticacion_JLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Datos_Personales_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Inicio_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        visualizador_JTabbedPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/authentication.png")), autenticacion_JPanel, "<html> <h3>Página de autenticación<br>(Crear credenciales de acceso)</h3> </html>"); // NOI18N

        datos_Personales_JPanel.setBackground(new java.awt.Color(14, 30, 64));
        datos_Personales_JPanel.setMinimumSize(new java.awt.Dimension(1260, 629));
        datos_Personales_JPanel.setOpaque(false);

        logo_Datos_Personales_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Datos_Personales_JLabel.setMaximumSize(new java.awt.Dimension(150, 125));
        logo_Datos_Personales_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_Datos_Personales_JLabel.setPreferredSize(new java.awt.Dimension(150, 125));

        titulo_Datos_Personales_JLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        titulo_Datos_Personales_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Datos_Personales_JLabel.setText("Registra Tus Datos Personales");

        nombres_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        nombres_JLabel.setText("Nombre(s) *");

        nombres_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        nombres_JTextField.setToolTipText("<html>  <h3> Nombre(s) </h3>  <ul>    <li>Obligatorio</li> </ul>  </html>");
        nombres_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        nombres_JTextField.setPreferredSize(new java.awt.Dimension(427, 40));

        apellido_Paterno_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        apellido_Paterno_JLabel.setText("Apellido Paterno *");

        apellido_Paterno_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        apellido_Paterno_JTextField.setToolTipText("<html>  <h3> Apellido paterno </h3>  <ul>    <li>Obligatorio</li> </ul>  </html>");
        apellido_Paterno_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        apellido_Paterno_JTextField.setPreferredSize(new java.awt.Dimension(316, 40));

        localidad_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        localidad_JLabel.setText("Localidad");

        genero_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        genero_JTextField.setToolTipText("<html>  <h3> Identidad de género </h3>  <ul>    <li>Opcional</li> </ul>  </html>");
        genero_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        genero_JTextField.setPreferredSize(new java.awt.Dimension(350, 40));

        genero_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        genero_JLabel.setText("Género");

        fecha_Nacimiento_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        fecha_Nacimiento_JLabel.setText("Fecha De Nacimiento *");

        continuar_Perfil_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Perfil_JButton.setToolTipText("<html> <h3>Continuar a la pestaña de perfil</h3> </html>");
        continuar_Perfil_JButton.setBorder(null);
        continuar_Perfil_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar_Perfil_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuar_Perfil_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuar_Perfil_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuar_Perfil_JButtonMouseExited(evt);
            }
        });

        regresar_Autenticacion_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_Autenticacion_JButton.setToolTipText("<html> <h3>Regresar a la pestaña de autenticación</h3> </html>");
        regresar_Autenticacion_JButton.setBorder(null);
        regresar_Autenticacion_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Autenticacion_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_Autenticacion_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresar_Autenticacion_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresar_Autenticacion_JButtonMouseExited(evt);
            }
        });

        apellido_Materno_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        apellido_Materno_JLabel.setText("Apellido Materno");

        apellido_Materno_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        apellido_Materno_JTextField.setToolTipText("<html>  <h3> Apellido materno </h3> </html>");
        apellido_Materno_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        apellido_Materno_JTextField.setPreferredSize(new java.awt.Dimension(316, 40));

        fecha_Nacimiento_JPanel.setOpaque(false);
        fecha_Nacimiento_JPanel.setPreferredSize(new java.awt.Dimension(439, 40));

        javax.swing.GroupLayout fecha_Nacimiento_JPanelLayout = new javax.swing.GroupLayout(fecha_Nacimiento_JPanel);
        fecha_Nacimiento_JPanel.setLayout(fecha_Nacimiento_JPanelLayout);
        fecha_Nacimiento_JPanelLayout.setHorizontalGroup(
            fecha_Nacimiento_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        fecha_Nacimiento_JPanelLayout.setVerticalGroup(
            fecha_Nacimiento_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        estado_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        estado_JLabel.setText("Estado");

        estado_JComboBox.setToolTipText("<html>\n<h3>Estado mexicano, o bien del extranjero</h3>\n</html>");
        estado_JComboBox.setPreferredSize(new java.awt.Dimension(72, 40));

        localidad_JComboBox.setToolTipText("<html>\n<h3>Localidad del estado mexicano, o bien del extranjero</h3>\n</html>");
        localidad_JComboBox.setPreferredSize(new java.awt.Dimension(72, 40));

        javax.swing.GroupLayout datos_Personales_JPanelLayout = new javax.swing.GroupLayout(datos_Personales_JPanel);
        datos_Personales_JPanel.setLayout(datos_Personales_JPanelLayout);
        datos_Personales_JPanelLayout.setHorizontalGroup(
            datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(apellido_Materno_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apellido_Paterno_JTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                    .addComponent(apellido_Materno_JTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_Paterno_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombres_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombres_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fecha_Nacimiento_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fecha_Nacimiento_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genero_JTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                        .addComponent(genero_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(localidad_JComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(localidad_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estado_JComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estado_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(regresar_Autenticacion_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continuar_Perfil_JButton))
                    .addComponent(titulo_Datos_Personales_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo_Datos_Personales_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        datos_Personales_JPanelLayout.setVerticalGroup(
            datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_Datos_Personales_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_Datos_Personales_JLabel)
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(estado_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(nombres_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombres_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(localidad_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localidad_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(genero_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genero_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(apellido_Paterno_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellido_Paterno_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apellido_Materno_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellido_Materno_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(fecha_Nacimiento_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_Nacimiento_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 75, Short.MAX_VALUE)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Perfil_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Autenticacion_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        visualizador_JTabbedPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/personal-information.png")), datos_Personales_JPanel, "<html>\n<h3>Página de registro<br>\nde datos personales</h3>\n</html>"); // NOI18N

        perfil_JPanel.setBackground(new java.awt.Color(14, 30, 64));
        perfil_JPanel.setMinimumSize(new java.awt.Dimension(1260, 629));
        perfil_JPanel.setOpaque(false);
        perfil_JPanel.setPreferredSize(new java.awt.Dimension(1260, 629));

        logo_Perfil_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Perfil_JLabel.setMaximumSize(new java.awt.Dimension(150, 125));
        logo_Perfil_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(150, 125));

        titulo_Perfil_JLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        titulo_Perfil_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Perfil_JLabel.setText("Registra Tu Información De Perfil");
        titulo_Perfil_JLabel.setMaximumSize(new java.awt.Dimension(490, 41));
        titulo_Perfil_JLabel.setMinimumSize(new java.awt.Dimension(490, 41));
        titulo_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(490, 41));

        tipo_Perfil_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        tipo_Perfil_JLabel.setText("Perfil*");
        tipo_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(389, 25));

        tipo_Perfil_JComboBox.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        tipo_Perfil_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno", "Maestro" }));
        tipo_Perfil_JComboBox.setToolTipText("<html>  <h3> Tipo de perfil</h3></html>");
        tipo_Perfil_JComboBox.setBorder(null);
        tipo_Perfil_JComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipo_Perfil_JComboBox.setMaximumSize(new java.awt.Dimension(350, 40));
        tipo_Perfil_JComboBox.setPreferredSize(new java.awt.Dimension(320, 40));

        imagen_Perfil_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_Perfil_JLabel.setToolTipText("Imagen De Perfil Seleccionada.");
        imagen_Perfil_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagen_Perfil_JLabel.setName(""); // NOI18N
        imagen_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(400, 400));

        cargar_Imagen_Perfil_JButton.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        cargar_Imagen_Perfil_JButton.setText("Cargar Imagen De Perfil");
        cargar_Imagen_Perfil_JButton.setToolTipText("<html>Click Para Cargar Tu Foto De Perfil Desde Tu Ordenador.<br><b>NOTA: LA IMAGEN DE PERFIL TENDRÁ UNA RESOLUCIÓN DE 250x250 px.</b></html>");
        cargar_Imagen_Perfil_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cargar_Imagen_Perfil_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargar_Imagen_Perfil_JButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cargar_Imagen_Perfil_JButton.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        cargar_Imagen_Perfil_JButton.setPreferredSize(new java.awt.Dimension(320, 40));
        cargar_Imagen_Perfil_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargar_Imagen_Perfil_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cargar_Imagen_Perfil_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cargar_Imagen_Perfil_JButtonMouseExited(evt);
            }
        });

        continuar_Tablero_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/check.png"))); // NOI18N
        continuar_Tablero_JButton.setToolTipText("<html> <h3>Crear nueva cuenta</h3> </html>");
        continuar_Tablero_JButton.setBorder(null);
        continuar_Tablero_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar_Tablero_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuar_Tablero_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuar_Tablero_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuar_Tablero_JButtonMouseExited(evt);
            }
        });

        regresar_Datos_Personales_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_Datos_Personales_JButton.setToolTipText("<html> <h3>Regresar a la pestaña de datos personales</h3> </html>");
        regresar_Datos_Personales_JButton.setBorder(null);
        regresar_Datos_Personales_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Datos_Personales_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_Datos_Personales_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresar_Datos_Personales_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresar_Datos_Personales_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout perfil_JPanelLayout = new javax.swing.GroupLayout(perfil_JPanel);
        perfil_JPanel.setLayout(perfil_JPanelLayout);
        perfil_JPanelLayout.setHorizontalGroup(
            perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfil_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perfil_JPanelLayout.createSequentialGroup()
                        .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regresar_Datos_Personales_JButton)
                            .addGroup(perfil_JPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                                .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tipo_Perfil_JComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipo_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(cargar_Imagen_Perfil_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagen_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 188, Short.MAX_VALUE)
                        .addComponent(continuar_Tablero_JButton)
                        .addContainerGap())
                    .addGroup(perfil_JPanelLayout.createSequentialGroup()
                        .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo_Perfil_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titulo_Perfil_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))))
        );
        perfil_JPanelLayout.setVerticalGroup(
            perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfil_JPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(logo_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(titulo_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perfil_JPanelLayout.createSequentialGroup()
                        .addComponent(imagen_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfil_JPanelLayout.createSequentialGroup()
                        .addComponent(tipo_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_Perfil_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(cargar_Imagen_Perfil_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regresar_Datos_Personales_JButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfil_JPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(continuar_Tablero_JButton)))
                .addContainerGap())
        );

        visualizador_JTabbedPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/profile.png")), perfil_JPanel, "<html>\n<h3>Página de registro<br>\nde perfil</h3>\n</html>"); // NOI18N

        informacion_Extra_JPanel.setOpaque(false);

        javax.swing.GroupLayout informacion_Extra_JPanelLayout = new javax.swing.GroupLayout(informacion_Extra_JPanel);
        informacion_Extra_JPanel.setLayout(informacion_Extra_JPanelLayout);
        informacion_Extra_JPanelLayout.setHorizontalGroup(
            informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1199, Short.MAX_VALUE)
        );
        informacion_Extra_JPanelLayout.setVerticalGroup(
            informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        visualizador_JTabbedPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/programmer.png")), informacion_Extra_JPanel); // NOI18N

        add(visualizador_JTabbedPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void cargar_Imagen_Perfil_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_Imagen_Perfil_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            JFileChooser escogedor_Archivos = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos De Imagenes", "png", "jpg", "jpeg", "bmp");
            escogedor_Archivos.addChoosableFileFilter(filtro);
            escogedor_Archivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
            escogedor_Archivos.setAcceptAllFileFilterUsed(true);
            escogedor_Archivos.setApproveButtonText("Cargar Imagen De Perfil");
            int resultado = escogedor_Archivos.showOpenDialog(this);

            if (resultado == JFileChooser.APPROVE_OPTION) {
                File archivo_Abierto = escogedor_Archivos.getSelectedFile();

                try {
                    Image abrir_Imagen = ImageIO.read(archivo_Abierto);
                    int largo = imagen_Perfil_JLabel.getHeight();
                    abrir_Imagen = abrir_Imagen.getScaledInstance(largo,largo,Image.SCALE_SMOOTH);
                    ImageIcon icono = new ImageIcon(abrir_Imagen);
                    imagen_Perfil_JLabel.setIcon(icono);
                    abrir_Imagen.flush();

                } catch (IOException ex) {
                    
                }
            }

        }
    }//GEN-LAST:event_cargar_Imagen_Perfil_JButtonMouseClicked

    private void cargar_Imagen_Perfil_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_Imagen_Perfil_JButtonMouseEntered
        // TODO add your handling code here:
        cargar_Imagen_Perfil_JButton.setBackground(CourseRoom.Primer_Color());
        cargar_Imagen_Perfil_JButton.setForeground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_cargar_Imagen_Perfil_JButtonMouseEntered

    private void cargar_Imagen_Perfil_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_Imagen_Perfil_JButtonMouseExited
        // TODO add your handling code here:
        cargar_Imagen_Perfil_JButton.setBackground(CourseRoom.Segundo_Color());
        cargar_Imagen_Perfil_JButton.setForeground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_cargar_Imagen_Perfil_JButtonMouseExited

    private void continuar_Autenticacion_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Autenticacion_JButtonMouseEntered
        // TODO add your handling code here:
        continuar_Autenticacion_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_continuar_Autenticacion_JButtonMouseEntered

    private void continuar_Autenticacion_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Autenticacion_JButtonMouseExited
        // TODO add your handling code here:
        continuar_Autenticacion_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_continuar_Autenticacion_JButtonMouseExited

    private void continuar_Autenticacion_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Autenticacion_JButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_continuar_Autenticacion_JButtonMouseClicked

    private void regresar_Inicio_Sesion_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_Sesion_JButtonMouseClicked
        // TODO add your handling code here:
        
        if(SwingUtilities.isLeftMouseButton(evt)){
            CourseRoom_Frame.Mostrar_Inicio_Sesion();
        }
        
    }//GEN-LAST:event_regresar_Inicio_Sesion_JButtonMouseClicked

    private void regresar_Inicio_Sesion_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_Sesion_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Inicio_Sesion_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_regresar_Inicio_Sesion_JButtonMouseEntered

    private void regresar_Inicio_Sesion_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_Sesion_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Inicio_Sesion_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_regresar_Inicio_Sesion_JButtonMouseExited

    private void regresar_Inicio_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_JButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_regresar_Inicio_JButtonMouseClicked

    private void regresar_Inicio_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Inicio_JButton.setBackground(CourseRoom.Segundo_Color());
        
    }//GEN-LAST:event_regresar_Inicio_JButtonMouseEntered

    private void regresar_Inicio_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Inicio_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_regresar_Inicio_JButtonMouseExited

    private void continuar_Datos_Personales_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Datos_Personales_JButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_continuar_Datos_Personales_JButtonMouseClicked

    private void continuar_Datos_Personales_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Datos_Personales_JButtonMouseEntered
        // TODO add your handling code here:
        continuar_Datos_Personales_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_continuar_Datos_Personales_JButtonMouseEntered

    private void continuar_Datos_Personales_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Datos_Personales_JButtonMouseExited
        // TODO add your handling code here:
        continuar_Datos_Personales_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_continuar_Datos_Personales_JButtonMouseExited

    private void continuar_Perfil_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Perfil_JButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_continuar_Perfil_JButtonMouseClicked

    private void continuar_Perfil_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Perfil_JButtonMouseEntered
        // TODO add your handling code here:
        continuar_Perfil_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_continuar_Perfil_JButtonMouseEntered

    private void continuar_Perfil_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Perfil_JButtonMouseExited
        // TODO add your handling code here:
        continuar_Perfil_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_continuar_Perfil_JButtonMouseExited

    private void regresar_Autenticacion_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Autenticacion_JButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regresar_Autenticacion_JButtonMouseClicked

    private void regresar_Autenticacion_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Autenticacion_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Autenticacion_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_regresar_Autenticacion_JButtonMouseEntered

    private void regresar_Autenticacion_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Autenticacion_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Autenticacion_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_regresar_Autenticacion_JButtonMouseExited

    private void continuar_Tablero_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Tablero_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            CourseRoom_Frame.Mostrar_Tablero();
        }
    }//GEN-LAST:event_continuar_Tablero_JButtonMouseClicked

    private void continuar_Tablero_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Tablero_JButtonMouseEntered
        // TODO add your handling code here:
        continuar_Tablero_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_continuar_Tablero_JButtonMouseEntered

    private void continuar_Tablero_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Tablero_JButtonMouseExited
        // TODO add your handling code here:
        continuar_Tablero_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_continuar_Tablero_JButtonMouseExited

    private void regresar_Datos_Personales_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Datos_Personales_JButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regresar_Datos_Personales_JButtonMouseClicked

    private void regresar_Datos_Personales_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Datos_Personales_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Datos_Personales_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_regresar_Datos_Personales_JButtonMouseEntered

    private void regresar_Datos_Personales_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Datos_Personales_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Datos_Personales_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_regresar_Datos_Personales_JButtonMouseExited

    private void continuar_Datos_Personales_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuar_Datos_Personales_JButtonActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_continuar_Datos_Personales_JButtonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JPasswordField Pass2;
    private javax.swing.JLabel apellido_Materno_JLabel;
    private javax.swing.JTextField apellido_Materno_JTextField;
    private javax.swing.JLabel apellido_Paterno_JLabel;
    private javax.swing.JTextField apellido_Paterno_JTextField;
    private javax.swing.JPanel autenticacion_JPanel;
    private javax.swing.JButton cargar_Imagen_Perfil_JButton;
    private javax.swing.JButton continuar_Autenticacion_JButton;
    private javax.swing.JButton continuar_Datos_Personales_JButton;
    private javax.swing.JButton continuar_Perfil_JButton;
    private javax.swing.JButton continuar_Tablero_JButton;
    private javax.swing.JLabel contrasena_Autenticacion_JLabel;
    private javax.swing.JLabel correo_Electronico_Autenticacion_JLabel;
    private javax.swing.JPanel datos_Personales_JPanel;
    private javax.swing.JComboBox<String> estado_JComboBox;
    private javax.swing.JLabel estado_JLabel;
    private javax.swing.JLabel fecha_Nacimiento_JLabel;
    private javax.swing.JPanel fecha_Nacimiento_JPanel;
    private javax.swing.JLabel genero_JLabel;
    private javax.swing.JTextField genero_JTextField;
    private javax.swing.JLabel imagen_Perfil_JLabel;
    private javax.swing.JLabel informacion_Contrasena_Autenticacion_JLabel;
    private javax.swing.JLabel informacion_Correo_Electronico_Autenticacion_JLabel;
    private javax.swing.JPanel informacion_Extra_JPanel;
    private javax.swing.JLabel informacion_Inicio_JLabel;
    private javax.swing.JLabel informacion_Repetir_Contrasena_Autenticacion_JLabel;
    private javax.swing.JPanel inicio_JPanel;
    private javax.swing.JComboBox<String> localidad_JComboBox;
    private javax.swing.JLabel localidad_JLabel;
    private javax.swing.JLabel logo_Autenticacion_JLabel;
    private javax.swing.JLabel logo_Datos_Personales_JLabel;
    private javax.swing.JLabel logo_Inicio_JLabel;
    private javax.swing.JLabel logo_Perfil_JLabel;
    private javax.swing.JLabel nombres_JLabel;
    private javax.swing.JTextField nombres_JTextField;
    private javax.swing.JPanel perfil_JPanel;
    private javax.swing.JButton regresar_Autenticacion_JButton;
    private javax.swing.JButton regresar_Datos_Personales_JButton;
    private javax.swing.JButton regresar_Inicio_JButton;
    private javax.swing.JButton regresar_Inicio_Sesion_JButton;
    private javax.swing.JLabel repetir_Contrasena_Autenticacion_JLabel;
    private javax.swing.JComboBox<String> tipo_Perfil_JComboBox;
    private javax.swing.JLabel tipo_Perfil_JLabel;
    private javax.swing.JLabel titulo_Autenticacion_JLabel;
    private javax.swing.JLabel titulo_Datos_Personales_JLabel;
    private javax.swing.JLabel titulo_Inicio_JLabel;
    private javax.swing.JLabel titulo_Perfil_JLabel;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTabbedPane visualizador_JTabbedPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
          
        ImageIcon icono = new ImageIcon(CourseRoom.Logo_Imagen());
        logo_Inicio_JLabel.setIcon(icono);
        logo_Autenticacion_JLabel.setIcon(icono);
        logo_Datos_Personales_JLabel.setIcon(icono);
        logo_Perfil_JLabel.setIcon(icono);
        descripcion_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        visualizador_JTabbedPane.setForeground(CourseRoom.Segundo_Color());
        visualizador_JTabbedPane.setBackground(CourseRoom.Primer_Color());
        
        descripcion_JTextPane.setBackground(CourseRoom.Segundo_Color());
        descripcion_JTextPane.setForeground(CourseRoom.Primer_Color());
        descripcion_JTextPane.setCaretColor(CourseRoom.Primer_Color());
        
        descripcion_JScrollPane.setForeground(CourseRoom.Primer_Color());
        apellido_Paterno_JTextField.setBackground(CourseRoom.Segundo_Color());
        apellido_Paterno_JTextField.setForeground(CourseRoom.Primer_Color());
        apellido_Paterno_JTextField.setCaretColor(CourseRoom.Primer_Color());
        txtCorreo.setBackground(CourseRoom.Segundo_Color());
        txtCorreo.setForeground(CourseRoom.Primer_Color());
        txtCorreo.setCaretColor(CourseRoom.Primer_Color());
        genero_JTextField.setBackground(CourseRoom.Segundo_Color());
        genero_JTextField.setForeground(CourseRoom.Primer_Color());
        genero_JTextField.setCaretColor(CourseRoom.Primer_Color());
        localidad_JTextField.setBackground(CourseRoom.Segundo_Color());
        localidad_JTextField.setForeground(CourseRoom.Primer_Color());
        nombres_JTextField.setBackground(CourseRoom.Segundo_Color());
        nombres_JTextField.setForeground(CourseRoom.Primer_Color());
        nombres_JTextField.setCaretColor(CourseRoom.Primer_Color());
        Pass.setBackground(CourseRoom.Segundo_Color());
        Pass.setForeground(CourseRoom.Primer_Color());
        Pass.setCaretColor(CourseRoom.Primer_Color());
        Pass2.setBackground(CourseRoom.Segundo_Color());
        Pass2.setForeground(CourseRoom.Primer_Color());
        Pass2.setCaretColor(CourseRoom.Primer_Color());
        cargar_Imagen_Perfil_JButton.setBackground(CourseRoom.Segundo_Color());
        cargar_Imagen_Perfil_JButton.setForeground(CourseRoom.Primer_Color());
        tipo_Perfil_JComboBox.setBackground(CourseRoom.Segundo_Color());
        tipo_Perfil_JComboBox.setForeground(CourseRoom.Primer_Color());
        fecha_Nacimiento_JFormattedTextField.setBackground(CourseRoom.Segundo_Color());
        fecha_Nacimiento_JFormattedTextField.setForeground(CourseRoom.Primer_Color());
        fecha_Nacimiento_JFormattedTextField.setCaretColor(CourseRoom.Primer_Color());
        apellido_Paterno_JLabel.setForeground(CourseRoom.Segundo_Color());
        correo_Electronico_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        descripcion_JLabel.setForeground(CourseRoom.Segundo_Color());
        fecha_Nacimiento_JLabel.setForeground(CourseRoom.Segundo_Color());
        genero_JLabel.setForeground(CourseRoom.Segundo_Color());
        imagen_Perfil_JLabel.setForeground(CourseRoom.Segundo_Color());
        informacion_Correo_Electronico_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        informacion_Inicio_JLabel.setForeground(CourseRoom.Segundo_Color());
        informacion_Repetir_Contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        informacion_Contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        localidad_JLabel.setForeground(CourseRoom.Segundo_Color());
        logo_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        logo_Datos_Personales_JLabel.setForeground(CourseRoom.Segundo_Color());
        logo_Inicio_JLabel.setForeground(CourseRoom.Segundo_Color());
        logo_Perfil_JLabel.setForeground(CourseRoom.Segundo_Color());
        nombres_JLabel.setForeground(CourseRoom.Segundo_Color());
        contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        tipo_Perfil_JLabel.setForeground(CourseRoom.Segundo_Color());
        repetir_Contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        titulo_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        titulo_Datos_Personales_JLabel.setForeground(CourseRoom.Segundo_Color());
        titulo_Inicio_JLabel.setForeground(CourseRoom.Segundo_Color());
        titulo_Perfil_JLabel.setForeground(CourseRoom.Segundo_Color());

        continuar_Autenticacion_JButton.setBackground(CourseRoom.Primer_Color());
        continuar_Tablero_JButton.setBackground(CourseRoom.Primer_Color());
        continuar_Datos_Personales_JButton.setBackground(CourseRoom.Primer_Color());
        continuar_Perfil_JButton.setBackground(CourseRoom.Primer_Color());
        regresar_Autenticacion_JButton.setBackground(CourseRoom.Primer_Color());
        regresar_Datos_Personales_JButton.setBackground(CourseRoom.Primer_Color());
        regresar_Inicio_JButton.setBackground(CourseRoom.Primer_Color());
        regresar_Inicio_Sesion_JButton.setBackground(CourseRoom.Primer_Color());
    }
 

public boolean validar_Correo(String correo)
{
    Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z]{3})((\\.[A-Za-z]{2}))?$");  
    Matcher mat = pat.matcher(correo);
    if (mat.find())
    {         
        //System.out.println("Si we. Correo Ingresado BIEN:" + "*** "  +correo + " ***\n\n");
        checar_Correo();
    }else
    {
        JOptionPane.showMessageDialog(null, "El Correo\n'" +correo+ "'\nNo Es Valido");
        txtCorreo.setText("");
        txtCorreo.requestFocus();
                }
    return mat.find();
}

public void checar_Correo()
{
    String sql = "select correo from usuarios where correo =?";
    try
    {
        pst = conn.prepareStatement(sql);
        pst.setString(1, txtCorreo.getText().trim());
        rs = pst.executeQuery();
        if (rs.next())
        {
            JOptionPane.showMessageDialog(null, "El Correo Ingresado Ya Existe!!!");
            txtCorreo.setText("");
            txtCorreo.requestFocus();
        }
        else
        {
            
            verificar_Campos();
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
public void verificar_Campos(){
  
    String Password = String.valueOf(Pass.getPassword());
    String Password2 = String.valueOf(Pass2.getPassword());
    
    // Checa Los Campos Vacíos.
    if (txtCorreo.getText().equals("") 
            || Password.equals("")  ||  Password2.equals("")){
        // Si Los Campos No Estan Vacíos Manda Mensaje De Error.
        JOptionPane.showMessageDialog(this, "No Se Permiten Campos Vacios !!!", "Error de Contenido", WIDTH);
    
    } else {
        // Checa Si Las Dos Contraseñas Son Iguales.
        if (Password.equals(Password2)) {
            // Si Todo Esta Bien Llamamos A La Función "Agregar Usuarios".
            agregar_Usuarios();
        } else {
            
            // Si Las Dos Contraseñas No Son Iguales Manda Mensaje De Error.
            JOptionPane.showMessageDialog(this, "Contraseñas Distintas Revisa!!!", "NO", WIDTH);
        }
    }
}
    
public void agregar_Usuarios(){
        
        String pass = String.valueOf(Pass.getPassword());
        String sql = "INSERT INTO usuarios (id_usuario,nom_usuario,pass,correo,status) VALUES (null,?,?,?,'Active')";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(2, pass);
            pst.setString(3, txtCorreo.getText());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso!!!,"
                    + "Tu Cuenta Ha Sido Creada");
            limpiar_Datos();
            CourseRoom_Frame.Mostrar_Inicio_Sesion();
            
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error En El Registro!!!");
            con.Desconectar();
        }
    }

    private void limpiar_Datos(){
        Pass.setText("");
        txtCorreo.setText("");
        Pass2.setText("");
    }
}
