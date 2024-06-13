/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos.SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class Conexion_BD {
   private static String URL="jdbc:mysql://localhost/proyecto_abc";
    private static String Usuario= "root";
   private static String Contraseña="root";
    
    public static Connection conectar(){
        Connection conexion=null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(URL, Usuario, Contraseña);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion" + e);
        }
        
        return conexion;
        
    }
}
