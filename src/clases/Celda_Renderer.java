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
package clases;

import courseroom.CourseRoom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author LENOVO
 */
public class Celda_Renderer extends DefaultTableCellRenderer implements Comparable<Object>{
    
//The JLabel that is used to display image
    private JLabel label;
    private final String id;
    private final String texto;

    public Celda_Renderer(){
        super();
        id = "";
        texto = "";
        Inicializar_Label(); 
    }
    
    public Celda_Renderer(String _texto) {
        super();
        this.id = new String();
        texto = _texto;
        Inicializar_Label();
        label.setText(CourseRoom.Utilerias.Formato_HTML_Central(texto));
    }
    
    public Celda_Renderer(String _texto, int _altura) {
        super();
        this.id = new String();
        texto = _texto;
        Inicializar_Label();
        label.setText(CourseRoom.Utilerias.Formato_HTML_Central(texto));
        Altura(_altura);
    }
   
    public Celda_Renderer(String _texto, String _id) {
        super();
        id = _id;
        texto = _texto;
        Inicializar_Label();
        label.setText(CourseRoom.Utilerias.Formato_HTML_Central(texto));
    }
    
    public Celda_Renderer(String _texto, String _id, int _altura) {
        super();
        id = _id;
        texto = _texto;
        Inicializar_Label();
        label.setText(CourseRoom.Utilerias.Formato_HTML_Central(texto));
        Altura(_altura);
    }
    
    
    public Celda_Renderer(ImageIcon icono, String _id) {
        super();
        id = _id;
        texto = new String();
        Inicializar_Label();
        if(icono != null){
            label.setIcon(icono);
        }
    }
    
    public Celda_Renderer(ImageIcon icono, String _id, int _altura) {
        super();
        id = _id;
        texto = new String();
        Inicializar_Label();
        if(icono != null){
            label.setIcon(icono);
        }
        Altura(_altura);
    }
    
    public Celda_Renderer(ImageIcon icono, int _altura) {
        super();
        id = new String();
        texto = new String();
        Inicializar_Label();
        if(icono != null){
            label.setIcon(icono);
        }
        Altura(_altura);
    }
    
    public Celda_Renderer(ImageIcon icono) {
        super();
        id = new String();
        texto = new String();
        Inicializar_Label();
        if(icono != null){
            label.setIcon(icono);
        }
    }
    
    public Celda_Renderer(ImageIcon icono, String _texto, String _id) {
        super();
        id = _id;
        texto = _texto;
        Inicializar_Label();
        if(icono != null){
            label.setIcon(icono);
        }
        label.setText(CourseRoom.Utilerias.Formato_HTML_Central(texto));
    }
    
    public Celda_Renderer(ImageIcon icono, String _texto, String _id, int _altura) {
        super();
        id = _id;
        texto = _texto;
        Inicializar_Label();
        if(icono != null){
            label.setIcon(icono);
        }
        label.setText(CourseRoom.Utilerias.Formato_HTML_Central(texto));
        Altura(_altura);
    }

    public JLabel Componente() {
        return label;
    }
    
    public String ID(){
        return this.id;
    } 
    
    public String Texto(){
        return this.texto;
    } 
    
    public boolean Tiene_Icono(){
        return label.getIcon() != null;
    }
    
    public void Color_Fuente(Color color){
        label.setForeground(color);
    }
    
    public void Altura(int altura){
        Dimension dimension = new Dimension();
        dimension.width = label.getPreferredSize().width;
        dimension.height = altura;
        label.setPreferredSize(dimension);
    }
    
    private void Inicializar_Label(){
        label = new JLabel();
        Font segoe = new Font("Segoe UI", Font.PLAIN, 14);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(segoe);
        label.setForeground(CourseRoom.Utilerias.Primer_Color_Fuente());
    }
    
    
   
    /**
     *
     * @param table the JTable that is asking the renderer to draw; can be null
     * @param value the value of the cell to be rendered. It is up to the
     * specific renderer to interpret and draw the value. For example, if value
     * is the string "true", it could be rendered as a string or it could be
     * rendered as a check box that is checked. null is a valid value
     * @param isSelected true if the cell is to be rendered with the selection
     * highlighted; otherwise false
     * @param hasFocus if true, render cell appropriately. For example, put a
     * special border on the cell, if the cell can be edited, render in the
     * color used to indicate editing
     * @param row the row index of the cell being drawn. When drawing the
     * header, the value of row is -1
     * @param column the column index of the cell being drawn
     * @return
     */
    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        Celda_Renderer celda = (Celda_Renderer) value;
        return (Component) celda.Componente();
    }
    
    @Override
    public int compareTo(Object o) {
        if(o != null){
            
            if(o instanceof Celda_Renderer celda){
                
                if(celda.Texto() != null &&
                        this.Texto() != null){
                    
                    return this.Texto().compareTo(celda.Texto());
                }
                else if (celda.Texto() != null &&
                        this.Texto() == null){
                    
                    return -1;
                }
                else if (celda.Texto() == null &&
                        this.Texto() != null){
                    return 1;
                }
                
                else{
                    return 0;
                }
            }
            
            return 1;
            
        }
        
        return 1;
    }
}
