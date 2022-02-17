/*
 * Copyright (C) 2022 LENOVO
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package frames.generales;
import interfaces.Componentes_Interface;
import courseroom.CourseRoom;
import interfaces.Limpieza_Interface;
import interfaces.Reproductor_Interface;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import uk.co.caprica.vlcj.media.MediaRef;
import uk.co.caprica.vlcj.media.TrackType;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.base.MediaPlayerEventListener;
import uk.co.caprica.vlcj.player.base.State;
import uk.co.caprica.vlcj.player.component.AudioPlayerComponent;

/**
 *
 * @author LENOVO
 */
public class Lector_Audio_General_Frame extends javax.swing.JFrame implements Limpieza_Interface, Componentes_Interface, Reproductor_Interface{

    private AudioPlayerComponent componente_Reproductor_Audio;
    private boolean bandera_Mouse;
    private boolean bandera_Reproduciendo;
    private String mrl;
    //Image Icons
    private ImageIcon icono_Play, icono_Pausa;
    
    
    /**
     * Creates new form Lector_Audio_General_Frame
     */
    public Lector_Audio_General_Frame(String _mrl, 
            String _titulo) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        bandera_Reproduciendo = false;
             
        titulo_JLabel.setText(_titulo);
        
        mrl = _mrl;

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
        play_Pausa_JLabel = new javax.swing.JLabel();
        progreso_JLabel = new javax.swing.JLabel();
        titulo_JLabel = new javax.swing.JLabel();
        progreso_JSlider = new javax.swing.JSlider();
        duracion_JLabel = new javax.swing.JLabel();
        alto_JLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CourseRoom - Lector De Audio");
        setMaximumSize(new java.awt.Dimension(2147483647, 180));
        setMinimumSize(new java.awt.Dimension(800, 180));
        setPreferredSize(new java.awt.Dimension(800, 180));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_JPanel.setMaximumSize(new java.awt.Dimension(713, 163));
        contenido_JPanel.setPreferredSize(new java.awt.Dimension(713, 163));

