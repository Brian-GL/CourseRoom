/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.generales;

import main.CourseRoom;
import interfaces.Componentes_Interface;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO
 */
public class Comentario_Tarea_General_Panel extends javax.swing.JPanel implements Componentes_Interface{

    
    public Comentario_Tarea_General_Panel(
            String nombre_Usuario, 
            String comentario) {
        
        initComponents();
        
        String concatenar = CourseRoom.Concatenar(nombre_Usuario,":<br>",comentario);
        
        comentario_JTextPane.setText(CourseRoom.Formato_HTML_Izquierda(concatenar));
        
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

        imagen_Emisor_JLabel = new javax.swing.JLabel();
        comentario_JScrollPane = new javax.swing.JScrollPane();
        comentario_JTextPane = new javax.swing.JTextPane();

        setMaximumSize(new java.awt.Dimension(32767, 62));
        setMinimumSize(new java.awt.Dimension(576, 62));
        setOpaque(false);

        imagen_Emisor_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_Emisor_JLabel.setMaximumSize(new java.awt.Dimension(50, 50));
        imagen_Emisor_JLabel.setMinimumSize(new java.awt.Dimension(50, 50));
        imagen_Emisor_JLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        imagen_Emisor_JLabel.setToolTipText("");

        comentario_JScrollPane.setBorder(null);
        comentario_JScrollPane.setRequestFocusEnabled(false);
        comentario_JScrollPane.setVerifyInputWhenFocusTarget(false);
        comentario_JScrollPane.setWheelScrollingEnabled(false);

        comentario_JTextPane.setBorder(null);
        comentario_JTextPane.setContentType("text/html"); // NOI18N
        comentario_JTextPane.setEditable(false);
        comentario_JTextPane.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        comentario_JTextPane.setText("");
        comentario_JTextPane.setRequestFocusEnabled(false);
        comentario_JTextPane.setToolTipText("<html>\n<h3>Comentario de la tarea</h3>\n</html>");
        comentario_JScrollPane.setViewportView(comentario_JTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen_Emisor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comentario_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen_Emisor_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comentario_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane comentario_JScrollPane;
    private javax.swing.JTextPane comentario_JTextPane;
    private javax.swing.JLabel imagen_Emisor_JLabel;
    // End of variables declaration//GEN-END:variables

     @Override
    public void Iniciar_Componentes() {
        
        try {
            System.out.println("Comment Homework -> Getting Image From https://i.pravatar.cc/40");
            URL url_Imagen = new URL("https://i.pravatar.cc/40");
            Image obtener_Imagen = ImageIO.read(url_Imagen);
            ImageIcon icono_Comentario = new ImageIcon(obtener_Imagen);
            imagen_Emisor_JLabel.setIcon(icono_Comentario);
            icono_Comentario.getImage().flush();
            obtener_Imagen.flush();
            obtener_Imagen.getGraphics().dispose();
        } catch (IOException ex) {
            
        }
        
       Colorear_Componentes();
    }
    
    @Override
    public void Colorear_Componentes() {
        comentario_JTextPane.setForeground(CourseRoom.Segundo_Color_Fuente());
        comentario_JTextPane.setBackground(CourseRoom.Segundo_Color());
    }


}
