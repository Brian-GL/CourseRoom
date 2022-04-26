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
public class DatosGeneralesCursoModel {
    private int id_Profesor;
    private String nombre, descripcion, nombre_Completo, descripcion_Profesor, fecha_Creacion;

    public DatosGeneralesCursoModel(int id_Profesor,String nombre, String descripcion, String nombre_Completo, String descripcion_Profesor, String fecha_Creacion) {
        this.nombre = nombre;
        this.id_Profesor = id_Profesor;
        this.descripcion = descripcion;
        this.nombre_Completo = nombre_Completo;
        this.descripcion_Profesor = descripcion_Profesor;
        this.fecha_Creacion = fecha_Creacion;
    }

    public DatosGeneralesCursoModel() {
        this.id_Profesor = -1;
        this.nombre = this.descripcion = this.nombre_Completo = this.descripcion_Profesor = this.fecha_Creacion = new String();
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

    public String Nombre_Completo() {
        return nombre_Completo;
    }

    public void Nombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public String Descripcion_Profesor() {
        return descripcion_Profesor;
    }

    public void Descripcion_Profesor(String descripcion_Profesor) {
        this.descripcion_Profesor = descripcion_Profesor;
    }

    public String Fecha_Creacion() {
        return fecha_Creacion;
    }

    public void Fecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public int Id_Profesor() {
        return id_Profesor;
    }

    public void Id_Profesor(int id_Profesor) {
        this.id_Profesor = id_Profesor;
    }
    
    
}
