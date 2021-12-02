/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaces.Limpieza_Interface;
import java.awt.CardLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import paneles.generales.Inicio_Sesion_General_Panel;
import paneles.generales.Recuperar_Credenciales_General_Panel;
import paneles.generales.Crear_Cuenta_General_Panel;
import paneles.estudiantes.Tablero_Estudiante_Panel;

/**
 *
 * @author LENOVO
 */
public class CourseRoom_Frame extends javax.swing.JFrame implements Limpieza_Interface {

    private static Inicio_Sesion_General_Panel inicio_Sesion;
    private static Recuperar_Credenciales_General_Panel recuperar_Credenciales;
    private static Crear_Cuenta_General_Panel crear_Cuenta;
    private static Tablero_Estudiante_Panel tablero_Estudiante;
    private static CardLayout layout_Tarjeta;


    /**
     * Creates new form MainFrame
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public CourseRoom_Frame() {

        initComponents();

        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);

        this.setIconImage(CourseRoom.Logo_Imagen());

        visualizador_JPanel.setBackground(CourseRoom.Primer_Color());
        inicio_Sesion = new Inicio_Sesion_General_Panel();
        visualizador_JPanel.add("inicio_Sesion", inicio_Sesion);

        recuperar_Credenciales = new Recuperar_Credenciales_General_Panel();
        visualizador_JPanel.add("recuperar_Credenciales", recuperar_Credenciales);

        crear_Cuenta = new Crear_Cuenta_General_Panel();

        //teacherDashboardPanel = new Teacher_Dashboard_Panel();
        //jPanelViewer.add("dashboard",teacherDashboardPanel);
        

        visualizador_JPanel.add("crear_Cuenta", crear_Cuenta);

        layout_Tarjeta = (CardLayout) visualizador_JPanel.getLayout();

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visualizador_JPanel = new javax.swing.JPanel();

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

    public static void Mostrar_Inicio_Sesion() {
        layout_Tarjeta.show(visualizador_JPanel, "inicio_Sesion");
    }

    public static void Mostrar_Recuperar_Credenciales() {
        layout_Tarjeta.show(visualizador_JPanel, "recuperar_Credenciales");
    }

    public static void Mostrar_Crear_Cuenta() {
        layout_Tarjeta.show(visualizador_JPanel, "crear_Cuenta");
    }

    public static void Mostrar_Tablero() {
        tablero_Estudiante = new Tablero_Estudiante_Panel();
        visualizador_JPanel.add("Tablero", tablero_Estudiante);
        Tablero_Estudiante_Panel.Establecer_Colores();
        layout_Tarjeta.show(visualizador_JPanel, "Tablero");
    }

    public static void Cerrar_Sesion() {
        CourseRoom.Primer_Color(CourseRoom.Color_Azul_Oscuro());
        CourseRoom.Segundo_Color(CourseRoom.Color_Azul_Claro());
        CourseRoom.Tercer_Color(CourseRoom.Color_Azul_Claro());
        visualizador_JPanel.setBackground(CourseRoom.Color_Azul_Oscuro());
        Mostrar_Inicio_Sesion();
        System.gc();
    }
    
    public static void Colorear() {
        //jPanelViewer.repaint();
        visualizador_JPanel.setBackground(CourseRoom.Primer_Color());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel visualizador_JPanel;
    // End of variables declaration//GEN-END:variables

    /*General Static Methods*/

    @Override
    public void Limpiar() {
        tablero_Estudiante.Limpiar();
        recuperar_Credenciales.Limpiar();
        super.dispose();
    }

}
