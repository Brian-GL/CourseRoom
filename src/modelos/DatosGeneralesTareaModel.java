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
public class DatosGeneralesTareaModel {
    private String nombre, descripcion, fecha_Creacion, fecha_Entrega;
    private boolean tarea_Grupal;

    public DatosGeneralesTareaModel(String nombre, String descripcion, String fecha_Creacion, String fecha_Entrega, boolean tarea_Grupal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_Creacion = fecha_Creacion;
        this.fecha_Entrega = fecha_Entrega;
        this.tarea_Grupal = tarea_Grupal;
    }

    public DatosGeneralesTareaModel() {
        this.nombre = this.descripcion = this.fecha_Creacion = this.fecha_Entrega = new String();
        this.tarea_Grupal = false;
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

    public boolean Tarea_Grupal() {
        return tarea_Grupal;
    }

    public void Tarea_Grupal(boolean tarea_Grupal) {
        this.tarea_Grupal = tarea_Grupal;
    }  
}