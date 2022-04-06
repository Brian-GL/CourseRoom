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
public class ConfiguracionesModel {
    private boolean chats_Conmigo, avisos_Activos;

    public ConfiguracionesModel(boolean chats_Conmigo, boolean avisos_Activos) {
        this.chats_Conmigo = chats_Conmigo;
        this.avisos_Activos = avisos_Activos;
    }

    public ConfiguracionesModel() {
        this.chats_Conmigo = this.avisos_Activos = false;
    }

    public boolean Chats_Conmigo() {
        return chats_Conmigo;
    }

    public void Chats_Conmigo(boolean chats_Conmigo) {
        this.chats_Conmigo = chats_Conmigo;
    }

    public boolean Avisos_Activos() {
        return avisos_Activos;
    }

    public void Avisos_Activos(boolean avisos_Activos) {
        this.avisos_Activos = avisos_Activos;
    }

      
}
