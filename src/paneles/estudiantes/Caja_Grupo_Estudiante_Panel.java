/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import datos.colecciones.Lista_Pares;
import datos.estructuras.Pair;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
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
public class Caja_Grupo_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface,Componentes_Interface,Color_Interface{

    private Color primer_Color, segundo_Color, tercer_Color,primer_Color_Fuente, segundo_Color_Fuente, tercer_Color_Fuente;
    private Grupo_Estudiante_Panel grupo_Estudiante_Panel;
    private String id;
 
    
    public Caja_Grupo_Estudiante_Panel(String _id) {
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
        imagen_JLabel = new javax.swing.JLabel();
        nombre_JLabel = new javax.swing.JLabel();
        curso_JLabel = new javax.swing.JLabel();
        ultima_Actualizacion_JLabel = new javax.swing.JLabel();
        numero_Integrantes_JLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 143));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(526, 143));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imagen_JLabel.setToolTipText("Imagen Del Grupo");
        imagen_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagen_JLabel.setMaximumSize(new java.awt.Dimension(164, 164));
        imagen_JLabel.setMinimumSize(new java.awt.Dimension(164, 164));
        imagen_JLabel.setPreferredSize(new java.awt.Dimension(164, 164));
        imagen_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen_JLabelMouseClicked(evt);
            }
        });

        nombre_JLabel.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        nombre_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombre_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/group_1.png"))); // NOI18N
        nombre_JLabel.setToolTipText("Nombre Del Grupo");
        nombre_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombre_JLabelMouseClicked(evt);
            }
        });

        curso_JLabel.setFont(new java.awt.Font("Gadugi", 3, 16)); // NOI18N
        curso_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        curso_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/teacher.png"))); // NOI18N
        curso_JLabel.setToolTipText("Curso De Proveniencia Del Grupo");
        curso_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curso_JLabelMouseClicked(evt);
            }
        });

        ultima_Actualizacion_JLabel.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        ultima_Actualizacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ultima_Actualizacion_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/volume.png"))); // NOI18N
        ultima_Actualizacion_JLabel.setToolTipText("Actualización Más Reciente Del Grupo");

        numero_Integrantes_JLabel.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        numero_Integrantes_JLabel.setForeground(java.awt.Color.white);
        numero_Integrantes_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_Integrantes_JLabel.setToolTipText("Número De Mensajes No Leídos");

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(ultima_Actualizacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numero_Integrantes_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombre_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(curso_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(nombre_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(curso_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ultima_Actualizacion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero_Integrantes_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imagen_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Estudiante_Panel.Mostrar_Vista(this.id);
        }
    }//GEN-LAST:event_imagen_JLabelMouseClicked

    private void nombre_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_JLabelMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isLeftMouseButton(evt)) {
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
    private javax.swing.JLabel imagen_JLabel;
    private javax.swing.JLabel nombre_JLabel;
    private javax.swing.JLabel numero_Integrantes_JLabel;
    private javax.swing.JLabel ultima_Actualizacion_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        try {
            
            System.out.println("Group ID: " + id + " -> Getting Image From https://loremflickr.com/644/720/sunset,beach/all");
            URL url_Imagen = new URL("https://loremflickr.com/131/131/sunset,beach/all");
            Image obtener_Imagen = ImageIO.read(url_Imagen);
            ImageIcon groupIcon = new ImageIcon(obtener_Imagen);
            imagen_JLabel.setIcon(groupIcon);
            
            Establecer_Colores(obtener_Imagen);
            
            nombre_JLabel.setText(CourseRoom.Faker().team().sport());
            ultima_Actualizacion_JLabel.setText(CourseRoom.Faker().team().state());
            curso_JLabel.setText(CourseRoom.Faker().team().name());
            numero_Integrantes_JLabel.setText(CourseRoom.Concatenar(CourseRoom.Faker().number().digit()," Integrantes"));
            
            grupo_Estudiante_Panel = new Grupo_Estudiante_Panel(obtener_Imagen, nombre_JLabel.getText(), primer_Color, segundo_Color, tercer_Color, primer_Color_Fuente, segundo_Color_Fuente, tercer_Color_Fuente);
            Tablero_Estudiante_Panel.Agregar_Vista(grupo_Estudiante_Panel, id);
            obtener_Imagen.flush();
            
            Colorear_Componentes();
            
        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            
        }
    }

    @Override
    public void Colorear_Componentes() {
        curso_JLabel.setForeground(primer_Color_Fuente);
        nombre_JLabel.setForeground(primer_Color_Fuente);
        ultima_Actualizacion_JLabel.setForeground(primer_Color_Fuente);
        contenido_JPanel.setBackground(primer_Color);
        contenido_JPanel.setForeground(primer_Color_Fuente);
    }
    
     @Override
    public void Establecer_Colores(Image image){
        
        try {
            Random numero_Aleatorio = new Random(System.currentTimeMillis());
            int maximo_auxiliar = 0;
            primer_Color = Color.BLACK;
            Lista_Pares<Integer, Color> lista_Colores = new Lista_Pares<>();
            PixelGrabber obtener_Pixeles = new PixelGrabber(image, 0, 0, -1, -1, false);
            int largo_Imagen = image.getWidth(null)/2;
            int[] pixeles;
            int pixel,rojo,verde,azul,numero_Auxiliar,posicion;
            Color color;
            Pair<Integer, Color> par;
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

                    i += numero_Aleatorio.nextInt(largo_Imagen+1) + largo_Imagen;
                }

                segundo_Color = primer_Color;
            
                int iteraciones = 0;
                if(lista_Colores.size() > 1){
                    
                    while(Math.abs(segundo_Color.getRGB() - primer_Color.getRGB()) < 3000000){
                        posicion = numero_Aleatorio.nextInt((int)lista_Colores.size()-1);
                        segundo_Color = lista_Colores.get(posicion).second();
                        iteraciones++;
                        if(iteraciones > 25){
                             while(primer_Color.getRGB() == segundo_Color.getRGB()){
                                posicion = numero_Aleatorio.nextInt((int)lista_Colores.size()-1);
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
                        posicion = numero_Aleatorio.nextInt((int)lista_Colores.size()-1);
                        tercer_Color = lista_Colores.get(posicion).second();
                        iteraciones++;
                        if(iteraciones > 50){
                            while(tercer_Color.getRGB() == primer_Color.getRGB() || tercer_Color.getRGB() == segundo_Color.getRGB()){
                                posicion = numero_Aleatorio.nextInt((int)lista_Colores.size()-1);
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
        grupo_Estudiante_Panel.Limpiar();
    }

}
