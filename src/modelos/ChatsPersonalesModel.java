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
public class ChatsPersonalesModel {
    private Integer id_Chat;
    private String nombre_Completo, fecha_Creacion, ultimo_Mensaje;

    public ChatsPersonalesModel(int id_Chat, String ultimo_Mensaje, String nombre_Completo, String fecha_Creacion) {
        this.id_Chat = id_Chat;
        this.ultimo_Mensaje = ultimo_Mensaje;
        this.nombre_Completo = nombre_Completo;
        this.fecha_Creacion = fecha_Creacion;
    }

    public ChatsPersonalesModel() {
        this.id_Chat = 0;
        this.nombre_Completo = ultimo_Mensaje = fecha_Creacion = new String();
    }

    public int Id_Chat() {
        return id_Chat;
    }

    public void Id_Chat(int id_Chat) {
        this.id_Chat = id_Chat;
    }

    public String Ultimo_Mensaje() {
        return ultimo_Mensaje;
    }

    public void Ultimo_Mensaje(String ultimo_Mensaje) {
        this.ultimo_Mensaje = ultimo_Mensaje;
    }

    public String Nombre_Completo() {
        return nombre_Completo;
    }

    public void Nombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public String Fecha_Creacion() {
        return fecha_Creacion;
    }

    public void Fecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }
}
