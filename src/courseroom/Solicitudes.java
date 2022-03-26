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
package courseroom;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Vector;
import org.apache.xmlrpc.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;

/**
 *
 * @author LENOVO
 */
public class Solicitudes {
    
    private XmlRpcClient xmlRpcClient;
    
    private Solicitudes() {
        try{
            xmlRpcClient = new XmlRpcClient("http://localhost:3030/RPC2");
        } catch(MalformedURLException ex){
            
        }
    }
    
    public static Solicitudes getInstance() {
        return SolicitudHolder.INSTANCE;
    }
    
    private static class SolicitudHolder {

        private static final Solicitudes INSTANCE = new Solicitudes();
    }
    
    public Vector<Integer> Fecha_Hora_Servidor() throws XmlRpcException, IOException {

        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().Codificacion(CourseRoom.Utilerias().getComputerSystem().getHardwareUUID()));

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Fecha_Hora_Servidor", parametros);

        return (respuesta != null)? (Vector<Integer>) respuesta : new Vector<>();
    }

    public byte[] Imagen_Inicio_Sesion() throws XmlRpcException, IOException{

        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().Codificacion(CourseRoom.Utilerias().getComputerSystem().getHardwareUUID()));

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Imagen_Inicio_Sesion", parametros);

        return (respuesta != null)? (byte[]) respuesta : new byte[]{};
    }

    public Boolean Recuperar_Credenciales(String correo_Electronico) throws XmlRpcException, IOException{

        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().Codificacion(correo_Electronico));
        parametros.add(CourseRoom.Utilerias().Codificacion(CourseRoom.Utilerias().getComputerSystem().getHardwareUUID()));

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Recuperar_Credenciales", parametros);

        return (respuesta != null)? (Boolean) respuesta : false;
    }

    public Vector<String> Obtener_Estados() throws XmlRpcException, IOException {

        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().Codificacion(CourseRoom.Utilerias().getComputerSystem().getHardwareUUID()));

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Estados", parametros);

        if(respuesta != null){

            Vector<String> response = new Vector<>();

            while(!((Vector<String>)respuesta).isEmpty()){
                response.add(CourseRoom.Utilerias().Decodificacion(((Vector<String>)respuesta).remove(0)));
            }

            return response;

        }else{
            return new Vector<>();
        }

    }

    public Vector<String> Obtener_Localidades_Por_Estado(String estado) throws XmlRpcException, IOException {

        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().Codificacion(estado));
        parametros.add(CourseRoom.Utilerias().Codificacion(CourseRoom.Utilerias().getComputerSystem().getHardwareUUID()));

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Localidades_Por_Estado", parametros);

        if(respuesta != null){

            Vector<String> response = new Vector<>();

            while(!((Vector<String>)respuesta).isEmpty()){
                response.add(CourseRoom.Utilerias().Decodificacion(((Vector<String>)respuesta).remove(0)));
            }

            return response;

        }else{
            return new Vector<>();
        }
    }

    public Vector<Object> Agregar_Usuario(String CorreoElectronico,String Contrasenia ,String Nombre,
        String Paterno,String Materno,String Genero, String Estado, String Localidad, String FechaNacimiento,
        Float PromedioGeneral,String TipoUsuario,String Descripcion, byte[] Imagen) throws XmlRpcException, IOException{

        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().Codificacion(CorreoElectronico));
        parametros.add(CourseRoom.Utilerias().Codificacion(Contrasenia));
        parametros.add(CourseRoom.Utilerias().Codificacion(Nombre));
        parametros.add(CourseRoom.Utilerias().Codificacion(Paterno)); 
        parametros.add(CourseRoom.Utilerias().Codificacion(Materno));
        parametros.add(CourseRoom.Utilerias().Codificacion(Genero));
        parametros.add(CourseRoom.Utilerias().Codificacion(Estado));
        parametros.add(CourseRoom.Utilerias().Codificacion(Localidad));
        parametros.add(PromedioGeneral);
        parametros.add(CourseRoom.Utilerias().Codificacion(TipoUsuario));
        parametros.add(CourseRoom.Utilerias().Codificacion(Descripcion));
        parametros.add(Imagen);
        parametros.add(CourseRoom.Utilerias().Codificacion(CourseRoom.Utilerias().getComputerSystem().getHardwareUUID()));

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Agregar_Usuario", parametros);

        if(respuesta != null){

            Vector<Object> response = new Vector<>();

            response.add(((Vector<String>)respuesta).remove(0));
            response.add( CourseRoom.Utilerias().Decodificacion(((Vector<String>)respuesta).remove(0)));

            return response;

        }else{
            return new Vector<>();
        }
    }
}
