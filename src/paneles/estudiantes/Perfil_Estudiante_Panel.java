/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import interfaces.Componentes_Interface;

/**
 *
 * @author LENOVO
 */
public class Perfil_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface{

    
    /**
     * Creates new form ProfilePanel
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Perfil_Estudiante_Panel() {
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

        imagen_Perfil_JLabel = new javax.swing.JLabel();
        apellidos_JLabel = new javax.swing.JLabel();
        nombres_JLabel = new javax.swing.JLabel();
        nombre_Usuario_jLabel = new javax.swing.JLabel();
        correo_JLabel = new javax.swing.JLabel();
        telefono_JLabel = new javax.swing.JLabel();
        tipo_Perfil_JLabel = new javax.swing.JLabel();
        fecha_Nacimiento_JLabel = new javax.swing.JLabel();
        localidad_JLabel = new javax.swing.JLabel();
        genero_JLabel = new javax.swing.JLabel();
        desempeno_Escolar_JButton = new javax.swing.JButton();
        editar_Perfil_JButton = new javax.swing.JButton();
        descripcion_JScrollPane = new javax.swing.JScrollPane();
        descripcion_JTextPane = new javax.swing.JTextPane();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1085, 630));

        imagen_Perfil_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_Perfil_JLabel.setToolTipText("Imagen De Perfil");
        imagen_Perfil_JLabel.setMaximumSize(new java.awt.Dimension(2000, 2000));
        imagen_Perfil_JLabel.setMinimumSize(new java.awt.Dimension(450, 450));
        imagen_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(450, 450));

        apellidos_JLabel.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        apellidos_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        apellidos_JLabel.setToolTipText("Apellido(s)");
        apellidos_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        apellidos_JLabel.setMaximumSize(new java.awt.Dimension(380, 50));
        apellidos_JLabel.setMinimumSize(new java.awt.Dimension(380, 50));
        apellidos_JLabel.setName("label"); // NOI18N
        apellidos_JLabel.setOpaque(true);
        apellidos_JLabel.setPreferredSize(new java.awt.Dimension(380, 50));

        nombres_JLabel.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        nombres_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombres_JLabel.setToolTipText("Nombre(s)");
        nombres_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nombres_JLabel.setMaximumSize(new java.awt.Dimension(380, 50));
        nombres_JLabel.setMinimumSize(new java.awt.Dimension(380, 50));
        nombres_JLabel.setName("label"); // NOI18N
        nombres_JLabel.setOpaque(true);
        nombres_JLabel.setPreferredSize(new java.awt.Dimension(380, 50));

        nombre_Usuario_jLabel.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        nombre_Usuario_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_Usuario_jLabel.setToolTipText("Nombre De Usuario");
        nombre_Usuario_jLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nombre_Usuario_jLabel.setMaximumSize(new java.awt.Dimension(430, 30));
        nombre_Usuario_jLabel.setMinimumSize(new java.awt.Dimension(430, 30));
        nombre_Usuario_jLabel.setOpaque(true);
        nombre_Usuario_jLabel.setPreferredSize(new java.awt.Dimension(430, 30));

        correo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        correo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        correo_JLabel.setToolTipText("Correo Electrónico");
        correo_JLabel.setMaximumSize(new java.awt.Dimension(380, 25));
        correo_JLabel.setMinimumSize(new java.awt.Dimension(380, 25));
        correo_JLabel.setName("label"); // NOI18N
        correo_JLabel.setPreferredSize(new java.awt.Dimension(380, 25));

        telefono_JLabel.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        telefono_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        telefono_JLabel.setToolTipText("Número De Teléfono");
        telefono_JLabel.setMaximumSize(new java.awt.Dimension(163, 25));
        telefono_JLabel.setMinimumSize(new java.awt.Dimension(163, 25));
        telefono_JLabel.setName("label"); // NOI18N
        telefono_JLabel.setPreferredSize(new java.awt.Dimension(163, 25));

        tipo_Perfil_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        tipo_Perfil_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tipo_Perfil_JLabel.setToolTipText("Tipo De Perfil");
        tipo_Perfil_JLabel.setMaximumSize(new java.awt.Dimension(163, 25));
        tipo_Perfil_JLabel.setMinimumSize(new java.awt.Dimension(163, 25));
        tipo_Perfil_JLabel.setName("label"); // NOI18N
        tipo_Perfil_JLabel.setPreferredSize(new java.awt.Dimension(163, 25));

        fecha_Nacimiento_JLabel.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        fecha_Nacimiento_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fecha_Nacimiento_JLabel.setToolTipText("Fecha De Nacimiento");
        fecha_Nacimiento_JLabel.setMaximumSize(new java.awt.Dimension(163, 25));
        fecha_Nacimiento_JLabel.setMinimumSize(new java.awt.Dimension(163, 25));
        fecha_Nacimiento_JLabel.setName("label"); // NOI18N
        fecha_Nacimiento_JLabel.setPreferredSize(new java.awt.Dimension(163, 25));

        localidad_JLabel.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        localidad_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        localidad_JLabel.setToolTipText("Localidad");
        localidad_JLabel.setMinimumSize(new java.awt.Dimension(380, 60));
        localidad_JLabel.setName("label"); // NOI18N
        localidad_JLabel.setPreferredSize(new java.awt.Dimension(380, 60));

        genero_JLabel.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        genero_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        genero_JLabel.setToolTipText("Género");
        genero_JLabel.setMaximumSize(new java.awt.Dimension(163, 25));
        genero_JLabel.setMinimumSize(new java.awt.Dimension(163, 25));
        genero_JLabel.setName("label"); // NOI18N
        genero_JLabel.setPreferredSize(new java.awt.Dimension(163, 25));

        desempeno_Escolar_JButton.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        desempeno_Escolar_JButton.setText("Mi Desempeño Escolar");
        desempeno_Escolar_JButton.setToolTipText("Muestra Tu Desempeño Escolar & Predicciones De Estas");
        desempeno_Escolar_JButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        desempeno_Escolar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desempeno_Escolar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desempeno_Escolar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                desempeno_Escolar_JButtonMouseExited(evt);
            }
        });

        editar_Perfil_JButton.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        editar_Perfil_JButton.setText("Editar Perfil");
        editar_Perfil_JButton.setToolTipText("Edita La Información De Tu Perfil");
        editar_Perfil_JButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editar_Perfil_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editar_Perfil_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editar_Perfil_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editar_Perfil_JButtonMouseExited(evt);
            }
        });

        descripcion_JScrollPane.setBorder(null);
        descripcion_JScrollPane.setOpaque(false);
        descripcion_JScrollPane.setRequestFocusEnabled(false);
        descripcion_JScrollPane.setVerifyInputWhenFocusTarget(false);
        descripcion_JScrollPane.setWheelScrollingEnabled(false);

        descripcion_JTextPane.setEditable(false);
        descripcion_JTextPane.setBorder(null);
        descripcion_JTextPane.setContentType("text/html"); // NOI18N
        descripcion_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        descripcion_JTextPane.setText("");
        descripcion_JTextPane.setOpaque(false);
        descripcion_JTextPane.setRequestFocusEnabled(false);
        descripcion_JTextPane.setVerifyInputWhenFocusTarget(false);
        descripcion_JScrollPane.setViewportView(descripcion_JTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen_Perfil_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_Usuario_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telefono_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(fecha_Nacimiento_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genero_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(tipo_Perfil_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombres_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(localidad_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(desempeno_Escolar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editar_Perfil_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(apellidos_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(correo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 16, Short.MAX_VALUE)))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombres_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(apellidos_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(correo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genero_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha_Nacimiento_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(localidad_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(descripcion_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagen_Perfil_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre_Usuario_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desempeno_Escolar_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editar_Perfil_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        imagen_Perfil_JLabel.getAccessibleContext().setAccessibleName("jLabelProfilePhoto");
    }// </editor-fold>//GEN-END:initComponents

    private void desempeno_Escolar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desempeno_Escolar_JButtonMouseExited
        // TODO add your handling code here:
        desempeno_Escolar_JButton.setBackground(CourseRoom.Segundo_Color());
        desempeno_Escolar_JButton.setForeground(CourseRoom.Segundo_Color_Fuente());
    }//GEN-LAST:event_desempeno_Escolar_JButtonMouseExited

    private void desempeno_Escolar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desempeno_Escolar_JButtonMouseEntered
        // TODO add your handling code here:
        desempeno_Escolar_JButton.setBackground(CourseRoom.Tercer_Color());
        desempeno_Escolar_JButton.setForeground(CourseRoom.Tercer_Color_Fuente());
    }//GEN-LAST:event_desempeno_Escolar_JButtonMouseEntered

    private void desempeno_Escolar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desempeno_Escolar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_desempeno_Escolar_JButtonMouseClicked

    private void editar_Perfil_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_Perfil_JButtonMouseEntered
        // TODO add your handling code here:
        editar_Perfil_JButton.setBackground(CourseRoom.Tercer_Color());
        editar_Perfil_JButton.setForeground(CourseRoom.Tercer_Color_Fuente());
    }//GEN-LAST:event_editar_Perfil_JButtonMouseEntered

    private void editar_Perfil_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_Perfil_JButtonMouseExited
        // TODO add your handling code here:
        editar_Perfil_JButton.setBackground(CourseRoom.Segundo_Color());
        editar_Perfil_JButton.setForeground(CourseRoom.Segundo_Color_Fuente());
    }//GEN-LAST:event_editar_Perfil_JButtonMouseExited

    private void editar_Perfil_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_Perfil_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Estudiante_Panel.Mostrar_Vista("Editar_Perfil");
        }
        
    }//GEN-LAST:event_editar_Perfil_JButtonMouseClicked

    public void Establecer_Imagen_Perfil(Image image){
        ImageIcon imagen_perfil = new ImageIcon(image.getScaledInstance(400,400,Image.SCALE_SMOOTH)); 
        imagen_Perfil_JLabel.setIcon(imagen_perfil);
    }
   
    public JLabel Obtener_Imagen_Perfil_JLabel(){
        return Perfil_Estudiante_Panel.imagen_Perfil_JLabel;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos_JLabel;
    private javax.swing.JLabel correo_JLabel;
    private javax.swing.JScrollPane descripcion_JScrollPane;
    private javax.swing.JTextPane descripcion_JTextPane;
    private javax.swing.JButton desempeno_Escolar_JButton;
    private javax.swing.JButton editar_Perfil_JButton;
    private javax.swing.JLabel fecha_Nacimiento_JLabel;
    private javax.swing.JLabel genero_JLabel;
    private static javax.swing.JLabel imagen_Perfil_JLabel;
    private javax.swing.JLabel localidad_JLabel;
    private javax.swing.JLabel nombre_Usuario_jLabel;
    private javax.swing.JLabel nombres_JLabel;
    private javax.swing.JLabel telefono_JLabel;
    private javax.swing.JLabel tipo_Perfil_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        Component[] componentes = this.getComponents();
        Component componente;
        
        for(int i = 0; i < componentes.length;i++){
            componente = componentes[i];
            componente.setForeground(CourseRoom.Primer_Color_Fuente());
        }
       
        nombres_JLabel.setText(CourseRoom.Faker().name().firstName() + " " + CourseRoom.Faker().name().firstName());
        apellidos_JLabel.setText(CourseRoom.Faker().name().lastName() + " " + CourseRoom.Faker().name().lastName());
        correo_JLabel.setText(CourseRoom.Faker().internet().emailAddress());
        localidad_JLabel.setText(CourseRoom.Formato_HTML_Izquierda(CourseRoom.Faker().address().fullAddress()));
        nombre_Usuario_jLabel.setText(CourseRoom.Faker().name().username());
        telefono_JLabel.setText(CourseRoom.Faker().phoneNumber().cellPhone());
        descripcion_JTextPane.setText(CourseRoom.Formato_HTML_Izquierda(CourseRoom.Faker().lorem().paragraph()));
        genero_JLabel.setText(CourseRoom.Faker().demographic().sex());
        fecha_Nacimiento_JLabel.setText(CourseRoom.Faker().backToTheFuture().date());
        
        ImageIcon imagen = new ImageIcon(Tablero_Estudiante_Panel.Imagen_Usuario());
        imagen_Perfil_JLabel.setIcon(imagen);
        nombres_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        apellidos_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        nombre_Usuario_jLabel.setForeground(CourseRoom.Primer_Color_Fuente()); 
        
        descripcion_JScrollPane.getViewport().setOpaque(false);
        descripcion_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        descripcion_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
    }
    
    @Override
    public void Colorear_Componentes(){
        imagen_Perfil_JLabel.setForeground(CourseRoom.Primer_Color_Fuente());
        apellidos_JLabel.setBackground(CourseRoom.Tercer_Color());
        apellidos_JLabel.setForeground(CourseRoom.Tercer_Color_Fuente());
        correo_JLabel.setForeground(CourseRoom.Primer_Color_Fuente());
        editar_Perfil_JButton.setForeground(CourseRoom.Segundo_Color_Fuente());
        editar_Perfil_JButton.setBackground(CourseRoom.Segundo_Color());
        fecha_Nacimiento_JLabel.setForeground(CourseRoom.Primer_Color_Fuente());
        genero_JLabel.setForeground(CourseRoom.Primer_Color_Fuente());
        localidad_JLabel.setForeground(CourseRoom.Primer_Color_Fuente());
        desempeno_Escolar_JButton.setForeground(CourseRoom.Segundo_Color_Fuente());
        desempeno_Escolar_JButton.setBackground(CourseRoom.Segundo_Color());
        nombre_Usuario_jLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        nombre_Usuario_jLabel.setBackground(CourseRoom.Segundo_Color());
        nombres_JLabel.setBackground(CourseRoom.Tercer_Color());
        nombres_JLabel.setForeground(CourseRoom.Tercer_Color_Fuente());
        telefono_JLabel.setForeground(CourseRoom.Primer_Color_Fuente());
        tipo_Perfil_JLabel.setForeground(CourseRoom.Primer_Color_Fuente());
        //imagen_Perfil_JLabel.setForeground(CourseRoom.Primer_Color_Fuente());
        descripcion_JTextPane.setForeground(CourseRoom.Primer_Color_Fuente());
        descripcion_JScrollPane.setForeground(CourseRoom.Primer_Color_Fuente());
    }
}
