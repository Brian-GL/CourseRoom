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
public class ArchivosCompartidosGrupoModel {
    private int id_Archivo_Compartido;
    private String nombre_Archivo, extension, fecha_Enviado, nombre_Completo;

    public ArchivosCompartidosGrupoModel(int id_Archivo_Compartido, String nombre_Archivo, String extension, String fecha_Enviado, String nombre_Completo) {
        this.id_Archivo_Compartido = id_Archivo_Compartido;
        this.nombre_Archivo = nombre_Archivo;
        this.extension = extension;
        this.fecha_Enviado = fecha_Enviado;
        this.nombre_Completo = nombre_Completo;
    }

    public ArchivosCompartidosGrupoModel() {
        this.id_Archivo_Compartido = 0;
        this.nombre_Archivo = this.extension = this.fecha_Enviado = this.nombre_Completo = new String();
    }

    public int Id_Archivo_Compartido() {
        return id_Archivo_Compartido;
    }

    public void Id_Archivo_Compartido(int id_Archivo_Compartido) {
        this.id_Archivo_Compartido = id_Archivo_Compartido;
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

    public String Nombre_Completo() {
        return nombre_Completo;
    }

    public void Nombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }
}
