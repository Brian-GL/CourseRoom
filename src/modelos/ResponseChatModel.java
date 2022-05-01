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
public class ResponseChatModel {
    private Integer id, codigo;
    private String mensaje;

    public ResponseChatModel(Integer id, Integer codigo, String mensaje) {
        this.id = id;
        this.codigo = codigo;
        this.mensaje = mensaje;
    }

    public ResponseChatModel() {
        this.id = this.codigo = -1;
        this.mensaje = new String();
    }

    public Integer Id() {
        return id;
    }

    public void Id(Integer id) {
        this.id = id;
    }

    public Integer Codigo() {
        return codigo;
    }

    public void Codigo(Integer codigo) {
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
