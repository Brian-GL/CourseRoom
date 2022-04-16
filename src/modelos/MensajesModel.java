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
public class MensajesModel {
    private int id_Mensaje;
    private String mensaje, fecha_Envio, nombre_Completo, extension;

    public MensajesModel(int id_Mensaje, String mensaje, String fecha_Envio, String nombre_Completo, String extension) {
        this.id_Mensaje = id_Mensaje;
        this.mensaje = mensaje;
        this.fecha_Envio = fecha_Envio;
        this.nombre_Completo = nombre_Completo;
        this.extension = extension;
    }

    public MensajesModel() {
        this.id_Mensaje = -1;
        this.mensaje = this.fecha_Envio = this.nombre_Completo = this.extension = new String();
    }

    public int Id_Mensaje() {
        return id_Mensaje;
    }

    public void Id_Mensaje(int id_Mensaje) {
        this.id_Mensaje = id_Mensaje;
    }

    public String Mensaje() {
        return mensaje;
    }

    public void Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String Fecha_Envio() {
        return fecha_Envio;
    }

    public void Fecha_Envio(String fecha_Envio) {
        this.fecha_Envio = fecha_Envio;
    }

    public String Nombre_Completo() {
        return nombre_Completo;
    }

    public void Nombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public String Extension() {
        return extension;
    }

    public void Extension(String extension) {
        this.extension = extension;
    }   
}
