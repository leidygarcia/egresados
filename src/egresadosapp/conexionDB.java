
package egresadosapp;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTE6
 */
public class conexionDB {
    
    public java.sql.Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
    
      
      public Connection conexion(){
      
      try {
            final String Controlador = "com.mysql.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://localhost:3306/egresadosdb";
            conexion = DriverManager.getConnection(url_bd, "root", "");
            sentencia = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }
        return (Connection) conexion;
        
    }
}