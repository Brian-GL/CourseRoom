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
public class ResponseModel {
    
    private int codigo;
    private String mensaje;

    public ResponseModel(int codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }

    public ResponseModel() {
        this.codigo = -1;
        this.mensaje = new String();
    }

    public int Codigo() {
        return codigo;
    }

    public void Codigo(int codigo) {
        this.codigo = codigo;
    }

    public String Mensaje() {
        return mensaje;
    }

    public void Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean Is_Success(){
        return this.codigo > 0;
    }
    
}
