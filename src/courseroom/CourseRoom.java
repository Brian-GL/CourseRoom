/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseroom;

 // <editor-fold defaultstate="collapsed" desc="Paquetes">

import com.formdev.flatlaf.FlatDarkLaf;
import com.github.javafaker.Address;
import com.github.javafaker.Ancient;
import com.github.javafaker.Animal;
import com.github.javafaker.App;
import com.github.javafaker.AquaTeenHungerForce;
import com.github.javafaker.Artist;
import com.github.javafaker.Avatar;
import com.github.javafaker.Aviation;
import com.github.javafaker.BackToTheFuture;
import com.github.javafaker.Beer;
import com.github.javafaker.Book;
import com.github.javafaker.Bool;
import com.github.javafaker.Buffy;
import com.github.javafaker.Business;
import com.github.javafaker.Cat;
import com.github.javafaker.ChuckNorris;
import com.github.javafaker.Code;
import com.github.javafaker.Commerce;
import com.github.javafaker.Company;
import com.github.javafaker.Country;
import com.github.javafaker.Crypto;
import com.github.javafaker.Currency;
import com.github.javafaker.DateAndTime;
import com.github.javafaker.Demographic;
import com.github.javafaker.Dog;
import com.github.javafaker.DragonBall;
import com.github.javafaker.Dune;
import com.github.javafaker.Educator;
import com.github.javafaker.ElderScrolls;
import com.github.javafaker.Esports;
import com.github.javafaker.Faker;
import com.github.javafaker.File;
import com.github.javafaker.Finance;
import com.github.javafaker.Food;
import com.github.javafaker.Friends;
import com.github.javafaker.FunnyName;
import com.github.javafaker.GameOfThrones;
import com.github.javafaker.Hacker;
import com.github.javafaker.HarryPotter;
import com.github.javafaker.Hipster;
import com.github.javafaker.HitchhikersGuideToTheGalaxy;
import com.github.javafaker.Hobbit;
import com.github.javafaker.HowIMetYourMother;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Internet;
import com.github.javafaker.Job;
import com.github.javafaker.LeagueOfLegends;
import com.github.javafaker.Lebowski;
import com.github.javafaker.LordOfTheRings;
import com.github.javafaker.Lorem;
import com.github.javafaker.Matz;
import com.github.javafaker.Medical;
import com.github.javafaker.Music;
import com.github.javafaker.Name;
import com.github.javafaker.Nation;
import com.github.javafaker.Options;
import com.github.javafaker.Overwatch;
import com.github.javafaker.PhoneNumber;
import com.github.javafaker.Pokemon;
import com.github.javafaker.PrincessBride;
import com.github.javafaker.ProgrammingLanguage;
import com.github.javafaker.Relationships;
import com.github.javafaker.RickAndMorty;
import com.github.javafaker.Robin;
import com.github.javafaker.RockBand;
import com.github.javafaker.Shakespeare;
import com.github.javafaker.SlackEmoji;
import com.github.javafaker.Space;
import com.github.javafaker.StarTrek;
import com.github.javafaker.Stock;
import com.github.javafaker.Superhero;
import com.github.javafaker.Team;
import com.github.javafaker.TwinPeaks;
import com.github.javafaker.University;
import com.github.javafaker.Weather;
import com.github.javafaker.Witcher;
import com.github.javafaker.Yoda;
import com.github.javafaker.Zelda;
import com.github.javafaker.service.RandomService;
import frames.generales.Lector_Audio_General_Frame;
import frames.generales.Lector_PDF_General_Frame;
import frames.generales.Lector_Video_General_Panel;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Vector;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.xmlrpc.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.Display;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.LogicalVolumeGroup;
import oshi.hardware.NetworkIF;
import oshi.hardware.PowerSource;
import oshi.hardware.Sensors;
import oshi.hardware.SoundCard;
import oshi.hardware.UsbDevice;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import net.coobird.gui.simpleimageviewer4j.Viewer;
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.component.AudioListPlayerComponent;

 // </editor-fold>

/**
 *
 * @author LENOVO
 */
