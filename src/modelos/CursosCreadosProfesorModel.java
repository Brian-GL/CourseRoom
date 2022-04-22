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
public class CursosCreadosProfesorModel {
    private Integer id_Curso;
    private String nombre;
    private String tematicas;
    private String estatus;
    private String fecha_Creacion;
    
    public CursosCreadosProfesorModel(int id_Curso, String nombre, String tematicas, String estatus,
            String fecha_Creacion) {
        this.id_Curso = id_Curso;
        this.nombre = nombre;
        this.tematicas = tematicas;
        this.estatus = estatus;
        this.fecha_Creacion = fecha_Creacion;
    }
    
    public CursosCreadosProfesorModel() {
        this.id_Curso = 0;
        this.nombre = this.tematicas = this.estatus = this.fecha_Creacion = new String();
    }
    
    public int Id_Curso() {
        return id_Curso;
    }
    
    public void Id_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    public String Nombre() {
        return nombre;
    }
    
    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Tematicas() {
        return tematicas;
    }
    
    public void Tematicas(String tematicas) {
        this.tematicas = tematicas;
    }

    public String Estatus() {
        return estatus;
    }
    
    public void Estatus(String estatus){
        this.estatus = estatus;
    }

    public String Fecha_Creacion() {
        return fecha_Creacion;
    }
    
    public void Fecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }
}
