/*
 * Copyright (C) 2022 JOEL BR
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
 * @author JOEL BR
 */
public class DatosEntregaTareaModel {
    private String fecha_Subida, fecha_Calificacion, estatus;
    private Double calificacion;

    public DatosEntregaTareaModel(String fecha_Subida, String fecha_Calificacion, String estatus, double calificacion) {
        this.fecha_Subida = fecha_Subida;
        this.fecha_Calificacion = fecha_Calificacion;
        this.estatus = estatus;
        this.calificacion = calificacion;
    }

    public DatosEntregaTareaModel() {
        this.fecha_Subida = this.fecha_Calificacion = this.estatus = new String();
        this.calificacion = -1.0;
    }

    public String Fecha_Subida() {
        return fecha_Subida;
    }

    public void Fecha_Subida(String fecha_Subida) {
        this.fecha_Subida = fecha_Subida;
    }

    public String Fecha_Calificacion() {
        return fecha_Calificacion;
    }

    public void Fecha_Calificacion(String fecha_Calificacion) {
        this.fecha_Calificacion = fecha_Calificacion;
    }

    public String Estatus() {
        return estatus;
    }

    public void Estatus(String estatus) {
        this.estatus = estatus;
    }

    public Double Calificacion() {
        return calificacion;
    }

    public void Calificacion(Double calificacion) {
        this.calificacion = calificacion;
    }   
}
