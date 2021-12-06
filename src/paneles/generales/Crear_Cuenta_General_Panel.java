package paneles.generales;

import ConexionSql.Conexion;
import interfaces.Componentes_Interface;
import main.CourseRoom;
import main.CourseRoom_Frame;
import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        nombre_Usuario_Autenticacion_JLabel = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        contrasena_Autenticacion_JLabel = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        titulo_Autenticacion_JLabel = new javax.swing.JLabel();
        correo_Electronico_Autenticacion_JLabel = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        repetir_Contrasena_Autenticacion_JLabel = new javax.swing.JLabel();
        Pass2 = new javax.swing.JPasswordField();
        informacion_Nombre_Usuario_Autenticacion_JLabel = new javax.swing.JLabel();
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
        apellidos_JLabel = new javax.swing.JLabel();
        apellidos_JTextField = new javax.swing.JTextField();
        localidad_JTextField = new javax.swing.JTextField();
        localidad_JLabel = new javax.swing.JLabel();
        genero_JTextField = new javax.swing.JTextField();
        genero_JLabel = new javax.swing.JLabel();
        telefono_JFormattedTextField = new javax.swing.JFormattedTextField();
        telefono_JLabel = new javax.swing.JLabel();
        fecha_Nacimiento_JFormattedTextField = new javax.swing.JFormattedTextField();
        fecha_Nacimiento_JLabel = new javax.swing.JLabel();
        descripcion_JLabel = new javax.swing.JLabel();
        continuar_Perfil_JButton = new javax.swing.JButton();
        regresar_Autenticacion_JButton = new javax.swing.JButton();
        descripcion_JScrollPane = new javax.swing.JScrollPane();
        descripcion_JTextPane = new javax.swing.JTextPane();
        perfil_JPanel = new javax.swing.JPanel();
        logo_Perfil_JLabel = new javax.swing.JLabel();
        titulo_Perfil_JLabel = new javax.swing.JLabel();
        tipo_Perfil_JLabel = new javax.swing.JLabel();
        tipo_Perfil_JComboBox = new javax.swing.JComboBox<>();
        imagen_Perfil_JLabel = new javax.swing.JLabel();
        cargar_Imagen_Perfil_JButton = new javax.swing.JButton();
        continuar_Tablero_JButton = new javax.swing.JButton();
        regresar_Datos_Personales_JButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1260, 670));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1260, 670));
        setLayout(new java.awt.CardLayout());

        visualizador_JTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        visualizador_JTabbedPane.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        visualizador_JTabbedPane.setMinimumSize(new java.awt.Dimension(1024, 700));
        visualizador_JTabbedPane.setPreferredSize(new java.awt.Dimension(1024, 700));
        visualizador_JTabbedPane.setRequestFocusEnabled(false);

        inicio_JPanel.setBackground(new java.awt.Color(14, 30, 64));
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
        informacion_Inicio_JLabel.setText("<html>\n\n<p style=\"text-align:center;\">\n\nA continuación, te pediremos algunos datos que requerimos<br>\nde tu parte para que puedas acceder y tener una cuenta de<br>\nacceso al sistema. No te preocupes,  no toma demasiado<br>\ntiempo y, sobre todo, tus datos están<br>\nseguros con nosotros.\n\n</p>\n\n</html>");
        informacion_Inicio_JLabel.setPreferredSize(new java.awt.Dimension(670, 104));

        continuar_Autenticacion_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Autenticacion_JButton.setToolTipText("Continuar A Autenticación");
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
        regresar_Inicio_Sesion_JButton.setToolTipText("Regresar Al Login");
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
                    .addComponent(titulo_Inicio_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(inicio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Autenticacion_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Inicio_Sesion_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        visualizador_JTabbedPane.addTab(" Inicio ", new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/info_1.png")), inicio_JPanel, "Muestra El Inicio Del Registro De Tu Cuenta."); // NOI18N

        autenticacion_JPanel.setBackground(new java.awt.Color(14, 30, 64));
        autenticacion_JPanel.setMinimumSize(new java.awt.Dimension(1260, 629));
        autenticacion_JPanel.setOpaque(false);

        logo_Autenticacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Autenticacion_JLabel.setMaximumSize(new java.awt.Dimension(150, 125));
        logo_Autenticacion_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_Autenticacion_JLabel.setPreferredSize(new java.awt.Dimension(150, 125));

        nombre_Usuario_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        nombre_Usuario_Autenticacion_JLabel.setText("Nombre De Usuario");

        txtUsuario.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        txtUsuario.setToolTipText("<html>\n\n<p>\n\nIngrese aquí el nombre de usuario de su elección. Sin embargo, tome las siguientes medidas:<br>\n<b>\n   * El nombre de usuario puede contener letras, números y carácteres con valor ascii entre 32 y 126.<br>\n   * Sólamente se permite un máximo de 20 carácteres.\n\n</b>\n\n</p>\n\n</html>");
        txtUsuario.setCaretColor(new java.awt.Color(104, 194, 232));
        txtUsuario.setPreferredSize(new java.awt.Dimension(350, 32));

        contrasena_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        contrasena_Autenticacion_JLabel.setText("Contraseña");

        Pass.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        Pass.setToolTipText("Ingrese Aquí Su Contraseña (Mínimo 8 Carácteres)");
        Pass.setCaretColor(new java.awt.Color(104, 194, 232));
        Pass.setPreferredSize(new java.awt.Dimension(350, 32));

        titulo_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        titulo_Autenticacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Autenticacion_JLabel.setText("Registra Tus Credenciales Para Acceder Al Sistema");

        correo_Electronico_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        correo_Electronico_Autenticacion_JLabel.setText("Correo Electrónico");

        txtCorreo.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        txtCorreo.setToolTipText("Ingrese Aquí Su Correo Electrónico (Ingrese Uno Que Pueda Utilizar)");
        txtCorreo.setCaretColor(new java.awt.Color(104, 194, 232));
        txtCorreo.setPreferredSize(new java.awt.Dimension(350, 32));

        repetir_Contrasena_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        repetir_Contrasena_Autenticacion_JLabel.setText("Repetir Contraseña");

        Pass2.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        Pass2.setToolTipText("Re-Ingrese Aquí La Contraseña");
        Pass2.setCaretColor(new java.awt.Color(104, 194, 232));
        Pass2.setPreferredSize(new java.awt.Dimension(350, 32));

        informacion_Nombre_Usuario_Autenticacion_JLabel.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        informacion_Nombre_Usuario_Autenticacion_JLabel.setText("información sobre el nombre de usuario");
        informacion_Nombre_Usuario_Autenticacion_JLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
        regresar_Inicio_JButton.setToolTipText("Regresar Al Inicio");
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
        continuar_Datos_Personales_JButton.setToolTipText("Continuar A Datos Personales");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, autenticacion_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar_Inicio_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuar_Datos_Personales_JButton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, autenticacion_JPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_Usuario_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addComponent(informacion_Nombre_Usuario_Autenticacion_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informacion_Contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addComponent(contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(informacion_Correo_Electronico_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correo_Electronico_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(repetir_Contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informacion_Repetir_Contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pass2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        autenticacion_JPanelLayout.setVerticalGroup(
            autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_Autenticacion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_Autenticacion_JLabel)
                .addGap(18, 58, Short.MAX_VALUE)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_Usuario_Autenticacion_JLabel)
                    .addComponent(contrasena_Autenticacion_JLabel))
                .addGap(2, 2, 2)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(Pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(informacion_Nombre_Usuario_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informacion_Contrasena_Autenticacion_JLabel))
                .addGap(75, 75, 75)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                        .addComponent(correo_Electronico_Autenticacion_JLabel)
                        .addGap(2, 2, 2))
                    .addComponent(repetir_Contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Pass2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(informacion_Correo_Electronico_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informacion_Repetir_Contrasena_Autenticacion_JLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Datos_Personales_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Inicio_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        visualizador_JTabbedPane.addTab(" Autenticación ", new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/authentication.png")), autenticacion_JPanel, "Pestaña Sobre Creación De Credenciales Para Acceder Al Sistema."); // NOI18N

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
        nombres_JLabel.setText("Nombre(s)*");

        nombres_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        nombres_JTextField.setToolTipText("<html>Ingresa Aquí Tu(s) Nombre(s).<br><b>NOTA: ES UN CAMPO OBLIGATORIO.</b></html>");
        nombres_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        nombres_JTextField.setPreferredSize(new java.awt.Dimension(350, 32));

        apellidos_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        apellidos_JLabel.setText("Apellido(s)*");

        apellidos_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        apellidos_JTextField.setToolTipText("<html>Ingresa Aquí Tu(s) Apellido(s).<br><b>NOTA: ES UN CAMPO OBLIGATORIO.</b></html>");
        apellidos_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        apellidos_JTextField.setPreferredSize(new java.awt.Dimension(350, 32));

        localidad_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        localidad_JTextField.setToolTipText("Ingresa Tu Localidad En Este Campo.");
        localidad_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        localidad_JTextField.setPreferredSize(new java.awt.Dimension(350, 32));

        localidad_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        localidad_JLabel.setText("Localidad");

        genero_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        genero_JTextField.setToolTipText("Ingresa Aquí Tu Género, Sexo O Identidad De Género.");
        genero_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        genero_JTextField.setPreferredSize(new java.awt.Dimension(350, 32));

        genero_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        genero_JLabel.setText("Género");

        telefono_JFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));
        telefono_JFormattedTextField.setToolTipText("<html>Ingresa Aquí Tu Número De Teléfono O Celular.<br><b>NOTA: SOLAMENTE SE PERMITEN INGRESAR VALORES NUMÉRICOS.</b></html>");
        telefono_JFormattedTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        telefono_JFormattedTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        telefono_JFormattedTextField.setPreferredSize(new java.awt.Dimension(350, 32));

        telefono_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        telefono_JLabel.setText("Número De Teléfono O Celular");

        fecha_Nacimiento_JFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-mm-yyyy"))));
        fecha_Nacimiento_JFormattedTextField.setToolTipText("<html>Ingresa Aquí Tu Fecha De Nacimiento.<br><b>NOTA: ES UN CAMPO OBLIGATORIO.<br>ADEMÁS, DEBERÁS INGRESAR LA FECHA CON EL SIGUIENTE FORMATO: dd-mm-aaaa<br>d: dia, m: mes, a: año.</b>.</html>");
        fecha_Nacimiento_JFormattedTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        fecha_Nacimiento_JFormattedTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        fecha_Nacimiento_JFormattedTextField.setPreferredSize(new java.awt.Dimension(350, 32));

        fecha_Nacimiento_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        fecha_Nacimiento_JLabel.setText("Fecha De Nacimiento (dd-mm-aaaa)*");

        descripcion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        descripcion_JLabel.setText("Descripción");

        continuar_Perfil_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Perfil_JButton.setToolTipText("Continuar A Perfil");
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
        regresar_Autenticacion_JButton.setToolTipText("Regresar A Autenticación");
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

        descripcion_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        descripcion_JScrollPane.setViewportView(descripcion_JTextPane);

        javax.swing.GroupLayout datos_Personales_JPanelLayout = new javax.swing.GroupLayout(datos_Personales_JPanel);
        datos_Personales_JPanel.setLayout(datos_Personales_JPanelLayout);
        datos_Personales_JPanelLayout.setHorizontalGroup(
            datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar_Autenticacion_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuar_Perfil_JButton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datos_Personales_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo_Datos_Personales_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo_Datos_Personales_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datos_Personales_JPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombres_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(nombres_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidos_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                            .addComponent(apellidos_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telefono_JFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(telefono_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))
                    .addComponent(descripcion_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, datos_Personales_JPanelLayout.createSequentialGroup()
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fecha_Nacimiento_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fecha_Nacimiento_JFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(genero_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(genero_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(localidad_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localidad_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(45, 45, 45))
        );
        datos_Personales_JPanelLayout.setVerticalGroup(
            datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_Datos_Personales_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_Datos_Personales_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datos_Personales_JPanelLayout.createSequentialGroup()
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombres_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellidos_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombres_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(apellidos_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(telefono_JLabel)
                        .addGap(0, 0, 0)
                        .addComponent(telefono_JFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_Nacimiento_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(genero_JLabel)
                        .addComponent(localidad_JLabel)))
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(localidad_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha_Nacimiento_JFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(genero_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(descripcion_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Perfil_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Autenticacion_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        visualizador_JTabbedPane.addTab(" Datos Personales ", new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/personal-information.png")), datos_Personales_JPanel, "Pestaña Sobre Datos Personales."); // NOI18N

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
        tipo_Perfil_JComboBox.setToolTipText("<html>Aquí Puedes Seleccionar Tu Perfil De Las Posibles.<br><b>NOTA: ES UN CAMPO OBLIGATORIO.</b></html>");
        tipo_Perfil_JComboBox.setBorder(null);
        tipo_Perfil_JComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipo_Perfil_JComboBox.setMaximumSize(new java.awt.Dimension(350, 40));
        tipo_Perfil_JComboBox.setPreferredSize(new java.awt.Dimension(320, 40));

        imagen_Perfil_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_Perfil_JLabel.setToolTipText("Imagen De Perfil Seleccionada.");
        imagen_Perfil_JLabel.setMinimumSize(new java.awt.Dimension(0, 0));
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

        continuar_Tablero_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Tablero_JButton.setToolTipText("Crear Perfil");
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
        regresar_Datos_Personales_JButton.setToolTipText("Regresar A Datos Personales");
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                                .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tipo_Perfil_JComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipo_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(cargar_Imagen_Perfil_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(imagen_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 191, Short.MAX_VALUE)
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
                        .addGap(0, 27, Short.MAX_VALUE))
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

        visualizador_JTabbedPane.addTab(" Perfil ", new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/profile.png")), perfil_JPanel, "Pestaña Sobre Información Del Perfil."); // NOI18N

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
        checar_Usuario();
    }//GEN-LAST:event_continuar_Datos_Personales_JButtonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JPasswordField Pass2;
    private javax.swing.JLabel apellidos_JLabel;
    private javax.swing.JTextField apellidos_JTextField;
    private javax.swing.JPanel autenticacion_JPanel;
    private javax.swing.JButton cargar_Imagen_Perfil_JButton;
    private javax.swing.JButton continuar_Autenticacion_JButton;
    private javax.swing.JButton continuar_Datos_Personales_JButton;
    private javax.swing.JButton continuar_Perfil_JButton;
    private javax.swing.JButton continuar_Tablero_JButton;
    private javax.swing.JLabel contrasena_Autenticacion_JLabel;
    private javax.swing.JLabel correo_Electronico_Autenticacion_JLabel;
    private javax.swing.JPanel datos_Personales_JPanel;
    private javax.swing.JLabel descripcion_JLabel;
    private javax.swing.JScrollPane descripcion_JScrollPane;
    private javax.swing.JTextPane descripcion_JTextPane;
    private javax.swing.JFormattedTextField fecha_Nacimiento_JFormattedTextField;
    private javax.swing.JLabel fecha_Nacimiento_JLabel;
    private javax.swing.JLabel genero_JLabel;
    private javax.swing.JTextField genero_JTextField;
    private javax.swing.JLabel imagen_Perfil_JLabel;
    private javax.swing.JLabel informacion_Contrasena_Autenticacion_JLabel;
    private javax.swing.JLabel informacion_Correo_Electronico_Autenticacion_JLabel;
    private javax.swing.JLabel informacion_Inicio_JLabel;
    private javax.swing.JLabel informacion_Nombre_Usuario_Autenticacion_JLabel;
    private javax.swing.JLabel informacion_Repetir_Contrasena_Autenticacion_JLabel;
    private javax.swing.JPanel inicio_JPanel;
    private javax.swing.JLabel localidad_JLabel;
    private javax.swing.JTextField localidad_JTextField;
    private javax.swing.JLabel logo_Autenticacion_JLabel;
    private javax.swing.JLabel logo_Datos_Personales_JLabel;
    private javax.swing.JLabel logo_Inicio_JLabel;
    private javax.swing.JLabel logo_Perfil_JLabel;
    private javax.swing.JLabel nombre_Usuario_Autenticacion_JLabel;
    private javax.swing.JLabel nombres_JLabel;
    private javax.swing.JTextField nombres_JTextField;
    private javax.swing.JPanel perfil_JPanel;
    private javax.swing.JButton regresar_Autenticacion_JButton;
    private javax.swing.JButton regresar_Datos_Personales_JButton;
    private javax.swing.JButton regresar_Inicio_JButton;
    private javax.swing.JButton regresar_Inicio_Sesion_JButton;
    private javax.swing.JLabel repetir_Contrasena_Autenticacion_JLabel;
    private javax.swing.JFormattedTextField telefono_JFormattedTextField;
    private javax.swing.JLabel telefono_JLabel;
    private javax.swing.JComboBox<String> tipo_Perfil_JComboBox;
    private javax.swing.JLabel tipo_Perfil_JLabel;
    private javax.swing.JLabel titulo_Autenticacion_JLabel;
    private javax.swing.JLabel titulo_Datos_Personales_JLabel;
    private javax.swing.JLabel titulo_Inicio_JLabel;
    private javax.swing.JLabel titulo_Perfil_JLabel;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtUsuario;
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
        apellidos_JTextField.setBackground(CourseRoom.Segundo_Color());
        apellidos_JTextField.setForeground(CourseRoom.Primer_Color());
        apellidos_JTextField.setCaretColor(CourseRoom.Primer_Color());
        txtCorreo.setBackground(CourseRoom.Segundo_Color());
        txtCorreo.setForeground(CourseRoom.Primer_Color());
        txtCorreo.setCaretColor(CourseRoom.Primer_Color());
        genero_JTextField.setBackground(CourseRoom.Segundo_Color());
        genero_JTextField.setForeground(CourseRoom.Primer_Color());
        genero_JTextField.setCaretColor(CourseRoom.Primer_Color());
        localidad_JTextField.setBackground(CourseRoom.Segundo_Color());
        localidad_JTextField.setForeground(CourseRoom.Primer_Color());
        localidad_JTextField.setCaretColor(CourseRoom.Primer_Color());
        txtUsuario.setBackground(CourseRoom.Segundo_Color());
        txtUsuario.setForeground(CourseRoom.Primer_Color());
        txtUsuario.setCaretColor(CourseRoom.Primer_Color());
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
        telefono_JFormattedTextField.setBackground(CourseRoom.Segundo_Color());
        telefono_JFormattedTextField.setForeground(CourseRoom.Primer_Color());
        telefono_JFormattedTextField.setCaretColor(CourseRoom.Primer_Color());
        apellidos_JLabel.setForeground(CourseRoom.Segundo_Color());
        correo_Electronico_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        descripcion_JLabel.setForeground(CourseRoom.Segundo_Color());
        fecha_Nacimiento_JLabel.setForeground(CourseRoom.Segundo_Color());
        genero_JLabel.setForeground(CourseRoom.Segundo_Color());
        //imagen_Perfil_JLabel.setForeground(CourseRoom.Segundo_Color());
        informacion_Correo_Electronico_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        informacion_Inicio_JLabel.setForeground(CourseRoom.Segundo_Color());
        informacion_Nombre_Usuario_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        informacion_Repetir_Contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        informacion_Contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        localidad_JLabel.setForeground(CourseRoom.Segundo_Color());
        logo_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        logo_Datos_Personales_JLabel.setForeground(CourseRoom.Segundo_Color());
        logo_Inicio_JLabel.setForeground(CourseRoom.Segundo_Color());
        logo_Perfil_JLabel.setForeground(CourseRoom.Segundo_Color());
        nombre_Usuario_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        nombres_JLabel.setForeground(CourseRoom.Segundo_Color());
        contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        tipo_Perfil_JLabel.setForeground(CourseRoom.Segundo_Color());
        repetir_Contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Segundo_Color());
        telefono_JLabel.setForeground(CourseRoom.Segundo_Color());
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
    
    public void checar_Usuario()
{
    String sql = "select nom_usuario from usuarios where nom_usuario =?";
    try
    {
        pst = conn.prepareStatement(sql);
        pst.setString(1, txtUsuario.getText().trim());
        rs = pst.executeQuery();
        if (rs.next())
        {
            JOptionPane.showMessageDialog(null, "El Nombre De Usuario Ya Existe!!!");
            txtUsuario.setText("");
            txtUsuario.requestFocus();
        }
        else
        {
            validar_Correo(txtCorreo.getText().trim());
            //checkCorreo();
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}

public boolean validar_Correo(String correo)
{
    boolean resultado;
    Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z]{3})((\\.[A-Za-z]{2}))?$");  
    Matcher mat = pat.matcher(correo);
    if (mat.find())
    {         
        //System.out.println("Si we. Correo Ingresado BIEN:" + "*** "  +correo + " ***\n\n");
        checar_Correo();
        resultado = true;
    }else
    {
        JOptionPane.showMessageDialog(null, "El Correo\n'" +correo+ "'\nNo Es Valido");
        txtCorreo.setText("");
        txtCorreo.requestFocus();
                    //System.out.println("No we. Correo Ingresado MAL:" + "*** "  +correo+ " ***\n\n");
        resultado = false;
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
    if (txtUsuario.getText().equals("") ||  txtCorreo.getText().equals("") 
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
            pst.setString(1, txtUsuario.getText());
            pst.setString(2, pass);
            pst.setString(3, txtCorreo.getText());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso!!!,"
                    + "Tu Cuenta Ha Sido Creada");
            limpiar_Datos();
            CourseRoom_Frame.Mostrar_Inicio_Sesion();
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error En El Registro!!!");
            con.Desconectar();
        }
    }

    private void limpiar_Datos(){
        txtUsuario.setText("");
        Pass.setText("");
        txtCorreo.setText("");
        Pass2.setText("");
    }
}
