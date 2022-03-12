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
package paneles.estudiantes.fechas;

import datos.colecciones.Lista;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import javax.swing.JScrollPane;
import courseroom.CourseRoom;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author LENOVO
 */
public class Fechas_Estudiante_Panel extends JScrollPane implements Limpieza_Interface, Componentes_Interface{

    /**
     * Creates new form Pagina_Fechas_Estudiante
     */
    public Fechas_Estudiante_Panel() {
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

        contenido_JPanel = new javax.swing.JPanel();
        titulo_JPanel = new javax.swing.JPanel();
        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        mes_JLabel = new javax.swing.JLabel();
        acciones_JPanel = new javax.swing.JPanel();
        actualizar_JButton = new javax.swing.JButton();
        dias_JPanel = new javax.swing.JPanel();
        lunes_JLabel = new javax.swing.JLabel();
        martes_JLabel = new javax.swing.JLabel();
        miercoles_JLabel = new javax.swing.JLabel();
        jueves_JLabel = new javax.swing.JLabel();
        viernes_JLabel = new javax.swing.JLabel();
        sabado_JLabel = new javax.swing.JLabel();
        domingo_JLabel = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 630));

        contenido_JPanel.setOpaque(false);
        contenido_JPanel.setLayout(new javax.swing.BoxLayout(contenido_JPanel, javax.swing.BoxLayout.PAGE_AXIS));

        titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 134));
        titulo_JPanel.setName("titulo_JPanel"); // NOI18N
        titulo_JPanel.setOpaque(false);
        titulo_JPanel.setPreferredSize(new java.awt.Dimension(1080, 134));

        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 118));
        contenido_Titulo_JPanel.setOpaque(false);
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(436, 68));
        contenido_Titulo_JPanel.setLayout(new java.awt.BorderLayout());

        titulo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Fechas");
        titulo_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(176, 68));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(176, 68));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(176, 68));
        contenido_Titulo_JPanel.add(titulo_JLabel, java.awt.BorderLayout.WEST);

        mes_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mes_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes_JLabel.setText("Diciembre");
        mes_JLabel.setToolTipText("Mes Actual");
        mes_JLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mes_JLabel.setMaximumSize(new java.awt.Dimension(327573, 32));
        mes_JLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        mes_JLabel.setPreferredSize(new java.awt.Dimension(1080, 32));
        contenido_Titulo_JPanel.add(mes_JLabel, java.awt.BorderLayout.CENTER);

        acciones_JPanel.setOpaque(false);

        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/updated.png"))); // NOI18N
        actualizar_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ((ImageIcon)actualizar_JButton.getIcon()).getImage().flush();
        actualizar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout acciones_JPanelLayout = new javax.swing.GroupLayout(acciones_JPanel);
        acciones_JPanel.setLayout(acciones_JPanelLayout);
        acciones_JPanelLayout.setHorizontalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(actualizar_JButton)
                .addGap(0, 0, 0))
        );
        acciones_JPanelLayout.setVerticalGroup(
            acciones_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acciones_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(actualizar_JButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenido_Titulo_JPanel.add(acciones_JPanel, java.awt.BorderLayout.EAST);

        dias_JPanel.setMaximumSize(new java.awt.Dimension(32767, 32));
        dias_JPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        dias_JPanel.setPreferredSize(new java.awt.Dimension(1068, 32));
        dias_JPanel.setOpaque(false);
        dias_JPanel.setLayout(new java.awt.GridLayout(1, 7));

        lunes_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lunes_JLabel.setText("Lunes");
        lunes_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lunes_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lunes_JLabel.setOpaque(true);
        dias_JPanel.add(lunes_JLabel);

        martes_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        martes_JLabel.setText("Martes");
        martes_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        martes_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        martes_JLabel.setOpaque(true);
        dias_JPanel.add(martes_JLabel);

        miercoles_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miercoles_JLabel.setText("Miércoles");
        miercoles_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        miercoles_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        miercoles_JLabel.setOpaque(true);
        dias_JPanel.add(miercoles_JLabel);

        jueves_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jueves_JLabel.setText("Jueves");
        jueves_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jueves_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jueves_JLabel.setOpaque(true);
        dias_JPanel.add(jueves_JLabel);

        viernes_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viernes_JLabel.setText("Viernes");
        viernes_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viernes_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        viernes_JLabel.setOpaque(true);
        dias_JPanel.add(viernes_JLabel);

        sabado_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sabado_JLabel.setText("Sábado");
        sabado_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sabado_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sabado_JLabel.setOpaque(true);
        dias_JPanel.add(sabado_JLabel);

        domingo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        domingo_JLabel.setText("Domingo");
        domingo_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        domingo_JLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        domingo_JLabel.setOpaque(true);
        dias_JPanel.add(domingo_JLabel);

        javax.swing.GroupLayout titulo_JPanelLayout = new javax.swing.GroupLayout(titulo_JPanel);
        titulo_JPanel.setLayout(titulo_JPanelLayout);
        titulo_JPanelLayout.setHorizontalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulo_JPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dias_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        titulo_JPanelLayout.setVerticalGroup(
            titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulo_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dias_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contenido_JPanel.add(titulo_JPanel);
        titulo_JPanel.getAccessibleContext().setAccessibleName("titulo_JPanel");

        setViewportView(contenido_JPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

        }
    }//GEN-LAST:event_actualizar_JButtonMouseClicked

    private void actualizar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseEntered
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseEntered

    private void actualizar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseExited
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseExited

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
    
    private String Establecer_Nombre_Mes() {
        String mes = "";
        switch (LocalDateTime.now().getMonthValue()) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
        }

        return mes;
    }

    public boolean Es_Anio_Bisiesto(int anio) {
        if (anio % 4 != 0) {
            return false;
        } else if (anio % 400 == 0) {
            return true;
        } else return anio % 100 != 0;
    }

    @SuppressWarnings("null")
    private void Establecer_Mes(int dias_del_mes, int dias_del_mes_anterior) {
        int cuenta = 0;
        LocalDateTime tiempo_Actual = LocalDateTime.now();
        LocalDateTime fecha_Primera_Mes = LocalDateTime.of(tiempo_Actual.getYear(), tiempo_Actual.getMonth(), 1,12,12);
        DayOfWeek dia_De_La_Semana = fecha_Primera_Mes.getDayOfWeek();
        int hasta_Valor = dia_De_La_Semana.getValue() - 1;

        Lista<Fecha_Estudiante_Panel> lista_Cajas = new Lista<>();
        
        Fecha_Estudiante_Panel dia_Calendario_Panel;
        for (int i = hasta_Valor; i > 0; i--) {
            dia_Calendario_Panel = new Fecha_Estudiante_Panel(dias_del_mes_anterior - i);
            dia_Calendario_Panel.Establecer_Tercer_Color();
            lista_Cajas.push_back(dia_Calendario_Panel);
            cuenta++;
        }

        for (int i = 1; i < dias_del_mes; i++) {
            dia_Calendario_Panel = new Fecha_Estudiante_Panel(i);
            if (tiempo_Actual.getDayOfMonth() == i) {
                dia_Calendario_Panel.Establecer_Primer_Color();
            } else {
                dia_Calendario_Panel.Establecer_Segundo_Color();
            }
            lista_Cajas.push_back(dia_Calendario_Panel);
            cuenta++;
        }

        int i = 1;
        while (cuenta < 42) {
            dia_Calendario_Panel = new Fecha_Estudiante_Panel(i);
            dia_Calendario_Panel.Establecer_Tercer_Color();
            lista_Cajas.push_back(dia_Calendario_Panel);
            i++;
            cuenta++;
        }
        
        Tira_Fechas_Estudiante_Panel tira_Fechas_Estudiante_Panel = null;
        Fecha_Estudiante_Panel caja_Fecha_Estudiante_Panel;
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
    private javax.swing.JPanel acciones_JPanel;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JPanel dias_JPanel;
    private javax.swing.JLabel domingo_JLabel;
    private javax.swing.JLabel jueves_JLabel;
    private javax.swing.JLabel lunes_JLabel;
    private javax.swing.JLabel martes_JLabel;
    private javax.swing.JLabel mes_JLabel;
    private javax.swing.JLabel miercoles_JLabel;
    private javax.swing.JLabel sabado_JLabel;
    private javax.swing.JLabel titulo_JLabel;
    private javax.swing.JPanel titulo_JPanel;
    private javax.swing.JLabel viernes_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        this.getViewport().setOpaque(false);
        this.getVerticalScrollBar().setUnitIncrement(15);
        this.getHorizontalScrollBar().setUnitIncrement(15);
        mes_JLabel.setText(Establecer_Nombre_Mes());
        
    }

    @Override
    public void Colorear_Componentes() {
        contenido_Titulo_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        titulo_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());

        mes_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());

        lunes_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        martes_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        miercoles_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        jueves_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        viernes_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        sabado_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        domingo_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());

        lunes_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        martes_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        miercoles_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        jueves_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        viernes_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        sabado_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        domingo_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        
        this.Limpiar();
        
        Crear_Calendario();
       
    }
    
    @Override
    public void Limpiar() {
        
        boolean bandera = false;
        for(Component componente: contenido_JPanel.getComponents()){
            
            if(bandera){
                contenido_JPanel.remove(componente);
            }
            bandera = true;
        }
       
    }

}
