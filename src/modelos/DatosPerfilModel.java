/*
 * Copyright (C) 2022 LENOVO
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


public class DatosPerfilModel {
    
    private String nombre, paterno, materno, correo_Electronico, genero, tipo_Usuario, fecha_Nacimiento, descripcion, 
    localidad, estado,fecha_Creacion, contrasenia;

   
    private double promedio_General;

    public DatosPerfilModel(String nombre, String paterno, String materno, String correo_Electronico, String genero, String tipo_Usuario, String fecha_Nacimiento, String descripcion, String localidad, String estado, String fecha_Creacion, double promedio_General, String contrasenia) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.correo_Electronico = correo_Electronico;
        this.genero = genero;
        this.tipo_Usuario = tipo_Usuario;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.descripcion = descripcion;
        this.localidad = localidad;
        this.estado = estado;
        this.fecha_Creacion = fecha_Creacion;
        this.promedio_General = promedio_General;
        this.contrasenia = contrasenia;
    }

    public DatosPerfilModel() {
        this.nombre = 
        this.paterno = 
        this.materno = 
        this.correo_Electronico = 
        this.genero = 
        this.tipo_Usuario = 
        this.fecha_Nacimiento = 
        this.descripcion = 
        this.localidad = 
        this.estado = this.contrasenia = 
        this.fecha_Creacion = new String();
        this.promedio_General = -1;
    }
   
    public String Nombre() {
        return nombre;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Paterno() {
        return paterno;
    }

    public void Paterno(String paterno) {
        this.paterno = paterno;
    }

    public String Materno() {
        return materno;
    }

    public void Materno(String materno) {
        this.materno = materno;
    }

    public String Correo_Electronico() {
        return correo_Electronico;
    }

    public void Correo_Electronico(String correo_Electronico) {
        this.correo_Electronico = correo_Electronico;
    }

    public String Genero() {
        return genero;
    }

    public void Genero(String genero) {
        this.genero = genero;
    }

    public String Tipo_Usuario() {
        return tipo_Usuario;
    }

    public void Tipo_Usuario(String tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }

    public String Fecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void Fecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String Descripcion() {
        return descripcion;
    }

    public void Descripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String Localidad() {
        return localidad;
    }

    public void Localidad(String localidad) {
        this.localidad = localidad;
    }

    public String Estado() {
        return estado;
    }

    public void Estado(String estado) {
        this.estado = estado;
    }

    public String Fecha_Creacion() {
        return fecha_Creacion;
    }

    public void Fecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public double Promedio_General() {
        return promedio_General;
    }

    public void Promedio_General(double promedio_General) {
        this.promedio_General = promedio_General;
    }

    
    public String Contrasenia() {
        return contrasenia;
    }

    public void Contrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
   
   
   
}
