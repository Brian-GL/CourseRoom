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
public class BuscarCursosModel {
    private Integer id_Curso, id_Usuario;
    private String nombre, nombre_Completo, lista_Tematicas, fecha_Creacion, estatus;

    public BuscarCursosModel(int id_Curso, int id_Usuario, String lista_Tematicas, String nombre, 
            String nombre_Completo, String fecha_Creacion, String estatus) {
        this.id_Curso = id_Curso;
        this.id_Usuario = id_Usuario;
        this.nombre = nombre;
        this.nombre_Completo = nombre_Completo;
        this.lista_Tematicas = lista_Tematicas;
        this.fecha_Creacion = fecha_Creacion;
        this.estatus = estatus;
    }

    public BuscarCursosModel() {
        this.id_Curso = this.id_Usuario = 0;
        this.nombre = this.nombre_Completo = this.fecha_Creacion = this.lista_Tematicas = this.estatus = new String();
    }

    public int Id_Curso() {
        return id_Curso;
    }

    public void Id_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    public int Id_Usuario() {
        return id_Usuario;
    }

    public void Id_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String Lista_Tematicas() {
        return lista_Tematicas;
    }

    public void Lista_Tematicas(String lista_Tematicas) {
        this.lista_Tematicas = lista_Tematicas;
    }

    public String Nombre() {
        return nombre;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Nombre_Completo() {
        return nombre_Completo;
    }

    public void Nombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public String Fecha_Creacion() {
        return fecha_Creacion;
    }

    public void Fecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public String Estatus() {
        return estatus;
    }

    public void Estatus(String estatus) {
        this.estatus = estatus;
    } 
}
