/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.generales;

import interfaces.Componentes_Interface;
import main.CourseRoom;
import interfaces.Limpieza_Interface;
import interfaces.Reproductor_Interface;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.images.Artwork;
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
public class Mensaje_Audio_Izquierdo_General_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface, Reproductor_Interface{

    private AudioPlayerComponent componente_Reproductor_Audio;
    private boolean bandera_Mouse;
    private boolean bandera_Reproduciendo;
    private String mrl;
    //Image Icons
    private ImageIcon icono_Play, icono_Pausa;
    
   
    public Mensaje_Audio_Izquierdo_General_Panel(
            String _emisor, 
            String _fecha, 
            String _mrl, 
            String _titulo,
            Color _segundo_Color,
            Color _segundo_Color_Fuente
        ) {
        initComponents();
        
        fecha_JLabel.setText(_fecha);
        emisor_JLabel.setText(_emisor);
        bandera_Reproduciendo = false;
             
        titulo_JLabel.setText(_titulo);
        
        mrl = _mrl;

        Iniciar_Componentes();
        
        fecha_JLabel.setForeground(_segundo_Color_Fuente);
        emisor_JLabel.setForeground(_segundo_Color_Fuente);
        contenido_JPanel.setBackground(_segundo_Color);
        contenido_JPanel.setForeground(_segundo_Color_Fuente);
        
        duracion_JLabel.setForeground(_segundo_Color_Fuente);
        progreso_JLabel.setForeground(_segundo_Color_Fuente);
        titulo_JLabel.setForeground(_segundo_Color_Fuente);
        artista_JLabel.setForeground(_segundo_Color_Fuente);
        album_JLabel.setForeground(_segundo_Color_Fuente);
        progreso_JSlider.setForeground(_segundo_Color_Fuente);
        progreso_JSlider.setBackground(_segundo_Color_Fuente);
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
        fecha_JLabel = new javax.swing.JLabel();
        informacion_Audio_JPanel = new javax.swing.JPanel();
        imagen_Arte_JLabel = new javax.swing.JLabel();
        album_JLabel = new javax.swing.JLabel();
        artista_JLabel = new javax.swing.JLabel();
        play_Pausa_JLabel = new javax.swing.JLabel();
        progreso_JLabel = new javax.swing.JLabel();
        titulo_JLabel = new javax.swing.JLabel();
        progreso_JSlider = new javax.swing.JSlider();
        duracion_JLabel = new javax.swing.JLabel();
        alto_JLabel = new javax.swing.JLabel();
        emisor_JLabel = new javax.swing.JLabel();
        auxiliar_JPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(32767, 272));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 272));
        setRequestFocusEnabled(false);

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fecha_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        fecha_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fecha_JLabel.setToolTipText("Fecha & Hora Del Mensaje");

        informacion_Audio_JPanel.setOpaque(false);

        imagen_Arte_JLabel.setMaximumSize(new java.awt.Dimension(380, 380));
        imagen_Arte_JLabel.setMinimumSize(new java.awt.Dimension(380, 380));
        imagen_Arte_JLabel.setPreferredSize(new java.awt.Dimension(300, 300));

        album_JLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        album_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        album_JLabel.setText("Album");
        album_JLabel.setToolTipText("Album");

        artista_JLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        artista_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        artista_JLabel.setText("Artista");
        artista_JLabel.setToolTipText("Artista");

        play_Pausa_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play_Pausa_JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/play-button.png"))); // NOI18N
        play_Pausa_JLabel.setToolTipText("Play/Pause Media");
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
        titulo_JLabel.setToolTipText("Titulo Del Archivo De Audio");

        progreso_JSlider.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        progreso_JSlider.setValue(0);
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
        alto_JLabel.setToolTipText("Stop Media");
        alto_JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alto_JLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout informacion_Audio_JPanelLayout = new javax.swing.GroupLayout(informacion_Audio_JPanel);
        informacion_Audio_JPanel.setLayout(informacion_Audio_JPanelLayout);
        informacion_Audio_JPanelLayout.setHorizontalGroup(
            informacion_Audio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacion_Audio_JPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen_Arte_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacion_Audio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(informacion_Audio_JPanelLayout.createSequentialGroup()
                        .addComponent(progreso_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(progreso_JSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duracion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(artista_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(album_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(informacion_Audio_JPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(alto_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(play_Pausa_JLabel)
                        .addGap(96, 96, 96)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        informacion_Audio_JPanelLayout.setVerticalGroup(
            informacion_Audio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacion_Audio_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacion_Audio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen_Arte_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacion_Audio_JPanelLayout.createSequentialGroup()
                        .addComponent(titulo_JLabel)
                        .addGap(10, 10, 10)
                        .addComponent(artista_JLabel)
                        .addGap(10, 10, 10)
                        .addComponent(album_JLabel)
                        .addGap(18, 18, 18)
                        .addGroup(informacion_Audio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(informacion_Audio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(progreso_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(duracion_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(progreso_JSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(informacion_Audio_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(play_Pausa_JLabel)
                            .addComponent(alto_JLabel))))
                .addContainerGap())
        );

        emisor_JLabel.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        emisor_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emisor_JLabel.setToolTipText("Emisor Del Mensaje");

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecha_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informacion_Audio_JPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emisor_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emisor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacion_Audio_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        auxiliar_JPanel.setOpaque(false);

        javax.swing.GroupLayout auxiliar_JPanelLayout = new javax.swing.GroupLayout(auxiliar_JPanel);
        auxiliar_JPanel.setLayout(auxiliar_JPanelLayout);
        auxiliar_JPanelLayout.setHorizontalGroup(
            auxiliar_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        auxiliar_JPanelLayout.setVerticalGroup(
            auxiliar_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(auxiliar_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(auxiliar_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
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
                bandera_Reproduciendo = false;
            }
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel album_JLabel;
    private javax.swing.JLabel alto_JLabel;
    private javax.swing.JLabel artista_JLabel;
    private javax.swing.JPanel auxiliar_JPanel;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JLabel duracion_JLabel;
    private javax.swing.JLabel emisor_JLabel;
    private javax.swing.JLabel fecha_JLabel;
    private javax.swing.JLabel imagen_Arte_JLabel;
    private javax.swing.JPanel informacion_Audio_JPanel;
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
        bandera_Mouse = true;
        componente_Reproductor_Audio = new AudioPlayerComponent();
        
        Establecer_Eventos_Reproductor();
        
        Cargar_Metadatos();
    }

    @Override
    public void Colorear_Componentes() {
        // No Aplica
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
                        segundos = CourseRoom.Convertir_Segundos(valor);
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
                    segundos = CourseRoom.Convertir_Segundos(longitud_Real/1000);
                    duracion_JLabel.setText(segundos);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo Demasiado Largo","ERROR",JOptionPane.ERROR_MESSAGE);
                } 
            }
        });
    }

    @Override
    public void Cargar_Metadatos() {
        try {
            File leer_Archivo = new File(mrl);
            
            if(leer_Archivo.exists()){      
               
                AudioFile archivo_Audio = AudioFileIO.read(leer_Archivo);
                
                Tag tag = archivo_Audio.getTag();
                String valor = tag.getFirst(FieldKey.TITLE);
                if (valor == null) {
                    valor = leer_Archivo.getName();
                }
                if (valor.isEmpty() || valor.isBlank()) {
                    valor = leer_Archivo.getName();
                }
                titulo_JLabel.setToolTipText(CourseRoom.Concatenar("Titulo: ", valor));
                titulo_JLabel.setText(valor);

                valor = tag.getFirst(FieldKey.ARTIST);
                if (valor == null) {
                    valor = "Desconocid@";
                }
                if (valor.isEmpty() || valor.isBlank()) {
                    valor = "Desconocid@";
                }
                artista_JLabel.setToolTipText(CourseRoom.Concatenar("Artista: ", valor));
                artista_JLabel.setText(valor);

                valor = tag.getFirst(FieldKey.ALBUM);
                if (valor == null) {
                    valor = "Desconocid@";
                }
                if (valor.isEmpty() || valor.isBlank()) {
                    valor = "Desconocid@";
                }
                album_JLabel.setToolTipText(CourseRoom.Concatenar("Album: ", valor));
                album_JLabel.setText(valor);
              
                Artwork arte = tag.getFirstArtwork();
                if(arte != null){
                    
                    Image arte_Original = ((Image)arte.getImage());
                    if(arte_Original != null){
                        arte_Original = arte_Original.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
                        ImageIcon cover = new ImageIcon(arte_Original);
                        imagen_Arte_JLabel.setIcon(cover);
                        arte_Original.flush();
                        
                    }
                } 
                
            }
        } catch (CannotReadException | IOException | TagException | InvalidAudioFrameException | ReadOnlyFileException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Found Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
