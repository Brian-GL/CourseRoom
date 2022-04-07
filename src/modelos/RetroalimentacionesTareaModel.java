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
public class RetroalimentacionesTareaModel {
    private int id_Retroalimentacion;
    private String retroalimentacion, fecha_Envio, nombre_Archivo, extension;

    public RetroalimentacionesTareaModel(int id_Retroalimentacion, String retroalimentacion, String fecha_Envio, String nombre_Archivo, String extension) {
        this.id_Retroalimentacion = id_Retroalimentacion;
        this.retroalimentacion = retroalimentacion;
        this.fecha_Envio = fecha_Envio;
        this.nombre_Archivo = nombre_Archivo;
        this.extension = extension;
    }

    public RetroalimentacionesTareaModel() {
        this.id_Retroalimentacion = 0;
        this.retroalimentacion = this.fecha_Envio = this.nombre_Archivo = this.extension = new String();
    }

    public int Id_Retroalimentacion() {
        return id_Retroalimentacion;
    }

    public void Id_Retroalimentacion(int id_Retroalimentacion) {
        this.id_Retroalimentacion = id_Retroalimentacion;
    }

    public String Retroalimentacion() {
        return retroalimentacion;
    }

    public void Retroalimentacion(String retroalimentacion) {
        this.retroalimentacion = retroalimentacion;
    }

    public String Fecha_Envio() {
        return fecha_Envio;
    }

    public void Fecha_Envio(String fecha_Envio) {
        this.fecha_Envio = fecha_Envio;
    }

    public String Nombre_Archivo() {
        return nombre_Archivo;
    }

    public void Nombre_Archivo(String nombre_Archivo) {
        this.nombre_Archivo = nombre_Archivo;
    }

    public String Extension() {
        return extension;
    }

    public void Extension(String extension) {
        this.extension = extension;
    }  
}
