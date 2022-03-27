/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseroom;

 // <editor-fold defaultstate="collapsed" desc="Paquetes">

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JOptionPane;

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
    
    public static void main(String args[]){
        try {
            FlatDarkLaf ui = new FlatDarkLaf();
            UIManager.setLookAndFeel(ui);
            CourseRoom.getInstance();
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error Al Iniciar CourseRoom", JOptionPane.ERROR_MESSAGE);
        }
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
