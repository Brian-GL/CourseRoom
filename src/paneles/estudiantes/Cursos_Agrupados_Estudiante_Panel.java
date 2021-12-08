/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.estudiantes;

import interfaces.Componentes_Interface;
import interfaces.Limpieza_Interface;
import main.CourseRoom;

/**
 *
 * @author LENOVO
 */
public class Cursos_Agrupados_Estudiante_Panel extends javax.swing.JPanel implements Limpieza_Interface, Componentes_Interface{

    
    private String nombre_Agrupado;
    
    /**
     * Creates new form Cursos_Agrupados_Estudiante_Panel
     */
    public Cursos_Agrupados_Estudiante_Panel(String _nombre_Agrupado) {
        initComponents();
        
        nombre_Agrupado = _nombre_Agrupado;
        
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

        contenido_JScrollPane = new javax.swing.JScrollPane();
        contenido_JPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(32767, 616));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1070, 616));

        contenido_JScrollPane.setBorder(null);
        contenido_JScrollPane.setMaximumSize(new java.awt.Dimension(32767, 616));
        contenido_JScrollPane.setOpaque(false);
        contenido_JScrollPane.setPreferredSize(new java.awt.Dimension(1058, 616));

        contenido_JPanel.setOpaque(false);
        contenido_JPanel.setLayout(new java.awt.GridLayout(0, 2));
        contenido_JScrollPane.setViewportView(contenido_JPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenido_JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void Agregar_Caja_Curso(Caja_Curso_Estudiante_Panel caja_Curso_Estudiante_Panel){
        contenido_JPanel.add(caja_Curso_Estudiante_Panel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido_JPanel;
    private javax.swing.JScrollPane contenido_JScrollPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Iniciar_Componentes() {
        contenido_JScrollPane.getViewport().setOpaque(false);
        contenido_JScrollPane.getVerticalScrollBar().setUnitIncrement(15);
        contenido_JScrollPane.getHorizontalScrollBar().setUnitIncrement(15);
    }

    @Override
    public void Colorear_Componentes() {
        contenido_JScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(
        javax.swing.BorderFactory.createLineBorder(CourseRoom.Primer_Color_Fuente()), nombre_Agrupado, 
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                javax.swing.border.TitledBorder.DEFAULT_POSITION, 
                new java.awt.Font("Gadugi", 1, 16),CourseRoom.Primer_Color_Fuente()));
        
    }
    
    @Override
    public void Limpiar() {
        contenido_JPanel.removeAll();
        nombre_Agrupado = null;
    }

}
