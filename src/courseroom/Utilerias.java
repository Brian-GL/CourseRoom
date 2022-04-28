/*
 * Copyright (C) 2022 LENOVO
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package courseroom;

import datos.estructuras.Tripleta;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import oshi.SystemInfo;
import oshi.hardware.ComputerSystem;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.component.AudioListPlayerComponent;

/**
 *
 * @author LENOVO
 */
public class Utilerias {
    
    @SuppressWarnings("FieldMayBeFinal")
    private AudioListPlayerComponent componente_Reproducto_Lista_Audio;
    private DateTimeFormatter formato_Fecha;
    private Color primer_Color, primer_Color_Fuente;
    private Color tercer_Color, tercer_Color_Fuente;
    private Color segundo_Color, segundo_Color_Fuente;
    private Color color_Azul_Oscuro, color_Azul_Claro;
    private SystemInfo informacion_Sistema;
    private HardwareAbstractionLayer hardware;
    
    private Utilerias() {
        try{
            MediaPlayerFactory media_player_Factory = new MediaPlayerFactory();
            componente_Reproducto_Lista_Audio = new AudioListPlayerComponent(media_player_Factory);
            componente_Reproducto_Lista_Audio.mediaListPlayer().mediaPlayer().setMediaPlayer(media_player_Factory.mediaPlayers().newMediaPlayer());
            componente_Reproducto_Lista_Audio.mediaListPlayer().mediaPlayer().mediaPlayer().audio().setEqualizer(media_player_Factory.equalizer().newEqualizer("Flat"));
        }
        catch(UnsatisfiedLinkError e){
            Mensaje_Error("VLC No Encontrado",
                    "Es necesario contar con VLC Media Player instalado en tu dispositivo.\nPuedes obtenerlo desde la siguiente liga:\nhttps://www.videolan.org/vlc/");
            System.exit(0);
        }
        
        formato_Fecha = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy hh:mm:ss");
        color_Azul_Oscuro = new Color(14, 30, 64);
        color_Azul_Claro = new Color(104, 194, 232);
        informacion_Sistema = new SystemInfo();
        hardware = informacion_Sistema.getHardware();
        primer_Color = tercer_Color = color_Azul_Oscuro;
        segundo_Color = color_Azul_Claro;
        primer_Color_Fuente = segundo_Color_Fuente = tercer_Color_Fuente = Color.BLACK;

    }
    
    public static Utilerias getInstance() {
        return UtileriasHolder.INSTANCE;
    }
    
    private static class UtileriasHolder {
        private static final Utilerias INSTANCE = new Utilerias();
    }
    
    public void Mensaje_Alerta(String titulo, String texto){
        Toolkit.getDefaultToolkit().beep();
        Image logo_Imagen;
        try {
            logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand_Blue.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(150, 125, Image.SCALE_SMOOTH);
            logo_Imagen.flush();
            JOptionPane optionPane = new JOptionPane(Formato_HTML_Centro(texto),JOptionPane.WARNING_MESSAGE);
            optionPane.setFont(new Font("Segoe UI",15, Font.BOLD));
            JDialog dialog = optionPane.createDialog(titulo);
            dialog.setTitle(titulo);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setFont(optionPane.getFont());
            dialog.setIconImage(logo_Imagen);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            
        }
    }
    
    public void Mensaje_Error(String titulo, String texto){
        Toolkit.getDefaultToolkit().beep();
        Image logo_Imagen;
        try {
            logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand_Blue.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(150, 125, Image.SCALE_SMOOTH);
            logo_Imagen.flush();
            JOptionPane optionPane = new JOptionPane(Formato_HTML_Centro(texto),JOptionPane.ERROR_MESSAGE);
            optionPane.setFont(new Font("Segoe UI",15, Font.BOLD));
            JDialog dialog = optionPane.createDialog(titulo);
            dialog.setTitle(titulo);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setFont(optionPane.getFont());
            dialog.setIconImage(logo_Imagen);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            
        }
    }
    
    public void Mensaje_Informativo(String titulo, String texto){
        Toolkit.getDefaultToolkit().beep();
        Image logo_Imagen;
        try {
            logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand_Blue.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(150, 125, Image.SCALE_SMOOTH);
            logo_Imagen.flush();
            JOptionPane optionPane = new JOptionPane(Formato_HTML_Centro(texto),JOptionPane.INFORMATION_MESSAGE);
            optionPane.setFont(new Font("Segoe UI",15, Font.BOLD));
            JDialog dialog = optionPane.createDialog(titulo);
            dialog.setTitle(titulo);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setFont(optionPane.getFont());
            dialog.setIconImage(logo_Imagen);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            
        }
        
    }
    
