/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.teachers;

import com.github.javafaker.Faker;
import courseroom.MainFrame;
import data.interfaces.DisposeInterface;

/**
 *
 * @author LENOVO
 */
public class Teacher_Homeworks_Panel extends javax.swing.JPanel implements DisposeInterface{

    /**
     * Creates new form HomeworksPanel
     */
    public Teacher_Homeworks_Panel() {
        initComponents();
        
        jScrollPaneMisTareas.getViewport().setOpaque(false);
        jScrollPaneMisTareas.getVerticalScrollBar().setUnitIncrement(15);
        Faker faker = new Faker();
        for(int i = 0; i < faker.number().numberBetween(1, 10);i++){
            Teacher_Box_Homework_Panel boxHomeworkPanel = new Teacher_Box_Homework_Panel(i);
            jPanelMisTareas.add(boxHomeworkPanel);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelHomeworksTitle = new javax.swing.JLabel();
        jScrollPaneMisTareas = new javax.swing.JScrollPane();
        jPanelMisTareas = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);

        jLabelHomeworksTitle.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabelHomeworksTitle.setText("Tareas");
        jLabelHomeworksTitle.setMaximumSize(new java.awt.Dimension(416, 84));
        jLabelHomeworksTitle.setMinimumSize(new java.awt.Dimension(416, 84));
        jLabelHomeworksTitle.setOpaque(true);
        jLabelHomeworksTitle.setPreferredSize(new java.awt.Dimension(416, 84));

        jScrollPaneMisTareas.setBorder(null);
        jScrollPaneMisTareas.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneMisTareas.setOpaque(false);

        jPanelMisTareas.setOpaque(false);
        jPanelMisTareas.setLayout(new javax.swing.BoxLayout(jPanelMisTareas, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneMisTareas.setViewportView(jPanelMisTareas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMisTareas, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHomeworksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHomeworksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneMisTareas, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void colorMyComponents(){
        jLabelHomeworksTitle.setBackground(MainFrame.getSecondColor());
        jLabelHomeworksTitle.setForeground(MainFrame.getSecondFontColor());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelHomeworksTitle;
    private javax.swing.JPanel jPanelMisTareas;
    private javax.swing.JScrollPane jScrollPaneMisTareas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Dispose()  {
        jPanelMisTareas.removeAll();
    }
}
