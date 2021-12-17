/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import datos.colecciones.Lista;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import main.CourseRoom;


/**
 *
 * @author LENOVO
 */
public class Pagina_Fechas_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{
    
    private Titulo_Fechas_Estudiante_Panel titulo_Fechas_Estudiante_Panel;
    
    public Pagina_Fechas_Estudiante_Panel(){
        
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

    public void Crear_Calendario() {

        switch (LocalDateTime.now().getMonthValue()) {
            case 1:
                Establecer_Mes(32, 32);
                break;
            case 2:
                if (Es_Anio_Bisiesto(LocalDateTime.now().getYear())) {
                    Establecer_Mes(30, 32);
                } else {
                    Establecer_Mes(29, 32);
                }

                break;
            case 3:
                if (Es_Anio_Bisiesto(LocalDateTime.now().getYear())){
                    Establecer_Mes(32, 30);
                } else {
                    Establecer_Mes(32, 29);
                }
                break;
            case 4:
                Establecer_Mes(31, 32);
                break;
            case 5:
                Establecer_Mes(32, 31);
                break;
            case 6:
                Establecer_Mes(31, 32);
                break;
            case 7:
                Establecer_Mes(32, 31);
                break;
            case 8:
                Establecer_Mes(32, 32);
                break;
            case 9:
                Establecer_Mes(31, 32);
                break;
            case 10:
                Establecer_Mes(32, 31);
                break;
            case 11:
                Establecer_Mes(31, 32);
                break;
            case 12:
                Establecer_Mes(32, 31);
                break;

        }
    }

    public boolean Es_Anio_Bisiesto(int anio) {
        if (anio % 4 != 0) {
            return false;
        } else if (anio % 400 == 0) {
            return true;
        } else if (anio % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    @SuppressWarnings("null")
    private void Establecer_Mes(int dias_del_mes, int dias_del_mes_anterior) {
        int cuenta = 0;

        LocalDate fecha_Local = LocalDate.of(LocalDateTime.now().getYear(), LocalDateTime.now().getMonthValue(), 1);
        DayOfWeek dia_De_La_Semana = fecha_Local.getDayOfWeek();
        int hasta_Valor = dia_De_La_Semana.getValue() - 1;

        Lista<Caja_Fecha_Estudiante_Panel> lista_Cajas = new Lista<>();
        
        Caja_Fecha_Estudiante_Panel dia_Calendario_Panel;
        for (int i = hasta_Valor; i > 0; i--) {
            dia_Calendario_Panel = new Caja_Fecha_Estudiante_Panel(dias_del_mes_anterior - i);
            dia_Calendario_Panel.Establecer_Colores(CourseRoom.Tercer_Color(), CourseRoom.Tercer_Color_Fuente());
            lista_Cajas.push_back(dia_Calendario_Panel);
            cuenta++;
        }

        for (int i = 1; i < dias_del_mes; i++) {
            dia_Calendario_Panel = new Caja_Fecha_Estudiante_Panel(i);
            if (fecha_Local.getDayOfMonth() == i) {
                dia_Calendario_Panel.Establecer_Colores(CourseRoom.Primer_Color(), CourseRoom.Primer_Color_Fuente());
            } else {
                dia_Calendario_Panel.Establecer_Colores(CourseRoom.Segundo_Color(), CourseRoom.Segundo_Color_Fuente());
            }
            lista_Cajas.push_back(dia_Calendario_Panel);
            cuenta++;
        }

        int i = 1;
        while (cuenta < 42) {
            dia_Calendario_Panel = new Caja_Fecha_Estudiante_Panel(i);
            dia_Calendario_Panel.Establecer_Colores(CourseRoom.Tercer_Color(), CourseRoom.Tercer_Color_Fuente());
            lista_Cajas.push_back(dia_Calendario_Panel);
            i++;
            cuenta++;
        }
        
        Tira_Fechas_Estudiante_Panel tira_Fechas_Estudiante_Panel = null;
        Caja_Fecha_Estudiante_Panel caja_Fecha_Estudiante_Panel;
        cuenta = 0;
        while(!lista_Cajas.is_empty()){
            
            if(cuenta < 7){
                caja_Fecha_Estudiante_Panel = lista_Cajas.delist();
                if(cuenta == 0){
                    tira_Fechas_Estudiante_Panel = new Tira_Fechas_Estudiante_Panel();
                }
                tira_Fechas_Estudiante_Panel.Agregar_Fecha(caja_Fecha_Estudiante_Panel);
                cuenta++;
            }else{
                contenido_JPanel.add(tira_Fechas_Estudiante_Panel);
                cuenta = 0;
            }
        }
    }

    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JScrollPane contenido_JScrollPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        titulo_Fechas_Estudiante_Panel = new Titulo_Fechas_Estudiante_Panel();
        contenido_JScrollPane.getViewport().setOpaque(false);
        contenido_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        contenido_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
        
        contenido_JPanel.add(titulo_Fechas_Estudiante_Panel);
        
    }

    @Override
    public void Colorear_Componentes() {
       titulo_Fechas_Estudiante_Panel.Colorear_Componentes();
       this.Limpiar();
       Crear_Calendario();
       
    }
    
    @Override
    public void Limpiar() {
       while(contenido_JPanel.getComponentCount() > 2){
           contenido_JPanel.remove(1);
       }
    }
}