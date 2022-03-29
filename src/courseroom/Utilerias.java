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
import datos.estructuras.Tripleta;
import frames.generales.Lector_Audio_General_Frame;
import frames.generales.Lector_PDF_General_Frame;
import frames.generales.Lector_Video_General_Panel;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import net.coobird.gui.simpleimageviewer4j.Viewer;
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
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.component.AudioListPlayerComponent;

/**
 *
 * @author LENOVO
 */
public class Utilerias {
    
    @SuppressWarnings("FieldMayBeFinal")
    private Faker faker;
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
        catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Es necesario contar con VLC Media Player instalado en tu dispositivo.\nPuedes obtenerlo desde la siguiente liga:\nhttps://www.videolan.org/vlc/",
                    "Error Encontrado", JOptionPane.ERROR_MESSAGE);
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

        Locale local = new Locale("es", "MX");
        faker = new Faker(local);
        
    }
    
    public static Utilerias getInstance() {
        return UtileriasHolder.INSTANCE;
    }
    
    private static class UtileriasHolder {
        private static final Utilerias INSTANCE = new Utilerias();
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

    public String Fecha_Hora(java.util.Date fecha){
        Integer year = fecha.getYear();
        Integer month = fecha.getMonth()+1;
        Integer day = fecha.getDate();
        Integer hours = fecha.getHours();
        Integer minutes = fecha.getMinutes();
        Integer seconds = fecha.getSeconds();
        return LocalDateTime.of(year, month, day, hours, minutes, seconds).format(formato_Fecha);
    }

    public String Fecha(LocalDate fecha){
        Integer year = fecha.getYear();
        Integer month = fecha.getMonthValue();
        Integer day = fecha.getDayOfMonth();
        return LocalDateTime.of(year, month,day,0,0,0).format(formato_Fecha);
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

    public Faker instance() {
        return Faker.instance();
    }

    public Faker instance(Locale locale) {
        return Faker.instance(locale);
    }

    public Faker instance(Random random) {
        return Faker.instance(random);
    }

    public Faker instance(Locale locale, Random random) {
        return Faker.instance(locale, random);
    }

    public String numerify(String numberString) {
        return faker.numerify(numberString);
    }

    public String letterify(String letterString) {
        return faker.letterify(letterString);
    }

    public String letterify(String letterString, boolean isUpper) {
        return faker.letterify(letterString, isUpper);
    }

    public String bothify(String String) {
        return faker.bothify(String);
    }

    public String bothify(String String, boolean isUpper) {
        return faker.bothify(String, isUpper);
    }

    public String regexify(String regex) {
        return faker.regexify(regex);
    }

    public RandomService random() {
        return faker.random();
    }

    public Currency currency() {
        return faker.currency();
    }

    public Ancient ancient() {
        return faker.ancient();
    }

    public App app() {
        return faker.app();
    }

    public Artist artist() {
        return faker.artist();
    }

    public Avatar avatar() {
        return faker.avatar();
    }

    public Aviation aviation() {
        return faker.aviation();
    }

    public Music music() {
        return faker.music();
    }

    public Name name() {
        return faker.name();
    }

    public com.github.javafaker.Number number() {
        return faker.number();
    }

    public Internet internet() {
        return faker.internet();
    }

    public PhoneNumber phoneNumber() {
        return faker.phoneNumber();
    }

    public Pokemon pokemon() {
        return faker.pokemon();
    }

    public Lorem lorem() {
        return faker.lorem();
    }

    public Address address() {
        return faker.address();
    }

    public Book book() {
        return faker.book();
    }

    public Buffy buffy() {
        return faker.buffy();
    }

    public Business business() {
        return faker.business();
    }

    public ChuckNorris chuckNorris() {
        return faker.chuckNorris();
    }

    public com.github.javafaker.Color color() {
        return faker.color();
    }

    public Commerce commerce() {
        return faker.commerce();
    }

    public Company company() {
        return faker.company();
    }

    public Crypto crypto() {
        return faker.crypto();
    }

    public Hacker hacker() {
        return faker.hacker();
    }

    public IdNumber idNumber() {
        return faker.idNumber();
    }

    public Options options() {
        return faker.options();
    }

    public Code code() {
        return faker.code();
    }

    public File file() {
        return faker.file();
    }

    public Finance finance() {
        return faker.finance();
    }

    public Food food() {
        return faker.food();
    }

    public ElderScrolls elderScrolls() {
        return faker.elderScrolls();
    }

    public GameOfThrones gameOfThrones() {
        return faker.gameOfThrones();
    }

    public DateAndTime date() {
        return faker.date();
    }

    public Demographic demographic() {
        return faker.demographic();
    }

    public Dog dog() {
        return faker.dog();
    }

    public Educator educator() {
        return faker.educator();
    }

    public SlackEmoji slackEmoji() {
        return faker.slackEmoji();
    }

    public Shakespeare shakespeare() {
        return faker.shakespeare();
    }

    public Space space() {
        return faker.space();
    }

    public Superhero superhero() {
        return faker.superhero();
    }

    public Bool bool() {
        return faker.bool();
    }

    public Team team() {
        return faker.team();
    }

    public Beer beer() {
        return faker.beer();
    }

    public University university() {
        return faker.university();
    }

    public Cat cat() {
        return faker.cat();
    }

    public Stock stock() {
        return faker.stock();
    }

    public LordOfTheRings lordOfTheRings() {
        return faker.lordOfTheRings();
    }

    public Zelda zelda() {
        return faker.zelda();
    }

    public HarryPotter harryPotter() {
        return faker.harryPotter();
    }

    public RockBand rockBand() {
        return faker.rockBand();
    }

    public Esports esports() {
        return faker.esports();
    }

    public Friends friends() {
        return faker.friends();
    }

    public Hipster hipster() {
        return faker.hipster();
    }

    public Job job() {
        return faker.job();
    }

    public TwinPeaks twinPeaks() {
        return faker.twinPeaks();
    }

    public RickAndMorty rickAndMorty() {
        return faker.rickAndMorty();
    }

    public Yoda yoda() {
        return faker.yoda();
    }

    public Matz matz() {
        return faker.matz();
    }

    public Witcher witcher() {
        return faker.witcher();
    }

    public DragonBall dragonBall() {
        return faker.dragonBall();
    }

    public FunnyName funnyName() {
        return faker.funnyName();
    }

    public HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy() {
        return faker.hitchhikersGuideToTheGalaxy();
    }

    public Hobbit hobbit() {
        return faker.hobbit();
    }

    public HowIMetYourMother howIMetYourMother() {
        return faker.howIMetYourMother();
    }

    public LeagueOfLegends leagueOfLegends() {
        return faker.leagueOfLegends();
    }

    public Overwatch overwatch() {
        return faker.overwatch();
    }

    public Robin robin() {
        return faker.robin();
    }

    public StarTrek starTrek() {
        return faker.starTrek();
    }

    public Weather weather() {
        return faker.weather();
    }

    public Lebowski lebowski() {
        return faker.lebowski();
    }

    public Medical medical() {
        return faker.medical();
    }

    public Country country() {
        return faker.country();
    }

    public Animal animal() {
        return faker.animal();
    }

    public BackToTheFuture backToTheFuture() {
        return faker.backToTheFuture();
    }

    public PrincessBride princessBride() {
        return faker.princessBride();
    }

    public Relationships relationships() {
        return faker.relationships();
    }

    public Nation nation() {
        return faker.nation();
    }

    public Dune dune() {
        return faker.dune();
    }

    public AquaTeenHungerForce aquaTeenHungerForce() {
        return faker.aquaTeenHungerForce();
    }

    public ProgrammingLanguage programmingLanguage() {
        return faker.programmingLanguage();
    }

    public String resolve(String key) {
        return faker.resolve(key);
    }

    public String expression(String expression) {
        return faker.expression(expression);
    }

    public ComputerSystem getComputerSystem() {
        return hardware.getComputerSystem();
    }

    public CentralProcessor getProcessor() {
        return hardware.getProcessor();
    }

    public GlobalMemory getMemory() {
        return hardware.getMemory();
    }

    public List<PowerSource> getPowerSources() {
        return hardware.getPowerSources();
    }

    public List<HWDiskStore> getDiskStores() {
        return hardware.getDiskStores();
    }

    public List<LogicalVolumeGroup> getLogicalVolumeGroups() {
        return hardware.getLogicalVolumeGroups();
    }

    public List<NetworkIF> getNetworkIFs() {
        return hardware.getNetworkIFs();
    }

    public List<NetworkIF> getNetworkIFs(boolean includeLocalInterfaces) {
        return hardware.getNetworkIFs(includeLocalInterfaces);
    }

    public List<Display> getDisplays() {
        return hardware.getDisplays();
    }

    public Sensors getSensors() {
        return hardware.getSensors();
    }

    public List<UsbDevice> getUsbDevices(boolean tree) {
        return hardware.getUsbDevices(tree);
    }

    public List<SoundCard> getSoundCards() {
        return hardware.getSoundCards();
    }

    public List<GraphicsCard> getGraphicsCards() {
        return hardware.getGraphicsCards();
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

    public void Abrir_Archivo(String ruta, String extension, String nombre_Archivo){

        try{
        switch (extension) {
            case "pdf":
                Lector_PDF_General_Frame lector_PDF_General_Frame =
                        new Lector_PDF_General_Frame(ruta);
                lector_PDF_General_Frame.setVisible(true);
                break;
            case "mp4":
            case "webm":
            case "mkv":
            case "wmv":
            case "3gp":
            case "avi":
            case "ogg":
                Lector_Video_General_Panel lector_Video_General_Panel =
                        new Lector_Video_General_Panel(ruta, nombre_Archivo);
                lector_Video_General_Panel.setVisible(true);
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
                lector_Audio_General_Frame.setVisible(true);
                break;
            case "png":
            case "jpeg":
            case "jpg":
            case "bmp":
                    //Cargar imagen
                    java.io.File archivo_Imagen = new java.io.File(ruta);
                    BufferedImage imagen = ImageIO.read(archivo_Imagen);
                    Viewer viewer = new Viewer(imagen);
                    viewer.show();
                    imagen.flush();
                    imagen.getGraphics().dispose();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Formato De Archivo No Válido", Concatenar("Error Al Abrir El Archivo ",nombre_Archivo), JOptionPane.WARNING_MESSAGE);
                break;
        }

        } catch(HeadlessException | MalformedURLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), Concatenar("Error Encontrado Al Abrir El Archivo ",nombre_Archivo), JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), Concatenar("Error Encontrado Al Abrir El Archivo ",nombre_Archivo), JOptionPane.ERROR_MESSAGE);
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
    
    public Float Puntualidad(String fecha_Creacion, String fecha_Entregada, String fecha_Entrega ){
        
        Float puntualidad;
        Long total_Dias_Creacion, total_Dias_Entrega,
                total_Dias_Entregada, diferencia_Creacion_Entrega, diferencia_Creacion_Entregada;
        
        Tripleta<Integer,Integer, Integer> valores_Fecha_Creacion = Fecha(fecha_Creacion);
        Tripleta<Integer,Integer, Integer> valores_Fecha_Entregada = Fecha(fecha_Entregada);
        Tripleta<Integer,Integer, Integer> valores_Fecha_Entrega = Fecha(fecha_Entrega);
        
        //Diferencia dias entre fecha creacion y fecha de entrega:
        
        //Creacion:
        Long dias_anio = ((Double)(valores_Fecha_Creacion.third() * 365.25)).longValue();
        Integer dias_Mes = Dias_Mes(valores_Fecha_Creacion.second()-1);

        total_Dias_Creacion = dias_anio + dias_Mes + valores_Fecha_Creacion.first();

        //Entrega:
        dias_anio = ((Double) (valores_Fecha_Entrega.third() * 365.25)).longValue();
        dias_Mes = Dias_Mes(valores_Fecha_Entrega.second() - 1);

        total_Dias_Entrega = dias_anio + dias_Mes + valores_Fecha_Entrega.first();

        // Entregada:
        dias_anio = ((Double) (valores_Fecha_Entregada.third() * 365.25)).longValue();
        dias_Mes = Dias_Mes(valores_Fecha_Entregada.second() - 1);

        total_Dias_Entregada = dias_anio + dias_Mes + valores_Fecha_Entregada.first();

        // Calculos:
        diferencia_Creacion_Entrega = total_Dias_Entrega - total_Dias_Creacion;
        diferencia_Creacion_Entregada = total_Dias_Entrega - total_Dias_Entregada;

        puntualidad = Math.abs(( (diferencia_Creacion_Entregada * 100 ) / diferencia_Creacion_Entrega) - 100f);
 
        return puntualidad;
    }
}
