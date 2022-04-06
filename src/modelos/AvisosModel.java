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
public class AvisosModel {
    private int id_Aviso;
    private String tipo_Aviso, aviso, fecha_Envio;

    public AvisosModel(int id_Aviso, String tipo_Aviso, String aviso, String fecha_Envio) {
        this.id_Aviso = id_Aviso;
        this.tipo_Aviso = tipo_Aviso;
        this.aviso = aviso;
        this.fecha_Envio = fecha_Envio;
    }

    public AvisosModel() {
        this.id_Aviso = 0;
        this.tipo_Aviso = this.aviso = this.fecha_Envio = new String();
    }

    public int Id_Aviso() {
        return id_Aviso;
    }

    public void Id_Aviso(int id_Aviso) {
        this.id_Aviso = id_Aviso;
    }

    public String Tipo_Aviso() {
        return tipo_Aviso;
    }

    public void Tipo_Aviso(String tipo_Aviso) {
        this.tipo_Aviso = tipo_Aviso;
    }

    public String Aviso() {
        return aviso;
    }

    public void Aviso(String aviso) {
        this.aviso = aviso;
    }

    public String Fecha_Envio() {
        return fecha_Envio;
    }

    public void Fecha_Envio(String fecha_Envio) {
        this.fecha_Envio = fecha_Envio;
    }
}
