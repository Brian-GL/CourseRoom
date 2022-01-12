/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import java.awt.CardLayout;


/**
 *
 * @author LENOVO
 */
public class Pagina_Grupos_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    private Grupos_Estudiante_Panel grupos_Estudiante_Panel;
    private Buscar_Grupos_Estudiante_Panel buscar_Grupos_Estudiante_Panel;
    private static CardLayout layout;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Pagina_Grupos_Estudiante_Panel(){
        
       initComponents();
        
       Iniciar_Componentes();
       
       layout = (CardLayout)this.getLayout();
        
    }
   
    public static void Buscar_Grupos(){
        layout.show(Tablero_Estudiante_Panel.Pagina_Grupos(), "Buscar");
    }
    
    public static void Mostrar_Grupos(){
        layout.show(Tablero_Estudiante_Panel.Pagina_Grupos(), "Grupos");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 630));
        setLayout(new java.awt.CardLayout());
    }// </editor-fold>//GEN-END:initComponents

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        grupos_Estudiante_Panel = new Grupos_Estudiante_Panel();
        buscar_Grupos_Estudiante_Panel = new Buscar_Grupos_Estudiante_Panel();
        
        this.add(grupos_Estudiante_Panel, "Grupos");
        this.add(buscar_Grupos_Estudiante_Panel,"Buscar");
    }

    @Override
    public void Colorear_Componentes() {
       grupos_Estudiante_Panel.Colorear_Componentes();
       buscar_Grupos_Estudiante_Panel.Colorear_Componentes();
    }
    
    @Override
    public void Limpiar() {
        grupos_Estudiante_Panel.Limpiar();
        buscar_Grupos_Estudiante_Panel.Limpiar();
    }
}