    public String DireccionIP() throws MalformedURLException, IOException{
        String ip = new String();
        URL whatismyip = new URL("https://checkip.amazonaws.com");

        try(InputStreamReader input_Stream = new InputStreamReader(whatismyip.openStream())){

            try(BufferedReader in = new BufferedReader(input_Stream)){
                ip = in.readLine();
            }

        }

        return ip;
    }

    public byte[] Bytes_Imagen(Image imagen){

        if(imagen != null){
            try {
                PixelGrabber obtener_Pixeles = new PixelGrabber(imagen, 0, 0, -1, -1, false);
                if (obtener_Pixeles.grabPixels()) {
                    int[] pixeles = (int[]) obtener_Pixeles.getPixels();
                    ByteBuffer out = ByteBuffer.allocate(pixeles.length * 4);
                    out.order(ByteOrder.nativeOrder());
                    for (int i = 0; i < pixeles.length; i++) {
                        out.putInt(pixeles[i]);
                    }
                    out.flip();
                    return out.array();
                }
            } catch (InterruptedException ex) {
                return new byte[]{};
            }

            return new byte[]{};
        }
        else {
            return new byte[]{};
        }

    }

    public Integer Altura_Fila_Tabla(Integer numero_Letras){
        return (Integer)((numero_Letras/60) * 20) + 44;
    }

    public Integer Altura_Fila_Tabla_Icono(Integer numero_Letras){
        return (Integer)((numero_Letras/60) * 20) + 96;
    }

    public DateTimeFormatter Formato_Fecha(){
        return formato_Fecha;
    }

    public String Fecha_Hora_Local(){
        return LocalDateTime.now().format(formato_Fecha);
    }

    public String Fecha(LocalDate fecha){
        Integer year = fecha.getYear();
        Integer month = fecha.getMonthValue();
        Integer day = fecha.getDayOfMonth();
        return LocalDateTime.of(year, month,day,0,0,0).format(formato_Fecha);
    }
    
    public String Fecha_Hora(LocalDate fecha, LocalTime hora){
        Integer year = fecha.getYear();
        Integer month = fecha.getMonthValue();
        Integer day = fecha.getDayOfMonth();
        Integer hour = hora.getHour();
        Integer minutes = hora.getMinute();
        Integer seconds = hora.getSecond();
        return LocalDateTime.of(year, month,day,hour,minutes,seconds).format(formato_Fecha);
    }

    public AudioListPlayerComponent Componente_Reproducto_Lista_Audio() {
        return componente_Reproducto_Lista_Audio;
    }

    public Color Segundo_Color() {
        return segundo_Color;
    }

    public void Segundo_Color(Color color) {
        segundo_Color = color;
    }

    public Color Segundo_Color_Fuente() {
        return segundo_Color_Fuente;
    }

    public void Segundo_Color_Fuente(Color color) {
        segundo_Color_Fuente = color;
    }

    public Color Tercer_Color_Fuente() {
        return tercer_Color_Fuente;
    }

    public void Tercer_Color_Fuente(Color color) {
        tercer_Color_Fuente = color;
    }

    public Color Primer_Color_Fuente() {
        return primer_Color_Fuente;
    }

    public void Primer_Color_Fuente(Color color) {
        primer_Color_Fuente = color;
    }

    public Color Tercer_Color() {
        return tercer_Color;
    }

    public void Tercer_Color(Color color) {
        tercer_Color = color;
    }

    public Color Primer_Color() {
        return primer_Color;
    }

    public void Primer_Color(Color color) {
        primer_Color = color;
    }

    public Color Color_Azul_Oscuro() {
        return color_Azul_Oscuro;
    }

    public Color Color_Azul_Claro() {
        return color_Azul_Claro;
    }


    public ComputerSystem getComputerSystem() {
        return hardware.getComputerSystem();
    }

    public List<NetworkIF> getNetworkIFs() {
        return hardware.getNetworkIFs();
    }

    public List<NetworkIF> getNetworkIFs(boolean includeLocalInterfaces) {
        return hardware.getNetworkIFs(includeLocalInterfaces);
    }