public class CourseRoom{
    
    public static void main(String args[]) throws UnsupportedLookAndFeelException, MalformedURLException, XmlRpcException, IOException, SQLException {
        FlatDarkLaf ui = new FlatDarkLaf();
        UIManager.setLookAndFeel(ui);
        Solicitudes.Iniciar_Solicitudes();
        Utilerias.Iniciar_Utilerias();
        CourseRoom_Frame courseRoom_Frame = new CourseRoom_Frame();
        courseRoom_Frame.setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Solicitudes">
    
    public static class Solicitudes {

        private static XmlRpcClient xmlRpcClient;

        public static void Iniciar_Solicitudes() throws MalformedURLException {
            xmlRpcClient = new XmlRpcClient("http://localhost:3030/RPC2");
        }

        public static Vector<Integer> Fecha_Hora_Servidor() throws XmlRpcException, IOException {
            
            
            
            Vector parametros = new Vector();
            
            parametros.add(Utilerias.getComputerSystem().getHardwareUUID());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Fecha_Hora_Servidor", parametros);

            return (respuesta != null)? (Vector<Integer>) respuesta : new Vector<>();
          
        }
        
        public static byte[] Imagen_Inicio_Sesion() throws XmlRpcException, IOException{
            
            Vector parametros = new Vector();
            
            parametros.add(Utilerias.getComputerSystem().getHardwareUUID());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Imagen_Inicio_Sesion", parametros);

            return (respuesta != null)? (byte[]) respuesta : new byte[]{};
        }
       
        public static Boolean Recuperar_Credenciales(String correo_Electronico) throws XmlRpcException, IOException{
            
            Vector parametros = new Vector();
            
            parametros.add(correo_Electronico);
            parametros.add(Utilerias.getComputerSystem().getHardwareUUID());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Recuperar_Credenciales", parametros);
            

            return (respuesta != null)? (Boolean) respuesta : false;
        }
        
    }

    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Utilerias">
    
    public static class Utilerias {

        private static Faker faker;
        
        private static AudioListPlayerComponent componente_Reproducto_Lista_Audio;
        private static DateTimeFormatter formato_Fecha;
        private static Color primer_Color, primer_Color_Fuente;
        private static Color tercer_Color,tercer_Color_Fuente;
        private static Color segundo_Color, segundo_Color_Fuente;
        private static Color color_Azul_Oscuro, color_Azul_Claro;
        private static SystemInfo informacion_Sistema ;
        private static HardwareAbstractionLayer hardware;

        public static void Iniciar_Utilerias() {
            
            try{
                MediaPlayerFactory media_player_Factory = new MediaPlayerFactory();
                componente_Reproducto_Lista_Audio = new AudioListPlayerComponent(media_player_Factory);
                componente_Reproducto_Lista_Audio.mediaListPlayer().mediaPlayer().setMediaPlayer(media_player_Factory.mediaPlayers().newMediaPlayer());
                componente_Reproducto_Lista_Audio.mediaListPlayer().mediaPlayer().mediaPlayer().audio().setEqualizer(media_player_Factory.equalizer().newEqualizer("Flat"));
            }
            catch(Exception exception){
                JOptionPane.showMessageDialog(null, 
                        "Es necesario contar con VLC Media Player instalado en tu dispositivo.\nPuedes obtenerlo desde la siguiente liga:\nhttps://www.videolan.org/vlc/",
                        "Error Encontrado", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            
            formato_Fecha = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy hh:mm:ss a");
            color_Azul_Oscuro = new Color(14, 30, 64);
            color_Azul_Claro = new Color(104, 194, 232);
            informacion_Sistema = new SystemInfo();
            hardware = informacion_Sistema.getHardware();
            primer_Color = color_Azul_Oscuro;
            segundo_Color = tercer_Color = color_Azul_Claro;
            primer_Color_Fuente = segundo_Color_Fuente = tercer_Color_Fuente = Color.BLACK;

            Locale local = new Locale("es", "MX");
            faker = new Faker(local);
        }
        
        public static int Altura_Fila_Tabla(int numero_Letras){
            return (int)((numero_Letras/60) * 20) + 36;
        }
        
        public static DateTimeFormatter Formato_Fecha(){
            return formato_Fecha;
        }
        
        public static String Fecha_Hora_Local(){
            String retorno = LocalDateTime.now().format(formato_Fecha);
            retorno = retorno.toUpperCase();
            return retorno;
        }

        public static AudioListPlayerComponent Componente_Reproducto_Lista_Audio() {
            return componente_Reproducto_Lista_Audio;
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

        public static Faker instance() {
            return Faker.instance();
        }

        public static Faker instance(Locale locale) {
            return Faker.instance(locale);
        }

        public static Faker instance(Random random) {
            return Faker.instance(random);
        }

        public static Faker instance(Locale locale, Random random) {
            return Faker.instance(locale, random);
        }

        public static String numerify(String numberString) {
            return faker.numerify(numberString);
        }

        public static String letterify(String letterString) {
            return faker.letterify(letterString);
        }

        public static String letterify(String letterString, boolean isUpper) {
            return faker.letterify(letterString, isUpper);
        }

        public static String bothify(String string) {
            return faker.bothify(string);
        }

        public static String bothify(String string, boolean isUpper) {
            return faker.bothify(string, isUpper);
        }

        public static String regexify(String regex) {
            return faker.regexify(regex);
        }

        public static RandomService random() {
            return faker.random();
        }

        public static Currency currency() {
            return faker.currency();
        }

        public static Ancient ancient() {
            return faker.ancient();
        }

        public static App app() {
            return faker.app();
        }

        public static Artist artist() {
            return faker.artist();
        }

        public static Avatar avatar() {
            return faker.avatar();
        }

        public static Aviation aviation() {
            return faker.aviation();
        }

        public static Music music() {
            return faker.music();
        }

        public static Name name() {
            return faker.name();
        }

        public static com.github.javafaker.Number number() {
            return faker.number();
        }

        public static Internet internet() {
            return faker.internet();
        }

        public static PhoneNumber phoneNumber() {
            return faker.phoneNumber();
        }

        public static Pokemon pokemon() {
            return faker.pokemon();
        }

        public static Lorem lorem() {
            return faker.lorem();
        }

        public static Address address() {
            return faker.address();
        }

        public static Book book() {
            return faker.book();
        }

        public static Buffy buffy() {
            return faker.buffy();
        }

        public static Business business() {
            return faker.business();
        }

        public static ChuckNorris chuckNorris() {
            return faker.chuckNorris();
        }

        public static com.github.javafaker.Color color() {
            return faker.color();
        }

        public static Commerce commerce() {
            return faker.commerce();
        }

        public static Company company() {
            return faker.company();
        }

        public static Crypto crypto() {
            return faker.crypto();
        }

        public static Hacker hacker() {
            return faker.hacker();
        }

        public static IdNumber idNumber() {
            return faker.idNumber();
        }

        public static Options options() {
            return faker.options();
        }

        public static Code code() {
            return faker.code();
        }

        public static File file() {
            return faker.file();
        }

        public static Finance finance() {
            return faker.finance();
        }

        public static Food food() {
            return faker.food();
        }

        public static ElderScrolls elderScrolls() {
            return faker.elderScrolls();
        }

        public static GameOfThrones gameOfThrones() {
            return faker.gameOfThrones();
        }

        public static DateAndTime date() {
            return faker.date();
        }

        public static Demographic demographic() {
            return faker.demographic();
        }

        public static Dog dog() {
            return faker.dog();
        }

        public static Educator educator() {
            return faker.educator();
        }

        public static SlackEmoji slackEmoji() {
            return faker.slackEmoji();
        }

        public static Shakespeare shakespeare() {
            return faker.shakespeare();
        }

        public static Space space() {
            return faker.space();
        }

        public static Superhero superhero() {
            return faker.superhero();
        }

        public static Bool bool() {
            return faker.bool();
        }

        public static Team team() {
            return faker.team();
        }

        public static Beer beer() {
            return faker.beer();
        }

        public static University university() {
            return faker.university();
        }

        public static Cat cat() {
            return faker.cat();
        }

        public static Stock stock() {
            return faker.stock();
        }

        public static LordOfTheRings lordOfTheRings() {
            return faker.lordOfTheRings();
        }

        public static Zelda zelda() {
            return faker.zelda();
        }

        public static HarryPotter harryPotter() {
            return faker.harryPotter();
        }

        public static RockBand rockBand() {
            return faker.rockBand();
        }

        public static Esports esports() {
            return faker.esports();
        }

        public static Friends friends() {
            return faker.friends();
        }

        public static Hipster hipster() {
            return faker.hipster();
        }

        public static Job job() {
            return faker.job();
        }

        public static TwinPeaks twinPeaks() {
            return faker.twinPeaks();
        }

        public static RickAndMorty rickAndMorty() {
            return faker.rickAndMorty();
        }

        public static Yoda yoda() {
            return faker.yoda();
        }

        public static Matz matz() {
            return faker.matz();
        }

        public static Witcher witcher() {
            return faker.witcher();
        }

        public static DragonBall dragonBall() {
            return faker.dragonBall();
        }

        public static FunnyName funnyName() {
            return faker.funnyName();
        }

        public static HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy() {
            return faker.hitchhikersGuideToTheGalaxy();
        }

        public static Hobbit hobbit() {
            return faker.hobbit();
        }

        public static HowIMetYourMother howIMetYourMother() {
            return faker.howIMetYourMother();
        }

        public static LeagueOfLegends leagueOfLegends() {
            return faker.leagueOfLegends();
        }

        public static Overwatch overwatch() {
            return faker.overwatch();
        }

        public static Robin robin() {
            return faker.robin();
        }

        public static StarTrek starTrek() {
            return faker.starTrek();
        }

        public static Weather weather() {
            return faker.weather();
        }

        public static Lebowski lebowski() {
            return faker.lebowski();
        }

        public static Medical medical() {
            return faker.medical();
        }

        public static Country country() {
            return faker.country();
        }

        public static Animal animal() {
            return faker.animal();
        }

        public static BackToTheFuture backToTheFuture() {
            return faker.backToTheFuture();
        }

        public static PrincessBride princessBride() {
            return faker.princessBride();
        }

        public static Relationships relationships() {
            return faker.relationships();
        }

        public static Nation nation() {
            return faker.nation();
        }

        public static Dune dune() {
            return faker.dune();
        }

        public static AquaTeenHungerForce aquaTeenHungerForce() {
            return faker.aquaTeenHungerForce();
        }

        public static ProgrammingLanguage programmingLanguage() {
            return faker.programmingLanguage();
        }

        public static String resolve(String key) {
            return faker.resolve(key);
        }

        public static String expression(String expression) {
            return faker.expression(expression);
        }
        
        public static ComputerSystem getComputerSystem() {
            return hardware.getComputerSystem();
        }

        public static CentralProcessor getProcessor() {
            return hardware.getProcessor();
        }

        public static GlobalMemory getMemory() {
            return hardware.getMemory();
        }

        public static List<PowerSource> getPowerSources() {
            return hardware.getPowerSources();
        }

        public static List<HWDiskStore> getDiskStores() {
            return hardware.getDiskStores();
        }

        public static List<LogicalVolumeGroup> getLogicalVolumeGroups() {
            return hardware.getLogicalVolumeGroups();
        }

        public static List<NetworkIF> getNetworkIFs() {
            return hardware.getNetworkIFs();
        }

        public static List<NetworkIF> getNetworkIFs(boolean includeLocalInterfaces) {
            return hardware.getNetworkIFs(includeLocalInterfaces);
        }

        public static List<Display> getDisplays() {
            return hardware.getDisplays();
        }

        public static Sensors getSensors() {
            return hardware.getSensors();
        }

        public static List<UsbDevice> getUsbDevices(boolean tree) {
            return hardware.getUsbDevices(tree);
        }

        public static List<SoundCard> getSoundCards() {
            return hardware.getSoundCards();
        }

        public static List<GraphicsCard> getGraphicsCards() {
            return hardware.getGraphicsCards();
        }

        public static String Concatenar(String cadena, String... args) {
            StringBuilder constructor_Cadena = new StringBuilder(cadena);
            for (String arg : args) {
                constructor_Cadena.append(arg);
            }
            return constructor_Cadena.toString();
        }

        public static String Formato_HTML_Izquierda(String text) {
            return Concatenar("<html><div style='text-align:left;'>", text, "</div></html>");
        }

        public static String Formato_HTML_Centro_Izquierda(String text) {
            return Concatenar("<html><div style='text-align:left; align-items: center; justify-content: center;'><p>",
                    text, "</p></div></html>");
        }

        public static String Formato_HTML_Derecha(String text) {
            return Concatenar("<html><div style='text-align:right;'>", text, "</div></html>");
        }

        public static String Formato_HTML_Centro(String text) {
            return Concatenar("<html><div style='text-align:center;'>", text, "</div></html>");
        }

        public static String Formato_HTML_Central(String text) {
            return Concatenar("<html><div style='text-align:center; align-items: center; justify-content: center;'><p>",
                    text, "</p></div></html>");
        }

        public static String RGB_Cadena(Color color) {
            return Concatenar("RGB: (",
                    String.valueOf(color.getRed()), ",",
                    String.valueOf(color.getGreen()), ",",
                    String.valueOf(color.getBlue()), ")");
        }

        public static String Concatenar(String cadena, int to) {
            StringBuilder constructor_Cadena = new StringBuilder(cadena);
            constructor_Cadena.append(to);
            return constructor_Cadena.toString();
        }

        public static String Convertir_Segundos(long segundos) {
            long segundos_Absolutos = Math.abs(segundos);
            String valor_Positivo = String.format("%02d:%02d:%02d", segundos_Absolutos / 3600, (segundos_Absolutos % 3600) / 60, segundos_Absolutos % 60);
            return segundos < 0 ? Concatenar("-", valor_Positivo) : valor_Positivo;
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
        
        
        public static void Abrir_Archivo(String ruta, String extension, String nombre_Archivo){
            switch (extension) {
                case "pdf":
                    try {
                        Lector_PDF_General_Frame lector_PDF_General_Frame =
                                new Lector_PDF_General_Frame(ruta);
                    } catch (MalformedURLException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), Concatenar("Error Encontrado Al Abrir El PDF ",nombre_Archivo), JOptionPane.ERROR_MESSAGE);
                    }   break;
                case "mp4":
                case "webm":
                case "mkv":
                case "wmv":
                case "3gp":
                case "avi":
                case "ogg":
                    Lector_Video_General_Panel lector_Video_General_Panel =
                            new Lector_Video_General_Panel(ruta, nombre_Archivo);
                    break;
                case "mp3":
                case "aac":
                case "ac3":
                case "flac":
                case "opus":
                case "alac":
                case "amr":
                case "wma":
                case "m4a":
                case "aiff":
                    Lector_Audio_General_Frame lector_Audio_General_Frame =
                            new Lector_Audio_General_Frame(ruta, nombre_Archivo);
                    break;
                case "png":
                case "jpeg":
                case "jpg":
                case "bmp":
                    try {
                        //Cargar imagen
                        java.io.File archivo_Imagen = new java.io.File(ruta);
                        BufferedImage imagen = ImageIO.read(archivo_Imagen);
                        Viewer viewer = new Viewer(imagen);
                        viewer.show();
                        imagen.flush();
                        imagen.getGraphics().dispose();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), Concatenar("Error Encontrado Al Abrir La Imagen ",nombre_Archivo), JOptionPane.ERROR_MESSAGE);
                    }   break;
                default:
                    JOptionPane.showMessageDialog(null, Concatenar("Error Al Abrir El Archivo ",nombre_Archivo), "Formato De Archivo No Válido", JOptionPane.WARNING_MESSAGE);
                    break;
            }
            
        }

    }
    
    // </editor-fold>
    
}
