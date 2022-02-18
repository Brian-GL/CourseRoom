/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes.fechas;

import courseroom.CourseRoom;
import datos.interfaces.Componentes_Interface;

/**
 *
 * @author brian
 */
public class Fecha_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface{

    
    public Fecha_Estudiante_Panel(int day) {
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

        contenido_JPanel = new javax.swing.JPanel();
        descripcion_JScrollPane = new javax.swing.JScrollPane();
        descripcion_JTextPane = new javax.swing.JTextPane();
        numero_Dia_JLabel = new javax.swing.JLabel();
        hora_JLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 250));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setName("CalendarDay"); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(150, 250));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        descripcion_JScrollPane.setBorder(null);
        descripcion_JScrollPane.setOpaque(false);

        descripcion_JTextPane.setEditable(false);
        descripcion_JTextPane.setBorder(null);
        descripcion_JTextPane.setContentType("text/html"); // NOI18N
        descripcion_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        descripcion_JTextPane.setText("");
        descripcion_JTextPane.setToolTipText("<html> <h3>Descripción corta</h3> </html>");
        descripcion_JTextPane.setOpaque(false);
        descripcion_JScrollPane.setViewportView(descripcion_JTextPane);

        numero_Dia_JLabel.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        numero_Dia_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numero_Dia_JLabel.setToolTipText("<html> <h3>Número de día</h3> </html>");

        hora_JLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        hora_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora_JLabel.setToolTipText("<html> <h3>Hora de finalización</h3> </html>");
        hora_JLabel.setMaximumSize(new java.awt.Dimension(68, 32));
        hora_JLabel.setMinimumSize(new java.awt.Dimension(68, 32));
        hora_JLabel.setPreferredSize(new java.awt.Dimension(68, 32));

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_JPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(numero_Dia_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hora_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numero_Dia_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hora_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void Establecer_Primer_Color(){
        numero_Dia_JLabel.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
        hora_JLabel.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
        descripcion_JTextPane.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
        contenido_JPanel.setBackground(CourseRoom.Utilerias.Primer_Color());
        contenido_JPanel.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
    }
    
    public void Establecer_Segundo_Color(){
        numero_Dia_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
        hora_JLabel.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
        descripcion_JTextPane.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
        contenido_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());
        contenido_JPanel.setForeground(CourseRoom.Utilerias.Segundo_Color_Fuente());
    }
    
    public void Establecer_Tercer_Color(){
        Colorear_Componentes();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JScrollPane descripcion_JScrollPane;
    private javax.swing.JTextPane descripcion_JTextPane;
    private javax.swing.JLabel hora_JLabel;
    private javax.swing.JLabel numero_Dia_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        String concatenacion = 
        CourseRoom.Utilerias.Concatenar(String.valueOf(CourseRoom.Utilerias.number().randomNumber(1, true)),
                ":",String.valueOf(CourseRoom.Utilerias.number().randomNumber(2, false))," P.M");
        hora_JLabel.setText(concatenacion);
        descripcion_JScrollPane.getViewport().setOpaque(false);
        descripcion_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        descripcion_JTextPane.setText(CourseRoom.Utilerias.Formato_HTML_Centro(CourseRoom.Utilerias.lorem().paragraph(2)));
        descripcion_JTextPane.setCaretPosition(0);
        
        Colorear_Componentes();
       
    }

    @Override
    public void Colorear_Componentes() {
        numero_Dia_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        hora_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        descripcion_JTextPane.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        contenido_JPanel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        contenido_JPanel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
    }

    
}
