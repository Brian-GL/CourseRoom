/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseroom;


import com.formdev.flatlaf.FlatDarkLaf;
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
public class MainFrame extends javax.swing.JFrame {

    private static LoginPanel login;
    private static RecuperarCredencialesPanel recuperarCredenciales;
    private static CrearCuentaPanel crearCuenta;
    private static DashboardPanel dashboard;
    private static Color lightBlue,darkBlue;
    private static ImageIcon logoImage;
    private static CardLayout viewerLayout;
    
    /**
     * Creates new form MainFrame
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MainFrame() {
        
        initComponents();
        
        boolean isConnected = checkConnection();
        
        if (!isConnected){
            JOptionPane.showMessageDialog(null,"There Is Not Internet Connection","SUPER ERROR",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return;
        }
        
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        
        darkBlue = new Color(14,30,64);
        lightBlue  = new Color(104,194,232);
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
        
        login = new LoginPanel();
        recuperarCredenciales = new RecuperarCredencialesPanel();
        crearCuenta = new CrearCuentaPanel();
        dashboard = new DashboardPanel();
        
        jPanelViewer.add("login",login);
        jPanelViewer.add("recuperarCredenciales",recuperarCredenciales);
        jPanelViewer.add("crearCuenta",crearCuenta);
        jPanelViewer.add("dashboard",dashboard);
        
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
        viewerLayout.show(jPanelViewer,"dashboard");
    }
    
    public static void logOut(){
        showLogin();
    }
   
    @Override
    public void dispose(){
        if(dashboard != null){
            dashboard.dispose();
        }
        if(recuperarCredenciales != null){
            recuperarCredenciales.dispose();
        }
        login = null;
        recuperarCredenciales = null;
        crearCuenta = null;
        dashboard = null;
        lightBlue = null;
        darkBlue = null;
        logoImage = null;
        viewerLayout = null;
        super.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel jPanelViewer;
    // End of variables declaration//GEN-END:variables

   
    /**
     * @return the lightBlue
     */
    public static Color getLightBlue() {
        return lightBlue;
    }

    /**
     * @return the darkBlue
     */
    public static Color getDarkBlue() {
        return darkBlue;
    }
    

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
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try {
            FlatDarkLaf ui = new FlatDarkLaf();
            UIManager.setLookAndFeel(ui);
            java.awt.EventQueue.invokeLater(() -> {
                new MainFrame().setVisible(true);
            });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