    public String Concatenar(String cadena, String... args) {
        StringBuilder constructor_Cadena = new StringBuilder(cadena);
        for (String arg : args) {
            constructor_Cadena.append(arg);
        }
        return constructor_Cadena.toString();
    }

    public String Formato_HTML_Izquierda(String text) {
        return Concatenar("<html><div style='text-align:left;'>", text, "</div></html>");
    }

    public String Formato_HTML_Centro_Izquierda(String text) {
        return Concatenar("<html><div style='text-align:left; align-items: center; justify-content: center;'><p>",
                text, "</p></div></html>");
    }

    public String Formato_HTML_Derecha(String text) {
        return Concatenar("<html><div style='text-align:right;'>", text, "</div></html>");
    }

    public String Formato_HTML_Centro(String text) {
        return Concatenar("<html><div style='text-align:center;'>", text, "</div></html>");
    }

    public String Formato_HTML_Central(String text) {
        return Concatenar("<html><div style='text-align:center; align-items: center; justify-content: center;'><p>",
                text, "</p></div></html>");
    }

    public String Formato_HTML_Central_Inicio(String text) {
        return Concatenar("<html><div style='text-align:center; align-items: start; justify-content: flex-start;'><p>",
                text, "</p></div></html>");
    }

    public String RGB_Cadena(Color color) {
        return Concatenar("RGB: (",
                String.valueOf(color.getRed()), ",",
                String.valueOf(color.getGreen()), ",",
                String.valueOf(color.getBlue()), ")");
    }

    public String Concatenar(String cadena, Integer to) {
        StringBuilder constructor_Cadena = new StringBuilder(cadena);
        constructor_Cadena.append(to);
        return constructor_Cadena.toString();
    }

    public String Convertir_Segundos(Integer segundos) {
        Integer segundos_Absolutos = Math.abs(segundos);
        String valor_Positivo = String.format("%02d:%02d:%02d", segundos_Absolutos / 3600, (segundos_Absolutos % 3600) / 60, segundos_Absolutos % 60);
        return segundos < 0 ? Concatenar("-", valor_Positivo) : valor_Positivo;
    }

    public boolean Comprobar_Conexion_Internet() {
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

    public boolean Regex_Correo_Electronico_Valido(String value){
        return Pattern.compile("[ -~]+@[ -~]+", Pattern.CASE_INSENSITIVE).matcher(value).find();
    }

    public String Decodificacion(String codificacion){

        byte[] decoded = Base64.getDecoder().decode(codificacion);

        return new String(decoded);
    }

    public String Codificacion(String decodificacion){

        byte[] bytes = decodificacion.getBytes();
        bytes = Base64.getEncoder().encode(bytes);
        return new String(bytes);
    }

    public void Abrir_Archivo(File archivo){

//        try{
//            switch (extension) {
//                case "pdf":
//                    Lector_PDF_General_Frame lector_PDF_General_Frame =
//                            new Lector_PDF_General_Frame(ruta);
//                    lector_PDF_General_Frame.setVisible(true);
//                    break;
//                case "mp4":
//                case "webm":
//                case "mkv":
//                case "wmv":
//                case "3gp":
//                case "avi":
//                case "ogg":
//                    Lector_Video_General_Panel lector_Video_General_Panel =
//                            new Lector_Video_General_Panel(ruta, nombre_Archivo);
//                    lector_Video_General_Panel.setVisible(true);
//                    break;
//                case "mp3":
//                case "aac":
//                case "ac3":
//                case "flac":
//                case "opus":
//                case "alac":
//                case "amr":
//                case "wma":
//                case "m4a":
//                case "aiff":
//                    Lector_Audio_General_Frame lector_Audio_General_Frame =
//                            new Lector_Audio_General_Frame(ruta, nombre_Archivo);
//                    lector_Audio_General_Frame.setVisible(true);
//                    break;
//                case "png":
//                case "jpeg":
//                case "jpg":
//                case "bmp":
//                        //Cargar imagen
//                        java.io.File archivo_Imagen = new java.io.File(ruta);
//                        BufferedImage imagen = ImageIO.read(archivo_Imagen);
//                        Viewer viewer = new Viewer(imagen);
//                        viewer.show();
//                        imagen.flush();
//                        imagen.getGraphics().dispose();
//                    break;
//                default:
//                    JOptionPane.showMessageDialog(null, "Formato De Archivo No Válido", Concatenar("Error Al Abrir El Archivo ",nombre_Archivo), JOptionPane.WARNING_MESSAGE);
//                    break;
//            }
//
//        } catch(HeadlessException | MalformedURLException ex){
//            JOptionPane.showMessageDialog(null, ex.getMessage(), Concatenar("Error Encontrado Al Abrir El Archivo ",nombre_Archivo), JOptionPane.ERROR_MESSAGE);
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), Concatenar("Error Encontrado Al Abrir El Archivo ",nombre_Archivo), JOptionPane.ERROR_MESSAGE);
//        }

