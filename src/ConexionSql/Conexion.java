package ConexionSql;

import datos.enumeraciones.Tipo_Mensaje_Dialog_Enum;
import dialogos.generales.Mensaje_Dialog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Conexion {
  
	 Connection conn = null;
    
    
    public static Connection ConnectDb(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "");
            JOptionPane.showMessageDialog(null, "Conexón Establecida");
            return conn;
        }catch (ClassNotFoundException | SQLException e){
            Mensaje_Dialog mensaje_Dialog = new Mensaje_Dialog( true,"Hubo Un Problema Al Intentar Conectarse A La Base De Datos",e.getMessage(),Tipo_Mensaje_Dialog_Enum.ADVERTENCIA);
            mensaje_Dialog.setVisible(true);
            return null;
        }
    }
   public void Desconectar() {  // este metodo hace el cierra a la base de datos cada vez que se hace una consulta o actulizacion 
	        try {
	            conn.close();
	        } catch (SQLException e) {
	        }

	    }

   
}