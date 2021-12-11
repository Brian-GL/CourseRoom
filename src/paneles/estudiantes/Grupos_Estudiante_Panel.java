/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;


/**
 *
 * @author LENOVO
 */
public class Grupos_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    private Titulo_Grupos_Estudiante_Panel titulo_Grupos_Estudiante_Panel;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Grupos_Estudiante_Panel(){
        
       initComponents();
        
       Iniciar_Componentes();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido_JScrollPane = new javax.swing.JScrollPane();
        contenido_JPanel = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));
        setLayout(new java.awt.CardLayout());

        contenido_JScrollPane.setBorder(null);
        contenido_JScrollPane.setOpaque(false);

        contenido_JPanel.setOpaque(false);
        contenido_JPanel.setLayout(new javax.swing.BoxLayout(contenido_JPanel, javax.swing.BoxLayout.PAGE_AXIS));
        contenido_JScrollPane.setViewportView(contenido_JPanel);

        add(contenido_JScrollPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    public static int Numero_Grupos(){
        return contenido_JPanel.getComponentCount()-1;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel contenido_JPanel;
    private javax.swing.JScrollPane contenido_JScrollPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        contenido_JScrollPane.getViewport().setOpaque(false);
        contenido_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        contenido_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        titulo_Grupos_Estudiante_Panel = new Titulo_Grupos_Estudiante_Panel();
        contenido_JPanel.add(titulo_Grupos_Estudiante_Panel);
       
        Caja_Grupo_Estudiante_Panel caja_Grupo_Estudiante_Panel;
        String concatenacion;
        for(int i = 0; i < CourseRoom.Faker().number().numberBetween(1, 10);i++){
            concatenacion = CourseRoom.Concatenar("Grupo_",i);
            caja_Grupo_Estudiante_Panel = new Caja_Grupo_Estudiante_Panel(concatenacion);
            contenido_JPanel.add(caja_Grupo_Estudiante_Panel);
        }
    }

    @Override
    public void Colorear_Componentes() {
       titulo_Grupos_Estudiante_Panel.Colorear_Componentes();
    }
    
    @Override
    public void Limpiar() {
        contenido_JPanel.removeAll();
    }
}
