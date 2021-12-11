/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import main.CourseRoom;
import datos.colecciones.Lista_Pares;
import interfaces.Color_Interface;
import datos.estructuras.Par;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;

/**
 *
 * @author LENOVO
 */
public class Caja_Aviso_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface, Color_Interface, Limpieza_Interface{

    private Color primer_Color,primer_Color_Fuente, segundo_Color;
    
    /**
     * Creates new form BoxAvisoPanel
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Caja_Aviso_Estudiante_Panel() {
        
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
        imagen_JLabel = new javax.swing.JLabel();
        nombre_JLabel = new javax.swing.JLabel();
        descripcion_JLabel = new javax.swing.JLabel();
        fecha_Hora_JLabel = new javax.swing.JLabel();
        estatus_JLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 133));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 133));
        setRequestFocusEnabled(false);

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_JPanel.setMaximumSize(new java.awt.Dimension(32767, 121));
        contenido_JPanel.setPreferredSize(new java.awt.Dimension(1068, 121));

        imagen_JLabel.setMaximumSize(new java.awt.Dimension(105, 105));
        imagen_JLabel.setMinimumSize(new java.awt.Dimension(105, 105));
        imagen_JLabel.setPreferredSize(new java.awt.Dimension(105, 105));
        imagen_JLabel.setRequestFocusEnabled(false);

        nombre_JLabel.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        nombre_JLabel.setForeground(java.awt.Color.white);
        nombre_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombre_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/notification.png"))); // NOI18N
        nombre_JLabel.setToolTipText("Provenencia Del Aviso");
        nombre_JLabel.setMaximumSize(new java.awt.Dimension(488, 32));
        nombre_JLabel.setMinimumSize(new java.awt.Dimension(488, 32));
        nombre_JLabel.setPreferredSize(new java.awt.Dimension(488, 32));

        descripcion_JLabel.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        descripcion_JLabel.setForeground(java.awt.Color.white);
        descripcion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descripcion_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/announcement.png"))); // NOI18N
        descripcion_JLabel.setToolTipText("Descripción Corta Del Aviso");
        descripcion_JLabel.setMaximumSize(new java.awt.Dimension(417, 22));
        descripcion_JLabel.setMinimumSize(new java.awt.Dimension(417, 22));
        descripcion_JLabel.setPreferredSize(new java.awt.Dimension(417, 22));

        fecha_Hora_JLabel.setFont(new java.awt.Font("Gadugi", 2, 14)); // NOI18N
        fecha_Hora_JLabel.setForeground(java.awt.Color.white);
        fecha_Hora_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fecha_Hora_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/time-limit.png"))); // NOI18N
        fecha_Hora_JLabel.setToolTipText("Fecha & Hora Del Aviso");

        estatus_JLabel.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        estatus_JLabel.setForeground(java.awt.Color.white);
        estatus_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estatus_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/read.png"))); // NOI18N
        estatus_JLabel.setToolTipText("Estado Del Aviso");

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(fecha_Hora_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estatus_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descripcion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(nombre_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estatus_JLabel)
                            .addComponent(fecha_Hora_JLabel))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel descripcion_JLabel;
    private javax.swing.JLabel estatus_JLabel;
    private javax.swing.JLabel fecha_Hora_JLabel;
    private javax.swing.JLabel imagen_JLabel;
    private javax.swing.JLabel nombre_JLabel;
    // End of variables declaration//GEN-END:variables

     @Override
    public void Iniciar_Componentes() {
        try {
            System.out.println("Aviso -> Getting Image From https://loremflickr.com/105/105/night");
            URL url_imagen = new URL("https://loremflickr.com/105/105/night");
            
            descripcion_JLabel.setText(CourseRoom.Faker().lorem().paragraph(1));
            fecha_Hora_JLabel.setText(CourseRoom.Faker().date().birthday(0,1).toString());
            nombre_JLabel.setText(CourseRoom.Faker().university().name());
            estatus_JLabel.setText((CourseRoom.Faker().bool().bool()) ? "Leído" : "No Leído");
            
            Image obtener_imagen = ImageIO.read(url_imagen);
            ImageIcon icono_imagen = new ImageIcon(obtener_imagen);
            imagen_JLabel.setIcon(icono_imagen);
            Establecer_Colores(obtener_imagen);
            obtener_imagen.flush();
            
            Colorear_Componentes();
            
        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            
        }
    }
    
    @Override
    public void Colorear_Componentes() {
        
        descripcion_JLabel.setForeground(primer_Color_Fuente);
        estatus_JLabel.setForeground(primer_Color_Fuente);
        fecha_Hora_JLabel.setForeground(primer_Color_Fuente);
        nombre_JLabel.setForeground(primer_Color_Fuente);
        contenido_JPanel.setBackground(primer_Color);
        contenido_JPanel.setForeground(primer_Color_Fuente);
    }

    @Override
    public void Establecer_Colores(Image imagen) {
         try {
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

                    i += CourseRoom.Random().nextInt(largo_imagen+1) + largo_imagen;
                }

                segundo_Color = primer_Color;
            
                int posicion, iteraciones = 0;
                
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
              
                rojo = primer_Color.getRed();
                primer_Color_Fuente = (rojo >= 155) ? Color.BLACK : Color.WHITE;
                
                lista_Colores.clear();

            }
            
        } catch (InterruptedException ex) {
            
        }
    }

    @Override
    public void Limpiar() {
        primer_Color = primer_Color_Fuente =  segundo_Color = null;
    }
    
}
