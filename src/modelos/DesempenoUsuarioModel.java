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
    private int id_Desempeno, numero_Tareas_Calificadas, id_Curso;
    private double prediccion, promedio_General;
    private String rumbo_Estatus, nombre;

    public DesempenoUsuarioModel(int id_Desempeno, int numero_Tareas_Calificadas, int id_Curso, double prediccion, double promedio_General, String rumbo_Estatus, String nombre) {
        this.id_Desempeno = id_Desempeno;
        this.numero_Tareas_Calificadas = numero_Tareas_Calificadas;
        this.id_Curso = id_Curso;
        this.prediccion = prediccion;
        this.promedio_General = promedio_General;
        this.rumbo_Estatus = rumbo_Estatus;
        this.nombre = nombre;
    }

    public DesempenoUsuarioModel() {
        this.id_Desempeno = this.numero_Tareas_Calificadas = this.id_Curso = 0;
        this.prediccion = this.promedio_General = -1;
        this.rumbo_Estatus = this.nombre = new String();
    }

    public int Id_Desempeno() {
        return id_Desempeno;
    }

    public void Id_Desempeno(int id_Desempeno) {
        this.id_Desempeno = id_Desempeno;
    }

    public int Numero_Tareas_Calificadas() {
        return numero_Tareas_Calificadas;
    }

    public void Numero_Tareas_Calificadas(int numero_Tareas_Calificadas) {
        this.numero_Tareas_Calificadas = numero_Tareas_Calificadas;
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

    public String Rumbo_Estatus() {
        return rumbo_Estatus;
    }

    public void Rumbo_Estatus(String rumbo_Estatus) {
        this.rumbo_Estatus = rumbo_Estatus;
    }

    public String Nombre() {
        return nombre;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }
}
