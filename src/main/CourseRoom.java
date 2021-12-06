/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.formdev.flatlaf.FlatDarkLaf;
import com.github.javafaker.Faker;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import main.CourseRoom_Frame;

/**
 *
 * @author LENOVO
 */
public class CourseRoom {
    
    private static Faker faker;
    private static Random random;
    private static Image logo_Imagen;
    private static Color tercer_Color;
    private static Color primer_Color;
    private static Color tercer_Color_Fuente;
    private static Color segundo_Color;
    private static Color primer_Color_Fuente;
    private static Color segundo_Color_Fuente;
    private static Color color_Azul_Oscuro, color_Azul_Claro;


    public CourseRoom(){
        
        boolean hay_Conexion = Comprobar_Conexion_Internet();

        if (!hay_Conexion) {
            JOptionPane.showMessageDialog(null, "Lo Sentimos Pero No Hay Conexión A Internet", "SUPER ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        random = new Random(System.currentTimeMillis());
        
        color_Azul_Oscuro = new Color(14, 30, 64);
        color_Azul_Claro = new Color(104, 194, 232);
        
        primer_Color = color_Azul_Oscuro;
        segundo_Color = CourseRoom.tercer_Color = color_Azul_Claro;
        primer_Color_Fuente = CourseRoom.segundo_Color_Fuente = CourseRoom.tercer_Color_Fuente = Color.BLACK;
        
        try {
            logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand_Blue.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(150, 125, Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            
        }

        Locale mx = new Locale("es", "MX");
        faker = new Faker(mx);
        CourseRoom_Frame courseRoom_Frame = new CourseRoom_Frame(); 
        courseRoom_Frame.setVisible(true);
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            FlatDarkLaf ui = new FlatDarkLaf();
            UIManager.setLookAndFeel(ui);
            CourseRoom courseRoom = new CourseRoom();
        } catch (UnsupportedLookAndFeelException ex) {
            
        }
    }

    public static Color Segundo_Color() {
        return segundo_Color;
    }

    public static void Segundo_Color(Color color) {
        segundo_Color = color;
    }

    public static Color Segundo_Color_Fuente() {
        return segundo_Color_Fuente;
    }

    public static void Segundo_Color_Fuente(Color color) {
        segundo_Color_Fuente = color;
    }

    public static Color Tercer_Color_Fuente() {
        return tercer_Color_Fuente;
    }

    public static void Tercer_Color_Fuente(Color color) {
        tercer_Color_Fuente = color;
    }

    public static Color Primer_Color_Fuente() {
        return primer_Color_Fuente;
    }

    public static void Primer_Color_Fuente(Color color) {
        primer_Color_Fuente = color;
    }

    public static Color Tercer_Color() {
        return tercer_Color;
    }

    public static void Tercer_Color(Color color) {
        tercer_Color = color;
    }

    public static Color Primer_Color() {
        return primer_Color;
    }

    public static void Primer_Color(Color color) {
        primer_Color = color;
    }
    
    public static Color Color_Azul_Oscuro() {
        return color_Azul_Oscuro;
    }

    public static Color Color_Azul_Claro() {
        return color_Azul_Claro;
    }
    


    /**
     * @return the faker
     */
    public static Faker Faker() {
       return faker;
    }
    
    /**
     * @return the random
     */
    public static Random Random() {
       return random;
    }
    
     /**
     * @return the logo_Imagen
     */
    public static Image Logo_Imagen() {
        return logo_Imagen;
    }
    
    public static String Formato_HTML_Izquierda(String text) {
        return Concatenar("<html><div style='text-align:left;'>",text,"</div></html>");
    }

    public static String Formato_HTML_Derecha(String text) {
        return Concatenar("<html><div style='text-align:right;'>",text,"</div></html>");
    }

    public static String Formato_HTML_Centro(String text) {
        return Concatenar("<html><div style='text-align:center;'>", text, "</div></html>");
    }
    
    public static String Formato_HTML_Central(String text) {
        return Concatenar("<html><div style='text-align:center; display:flex; justify-content:center; align-items: center;'>", text, "</div></html>");
    }
    
    public static String RGB_Cadena(Color color) {
        return CourseRoom.Concatenar("RGB: (",
                String.valueOf(color.getRed()), ",", 
                String.valueOf(color.getGreen()), ",",
                String.valueOf(color.getBlue()), ")");
    }

    public static String Concatenar(String cadena, String... args) {
        StringBuilder constructor_Cadena = new StringBuilder(cadena);
        String argumento;
        for (int i = 0; i < args.length; i++) {
            argumento = args[i];
            constructor_Cadena.append(argumento);
        }
        return constructor_Cadena.toString();
    }

    public static String Concatenar(String cadena, int to) {
        StringBuilder constructor_Cadena = new StringBuilder(cadena);
        constructor_Cadena.append(to);
        return constructor_Cadena.toString();
    }

    public static String Convertir_Segundos(long segundos) {
        long segundos_Absolutos = Math.abs(segundos);
        String valor_Positivo = String.format("%02d:%02d:%02d", segundos_Absolutos / 3600, (segundos_Absolutos % 3600) / 60, segundos_Absolutos % 60);
        return segundos < 0 ? CourseRoom.Concatenar("-", valor_Positivo) : valor_Positivo;
    }

    public static boolean Comprobar_Conexion_Internet() {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection conexion = url.openConnection();
            conexion.connect();
            return true;
        } catch (MalformedURLException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }
    
}
