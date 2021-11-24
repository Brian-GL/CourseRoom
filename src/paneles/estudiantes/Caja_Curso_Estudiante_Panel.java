/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

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
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import interfaces.Color_Interface;
import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;

/**
 *
 * @author LENOVO
 */
public class Caja_Curso_Estudiante_Panel extends javax.swing.JPanel implements Color_Interface,Limpieza_Interface,Componentes_Interface{

    private String id;
    private Color primer_Color, segundo_Color, primer_Color_Fuente, segundo_Color_Fuente;
    
   
    public Caja_Curso_Estudiante_Panel(String _id) {
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

        imagen_Curso_JLabel = new javax.swing.JLabel();
        informacion_JPanel = new javax.swing.JPanel();
        imagen_Profesor_JLabel = new javax.swing.JLabel();
        numero_Estudiantes_JLabel = new javax.swing.JLabel();
        calificacion_JScrollPane = new javax.swing.JScrollPane();
        calificacion_JTextPane = new javax.swing.JTextPane();
        nombre_JLabel = new javax.swing.JLabel();
        nombre_Profesor_JLabel = new javax.swing.JLabel();
        resenas_JButton = new javax.swing.JButton();
        descripcion_JLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 187));
        setMinimumSize(new java.awt.Dimension(824, 187));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(824, 187));

        imagen_Curso_JLabel.setToolTipText("Imagen De Perfil Del Curso");
        imagen_Curso_JLabel.setMaximumSize(new java.awt.Dimension(175, 175));
        imagen_Curso_JLabel.setMinimumSize(new java.awt.Dimension(175, 175));
        imagen_Curso_JLabel.setPreferredSize(new java.awt.Dimension(175, 175));
        imagen_Curso_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen_Curso_JLabelMouseClicked(evt);
            }
        });

        imagen_Profesor_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_Profesor_JLabel.setToolTipText("Perfil Del Profesor");
        imagen_Profesor_JLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagen_Profesor_JLabel.setMaximumSize(new java.awt.Dimension(64, 64));
        imagen_Profesor_JLabel.setMinimumSize(new java.awt.Dimension(64, 64));
        imagen_Profesor_JLabel.setPreferredSize(new java.awt.Dimension(64, 64));

        numero_Estudiantes_JLabel.setFont(new java.awt.Font("Gadugi", 2, 14)); // NOI18N
        numero_Estudiantes_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numero_Estudiantes_JLabel.setToolTipText("Número De Estudiantes");
        numero_Estudiantes_JLabel.setFocusable(false);
        numero_Estudiantes_JLabel.setRequestFocusEnabled(false);
        numero_Estudiantes_JLabel.setVerifyInputWhenFocusTarget(false);

        calificacion_JScrollPane.setBorder(null);
        calificacion_JScrollPane.setOpaque(false);

        calificacion_JTextPane.setEditable(false);
        calificacion_JTextPane.setBorder(null);
        calificacion_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        calificacion_JTextPane.setToolTipText("Calificación:");
        calificacion_JTextPane.setFocusable(false);
        calificacion_JTextPane.setOpaque(false);
        calificacion_JTextPane.setPreferredSize(new java.awt.Dimension(71, 28));
        calificacion_JTextPane.setRequestFocusEnabled(false);
        calificacion_JTextPane.setVerifyInputWhenFocusTarget(false);
        calificacion_JScrollPane.setViewportView(calificacion_JTextPane);

        nombre_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        nombre_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/teacher.png"))); // NOI18N
        nombre_JLabel.setToolTipText("Nombre Del Curso");

        nombre_Profesor_JLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        nombre_Profesor_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/profile.png"))); // NOI18N
        nombre_Profesor_JLabel.setToolTipText("Nombre Del Maestro");

        resenas_JButton.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        resenas_JButton.setText("Ver Reseñas");
        resenas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resenas_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resenas_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resenas_JButtonMouseExited(evt);
            }
        });

        descripcion_JLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        descripcion_JLabel.setText("Información Resumida Del Curso");
        descripcion_JLabel.setToolTipText("Información Resumida Del Curso");

        javax.swing.GroupLayout informacion_JPanelLayout = new javax.swing.GroupLayout(informacion_JPanel);
        informacion_JPanel.setLayout(informacion_JPanelLayout);
        informacion_JPanelLayout.setHorizontalGroup(
            informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacion_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(informacion_JPanelLayout.createSequentialGroup()
                        .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre_Profesor_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(imagen_Profesor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(informacion_JPanelLayout.createSequentialGroup()
                        .addComponent(calificacion_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 54, Short.MAX_VALUE)
                        .addComponent(resenas_JButton)
                        .addGap(18, 55, Short.MAX_VALUE)
                        .addComponent(numero_Estudiantes_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        informacion_JPanelLayout.setVerticalGroup(
            informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacion_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(informacion_JPanelLayout.createSequentialGroup()
                        .addComponent(nombre_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_Profesor_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imagen_Profesor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(descripcion_JLabel)
                .addGap(18, 18, 18)
                .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calificacion_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(informacion_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resenas_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numero_Estudiantes_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(informacion_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagen_Curso_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(informacion_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagen_Curso_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resenas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resenas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_resenas_JButtonMouseClicked

    private void resenas_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resenas_JButtonMouseEntered
        // TODO add your handling code here:
        resenas_JButton.setForeground(primer_Color_Fuente);
        resenas_JButton.setBackground(primer_Color);
    }//GEN-LAST:event_resenas_JButtonMouseEntered

    private void resenas_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resenas_JButtonMouseExited
        // TODO add your handling code here:
        resenas_JButton.setForeground(segundo_Color_Fuente);
        resenas_JButton.setBackground(segundo_Color);
    }//GEN-LAST:event_resenas_JButtonMouseExited

    private void imagen_Curso_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen_Curso_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            
        }
    }//GEN-LAST:event_imagen_Curso_JLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane calificacion_JScrollPane;
    private javax.swing.JTextPane calificacion_JTextPane;
    private javax.swing.JLabel descripcion_JLabel;
    private javax.swing.JLabel imagen_Curso_JLabel;
    private javax.swing.JLabel imagen_Profesor_JLabel;
    private javax.swing.JPanel informacion_JPanel;
    private javax.swing.JLabel nombre_JLabel;
    private javax.swing.JLabel nombre_Profesor_JLabel;
    private javax.swing.JLabel numero_Estudiantes_JLabel;
    private javax.swing.JButton resenas_JButton;
    // End of variables declaration//GEN-END:variables

   
    @Override
    public void Iniciar_Componentes() {
        try {
            System.out.println("Curso ID: "+this.id+" -> Getting Image From https://loremflickr.com/644/720/sunset,beach/all");
            URL url_Imagen = new URL("https://loremflickr.com/226/226/sunset,beach/all");
            Image obtener_Imagen_Curso = ImageIO.read(url_Imagen);
            ImageIcon icono_Curso = new ImageIcon(obtener_Imagen_Curso);
            imagen_Curso_JLabel.setIcon(icono_Curso);
            Establecer_Colores(obtener_Imagen_Curso);
            
            Colorear_Componentes();
            
            System.out.println("Course Teacher ID: "+this.id+" -> Getting Image From https://loremflickr.com/644/720/sunset,beach/all");
            URL url_Imagen_Profesor = new URL("https://loremflickr.com/79/79/sunset,beach/all");
            Image obtener_Imagen_Profesor = ImageIO.read(url_Imagen_Profesor);
            ImageIcon icono_Profesor = new ImageIcon(obtener_Imagen_Profesor);
            imagen_Profesor_JLabel.setIcon(icono_Profesor);
            
            obtener_Imagen_Profesor.flush();
            
            obtener_Imagen_Curso.flush();
            
            numero_Estudiantes_JLabel.setText("20");
            
            SimpleAttributeSet atributos = new SimpleAttributeSet();
            StyleConstants.setItalic(atributos, true);
            calificacion_JTextPane.setCharacterAttributes(atributos, true);
            calificacion_JTextPane.setText("Calificación:    ");
            StyledDocument documento = (StyledDocument) calificacion_JTextPane.getDocument();
            Style estilo = documento.addStyle("StyleName", null);
            ImageIcon estrella = new ImageIcon(getClass().getResource("/recursos/iconos/star.png"));
            for(int i = 0; i < 4;i++){
                try {
                    StyleConstants.setIcon(estilo, estrella);
                    documento.insertString(documento.getLength(), "", estilo);
                } catch (BadLocationException ex) {
                    
                }
            }
            
            
        } catch (MalformedURLException ex) {
            
        } catch (IOException ex) {
            
        }
    }

    @Override
    public void Colorear_Componentes() {
        descripcion_JLabel.setForeground(primer_Color_Fuente);
                
        calificacion_JTextPane.setForeground(primer_Color_Fuente);
        calificacion_JTextPane.setBackground(primer_Color);
        calificacion_JScrollPane.setBackground(primer_Color);

        nombre_JLabel.setForeground(primer_Color_Fuente);
        nombre_Profesor_JLabel.setForeground(primer_Color_Fuente);
        numero_Estudiantes_JLabel.setForeground(primer_Color_Fuente);

        resenas_JButton.setForeground(segundo_Color_Fuente);
        resenas_JButton.setBackground(segundo_Color);

        informacion_JPanel.setBackground(primer_Color);
        informacion_JPanel.setBorder(javax.swing.BorderFactory.createLineBorder(primer_Color));
    }
    
    @Override
    public void Establecer_Colores(Image imagen){
        
        try {
            Random numero_aleatorio = new Random(System.currentTimeMillis());
            int auxiliar_maximo_int = 0;
            primer_Color = Color.BLACK;
            Lista_Pares<Integer, Color> lista_Colores = new Lista_Pares<>();
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
            
        }
    }
    
     @Override
    public void Limpiar() {
        primer_Color = segundo_Color = primer_Color_Fuente = segundo_Color_Fuente = null;
        id = null;
    }
}