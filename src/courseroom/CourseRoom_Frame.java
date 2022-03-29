/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseroom;

import datos.estructuras.Par;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.CardLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import paneles.generales.inicio_sesion.Inicio_Sesion_General_Panel;
import paneles.generales.inicio_sesion.Recuperar_Credenciales_General_Panel;
import paneles.generales.inicio_sesion.Crear_Cuenta_General_Panel;
import paneles.estudiantes.Tablero_Estudiante_Panel;
import paneles.profesores.Tablero_Profesor_Panel;

/**
 *
 * @author LENOVO
 */
public class CourseRoom_Frame extends javax.swing.JFrame implements Limpieza_Interface, Componentes_Interface {

    private static Tablero_Estudiante_Panel tablero_Estudiante;
    private static Tablero_Profesor_Panel tablero_Profesor;

    public static CourseRoom_Frame getInstance() {
        return CourseRoom_FrameHolder.INSTANCE;
    }

    private static class CourseRoom_FrameHolder {
        private static final CourseRoom_Frame INSTANCE = new CourseRoom_Frame();
    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    private CourseRoom_Frame() {

        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        Iniciar_Componentes();
        setVisible(true);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visualizador_JPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                if(CourseRoom.Utilerias().Primer_Color() != null && CourseRoom.Utilerias().Segundo_Color() != null
                    && CourseRoom.Utilerias().Tercer_Color() != null){
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D)g;
                    int w = getWidth();
                    int h = getHeight();

                    Color transparente = new Color(0,0,0,0);
                    // Vertical
                    GradientPaint gp = new GradientPaint(
                        0, 0, transparente,
                        0, h, CourseRoom.Utilerias().Primer_Color());

                    // Horizontal
                    GradientPaint gp2 = new GradientPaint(
                        0, 0, CourseRoom.Utilerias().Tercer_Color(),
                        w, 0, CourseRoom.Utilerias().Segundo_Color());

                    g2d.setPaint(gp2);
                    g2d.fillRect(0, 0, w, h);
                    g2d.setPaint(gp);
                    g2d.fillRect(0, 0, w, h);
                }
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CourseRoom - Tu Espacio Personal Para Estudiar");
        setMinimumSize(new java.awt.Dimension(1270, 695));
        setName("mainFrame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        visualizador_JPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        visualizador_JPanel.setPreferredSize(new java.awt.Dimension(0, 0));
        visualizador_JPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(visualizador_JPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.Limpiar();
        System.gc();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    public void Mostrar_Tablero(boolean tipo_Tablero, Integer id_Usuario) {
        if(tipo_Tablero){
            tablero_Estudiante = new Tablero_Estudiante_Panel(id_Usuario);
            visualizador_JPanel.add("Tablero", tablero_Estudiante);
            Tablero_Estudiante_Panel.Establecer_Colores();
            ((CardLayout)visualizador_JPanel.getLayout()).show(visualizador_JPanel, "Tablero");
        }else{
            tablero_Profesor = new Tablero_Profesor_Panel(id_Usuario);
            visualizador_JPanel.add("Tablero", tablero_Profesor);
            Tablero_Profesor_Panel.Establecer_Colores();
            ((CardLayout)visualizador_JPanel.getLayout()).show(visualizador_JPanel, "Tablero");
        }
    }
    
    public void Mostrar_Vista(String llave) {
        ((CardLayout)visualizador_JPanel.getLayout()).show(visualizador_JPanel, llave);
    }

    public void Cerrar_Sesion() {
        
        if(tablero_Estudiante != null){
            
            if(Tablero_Estudiante_Panel.Id_Sesion() > -1){
        
                Par<Integer, String> response = CourseRoom.Solicitudes().Cerrar_Sesion(Tablero_Estudiante_Panel.Id_Usuario(),Tablero_Estudiante_Panel.Id_Sesion());

                if(response.first() < 0){
                    System.err.println(response.second());
                }
            }
        }
        else if(tablero_Profesor != null){
            if(Tablero_Profesor_Panel.Id_Sesion() > -1){
        
                Par<Integer, String> response = CourseRoom.Solicitudes().Cerrar_Sesion(Tablero_Profesor_Panel.Id_Usuario(),Tablero_Profesor_Panel.Id_Sesion());

                if(response.first() < 0){
                    System.err.println(response.second());
                }
            }
        }
        
        this.Limpiar();
        
        System.gc();
        System.exit(0);
        
    }
    
    public static void Colorear() {
        visualizador_JPanel.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel visualizador_JPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        try {
            Image logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand_Blue.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(75, 62, Image.SCALE_SMOOTH);
            this.setIconImage(logo_Imagen);
            logo_Imagen.flush();
            
            Inicio_Sesion_General_Panel inicio_Sesion = new Inicio_Sesion_General_Panel();
            visualizador_JPanel.add("Inicio_Sesion", inicio_Sesion);

            Recuperar_Credenciales_General_Panel recuperar_Credenciales = new Recuperar_Credenciales_General_Panel();
            visualizador_JPanel.add("Recuperar_Credenciales", recuperar_Credenciales);

            Crear_Cuenta_General_Panel crear_Cuenta = new Crear_Cuenta_General_Panel();
            visualizador_JPanel.add("Crear_Cuenta", crear_Cuenta);
            
            if (!CourseRoom.Utilerias().Comprobar_Conexion_Internet()) {
                JOptionPane.showMessageDialog(null,"Mmmm...\nLo Sentimos Pero Al Parecer No Tienes Conexión A Internet","Error",JOptionPane.ERROR_MESSAGE);
                this.Limpiar();
            }

            Colorear_Componentes();
            
        } catch (IOException ex) {
            
        }
        
    }

    @Override
    public void Colorear_Componentes() {
        visualizador_JPanel.setBackground(CourseRoom.Utilerias().Primer_Color());
    }
    
    @Override
    public void Limpiar() {
        if(tablero_Estudiante != null){
            tablero_Estudiante.Limpiar();
        }
        
        if(tablero_Profesor != null){
            tablero_Profesor.Limpiar();
        }
        
        CourseRoom.Utilerias().Componente_Reproducto_Lista_Audio().mediaListPlayer().controls().stop();
        CourseRoom.Utilerias().Componente_Reproducto_Lista_Audio().mediaListPlayer().list().media().clear();
        CourseRoom.Utilerias().Componente_Reproducto_Lista_Audio().release();
        super.dispose();
    }
    
}
