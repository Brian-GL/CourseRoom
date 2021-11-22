/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.students;

import courseroom.MainFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import data.interfaces.Componentes_Interface;

/**
 *
 * @author LENOVO
 */
public class Student_Courses_Panel extends javax.swing.JPanel implements Componentes_Interface{

    /**
     * Creates new form Student_Courses_Panel
     */
    public Student_Courses_Panel() {
        initComponents();
        
        InitComponents();
        
        Student_Box_Course_Panel boxCoursePanel;
        String concatenate;
        for(int i = 0; i < MainFrame.getFaker().number().numberBetween(1, 10);i++){
            concatenate = MainFrame.Concatenar("COURSE_", i);
            boxCoursePanel = new Student_Box_Course_Panel(concatenate);
            boxCoursePanel.setMaximumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width-350,187));
            jPanelActualCourses.add(boxCoursePanel);
            
        }
       
        for(int i = 0; i < MainFrame.getFaker().number().numberBetween(1, 10);i++){
            concatenate = MainFrame.Concatenar("COURSE_", i);
            boxCoursePanel = new Student_Box_Course_Panel(concatenate);
            boxCoursePanel.setMaximumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width-350,187));
            jPanelFinishedCourses.add(boxCoursePanel);
        }
    }

    private void InitComponents(){
        jScrollPaneActualCourses.getViewport().setOpaque(false);
        jScrollPaneFinishedCourses.getViewport().setOpaque(false);
        jScrollPaneRelatedCourses.getViewport().setOpaque(false);
        jScrollPaneSeachCourses.getViewport().setOpaque(false);
        
        jScrollPaneActualCourses.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPaneFinishedCourses.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPaneRelatedCourses.getVerticalScrollBar().setUnitIncrement(15);
        jScrollPaneSeachCourses.getVerticalScrollBar().setUnitIncrement(15);
        
        jScrollPaneActualCourses.getHorizontalScrollBar().setUnitIncrement(15);
        jScrollPaneFinishedCourses.getHorizontalScrollBar().setUnitIncrement(15);
        jScrollPaneRelatedCourses.getHorizontalScrollBar().setUnitIncrement(15);
        jScrollPaneSeachCourses.getHorizontalScrollBar().setUnitIncrement(15);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneCourses = new javax.swing.JTabbedPane();
        jScrollPaneActualCourses = new javax.swing.JScrollPane();
        jPanelActualCourses = new javax.swing.JPanel();
        jScrollPaneSeachCourses = new javax.swing.JScrollPane();
        jPanelSearchCourses = new javax.swing.JPanel();
        jScrollPaneRelatedCourses = new javax.swing.JScrollPane();
        jPanelRelatedCourses = new javax.swing.JPanel();
        jScrollPaneFinishedCourses = new javax.swing.JScrollPane();
        jPanelFinishedCourses = new javax.swing.JPanel();
        jLabelCoursesTitle = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);

        jTabbedPaneCourses.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N

        jScrollPaneActualCourses.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jScrollPaneActualCourses.setOpaque(false);

        jPanelActualCourses.setOpaque(false);
        jPanelActualCourses.setLayout(new javax.swing.BoxLayout(jPanelActualCourses, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneActualCourses.setViewportView(jPanelActualCourses);

        jTabbedPaneCourses.addTab("Mis Cursos Actuales", new javax.swing.ImageIcon(getClass().getResource("/resources/icons/online-learning.png")), jScrollPaneActualCourses); // NOI18N

        jScrollPaneSeachCourses.setOpaque(false);

        jPanelSearchCourses.setOpaque(false);

        javax.swing.GroupLayout jPanelSearchCoursesLayout = new javax.swing.GroupLayout(jPanelSearchCourses);
        jPanelSearchCourses.setLayout(jPanelSearchCoursesLayout);
        jPanelSearchCoursesLayout.setHorizontalGroup(
            jPanelSearchCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1071, Short.MAX_VALUE)
        );
        jPanelSearchCoursesLayout.setVerticalGroup(
            jPanelSearchCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        jScrollPaneSeachCourses.setViewportView(jPanelSearchCourses);

        jTabbedPaneCourses.addTab("Buscar Cursos", new javax.swing.ImageIcon(getClass().getResource("/resources/icons/online-class.png")), jScrollPaneSeachCourses); // NOI18N

        jScrollPaneRelatedCourses.setOpaque(false);

        jPanelRelatedCourses.setOpaque(false);
        jPanelRelatedCourses.setLayout(new javax.swing.BoxLayout(jPanelRelatedCourses, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneRelatedCourses.setViewportView(jPanelRelatedCourses);

        jTabbedPaneCourses.addTab("Cursos Relacionados", new javax.swing.ImageIcon(getClass().getResource("/resources/icons/online-education.png")), jScrollPaneRelatedCourses, ""); // NOI18N

        jScrollPaneFinishedCourses.setOpaque(false);

        jPanelFinishedCourses.setOpaque(false);
        jPanelFinishedCourses.setLayout(new javax.swing.BoxLayout(jPanelFinishedCourses, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPaneFinishedCourses.setViewportView(jPanelFinishedCourses);

        jTabbedPaneCourses.addTab("Cursos Finalizados", new javax.swing.ImageIcon(getClass().getResource("/resources/icons/login.png")), jScrollPaneFinishedCourses); // NOI18N

        jLabelCoursesTitle.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabelCoursesTitle.setText("Cursos");
        jLabelCoursesTitle.setMaximumSize(new java.awt.Dimension(416, 84));
        jLabelCoursesTitle.setMinimumSize(new java.awt.Dimension(416, 84));
        jLabelCoursesTitle.setOpaque(true);
        jLabelCoursesTitle.setPreferredSize(new java.awt.Dimension(416, 84));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneCourses)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCoursesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCoursesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneCourses)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void Colorear_Componentes(){
        
        jLabelCoursesTitle.setBackground(MainFrame.getSecondColor());
        jLabelCoursesTitle.setForeground(MainFrame.getSecondFontColor());
        
        Color noColor = new Color(0,0,0,0);
        jTabbedPaneCourses.setBackground(noColor);
        jTabbedPaneCourses.setForeground(MainFrame.getFontColor());
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCoursesTitle;
    private javax.swing.JPanel jPanelActualCourses;
    private javax.swing.JPanel jPanelFinishedCourses;
    private javax.swing.JPanel jPanelRelatedCourses;
    private javax.swing.JPanel jPanelSearchCourses;
    private javax.swing.JScrollPane jScrollPaneActualCourses;
    private javax.swing.JScrollPane jScrollPaneFinishedCourses;
    private javax.swing.JScrollPane jScrollPaneRelatedCourses;
    private javax.swing.JScrollPane jScrollPaneSeachCourses;
    private javax.swing.JTabbedPane jTabbedPaneCourses;
    // End of variables declaration//GEN-END:variables
}
