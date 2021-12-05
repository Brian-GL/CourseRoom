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
public class Caja_Chat_Estudiante_Panel extends javax.swing.JPanel implements Color_Interface,Limpieza_Interface,Componentes_Interface{

    private Color primer_Color, primer_Color_Fuente, segundo_Color, segundo_Color_Fuente, tercer_Color, tercer_Color_Fuente;
    private Chat_Estudiante_Panel chat_Estudiante_Panel;
    private String id;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Caja_Chat_Estudiante_Panel(String _id) {
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
        ultimo_Mensaje_JLabel = new javax.swing.JLabel();
        numero_No_Leidos_JLabel = new javax.swing.JLabel();
        fecha_Hora_Mensaje_JLabel = new javax.swing.JLabel();

        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(32767, 157));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(542, 157));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_JPanel.setPreferredSize(new java.awt.Dimension(526, 141));

        imagen_JLabel.setMaximumSize(new java.awt.Dimension(129, 129));
        imagen_JLabel.setMinimumSize(new java.awt.Dimension(129, 129));
        imagen_JLabel.setPreferredSize(new java.awt.Dimension(129, 129));
        imagen_JLabel.setRequestFocusEnabled(false);
        imagen_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen_JLabelMouseClicked(evt);
            }
        });

        nombre_JLabel.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        nombre_JLabel.setForeground(java.awt.Color.white);
        nombre_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombre_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/online-chat_1.png"))); // NOI18N
        nombre_JLabel.setToolTipText("Nombre Del Chat");
        nombre_JLabel.setMaximumSize(new java.awt.Dimension(488, 32));
        nombre_JLabel.setMinimumSize(new java.awt.Dimension(488, 32));
        nombre_JLabel.setPreferredSize(new java.awt.Dimension(488, 32));
        nombre_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombre_JLabelMouseClicked(evt);
            }
        });

        ultimo_Mensaje_JLabel.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        ultimo_Mensaje_JLabel.setForeground(java.awt.Color.white);
        ultimo_Mensaje_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ultimo_Mensaje_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/messaging.png"))); // NOI18N
        ultimo_Mensaje_JLabel.setToolTipText("Último Mensaje Recibido");
        ultimo_Mensaje_JLabel.setMaximumSize(new java.awt.Dimension(417, 22));
        ultimo_Mensaje_JLabel.setMinimumSize(new java.awt.Dimension(417, 22));
        ultimo_Mensaje_JLabel.setPreferredSize(new java.awt.Dimension(417, 22));

        numero_No_Leidos_JLabel.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        numero_No_Leidos_JLabel.setForeground(java.awt.Color.white);
        numero_No_Leidos_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_No_Leidos_JLabel.setToolTipText("Número De Mensajes No Leídos");

        fecha_Hora_Mensaje_JLabel.setFont(new java.awt.Font("Gadugi", 2, 14)); // NOI18N
        fecha_Hora_Mensaje_JLabel.setForeground(java.awt.Color.white);
        fecha_Hora_Mensaje_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fecha_Hora_Mensaje_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/circular-clock.png"))); // NOI18N
        fecha_Hora_Mensaje_JLabel.setToolTipText("Fecha & Hora Del Último Mensaje");

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(fecha_Hora_Mensaje_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numero_No_Leidos_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombre_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ultimo_Mensaje_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(nombre_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ultimo_Mensaje_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha_Hora_Mensaje_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_No_Leidos_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if(SwingUtilities.isLeftMouseButton(evt)){
            Tablero_Estudiante_Panel.Mostrar_Vista(this.id);
        }
    }//GEN-LAST:event_nombre_JLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel fecha_Hora_Mensaje_JLabel;
    private javax.swing.JLabel imagen_JLabel;
    private javax.swing.JLabel nombre_JLabel;
    private javax.swing.JLabel numero_No_Leidos_JLabel;
    private javax.swing.JLabel ultimo_Mensaje_JLabel;
    // End of variables declaration//GEN-END:variables

 
    @Override
    public void Iniciar_Componentes() {
        try {

            System.out.println("Chat ID: " + id + " -> Getting Image From https://loremflickr.com/644/720/sunset,beach/all");
            URL url_Imagen = new URL("https://loremflickr.com/129/129/sunset,beach/all");
            Image obtener_imagen = ImageIO.read(url_Imagen);
            ImageIcon icono_Chat = new ImageIcon(obtener_imagen);
            imagen_JLabel.setIcon(icono_Chat);
            
            Establecer_Colores(obtener_imagen);
            Colorear_Componentes();
            
            nombre_JLabel.setText(CourseRoom.Faker().rickAndMorty().character());
            ultimo_Mensaje_JLabel.setText(CourseRoom.Faker().shakespeare().romeoAndJulietQuote());
            numero_No_Leidos_JLabel.setText(CourseRoom.Faker().number().digits(1));
            fecha_Hora_Mensaje_JLabel.setText(CourseRoom.Faker().date().birthday().toString());
            chat_Estudiante_Panel = new Chat_Estudiante_Panel(nombre_JLabel.getText(), 
                    primer_Color, primer_Color_Fuente, segundo_Color,segundo_Color_Fuente, tercer_Color, tercer_Color_Fuente);
            
            Tablero_Estudiante_Panel.Agregar_Vista(chat_Estudiante_Panel, this.id);
            obtener_imagen.flush();

        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            
        }
    }

    @Override
    public void Colorear_Componentes() {
        
        fecha_Hora_Mensaje_JLabel.setForeground(primer_Color_Fuente);
        nombre_JLabel.setForeground(primer_Color_Fuente);
        numero_No_Leidos_JLabel.setForeground(primer_Color_Fuente);
        ultimo_Mensaje_JLabel.setForeground(primer_Color_Fuente);

        contenido_JPanel.setBackground(primer_Color);
        contenido_JPanel.setForeground(primer_Color_Fuente);
    }
    
     @Override
    public void Establecer_Colores(Image imagen){
       try {
            Random numero_Aleatorio = new Random(System.currentTimeMillis());
            int auxiliar_maximo_int = 0;
            primer_Color = Color.BLACK;
            Lista_Pares<Integer, Color> lista_Colores = new Lista_Pares<>();
            PixelGrabber obtener_Pixeles = new PixelGrabber(imagen, 0, 0, -1, -1, false);
            int largo_imagen = imagen.getWidth(null)/2;
            int pixel, rojo, verde, azul, numero_auxiliar;
            Color color;
            Par<Integer, Color> par_auxiliar;            
            if (obtener_Pixeles.grabPixels()) {
                int[] pixeles = (int[]) obtener_Pixeles.getPixels();
                for(int i = 0; i < pixeles.length; i++){
                    pixel = pixeles[i];
                    rojo = (pixel  & 0x00ff0000) >> 16;
                    verde = (pixel & 0x0000ff00) >> 8;
                    azul = pixel & 0x000000ff;
                    color = new Color(rojo,verde,azul);
                    par_auxiliar = lista_Colores.get_from_second(color);
            
                    if (par_auxiliar != null) {//exist
                        numero_auxiliar = par_auxiliar.first()+ 1;
                        par_auxiliar.first(numero_auxiliar);
                        if (numero_auxiliar > auxiliar_maximo_int) {
                            primer_Color = color;
                            auxiliar_maximo_int = numero_auxiliar;
                        }
                    } else {
                        lista_Colores.push_back(1, color);
                    }

                    i += numero_Aleatorio.nextInt(largo_imagen+1) + largo_imagen;
                }

                segundo_Color = primer_Color;
            
                int posicion, iteraciones = 0;
                
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
                if (lista_Colores.size() > 2) {
                    iteraciones = 0;

                    while (Math.abs(tercer_Color.getRGB() - primer_Color.getRGB()) < 3000000 || Math.abs(segundo_Color.getRGB() - tercer_Color.getRGB()) < 3000000) {
                        posicion = numero_Aleatorio.nextInt((int) lista_Colores.size() - 1);
                        tercer_Color = lista_Colores.get(posicion).second();
                        iteraciones++;
                        if (iteraciones > 50) {
                            while (tercer_Color.getRGB() == primer_Color.getRGB() || tercer_Color.getRGB() == segundo_Color.getRGB()) {
                                posicion = numero_Aleatorio.nextInt((int) lista_Colores.size() - 1);
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
        primer_Color = primer_Color_Fuente = segundo_Color = segundo_Color_Fuente = tercer_Color = tercer_Color_Fuente = null;
        chat_Estudiante_Panel.Limpiar();
        id = null;
    }


}
