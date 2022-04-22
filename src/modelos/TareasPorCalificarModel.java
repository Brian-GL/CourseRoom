/*
 * Copyright (C) 2022 Erick
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
 * @author Erick
 */
public class TareasPorCalificarModel {
    private Integer id_Tarea, id_Curso, id_Usuario;
    private String nombre, nombre_Curso, nombre_Completo, fecha_Subida, fecha_Entrega;

    public TareasPorCalificarModel(int id_Tarea, String nombre, int id_Curso, String nombre_Curso,int id_Usuario, String nombre_Completo, String fecha_Subida, String fecha_Entrega) {
        this.id_Tarea = id_Tarea;
        this.nombre = nombre;
        this.id_Curso = id_Curso;
        this.nombre_Curso = nombre_Curso;
        this.id_Usuario = id_Usuario;
        this.nombre_Completo = nombre_Completo;
        this.fecha_Subida = fecha_Subida;
        this.fecha_Entrega = fecha_Entrega;
    }

    public TareasPorCalificarModel() {
        this.id_Tarea = 0;
        this.nombre = this.nombre_Curso = this.nombre_Completo = this.fecha_Subida = this.fecha_Entrega = new String();
    }

    public int Id_Tarea() {
        return id_Tarea;
    }

    public void Id_Tarea(int id_Tarea) {
        this.id_Tarea = id_Tarea;
    }

    public String Nombre() {
        return nombre;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
        
    }
    
    public int Id_Curso() {
        return id_Curso;
    }

    public void Id_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }
    
    public String Nombre_Curso() {
        return nombre_Curso;
    }

    public void Nombre_Curso(String nombre_Curso) {
        this.nombre_Curso = nombre_Curso;
    }
    
    public int Id_Usuario() {
        return id_Usuario;
    }

    public void Id_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }
    
    public String Nombre_Completo() {
        return nombre_Completo;
    }

    public void Nombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public String Fecha_Subida() {
        return fecha_Subida;
    }

    public void Fecha_Subida(String fecha_Subida) {
        this.fecha_Subida = fecha_Subida;
    }
    
    public String Fecha_Entrega() {
        return fecha_Entrega;
    }

    public void Fecha_Entrega(String fecha_Entrega) {
        this.fecha_Entrega = fecha_Entrega;
    }
}
