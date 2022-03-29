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
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCorreo_Electronico() {
        return correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        this.correo_Electronico = correo_Electronico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(String tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_Creacion() {
        return fecha_Creacion;
    }

    public void setFecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public double getPromedio_General() {
        return promedio_General;
    }

    public void setPromedio_General(double promedio_General) {
        this.promedio_General = promedio_General;
    }

    
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
   
   
   
}
