/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import interfaces.Componentes_Interface;
import java.awt.Color;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author brian
 */
public class Caja_Fecha_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface{

    private Color color_Fondo, color_Fuente;
    
    public Caja_Fecha_Estudiante_Panel(int day) {
        initComponents();
        
        numero_Dia_JLabel.setText(String.valueOf(day));
        
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

        numero_Dia_JLabel = new javax.swing.JLabel();
        hora_JLabel = new javax.swing.JLabel();
        descripcion_JScrollPane = new javax.swing.JScrollPane();
        descripcion_JTextPane = new javax.swing.JTextPane();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMinimumSize(new java.awt.Dimension(160, 100));
        setName("CalendarDay"); // NOI18N
        setPreferredSize(new java.awt.Dimension(160, 100));

        numero_Dia_JLabel.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        numero_Dia_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numero_Dia_JLabel.setToolTipText("Número De Día Del Mes");

        hora_JLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        hora_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora_JLabel.setToolTipText("Hora Máxima Del Pendiente");
        hora_JLabel.setMaximumSize(new java.awt.Dimension(68, 32));
        hora_JLabel.setMinimumSize(new java.awt.Dimension(68, 32));
        hora_JLabel.setPreferredSize(new java.awt.Dimension(68, 32));

        descripcion_JScrollPane.setBorder(null);
        descripcion_JScrollPane.setOpaque(false);

        descripcion_JTextPane.setBorder(null);
        descripcion_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        descripcion_JTextPane.setOpaque(false);
        descripcion_JScrollPane.setViewportView(descripcion_JTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(hora_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(numero_Dia_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(descripcion_JScrollPane)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hora_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numero_Dia_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane descripcion_JScrollPane;
    private javax.swing.JTextPane descripcion_JTextPane;
    private javax.swing.JLabel hora_JLabel;
    private javax.swing.JLabel numero_Dia_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        color_Fondo = CourseRoom.Tercer_Color();
        color_Fuente = CourseRoom.Tercer_Color_Fuente();
        String concatenacion = 
        CourseRoom.Concatenar(String.valueOf(CourseRoom.Faker().number().randomNumber(1, true)),
                ":",String.valueOf(CourseRoom.Faker().number().randomNumber(2, false))," P.M");
        hora_JLabel.setText(concatenacion);
        descripcion_JScrollPane.getViewport().setOpaque(false);
        descripcion_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        StyledDocument documento_Estilizado = descripcion_JTextPane.getStyledDocument();
        
        SimpleAttributeSet atributo_Centro = new SimpleAttributeSet();
        StyleConstants.setAlignment(atributo_Centro, StyleConstants.ALIGN_CENTER);
        documento_Estilizado.setParagraphAttributes(0, documento_Estilizado.getLength(), atributo_Centro, false);
        descripcion_JTextPane.setText(CourseRoom.Faker().lorem().paragraph());
       
    }

    @Override
    public void Colorear_Componentes() {
        numero_Dia_JLabel.setForeground(color_Fuente);
        hora_JLabel.setForeground(color_Fuente);
        descripcion_JTextPane.setForeground(color_Fuente);
        this.setBackground(color_Fondo);
    }

    
    public void Establecer_Colores(Color _color_Fondo, Color _color_Fuente) {
        this.color_Fondo = _color_Fondo;
        this.color_Fuente = _color_Fuente;
        
        Colorear_Componentes();
    }

    
    
}
