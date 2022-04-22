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
public class GruposCursoModel {
    private Integer id_Grupo;
    private String nombre, numero_Integrantes, fecha_Creacion;
    
    public GruposCursoModel(int id_Grupo, String nombre, String numero_Integrantes, String fecha_Creacion) {
        this.id_Grupo = id_Grupo;
        this.nombre = nombre;
        this.numero_Integrantes = numero_Integrantes;
        this.fecha_Creacion = fecha_Creacion;
    }
    
    public GruposCursoModel() {
        this.id_Grupo = 0;
        this.nombre = this.numero_Integrantes = this.fecha_Creacion = new String();
    }

    public int Id_Grupo() {
        return id_Grupo;
    }

    public void Id_Grupo(int id_Grupo) {
        this.id_Grupo = id_Grupo;
    }

    public String Nombre() {
        return nombre;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Numero_Integrantes() {
        return numero_Integrantes;
    }

    public void Numero_Integrantes(String numero_Integrantes) {
        this.numero_Integrantes = numero_Integrantes;
    }

    public String Fecha_Creacion() {
        return fecha_Creacion;
    }

    public void Fecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }
}
