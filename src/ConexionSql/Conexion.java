package ConexionSql;

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
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
            JOptionPane.showMessageDialog(null, "Conexón Establecida");
            return conn;
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Hubo Un Problema Al Intentar Conectarse A La Base De Datos");
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