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
package paneles.generales;

import com.github.lgooddatepicker.components.DatePickerSettings;
import interfaces.Componentes_Interface;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import main.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Datos_Personales_Crear_Cuenta_General_Panel extends javax.swing.JPanel implements Componentes_Interface{

    /**
     * Creates new form Datos_Personales_Crear_Cuenta_General_Panell
     */
    public Datos_Personales_Crear_Cuenta_General_Panel() {
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

        logo_Datos_Personales_JLabel = new javax.swing.JLabel();
        titulo_Datos_Personales_JLabel = new javax.swing.JLabel();
        nombres_JLabel = new javax.swing.JLabel();
        nombres_JTextField = new javax.swing.JTextField();
        apellido_Paterno_JLabel = new javax.swing.JLabel();
        apellido_Paterno_JTextField = new javax.swing.JTextField();
        localidad_JLabel = new javax.swing.JLabel();
        genero_JTextField = new javax.swing.JTextField();
        genero_JLabel = new javax.swing.JLabel();
        fecha_Nacimiento_JLabel = new javax.swing.JLabel();
        continuar_Perfil_JButton = new javax.swing.JButton();
        regresar_Autenticacion_JButton = new javax.swing.JButton();
        apellido_Materno_JLabel = new javax.swing.JLabel();
        apellido_Materno_JTextField = new javax.swing.JTextField();
        estado_JLabel = new javax.swing.JLabel();
        estado_AutoCompletionComboBox = new com.jidesoft.swing.AutoCompletionComboBox();
        localidad_AutoCompletionComboBox = new com.jidesoft.swing.AutoCompletionComboBox();
        fecha_Nacimiento_DatePicker = new com.github.lgooddatepicker.components.DatePicker();

        setOpaque(false);

        logo_Datos_Personales_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_Datos_Personales_JLabel.setPreferredSize(new java.awt.Dimension(0, 125));

        titulo_Datos_Personales_JLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        titulo_Datos_Personales_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Datos_Personales_JLabel.setText("Registra Tus Datos Personales");

        nombres_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        nombres_JLabel.setText("Nombre(s) *");

        nombres_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        nombres_JTextField.setToolTipText("<html>  <h3> Nombre(s) </h3>  <ul>    <li>Obligatorio</li> </ul>  </html>");
        nombres_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));

        apellido_Paterno_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        apellido_Paterno_JLabel.setText("Apellido Paterno *");

        apellido_Paterno_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        apellido_Paterno_JTextField.setToolTipText("<html>  <h3> Apellido paterno </h3>  <ul>    <li>Obligatorio</li> </ul>  </html>");
        apellido_Paterno_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));

        localidad_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        localidad_JLabel.setText("Localidad");

        genero_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        genero_JTextField.setToolTipText("<html>  <h3> Identidad de género </h3>  <ul>    <li>Opcional</li> </ul>  </html>");
        genero_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));

        genero_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        genero_JLabel.setText("Género");

        fecha_Nacimiento_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        fecha_Nacimiento_JLabel.setText("Fecha De Nacimiento *");

        continuar_Perfil_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/inreply.png"))); // NOI18N
        continuar_Perfil_JButton.setToolTipText("<html> <h3>Continuar a la pestaña de perfil</h3> </html>");
        continuar_Perfil_JButton.setBorder(null);
        continuar_Perfil_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar_Perfil_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuar_Perfil_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuar_Perfil_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuar_Perfil_JButtonMouseExited(evt);
            }
        });

        regresar_Autenticacion_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reply.png"))); // NOI18N
        regresar_Autenticacion_JButton.setToolTipText("<html> <h3>Regresar a la pestaña de autenticación</h3> </html>");
        regresar_Autenticacion_JButton.setBorder(null);
        regresar_Autenticacion_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_Autenticacion_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_Autenticacion_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresar_Autenticacion_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresar_Autenticacion_JButtonMouseExited(evt);
            }
        });

        apellido_Materno_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        apellido_Materno_JLabel.setText("Apellido Materno");

        apellido_Materno_JTextField.setFont(new java.awt.Font("Gadugi", 0, 19)); // NOI18N
        apellido_Materno_JTextField.setToolTipText("<html>  <h3> Apellido materno </h3> </html>");
        apellido_Materno_JTextField.setCaretColor(new java.awt.Color(104, 194, 232));

        estado_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        estado_JLabel.setText("Estado");

        estado_AutoCompletionComboBox.setToolTipText("<html>\n<h3>Estado de proveniencia</h3>\n</html>");
        estado_AutoCompletionComboBox.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N

        localidad_AutoCompletionComboBox.setToolTipText("<html>\n<h3>Localidad de provenencia</h3>\n</html>");

        fecha_Nacimiento_DatePicker.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        fecha_Nacimiento_DatePicker.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresar_Autenticacion_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continuar_Perfil_JButton))
                    .addComponent(titulo_Datos_Personales_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo_Datos_Personales_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(apellido_Materno_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellido_Paterno_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(apellido_Materno_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(apellido_Paterno_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(nombres_JLabel)
                            .addComponent(nombres_JTextField))
                        .addGap(18, 95, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fecha_Nacimiento_DatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                            .addComponent(fecha_Nacimiento_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genero_JTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                            .addComponent(genero_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localidad_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(estado_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(estado_AutoCompletionComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localidad_AutoCompletionComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_Datos_Personales_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_Datos_Personales_JLabel)
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(estado_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombres_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombres_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localidad_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localidad_AutoCompletionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(genero_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genero_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apellido_Paterno_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellido_Paterno_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apellido_Materno_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellido_Materno_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(fecha_Nacimiento_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_Nacimiento_DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(continuar_Perfil_JButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresar_Autenticacion_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void continuar_Perfil_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Perfil_JButtonMouseClicked
        // TODO add your handling code here:
         if(SwingUtilities.isLeftMouseButton(evt)){
            Crear_Cuenta_General_Panel.Mostrar_Vista("Perfil");
        }
    }//GEN-LAST:event_continuar_Perfil_JButtonMouseClicked

    private void continuar_Perfil_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Perfil_JButtonMouseEntered
        // TODO add your handling code here:
        continuar_Perfil_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_continuar_Perfil_JButtonMouseEntered

    private void continuar_Perfil_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuar_Perfil_JButtonMouseExited
        // TODO add your handling code here:
        continuar_Perfil_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_continuar_Perfil_JButtonMouseExited

    private void regresar_Autenticacion_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Autenticacion_JButtonMouseClicked
        // TODO add your handling code here:
         if(SwingUtilities.isLeftMouseButton(evt)){
            Crear_Cuenta_General_Panel.Mostrar_Vista("Autenticacion");
        }
    }//GEN-LAST:event_regresar_Autenticacion_JButtonMouseClicked

    private void regresar_Autenticacion_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Autenticacion_JButtonMouseEntered
        // TODO add your handling code here:
        regresar_Autenticacion_JButton.setBackground(CourseRoom.Segundo_Color());
    }//GEN-LAST:event_regresar_Autenticacion_JButtonMouseEntered

    private void regresar_Autenticacion_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_Autenticacion_JButtonMouseExited
        // TODO add your handling code here:
        regresar_Autenticacion_JButton.setBackground(CourseRoom.Primer_Color());
    }//GEN-LAST:event_regresar_Autenticacion_JButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido_Materno_JLabel;
    private javax.swing.JTextField apellido_Materno_JTextField;
    private javax.swing.JLabel apellido_Paterno_JLabel;
    private javax.swing.JTextField apellido_Paterno_JTextField;
    private javax.swing.JButton continuar_Perfil_JButton;
    private com.jidesoft.swing.AutoCompletionComboBox estado_AutoCompletionComboBox;
    private javax.swing.JLabel estado_JLabel;
    private com.github.lgooddatepicker.components.DatePicker fecha_Nacimiento_DatePicker;
    private javax.swing.JLabel fecha_Nacimiento_JLabel;
    private javax.swing.JLabel genero_JLabel;
    private javax.swing.JTextField genero_JTextField;
    private com.jidesoft.swing.AutoCompletionComboBox localidad_AutoCompletionComboBox;
    private javax.swing.JLabel localidad_JLabel;
    private javax.swing.JLabel logo_Datos_Personales_JLabel;
    private javax.swing.JLabel nombres_JLabel;
    private javax.swing.JTextField nombres_JTextField;
    private javax.swing.JButton regresar_Autenticacion_JButton;
    private javax.swing.JLabel titulo_Datos_Personales_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        ImageIcon icono = new ImageIcon(CourseRoom.Logo_Imagen());
        logo_Datos_Personales_JLabel.setIcon(icono);
        
        LocalDate fecha_Minima = LocalDate.of(1900, Month.JANUARY, 1);
        LocalDate fecha_Maxima = LocalDate.of(2010, Month.JANUARY, 1);
        DatePickerSettings ajustes_Fecha_Nacimiento = new DatePickerSettings(CourseRoom.Locale());
        ajustes_Fecha_Nacimiento.setFirstDayOfWeek(DayOfWeek.MONDAY);
        ajustes_Fecha_Nacimiento.setFontVetoedDate(nombres_JLabel.getFont());
        ajustes_Fecha_Nacimiento.setFontValidDate(nombres_JLabel.getFont());
        ajustes_Fecha_Nacimiento.setFontCalendarDateLabels(nombres_JLabel.getFont());
        ajustes_Fecha_Nacimiento.setFontCalendarWeekNumberLabels(nombres_JLabel.getFont());
        ajustes_Fecha_Nacimiento.setFontCalendarWeekdayLabels(nombres_JLabel.getFont());
        ajustes_Fecha_Nacimiento.setFontTodayLabel(nombres_JLabel.getFont());
        ajustes_Fecha_Nacimiento.setFontMonthAndYearMenuLabels(nombres_JLabel.getFont());
        ajustes_Fecha_Nacimiento.setFontTodayLabel(nombres_JLabel.getFont());
        ajustes_Fecha_Nacimiento.setVisibleClearButton(false);
        ajustes_Fecha_Nacimiento.setVisibleTodayButton(false);
        fecha_Nacimiento_DatePicker.setSettings(ajustes_Fecha_Nacimiento);
        fecha_Nacimiento_DatePicker.getComponent(0).setFont(nombres_JLabel.getFont());
        fecha_Nacimiento_DatePicker.getSettings().setDateRangeLimits(fecha_Minima, fecha_Maxima);
        fecha_Nacimiento_DatePicker.setDate(LocalDate.of(1998, Month.JANUARY, 1));
        fecha_Nacimiento_DatePicker.setOpaque(false);
        fecha_Nacimiento_DatePicker.setVisible(true);
        
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        apellido_Paterno_JTextField.setBackground(CourseRoom.Segundo_Color());
        apellido_Paterno_JTextField.setForeground(CourseRoom.Primer_Color());
        apellido_Paterno_JTextField.setCaretColor(CourseRoom.Primer_Color());
        apellido_Materno_JTextField.setBackground(CourseRoom.Segundo_Color());
        apellido_Materno_JTextField.setForeground(CourseRoom.Primer_Color());
        apellido_Materno_JTextField.setCaretColor(CourseRoom.Primer_Color());
        genero_JTextField.setBackground(CourseRoom.Segundo_Color());
        genero_JTextField.setForeground(CourseRoom.Primer_Color());
        genero_JTextField.setCaretColor(CourseRoom.Primer_Color());
        localidad_AutoCompletionComboBox.setBackground(CourseRoom.Segundo_Color());
        localidad_AutoCompletionComboBox.setForeground(CourseRoom.Primer_Color());
        estado_AutoCompletionComboBox.setBackground(CourseRoom.Segundo_Color());
        estado_AutoCompletionComboBox.setForeground(CourseRoom.Primer_Color());
        nombres_JTextField.setBackground(CourseRoom.Segundo_Color());
        nombres_JTextField.setForeground(CourseRoom.Primer_Color());
        nombres_JTextField.setCaretColor(CourseRoom.Primer_Color());
        apellido_Paterno_JLabel.setForeground(CourseRoom.Segundo_Color());
        apellido_Materno_JLabel.setForeground(CourseRoom.Segundo_Color());
        fecha_Nacimiento_JLabel.setForeground(CourseRoom.Segundo_Color());
        genero_JLabel.setForeground(CourseRoom.Segundo_Color());
        localidad_JLabel.setForeground(CourseRoom.Segundo_Color());
        estado_JLabel.setForeground(CourseRoom.Segundo_Color());
        logo_Datos_Personales_JLabel.setForeground(CourseRoom.Segundo_Color());
        nombres_JLabel.setForeground(CourseRoom.Segundo_Color());
        titulo_Datos_Personales_JLabel.setForeground(CourseRoom.Segundo_Color());
        continuar_Perfil_JButton.setBackground(CourseRoom.Primer_Color());
        regresar_Autenticacion_JButton.setBackground(CourseRoom.Primer_Color());
        
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.CalendarBackgroundNormalDates,
                CourseRoom.Segundo_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.CalendarTextNormalDates,
                CourseRoom.Primer_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.TextMonthAndYearMenuLabels,
                CourseRoom.Primer_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.TextMonthAndYearMenuLabels,
                CourseRoom.Primer_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.BackgroundCalendarPanelLabelsOnHover,
                CourseRoom.Segundo_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.BackgroundMonthAndYearNavigationButtons,
                CourseRoom.Primer_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.TextMonthAndYearNavigationButtons,
                CourseRoom.Segundo_Color());
        fecha_Nacimiento_DatePicker.getSettings().setColor(DatePickerSettings.DateArea.TextCalendarPanelLabelsOnHover,
                CourseRoom.Primer_Color());
        ((JTextField) fecha_Nacimiento_DatePicker.getComponent(0)).setEditable(false);
    }

}
