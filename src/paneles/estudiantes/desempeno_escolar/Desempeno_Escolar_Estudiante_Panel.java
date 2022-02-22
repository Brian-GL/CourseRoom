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
package paneles.estudiantes.desempeno_escolar;

import clases.Celda_Renderer;
import courseroom.CourseRoom;
import datos.interfaces.Carta_Visibilidad_Interface;
import datos.interfaces.Componentes_Interface;
import datos.interfaces.Limpieza_Interface;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author LENOVO
 */
public class Desempeno_Escolar_Estudiante_Panel extends javax.swing.JPanel implements Componentes_Interface, Limpieza_Interface, Carta_Visibilidad_Interface{

    private byte carta_Visible;
    
    /**
     * Creates new form Profile_Estudiante_Panel
     */
    public Desempeno_Escolar_Estudiante_Panel() {
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

        contenido_Titulo_JPanel = new javax.swing.JPanel();
        titulo_JLabel = new javax.swing.JLabel();
        grafica_Pastel_JButton = new javax.swing.JButton();
        regresion_Lineal_JButton = new javax.swing.JButton();
        estadisticas_JButton = new javax.swing.JButton();
        actualizar_JButton = new javax.swing.JButton();
        desempeno_Escolar_JLayeredPane = new javax.swing.JLayeredPane();
        regresion_Lineal_JPanel = new javax.swing.JPanel();
        grafica_Pastel_JPanel = new javax.swing.JPanel();
        estadisticas_JScrollPane = new javax.swing.JScrollPane();
        estadisticas_JTable = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 630));

        contenido_Titulo_JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido_Titulo_JPanel.setMaximumSize(new java.awt.Dimension(32767, 68));
        contenido_Titulo_JPanel.setPreferredSize(new java.awt.Dimension(276, 68));

        titulo_JLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titulo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_JLabel.setText("Desempeño Escolar");
        titulo_JLabel.setMaximumSize(new java.awt.Dimension(416, 68));
        titulo_JLabel.setMinimumSize(new java.awt.Dimension(416, 68));
        titulo_JLabel.setOpaque(true);
        titulo_JLabel.setPreferredSize(new java.awt.Dimension(416, 68));

        grafica_Pastel_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/pie-chart.png"))); // NOI18N
        grafica_Pastel_JButton.setBorder(null);
        grafica_Pastel_JButton.setMaximumSize(new java.awt.Dimension(36, 36));
        grafica_Pastel_JButton.setMinimumSize(new java.awt.Dimension(36, 36));
        grafica_Pastel_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        ((ImageIcon)grafica_Pastel_JButton.getIcon()).getImage().flush();
        grafica_Pastel_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grafica_Pastel_JButtonMouseClicked(evt);
            }
        });

        regresion_Lineal_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/function.png"))); // NOI18N
        regresion_Lineal_JButton.setBorder(null);
        regresion_Lineal_JButton.setMaximumSize(new java.awt.Dimension(36, 36));
        regresion_Lineal_JButton.setMinimumSize(new java.awt.Dimension(36, 36));
        regresion_Lineal_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        ((ImageIcon)regresion_Lineal_JButton.getIcon()).getImage().flush();
        regresion_Lineal_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresion_Lineal_JButtonMouseClicked(evt);
            }
        });

        estadisticas_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/stats.png"))); // NOI18N
        estadisticas_JButton.setBorder(null);
        estadisticas_JButton.setMaximumSize(new java.awt.Dimension(36, 36));
        estadisticas_JButton.setMinimumSize(new java.awt.Dimension(36, 36));
        estadisticas_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        ((ImageIcon)estadisticas_JButton.getIcon()).getImage().flush();
        estadisticas_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadisticas_JButtonMouseClicked(evt);
            }
        });

        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/updated.png"))); // NOI18N
        actualizar_JButton.setBorder(null);
        actualizar_JButton.setPreferredSize(new java.awt.Dimension(36, 36));
        ((ImageIcon)actualizar_JButton.getIcon()).getImage().flush();
        actualizar_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizar_JButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout contenido_Titulo_JPanelLayout = new javax.swing.GroupLayout(contenido_Titulo_JPanel);
        contenido_Titulo_JPanel.setLayout(contenido_Titulo_JPanelLayout);
        contenido_Titulo_JPanelLayout.setHorizontalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                .addComponent(regresion_Lineal_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(grafica_Pastel_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(estadisticas_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contenido_Titulo_JPanelLayout.setVerticalGroup(
            contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido_Titulo_JPanelLayout.createSequentialGroup()
                .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido_Titulo_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(grafica_Pastel_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regresion_Lineal_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estadisticas_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(actualizar_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        desempeno_Escolar_JLayeredPane.setLayout(new java.awt.CardLayout());

        regresion_Lineal_JPanel.setOpaque(false);
        regresion_Lineal_JPanel.setLayout(new java.awt.BorderLayout());
        desempeno_Escolar_JLayeredPane.add(regresion_Lineal_JPanel, "Regresion_Lineal");

        grafica_Pastel_JPanel.setOpaque(false);
        grafica_Pastel_JPanel.setLayout(new java.awt.BorderLayout());
        desempeno_Escolar_JLayeredPane.add(grafica_Pastel_JPanel, "Grafica_Pastel");

        estadisticas_JScrollPane.setBorder(null);
        estadisticas_JScrollPane.setOpaque(false);

        estadisticas_JTable.setAutoCreateRowSorter(true);
        estadisticas_JTable.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Curso", "Tareas Calificadas", "Promedio Curso", "Promedio General" ,"Predicción", "Rumbo"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }

                @Override
                public Class getColumnClass(int column)
                {
                    for(int i = 0; i < estadisticas_JTable.getRowCount(); i++)
                    {
                        //The first valid value of a cell of given column is retrieved.
                        if(getValueAt(i,column) != null)
                        {
                            return getValueAt(i, column).getClass();
                        }
                    }
                    //if no valid value is found, default renderer is returned.
                    return super.getColumnClass(column);
                }
            });
            estadisticas_JTable.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
            estadisticas_JTable.setOpaque(false);
            estadisticas_JTable.setRowHeight(100);
            estadisticas_JTable.setRowMargin(15);
            estadisticas_JTable.setShowGrid(true);
            estadisticas_JTable.setShowVerticalLines(false);
            estadisticas_JTable.setRowSorter(new TableRowSorter(estadisticas_JTable.getModel()));
            estadisticas_JScrollPane.setViewportView(estadisticas_JTable);

            desempeno_Escolar_JLayeredPane.add(estadisticas_JScrollPane, "Estadisticas");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(desempeno_Escolar_JLayeredPane)
                        .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE))
                    .addGap(32, 32, 32))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contenido_Titulo_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(desempeno_Escolar_JLayeredPane)
                    .addContainerGap())
            );
        }// </editor-fold>//GEN-END:initComponents

    private void grafica_Pastel_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grafica_Pastel_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)desempeno_Escolar_JLayeredPane.getLayout()).show(desempeno_Escolar_JLayeredPane, "Grafica_Pastel");
            carta_Visible = 1;
            Carta_Visible();
        }
    }//GEN-LAST:event_grafica_Pastel_JButtonMouseClicked

    private void regresion_Lineal_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresion_Lineal_JButtonMouseClicked
        // TODO add your handling code here:
        if (SwingUtilities.isLeftMouseButton(evt)) {
            ((CardLayout)desempeno_Escolar_JLayeredPane.getLayout()).show(desempeno_Escolar_JLayeredPane, "Regresion_Lineal");
            carta_Visible = 0;
            Carta_Visible();
           
        }
    }//GEN-LAST:event_regresion_Lineal_JButtonMouseClicked

    private void estadisticas_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadisticas_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            ((CardLayout)desempeno_Escolar_JLayeredPane.getLayout()).show(desempeno_Escolar_JLayeredPane, "Estadisticas");
            carta_Visible = 2;
            Carta_Visible();
        }
    }//GEN-LAST:event_estadisticas_JButtonMouseClicked

    private void actualizar_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){

        }
    }//GEN-LAST:event_actualizar_JButtonMouseClicked

    private void actualizar_JButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseEntered
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseEntered

    private void actualizar_JButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_JButtonMouseExited
        // TODO add your handling code here:
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
    }//GEN-LAST:event_actualizar_JButtonMouseExited

    private XYDataset createDataset() {  
        XYSeriesCollection dataset = new XYSeriesCollection();  

        //Boys (Age,weight) series  
        XYSeries series1 = new XYSeries("Boys");  
        series1.add(1, CourseRoom.Utilerias.number().randomDouble(2, 1,100));
        series1.add(2, CourseRoom.Utilerias.number().randomDouble(2, 1,100));
        series1.add(3, CourseRoom.Utilerias.number().randomDouble(2, 1,100));
        series1.add(4, CourseRoom.Utilerias.number().randomDouble(2, 1,100));
        series1.add(5, CourseRoom.Utilerias.number().randomDouble(2, 1,100));
        series1.add(6, CourseRoom.Utilerias.number().randomDouble(2, 1,100));
        series1.add(7, CourseRoom.Utilerias.number().randomDouble(2, 1,100));
        series1.add(8, CourseRoom.Utilerias.number().randomDouble(2, 1,100));
        series1.add(9, CourseRoom.Utilerias.number().randomDouble(2, 1,100));
        series1.add(10, CourseRoom.Utilerias.number().randomDouble(2, 1,100));

        dataset.addSeries(series1);  

        //Girls (Age,weight) series  
        XYSeries series2 = new XYSeries("Girls");  
        series2.add(1, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));
        series2.add(2, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));
        series2.add(3, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));
        series2.add(4, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));
        series2.add(5, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));
        series2.add(6, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));
        series2.add(7, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));
        series2.add(8, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));
        series2.add(9, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));
        series2.add(10, CourseRoom.Utilerias.number().randomDouble(2, 1, 100));

        dataset.addSeries(series2);  
        
        //Boys (Age,weight) series  
        XYSeries series3 = new XYSeries("Regresion Lineal", false);  
        series3.add(1, series1.getX(0));  
        series3.add(10, series2.getX(9)); 
        
        dataset.addSeries(series3);

        return dataset;  
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JPanel contenido_Titulo_JPanel;
    private javax.swing.JLayeredPane desempeno_Escolar_JLayeredPane;
    private javax.swing.JButton estadisticas_JButton;
    private javax.swing.JScrollPane estadisticas_JScrollPane;
    private static javax.swing.JTable estadisticas_JTable;
    private javax.swing.JButton grafica_Pastel_JButton;
    private javax.swing.JPanel grafica_Pastel_JPanel;
    private javax.swing.JButton regresion_Lineal_JButton;
    private javax.swing.JPanel regresion_Lineal_JPanel;
    private javax.swing.JLabel titulo_JLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        
        carta_Visible = 0;

        //Tabla estadisticas:
        estadisticas_JScrollPane.getViewport().setOpaque(false);
        estadisticas_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        estadisticas_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);

        Font gadugi = new Font("Gadugi", Font.BOLD, 16);
        estadisticas_JTable.getTableHeader().setFont(gadugi);

        estadisticas_JTable.setDefaultRenderer(Celda_Renderer.class, new Celda_Renderer());
        Celda_Renderer[] celdas = new Celda_Renderer[6];
        DefaultTableModel modelo = (DefaultTableModel) estadisticas_JTable.getModel();
        
        URL url_Imagen;
        ImageIcon icono = null;
        ImageIcon icono_Reprobado = new ImageIcon(getClass().getResource("/recursos/iconos/close.png"));
        ImageIcon icono_Aprobado = new ImageIcon(getClass().getResource("/recursos/iconos/check.png"));
        for (int i = 0; i < CourseRoom.Utilerias.number().numberBetween(1, 5); i++) {
            
            try {
                System.out.println("Estadisticas_Curso " + i + " -> Getting Image From https://picsum.photos/96/96");
                url_Imagen = new URL("https://picsum.photos/96/96");
                icono = new ImageIcon(url_Imagen);

                celdas[0] = new Celda_Renderer(icono, CourseRoom.Utilerias.educator().course(), "");
                celdas[1] = new Celda_Renderer(String.valueOf(CourseRoom.Utilerias.number().numberBetween(1, 10)), "");
                celdas[2] = new Celda_Renderer(String.valueOf(CourseRoom.Utilerias.number().randomDouble(2, 1, 100)), "");
                celdas[3] = new Celda_Renderer(String.valueOf(CourseRoom.Utilerias.number().randomDouble(2, 1, 100)), "");
                celdas[4] = new Celda_Renderer(String.valueOf(CourseRoom.Utilerias.number().randomDouble(2, 1, 100)), "");
                boolean rumbo = CourseRoom.Utilerias.bool().bool();
                
                celdas[5] =  (rumbo) ? new Celda_Renderer(icono_Aprobado,"A Aprobar", ""):
                        new Celda_Renderer(icono_Reprobado,"A Reprobar", "");

                modelo.addRow(celdas);

            } catch (MalformedURLException ex) {

            } 
        }
        
        
        //Regresion Lineal:
        // Create dataset  
        XYDataset dataset = createDataset();  

        // Create chart  
        JFreeChart chart = ChartFactory.createScatterPlot(  
            "Boys VS Girls weight comparison chart",   
            "X-Axis",
            "Y-Axis", 
            dataset,
            PlotOrientation.VERTICAL,
            true, // include legend
            true, // tooltips
            false // urls
            );  


        //Changes background color  
        XYPlot plot = (XYPlot)chart.getPlot();  
        plot.setBackgroundPaint(new Color(255,228,196));  
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, false);
        renderer.setSeriesLinesVisible(1, false);
        renderer.setSeriesLinesVisible(2, true);
        plot.setRenderer(renderer);

        // Create Panel  
        ChartPanel chartPanel = new ChartPanel((JFreeChart) chart);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setMaximumDrawHeight(regresion_Lineal_JPanel.getMaximumSize().height);
        chartPanel.setMaximumDrawWidth(regresion_Lineal_JPanel.getMaximumSize().width);
        chartPanel.setMaximumSize(regresion_Lineal_JPanel.getMaximumSize());
        regresion_Lineal_JPanel.add(chartPanel);
        
        // Grafica de pastel:
        DefaultPieDataset dataseto = new DefaultPieDataset();
        dataseto.setValue("IPhone 5s", 20d);
        dataseto.setValue("SamSung Grand", 20d);
        dataseto.setValue("MotoG", 40d);
        dataseto.setValue("Nokia Lumia", 10d);
        
        chart = ChartFactory.createPieChart(
                "Ventas", // chart title 
                dataseto, // data    
                true, // include legend   
                true,
                false);
        
        chartPanel = new ChartPanel((JFreeChart) chart);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setMaximumDrawHeight(grafica_Pastel_JPanel.getMaximumSize().height);
        chartPanel.setMaximumDrawWidth(grafica_Pastel_JPanel.getMaximumSize().width);
        chartPanel.setMaximumSize(grafica_Pastel_JPanel.getMaximumSize());
        
        grafica_Pastel_JPanel.add(chartPanel);
    }

    @Override
    public void Colorear_Componentes() {
        
        contenido_Titulo_JPanel.setBackground(CourseRoom.Utilerias.Segundo_Color());
        titulo_JLabel.setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        titulo_JLabel.setBackground(CourseRoom.Utilerias.Tercer_Color());
        
        Carta_Visible();
        
        actualizar_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
        
        estadisticas_JTable.getTableHeader().setBackground(CourseRoom.Utilerias.Tercer_Color());
        estadisticas_JTable.getTableHeader().setForeground(CourseRoom.Utilerias.Tercer_Color_Fuente());
        estadisticas_JTable.setGridColor(CourseRoom.Utilerias.Segundo_Color());
        
        DefaultTableModel modelo = (DefaultTableModel) estadisticas_JTable.getModel();
        Celda_Renderer celda;
        for (int i = 0; i < estadisticas_JTable.getRowCount(); i++) {
            for (int j = 0; j < 6; j++) {
                celda = (Celda_Renderer) modelo.getValueAt(i, j);
                celda.Color_Fuente(CourseRoom.Utilerias.Primer_Color_Fuente());
            }
        }
       
    }

    @Override
    public void Limpiar() {
        
    }

    @Override
    public void Carta_Visible() {
        switch (carta_Visible) {
            case 0:
                regresion_Lineal_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
                grafica_Pastel_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
                estadisticas_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
                break;
            case 1:
                regresion_Lineal_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
                grafica_Pastel_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
                estadisticas_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
                break;
            case 2:
                regresion_Lineal_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
                grafica_Pastel_JButton.setBackground(CourseRoom.Utilerias.Segundo_Color());
                estadisticas_JButton.setBackground(CourseRoom.Utilerias.Tercer_Color());
                break;
        }
    }

}
