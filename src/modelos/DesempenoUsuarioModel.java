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
public class DesempenoUsuarioModel {
    
    private Integer id_Desempeno_Curso, id_Curso;
    private String nombre_Curso, rumbo_Estatus_Promedio, rumbo_Estatus_Puntualidad, fecha_Registro;
    private Double promedio_Curso, promedio_General, prediccion_Promedio, prediccion_Puntualidad, puntualidad, promedio_Puntualidad;
    private Boolean rezago;

    public DesempenoUsuarioModel(Integer id_Desempeno_Curso, Integer id_Curso, String nombre_Curso, 
            String rumbo_Estatus_Promedio, String rumbo_Estatus_Puntualidad, String fecha_Registro, Double promedio_Curso, Double promedio_General, Double prediccion_Promedio, Double puntualidad, Double promedio_Puntualidad, Double prediccion_Puntualidad, Boolean rezago) {
        this.id_Desempeno_Curso = id_Desempeno_Curso;
        this.id_Curso = id_Curso;
        this.nombre_Curso = nombre_Curso;
        this.rumbo_Estatus_Promedio = rumbo_Estatus_Promedio;
        this.rumbo_Estatus_Puntualidad = rumbo_Estatus_Puntualidad;
        this.fecha_Registro = fecha_Registro;
        this.promedio_Curso = promedio_Curso;
        this.promedio_General = promedio_General;
        this.prediccion_Promedio = prediccion_Promedio;
        this.puntualidad = puntualidad;
        this.promedio_Puntualidad = promedio_Puntualidad;
        this.prediccion_Puntualidad = prediccion_Puntualidad;
        this.rezago = rezago;
    }

    public DesempenoUsuarioModel() {
        this.id_Desempeno_Curso = 
        this.id_Curso = -1;
        this.nombre_Curso = 
        this.rumbo_Estatus_Promedio = 
        this.rumbo_Estatus_Puntualidad = 
        this.fecha_Registro = new String();
        this.promedio_Curso = 
        this.promedio_General = 
        this.prediccion_Promedio = 
        this.puntualidad = 
        this.prediccion_Puntualidad =
        this.promedio_Puntualidad = -1.0;
        this.rezago = false;
    }

    public Integer Id_Desempeno_Curso() {
        return id_Desempeno_Curso;
    }

    public void Id_Desempeno_Curso(Integer id_Desempeno_Curso) {
        this.id_Desempeno_Curso = id_Desempeno_Curso;
    }

    public Integer Id_Curso() {
        return id_Curso;
    }

    public void Id_Curso(Integer id_Curso) {
        this.id_Curso = id_Curso;
    }

    public String Nombre_Curso() {
        return nombre_Curso;
    }

    public void Nombre_Curso(String nombre_Curso) {
        this.nombre_Curso = nombre_Curso;
    }

    public String Rumbo_Estatus_Promedio() {
        return rumbo_Estatus_Promedio;
    }

    public void Rumbo_Estatus_Promedio(String rumbo_Estatus_Promedio) {
        this.rumbo_Estatus_Promedio = rumbo_Estatus_Promedio;
    }

    public String Rumbo_Estatus_Puntualidad() {
        return rumbo_Estatus_Puntualidad;
    }

    public void Rumbo_Estatus_Puntualidad(String rumbo_Estatus_Puntualidad) {
        this.rumbo_Estatus_Puntualidad = rumbo_Estatus_Puntualidad;
    }

    public String Fecha_Registro() {
        return fecha_Registro;
    }

    public void Fecha_Registro(String fecha_Registro) {
        this.fecha_Registro = fecha_Registro;
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

    public Double Prediccion_Promedio() {
        return prediccion_Promedio;
    }

    public void Prediccion_Promedio(Double prediccion_Promedio) {
        this.prediccion_Promedio = prediccion_Promedio;
    }

    public Double Prediccion_Puntualidad() {
        return prediccion_Puntualidad;
    }

    public void Prediccion_Puntualidad(Double prediccion_Puntualidad) {
        this.prediccion_Puntualidad = prediccion_Puntualidad;
    }

    public Double Puntualidad() {
        return puntualidad;
    }

    public void Puntualidad(Double puntualidad) {
        this.puntualidad = puntualidad;
    }

    public Double Promedio_Puntualidad() {
        return promedio_Puntualidad;
    }

    public void Promedio_Puntualidad(Double promedio_Puntualidad) {
        this.promedio_Puntualidad = promedio_Puntualidad;
    }

    public Boolean Rezago() {
        return rezago;
    }

    public void Rezago(Boolean rezago) {
        this.rezago = rezago;
    }
     
    
    
    
    
}
