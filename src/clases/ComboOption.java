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
package clases;

/**
 *
 * @author LENOVO
 */
public class ComboOption {
    
    private String valor;
    private Integer id;
    
    public ComboOption(Integer _id,String _valor){
        this.valor = _valor;
        this.id = _id;
    }
    
    public ComboOption(){
        this.valor = "";
        this.id = -1;
    }

    public String Valor() {
        return valor;
    }

    public void Valor(String valor) {
        this.valor = valor;
    }

    public Integer Id() {
        return id;
    }

    public void Id(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return valor;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj != null) ? obj.toString().equals(this.toString()) : false;
    }
    
    
    
}
