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
public class DatosGeneralesPreguntaModel {
    private Integer id_Usuario;
    private String nombre_Completo, pregunta, descripcion, fecha_Creacion, estatus;

    public DatosGeneralesPreguntaModel(int id_Usuario, String nombre_Completo, String pregunta, String descripcion, String fecha_Creacion, String estatus) {
        this.id_Usuario = id_Usuario;
        this.nombre_Completo = nombre_Completo;
        this.pregunta = pregunta;
        this.descripcion = descripcion;
        this.fecha_Creacion = fecha_Creacion;
        this.estatus = estatus;
    }

    public DatosGeneralesPreguntaModel() {
        this.id_Usuario = 0;
        this.nombre_Completo = this.pregunta = this.descripcion = this.fecha_Creacion = this.estatus = new String();
    }

    public int Id_Usuario() {
        return id_Usuario;
    }

    public void Id_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String Nombre_Completo() {
        return nombre_Completo;
    }

    public void Nombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public String Pregunta() {
        return pregunta;
    }

    public void Pregunta(String pregunta) {
        this.pregunta = pregunta;
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

    public String Estatus() {
        return estatus;
    }

    public void Estatus(String estatus) {
        this.estatus = estatus;
    }   
}
