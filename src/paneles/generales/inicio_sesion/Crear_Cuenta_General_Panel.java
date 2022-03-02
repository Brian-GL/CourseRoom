package paneles.generales.inicio_sesion;

import javax.swing.JLayeredPane;
import clases.Celda_Renderer;
import clases.Escogedor_Archivos;
import com.github.lgooddatepicker.components.DatePickerSettings;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import datos.interfaces.Validaciones_Interface;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import courseroom.CourseRoom;
import courseroom.CourseRoom_Frame;
import java.util.Locale;

public class Crear_Cuenta_General_Panel extends JLayeredPane implements Componentes_Interface, Limpieza_Interface, Validaciones_Interface{

    /**
     * Creates new form Crear_Cuenta_Panel
     */
    public Crear_Cuenta_General_Panel() {
        initComponents();
        
        Iniciar_Componentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio_JPanel = new javax.swing.JPanel();
        logo_Inicio_JLabel = new javax.swing.JLabel();
        titulo_Inicio_JLabel = new javax.swing.JLabel();
        informacion_Inicio_JLabel = new javax.swing.JLabel();
        continuar_Autenticacion_JButton = new javax.swing.JButton();
        regresar_Inicio_Sesion_JButton = new javax.swing.JButton();
        autenticacion_JPanel = new javax.swing.JPanel();
        logo_Autenticacion_JLabel = new javax.swing.JLabel();
        contrasena_Autenticacion_JLabel = new javax.swing.JLabel();
        contrasenia_Autenticacion_JPasswordField = new javax.swing.JPasswordField();
        titulo_Autenticacion_JLabel = new javax.swing.JLabel();
        correo_Electronico_Autenticacion_JLabel = new javax.swing.JLabel();
        correo_JTextField = new javax.swing.JTextField();
        repetir_Contrasena_Autenticacion_JLabel = new javax.swing.JLabel();
        repetir_Contrasenia_JTextField = new javax.swing.JPasswordField();
        regresar_Inicio_JButton = new javax.swing.JButton();
        continuar_Datos_Personales_JButton = new javax.swing.JButton();
        mostrar_Contrasena_JCheckBox = new javax.swing.JCheckBox();
        mostrar_Repetir_Contrasena_JCheckBox = new javax.swing.JCheckBox();
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
        estado_JLabel = new javax.swing.JLabel();
        estado_AutoCompletionComboBox = new com.jidesoft.swing.AutoCompletionComboBox();
        localidad_AutoCompletionComboBox = new com.jidesoft.swing.AutoCompletionComboBox();
        fecha_Nacimiento_DatePicker = new com.github.lgooddatepicker.components.DatePicker();
        perfil_JPanel = new javax.swing.JPanel();
        logo_Perfil_JLabel = new javax.swing.JLabel();
        titulo_Perfil_JLabel = new javax.swing.JLabel();
        tipo_Perfil_JLabel = new javax.swing.JLabel();
        tipo_Perfil_JComboBox = new javax.swing.JComboBox<>();
        imagen_Perfil_JLabel = new javax.swing.JLabel();
        cargar_Imagen_Perfil_JButton = new javax.swing.JButton();
        regresar_Datos_Personales_JButton = new javax.swing.JButton();
        continuar_Informacion_Extra_JButton = new javax.swing.JButton();
        informacion_Extra_JPanel = new javax.swing.JPanel();
        crear_Cuenta_JButton = new javax.swing.JButton();
        logo_Informacion_Extra_JLabel = new javax.swing.JLabel();
        titulo_Informacion_Extra_JLabel = new javax.swing.JLabel();
        regresar_Perfil_JButton = new javax.swing.JButton();
        promedio_General_JLabel = new javax.swing.JLabel();
        promedio_General_JFormattedTextField = new javax.swing.JFormattedTextField();
        descripcion_JLabel = new javax.swing.JLabel();
        descripcion_JScrollPane = new javax.swing.JScrollPane();
        descripcion_JTextPane = new javax.swing.JTextPane();
        interes_Tematica_JLabel = new javax.swing.JLabel();
        agregar_Interes_Tematica_JButton = new javax.swing.JButton();
        intereses_Tematicas_AutoCompletionComboBox = new com.jidesoft.swing.AutoCompletionComboBox();
        intereses_Tematicas_JScrollPane = new javax.swing.JScrollPane();
        intereses_Tematicas_JTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1260, 670));
        setLayout(new java.awt.CardLayout());

        inicio_JPanel.setOpaque(false);

        logo_Inicio_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Inicio_JLabel.setMaximumSize(new java.awt.Dimension(150, 125));
        logo_Inicio_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_Inicio_JLabel.setPreferredSize(new java.awt.Dimension(150, 125));

        titulo_Inicio_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Inicio_JLabel.setText("Registra Los Datos De Tu Nueva Cuenta");
        titulo_Inicio_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo_Inicio_JLabel.setPreferredSize(new java.awt.Dimension(670, 48));

        informacion_Inicio_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informacion_Inicio_JLabel.setText("<html>\n\n<p style=\"text-align:center;\">\n\nA continuación te pediremos algunos datos personales que requerimos<br>\nde tu parte para que puedas acceder al sistema y puedas disfrutar de tu nueva<br> forma de aprendizaje.\nNo te preocupes,  no toma demasiado tiempo y<br>, sobre todo, tus datos no serán utilizados para un uso indebido.\n</p>\n\n</html>");
        informacion_Inicio_JLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        informacion_Inicio_JLabel.setPreferredSize(new java.awt.Dimension(670, 104));

        continuar_Autenticacion_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Autenticacion_JButton.setBorder(null);
        continuar_Autenticacion_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar_Autenticacion_JButton.setToolTipText("<html> <h3>Continuar a la pestaña de autenticación</h3> </html>");
        ((ImageIcon)continuar_Autenticacion_JButton.getIcon()).getImage().flush();
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
        regresar_Inicio_Sesion_JButton.setBorder(null);
        regresar_Inicio_Sesion_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Inicio_Sesion_JButton.setToolTipText("<html> <h3>Regresar a la página de inicio de sesión</h3> </html>");
        ((ImageIcon)regresar_Inicio_Sesion_JButton.getIcon()).getImage().flush();
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addGroup(inicio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Autenticacion_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Inicio_Sesion_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        add(inicio_JPanel, "Inicio");

        autenticacion_JPanel.setOpaque(false);

        logo_Autenticacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Autenticacion_JLabel.setMaximumSize(new java.awt.Dimension(150, 125));
        logo_Autenticacion_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_Autenticacion_JLabel.setPreferredSize(new java.awt.Dimension(150, 125));

        contrasena_Autenticacion_JLabel.setText("Contraseña*");
        contrasena_Autenticacion_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        contrasenia_Autenticacion_JPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        contrasenia_Autenticacion_JPasswordField.setCaretColor(new java.awt.Color(104, 194, 232));
        contrasenia_Autenticacion_JPasswordField.setPreferredSize(new java.awt.Dimension(350, 43));
        contrasenia_Autenticacion_JPasswordField.setToolTipText("<html>  <h3>Contraseña </h3>  <ul>    <li>Debe contener mínimo 8 caráteres</li>    <li>Debe contener mínimo un carácter especial</li> \n<li>Debe contener mínimo un carácter en mayúscula</li><li>Debe contener mínimo un carácter numérico</li></ul>  </html>");

        titulo_Autenticacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Autenticacion_JLabel.setText("Registra Tus Credenciales Para Acceder Al Sistema");
        titulo_Autenticacion_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N

        correo_Electronico_Autenticacion_JLabel.setText("Correo Electrónico*");
        correo_Electronico_Autenticacion_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        correo_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        correo_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        correo_JTextField.setPreferredSize(new java.awt.Dimension(350, 43));
        correo_JTextField.setToolTipText("");

        repetir_Contrasena_Autenticacion_JLabel.setText("Repetir Contraseña*");
        repetir_Contrasena_Autenticacion_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        repetir_Contrasenia_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        repetir_Contrasenia_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        repetir_Contrasenia_JTextField.setPreferredSize(new java.awt.Dimension(350, 43));
        repetir_Contrasenia_JTextField.setToolTipText("");

        regresar_Inicio_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_Inicio_JButton.setBorder(null);
        regresar_Inicio_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Inicio_JButton.setToolTipText("<html>\n<h3>Regresar a la pestaña de inicio</h3>\n</html>");
        ((ImageIcon)regresar_Inicio_JButton.getIcon()).getImage().flush();
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
        continuar_Datos_Personales_JButton.setBorder(null);
        continuar_Datos_Personales_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar_Datos_Personales_JButton.setToolTipText("<html>\n<h3>Continuar a la pestaña de datos personales</h3>\n</html>");
        ((ImageIcon)continuar_Datos_Personales_JButton.getIcon()).getImage().flush();
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

        mostrar_Contrasena_JCheckBox.setText("Mostrar Contraseña");
        mostrar_Contrasena_JCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar_Contrasena_JCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mostrar_Contrasena_JCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mostrar_Contrasena_JCheckBox.setMaximumSize(new java.awt.Dimension(430, 30));
        mostrar_Contrasena_JCheckBox.setMinimumSize(new java.awt.Dimension(430, 30));
        mostrar_Contrasena_JCheckBox.setPreferredSize(new java.awt.Dimension(430, 30));
        mostrar_Contrasena_JCheckBox.setToolTipText("Muestra La Contraseña");
        mostrar_Contrasena_JCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar_Contrasena_JCheckBoxMouseClicked(evt);
            }
        });

        mostrar_Repetir_Contrasena_JCheckBox.setText("Mostrar Contraseña");
        mostrar_Repetir_Contrasena_JCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar_Repetir_Contrasena_JCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mostrar_Repetir_Contrasena_JCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mostrar_Repetir_Contrasena_JCheckBox.setMaximumSize(new java.awt.Dimension(430, 30));
        mostrar_Repetir_Contrasena_JCheckBox.setMinimumSize(new java.awt.Dimension(430, 30));
        mostrar_Repetir_Contrasena_JCheckBox.setPreferredSize(new java.awt.Dimension(430, 30));
        mostrar_Repetir_Contrasena_JCheckBox.setToolTipText("Muestra La Contraseña");
        mostrar_Repetir_Contrasena_JCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar_Repetir_Contrasena_JCheckBoxMouseClicked(evt);
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
                    .addComponent(titulo_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
                    .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mostrar_Repetir_Contrasena_JCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, autenticacion_JPanelLayout.createSequentialGroup()
                                    .addComponent(repetir_Contrasena_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mostrar_Contrasena_JCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(correo_Electronico_Autenticacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(correo_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contrasenia_Autenticacion_JPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(repetir_Contrasenia_JTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(18, 47, Short.MAX_VALUE)
                .addComponent(correo_Electronico_Autenticacion_JLabel)
                .addGap(2, 2, 2)
                .addComponent(correo_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(contrasena_Autenticacion_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasenia_Autenticacion_JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(repetir_Contrasena_Autenticacion_JLabel))
                    .addGroup(autenticacion_JPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrar_Contrasena_JCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repetir_Contrasenia_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrar_Repetir_Contrasena_JCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(autenticacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Datos_Personales_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Inicio_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        add(autenticacion_JPanel, "Autenticacion");

        datos_Personales_JPanel.setOpaque(false);

        logo_Datos_Personales_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Datos_Personales_JLabel.setPreferredSize(new java.awt.Dimension(0, 125));

        titulo_Datos_Personales_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Datos_Personales_JLabel.setText("Registra Tus Datos Personales");
        titulo_Datos_Personales_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N

        nombres_JLabel.setText("Nombre(s) *");
        nombres_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        nombres_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        nombres_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        nombres_JTextField.setToolTipText("<html>  <h3> Nombre(s) </h3>  <ul>    <li>Obligatorio</li> </ul>  </html>");
        nombres_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombres_JTextFieldKeyTyped(evt);
            }
        });

        apellido_Paterno_JLabel.setText("Apellido Paterno *");
        apellido_Paterno_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        apellido_Paterno_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        apellido_Paterno_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        apellido_Paterno_JTextField.setToolTipText("<html>  <h3> Apellido paterno </h3>  <ul>    <li>Obligatorio</li> </ul>  </html>");
        apellido_Paterno_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido_Paterno_JTextFieldKeyTyped(evt);
            }
        });

        localidad_JLabel.setText("Localidad");
        localidad_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        genero_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        genero_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        genero_JTextField.setToolTipText("<html>  <h3> Identidad de género </h3>  <ul>    <li>Opcional</li> </ul>  </html>");
        genero_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                genero_JTextFieldKeyTyped(evt);
            }
        });

        genero_JLabel.setText("Género");
        genero_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        fecha_Nacimiento_JLabel.setText("Fecha De Nacimiento *");
        fecha_Nacimiento_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        continuar_Perfil_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Perfil_JButton.setBorder(null);
        continuar_Perfil_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar_Perfil_JButton.setToolTipText("<html> <h3>Continuar a la pestaña de perfil</h3> </html>");
        ((ImageIcon)continuar_Perfil_JButton.getIcon()).getImage().flush();
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
        regresar_Autenticacion_JButton.setBorder(null);
        regresar_Autenticacion_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Autenticacion_JButton.setToolTipText("<html> <h3>Regresar a la pestaña de autenticación</h3> </html>");
        ((ImageIcon)regresar_Autenticacion_JButton.getIcon()).getImage().flush();
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

        apellido_Materno_JLabel.setText("Apellido Materno");
        apellido_Materno_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        apellido_Materno_JTextField.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        apellido_Materno_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));
        apellido_Materno_JTextField.setToolTipText("<html>  <h3> Apellido materno </h3> </html>");
        apellido_Materno_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido_Materno_JTextFieldKeyTyped(evt);
            }
        });

        estado_JLabel.setText("Estado");
        estado_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        estado_AutoCompletionComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estado_AutoCompletionComboBox.setToolTipText("<html>\n<h3>Estado de proveniencia</h3>\n</html>");

        localidad_AutoCompletionComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        localidad_AutoCompletionComboBox.setToolTipText("<html>\n<h3>Localidad de provenencia</h3>\n</html>");

        fecha_Nacimiento_DatePicker.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fecha_Nacimiento_DatePicker.setToolTipText("");

        javax.swing.GroupLayout datos_Personales_JPanelLayout = new javax.swing.GroupLayout(datos_Personales_JPanel);
        datos_Personales_JPanel.setLayout(datos_Personales_JPanelLayout);
        datos_Personales_JPanelLayout.setHorizontalGroup(
            datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(regresar_Autenticacion_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continuar_Perfil_JButton))
                    .addComponent(titulo_Datos_Personales_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo_Datos_Personales_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(apellido_Materno_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellido_Paterno_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(apellido_Materno_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(apellido_Paterno_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(nombres_JTextField)
                            .addComponent(nombres_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 95, Short.MAX_VALUE)
                        .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fecha_Nacimiento_DatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                            .addComponent(fecha_Nacimiento_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genero_JTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                            .addComponent(genero_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localidad_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(estado_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(estado_AutoCompletionComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localidad_AutoCompletionComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        datos_Personales_JPanelLayout.setVerticalGroup(
            datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_Datos_Personales_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_Datos_Personales_JLabel)
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(estado_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(nombres_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombres_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datos_Personales_JPanelLayout.createSequentialGroup()
                        .addComponent(localidad_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localidad_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(fecha_Nacimiento_DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(datos_Personales_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Perfil_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Autenticacion_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        add(datos_Personales_JPanel, "Datos_Personales");

        perfil_JPanel.setOpaque(false);

        logo_Perfil_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Perfil_JLabel.setMaximumSize(new java.awt.Dimension(150, 125));
        logo_Perfil_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(150, 125));

        titulo_Perfil_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Perfil_JLabel.setText("Registra Tu Información De Perfil");
        titulo_Perfil_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titulo_Perfil_JLabel.setMaximumSize(new java.awt.Dimension(490, 41));
        titulo_Perfil_JLabel.setMinimumSize(new java.awt.Dimension(490, 41));
        titulo_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(490, 41));

        tipo_Perfil_JLabel.setText("Perfil*");
        tipo_Perfil_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tipo_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(320, 25));

        tipo_Perfil_JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Profesor" }));
        tipo_Perfil_JComboBox.setBorder(null);
        tipo_Perfil_JComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipo_Perfil_JComboBox.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tipo_Perfil_JComboBox.setMaximumSize(new java.awt.Dimension(350, 40));
        tipo_Perfil_JComboBox.setPreferredSize(new java.awt.Dimension(320, 40));
        tipo_Perfil_JComboBox.setToolTipText("<html>  <h3> Tipo de perfil</h3></html>");

        imagen_Perfil_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_Perfil_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagen_Perfil_JLabel.setName(""); // NOI18N
        imagen_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(450, 450));
        imagen_Perfil_JLabel.setToolTipText("Imagen De Perfil Seleccionada.");

        cargar_Imagen_Perfil_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/image.png"))); // NOI18N
        cargar_Imagen_Perfil_JButton.setText("Cargar Imagen");
        cargar_Imagen_Perfil_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cargar_Imagen_Perfil_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargar_Imagen_Perfil_JButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cargar_Imagen_Perfil_JButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cargar_Imagen_Perfil_JButton.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        cargar_Imagen_Perfil_JButton.setPreferredSize(new java.awt.Dimension(320, 40));
        cargar_Imagen_Perfil_JButton.setToolTipText("<html>\n<h3>Subir Imagen De Perfil</h3>\n<ul>\n<li>\nLa imagen se redimensionará a un tamaño de 450 x 450 pixeles\n</li>\n</ul>\n</html>");
        ((ImageIcon)cargar_Imagen_Perfil_JButton.getIcon()).getImage().flush();
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

        regresar_Datos_Personales_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_Datos_Personales_JButton.setBorder(null);
        regresar_Datos_Personales_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Datos_Personales_JButton.setToolTipText("<html> <h3>Regresar a la pestaña de datos personales</h3> </html>");
        ((ImageIcon)regresar_Datos_Personales_JButton.getIcon()).getImage().flush();
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

        continuar_Informacion_Extra_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Informacion_Extra_JButton.setBorder(null);
        continuar_Informacion_Extra_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar_Informacion_Extra_JButton.setToolTipText("<html> <h3>Continuar a la pestaña<br>de información extra</h3> </html>");
        ((ImageIcon)continuar_Informacion_Extra_JButton.getIcon()).getImage().flush();
        continuar_Informacion_Extra_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuar_Informacion_Extra_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuar_Informacion_Extra_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuar_Informacion_Extra_JButtonMouseExited(evt);
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
                        .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logo_Perfil_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titulo_Perfil_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(perfil_JPanelLayout.createSequentialGroup()
                        .addComponent(regresar_Datos_Personales_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipo_Perfil_JComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargar_Imagen_Perfil_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_Perfil_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagen_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(continuar_Informacion_Extra_JButton))))
        );
        perfil_JPanelLayout.setVerticalGroup(
            perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfil_JPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(logo_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(titulo_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perfil_JPanelLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imagen_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perfil_JPanelLayout.createSequentialGroup()
                                .addComponent(tipo_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo_Perfil_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cargar_Imagen_Perfil_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfil_JPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(perfil_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(regresar_Datos_Personales_JButton)
                            .addComponent(continuar_Informacion_Extra_JButton))
                        .addContainerGap())))
        );

        add(perfil_JPanel, "Perfil");

        informacion_Extra_JPanel.setOpaque(false);

        crear_Cuenta_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/check_1.png"))); // NOI18N
        crear_Cuenta_JButton.setBorder(null);
        crear_Cuenta_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear_Cuenta_JButton.setToolTipText("<html> <h3>Crear nueva cuenta</h3> </html>");
        ((ImageIcon)crear_Cuenta_JButton.getIcon()).getImage().flush();
        crear_Cuenta_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_Cuenta_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crear_Cuenta_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crear_Cuenta_JButtonMouseExited(evt);
            }
        });

        logo_Informacion_Extra_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Informacion_Extra_JLabel.setMaximumSize(new java.awt.Dimension(150, 125));
        logo_Informacion_Extra_JLabel.setMinimumSize(new java.awt.Dimension(150, 125));
        logo_Informacion_Extra_JLabel.setPreferredSize(new java.awt.Dimension(150, 125));

        titulo_Informacion_Extra_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Informacion_Extra_JLabel.setText("Agrega Información Extra A Tu Perfil");
        titulo_Informacion_Extra_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titulo_Informacion_Extra_JLabel.setMaximumSize(new java.awt.Dimension(490, 41));
        titulo_Informacion_Extra_JLabel.setMinimumSize(new java.awt.Dimension(490, 41));
        titulo_Informacion_Extra_JLabel.setPreferredSize(new java.awt.Dimension(490, 41));

        regresar_Perfil_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_Perfil_JButton.setBorder(null);
        regresar_Perfil_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Perfil_JButton.setToolTipText("<html> <h3>Regresar a la pestaña de perfil</h3> </html>");
        ((ImageIcon)regresar_Perfil_JButton.getIcon()).getImage().flush();
        regresar_Perfil_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_Perfil_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresar_Perfil_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresar_Perfil_JButtonMouseExited(evt);
            }
        });

        promedio_General_JLabel.setText("Promedio General");
        promedio_General_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        promedio_General_JLabel.setMaximumSize(new java.awt.Dimension(409, 25));
        promedio_General_JLabel.setMinimumSize(new java.awt.Dimension(409, 25));
        promedio_General_JLabel.setPreferredSize(new java.awt.Dimension(409, 25));

        promedio_General_JFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##.00"))));
        promedio_General_JFormattedTextField.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        promedio_General_JFormattedTextField.setPreferredSize(new java.awt.Dimension(126, 40));
        promedio_General_JFormattedTextField.setToolTipText("<html>\n<h3>Promedio general de tu escuela</h3>\n<ul><li>Esto nos ayudará a generar mayores estadísticas sobre ti<br>\na la hora de tomar tus cursos.</li></ul>\n</html>");
        promedio_General_JFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                promedio_General_JFormattedTextFieldKeyTyped(evt);
            }
        });

        descripcion_JLabel.setText("Descripción");
        descripcion_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        descripcion_JLabel.setMaximumSize(new java.awt.Dimension(409, 25));
        descripcion_JLabel.setMinimumSize(new java.awt.Dimension(409, 25));
        descripcion_JLabel.setPreferredSize(new java.awt.Dimension(409, 25));

        descripcion_JTextPane.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        descripcion_JTextPane.setToolTipText("<html>\n\n<h3>Descripción Personal</h3>\n<ul>\n<li>\nDescripción sobre ti, visible para todos\n</li>\n</ul>\n</html>");
        descripcion_JTextPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcion_JTextPaneKeyTyped(evt);
            }
        });
        descripcion_JScrollPane.setViewportView(descripcion_JTextPane);

        interes_Tematica_JLabel.setText("Interes / Temática");
        interes_Tematica_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        interes_Tematica_JLabel.setPreferredSize(new java.awt.Dimension(320, 25));

        agregar_Interes_Tematica_JButton.setText("Agregar Interes / Temática");
        agregar_Interes_Tematica_JButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        agregar_Interes_Tematica_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregar_Interes_Tematica_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregar_Interes_Tematica_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregar_Interes_Tematica_JButtonMouseExited(evt);
            }
        });

        intereses_Tematicas_AutoCompletionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Isaiah Leblanc", "Fitzgerald Dean", "Emma Doyle", "Galvin Gillespie", "Hunter Ross", "Kellie Valencia", "Miranda Holder", "Drake Mendoza", "Uma Parks", "Julian Hill" }));
        intereses_Tematicas_AutoCompletionComboBox.setSelectedIndex(-1);
        intereses_Tematicas_AutoCompletionComboBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        intereses_Tematicas_AutoCompletionComboBox.setToolTipText("<html>\n<h3>Interes / Temática</h3>\n</html>");

        intereses_Tematicas_JScrollPane.setBorder(null);
        intereses_Tematicas_JScrollPane.setOpaque(false);

        intereses_Tematicas_JTable.setAutoCreateRowSorter(true);
        intereses_Tematicas_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Interes / Temática", "Remover?"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }

                @Override
                public Class getColumnClass(int column)
                {
                    for(int i = 0; i < intereses_Tematicas_JTable.getRowCount(); i++)
                    {
                        //The first valid value of a cell of given column is retrieved.
                        if(getValueAt(i,column) != null)
                        {
                            return getValueAt(i, column).getClass();
                        }
                    }
                    //if no valid value is found, default renderer is returned.
                    return super.getColumnClass(column);
                }
            });
            intereses_Tematicas_JTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            intereses_Tematicas_JTable.setOpaque(false);
            intereses_Tematicas_JTable.setRowHeight(36);
            intereses_Tematicas_JTable.setRowMargin(5);
            intereses_Tematicas_JTable.setShowGrid(true);
            intereses_Tematicas_JTable.setShowVerticalLines(false);
            intereses_Tematicas_JTable.setRowSorter(new TableRowSorter(intereses_Tematicas_JTable.getModel()));
            intereses_Tematicas_JTable.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    if (e.getClickCount() == 2) {

                        JTable tabla = (JTable) e.getComponent();

                        int columna = tabla.getSelectedColumn();

                        if (columna == 1) {
                            int fila = tabla.getRowSorter().convertRowIndexToModel(tabla.getSelectedRow());
                            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                            modelo.removeRow(fila);
                        }

                    }
                }
            });
            intereses_Tematicas_JScrollPane.setViewportView(intereses_Tematicas_JTable);

            javax.swing.GroupLayout informacion_Extra_JPanelLayout = new javax.swing.GroupLayout(informacion_Extra_JPanel);
            informacion_Extra_JPanel.setLayout(informacion_Extra_JPanelLayout);
            informacion_Extra_JPanelLayout.setHorizontalGroup(
                informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacion_Extra_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(informacion_Extra_JPanelLayout.createSequentialGroup()
                            .addGroup(informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titulo_Informacion_Extra_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                                .addComponent(logo_Informacion_Extra_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacion_Extra_JPanelLayout.createSequentialGroup()
                                    .addComponent(regresar_Perfil_JButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(crear_Cuenta_JButton)))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacion_Extra_JPanelLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(descripcion_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(promedio_General_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(promedio_General_JFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion_JScrollPane))
                            .addGap(35, 35, 35)
                            .addGroup(informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(intereses_Tematicas_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(informacion_Extra_JPanelLayout.createSequentialGroup()
                                        .addComponent(intereses_Tematicas_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(agregar_Interes_Tematica_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(interes_Tematica_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            informacion_Extra_JPanelLayout.setVerticalGroup(
                informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacion_Extra_JPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(logo_Informacion_Extra_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(titulo_Informacion_Extra_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(promedio_General_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(interes_Tematica_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(promedio_General_JFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(informacion_Extra_JPanelLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(intereses_Tematicas_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(agregar_Interes_Tematica_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(informacion_Extra_JPanelLayout.createSequentialGroup()
                            .addComponent(descripcion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(descripcion_JScrollPane))
                        .addComponent(intereses_Tematicas_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                    .addGap(41, 41, 41)
                    .addGroup(informacion_Extra_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(crear_Cuenta_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(regresar_Perfil_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap())
            );

            add(informacion_Extra_JPanel, "Informacion_Extra");
        }// </editor-fold>//GEN-END:initComponents

    private void continuar_Autenticacion_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Autenticacion_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)this.getLayout()).show(this,"Autenticacion");
        }
    }//GEN-LAST:event_continuar_Autenticacion_JButtonMouseClicked

    private void continuar_Autenticacion_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Autenticacion_JButtonMouseEntered
        // TODO add your handling code here:
        continuar_Autenticacion_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_continuar_Autenticacion_JButtonMouseEntered

    private void continuar_Autenticacion_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Autenticacion_JButtonMouseExited
        // TODO add your handling code here:
        continuar_Autenticacion_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_continuar_Autenticacion_JButtonMouseExited

    private void regresar_Inicio_Sesion_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_Sesion_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            CourseRoom_Frame.Mostrar_Vista("Inicio_Sesion");
        }
    }//GEN-LAST:event_regresar_Inicio_Sesion_JButtonMouseClicked

    private void regresar_Inicio_Sesion_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_Sesion_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Inicio_Sesion_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_regresar_Inicio_Sesion_JButtonMouseEntered

    private void regresar_Inicio_Sesion_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_Sesion_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Inicio_Sesion_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_regresar_Inicio_Sesion_JButtonMouseExited

    private void regresar_Inicio_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)this.getLayout()).show(this,"Inicio");
        }
    }//GEN-LAST:event_regresar_Inicio_JButtonMouseClicked

    private void regresar_Inicio_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Inicio_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_regresar_Inicio_JButtonMouseEntered

    private void regresar_Inicio_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Inicio_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Inicio_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_regresar_Inicio_JButtonMouseExited

    private void continuar_Datos_Personales_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Datos_Personales_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            verificar_Campos_Autenticacion();
        }
    }//GEN-LAST:event_continuar_Datos_Personales_JButtonMouseClicked

    private void continuar_Datos_Personales_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Datos_Personales_JButtonMouseEntered
        // TODO add your handling code here:
        continuar_Datos_Personales_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_continuar_Datos_Personales_JButtonMouseEntered

    private void continuar_Datos_Personales_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Datos_Personales_JButtonMouseExited
        // TODO add your handling code here:
        continuar_Datos_Personales_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_continuar_Datos_Personales_JButtonMouseExited

    private void continuar_Perfil_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Perfil_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            verificar_Datos_Personales();
        }
    }//GEN-LAST:event_continuar_Perfil_JButtonMouseClicked

    private void continuar_Perfil_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Perfil_JButtonMouseEntered
        // TODO add your handling code here:
        continuar_Perfil_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_continuar_Perfil_JButtonMouseEntered

    private void continuar_Perfil_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Perfil_JButtonMouseExited
        // TODO add your handling code here:
        continuar_Perfil_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_continuar_Perfil_JButtonMouseExited

    private void regresar_Autenticacion_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Autenticacion_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)this.getLayout()).show(this,"Autenticacion");
        }
    }//GEN-LAST:event_regresar_Autenticacion_JButtonMouseClicked

    private void regresar_Autenticacion_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Autenticacion_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Autenticacion_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_regresar_Autenticacion_JButtonMouseEntered

    private void regresar_Autenticacion_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Autenticacion_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Autenticacion_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_regresar_Autenticacion_JButtonMouseExited

    private void cargar_Imagen_Perfil_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_Imagen_Perfil_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Escogedor_Archivos escogedor_Archivos = new Escogedor_Archivos();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos De Imagenes", "png", "jpg", "jpeg", "bmp");
            escogedor_Archivos.addChoosableFileFilter(filtro);
            escogedor_Archivos.setMultiSelectionEnabled(false);
            escogedor_Archivos.setAcceptAllFileFilterUsed(true);
            int resultado = escogedor_Archivos.showOpenDialog(this);

            if (resultado == JFileChooser.APPROVE_OPTION) {
                File archivo_Abierto = escogedor_Archivos.getSelectedFile();

                try {
                    Image abrir_Imagen = ImageIO.read(archivo_Abierto);
                    abrir_Imagen = abrir_Imagen.getScaledInstance(450,450,Image.SCALE_AREA_AVERAGING);
                    ImageIcon icono = new ImageIcon(abrir_Imagen);
                    imagen_Perfil_JLabel.setIcon(icono);
                    icono.getImage().flush();
                    abrir_Imagen.flush();

                } catch (IOException ex) {

                }
            }

        }
    }//GEN-LAST:event_cargar_Imagen_Perfil_JButtonMouseClicked

    private void cargar_Imagen_Perfil_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_Imagen_Perfil_JButtonMouseEntered
        // TODO add your handling code here:
        cargar_Imagen_Perfil_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        cargar_Imagen_Perfil_JButton.setForeground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_cargar_Imagen_Perfil_JButtonMouseEntered

    private void cargar_Imagen_Perfil_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_Imagen_Perfil_JButtonMouseExited
        // TODO add your handling code here:
        cargar_Imagen_Perfil_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        cargar_Imagen_Perfil_JButton.setForeground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_cargar_Imagen_Perfil_JButtonMouseExited

    private void regresar_Datos_Personales_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Datos_Personales_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)this.getLayout()).show(this,"Datos_Personales");
        }
    }//GEN-LAST:event_regresar_Datos_Personales_JButtonMouseClicked

    private void regresar_Datos_Personales_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Datos_Personales_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Datos_Personales_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_regresar_Datos_Personales_JButtonMouseEntered

    private void regresar_Datos_Personales_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Datos_Personales_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Datos_Personales_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_regresar_Datos_Personales_JButtonMouseExited

    private void continuar_Informacion_Extra_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Informacion_Extra_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if(!tipo_Perfil_JComboBox.getSelectedItem().equals("Estudiante")){
                promedio_General_JFormattedTextField.setVisible(false);
                promedio_General_JLabel.setVisible(false);
            }
            else{
                promedio_General_JFormattedTextField.setVisible(true);
                promedio_General_JLabel.setVisible(true);
            }
            ((CardLayout)this.getLayout()).show(this,"Informacion_Extra");
        }
    }//GEN-LAST:event_continuar_Informacion_Extra_JButtonMouseClicked

    private void continuar_Informacion_Extra_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Informacion_Extra_JButtonMouseEntered
        // TODO add your handling code here:
        continuar_Informacion_Extra_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_continuar_Informacion_Extra_JButtonMouseEntered

    private void continuar_Informacion_Extra_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Informacion_Extra_JButtonMouseExited
        // TODO add your handling code here:
        continuar_Informacion_Extra_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_continuar_Informacion_Extra_JButtonMouseExited

    private void crear_Cuenta_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Cuenta_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Validar_Campos();
        }
    }//GEN-LAST:event_crear_Cuenta_JButtonMouseClicked

    private void crear_Cuenta_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Cuenta_JButtonMouseEntered
        // TODO add your handling code here:
        crear_Cuenta_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_crear_Cuenta_JButtonMouseEntered

    private void crear_Cuenta_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_Cuenta_JButtonMouseExited
        // TODO add your handling code here:
        crear_Cuenta_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_crear_Cuenta_JButtonMouseExited

    private void regresar_Perfil_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Perfil_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)this.getLayout()).show(this,"Perfil");
        }
    }//GEN-LAST:event_regresar_Perfil_JButtonMouseClicked

    private void regresar_Perfil_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Perfil_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Perfil_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_regresar_Perfil_JButtonMouseEntered

    private void regresar_Perfil_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Perfil_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Perfil_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_regresar_Perfil_JButtonMouseExited

    private void agregar_Interes_Tematica_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_Interes_Tematica_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
            String interes_Tematica = intereses_Tematicas_AutoCompletionComboBox.getSelectedItem() != null
                    ? intereses_Tematicas_AutoCompletionComboBox.getSelectedItem().toString() : "";
            
            if(!interes_Tematica.isEmpty() && !interes_Tematica.isBlank()){
                Agregar_Interes_Tematica(interes_Tematica);
            }
        }
    }//GEN-LAST:event_agregar_Interes_Tematica_JButtonMouseClicked

    private void agregar_Interes_Tematica_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_Interes_Tematica_JButtonMouseEntered
        // TODO add your handling code here:
        agregar_Interes_Tematica_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        agregar_Interes_Tematica_JButton.setForeground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_agregar_Interes_Tematica_JButtonMouseEntered

    private void agregar_Interes_Tematica_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_Interes_Tematica_JButtonMouseExited
        // TODO add your handling code here:
        agregar_Interes_Tematica_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        agregar_Interes_Tematica_JButton.setForeground(CourseRoom.Utilerias.Primer_Color());
    }//GEN-LAST:event_agregar_Interes_Tematica_JButtonMouseExited

    private void nombres_JTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombres_JTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nombres_JTextFieldKeyTyped

    private void apellido_Paterno_JTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido_Paterno_JTextFieldKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_apellido_Paterno_JTextFieldKeyTyped

    private void apellido_Materno_JTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido_Materno_JTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_apellido_Materno_JTextFieldKeyTyped

    private void genero_JTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genero_JTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_genero_JTextFieldKeyTyped

    private void descripcion_JTextPaneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcion_JTextPaneKeyTyped

    }//GEN-LAST:event_descripcion_JTextPaneKeyTyped

    private void mostrar_Contrasena_JCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Contrasena_JCheckBoxMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if (mostrar_Contrasena_JCheckBox.isSelected()){
                contrasenia_Autenticacion_JPasswordField.setEchoChar((char)0);
            }
            else{
                contrasenia_Autenticacion_JPasswordField.setEchoChar('\u25CF');
            }
        }
    }//GEN-LAST:event_mostrar_Contrasena_JCheckBoxMouseClicked

    private void mostrar_Repetir_Contrasena_JCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_Repetir_Contrasena_JCheckBoxMouseClicked
        // TODO add your handling code here:
         if(SwingUtilities.isLeftMouseButton(evt)){
            if (mostrar_Repetir_Contrasena_JCheckBox.isSelected()){
                repetir_Contrasenia_JTextField.setEchoChar((char)0);
            }
            else{
                repetir_Contrasenia_JTextField.setEchoChar('\u25CF');
            }
        }
    }//GEN-LAST:event_mostrar_Repetir_Contrasena_JCheckBoxMouseClicked

    private void promedio_General_JFormattedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promedio_General_JFormattedTextFieldKeyTyped
        char c = evt.getKeyChar();   
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume();
          }
    }//GEN-LAST:event_promedio_General_JFormattedTextFieldKeyTyped

    public void verificar_Campos_Autenticacion() {
        String Password = String.valueOf(contrasenia_Autenticacion_JPasswordField.getPassword());
        String Password2 = String.valueOf(repetir_Contrasenia_JTextField.getPassword());
        // Checa Los Campos Vacíos.
        if (correo_JTextField.getText().equals("")
                || Password.equals("") || Password2.equals("")) {
            // Si Los Campos No Estan Vacíos Manda Mensaje De Error.
            JOptionPane.showMessageDialog(this, "No Se Permiten Campos Vacios !!!", "Error de Contenido", WIDTH);
        } else {
            /*if (validar_Password(contrasenia_Autenticacion_JPasswordField.getText().trim())) {
                if (Password.equals(Password2)) {
                    validar_Correo(correo_JTextField.getText().trim());
                }else{
                     JOptionPane.showMessageDialog(this, "Contraseñas Distintas Revisa!!!", "NO", WIDTH);
                contrasenia_Autenticacion_JPasswordField.requestFocus();
                }
            }*/ 
            if (Password.equals(Password2)) {
                // Si Todo Esta Bien Llamamos A La Función "Validar Correo".
                validar_Correo(correo_JTextField.getText().trim());
                //validar_Password(contrasenia_Autenticacion_JPasswordField.getText().trim());
            } else {
                // Si Las Dos Contraseñas No Son Iguales Manda Mensaje De Error.
                JOptionPane.showMessageDialog(this, "Contraseñas Distintas Revisa!!!", "NO", WIDTH);
                contrasenia_Autenticacion_JPasswordField.requestFocus();
            }
        }
    }
    
        public boolean validar_Correo(String correo) {
        Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z]{3})((\\.[A-Za-z]{2}))?$");
        Matcher mat = pat.matcher(correo);
        if (mat.find()) {
            JOptionPane.showMessageDialog(null, "Continuemos!!!");
            ((CardLayout)this.getLayout()).show(this,"Datos_Personales");
        } else {
            JOptionPane.showMessageDialog(null, "El Correo\n'" + correo + "'\nNo Es Valido");
            correo_JTextField.setText("");
            correo_JTextField.requestFocus();
        }
        return mat.find();
    }
        
        public void verificar_Datos_Personales(){
            if (nombres_JTextField.getText().equals("")
                || apellido_Paterno_JTextField.getText().equals("")) {
            // Si Los Campos No Estan Vacíos Manda Mensaje De Error.
            JOptionPane.showMessageDialog(this, "No Se Permiten Campos Vacios !!!", "Error de Contenido", WIDTH);
        } else {
            //validar_Password(apellido_Materno_JTextField.getText().trim());
            ((CardLayout) this.getLayout()).show(this, "Perfil");
        }
    }
        
        /*public boolean validar_Password(String pass) {
        Pattern pat = Pattern.compile("\\A(?=\\S*?[0-9])(?=\\S*?[a-z])(?=\\S*?[A-Z])(?=\\S*?[.@#$%^&+=])\\S{8,}\\z");
        Matcher mat = pat.matcher(pass);
        if (mat.find()) {
            JOptionPane.showMessageDialog(null, "Bien!!!");
        } else {
            JOptionPane.showMessageDialog(null, "La Contraseña Debe Contener:\n"
                    + "°Al menos 8 caracteres\n°Una Letra Mayuzcula\n"
                    + "°Una Letra Minuscula\n°Un Caracter Especial");
        }
        return mat.find();
    }*/

    private void Agregar_Interes_Tematica(String interes_Tematica){
        try {
            DefaultTableModel modelo = (DefaultTableModel) intereses_Tematicas_JTable.getModel();
            
            Celda_Renderer[] celdas = new Celda_Renderer[2];
            Celda_Renderer celda;
            
            Image icono = ImageIO.read(getClass().getResource("/recursos/iconos/close.png"));
            ImageIcon remover = new ImageIcon(icono);
            
            celda = new Celda_Renderer(interes_Tematica);
            celdas[0] = celda;
            
            celda = new Celda_Renderer(remover);
            celdas[1] = celda;
            modelo.addRow(celdas);
            
            intereses_Tematicas_JTable.setRowHeight(modelo.getRowCount()-1, CourseRoom.Utilerias.Altura_Fila_Tabla(interes_Tematica.length()));
            
            icono.flush();
        } catch (IOException ex) {
            
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_Interes_Tematica_JButton;
    private javax.swing.JLabel apellido_Materno_JLabel;
    private javax.swing.JTextField apellido_Materno_JTextField;
    private javax.swing.JLabel apellido_Paterno_JLabel;
    private javax.swing.JTextField apellido_Paterno_JTextField;
    private javax.swing.JPanel autenticacion_JPanel;
    private javax.swing.JButton cargar_Imagen_Perfil_JButton;
    private javax.swing.JButton continuar_Autenticacion_JButton;
    private javax.swing.JButton continuar_Datos_Personales_JButton;
    private javax.swing.JButton continuar_Informacion_Extra_JButton;
    private javax.swing.JButton continuar_Perfil_JButton;
    private javax.swing.JLabel contrasena_Autenticacion_JLabel;
    private javax.swing.JPasswordField contrasenia_Autenticacion_JPasswordField;
    private javax.swing.JLabel correo_Electronico_Autenticacion_JLabel;
    private javax.swing.JTextField correo_JTextField;
    private javax.swing.JButton crear_Cuenta_JButton;
    private javax.swing.JPanel datos_Personales_JPanel;
    private javax.swing.JLabel descripcion_JLabel;
    private javax.swing.JScrollPane descripcion_JScrollPane;
    private javax.swing.JTextPane descripcion_JTextPane;
    private com.jidesoft.swing.AutoCompletionComboBox estado_AutoCompletionComboBox;
    private javax.swing.JLabel estado_JLabel;
    private com.github.lgooddatepicker.components.DatePicker fecha_Nacimiento_DatePicker;
    private javax.swing.JLabel fecha_Nacimiento_JLabel;
    private javax.swing.JLabel genero_JLabel;
    private javax.swing.JTextField genero_JTextField;
    private javax.swing.JLabel imagen_Perfil_JLabel;
    private javax.swing.JPanel informacion_Extra_JPanel;
    private javax.swing.JLabel informacion_Inicio_JLabel;
    private javax.swing.JPanel inicio_JPanel;
    private javax.swing.JLabel interes_Tematica_JLabel;
    private com.jidesoft.swing.AutoCompletionComboBox intereses_Tematicas_AutoCompletionComboBox;
    private javax.swing.JScrollPane intereses_Tematicas_JScrollPane;
    private javax.swing.JTable intereses_Tematicas_JTable;
    private com.jidesoft.swing.AutoCompletionComboBox localidad_AutoCompletionComboBox;
    private javax.swing.JLabel localidad_JLabel;
    private javax.swing.JLabel logo_Autenticacion_JLabel;
    private javax.swing.JLabel logo_Datos_Personales_JLabel;
    private javax.swing.JLabel logo_Informacion_Extra_JLabel;
    private javax.swing.JLabel logo_Inicio_JLabel;
    private javax.swing.JLabel logo_Perfil_JLabel;
    private javax.swing.JCheckBox mostrar_Contrasena_JCheckBox;
    private javax.swing.JCheckBox mostrar_Repetir_Contrasena_JCheckBox;
    private javax.swing.JLabel nombres_JLabel;
    private javax.swing.JTextField nombres_JTextField;
    private javax.swing.JPanel perfil_JPanel;
    private javax.swing.JFormattedTextField promedio_General_JFormattedTextField;
    private javax.swing.JLabel promedio_General_JLabel;
    private javax.swing.JButton regresar_Autenticacion_JButton;
    private javax.swing.JButton regresar_Datos_Personales_JButton;
    private javax.swing.JButton regresar_Inicio_JButton;
    private javax.swing.JButton regresar_Inicio_Sesion_JButton;
    private javax.swing.JButton regresar_Perfil_JButton;
    private javax.swing.JLabel repetir_Contrasena_Autenticacion_JLabel;
    private javax.swing.JPasswordField repetir_Contrasenia_JTextField;
    private javax.swing.JComboBox<String> tipo_Perfil_JComboBox;
    private javax.swing.JLabel tipo_Perfil_JLabel;
    private javax.swing.JLabel titulo_Autenticacion_JLabel;
    private javax.swing.JLabel titulo_Datos_Personales_JLabel;
    private javax.swing.JLabel titulo_Informacion_Extra_JLabel;
    private javax.swing.JLabel titulo_Inicio_JLabel;
    private javax.swing.JLabel titulo_Perfil_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
         
        Image logo_Imagen;
        try {
            logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand_Blue.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(150, 125, Image.SCALE_SMOOTH);
            ImageIcon icono = new ImageIcon(logo_Imagen);
            logo_Inicio_JLabel.setIcon(icono);
            logo_Autenticacion_JLabel.setIcon(icono);
            logo_Datos_Personales_JLabel.setIcon(icono);
            logo_Perfil_JLabel.setIcon(icono);
            logo_Informacion_Extra_JLabel.setIcon(icono);
            logo_Imagen.flush();
            icono.getImage().flush();

            intereses_Tematicas_JScrollPane.getViewport().setOpaque(false);
            intereses_Tematicas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
            intereses_Tematicas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

            Font gadugi = new Font("Segoe UI", Font.BOLD, 16);
            intereses_Tematicas_JTable.getTableHeader().setFont(gadugi);
            intereses_Tematicas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());

            LocalDate fecha_Minima = LocalDate.of(1900, Month.JANUARY, 1);
            LocalDate fecha_Maxima = LocalDate.of(2010, Month.JANUARY, 1);
            Locale local = new Locale("es", "MX");
            DatePickerSettings ajustes_Fecha_Nacimiento = new DatePickerSettings(local);
            ajustes_Fecha_Nacimiento.setFirstDayOfWeek(DayOfWeek.MONDAY);
            ajustes_Fecha_Nacimiento.setFontVetoedDate(nombres_JLabel.getFont());
            ajustes_Fecha_Nacimiento.setFontValidDate(nombres_JLabel.getFont());
            ajustes_Fecha_Nacimiento.setFontCalendarDateLabels(nombres_JLabel.getFont());
            ajustes_Fecha_Nacimiento.setFontCalendarWeekNumberLabels(nombres_JLabel.getFont());
            ajustes_Fecha_Nacimiento.setFontCalendarWeekdayLabels(nombres_JLabel.getFont());
            ajustes_Fecha_Nacimiento.setFontTodayLabel(nombres_JLabel.getFont());
            ajustes_Fecha_Nacimiento.setFontMonthAndYearMenuLabels(nombres_JLabel.getFont());
            ajustes_Fecha_Nacimiento.setFontTodayLabel(nombres_JLabel.getFont());
            ajustes_Fecha_Nacimiento.setVisibleClearButton(false);
            ajustes_Fecha_Nacimiento.setVisibleTodayButton(false);
            fecha_Nacimiento_DatePicker.setSettings(ajustes_Fecha_Nacimiento);
            fecha_Nacimiento_DatePicker.getComponent(0).setFont(nombres_JLabel.getFont());
            fecha_Nacimiento_DatePicker.getSettings().setDateRangeLimits(fecha_Minima, fecha_Maxima);
            fecha_Nacimiento_DatePicker.setDate(LocalDate.of(1998, Month.JANUARY, 1));
            fecha_Nacimiento_DatePicker.setOpaque(false);
            fecha_Nacimiento_DatePicker.setVisible(true);
            ((JTextField) fecha_Nacimiento_DatePicker.getComponent(0)).setEditable(false);

            descripcion_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
            descripcion_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

            
        } catch (IOException ex) {
            
        }
        
        Colorear_Componentes();
       
    }

    @Override
    public void Colorear_Componentes() {
        informacion_Inicio_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        logo_Inicio_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        titulo_Inicio_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        continuar_Autenticacion_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        regresar_Inicio_Sesion_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        correo_JTextField.setBackground(CourseRoom.Utilerias.Segundo_Color());
        correo_JTextField.setForeground(CourseRoom.Utilerias.Primer_Color());
        correo_JTextField.setCaretColor(CourseRoom.Utilerias.Primer_Color());
        contrasenia_Autenticacion_JPasswordField.setBackground(CourseRoom.Utilerias.Segundo_Color());
        contrasenia_Autenticacion_JPasswordField.setForeground(CourseRoom.Utilerias.Primer_Color());
        contrasenia_Autenticacion_JPasswordField.setCaretColor(CourseRoom.Utilerias.Primer_Color());
        repetir_Contrasenia_JTextField.setBackground(CourseRoom.Utilerias.Segundo_Color());
        repetir_Contrasenia_JTextField.setForeground(CourseRoom.Utilerias.Primer_Color());
        repetir_Contrasenia_JTextField.setCaretColor(CourseRoom.Utilerias.Primer_Color());
        correo_Electronico_Autenticacion_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        logo_Autenticacion_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        repetir_Contrasena_Autenticacion_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        titulo_Autenticacion_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        continuar_Datos_Personales_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        regresar_Inicio_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        apellido_Paterno_JTextField.setBackground(CourseRoom.Utilerias.Segundo_Color());
        apellido_Paterno_JTextField.setForeground(CourseRoom.Utilerias.Primer_Color());
        apellido_Paterno_JTextField.setCaretColor(CourseRoom.Utilerias.Primer_Color());
        apellido_Materno_JTextField.setBackground(CourseRoom.Utilerias.Segundo_Color());
        apellido_Materno_JTextField.setForeground(CourseRoom.Utilerias.Primer_Color());
        apellido_Materno_JTextField.setCaretColor(CourseRoom.Utilerias.Primer_Color());
        genero_JTextField.setBackground(CourseRoom.Utilerias.Segundo_Color());
        genero_JTextField.setForeground(CourseRoom.Utilerias.Primer_Color());
        genero_JTextField.setCaretColor(CourseRoom.Utilerias.Primer_Color());
        localidad_AutoCompletionComboBox.setBackground(CourseRoom.Utilerias.Segundo_Color());
        localidad_AutoCompletionComboBox.setForeground(CourseRoom.Utilerias.Primer_Color());
        estado_AutoCompletionComboBox.setBackground(CourseRoom.Utilerias.Segundo_Color());
        estado_AutoCompletionComboBox.setForeground(CourseRoom.Utilerias.Primer_Color());
        nombres_JTextField.setBackground(CourseRoom.Utilerias.Segundo_Color());
        nombres_JTextField.setForeground(CourseRoom.Utilerias.Primer_Color());
        nombres_JTextField.setCaretColor(CourseRoom.Utilerias.Primer_Color());
        apellido_Paterno_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        apellido_Materno_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        fecha_Nacimiento_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        genero_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        localidad_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        estado_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        logo_Datos_Personales_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        nombres_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        titulo_Datos_Personales_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        continuar_Perfil_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        regresar_Autenticacion_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());

        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.CalendarBackgroundNormalDates,
                CourseRoom.Utilerias.Segundo_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.CalendarTextNormalDates,
                CourseRoom.Utilerias.Primer_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.TextMonthAndYearMenuLabels,
                CourseRoom.Utilerias.Primer_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.TextMonthAndYearMenuLabels,
                CourseRoom.Utilerias.Primer_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.BackgroundCalendarPanelLabelsOnHover,
                CourseRoom.Utilerias.Segundo_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.BackgroundMonthAndYearNavigationButtons,
                CourseRoom.Utilerias.Primer_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.TextMonthAndYearNavigationButtons,
                CourseRoom.Utilerias.Segundo_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.TextCalendarPanelLabelsOnHover,
                CourseRoom.Utilerias.Primer_Color());
        
        cargar_Imagen_Perfil_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        cargar_Imagen_Perfil_JButton.setForeground(CourseRoom.Utilerias.Primer_Color());
        tipo_Perfil_JComboBox.setBackground(CourseRoom.Utilerias.Segundo_Color());
        tipo_Perfil_JComboBox.setForeground(CourseRoom.Utilerias.Primer_Color());
        imagen_Perfil_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        logo_Perfil_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        tipo_Perfil_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        titulo_Perfil_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        continuar_Informacion_Extra_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        regresar_Datos_Personales_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        
        descripcion_JTextPane.setBackground(CourseRoom.Utilerias.Segundo_Color());
        descripcion_JTextPane.setForeground(CourseRoom.Utilerias.Primer_Color());
        descripcion_JTextPane.setCaretColor(CourseRoom.Utilerias.Primer_Color());
        descripcion_JScrollPane.setForeground(CourseRoom.Utilerias.Primer_Color());
        promedio_General_JFormattedTextField.setBackground(CourseRoom.Utilerias.Segundo_Color());
        promedio_General_JFormattedTextField.setForeground(CourseRoom.Utilerias.Primer_Color());
        promedio_General_JFormattedTextField.setCaretColor(CourseRoom.Utilerias.Primer_Color());
        intereses_Tematicas_AutoCompletionComboBox.setBackground(CourseRoom.Utilerias.Segundo_Color());
        intereses_Tematicas_AutoCompletionComboBox.setForeground(CourseRoom.Utilerias.Primer_Color());
        agregar_Interes_Tematica_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        agregar_Interes_Tematica_JButton.setForeground(CourseRoom.Utilerias.Primer_Color());
        descripcion_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        promedio_General_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        titulo_Informacion_Extra_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        interes_Tematica_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color());
        crear_Cuenta_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        regresar_Perfil_JButton.setBackground(CourseRoom.Utilerias.Primer_Color());
        
        intereses_Tematicas_JTable.getTableHeader().setBackground(CourseRoom.Utilerias.Segundo_Color());
        intereses_Tematicas_JTable.getTableHeader().setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
        intereses_Tematicas_JTable.setGridColor(CourseRoom.Utilerias.Segundo_Color_Fuente());
        
        DefaultTableModel modelo = (DefaultTableModel) intereses_Tematicas_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias.Color_Azul_Claro());
            }
        }
        
        mostrar_Contrasena_JCheckBox.setForeground(CourseRoom.Utilerias.Segundo_Color());
        mostrar_Repetir_Contrasena_JCheckBox.setForeground(CourseRoom.Utilerias.Segundo_Color());
        
    }
    
    @Override
    public void Limpiar(){
       DefaultTableModel modelo = (DefaultTableModel) intereses_Tematicas_JTable.getModel();
       modelo.setRowCount(0);
    }

    @Override
    public void Validar_Campos() {
        int tipo_Perfil = tipo_Perfil_JComboBox.getSelectedIndex();
        
        CourseRoom.Utilerias.Esconder_Frame();
        
        CourseRoom_Frame.Mostrar_Tablero(tipo_Perfil == 0);
        
        CourseRoom.Utilerias.Mostrar_Frame();
    }

}
