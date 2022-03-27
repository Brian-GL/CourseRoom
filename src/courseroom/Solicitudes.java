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

import clases.ComboOption;
import datos.colecciones.Lista;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Vector;
import javax.swing.JOptionPane;
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
            xmlRpcClient = new XmlRpcClient("http://localhost:6060/RPC2");
        } catch(MalformedURLException ex){
            JOptionPane.showMessageDialog(CourseRoom_Frame.getInstance(), ex.getMessage(), "Error Al Conectarse Al Servidor De CourseRoom", JOptionPane.ERROR_MESSAGE);
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

        parametros.add(CourseRoom.Utilerias().MiUidd());
        parametros.add(CourseRoom.Utilerias().MiIP());

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Fecha_Hora_Servidor", parametros);

        return (respuesta != null)? (Vector<Integer>) respuesta : new Vector<>();
    }

    public byte[] Imagen_Inicio_Sesion() throws XmlRpcException, IOException{

        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().MiUidd());
        parametros.add(CourseRoom.Utilerias().MiIP());

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Imagen_Inicio_Sesion", parametros);

        return (respuesta != null)? (byte[]) respuesta : new byte[]{};
    }

    public Boolean Recuperar_Credenciales(String correo_Electronico) throws XmlRpcException, IOException{

        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().Codificacion(correo_Electronico));
        parametros.add(CourseRoom.Utilerias().MiUidd());
        parametros.add(CourseRoom.Utilerias().MiIP());

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Recuperar_Credenciales", parametros);

        return (respuesta != null)? (Boolean) respuesta : false;
    }

    public Lista<String> Obtener_Estados() throws XmlRpcException, IOException {

        Lista<String> response = new Lista<>();
        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().MiUidd());
        parametros.add(CourseRoom.Utilerias().MiIP());

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Estados", parametros);

        if(respuesta != null){

            Vector<String> resultado = (Vector<String>) respuesta;
            
            String estado;
            while(!resultado.isEmpty()){
                estado = resultado.remove(0);
                estado = CourseRoom.Utilerias().Decodificacion(estado);
                response.push_back(estado);
            }
        }
        
        return response;

    }

    public Lista<ComboOption> Obtener_Localidades_Por_Estado(String estado) throws XmlRpcException, IOException {

        Lista<ComboOption> response = new Lista<>();
        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().Codificacion(estado));
        parametros.add(CourseRoom.Utilerias().MiUidd());
        parametros.add(CourseRoom.Utilerias().MiIP());

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Localidades_Por_Estado", parametros);

        if(respuesta != null){

            Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
            
            Vector<Object> fila;
            ComboOption comboOption;
            Integer id_Localidad;
            String localidad;
            while(!resultado.isEmpty()){
                fila = resultado.remove(0);
                id_Localidad = (Integer)fila.remove(0);
                localidad = (String)fila.remove(0);
                localidad = CourseRoom.Utilerias().Decodificacion(localidad);
                comboOption = new ComboOption(id_Localidad,localidad);
                response.push_back(comboOption);
            }

        }
        
        return response;
    }

    public Vector<Object> Agregar_Nuevo_Usuario(String correo_Electronico, String contrasenia ,String nombre,
        String paterno, String materno, int id_Localidad, String genero, String fecha_Nacimiento, String tipo_Usuario,
        byte[] imagen_Codificada, double promedio_General,String descripcion) throws XmlRpcException, IOException{

        Vector parametros = new Vector();

        parametros.add(CourseRoom.Utilerias().Codificacion(correo_Electronico));
        parametros.add(CourseRoom.Utilerias().Codificacion(contrasenia));
        parametros.add(CourseRoom.Utilerias().Codificacion(nombre));
        parametros.add(CourseRoom.Utilerias().Codificacion(paterno)); 
        parametros.add(CourseRoom.Utilerias().Codificacion(materno));
        parametros.add(id_Localidad);
        parametros.add(CourseRoom.Utilerias().Codificacion(genero));
        parametros.add(CourseRoom.Utilerias().Codificacion(fecha_Nacimiento));
        parametros.add(CourseRoom.Utilerias().Codificacion(tipo_Usuario));
        parametros.add(imagen_Codificada);
        parametros.add(promedio_General);
        parametros.add(CourseRoom.Utilerias().Codificacion(descripcion));
        parametros.add(CourseRoom.Utilerias().MiUidd());
        parametros.add(CourseRoom.Utilerias().MiIP());

        Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Agregar_Nuevo_Usuario", parametros);

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
