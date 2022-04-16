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
public class GruposModel {
    private Integer id_Grupo, id_Curso;
    private String nombre, nombre_Curso, fecha_Creacion;

    public GruposModel(int id_Grupo, int id_Curso, String nombre, String nombre_Curso, String fecha_Creacion) {
        this.id_Grupo = id_Grupo;
        this.id_Curso = id_Curso;
        this.nombre = nombre;
        this.nombre_Curso = nombre_Curso;
        this.fecha_Creacion = fecha_Creacion;
    }

    public GruposModel() {
        this.id_Grupo = this.id_Curso = 0;
        this.nombre = this.nombre_Curso = this.fecha_Creacion = new String();
    }

    public int Id_Grupo() {
        return id_Grupo;
    }

    public void Id_Grupo(int id_Grupo) {
        this.id_Grupo = id_Grupo;
    }

    public int Id_Curso() {
        return id_Curso;
    }

    public void Id_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    public String Nombre() {
        return nombre;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Nombre_Curso() {
        return nombre_Curso;
    }

    public void Nombre_Curso(String nombre_Curso) {
        this.nombre_Curso = nombre_Curso;
    }

    public String Fecha_Creacion() {
        return fecha_Creacion;
    }

    public void Fecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }   
}
