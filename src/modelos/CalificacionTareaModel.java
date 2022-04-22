/*
 * Copyright (C) 2022 Erick
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
package modelos;

/**
 *
 * @author Erick
 */
public class CalificacionTareaModel {
    private Double calificacion;
    private String fecha_Calificacion;
    
    public CalificacionTareaModel(double calificacion, String fecha_Calificacion) {
        this.calificacion = calificacion;
        this.fecha_Calificacion = fecha_Calificacion;
    }
    
    public CalificacionTareaModel(){
        this.calificacion = -1.0;
        this.fecha_Calificacion = new String();
    }
    
     public Double Calificacion() {
        return calificacion;
    }
     
    public void Calificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String Fecha_Calificacion() {
        return fecha_Calificacion;
    }
    
    public void Fecha_Calificacion(String fecha_Calificacion) {
        this.fecha_Calificacion = fecha_Calificacion;
    }
}
