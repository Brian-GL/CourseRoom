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

/**
 *
 * @author LENOVO
 */
public class ArchivoModel {
    
    private String nombre_Archivo, extension;
    private byte[] archivo;

    public ArchivoModel(String nombre_Archivo, byte[] archivo, String extension) {
        this.nombre_Archivo = nombre_Archivo;
        this.extension = extension;
        this.archivo = archivo;
    }

    public ArchivoModel() {
        this.nombre_Archivo = this.extension = new String();
        this.archivo = new byte[]{};
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

    public byte[] Archivo() {
        return archivo;
    }

    public void Archivo(byte[] archivo) {
        this.archivo = archivo;
    }
    
}
