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
public class ArchivosTareaModel {
    private Integer id_Archivo_Tarea;
    private String nombre_Archivo, extension, fecha_Enviado;

    public ArchivosTareaModel(int id_Archivo_Tarea, String nombre_Archivo, String extension, String fecha_Enviado) {
        this.id_Archivo_Tarea = id_Archivo_Tarea;
        this.nombre_Archivo = nombre_Archivo;
        this.extension = extension;
        this.fecha_Enviado = fecha_Enviado;
    }

    public ArchivosTareaModel() {
        this.id_Archivo_Tarea = 0;
        this.nombre_Archivo = this.extension = this.fecha_Enviado = new String();
    }

    public int Id_Archivo_Tarea() {
        return id_Archivo_Tarea;
    }

    public void Id_Archivo_Tarea(int id_Archivo_Tarea) {
        this.id_Archivo_Tarea = id_Archivo_Tarea;
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

    public String Fecha_Enviado() {
        return fecha_Enviado;
    }

    public void Fecha_Enviado(String fecha_Enviado) {
        this.fecha_Enviado = fecha_Enviado;
    }
}
