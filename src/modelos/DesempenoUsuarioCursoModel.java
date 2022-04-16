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
public class DesempenoUsuarioCursoModel {
    private Integer id_Desempeno_Curso;
    private String tarea_Calificada, RumboEstatus;
    private Double calificacion, promedio_Curso, promedio_General, prediccion;

    public DesempenoUsuarioCursoModel(int id_Desempeno_Curso, String tarea_Calificada, String RumboEstatus, Double calificacion, Double promedio_Curso, Double promedio_General, Double prediccion) {
        this.id_Desempeno_Curso = id_Desempeno_Curso;
        this.tarea_Calificada = tarea_Calificada;
        this.RumboEstatus = RumboEstatus;
        this.calificacion = calificacion;
        this.promedio_Curso = promedio_Curso;
        this.promedio_General = promedio_General;
        this.prediccion = prediccion;
    }

    public DesempenoUsuarioCursoModel() {
        this.id_Desempeno_Curso = -1;
        this.tarea_Calificada = 
        this.RumboEstatus = new String();
        this.calificacion = 
        this.promedio_Curso = 
        this.promedio_General = 
        this.prediccion = -1.0;
    }

    public int Id_Desempeno_Curso() {
        return id_Desempeno_Curso;
    }

    public void Id_Desempeno_Curso(int id_Desempeno_Curso) {
        this.id_Desempeno_Curso = id_Desempeno_Curso;
    }

    public String Tarea_Calificada() {
        return tarea_Calificada;
    }

    public void Tarea_Calificada(String tarea_Calificada) {
        this.tarea_Calificada = tarea_Calificada;
    }

    public String RumboEstatus() {
        return RumboEstatus;
    }

    public void RumboEstatus(String RumboEstatus) {
        this.RumboEstatus = RumboEstatus;
    }

    public Double Calificacion() {
        return calificacion;
    }

    public void Calificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Double Promedio_Curso() {
        return promedio_Curso;
    }

    public void Promedio_Curso(Double promedio_Curso) {
        this.promedio_Curso = promedio_Curso;
    }

    public Double Promedio_General() {
        return promedio_General;
    }

    public void Promedio_General(Double promedio_General) {
        this.promedio_General = promedio_General;
    }

    public Double Prediccion() {
        return prediccion;
    }

    public void Prediccion(Double prediccion) {
        this.prediccion = prediccion;
    }
    
    
    
    
}
