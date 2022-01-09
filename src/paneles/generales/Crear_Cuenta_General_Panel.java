package paneles.generales;

import interfaces.Componentes_Interface;
import java.awt.CardLayout;

public class Crear_Cuenta_General_Panel extends javax.swing.JPanel implements Componentes_Interface{
   
    private static Inicio_Crear_Cuenta_General_Panel inicio_Crear_Cuenta_General_Panel;
    private static Autenticacion_Crear_Cuenta_General_Panel autenticacion_Crear_Cuenta_General_Panel;
    private static Datos_Personales_Crear_Cuenta_General_Panel datos_Personales_Crear_Cuenta_General_Panel;
    private static Perfil_Crear_Cuenta_General_Panel perfil_Crear_Cuenta_General_Panel;
    private static Informacion_Extra_Crear_Cuenta_General_Panel informacion_Extra_Crear_Cuenta_General_Panel;
    
    private static CardLayout layout;
    
    public Crear_Cuenta_General_Panel() {
        initComponents();
        
        Iniciar_Componentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visualizador_JPanel = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1260, 670));
        setPreferredSize(new java.awt.Dimension(1260, 670));
        setOpaque(false);
        setLayout(new java.awt.CardLayout());

        visualizador_JPanel.setOpaque(false);
        visualizador_JPanel.setLayout(new java.awt.CardLayout());
        add(visualizador_JPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel visualizador_JPanel;
    // End of variables declaration//GEN-END:variables

    public static void Mostrar_Vista(String llave){
        layout.show(visualizador_JPanel, llave);
    }
    
    @Override
    public void Iniciar_Componentes() {
        
        layout = (CardLayout)visualizador_JPanel.getLayout();
        
        inicio_Crear_Cuenta_General_Panel = new Inicio_Crear_Cuenta_General_Panel();
        visualizador_JPanel.add(inicio_Crear_Cuenta_General_Panel, "Inicio");
        autenticacion_Crear_Cuenta_General_Panel = new Autenticacion_Crear_Cuenta_General_Panel();
        visualizador_JPanel.add(autenticacion_Crear_Cuenta_General_Panel, "Autenticacion");
        datos_Personales_Crear_Cuenta_General_Panel = new Datos_Personales_Crear_Cuenta_General_Panel();
        visualizador_JPanel.add(datos_Personales_Crear_Cuenta_General_Panel, "Datos_Personales");
        perfil_Crear_Cuenta_General_Panel = new Perfil_Crear_Cuenta_General_Panel();
        visualizador_JPanel.add(perfil_Crear_Cuenta_General_Panel, "Perfil");
        informacion_Extra_Crear_Cuenta_General_Panel = new Informacion_Extra_Crear_Cuenta_General_Panel();
        visualizador_JPanel.add(informacion_Extra_Crear_Cuenta_General_Panel, "Informacion_Extra");
        
        Colorear_Componentes();
       
    }

    @Override
    public void Colorear_Componentes() {

        
        
    }
    
}
 

