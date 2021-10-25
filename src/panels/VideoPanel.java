/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import uk.co.caprica.vlcj.media.MediaRef;
import uk.co.caprica.vlcj.media.TrackType;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.base.MediaPlayerEventListener;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

/**
 *
 * @author LENOVO
 */
public class VideoPanel extends javax.swing.JPanel {

    private boolean flag;
    private ImageIcon playImage;
    private ImageIcon pauseImage;
    private EmbeddedMediaPlayerComponent embeddedMediaPlayerComponent;
    /**
     * Creates new form VideoPanel
     */
    public VideoPanel(){
        initComponents();
        flag = true;
       
        embeddedMediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        jPanelVideoView.add("videoView",embeddedMediaPlayerComponent.videoSurfaceComponent());
        
        setPlayerEvents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelButtons = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jSliderProgreso = new javax.swing.JSlider();
        jLabelDuracionTotal = new javax.swing.JLabel();
        jLabelProgreso = new javax.swing.JLabel();
        jPanelVideoView = new javax.swing.JPanel();

        setBackground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanelButtons.setBackground(new Color (49,88,186,185));
        jPanelButtons.setFocusable(false);
        jPanelButtons.setMinimumSize(new java.awt.Dimension(800, 90));
        jPanelButtons.setOpaque(false);

        jLabelTitulo.setBackground(new Color (49,88,186,185));
        jLabelTitulo.setFont(new java.awt.Font("Gadugi", 1, 17)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(104, 194, 232));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/boton-de-play-video.png"))); // NOI18N
        jLabelTitulo.setText("Título Del Video");
        jLabelTitulo.setFocusable(false);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(650, 20));

        jSliderProgreso.setBackground(new Color (49,88,186,185));
        jSliderProgreso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jSliderProgreso.setForeground(new java.awt.Color(104, 194, 232));
        jSliderProgreso.setMaximum(2147483647);
        jSliderProgreso.setValue(0);
        jSliderProgreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderProgreso.setEnabled(false);
        jSliderProgreso.setFocusable(false);
        jSliderProgreso.setPreferredSize(new java.awt.Dimension(650, 20));
        jSliderProgreso.setValueIsAdjusting(true);

        jLabelDuracionTotal.setBackground(new Color (49,88,186,185));
        jLabelDuracionTotal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabelDuracionTotal.setForeground(new java.awt.Color(104, 194, 232));
        jLabelDuracionTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDuracionTotal.setText("00:00:00");
        jLabelDuracionTotal.setFocusable(false);

        jLabelProgreso.setBackground(new Color (49,88,186,185));
        jLabelProgreso.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabelProgreso.setForeground(new java.awt.Color(104, 194, 232));
        jLabelProgreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProgreso.setText("00:00:00");
        jLabelProgreso.setFocusable(false);

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelProgreso)
                .addGap(8, 8, 8)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDuracionTotal)
                .addGap(6, 6, 6))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProgreso)
                    .addComponent(jSliderProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuracionTotal))
                .addContainerGap())
        );

        jPanelVideoView.setBackground(java.awt.Color.black);
        jPanelVideoView.setMinimumSize(new java.awt.Dimension(800, 513));
        jPanelVideoView.setPreferredSize(new java.awt.Dimension(800, 513));
        jPanelVideoView.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVideoView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelVideoView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

   
    private void cleanInfoMedia(){
    }

    private void setPlayerEvents() {

      

        //Listener para el slider progress
        jSliderProgreso.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                flag = false;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                flag = true;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });

        //Control para cambiar a posicion de reproduccion
        jSliderProgreso.addChangeListener((ChangeEvent e) -> {
            if (!flag) {
                Object source = e.getSource();
                embeddedMediaPlayerComponent.mediaPlayer().controls().setTime(((JSlider) source).getValue());
            }
        });
        
        embeddedMediaPlayerComponent.videoSurfaceComponent().addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                boolean hasToBeVisible = e.getLocationOnScreen().y >= jPanelVideoView.getPreferredSize().getHeight();
                
                if(hasToBeVisible && !jPanelButtons.isVisible())
                    jPanelButtons.setVisible(true);
                else if((!hasToBeVisible && jPanelButtons.isVisible()))
                    jPanelButtons.setVisible(false);
            }
        });
        
        embeddedMediaPlayerComponent.mediaPlayer().events().addMediaPlayerEventListener(new MediaPlayerEventListener() {
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
                cleanInfoMedia();
            }

            @Override
            public void forward(MediaPlayer mp) {
                
            }

            @Override
            public void backward(MediaPlayer mp) {
                
            }

            @Override
            public void finished(MediaPlayer mp) {
                cleanInfoMedia();
            }

            @Override
            public void timeChanged(MediaPlayer mp, long l) {
                
            }

            @Override
            public void positionChanged(MediaPlayer mp, float f) {
                 if (flag) {
                    int tiempo = (int) embeddedMediaPlayerComponent.mediaPlayer().status().time();
                    int value = tiempo / 1000;
                    jSliderProgreso.setValue(tiempo);
                    String segundos = secondsToString(value);
                    jLabelProgreso.setText(segundos);
                    segundos = null;
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
                
            }
        });
    }

    private String secondsToString(long seconds) {
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%02d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }
    
    public void dispose(){
        playImage = null;
        pauseImage = null;
        embeddedMediaPlayerComponent.release();
        embeddedMediaPlayerComponent = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDuracionTotal;
    private javax.swing.JLabel jLabelProgreso;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelVideoView;
    private javax.swing.JSlider jSliderProgreso;
    // End of variables declaration//GEN-END:variables
}
