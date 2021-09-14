/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseroom;

import com.formdev.flatlaf.FlatDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author LENOVO
 */
public class MainClass {

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
