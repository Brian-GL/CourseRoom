/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import datos.colecciones.Lista_Pares;
import datos.estructuras.Par;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import interfaces.Color_Interface;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;

/**
 *
 * @author LENOVO
 */
public class Caja_Tarea_Estudiante_Panel extends javax.swing.JPanel implements Color_Interface, Limpieza_Interface, Componentes_Interface{

    private Color primer_Color, segundo_Color, tercer_Color,primer_Color_Fuente, segundo_Color_Fuente, tercer_Color_Fuente;
    private String id;
    private Tarea_Estudiante_Panel tarea_Estudiante_Panel;
    
    
    public Caja_Tarea_Estudiante_Panel(String _id) {
        initComponents();
        
        this.id = _id;
        
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
        imagen_Curso_JLabel = new javax.swing.JLabel();
        curso_JLabel = new javax.swing.JLabel();
        nombre_JLabel = new javax.swing.JLabel();
        fecha_Entrega_JLabel = new javax.swing.JLabel();
        tipo_JLabel = new javax.swing.JLabel();
        estatus_JLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 174));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 174));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_JPanel.setMaximumSize(new java.awt.Dimension(32767, 162));

        imagen_Curso_JLabel.setToolTipText("Imagen Del Curso");
        imagen_Curso_JLabel.setMaximumSize(new java.awt.Dimension(146, 146));
        imagen_Curso_JLabel.setMinimumSize(new java.awt.Dimension(146, 146));
        imagen_Curso_JLabel.setPreferredSize(new java.awt.Dimension(146, 146));
        imagen_Curso_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen_Curso_JLabelMouseClicked(evt);
            }
        });

        curso_JLabel.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        curso_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        curso_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/course.png"))); // NOI18N
        curso_JLabel.setToolTipText("Curso De Proveniencia De La Tarea");
        curso_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curso_JLabelMouseClicked(evt);
            }
        });

        nombre_JLabel.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        nombre_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombre_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/homework_2.png"))); // NOI18N
        nombre_JLabel.setToolTipText("Nombre De La Tarea");
        nombre_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombre_JLabelMouseClicked(evt);
            }
        });

        fecha_Entrega_JLabel.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        fecha_Entrega_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fecha_Entrega_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/homework_1.png"))); // NOI18N
        fecha_Entrega_JLabel.setToolTipText("Fecha De Entrega");

        tipo_JLabel.setFont(new java.awt.Font("Gadugi", 2, 16)); // NOI18N
        tipo_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/writing.png"))); // NOI18N
        tipo_JLabel.setToolTipText("Tipo De Tarea");

        estatus_JLabel.setFont(new java.awt.Font("Gadugi", 2, 16)); // NOI18N
        estatus_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/homework_3.png"))); // NOI18N
        estatus_JLabel.setToolTipText("Estatus De La Tarea");

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen_Curso_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(fecha_Entrega_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estatus_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tipo_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(curso_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen_Curso_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(nombre_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(curso_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha_Entrega_JLabel)
                            .addComponent(estatus_JLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void imagen_Curso_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen_Curso_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Estudiante_Panel.Mostrar_Vista(this.id);
        }
    }//GEN-LAST:event_imagen_Curso_JLabelMouseClicked

    private void nombre_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Estudiante_Panel.Mostrar_Vista(this.id);
        }
    }//GEN-LAST:event_nombre_JLabelMouseClicked

    private void curso_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_curso_JLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel curso_JLabel;
    private javax.swing.JLabel estatus_JLabel;
    private javax.swing.JLabel fecha_Entrega_JLabel;
    private javax.swing.JLabel imagen_Curso_JLabel;
    private javax.swing.JLabel nombre_JLabel;
    private javax.swing.JLabel tipo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        try {

            nombre_JLabel.setText(CourseRoom.Faker().book().title());
            fecha_Entrega_JLabel.setText(CourseRoom.Faker().date().birthday(0, 1).toString());
            tipo_JLabel.setText(CourseRoom.Faker().book().genre());
            curso_JLabel.setText(CourseRoom.Faker().educator().course());
            estatus_JLabel.setText((CourseRoom.Faker().bool().bool()) ? "Entregada" : "Pendiente");
            
            System.out.println("Tarea ID: " + this.id + " -> Getting Image From https://picsum.photos/146/146?random="+id);
            URL url_Imagen = new URL(CourseRoom.Concatenar("https://picsum.photos/146/146?random=",id));
            Image obtener_Imagen = ImageIO.read(url_Imagen);
            ImageIcon icono_Tarea = new ImageIcon(obtener_Imagen);
            imagen_Curso_JLabel.setIcon(icono_Tarea);
            
            Establecer_Colores(obtener_Imagen);
            Colorear_Componentes();
            
            tarea_Estudiante_Panel = new Tarea_Estudiante_Panel(nombre_JLabel.getText(), primer_Color, segundo_Color, tercer_Color, primer_Color_Fuente, 
                    segundo_Color_Fuente, tercer_Color_Fuente);
            
            Tablero_Estudiante_Panel.Agregar_Vista(tarea_Estudiante_Panel, id);
            obtener_Imagen.flush();
        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            
        }
    }

    @Override
    public void Colorear_Componentes() {
        estatus_JLabel.setForeground(primer_Color_Fuente);
        curso_JLabel.setForeground(primer_Color_Fuente);
        fecha_Entrega_JLabel.setForeground(primer_Color_Fuente);
        nombre_JLabel.setForeground(primer_Color_Fuente);
        tipo_JLabel.setForeground(primer_Color_Fuente);

        contenido_JPanel.setBackground(primer_Color);
        contenido_JPanel.setForeground(primer_Color_Fuente);
    }
    
    
    @Override
    public void Establecer_Colores(Image image){
       try {
            int maximo_auxiliar = 0;
            primer_Color = Color.BLACK;
            Lista_Pares<Integer, Color> lista_Colores = new Lista_Pares<>();
            PixelGrabber obtener_Pixeles = new PixelGrabber(image, 0, 0, -1, -1, false);
            int largo_Imagen = image.getWidth(null)/2;
            int[] pixeles;
            int pixel,rojo,verde,azul,numero_Auxiliar,posicion;
            Color color;
            Par<Integer, Color> par;
            if (obtener_Pixeles.grabPixels()) {
                pixeles = (int[]) obtener_Pixeles.getPixels();
                for(int i = 0; i < pixeles.length; i++){
                    pixel = pixeles[i];
                    rojo = (pixel  & 0x00ff0000) >> 16;
                    verde = (pixel & 0x0000ff00) >> 8;
                    azul = pixel & 0x000000ff;
                    color = new Color(rojo,verde,azul);
                    par = lista_Colores.get_from_second(color);
            
                    if (par != null) { //existe
                        numero_Auxiliar = par.first()+ 1;
                        par.first(numero_Auxiliar);
                        if (numero_Auxiliar > maximo_auxiliar) {
                            primer_Color = color;
                            maximo_auxiliar = numero_Auxiliar;
                        }
                    } else {
                        lista_Colores.push_back(1, color);
                    }

                    i += CourseRoom.Random().nextInt(largo_Imagen+1) + largo_Imagen;
                }

                segundo_Color = primer_Color;
            
                int iteraciones = 0;
                if(lista_Colores.size() > 1){
                    
                    while(Math.abs(segundo_Color.getRGB() - primer_Color.getRGB()) < 3000000){
                        posicion = CourseRoom.Random().nextInt((int)lista_Colores.size()-1);
                        segundo_Color = lista_Colores.get(posicion).second();
                        iteraciones++;
                        if(iteraciones > 25){
                             while(primer_Color.getRGB() == segundo_Color.getRGB()){
                                posicion = CourseRoom.Random().nextInt((int)lista_Colores.size()-1);
                                segundo_Color = lista_Colores.get(posicion).second();
                            }
                             break;
                        }
                    }
                }
               
                tercer_Color = segundo_Color;
                if(lista_Colores.size() > 2){
                    iteraciones = 0;
                    
                    while(Math.abs(tercer_Color.getRGB() - primer_Color.getRGB()) < 3000000 || Math.abs(segundo_Color.getRGB() - tercer_Color.getRGB()) < 3000000){
                        posicion = CourseRoom.Random().nextInt((int)lista_Colores.size()-1);
                        tercer_Color = lista_Colores.get(posicion).second();
                        iteraciones++;
                        if(iteraciones > 50){
                            while(tercer_Color.getRGB() == primer_Color.getRGB() || tercer_Color.getRGB() == segundo_Color.getRGB()){
                                posicion = CourseRoom.Random().nextInt((int)lista_Colores.size()-1);
                                tercer_Color = lista_Colores.get(posicion).second();
                            }
                            break;
                        }
                    }
                }
                
                rojo = primer_Color.getRed();
                primer_Color_Fuente = (rojo >= 155) ? Color.BLACK : Color.WHITE;
                rojo = segundo_Color.getRed();
                segundo_Color_Fuente = (rojo >= 155) ? Color.BLACK : Color.WHITE;
                rojo = tercer_Color.getRed();
                tercer_Color_Fuente = (rojo >= 155) ? Color.BLACK : Color.WHITE;
                lista_Colores.clear();
                
            }
            
        } catch (InterruptedException ex) {
            
        }
          
    }
    
    
     @Override
    public void Limpiar() {
        primer_Color = segundo_Color = tercer_Color =primer_Color_Fuente = segundo_Color_Fuente = tercer_Color_Fuente = null;
        id = null;
        tarea_Estudiante_Panel.Limpiar();
    }
}