        play_Pausa_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play_Pausa_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/play-button.png"))); // NOI18N
        play_Pausa_JLabel.setToolTipText("<html> <h3>Pausar/Reproducir</h3> </html>");
        ((ImageIcon)play_Pausa_JLabel.getIcon()).getImage().flush();
        play_Pausa_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play_Pausa_JLabelMouseClicked(evt);
            }
        });

        progreso_JLabel.setBackground(java.awt.Color.black);
        progreso_JLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        progreso_JLabel.setForeground(java.awt.Color.white);
        progreso_JLabel.setText("00:00:00");
        progreso_JLabel.setMaximumSize(new java.awt.Dimension(48, 20));
        progreso_JLabel.setMinimumSize(new java.awt.Dimension(48, 20));
        progreso_JLabel.setPreferredSize(new java.awt.Dimension(48, 20));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Titulo");
        titulo_JLabel.setToolTipText("<html> <h3>Titulo del archivo de audio</h3> </html>");

        progreso_JSlider.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        progreso_JSlider.setValue(0);
        progreso_JSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        progreso_JSlider.setMaximumSize(new java.awt.Dimension(32767, 16));
        progreso_JSlider.setMinimumSize(new java.awt.Dimension(36, 16));

        duracion_JLabel.setBackground(java.awt.Color.black);
        duracion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        duracion_JLabel.setForeground(java.awt.Color.white);
        duracion_JLabel.setText("00:00:00");
        duracion_JLabel.setMaximumSize(new java.awt.Dimension(48, 20));
        duracion_JLabel.setMinimumSize(new java.awt.Dimension(48, 20));
        duracion_JLabel.setPreferredSize(new java.awt.Dimension(48, 20));

        alto_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alto_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/stop.png"))); // NOI18N
        alto_JLabel.setToolTipText("<html> <h3>Parar</h3> </html>");
        ((ImageIcon)alto_JLabel.getIcon()).getImage().flush();
        alto_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alto_JLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(progreso_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(progreso_JSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duracion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido_JPanelLayout.createSequentialGroup()
                        .addComponent(alto_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(play_Pausa_JLabel))
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(titulo_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(progreso_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(duracion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(progreso_JSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alto_JLabel)
                    .addComponent(play_Pausa_JLabel))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(contenido_JPanel, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void play_Pausa_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_Pausa_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Establecer_Play_Pausa();
        }
    }//GEN-LAST:event_play_Pausa_JLabelMouseClicked

    private void alto_JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alto_JLabelMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            Establecer_Alto();
            Limpiar_Informacion();
        }
    }//GEN-LAST:event_alto_JLabelMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.Limpiar();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    /**Cleans Screen Information*/
    private void Limpiar_Informacion(){
        progreso_JSlider.setValue(0);
        progreso_JLabel.setText("00:00:00");
        duracion_JLabel.setText("00:00:00");
        play_Pausa_JLabel.setIcon(icono_Play);
        System.gc();
    }

    
     /**Sets Play And Pause Functions*/
    private void Establecer_Play_Pausa() {
        
        if(!bandera_Reproduciendo){
            componente_Reproductor_Audio.mediaPlayer().media().play(mrl);
            play_Pausa_JLabel.setIcon(icono_Pausa);
            progreso_JSlider.setEnabled(true);
            bandera_Reproduciendo = true;
        }
        
        if (componente_Reproductor_Audio != null) {

            if (componente_Reproductor_Audio.mediaPlayer().status().state() == State.PLAYING) {
                componente_Reproductor_Audio.mediaPlayer().controls().setPause(true);
                play_Pausa_JLabel.setIcon(icono_Play);
            } else if (componente_Reproductor_Audio.mediaPlayer().status().state() == State.PAUSED) {
                componente_Reproductor_Audio.mediaPlayer().controls().setPause(false);
                play_Pausa_JLabel.setIcon(icono_Pausa);
            }
        }
    }
     /**Sets Stop Function*/
    private void Establecer_Alto() {
        if(componente_Reproductor_Audio != null){
            if (componente_Reproductor_Audio.mediaPlayer().status().state() != State.STOPPED) {
                componente_Reproductor_Audio.mediaPlayer().controls().stop();
                duracion_JLabel.setText("00:00:00");
                progreso_JLabel.setText("00:00:00");
                progreso_JSlider.setValue(0);
                progreso_JSlider.setEnabled(false);
                bandera_Reproduciendo = false;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alto_JLabel;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel duracion_JLabel;
    public javax.swing.JLabel play_Pausa_JLabel;
    private javax.swing.JLabel progreso_JLabel;
    private javax.swing.JSlider progreso_JSlider;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Limpiar()  {
        componente_Reproductor_Audio.release();
        componente_Reproductor_Audio = null;
        mrl = null;
        icono_Play.getImage().flush();
        icono_Pausa.getImage().flush();
        icono_Play = null;
        icono_Pausa = null;
    }

    @Override
    public void Iniciar_Componentes() {
        icono_Play = new ImageIcon(getClass().getResource("/recursos/iconos/play-button.png"));
        icono_Pausa = new ImageIcon(getClass().getResource("/recursos/iconos/pause.png"));
        icono_Pausa.getImage().flush();
        icono_Play.getImage().flush();
        bandera_Mouse = true;
        componente_Reproductor_Audio = new AudioPlayerComponent();
        progreso_JSlider.setEnabled(false);
        
        try {
            Image logo_Imagen = ImageIO.read(getClass().getResource("/recursos/imagenes/Course_Room_Brand_Blue.png"));
            logo_Imagen = logo_Imagen.getScaledInstance(75, 62, Image.SCALE_SMOOTH);
            this.setIconImage(logo_Imagen);
            logo_Imagen.flush();

        } catch (IOException ex) {

        }
        
        Colorear_Componentes();
        Establecer_Eventos_Reproductor();
        
        this.setVisible(true);
        
        Establecer_Play_Pausa();
    }

    @Override
    public void Colorear_Componentes() {
        
       
        contenido_JPanel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        contenido_JPanel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());

        duracion_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        progreso_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        titulo_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        progreso_JSlider.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        progreso_JSlider.setBackground(CourseRoom.Utilerias.Tercer_Color_Fuente());
    }

    @Override
    public void Establecer_Eventos_Reproductor() {
         
       
        //Listener para el slider progress
        progreso_JSlider.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                    bandera_Mouse = false;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(!bandera_Mouse){
                  bandera_Mouse = true;
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });

        //Control para cambiar a posicion de reproduccion
        progreso_JSlider.addChangeListener((ChangeEvent e) -> {
            if (!bandera_Mouse) {
                Object fuente = e.getSource();
                componente_Reproductor_Audio.mediaPlayer().controls().setTime(((JSlider) fuente).getValue());
            }
        });
       
        componente_Reproductor_Audio.mediaPlayer().events().addMediaPlayerEventListener(new MediaPlayerEventListener() {
            int tiempo, valor;
            String segundos;
            long longitud;
            int longitud_Real;
            
            @Override
            public void mediaChanged(MediaPlayer mp, MediaRef mr) {
            }

            @Override
            public void opening(MediaPlayer mp) {
            }

            @Override
            public void buffering(MediaPlayer mp, float f) {
                
            }

            @Override
            public void playing(MediaPlayer mp) {
                
            }

            @Override
            public void paused(MediaPlayer mp) {
                
            }

            @Override
            public void stopped(MediaPlayer mp) {
                
            }

            @Override
            public void forward(MediaPlayer mp) {
                
            }

            @Override
            public void backward(MediaPlayer mp) {
                
            }

            @Override
            public void finished(MediaPlayer mp) {
                bandera_Reproduciendo = false;
                Limpiar_Informacion();
                
            }

            @Override
            public void timeChanged(MediaPlayer mp, long l) {
                
            }

            @Override
            public void positionChanged(MediaPlayer mp, float f) {
                if(bandera_Mouse){
                    if(componente_Reproductor_Audio != null){
                        tiempo = (int)componente_Reproductor_Audio.mediaPlayer().status().time();
                        valor = tiempo / 1000;
                        progreso_JSlider.setValue(tiempo);
                        segundos = CourseRoom.Utilerias.Convertir_Segundos(valor);
                        progreso_JLabel.setText(segundos);
                    }
                    
                }
            }

            @Override
            public void seekableChanged(MediaPlayer mp, int i) {
                
            }

            @Override
            public void pausableChanged(MediaPlayer mp, int i) {
                
            }

            @Override
            public void titleChanged(MediaPlayer mp, int i) {
                
            }

            @Override
            public void snapshotTaken(MediaPlayer mp, String string) {
                
            }

            @Override
            public void lengthChanged(MediaPlayer mp, long l) {
                
            }

            @Override
            public void videoOutput(MediaPlayer mp, int i) {
                
            }

            @Override
            public void scrambledChanged(MediaPlayer mp, int i) {
                
            }

            @Override
            public void elementaryStreamAdded(MediaPlayer mp, TrackType tt, int i) {
                
            }

            @Override
            public void elementaryStreamDeleted(MediaPlayer mp, TrackType tt, int i) {
                
            }

            @Override
            public void elementaryStreamSelected(MediaPlayer mp, TrackType tt, int i) {
                
            }

            @Override
            public void corked(MediaPlayer mp, boolean bln) {
                
            }

            @Override
            public void muted(MediaPlayer mp, boolean bln) {
                
            }

            @Override
            public void volumeChanged(MediaPlayer mp, float f) {
                
            }

            @Override
            public void audioDeviceChanged(MediaPlayer mp, String string) {
                
            }

            @Override
            public void chapterChanged(MediaPlayer mp, int i) {
                
            }

            @Override
            public void error(MediaPlayer mp) {
                
            }

            @Override
            public void mediaPlayerReady(MediaPlayer mp) {
                longitud = componente_Reproductor_Audio.mediaPlayer().status().length();
                if(longitud < Integer.MAX_VALUE){
                    longitud_Real = (int)longitud;
                    progreso_JSlider.setMaximum(longitud_Real);
                    segundos = CourseRoom.Utilerias.Convertir_Segundos(longitud_Real/1000);
                    duracion_JLabel.setText(segundos);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo Demasiado Largo","ERROR",JOptionPane.ERROR_MESSAGE);
                } 
            }
        });
    }

    @Override
    public void Cargar_Metadatos() {
      //No soportado
    }


}
