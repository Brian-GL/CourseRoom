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
import datos.estructuras.Par;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelos.DatosPerfilModel;
import modelos.SesionesModel;
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
            xmlRpcClient = new XmlRpcClient("http://localhost:9000/RPC2");
        } catch(MalformedURLException ex){
            JOptionPane.showMessageDialog(CourseRoom_Frame.getInstance(), ex.getMessage(), "Error Al Conectarse Al Servidor De CourseRoom", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
    public static Solicitudes getInstance() {
        return SolicitudHolder.INSTANCE;
    }
    
    private static class SolicitudHolder {

        private static final Solicitudes INSTANCE = new Solicitudes();
    }
    
    public Vector<Integer> Fecha_Hora_Servidor(){
        
        Vector<Integer> response = new Vector<>();

        try {
            
            Vector parametros = new Vector();
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Fecha_Hora_Servidor", parametros);
            
            if(respuesta != null){
                response = (Vector<Integer>)respuesta;
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
        
    }

    public byte[] Imagen_Inicio_Sesion(){
        
        byte[] response;

        try {
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Imagen_Inicio_Sesion", parametros);
            
            response =  (respuesta != null) ? (byte[])respuesta : new byte[]{};
        } catch (XmlRpcException | IOException ex) {
            response = new byte[]{};
        }
        
        return response;
    }

    public Boolean Recuperar_Credenciales(String correo_Electronico) {
        
        Boolean response = Boolean.FALSE;

        try {
            Vector parametros = new Vector();
            correo_Electronico = correo_Electronico.toUpperCase();
            parametros.add(CourseRoom.Utilerias().Codificacion(correo_Electronico));
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Recuperar_Credenciales", parametros);
            
            if(respuesta != null){
                response = (Boolean) respuesta;
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
        
    }

    public Lista<String> Obtener_Estados(){
        
        Lista<String> response = new Lista<>();

        try {
            
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Estados", parametros);
            
            if(respuesta != null){
                
                Vector<String> resultado = (Vector<String>) respuesta;
                
                String estado;
                while(!resultado.isEmpty()){
                    estado = CourseRoom.Utilerias().Decodificacion(resultado.remove(0));
                    response.push_back(estado);
                }
            }
            
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;

    }

    public Lista<ComboOption> Obtener_Localidades_Por_Estado(String estado){

        Lista<ComboOption> response = new Lista<>();
        
        try {
            
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
                    localidad = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    comboOption = new ComboOption(id_Localidad,localidad);
                    response.push_back(comboOption);
                }
            }

        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }

    public Par<Integer, String> Agregar_Usuario(String correo_Electronico, String contrasenia ,String nombre,
        String paterno, String materno, int id_Localidad, String genero, String fecha_Nacimiento, String tipo_Usuario,
        byte[] imagen_Codificada, double promedio_General,String descripcion){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
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
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Agregar_Usuario", parametros);
            
            if(respuesta != null){
                
                Vector<Object> resultado  = (Vector<Object>)respuesta;
                
                response.first((Integer)resultado.remove(0));
                response.second(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                
            }else{
                response.first(-1);
                response.second("No Se Obtuvo Una Respuesta");
            }
            
        } catch (XmlRpcException | IOException ex) {
            response.first(-1);
            response.second(ex.getMessage());
        }
        
        return response;
    }

    public Par<Integer, String> Obtener_Usuario(String correo_Electronico, String contrasenia){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            correo_Electronico = correo_Electronico.toUpperCase();
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(correo_Electronico));
            parametros.add(CourseRoom.Utilerias().Codificacion(contrasenia));
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Usuario", parametros);
            
            if(respuesta != null){
                
                Vector<Object> resultado  = (Vector<Object>)respuesta;
                
                response.first((Integer)resultado.remove(0));
                response.second(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                
            }else{
                response.first(-1);
                response.second("No Se Obtuvo Una Respuesta");
            }
            
        } catch (XmlRpcException | IOException ex) {
            response.first(-1);
            response.second(ex.getMessage());
        }
        
        return response;
    }

    public Par<Integer, String> Agregar_Sesion(int id_Usuario){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().Codificacion(System.getProperty("os.name")));
            parametros.add(CourseRoom.Utilerias().Codificacion(CourseRoom.Utilerias().getComputerSystem().getManufacturer()));
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Agregar_Sesion", parametros);
            
            if(respuesta != null){
                
                Vector<Object> resultado  = (Vector<Object>)respuesta;
                
                response.first((Integer)resultado.remove(0));
                response.second(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                
            }else{
                response.first(-1);
                response.second("No Se Obtuvo Una Respuesta");
            }
            
        } catch (XmlRpcException | IOException ex) {
            response.first(-1);
            response.second(ex.getMessage());
        }
        
        return response;
    }
    
     public DatosPerfilModel Obtener_Datos_Perfil(int id_Usuario){
        DatosPerfilModel datosPerfilModel = new DatosPerfilModel();
        try {

            Vector parametros = new Vector();

            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Datos_Perfil", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 13){
                   
                    datosPerfilModel.setNombre(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setPaterno(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setMaterno(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setCorreo_Electronico(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setGenero(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setTipo_Usuario(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setFecha_Nacimiento(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setDescripcion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setLocalidad(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setEstado(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setPromedio_General((double)resultado.remove(0));
                    datosPerfilModel.setFecha_Creacion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.setContrasenia((String)resultado.remove(0));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return datosPerfilModel;
    }
     
    public byte[] Obtener_Imagen_Perfil(Integer id_Usuario){
        
        byte[] response;

        try {
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Imagen_Perfil", parametros);
            
            response =  (respuesta != null) ? (byte[])respuesta : new byte[]{};
        } catch (XmlRpcException | IOException ex) {
            response = new byte[]{};
        }
        
        return response;
    }
     
    public Par<Integer, String> Actualizar_Imagen_Perfil(int id_Usuario, byte[] imagen_Codificada){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(imagen_Codificada);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Actualizar_Imagen_Perfil", parametros);
            
            if(respuesta != null){
                
                Vector<Object> resultado  = (Vector<Object>)respuesta;
                
                response.first((Integer)resultado.remove(0));
                response.second(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                
            }else{
                response.first(-1);
                response.second("No Se Obtuvo Una Respuesta");
            }
            
        } catch (XmlRpcException | IOException ex) {
            response.first(-1);
            response.second(ex.getMessage());
        }
        
        return response;
    }
     
    public Par<Integer, String> Cerrar_Sesion(int id_Usuario, int id_Sesion){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(id_Sesion);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Cerrar_Sesion", parametros);
            
            if(respuesta != null){
                
                Vector<Object> resultado  = (Vector<Object>)respuesta;
                
                response.first((Integer)resultado.remove(0));
                response.second(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                
            }else{
                response.first(-1);
                response.second("No Se Obtuvo Una Respuesta");
            }
            
        } catch (XmlRpcException | IOException ex) {
            response.first(-1);
            response.second(ex.getMessage());
        }
        
        return response;
    }
    
    public Lista<SesionesModel> Obtener_Sesiones_Usuario(int id_Usuario){

        Lista<SesionesModel> response = new Lista<>();
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Sesiones_Usuario", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                Vector<Object> fila;
                SesionesModel sesionesModel;
                Integer id_Sesion;
                String dispositivo, fabricante, uuid, ultima_Conexion, direccion_Ip, estatus;
                while(!resultado.isEmpty()){
                    fila = resultado.remove(0);
                    
                    id_Sesion = (Integer)fila.remove(0);
                    dispositivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fabricante = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    uuid = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    ultima_Conexion = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    direccion_Ip = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    estatus = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    sesionesModel = new SesionesModel(id_Sesion, dispositivo, fabricante, uuid, ultima_Conexion, direccion_Ip, estatus);
                    response.push_back(sesionesModel);
                }
            }

        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Par<Integer, String> Actualizar_Datos_Personales(int id_Usuario, String nombre, String paterno, 
            String materno, String genero, String fecha_Nacimiento, int id_Localidad){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().Codificacion(nombre));
            parametros.add(CourseRoom.Utilerias().Codificacion(paterno));
            parametros.add(CourseRoom.Utilerias().Codificacion(materno));
            parametros.add(CourseRoom.Utilerias().Codificacion(genero));
            parametros.add(CourseRoom.Utilerias().Codificacion(fecha_Nacimiento));
            parametros.add(id_Localidad);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Actualizar_Datos_Personales", parametros);
            
            if(respuesta != null){
                
                Vector<Object> resultado  = (Vector<Object>)respuesta;
                
                response.first((Integer)resultado.remove(0));
                response.second(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                
            }else{
                response.first(-1);
                response.second("No Se Obtuvo Una Respuesta");
            }
            
        } catch (XmlRpcException | IOException ex) {
            response.first(-1);
            response.second(ex.getMessage());
        }
        
        return response;
    }
    
}
