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
public class TareasPendientesGrupoModel {
    private int id_Tarea_Pendiente;
    private String nombre, nombre_Completo, estatus;

    public TareasPendientesGrupoModel(int id_Tarea_Pendiente, String nombre, String nombre_Completo, String estatus) {
        this.id_Tarea_Pendiente = id_Tarea_Pendiente;
        this.nombre = nombre;
        this.nombre_Completo = nombre_Completo;
        this.estatus = estatus;
    }

    public TareasPendientesGrupoModel() {
        this.id_Tarea_Pendiente = 0;
        this.nombre = this.nombre_Completo = this.estatus = new String();
    }

    public int Id_Tarea_Pendiente() {
        return id_Tarea_Pendiente;
    }

    public void Id_Tarea_Pendiente(int id_Tarea_Pendiente) {
        this.id_Tarea_Pendiente = id_Tarea_Pendiente;
    }

    public String Nombre() {
        return nombre;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Nombre_Completo() {
        return nombre_Completo;
    }

    public void Nombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public String Estatus() {
        return estatus;
    }

    public void Estatus(String estatus) {
        this.estatus = estatus;
    }
}
