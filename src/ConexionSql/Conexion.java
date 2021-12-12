package ConexionSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.CourseRoom_Frame;

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
            JOptionPane.showMessageDialog(CourseRoom_Frame.getFrames()[0], "Hubo Un Problema Al Intentar Conectarse A La Base De Datos");
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