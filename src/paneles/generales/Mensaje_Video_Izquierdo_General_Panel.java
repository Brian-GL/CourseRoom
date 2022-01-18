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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import uk.co.caprica.vlcj.media.MediaRef;
import uk.co.caprica.vlcj.media.TrackType;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.base.MediaPlayerEventListener;
import uk.co.caprica.vlcj.player.base.State;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

/**
 *
 * @author LENOVO
 */
public class Mensaje_Video_Izquierdo_General_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface, Reproductor_Interface{

    private EmbeddedMediaPlayerComponent componente_Embebido_Reproductor_Video;
    private boolean bandera_Barra_Progreso;
    private boolean bandera_Reproduccion;
    private String mrl;
    
    public Mensaje_Video_Izquierdo_General_Panel(
            String emisor, 
            String fecha, 
            String _mrl, 
            String _titulo
        ) {
        
        initComponents();
        
        fecha_JLabel.setText(fecha);
        emisor_JLabel.setText(emisor);
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
        fecha_JLabel = new javax.swing.JLabel();
        controles_JPanel = new javax.swing.JPanel();
        progreso_JLabel = new javax.swing.JLabel();
        titulo_JLabel = new javax.swing.JLabel();
        progreso_JSlider = new javax.swing.JSlider();
        duracion_JLabel = new javax.swing.JLabel();
        vista_Video_JPanel = new javax.swing.JPanel();
        emisor_JLabel = new javax.swing.JLabel();
        auxiliar_JPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(32767, 525));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 525));

        contenido_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fecha_JLabel.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        fecha_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fecha_JLabel.setToolTipText("<html>\n<h3>Fecha y hora del mensaje recibido</h3>\n</html>");

        controles_JPanel.setOpaque(false);

        progreso_JLabel.setBackground(java.awt.Color.black);
        progreso_JLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        progreso_JLabel.setForeground(java.awt.Color.white);
        progreso_JLabel.setText("00:00:00");

        titulo_JLabel.setBackground(java.awt.Color.black);
        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        titulo_JLabel.setForeground(java.awt.Color.white);
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Title");
        titulo_JLabel.setToolTipText("<html>\n<h3>Título del video</h3>\n</html>");

        progreso_JSlider.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        progreso_JSlider.setValue(0);
        progreso_JSlider.setMaximumSize(new java.awt.Dimension(32767, 16));
        progreso_JSlider.setMinimumSize(new java.awt.Dimension(36, 16));

        duracion_JLabel.setBackground(java.awt.Color.black);
        duracion_JLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        duracion_JLabel.setForeground(java.awt.Color.white);
        duracion_JLabel.setText("00:00:00");

        javax.swing.GroupLayout controles_JPanelLayout = new javax.swing.GroupLayout(controles_JPanel);
        controles_JPanel.setLayout(controles_JPanelLayout);
        controles_JPanelLayout.setHorizontalGroup(
            controles_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controles_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controles_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(controles_JPanelLayout.createSequentialGroup()
                        .addComponent(progreso_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progreso_JSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duracion_JLabel)))
                .addContainerGap())
        );
        controles_JPanelLayout.setVerticalGroup(
            controles_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controles_JPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(titulo_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controles_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(controles_JPanelLayout.createSequentialGroup()
                        .addComponent(progreso_JSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(controles_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(duracion_JLabel)
                        .addComponent(progreso_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        vista_Video_JPanel.setOpaque(false);
        vista_Video_JPanel.setPreferredSize(new java.awt.Dimension(400, 420));
        vista_Video_JPanel.setLayout(new java.awt.CardLayout());

        emisor_JLabel.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        emisor_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emisor_JLabel.setToolTipText("<html>\n<h3>Emisor del mensaje</h3>\n</html>");

        javax.swing.GroupLayout contenido_JPanelLayout = new javax.swing.GroupLayout(contenido_JPanel);
        contenido_JPanel.setLayout(contenido_JPanelLayout);
        contenido_JPanelLayout.setHorizontalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecha_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controles_JPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emisor_JLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vista_Video_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenido_JPanelLayout.setVerticalGroup(
            contenido_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emisor_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vista_Video_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controles_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        auxiliar_JPanel.setOpaque(false);

        javax.swing.GroupLayout auxiliar_JPanelLayout = new javax.swing.GroupLayout(auxiliar_JPanel);
        auxiliar_JPanel.setLayout(auxiliar_JPanelLayout);
        auxiliar_JPanelLayout.setHorizontalGroup(
            auxiliar_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        auxiliar_JPanelLayout.setVerticalGroup(
            auxiliar_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(auxiliar_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contenido_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auxiliar_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
     /**Sets Play And Pause Functions*/
    private void Establecer_Play_Pausa() {
        
        if(!bandera_Reproduccion){
            componente_Embebido_Reproductor_Video.mediaPlayer().media().play(mrl);
            bandera_Reproduccion = true;
        }
        
        if (componente_Embebido_Reproductor_Video != null) {

            if (componente_Embebido_Reproductor_Video.mediaPlayer().status().state() == State.PLAYING) {
                componente_Embebido_Reproductor_Video.mediaPlayer().controls().setPause(true);
            } else if (componente_Embebido_Reproductor_Video.mediaPlayer().status().state() == State.PAUSED) {
                componente_Embebido_Reproductor_Video.mediaPlayer().controls().setPause(false);
            }
        }
    }
     /**Sets Stop Function*/
    private void Establecer_Alto() {
        if(componente_Embebido_Reproductor_Video != null){
            if (componente_Embebido_Reproductor_Video.mediaPlayer().status().state() != State.STOPPED) {
                componente_Embebido_Reproductor_Video.mediaPlayer().controls().stop();
                duracion_JLabel.setText("00:00:00");
                progreso_JLabel.setText("00:00:00");
                progreso_JSlider.setValue(0);
                bandera_Reproduccion = false;
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel auxiliar_JPanel;
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JPanel controles_JPanel;
    private javax.swing.JLabel duracion_JLabel;
    private javax.swing.JLabel emisor_JLabel;
    private javax.swing.JLabel fecha_JLabel;
    private javax.swing.JLabel progreso_JLabel;
    private javax.swing.JSlider progreso_JSlider;
    private javax.swing.JLabel titulo_JLabel;
    private javax.swing.JPanel vista_Video_JPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        bandera_Reproduccion = false;
        bandera_Barra_Progreso = true;
        
        componente_Embebido_Reproductor_Video = new EmbeddedMediaPlayerComponent();
        vista_Video_JPanel.add("Vista_Video",componente_Embebido_Reproductor_Video.videoSurfaceComponent());
        
        Establecer_Eventos_Reproductor();
        componente_Embebido_Reproductor_Video.mediaPlayer().video().setAdjustVideo(true);
        
        Colorear_Componentes();
        
    }

    @Override
    public void Colorear_Componentes() {
        fecha_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        emisor_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        contenido_JPanel.setBackground(CourseRoom.Segundo_Color());
        contenido_JPanel.setForeground(CourseRoom.Segundo_Color_Fuente());

        duracion_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        progreso_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        titulo_JLabel.setForeground(CourseRoom.Segundo_Color_Fuente());
        progreso_JSlider.setForeground(CourseRoom.Segundo_Color_Fuente());
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
                    bandera_Barra_Progreso = false;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(!bandera_Barra_Progreso){
                  bandera_Barra_Progreso = true;
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
            if (!bandera_Barra_Progreso) {
                Object source = e.getSource();
                componente_Embebido_Reproductor_Video.mediaPlayer().controls().setTime(((JSlider) source).getValue());
            }
        });
        
          componente_Embebido_Reproductor_Video.videoSurfaceComponent().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                    if(e.getClickCount() == 1){
                        Establecer_Play_Pausa();
                    }
                    else if(e.getClickCount() == 2){
                        Establecer_Alto();
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        
       
        componente_Embebido_Reproductor_Video.mediaPlayer().events().addMediaPlayerEventListener(new MediaPlayerEventListener() {
            String segundos;
            int tiempo;
            int conversion_Tiempo;
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
                bandera_Reproduccion = false;
                progreso_JSlider.setValue(0);
                progreso_JLabel.setText("00:00:00");
                duracion_JLabel.setText("00:00:00");
                System.gc();
            }

            @Override
            public void timeChanged(MediaPlayer mp, long l) {
                
            }

            @Override
            public void positionChanged(MediaPlayer mp, float f) {
                 if (bandera_Barra_Progreso) {
                    if(componente_Embebido_Reproductor_Video != null){
                        tiempo = (int) componente_Embebido_Reproductor_Video.mediaPlayer().status().time();
                        conversion_Tiempo = tiempo / 1000;
                        progreso_JSlider.setValue(tiempo);
                        segundos = CourseRoom.Convertir_Segundos(conversion_Tiempo);
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
                longitud = componente_Embebido_Reproductor_Video.mediaPlayer().status().length();
                if(longitud < Integer.MAX_VALUE){
                    longitud_Real = (int)longitud;
                    progreso_JSlider.setMaximum(longitud_Real);
                    duracion_JLabel.setText(CourseRoom.Convertir_Segundos(longitud_Real/1000));
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo Demasiado Grande","ERROR",JOptionPane.ERROR_MESSAGE);
                } 
            }
        });
    }

    @Override
    public void Cargar_Metadatos() {
        //No soportado para este caso.
    }

    
    @Override
    public void Limpiar(){
        componente_Embebido_Reproductor_Video.release();
        componente_Embebido_Reproductor_Video = null;
        mrl = null;
    }
   
   
}
