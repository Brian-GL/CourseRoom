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
public class DatosPerfilChatPersonalModel {
    private String nombre, paterno, materno, correo_Electronico, genero, tipo_Usuario;

    public DatosPerfilChatPersonalModel(String nombre, String paterno, String materno, String correo_Electronico, String genero, String tipo_Usuario) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.correo_Electronico = correo_Electronico;
        this.genero = genero;
        this.tipo_Usuario = tipo_Usuario;
    }

    public DatosPerfilChatPersonalModel() {
        this.nombre = this.paterno = this.materno = this.correo_Electronico = this.genero = this.tipo_Usuario = new String();
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
}
