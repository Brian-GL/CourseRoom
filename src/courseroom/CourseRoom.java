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
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.regex.Pattern;
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
public class CourseRoom {
    
    private static Solicitudes solicitudes;
    private static Utilerias utilerias;
    private static CourseRoom_Frame courseRoom_Frame;
    
    public static CourseRoom getInstance() {
        return CourseRoomHolder.INSTANCE;
    }

    private static class CourseRoomHolder {

        private static final CourseRoom INSTANCE = new CourseRoom();
    }
    
    private CourseRoom(){
        utilerias = Utilerias.getInstance();
        solicitudes = Solicitudes.getInstance();
        courseRoom_Frame = CourseRoom_Frame.getInstance();
    }
    
    public static void main(String args[]) throws UnsupportedLookAndFeelException, MalformedURLException, XmlRpcException, IOException, SQLException {
        FlatDarkLaf ui = new FlatDarkLaf();
        UIManager.setLookAndFeel(ui);
        CourseRoom.getInstance();
    }
   
    public static Solicitudes Solicitudes(){
        return CourseRoom.solicitudes;
    }
    
    public static Utilerias Utilerias(){
        return CourseRoom.utilerias;
    }

    public static void Esconder_Frame(){
        courseRoom_Frame.setVisible(false);
    }

    public static void Mostrar_Frame(){
        courseRoom_Frame.setVisible(true);
    }
    
    public static CourseRoom_Frame Frame(){
        return CourseRoom.courseRoom_Frame;
    }

    
}
