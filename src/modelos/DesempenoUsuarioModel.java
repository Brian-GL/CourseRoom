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
public class DesempenoUsuarioModel {
    private Integer id_Desempeno, id_Curso;
    private Double prediccion, promedio_General, promedio_Curso;
    private String rumbo_Estatus, nombre_Curso, fecha_Registro;

    public DesempenoUsuarioModel(int id_Desempeno, int id_Curso, double prediccion, double promedio_General, double promedio_Curso, String rumbo_Estatus, String nombre_Curso, String fecha_Registro) {
        this.id_Desempeno = id_Desempeno;
        this.id_Curso = id_Curso;
        this.prediccion = prediccion;
        this.promedio_General = promedio_General;
        this.promedio_Curso = promedio_Curso;
        this.rumbo_Estatus = rumbo_Estatus;
        this.nombre_Curso = nombre_Curso;
        this.fecha_Registro = fecha_Registro;
    }

    public DesempenoUsuarioModel() {
        rumbo_Estatus = nombre_Curso = fecha_Registro = new String();
        id_Desempeno = id_Curso = -1;
        prediccion = promedio_General = promedio_Curso = -1.0;
    }

    public int Id_Desempeno() {
        return id_Desempeno;
    }

    public void Id_Desempeno(int id_Desempeno) {
        this.id_Desempeno = id_Desempeno;
    }

    public int Id_Curso() {
        return id_Curso;
    }

    public void Id_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    public double Prediccion() {
        return prediccion;
    }

    public void Prediccion(double prediccion) {
        this.prediccion = prediccion;
    }

    public double Promedio_General() {
        return promedio_General;
    }

    public void Promedio_General(double promedio_General) {
        this.promedio_General = promedio_General;
    }

    public double Promedio_Curso() {
        return promedio_Curso;
    }

    public void Promedio_Curso(double promedio_Curso) {
        this.promedio_Curso = promedio_Curso;
    }

    public String Rumbo_Estatus() {
        return rumbo_Estatus;
    }

    public void Rumbo_Estatus(String rumbo_Estatus) {
        this.rumbo_Estatus = rumbo_Estatus;
    }

    public String Nombre_Curso() {
        return nombre_Curso;
    }

    public void Nombre_Curso(String nombre_Curso) {
        this.nombre_Curso = nombre_Curso;
    }

    public String Fecha_Registro() {
        return fecha_Registro;
    }

    public void Fecha_Registro(String fecha_Registro) {
        this.fecha_Registro = fecha_Registro;
    }
    
    

   
}
