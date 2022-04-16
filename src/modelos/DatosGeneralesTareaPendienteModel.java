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
public class DatosGeneralesTareaPendienteModel {
    private String nombre, descripcion, fecha_Creacion, fecha_Finalizacion, estatus, nombre_Completo;
    private Integer id_Usuario;

    public DatosGeneralesTareaPendienteModel(String nombre, String descripcion, String fecha_Creacion, String fecha_Finalizacion, String estatus, String nombre_Completo, int id_Usuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_Creacion = fecha_Creacion;
        this.fecha_Finalizacion = fecha_Finalizacion;
        this.estatus = estatus;
        this.nombre_Completo = nombre_Completo;
        this.id_Usuario = id_Usuario;
    }

    public DatosGeneralesTareaPendienteModel() {
        this.nombre = this.descripcion = this.fecha_Creacion = this.fecha_Finalizacion = this.estatus = this.nombre_Completo = new String();
        this.id_Usuario = id_Usuario;
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

    public String Fecha_Finalizacion() {
        return fecha_Finalizacion;
    }

    public void Fecha_Finalizacion(String fecha_Finalizacion) {
        this.fecha_Finalizacion = fecha_Finalizacion;
    }

    public String Estatus() {
        return estatus;
    }

    public void Estatus(String estatus) {
        this.estatus = estatus;
    }

    public String Nombre_Completo() {
        return nombre_Completo;
    }

    public void Nombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public int Id_Usuario() {
        return id_Usuario;
    }

    public void Id_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }
}