        try{
            Desktop.getDesktop().open(archivo);
        } catch(IOException e){
            try {
                Runtime.getRuntime().exec(Concatenar("explorer.exe/select,",archivo.getAbsolutePath()));
            } catch (IOException ex) {
                
            }
        }

    }
    
    public Tripleta<Integer, Integer, Integer> Fecha(String fecha){
        Tripleta<Integer, Integer, Integer> tripleta = new Tripleta<>(-1,-1,-1);
        try{
            
            Integer dia = Integer.parseInt(Sub_Cadena(fecha, -19, 2));
            Integer mes = Integer.parseInt(Sub_Cadena(fecha, -16, 2));
            Integer anio = Integer.parseInt(Sub_Cadena(fecha, -13, 4));
            tripleta.first(dia);
            tripleta.second(mes);
            tripleta.third(anio);
        }
        catch(NumberFormatException ex){
            return tripleta;
        }
        
        return tripleta;
    }

    public String Sub_Cadena(String cadena, Integer indice, Integer cantidad){
        indice = cadena.length() + indice;
        String retorno = new String();
        Integer i = 0;
        while(i < cantidad){
            retorno = retorno + cadena.charAt(indice);
            indice++;
            i++;
        }
        
        return retorno;
    }
    
    private Integer Dias_Mes(Integer mes) {

        Integer dias = 0;
        
        if( mes <= 1){
            dias = 31;
        }
        if( mes <= 2){
            if (Es_Anio_Bisiesto(LocalDateTime.now().getYear())) {
                dias += 29;
            } else {
                dias += 28;
            }
        }
        if(mes <= 3){
            dias += 31;
        }
        if(mes <= 4){
            dias += 30;
        }
        if( mes <= 5){
            dias += 31;
        }
        if( mes <= 6){
            dias += 30;
        }
        if( mes <= 7){
            dias += 31;
        }
        if( mes <= 8){
            dias += 31;
        }
        if( mes <= 9){
            dias += 30;
        }
        if( mes <= 10){
            dias += 31;
        }
        if( mes <= 11){
            dias += 30;
        }
        if( mes <= 12){
            dias += 31;
        }

        return dias;
    }
    
    private boolean Es_Anio_Bisiesto(int anio) {
        if (anio % 4 != 0) {
            return false;
        } else if (anio % 400 == 0) {
            return true;
        } else return anio % 100 != 0;
    }
    
    public String MiUidd(){
        return Codificacion(getComputerSystem().getHardwareUUID());
    }
    
    public String MiIP(){
        try {
            return Codificacion(DireccionIP());
        } catch (IOException ex) {
            return new String();
        }
    }
    
    public void Mostrar_Aviso(){
        try {
            //Obtain only one instance of the SystemTray object
            SystemTray tray = SystemTray.getSystemTray();
            
            //If the icon is a file
            Image image = ImageIO.read(getClass().getResource("/recursos/iconos/bell_warning.png"));
            //Alternative (if the icon is on the classpath):
            //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));
            
            TrayIcon trayIcon = new TrayIcon(image, "Notificación");
            //Let the system resize the image if needed
            trayIcon.setImageAutoSize(true);
            //Set tooltip text for the tray icon
            trayIcon.setToolTip("Nueva Notificación De CourseRoom");
            tray.add(trayIcon);
            
            trayIcon.displayMessage("CourseRoom", "Tienes Una Nueva Notificación", MessageType.INFO);
        } catch (AWTException | IOException ex) {
            
        }
    }
    
    public BufferedImage Obtener_Imagen(byte[] respuesta){
        BufferedImage obtener_Imagen;
        
        if(respuesta != null){
            try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(respuesta)){
                obtener_Imagen = ImageIO.read(byteArrayInputStream);
            } catch (IOException ex) { 
                obtener_Imagen = null;
            } 
        }else{
            obtener_Imagen = null;
        }
        
        return obtener_Imagen;
    }
}
