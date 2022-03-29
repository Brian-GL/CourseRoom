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
public class SesionesModel {
    
    private Integer id_Sesion;
    private String dispositivo, fabricante, uuid, ultima_Conexion, direccion_Ip, estatus;

    public SesionesModel(Integer id_Sesion, String dispositivo, String fabricante, String uuid, String ultima_Conexion, String direccion_Ip, String estatus) {
        this.id_Sesion = id_Sesion;
        this.dispositivo = dispositivo;
        this.fabricante = fabricante;
        this.uuid = uuid;
        this.ultima_Conexion = ultima_Conexion;
        this.direccion_Ip = direccion_Ip;
        this.estatus = estatus;
    }

    public SesionesModel() {
        this.id_Sesion = -1;
        this.dispositivo = 
        this.uuid = 
        this.ultima_Conexion = 
        this.direccion_Ip = 
        this.estatus = new String();
    }

    public Integer getId_Sesion() {
        return id_Sesion;
    }

    public void setId_Sesion(Integer id_Sesion) {
        this.id_Sesion = id_Sesion;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUltima_Conexion() {
        return ultima_Conexion;
    }

    public void setUltima_Conexion(String ultima_Conexion) {
        this.ultima_Conexion = ultima_Conexion;
    }

    public String getDireccion_Ip() {
        return direccion_Ip;
    }

    public void setDireccion_Ip(String direccion_Ip) {
        this.direccion_Ip = direccion_Ip;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    
    
}
