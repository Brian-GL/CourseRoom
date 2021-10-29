/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseroom;


import com.formdev.flatlaf.FlatDarkLaf;
import data.interfaces.DisposeInterface;
import panels.DashboardPanel;
import java.awt.CardLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import panels.LoginPanel;
import panels.RecuperarCredencialesPanel;
import panels.CrearCuentaPanel;
/**
 *
 * @author LENOVO
 */
public class MainFrame extends javax.swing.JFrame implements DisposeInterface{

    private static LoginPanel login;
    private static RecuperarCredencialesPanel recuperarCredenciales;
    private static CrearCuentaPanel crearCuenta;
    private static DashboardPanel dashboard;
    private static Color darkBlue, lightBlue;
    private static Color firstColor,secondColor, thirdColor, fontColor, secondFontColor, thirdFontColor;
    
    private static ImageIcon logoImage;
    
    private static CardLayout viewerLayout;
    
    /**
     * Creates new form MainFrame
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MainFrame() {
        
        initComponents();
        
        darkBlue = new Color(14,30,64);
        lightBlue  = new Color(104,194,232);
        firstColor = darkBlue;
        secondColor = thirdColor = lightBlue;
        fontColor = secondFontColor = thirdFontColor = Color.BLACK;
         
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        
        Image darkImageLogo;
        try {
            darkImageLogo = ImageIO.read(getClass().getResource("/resources/images/Course_Room_Brand_Blue.png"));
            Image logo = ImageIO.read(getClass().getResource("/resources/images/Course_Room_Logo.png"));
            this.setIconImage(logo);
            logoImage = new ImageIcon(darkImageLogo.getScaledInstance(150, 125, Image.SCALE_SMOOTH));
            logo = null;
            darkImageLogo = null;
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jPanelViewer.setBackground(firstColor);
        login = new LoginPanel();
        jPanelViewer.add("login",login);
        
        boolean isConnected = checkConnection();
        
        if (!isConnected){
            JOptionPane.showMessageDialog(null,"There Is Not Internet Connection","SUPER ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        recuperarCredenciales = new RecuperarCredencialesPanel();
        jPanelViewer.add("recuperarCredenciales",recuperarCredenciales);
        
        crearCuenta = new CrearCuentaPanel();
        dashboard = new DashboardPanel();
        jPanelViewer.add("dashboard",dashboard);
        
        jPanelViewer.add("crearCuenta",crearCuenta);
        
        
        viewerLayout = (CardLayout)jPanelViewer.getLayout();
        
    }
    
    
    public boolean checkConnection(){
        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            connection = null;
            return true;
        } catch (MalformedURLException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelViewer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CourseRoom - Tu Espacio Personal Para Estudiar");
        setMinimumSize(new java.awt.Dimension(1270, 695));
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1270, 695));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanelViewer.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelViewer.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanelViewer.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPanelViewer);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        System.gc();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    public static void showLogin(){
        viewerLayout.show(jPanelViewer,"login");
    }
    
    public static void showRecuperarCredenciales(){
        viewerLayout.show(jPanelViewer,"recuperarCredenciales");
    }
    
    public static void showCrearCuenta(){
        viewerLayout.show(jPanelViewer,"crearCuenta");
    }
    
    public static void showDashboard(){
        dashboard.setColors();
        viewerLayout.show(jPanelViewer,"dashboard");
    }
    
    public static void logOut(){
        showLogin();
        firstColor = darkBlue;
        secondColor = lightBlue;
        thirdColor = lightBlue;
        jPanelViewer.setBackground(darkBlue);
        dashboard.dispose();
        dashboard = null;
        dashboard = new DashboardPanel();
        
    }
    
    public static void repainting(){
        //jPanelViewer.repaint();
        jPanelViewer.setBackground(firstColor);
    }
   
    @Override
    public void dispose(){
        dashboard.dispose();
        recuperarCredenciales.dispose();
        login = null;
        recuperarCredenciales = null;
        crearCuenta = null;
        dashboard = null;
        darkBlue = lightBlue = null;
        firstColor = secondColor = thirdColor = fontColor = secondFontColor = thirdFontColor = null;
        logoImage = null;
        viewerLayout = null;
        super.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel jPanelViewer;
    // End of variables declaration//GEN-END:variables

   
    /**
     * @return the logoImage
     */
    public static ImageIcon getLogoImage() {
        return logoImage;
    }


    /**
     * @return the login
     */
    public static LoginPanel getLogin() {
        return login;
    }
    
    /**
     * @return the firstColor
     */
    public static Color getFirstColor() {
        return firstColor;
    }

    /**
     * @param aFirstColor the firstColor to set
     */
    public static void setFirstColor(Color aFirstColor) {
        firstColor = aFirstColor;
    }

    /**
     * @return the secondColor
     */
    public static Color getSecondColor() {
        return secondColor;
    }

    /**
     * @param aSecondColor the secondColor to set
     */
    public static void setSecondColor(Color aSecondColor) {
        secondColor = aSecondColor;
    }

    /**
     * @return the thirdColor
     */
    public static Color getThirdColor() {
        return thirdColor;
    }

    /**
     * @param aThirdColor the thirdColor to set
     */
    public static void setThirdColor(Color aThirdColor) {
        thirdColor = aThirdColor;
    }

    /**
     * @return the fontColor
     */
    public static Color getFontColor() {
        return fontColor;
    }

    /**
     * @param aFontColor the fontColor to set
     */
    public static void setFontColor(Color aFontColor) {
        fontColor = aFontColor;
    }

     /**
     * @return the fontColor
     */
    public static Color getSecondFontColor() {
        return secondFontColor;
    }

    /**
     * @param aFontColor the fontColor to set
     */
    public static void setSecondFontColor(Color aFontColor) {
        secondFontColor = aFontColor;
    }
    
     /**
     * @return the fontColor
     */
    public static Color getThirdFontColor() {
        return thirdFontColor;
    }

    /**
     * @param aFontColor the fontColor to set
     */
    public static void setThirdFontColor(Color aFontColor) {
        thirdFontColor = aFontColor;
    }


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try {
            FlatDarkLaf ui = new FlatDarkLaf();
            UIManager.setLookAndFeel(ui);
            MainFrame m = new MainFrame();
            m.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
