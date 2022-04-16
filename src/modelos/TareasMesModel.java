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
public class TareasMesModel {
    private Integer id_Tarea;
    private String dia, horario, descripcion;

    public TareasMesModel(int id_Tarea, String dia, String horario, String descripcion) {
        this.id_Tarea = id_Tarea;
        this.dia = dia;
        this.horario = horario;
        this.descripcion = descripcion;
    }

    public TareasMesModel() {
        this.id_Tarea = 0;
        this.dia = this.horario = this.descripcion = new String();
    }

    public int Id_Tarea() {
        return id_Tarea;
    }

    public void Id_Tarea(int id_Tarea) {
        this.id_Tarea = id_Tarea;
    }

    public String Dia() {
        return dia;
    }

    public void Dia(String dia) {
        this.dia = dia;
    }

    public String Horario() {
        return horario;
    }

    public void Horario(String horario) {
        this.horario = horario;
    }

    public String Descripcion() {
        return descripcion;
    }

    public void Descripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
