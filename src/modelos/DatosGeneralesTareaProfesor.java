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
public class DatosGeneralesTareaProfesor {
    private String nombre, descripcion, fecha_Creacion, fecha_Entrega, estatus;
    
    public DatosGeneralesTareaProfesor(String nombre, String descripcion, String fecha_Creacion, String fecha_Entrega, String estatus) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_Creacion = fecha_Creacion;
        this.fecha_Entrega = fecha_Entrega;
        this.estatus = estatus;
    }
    
        public DatosGeneralesTareaProfesor() {
        this.nombre = this.descripcion = this.fecha_Creacion = this.fecha_Entrega = this.estatus = new String();
    }

    public String Nombre() {
        return nombre;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Descripcion() {
        return descripcion;
    }

    public void Descripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String Fecha_Creacion() {
        return fecha_Creacion;
    }

    public void Fecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public String Fecha_Entrega() {
        return fecha_Entrega;
    }

    public void Fecha_Entrega(String fecha_Entrega) {
        this.fecha_Entrega = fecha_Entrega;
    }
    
    public String Estatus() {
        return estatus;
    }

    public void Estatus(String estatus) {
        this.estatus = estatus;
    }
}
