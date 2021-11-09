/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.teachers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.SwingUtilities;
import courseroom.MainFrame;
import data.interfaces.DisposeInterface;

/**
 *
 * @author brian
 */
public class Teacher_Dates_Panel extends javax.swing.JPanel implements DisposeInterface{

    private int index_month;
    private int index_year;
    private LocalDateTime time_now;
    /**
     * Creates new form DatesPanel
     */
    public Teacher_Dates_Panel() {
        initComponents();
        
        initMyComponents();
        
        
    }
    
    private void initMyComponents(){
        
        jScrollPaneCalendar.getViewport().setOpaque(false);
        LocalDateTime now = LocalDateTime.now();  
        index_month = now.getMonthValue();
        index_year = now.getYear();
        time_now = LocalDateTime.now();
    }
    
    public void colorMyComponents(){
        jLabelMonth.setBackground(MainFrame.getSecondColor());
        jLabelMonth.setForeground(MainFrame.getSecondFontColor());
        
        jLabelLunes.setForeground(MainFrame.getFontColor());
        jLabelMartes.setForeground(MainFrame.getFontColor());
        jLabelMiercoles.setForeground(MainFrame.getFontColor());
        jLabelJueves.setForeground(MainFrame.getFontColor());
        jLabelViernes.setForeground(MainFrame.getFontColor());
        jLabelSabado.setForeground(MainFrame.getFontColor());
        jLabelDomingo.setForeground(MainFrame.getFontColor());
        jLabelNextMonth.setForeground(MainFrame.getFontColor());
        jLabelPreviousMonth.setForeground(MainFrame.getFontColor());
        createCalendar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDaysTitle = new javax.swing.JPanel();
        jLabelLunes = new javax.swing.JLabel();
        jLabelMartes = new javax.swing.JLabel();
        jLabelMiercoles = new javax.swing.JLabel();
        jLabelJueves = new javax.swing.JLabel();
        jLabelViernes = new javax.swing.JLabel();
        jLabelSabado = new javax.swing.JLabel();
        jLabelDomingo = new javax.swing.JLabel();
        jScrollPaneCalendar = new javax.swing.JScrollPane();
        jPanelCalendar = new javax.swing.JPanel();
        jLabelNextMonth = new javax.swing.JLabel();
        jLabelPreviousMonth = new javax.swing.JLabel();
        jLabelMonth = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1085, 630));
        setOpaque(false);

        jPanelDaysTitle.setMinimumSize(new java.awt.Dimension(1025, 30));
        jPanelDaysTitle.setOpaque(false);
        jPanelDaysTitle.setPreferredSize(new java.awt.Dimension(1025, 30));
        jPanelDaysTitle.setLayout(new java.awt.GridLayout(1, 7));

        jLabelLunes.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLunes.setText("Lunes");
        jPanelDaysTitle.add(jLabelLunes);

        jLabelMartes.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMartes.setText("Martes");
        jPanelDaysTitle.add(jLabelMartes);

        jLabelMiercoles.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMiercoles.setText("Miércoles");
        jPanelDaysTitle.add(jLabelMiercoles);

        jLabelJueves.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJueves.setText("Jueves");
        jPanelDaysTitle.add(jLabelJueves);

        jLabelViernes.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelViernes.setText("Viernes");
        jPanelDaysTitle.add(jLabelViernes);

        jLabelSabado.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSabado.setText("Sábado");
        jPanelDaysTitle.add(jLabelSabado);

        jLabelDomingo.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDomingo.setText("Domingo");
        jPanelDaysTitle.add(jLabelDomingo);

        jScrollPaneCalendar.setBorder(null);
        jScrollPaneCalendar.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneCalendar.setMinimumSize(new java.awt.Dimension(1025, 600));
        jScrollPaneCalendar.setOpaque(false);
        jScrollPaneCalendar.setPreferredSize(new java.awt.Dimension(1025, 600));

        jPanelCalendar.setOpaque(false);
        jPanelCalendar.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanelCalendar.setLayout(new java.awt.GridLayout(6, 7));
        jScrollPaneCalendar.setViewportView(jPanelCalendar);

        jLabelNextMonth.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabelNextMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNextMonth.setText(">");
        jLabelNextMonth.setToolTipText("Mes Siguiente");
        jLabelNextMonth.setMaximumSize(new java.awt.Dimension(30, 630));
        jLabelNextMonth.setMinimumSize(new java.awt.Dimension(30, 630));
        jLabelNextMonth.setPreferredSize(new java.awt.Dimension(30, 630));
        jLabelNextMonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNextMonthMouseClicked(evt);
            }
        });

        jLabelPreviousMonth.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jLabelPreviousMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPreviousMonth.setText("<");
        jLabelPreviousMonth.setToolTipText("Mes Anterior");
        jLabelPreviousMonth.setMaximumSize(new java.awt.Dimension(30, 630));
        jLabelPreviousMonth.setMinimumSize(new java.awt.Dimension(30, 630));
        jLabelPreviousMonth.setPreferredSize(new java.awt.Dimension(30, 630));
        jLabelPreviousMonth.setRequestFocusEnabled(false);
        jLabelPreviousMonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPreviousMonthMouseClicked(evt);
            }
        });

        jLabelMonth.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabelMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMonth.setText("Octubre");
        jLabelMonth.setToolTipText("Mes Actual");
        jLabelMonth.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPaneCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPreviousMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addComponent(jPanelDaysTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jLabelNextMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelMonth)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelDaysTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPaneCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabelPreviousMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNextMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelNextMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNextMonthMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if((index_month+1) < 13){
                index_month++;
                jPanelCalendar.removeAll();
                createCalendar();
            } 
        }
    }//GEN-LAST:event_jLabelNextMonthMouseClicked

    private void jLabelPreviousMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPreviousMonthMouseClicked
        // TODO add your handling code here:
        if(SwingUtilities.isLeftMouseButton(evt)){
            if((index_month-1) > 0 ){
                index_month--;
                jPanelCalendar.removeAll();
                createCalendar();
            }
        }
    }//GEN-LAST:event_jLabelPreviousMonthMouseClicked

    public void createCalendar(){
        
        
        switch(index_month){
            case 1:
                setMonth(32, 32);
            break;
            case 2:
                if (isLeapYear(index_year)) {
                    setMonth(30, 32);
                } else{
                    setMonth(29, 32);
                }
                
            break;
            case 3:
                if(isLeapYear(index_year)){
                    setMonth(32, 30);
                }else{
                    setMonth(32, 29);
                }
            break;
            case 4:
                setMonth(31, 32);
            break;
            case 5:
                setMonth(32, 31);
            break;
            case 6:
                setMonth(31, 32);
            break;
            case 7:
                setMonth(32, 31);
            break;
            case 8:
                setMonth(32, 32);
            break;
            case 9:
                setMonth(31, 32);
            break;
            case 10:
                setMonth(32, 31);
            break;
            case 11:
                setMonth(31, 32);
            break;
            case 12:
                 setMonth(32, 31);
            break;
                
        }
    }
    
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
          return false;
        } else if (year % 400 == 0) {
          return true;
        } else if (year % 100 == 0) {
          return false;
        } else {
          return true;
        }
    }
    
    private void setMonth(int index_month_days, int previous_index_month_days){
        int count = 0;
        jLabelMonth.setText(setMonthName());
        LocalDate localDate = LocalDate.of(index_year, index_month, 1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int until = dayOfWeek.getValue()-1;
        for(int i = until; i > 0;i--){
            Teacher_Box_Date_Panel calendarDayPanel = new Teacher_Box_Date_Panel(previous_index_month_days-i);
            calendarDayPanel.paintMyComponents(MainFrame.getThirdColor(), MainFrame.getThirdFontColor());
            jPanelCalendar.add(calendarDayPanel);
            count++;
        }
        
        for(int i = 1; i < index_month_days;i++){
            Teacher_Box_Date_Panel calendarDayPanel = new Teacher_Box_Date_Panel(i);
            if(time_now.getDayOfMonth() == i){
                calendarDayPanel.paintMyComponents(MainFrame.getFirstColor(), MainFrame.getFontColor());
                jPanelCalendar.add(calendarDayPanel);
            } else{
                 calendarDayPanel.paintMyComponents(MainFrame.getSecondColor(), MainFrame.getSecondFontColor());
                jPanelCalendar.add(calendarDayPanel);
            }
            count++;
        }
        
        int i = 1;
        while(count < 42){
            Teacher_Box_Date_Panel calendarDayPanel = new Teacher_Box_Date_Panel(i);
            calendarDayPanel.paintMyComponents(MainFrame.getThirdColor(), MainFrame.getFirstColor());
            jPanelCalendar.add(calendarDayPanel);
            i++;
            count++;
        }
        
        localDate = null;
        dayOfWeek = null;
    }    
    
    private String setMonthName(){
        String month = "";
        switch(index_month) {
            case 1:
                month = "Enero";
                break;
            case 2:
                month = "Febrero";
                break;
            case 3:
                month = "Marzo";
                break;
            case 4:
                month = "Abril";
                break;
            case 5:
                month = "Mayo";
                break;
            case 6:
                month = "Junio";
                break;
            case 7:
                month = "Julio";
                break;
            case 8:
                month = "Agosto";
                break;
            case 9:
                month = "Septiembre";
                break;
            case 10:
                month = "Octubre";
                break;
            case 11:
                month = "Noviembre";
                break;
            case 12:
                month = "Diciembre";
                break;
        }
        
        return month;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDomingo;
    private javax.swing.JLabel jLabelJueves;
    private javax.swing.JLabel jLabelLunes;
    private javax.swing.JLabel jLabelMartes;
    private javax.swing.JLabel jLabelMiercoles;
    private javax.swing.JLabel jLabelMonth;
    private javax.swing.JLabel jLabelNextMonth;
    private javax.swing.JLabel jLabelPreviousMonth;
    private javax.swing.JLabel jLabelSabado;
    private javax.swing.JLabel jLabelViernes;
    private javax.swing.JPanel jPanelCalendar;
    private javax.swing.JPanel jPanelDaysTitle;
    private javax.swing.JScrollPane jScrollPaneCalendar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose()  {
        jPanelCalendar.removeAll();
    }
}
