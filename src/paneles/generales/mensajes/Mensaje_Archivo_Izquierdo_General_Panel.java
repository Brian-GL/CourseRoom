/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template archivo, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.generales.mensajes;

import interfaces.Componentes_Interface;
import java.io.File;
import javax.swing.ImageIcon;
import courseroom.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Mensaje_Archivo_Izquierdo_General_Panel extends javax.swing.JPanel implements Componentes_Interface{

    
    public Mensaje_Archivo_Izquierdo_General_Panel(
            String emisor,
            String fecha,
            File archivo) {

        initComponents();

        fecha_JLabel.setText(fecha);
        emisor_JLabel.setText(emisor);
        nombre_Archivo_JLabel.setText(archivo.getName());

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
        emisor_JLabel = new javax.swing.JLabel();
        fecha_JLabel = new javax.swing.JLabel();
        nombre_Archivo_JLabel = new javax.swing.JLabel();
        auxiliar_JPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(32767, 112));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 112));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_JPanel.setMaximumSize(new java.awt.Dimension(713, 100));
        contenido_JPanel.setPreferredSize(new java.awt.Dimension(713, 100));

        emisor_JLabel.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        emisor_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emisor_JLabel.setToolTipText("<html> <h3>Emisor del mensaje</h3> </html>");

        fecha_JLabel.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        fecha_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fecha_JLabel.setToolTipText("<html> <h3>Fecha y hora del mensaje recibido</h3> </html>");
        fecha_JLabel.setMaximumSize(new java.awt.Dimension(33210, 25));

        nombre_Archivo_JLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        nombre_Archivo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_Archivo_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/file.png"))); // NOI18N
        nombre_Archivo_JLabel.setToolTipText("<html> <h3>Nombre del archivo</h3> </html>");
        ((ImageIcon)nombre_Archivo_JLabel.getIcon()).getImage().flush();

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emisor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_Archivo_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emisor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre_Archivo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        auxiliar_JPanel.setOpaque(false);

        javax.swing.GroupLayout auxiliar_JPanelLayout = new javax.swing.GroupLayout(auxiliar_JPanel);
        auxiliar_JPanel.setLayout(auxiliar_JPanelLayout);
        auxiliar_JPanelLayout.setHorizontalGroup(
            auxiliar_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        auxiliar_JPanelLayout.setVerticalGroup(
            auxiliar_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(auxiliar_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(auxiliar_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel auxiliar_JPanel;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel emisor_JLabel;
    private javax.swing.JLabel fecha_JLabel;
    private javax.swing.JLabel nombre_Archivo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        Colorear_Componentes();
    }

    @Override
    public void Colorear_Componentes() {
        contenido_JPanel.setBackground(CourseRoom.Segundo_Color());
        contenido_JPanel.setForeground(CourseRoom.Segundo_Color_Fuente());

        fecha_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        emisor_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        nombre_Archivo_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
    }

}