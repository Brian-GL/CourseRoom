/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.generals;

import main.MainFrame;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import data.collections.PairDoublyLinkedList;
import data.structures.Pair;
import java.awt.image.PixelGrabber;
import javax.swing.Icon;
import data.interfaces.Color_Interface;
import data.interfaces.Componentes_Interface;
import data.interfaces.Limpieza_Interface;

/**
 *
 * @author LENOVO
 */
public class Miembro_General_Panel extends javax.swing.JPanel implements Limpieza_Interface,Color_Interface,Componentes_Interface{
    
    private String nombre_Completo;
    private Color primer_Color, primer_Color_Fuente, segundo_Color, segundo_Color_Fuente;

    /**
     * Creates new form MemberPanel
     */
    public Miembro_General_Panel() {
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
        imagen_jLabel = new javax.swing.JLabel();
        nombres_JLabel = new javax.swing.JLabel();
        apellidos_JLabel = new javax.swing.JLabel();
        nombre_Usuario_JLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 230));
        setMinimumSize(null);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(365, 230));

        imagen_jLabel.setToolTipText("Imagen Del Miembro");
        imagen_jLabel.setMaximumSize(new java.awt.Dimension(130, 130));
        imagen_jLabel.setMinimumSize(new java.awt.Dimension(130, 130));
        imagen_jLabel.setPreferredSize(new java.awt.Dimension(130, 130));

        nombres_JLabel.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        nombres_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombres_JLabel.setText("Nombre Del Miembro");
        nombres_JLabel.setToolTipText("Nombre(s) Del Miembro");

        apellidos_JLabel.setFont(new java.awt.Font("Gadugi", 2, 15)); // NOI18N
        apellidos_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apellidos_JLabel.setText("Apellido Del Miembro");
        apellidos_JLabel.setToolTipText("Apellido(s) Del Miembro");

        nombre_Usuario_JLabel.setFont(new java.awt.Font("Gadugi", 3, 15)); // NOI18N
        nombre_Usuario_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_Usuario_JLabel.setText("UserName Del Miembro");
        nombre_Usuario_JLabel.setToolTipText("Nombre De Usuario Del Miembro");

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombres_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apellidos_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_Usuario_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imagen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombres_JLabel)
                .addGap(6, 6, 6)
                .addComponent(apellidos_JLabel)
                .addGap(6, 6, 6)
                .addComponent(nombre_Usuario_JLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    public String Obtener_Nombre_Completo(){
        return this.nombre_Completo;
    }
    
    public Icon Obtener_Icono_Imagen(){
        return imagen_jLabel.getIcon();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos_JLabel;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel imagen_jLabel;
    private javax.swing.JLabel nombre_Usuario_JLabel;
    private javax.swing.JLabel nombres_JLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the primer_Color
     */
    public Color Obtener_Primer_Color() {
        return primer_Color;
    }

    /**
     * @return the primer_Color_Fuente
     */
    public Color Obtener_Primer_Color_Fuente() {
        return primer_Color_Fuente;
    }

    /**
     * @return the segundo_Color
     */
    public Color Obtener_Segundo_Color() {
        return segundo_Color;
    }

    /**
     * @return the segundo_Color_Fuente
     */
    public Color Obtener_Segundo_Color_Fuente() {
        return segundo_Color_Fuente;
    }

    @Override
    public void Iniciar_Componentes() {
         try {
             
            System.out.println("Member -> Getting Image From https://loremflickr.com/142/142/sunset,beach/all");
            URL url_Imagen = new URL("https://loremflickr.com/142/142/sunset,beach/all");
            Image obtener_Imagen = ImageIO.read(url_Imagen);
            
            Establecer_Colores(obtener_Imagen);
            
            ImageIcon icono_Imagen = new ImageIcon(obtener_Imagen);
            imagen_jLabel.setIcon(icono_Imagen);
            obtener_Imagen.flush();
            
            String nombre = MainFrame.getFaker().name().firstName() + " " +MainFrame.getFaker().name().firstName();
            String apellido = MainFrame.getFaker().name().lastName() + " " + MainFrame.getFaker().name().lastName();
            String nombre_Usuario = MainFrame.getFaker().name().username();
            
            nombre_Completo = MainFrame.Concatenar(nombre," ",apellido);
            apellidos_JLabel.setText(apellido);
            nombres_JLabel.setText(nombre);
            nombre_Usuario_JLabel.setText(nombre_Usuario);
            
            Colorear_Componentes();
            
            
        } catch (IOException ex) {
            MainFrame.getLogger().log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Colorear_Componentes() {
        apellidos_JLabel.setForeground(Obtener_Primer_Color_Fuente());
        nombre_Usuario_JLabel.setForeground(Obtener_Primer_Color_Fuente());
        nombres_JLabel.setForeground(Obtener_Primer_Color_Fuente());
        this.setBackground(Obtener_Primer_Color());
        this.setBorder(javax.swing.BorderFactory.createLineBorder(segundo_Color));

    }
    
    @Override
    public void Establecer_Colores(Image imagen){
        
        try {
            Random numero_aleatorio = new Random(System.currentTimeMillis());
            int auxiliar_maximo_int = 0;
            primer_Color = Color.BLACK;
            PairDoublyLinkedList<Integer, Color> lista_Colores = new PairDoublyLinkedList<>();
            PixelGrabber obtener_Pixeles = new PixelGrabber(imagen, 0, 0, -1, -1, false);
            int largo_imagen = imagen.getWidth(null)/2;
            int pixel, rojo, verde, azul, numero_auxiliar;
            Color color;
            Pair<Integer, Color> par_auxiliar;            
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

                    i += numero_aleatorio.nextInt(largo_imagen+1) + largo_imagen;
                }

                segundo_Color = primer_Color;
            
                int posicion, iteraciones = 0;
                
                if(lista_Colores.size() > 1){
                    
                    while(Math.abs(segundo_Color.getRGB() - primer_Color.getRGB()) < 3000000){
                        posicion = numero_aleatorio.nextInt((int)lista_Colores.size()-1);
                        segundo_Color = lista_Colores.get(posicion).second();
                        iteraciones++;
                        if(iteraciones > 25){
                             while(primer_Color.getRGB() == segundo_Color.getRGB()){
                                posicion = numero_aleatorio.nextInt((int)lista_Colores.size()-1);
                                segundo_Color = lista_Colores.get(posicion).second();
                            }
                             break;
                        }
                    }
                }
              
                rojo = primer_Color.getRed();
                primer_Color_Fuente = (rojo >= 155) ? Color.BLACK : Color.WHITE;
                rojo = segundo_Color.getRed();
                segundo_Color_Fuente = (rojo >= 155) ? Color.BLACK : Color.WHITE;
                
                lista_Colores.clear();
            }
            
        } catch (InterruptedException ex) {
            MainFrame.getLogger().log(Level.SEVERE, null, ex);
        }
    }
    
     @Override
    public void Limpiar() {
        primer_Color = primer_Color_Fuente = segundo_Color = segundo_Color_Fuente = null;
        nombre_Completo = null;
    }
}
