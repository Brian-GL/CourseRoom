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
public class DatosGeneralesGrupoModel {
    private String nombre, descripcion, fecha_Creacion, nombre_Curso;
    private int id_Grupo;

    public DatosGeneralesGrupoModel(String nombre, String descripcion, String fecha_Creacion, String nombre_Curso, int id_Grupo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_Creacion = fecha_Creacion;
        this.nombre_Curso = nombre_Curso;
        this.id_Grupo = id_Grupo;
    }

    public DatosGeneralesGrupoModel() {
        this.nombre = this.descripcion = this.fecha_Creacion = this.nombre_Curso = new String();
        this.id_Grupo = 0;
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

    public String Nombre_Curso() {
        return nombre_Curso;
    }

    public void Nombre_Curso(String nombre_Curso) {
        this.nombre_Curso = nombre_Curso;
    }

    public int Id_Grupo() {
        return id_Grupo;
    }

    public void Id_Grupo(int id_Grupo) {
        this.id_Grupo = id_Grupo;
    }
}
