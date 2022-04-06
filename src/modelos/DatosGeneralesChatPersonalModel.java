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
public class DatosGeneralesChatPersonalModel {
    private int id_Usuario;
    private String nombre_Completo;

    public DatosGeneralesChatPersonalModel(int id_Usuario, String nombre_Completo) {
        this.id_Usuario = id_Usuario;
        this.nombre_Completo = nombre_Completo;
    }

    public DatosGeneralesChatPersonalModel() {
        this.id_Usuario = 0;
        this.nombre_Completo = new String();
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
}
