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
import modelos.ArchivoModel;
import modelos.ChatsPersonalesModel;
import modelos.DatosPerfilModel;
import modelos.MensajesModel;
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
                   
                    datosPerfilModel.Nombre(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Paterno(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Materno(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Correo_Electronico(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Genero(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Tipo_Usuario(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Fecha_Nacimiento(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Descripcion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Localidad(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Estado(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Promedio_General((double)resultado.remove(0));
                    datosPerfilModel.Fecha_Creacion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilModel.Contrasenia((String)resultado.remove(0));
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
    
    public Lista<SesionesModel> Obtener_Sesiones(int id_Usuario){

        Lista<SesionesModel> response = new Lista<>();
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Sesiones", parametros);
            
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
    
    public Lista<ComboOption> Obtener_Tematicas(){

        Lista<ComboOption> response = new Lista<>();
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Tematicas", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                Vector<Object> fila;
                ComboOption comboOption;
                Integer id_Tematica;
                String tematica;
                while(!resultado.isEmpty()){
                    fila = resultado.remove(0);
                    id_Tematica = (Integer)fila.remove(0);
                    tematica = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    comboOption = new ComboOption(id_Tematica,tematica);
                    response.push_back(comboOption);
                }
            }

        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }

    public Par<Integer, String> Agregar_Interes(int id_Usuario, int id_Tematica){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(id_Tematica);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Agregar_Interes", parametros);
            
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
    
    public Lista<ComboOption> Obtener_Intereses_Usuario(int id_Usuario){

        Lista<ComboOption> response = new Lista<>();
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Intereses_Usuario", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                Vector<Object> fila;
                ComboOption comboOption;
                Integer id_Tematica;
                String tematica;
                while(!resultado.isEmpty()){
                    fila = resultado.remove(0);
                    id_Tematica = (Integer)fila.remove(0);
                    tematica = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    comboOption = new ComboOption(id_Tematica,tematica);
                    response.push_back(comboOption);
                }
            }

        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }

    public Lista<ChatsPersonalesModel> Obtener_Chats_Personales(int id_Usuario){
        
        Lista<ChatsPersonalesModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Chats_Personales", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                ChatsPersonalesModel chatsPersonalesModel;
                int id;
                String valor,valor1,valor2;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id = (int) fila.remove(0);
                    valor = (String)fila.remove(0);
                    valor1 = (String)fila.remove(0);
                    valor2 = (String)fila.remove(0);
                    
                    chatsPersonalesModel = new ChatsPersonalesModel(id, valor2, valor, valor1);
                    
                    response.push_back(chatsPersonalesModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
        
    }

    public byte[] Obtener_Imagen_Chat_Personal(int id_Chat, int id_Usuario){
        
        byte[] response;

        try {
            Vector parametros = new Vector();
            
            parametros.add(id_Chat);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Imagen_Chat_Personal", parametros);
            
            response =  (respuesta != null) ? (byte[])respuesta : new byte[]{};
        } catch (XmlRpcException | IOException ex) {
            response = new byte[]{};
        }
        
        return response;
    }
     
    public Lista<ChatsPersonalesModel> Buscar_Chats_Personales(String busqueda, int id_Usuario){
        
        Lista<ChatsPersonalesModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(busqueda));
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Buscar_Chats_Personales", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                ChatsPersonalesModel chatsPersonalesModel;
                int id;
                String valor,valor1,valor2;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id = (int) fila.remove(0);
                    valor = (String)fila.remove(0);
                    valor1 = (String)fila.remove(0);
                    valor2 = (String)fila.remove(0);
                    
                    chatsPersonalesModel = new ChatsPersonalesModel(id, valor2, valor, valor1);
                    
                    response.push_back(chatsPersonalesModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
        
    }

    public Par<Integer, String> Abandonar_Grupo(int id_Grupo, int id_Usuario){
        
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Grupo);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Abandonar_Grupo", parametros);
            
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
    
    public Par<Integer, String> Remover_Archivo_Compartido_Grupo(int id_Archivo_Compartido, int id_Usuario){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Archivo_Compartido);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Remover_Archivo_Compartido_Grupo", parametros);
            
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

    public Par<Integer, String> Remover_Archivo_Subido_Tarea(int id_Archivo_Subido, int id_Usuario){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Archivo_Subido);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Remover_Archivo_Subido_Tarea", parametros);
            
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
    
    public Par<Integer, String> Remover_Chat_Personal(int id_Chat, int id_Usuario){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Chat);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Remover_Chat_Personal", parametros);
            
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
    
    public Par<Integer, String> Remover_Interes_Usuario(int id_Tematica, int id_Usuario){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Tematica);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Remover_Interes_Usuario", parametros);
            
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
    
    public Par<Integer, String> Remover_Voto_Miembro_Grupo(int id_Grupo, int id_Usuario){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Grupo);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Remover_Voto_Miembro_Grupo", parametros);
            
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
    
    public Par<Integer, String> Remover_Pregunta(int id_Pregunta, int id_Usuario){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Pregunta);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Remover_Pregunta", parametros);
            
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
    
    public Par<Integer, String> Actualizar_Configuracion(int id_Usuario, boolean chats_Conmigo, 
            boolean avisos_Activo, boolean activo){
        
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(chats_Conmigo);
            parametros.add(avisos_Activo);
            parametros.add(activo);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Actualizar_Configuracion", parametros);
            
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

    public Par<Integer, String> Agregar_Tarea_Pendiente_Grupo(int id_Grupo, String nombre, 
            String descripcion, String fecha_Finalizacion, int id_Usuario_Cargo){
        
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Grupo);
            parametros.add(CourseRoom.Utilerias().Codificacion(nombre));
            parametros.add(CourseRoom.Utilerias().Codificacion(descripcion));
            parametros.add(CourseRoom.Utilerias().Codificacion(fecha_Finalizacion));
            parametros.add(id_Usuario_Cargo);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Agregar_Tarea_Pendiente_Grupo", parametros);
            
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

    public Par<Integer, String> Actualizar_Datos_Autenticacion(int id_Usuario, String correo_Electronico, String contrasenia){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().Codificacion(correo_Electronico));
            parametros.add(CourseRoom.Utilerias().Codificacion(contrasenia));
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Actualizar_Datos_Autenticacion", parametros);
            
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
    
    public Par<Integer, String> Actualizar_Datos_Generales_Grupo(int id_Grupo, String nombre, 
            String descripcion){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Grupo);
            parametros.add(CourseRoom.Utilerias().Codificacion(nombre));
            parametros.add(CourseRoom.Utilerias().Codificacion(descripcion));
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Actualizar_Datos_Generales_Grupo", parametros);
            
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
    
    public Par<Integer, String> Actualizar_Imagen_Curso(int id_Curso, byte[] imagen){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Curso);
            parametros.add(imagen);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Actualizar_Imagen_Curso", parametros);
            
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
    
    public Par<Integer, String> Actualizar_Imagen_Grupo(int id_Grupo, byte[] imagen){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Grupo);
            parametros.add(imagen);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Actualizar_Imagen_Grupo", parametros);
            
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
    
    public Par<Integer, String> Actualizar_Informacion_Extra(int id_Usuario, String tipo_Usuario, double promedio_General, 
            String descripcion){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().Codificacion(tipo_Usuario));
            parametros.add(promedio_General);
            parametros.add(descripcion);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Actualizar_Informacion_Extra", parametros);
            
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
    
    public Par<Integer, String> Agregar_Chat(int id_Usuario, int id_Usuario_Receptor){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(id_Usuario_Receptor);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Agregar_Chat", parametros);
            
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

    public Par<Integer, String> Agregar_Pregunta(int id_Usuario, String pregunta, String descripcion){
        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().Codificacion(pregunta));
            parametros.add(CourseRoom.Utilerias().Codificacion(descripcion));
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Agregar_Pregunta", parametros);
            
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
                
    public Par<Integer, String> Enviar_Archivo_Compartido_Grupo(int id_Grupo, int id_Usuario, String nombre_Archivo, byte[] archivo, String extension){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Grupo);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().Codificacion(nombre_Archivo));
            parametros.add(archivo);
            parametros.add(CourseRoom.Utilerias().Codificacion(extension));
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Enviar_Archivo_Compartido_Grupo", parametros);
            
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
            
    public Par<Integer, String> Enviar_Mensaje_Chat(String mensaje, byte[] archivo, String extension, int id_Usuario_Emisor, int id_Chat){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(mensaje));
            parametros.add(archivo);
            parametros.add(CourseRoom.Utilerias().Codificacion(extension));
            parametros.add(id_Usuario_Emisor);
            parametros.add(id_Chat);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Enviar_Mensaje_Chat", parametros);
            
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
    
    public Par<Integer, String> Enviar_Mensaje_Curso(String mensaje, byte[] archivo, String extension, int id_Usuario_Emisor, int id_Curso){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(mensaje));
            parametros.add(archivo);
            parametros.add(CourseRoom.Utilerias().Codificacion(extension));
            parametros.add(id_Usuario_Emisor);
            parametros.add(id_Curso);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Enviar_Mensaje_Curso", parametros);
            
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
    
    public Par<Integer, String> Enviar_Mensaje_Grupo(String mensaje, byte[] archivo, String extension, int id_Usuario_Emisor, int id_Grupo){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(mensaje));
            parametros.add(archivo);
            parametros.add(CourseRoom.Utilerias().Codificacion(extension));
            parametros.add(id_Usuario_Emisor);
            parametros.add(id_Grupo);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Enviar_Mensaje_Grupo", parametros);
            
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
    
    public Par<Integer, String> Enviar_Mensaje_Pregunta(String mensaje, byte[] archivo, String extension, int id_Usuario_Emisor, int id_Pregunta){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(mensaje));
            parametros.add(archivo);
            parametros.add(CourseRoom.Utilerias().Codificacion(extension));
            parametros.add(id_Usuario_Emisor);
            parametros.add(id_Pregunta);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Enviar_Mensaje_Pregunta", parametros);
            
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
    
    public Par<Integer, String> Enviar_Mensaje_Tarea(String mensaje, byte[] archivo, String extension, int id_Usuario_Emisor, int id_Tarea){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(mensaje));
            parametros.add(archivo);
            parametros.add(CourseRoom.Utilerias().Codificacion(extension));
            parametros.add(id_Usuario_Emisor);
            parametros.add(id_Tarea);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Enviar_Mensaje_Tarea", parametros);
            
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
    
    public Par<Integer, String> Marcar_Pregunta_Solucionada(int id_Usuario,int id_Pregunta){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Usuario);
            parametros.add(id_Pregunta);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Marcar_Pregunta_Solucionada", parametros);
            
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
    
    public Par<Integer, String> Cambiar_Estatus_Tarea_Pendiente(int id_Tarea_Pendiente, String nuevo_Estatus, int id_Usuario){

        Par<Integer, String> response = new Par<>(-1,"");
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(id_Tarea_Pendiente);
            parametros.add(CourseRoom.Utilerias().Codificacion(nuevo_Estatus));
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Cambiar_Estatus_Tarea_Pendiente", parametros);
            
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
    
    public ArchivoModel Obtener_Archivo_Subido_Tarea(int id_Archivo_Subido, int id_Usuario){
        
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Archivo_Subido);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivo_Subido_Tarea", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 3){
                   
                    archivoModel.Nombre_Archivo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    archivoModel.Archivo((byte[])resultado.remove(0));
                    archivoModel.Extension(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        
        return archivoModel;
        
    }
    
    public ArchivoModel Obtener_Archivo_Compartido_Grupo(int id_Archivo_Compartido){
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Archivo_Compartido);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivo_Compartido_Grupo", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 3){
                   
                    archivoModel.Nombre_Archivo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    archivoModel.Archivo((byte[])resultado.remove(0));
                    archivoModel.Extension(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
                
        return archivoModel;
    }
    
    public ArchivoModel Obtener_Archivo_Mensaje_Chat(int id_Mensaje){
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Mensaje);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivo_Mensaje_Chat", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 3){
                   
                    archivoModel.Nombre_Archivo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    archivoModel.Archivo((byte[])resultado.remove(0));
                    archivoModel.Extension(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
                
        return archivoModel;
    }
    
    public ArchivoModel Obtener_Archivo_Mensaje_Curso(int id_Mensaje){
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Mensaje);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivo_Mensaje_Curso", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 3){
                   
                    archivoModel.Nombre_Archivo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    archivoModel.Archivo((byte[])resultado.remove(0));
                    archivoModel.Extension(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
                
        return archivoModel;
    }
    
    public ArchivoModel Obtener_Archivo_Mensaje_Grupo(int id_Mensaje){
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Mensaje);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivo_Mensaje_Grupo", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 3){
                   
                    archivoModel.Nombre_Archivo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    archivoModel.Archivo((byte[])resultado.remove(0));
                    archivoModel.Extension(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
                
        return archivoModel;
    }
    
    public ArchivoModel Obtener_Archivo_Mensaje_Pregunta(int id_Mensaje){
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Mensaje);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivo_Mensaje_Pregunta", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 3){
                   
                    archivoModel.Nombre_Archivo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    archivoModel.Archivo((byte[])resultado.remove(0));
                    archivoModel.Extension(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return archivoModel;
    }
    
    public ArchivoModel Obtener_Archivo_Mensaje_Tarea(int id_Mensaje){
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Mensaje);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivo_Mensaje_Tarea", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 3){
                   
                    archivoModel.Nombre_Archivo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    archivoModel.Archivo((byte[])resultado.remove(0));
                    archivoModel.Extension(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return archivoModel;
    }    
    
    public ArchivoModel Obtener_Archivo_Retoalimentacion_Tarea(int id_Retroalimentacion){
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Retroalimentacion);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivo_Retoalimentacion_Tarea", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 3){
                   
                    archivoModel.Nombre_Archivo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    archivoModel.Archivo((byte[])resultado.remove(0));
                    archivoModel.Extension(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return archivoModel;
    }
    
    public ArchivoModel Obtener_Material_Subido_Curso(int id_Material_Subido){
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Material_Subido);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Material_Subido_Curso", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 3){
                   
                    archivoModel.Nombre_Archivo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    archivoModel.Archivo((byte[])resultado.remove(0));
                    archivoModel.Extension(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return archivoModel;
    }
    
}
