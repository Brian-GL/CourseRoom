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
import modelos.ArchivosCompartidosGrupoModel;
import modelos.ArchivosTareaModel;
import modelos.AvisosModel;
import modelos.ChatsPersonalesModel;
import modelos.ConfiguracionesModel;
import modelos.DatosGeneralesCursoModel;
import modelos.DatosGeneralesGrupoModel;
import modelos.DatosGeneralesPreguntaModel;
import modelos.DatosGeneralesTareaModel;
import modelos.DatosGeneralesTareaPendienteModel;
import modelos.DatosPerfilChatPersonalModel;
import modelos.DatosPerfilModel;
import modelos.DesempenoUsuarioModel;
import modelos.GruposModel;
import modelos.PreguntasModel;
import modelos.SesionesModel;
import modelos.TareasEstudianteModel;
import modelos.TareasPendientesGrupoModel;
import modelos.MensajesModel;
import modelos.MiembrosGrupoModel;
import modelos.PreguntasModel;
import modelos.RetroalimentacionesTareaModel;
import modelos.SesionesModel;
import modelos.TareasEstudianteModel;
import modelos.TareasMesModel;
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
    
    public Lista<GruposModel> Buscar_Grupos(String busqueda, int id_Usuario){
        Lista<GruposModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(busqueda));
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Buscar_Grupos", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                GruposModel gruposModel;
                int id_Grupo, id_Curso;
                String nombre, nombre_Curso, fecha_Creacion;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Grupo = (int) fila.remove(0);
                    nombre = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    id_Curso = (int) fila.remove(0);
                    nombre_Curso = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Creacion = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    gruposModel = new GruposModel(id_Grupo, id_Curso, nombre, nombre_Curso, fecha_Creacion);
                    
                    response.push_back(gruposModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<PreguntasModel> Buscar_Preguntas(String busqueda){
        Lista<PreguntasModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(busqueda));
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Buscar_Preguntas", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                PreguntasModel preguntasModel;
                int id_Pregunta;
                String nombre_Completo, pregunta, descripcion, fecha_Creacion, estatus;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Pregunta = (int) fila.remove(0);
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    pregunta = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Creacion = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    estatus = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    preguntasModel = new PreguntasModel(id_Pregunta, nombre_Completo, pregunta, fecha_Creacion, estatus);
                    
                    response.push_back(preguntasModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<TareasEstudianteModel> Buscar_Tareas(String busqueda, int id_Usuario){
        Lista<TareasEstudianteModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(busqueda));
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Buscar_Tareas", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                TareasEstudianteModel tareasEstudianteModel;
                int id_Tarea, id_Curso;
                String nombre, nombre_Curso, fecha_Creacion, fecha_Entrega, estatus;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Tarea = (int) fila.remove(0);
                    nombre = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    id_Curso = (int)fila.remove(0);
                    nombre_Curso = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Creacion = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Entrega = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    estatus = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    tareasEstudianteModel = new TareasEstudianteModel(id_Tarea, id_Curso, nombre, nombre_Curso, fecha_Creacion, fecha_Entrega, estatus);
                            
                    
                    response.push_back(tareasEstudianteModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
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
    
    public ArchivoModel Obtener_Archivo_Adjunto_Tarea(int id_Archivo_Adjunto){
        ArchivoModel archivoModel = new ArchivoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Archivo_Adjunto);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivo_Adjunto_Tarea", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size() == 3){
                   
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
    
    public Lista<ArchivosTareaModel> Obtener_Archivos_Adjuntos_Tarea(int id_Tarea){
        Lista<ArchivosTareaModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Tarea);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivos_Adjuntos_Tarea", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                ArchivosTareaModel archivosTareaModel;
                int id_Archivo_Tarea;
                String nombre_Archivo, extension, fecha_Enviado;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Archivo_Tarea = (int) fila.remove(0);
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Enviado = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    archivosTareaModel = new ArchivosTareaModel(id_Archivo_Tarea, nombre_Archivo, extension, fecha_Enviado);
                    
                    response.push_back(archivosTareaModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<ArchivosCompartidosGrupoModel> Obtener_Archivos_Compartidos_Grupo(int id_Grupo){
        Lista<ArchivosCompartidosGrupoModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Grupo);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivos_Compartidos_Grupo", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                ArchivosCompartidosGrupoModel archivosCompartidosGrupoModel;
                int id_Archivo_Compartido;
                String nombre_Archivo, extension, fecha_Enviado, nombre_Completo;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Archivo_Compartido = (int) fila.remove(0);
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Enviado = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    archivosCompartidosGrupoModel = new ArchivosCompartidosGrupoModel(id_Archivo_Compartido, nombre_Archivo, extension, fecha_Enviado, nombre_Completo);
                    
                    response.push_back(archivosCompartidosGrupoModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<ArchivosTareaModel> Obtener_Archivos_Subidos_Tarea(int id_Tarea,int id_Usuario){
        Lista<ArchivosTareaModel> response = new Lista<>();
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Tarea);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Archivos_Subidos_Tarea", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                ArchivosTareaModel archivosTareaModel;
                int id_Archivo_Tarea;
                String nombre_Archivo, extension, fecha_Enviado;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Archivo_Tarea = (int) fila.remove(0);
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Enviado = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                                        
                    archivosTareaModel = new ArchivosTareaModel(id_Archivo_Tarea, nombre_Archivo, extension, fecha_Enviado);
                    
                    response.push_back(archivosTareaModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
                
        return response;
    }

    public Lista<AvisosModel> Obtener_Avisos(int id_Usuario){
        Lista <AvisosModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Avisos", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                AvisosModel avisosModel;
                int id_Aviso;
                String tipo_Aviso, aviso, fecha_Envio;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Aviso = (int) fila.remove(0);
                    tipo_Aviso = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    aviso = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Envio = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                                        
                    avisosModel = new AvisosModel(id_Aviso, tipo_Aviso, aviso, fecha_Envio);
                    
                    response.push_back(avisosModel);
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
                    valor = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    valor1 = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    valor2 = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    chatsPersonalesModel = new ChatsPersonalesModel(id, valor2, valor, valor1);
                    
                    response.push_back(chatsPersonalesModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
        
    }

    public ConfiguracionesModel Obtener_Configuraciones(int id_Usuario){
        ConfiguracionesModel configuracionesModel = new ConfiguracionesModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Configuraciones", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 2){
                   
                    configuracionesModel.Chats_Conmigo((boolean)resultado.remove(0));
                    configuracionesModel.Avisos_Activos((boolean)resultado.remove(0));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return configuracionesModel;
    }
    
    public ComboOption Obtener_Datos_Generales_Chat_Personal(int id_Chat, int id_Usuario){
        ComboOption comboOption = new ComboOption();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Chat);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Datos_Generales_Chat_Personal", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 2){
                   
                    comboOption.Id((int)resultado.remove(0));
                    comboOption.Valor(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return comboOption;
    }
    
    public DatosGeneralesCursoModel Obtener_Datos_Generales_Curso(int id_Curso){
        DatosGeneralesCursoModel datosGeneralesCursoModel = new DatosGeneralesCursoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Curso);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Datos_Generales_Curso", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 5){
                   
                    datosGeneralesCursoModel.Nombre(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesCursoModel.Descripcion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesCursoModel.Nombre_Completo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesCursoModel.Descripcion_Profesor(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesCursoModel.Fecha_Creacion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return datosGeneralesCursoModel;
    }
    
    public DatosGeneralesGrupoModel Obtener_Datos_Generales_Grupo(int id_Grupo){
        DatosGeneralesGrupoModel datosGeneralesGrupoModel = new DatosGeneralesGrupoModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Grupo);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Datos_Generales_Curso", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 5){
                   
                    datosGeneralesGrupoModel.Nombre(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesGrupoModel.Descripcion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesGrupoModel.Fecha_Creacion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesGrupoModel.Id_Grupo((int)resultado.remove(0));
                    datosGeneralesGrupoModel.Nombre_Curso(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return datosGeneralesGrupoModel;
    }
    
    public DatosGeneralesPreguntaModel Obtener_Datos_Generales_Pregunta(int id_Pregunta){
        DatosGeneralesPreguntaModel datosGeneralesPreguntaModel = new DatosGeneralesPreguntaModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Pregunta);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Datos_Generales_Pregunta", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 6){
                   
                    datosGeneralesPreguntaModel.Id_Usuario((int)resultado.remove(0));
                    datosGeneralesPreguntaModel.Nombre_Completo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesPreguntaModel.Pregunta(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesPreguntaModel.Descripcion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesPreguntaModel.Fecha_Creacion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesPreguntaModel.Estatus(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return datosGeneralesPreguntaModel;
    }
    
    public DatosGeneralesTareaModel Obtener_Datos_Generales_Tarea(int id_Tarea, int id_Usuario){
        DatosGeneralesTareaModel datosGeneralesTareaModel = new DatosGeneralesTareaModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Tarea);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Datos_Generales_Tarea", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 5){
                   
                    datosGeneralesTareaModel.Nombre(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesTareaModel.Descripcion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesTareaModel.Fecha_Creacion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesTareaModel.Fecha_Entrega(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesTareaModel.Tarea_Grupal((boolean)resultado.remove(0));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return datosGeneralesTareaModel;
    }
    
    public DatosGeneralesTareaPendienteModel Obtener_Datos_Generales_Tarea_Pendiente(int id_Tarea_Pendiente, int id_Usuario){
        DatosGeneralesTareaPendienteModel datosGeneralesTareaPendienteModel = new DatosGeneralesTareaPendienteModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Tarea_Pendiente);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Datos_Generales_Tarea_Pendiente", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 7){
                   
                    datosGeneralesTareaPendienteModel.Nombre(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesTareaPendienteModel.Descripcion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesTareaPendienteModel.Fecha_Creacion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesTareaPendienteModel.Fecha_Finalizacion(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesTareaPendienteModel.Estatus(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosGeneralesTareaPendienteModel.Id_Usuario((int)resultado.remove(0));
                    datosGeneralesTareaPendienteModel.Nombre_Completo(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return datosGeneralesTareaPendienteModel;
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
     
    public DatosPerfilChatPersonalModel Obtener_Datos_Perfil_Chat_Personal(int id_Usuario){
        DatosPerfilChatPersonalModel datosPerfilChatPersonalModel = new DatosPerfilChatPersonalModel();
        
        try {

            Vector parametros = new Vector();

            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());

            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Datos_Perfil_Chat_Personal", parametros);

            if(respuesta != null){

               Vector<Object> resultado  = (Vector<Object>)respuesta;

               if(resultado.size()== 6){
                   
                    datosPerfilChatPersonalModel.Nombre(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilChatPersonalModel.Paterno(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilChatPersonalModel.Materno(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilChatPersonalModel.Correo_Electronico(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilChatPersonalModel.Genero(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                    datosPerfilChatPersonalModel.Tipo_Usuario(CourseRoom.Utilerias().Decodificacion((String)resultado.remove(0)));
                }
               
           }

        } catch (XmlRpcException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        return datosPerfilChatPersonalModel;
    }

    public Lista<DesempenoUsuarioModel> Obtener_Desempeno_Usuario(int id_Usuario){
        
        Lista<DesempenoUsuarioModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Desempeno_Usuario", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                DesempenoUsuarioModel desempenoUsuarioModel;
                int id_Desempeno, numero_Tareas_Calificadas, id_Curso;
                double prediccion, promedio_General;
                String rumbo_Estatus, nombre;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Desempeno = (int) fila.remove(0);
                    prediccion = (double)fila.remove(0);
                    numero_Tareas_Calificadas = (int)fila.remove(0);
                    rumbo_Estatus = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    id_Curso = (int)fila.remove(0);
                    nombre = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    promedio_General = (double)fila.remove(0);
                    
                    desempenoUsuarioModel = new DesempenoUsuarioModel(id_Desempeno, numero_Tareas_Calificadas, id_Curso, prediccion, promedio_General, rumbo_Estatus, nombre);
                    
                    response.push_back(desempenoUsuarioModel);
                }
                
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

    public Lista<GruposModel> Obtener_Grupos(int id_Usuario){
        Lista<GruposModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Grupos", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                GruposModel gruposModel;
                int id_Grupo, id_Curso;
                String nombre, nombre_Curso, fecha_Creacion;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Grupo = (int) fila.remove(0);
                    nombre = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    id_Curso = (int) fila.remove(0);
                    nombre_Curso = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Creacion = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                                        
                    gruposModel = new GruposModel(id_Grupo, id_Curso, nombre, nombre_Curso, fecha_Creacion);
                    
                    response.push_back(gruposModel);
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
    
    public byte[] Obtener_Imagen_Curso(int id_Curso){
        
        byte[] response;

        try {
            Vector parametros = new Vector();
            
            parametros.add(id_Curso);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Imagen_Curso", parametros);
            
            response =  (respuesta != null) ? (byte[])respuesta : new byte[]{};
        } catch (XmlRpcException | IOException ex) {
            response = new byte[]{};
        }
        
        return response;
    }
    
    public byte[] Obtener_Imagen_Grupo(int id_Grupo){
        
        byte[] response;

        try {
            Vector parametros = new Vector();
            
            parametros.add(id_Grupo);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Imagen_Grupo", parametros);
            
            response =  (respuesta != null) ? (byte[])respuesta : new byte[]{};
        } catch (XmlRpcException | IOException ex) {
            response = new byte[]{};
        }
        
        return response;
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
     
    public byte[] Obtener_Imagen_Pregunta(int id_Pregunta){
        
        byte[] response;

        try {
            Vector parametros = new Vector();
            
            parametros.add(id_Pregunta);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Imagen_Pregunta", parametros);
            
            response =  (respuesta != null) ? (byte[])respuesta : new byte[]{};
        } catch (XmlRpcException | IOException ex) {
            response = new byte[]{};
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

    public Lista<ArchivosCompartidosGrupoModel> Obtener_Materiales_Subidos_Curso(int id_Curso){
        
        Lista<ArchivosCompartidosGrupoModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Curso);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Materiales_Subidos_Curso", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                ArchivosCompartidosGrupoModel archivosCompartidosGrupoModel;
                int id_Archivo_Compartido;
                String nombre_Archivo, extension, fecha_Enviado, nombre_Completo;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Archivo_Compartido = (int) fila.remove(0);
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Enviado = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    archivosCompartidosGrupoModel = new ArchivosCompartidosGrupoModel(id_Archivo_Compartido, nombre_Archivo, extension, fecha_Enviado, nombre_Completo);
                    
                    response.push_back(archivosCompartidosGrupoModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
        
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
    
    public Lista<MensajesModel> Obtener_Mensajes_Chat(int id_Chat){
        Lista<MensajesModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Chat);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Mensajes_Chat", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                MensajesModel mensajesModel;
                int id_Mensaje;
                String mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Mensaje = (int) fila.remove(0);
                    mensaje = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Envio = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    mensajesModel = new MensajesModel(id_Mensaje, mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension);
                    
                    response.push_back(mensajesModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<MensajesModel> Obtener_Mensajes_Curso(int id_Curso){
         Lista<MensajesModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Curso);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Mensajes_Curso", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                MensajesModel mensajesModel;
                int id_Mensaje;
                String mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Mensaje = (int) fila.remove(0);
                    mensaje = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Envio = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    mensajesModel = new MensajesModel(id_Mensaje, mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension);
                    
                    response.push_back(mensajesModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
     }
    
    public Lista<MensajesModel> Obtener_Mensajes_Grupo(int id_Grupo){
       Lista<MensajesModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Grupo);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Mensajes_Grupo", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                MensajesModel mensajesModel;
                int id_Mensaje;
                String mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Mensaje = (int) fila.remove(0);
                    mensaje = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Envio = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    mensajesModel = new MensajesModel(id_Mensaje, mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension);
                    
                    response.push_back(mensajesModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response; 
    }
    
    public Lista<MensajesModel> Obtener_Mensajes_Pregunta(int id_Pregunta){
        Lista<MensajesModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Pregunta);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Mensajes_Pregunta", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                MensajesModel mensajesModel;
                int id_Mensaje;
                String mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Mensaje = (int) fila.remove(0);
                    mensaje = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Envio = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    mensajesModel = new MensajesModel(id_Mensaje, mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension);
                    
                    response.push_back(mensajesModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<MensajesModel> Obtener_Mensajes_Tarea(int id_Tarea){
        Lista<MensajesModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Tarea);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Mensajes_Tarea", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                MensajesModel mensajesModel;
                int id_Mensaje;
                String mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Mensaje = (int) fila.remove(0);
                    mensaje = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Envio = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    mensajesModel = new MensajesModel(id_Mensaje, mensaje, fecha_Envio, nombre_Completo, nombre_Archivo, extension);
                    
                    response.push_back(mensajesModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<MiembrosGrupoModel> Obtener_Miembros_Grupo(int id_Grupo){
        Lista<MiembrosGrupoModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Grupo);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Miembros_Grupo", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                MiembrosGrupoModel miembrosGrupoModel;
                int id_Usuario;
                String nombre_Completo, fecha_Ingreso;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Usuario = (int) fila.remove(0);
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Ingreso = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    miembrosGrupoModel = new MiembrosGrupoModel(id_Grupo, nombre_Completo, fecha_Ingreso);
                    
                    response.push_back(miembrosGrupoModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<PreguntasModel> Obtener_Preguntas(int id_Usuario){
        Lista<PreguntasModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Preguntas", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                PreguntasModel preguntasModel;
                int id_Pregunta;
                String nombre_Completo, pregunta, descripcion, fecha_Creacion, estatus;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Pregunta = (int) fila.remove(0);
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    pregunta = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Creacion = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    estatus = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    preguntasModel = new PreguntasModel(id_Pregunta, nombre_Completo, pregunta, fecha_Creacion, estatus);
                    
                    response.push_back(preguntasModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<RetroalimentacionesTareaModel> Obtener_Retroalimentaciones_Tarea(int id_Tarea, int id_Usuario){
        Lista<RetroalimentacionesTareaModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Tarea);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Retroalimentaciones_Tarea", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                RetroalimentacionesTareaModel retroalimentacionesTareaModel;
                int id_Retroalimentacion;
                String retroalimentacion, fecha_Envio, nombre_Archivo, extension;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Retroalimentacion = (int) fila.remove(0);
                    retroalimentacion = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Envio = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Archivo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    extension = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    retroalimentacionesTareaModel = new RetroalimentacionesTareaModel(id_Retroalimentacion, retroalimentacion, fecha_Envio, nombre_Archivo, extension);
                    
                    response.push_back(retroalimentacionesTareaModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
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
    
    public Lista<TareasEstudianteModel> Obtener_Tareas_Estudiante(int id_Usuario){
        Lista<TareasEstudianteModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Tareas_Estudiante", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                TareasEstudianteModel tareasEstudianteModel;
                int id_Tarea, id_Curso;
                String nombre, nombre_Curso, fecha_Creacion, fecha_Entrega, estatus;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Tarea = (int) fila.remove(0);
                    nombre = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    id_Curso = (int)fila.remove(0);
                    nombre_Curso = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Creacion = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    fecha_Entrega = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    estatus = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    tareasEstudianteModel = new TareasEstudianteModel(id_Tarea, id_Curso, nombre, nombre_Curso, fecha_Creacion, fecha_Entrega, estatus);
                    
                    response.push_back(tareasEstudianteModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
        
        return response;
    }
    
    public Lista<TareasMesModel> Obtener_Tareas_Mes(int mes, int id_Usuario){
        Lista <TareasMesModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(mes);
            parametros.add(id_Usuario);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Tareas_Mes", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                TareasMesModel tareasMesModel;
                int id_Tarea;
                String dia, horario, descripcion;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Tarea = (int) fila.remove(0);
                    dia = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    horario = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    descripcion = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                                        
                    tareasMesModel = new TareasMesModel(id_Tarea, dia, horario, descripcion);
                    
                    response.push_back(tareasMesModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
        }
                
        return response;
    }
    
    public Lista<TareasPendientesGrupoModel> Obtener_Tareas_Pendientes_Grupo(int id_Grupo){
        Lista<TareasPendientesGrupoModel> response = new Lista<>();
        
        try {
            Vector<Object> parametros = new Vector<>();
            
            parametros.add(id_Grupo);
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Tareas_Pendientes_Grupo", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                TareasPendientesGrupoModel tareasPendientesGrupoModel;
                int id_Tarea_Pendiente;
                String nombre, nombre_Completo, estatus;
                Vector<Object> fila;
                while(!resultado.isEmpty()){
                    
                    fila = resultado.remove(0);
                    
                    id_Tarea_Pendiente = (int) fila.remove(0);
                    nombre = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    nombre_Completo = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    estatus = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    
                    tareasPendientesGrupoModel = new TareasPendientesGrupoModel(id_Tarea_Pendiente, nombre, nombre_Completo, estatus);
                    
                    response.push_back(tareasPendientesGrupoModel);
                }
                
            }
            
        } catch (XmlRpcException | IOException ex) {
            
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

    public Lista<ComboOption> Obtener_Usuarios_Chatear(String busqueda){
        Lista<ComboOption> response = new Lista<>();
        
        try {
            
            Vector parametros = new Vector();
            
            parametros.add(CourseRoom.Utilerias().Codificacion(busqueda));
            parametros.add(CourseRoom.Utilerias().MiUidd());
            parametros.add(CourseRoom.Utilerias().MiIP());
            
            Object respuesta = xmlRpcClient.execute("CourseRoom_Server.Obtener_Usuarios_Chatear", parametros);
            
            if(respuesta != null){
                
                Vector<Vector<Object>> resultado = (Vector<Vector<Object>>) respuesta;
                
                Vector<Object> fila;
                ComboOption comboOption;
                Integer id_Usuario;
                String nombre_Usuario;
                while(!resultado.isEmpty()){
                    fila = resultado.remove(0);
                    id_Usuario = (Integer)fila.remove(0);
                    nombre_Usuario = CourseRoom.Utilerias().Decodificacion((String)fila.remove(0));
                    comboOption = new ComboOption(id_Usuario,nombre_Usuario);
                    response.push_back(comboOption);
                }
            }

        } catch (XmlRpcException | IOException ex) {
            
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
    
}
