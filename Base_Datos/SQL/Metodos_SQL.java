/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos.SQL;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Metodos_SQL {
    
    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;
    
    public void guardar_datos_alumno(int id, String nombre, String apellidoP, String apellidoM, String carrera ){
        try {
            conexion =Conexion_BD.conectar();
            String consulta="INSERT INTO datos_alumno(Id, Nombre, Apellido_paterno, Apellido_materno, Carrera) VALUES (?,?,?,?,?)";
            sentencia_preparada=conexion.prepareStatement(consulta);
            sentencia_preparada.setInt(1, id);
             sentencia_preparada.setString(2, nombre);
              sentencia_preparada.setString(3, apellidoP);
               sentencia_preparada.setString(4, apellidoM);
                sentencia_preparada.setString(5, carrera);
                 int i=sentencia_preparada.executeUpdate();
                 
                 if(i> 0){
                     JOptionPane.showMessageDialog(null, "Datos Guardados");
                 }else{
                      JOptionPane.showMessageDialog(null, "Error al guardar");
                 }
                 conexion.close();
                 
        } catch (HeadlessException | SQLException e) {
            System.out.println("Erro:"+ e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error" + e);
            }
        }
        
    }
    
    public static String buscrId(int id){
        String mensaje =null;
        try {
            conexion =Conexion_BD.conectar();
        String consulta ="SELECT id FROM datos_alumno WHERE id=?";
        sentencia_preparada =conexion.prepareStatement(consulta);
        sentencia_preparada.setInt(1, id);
        resultado =sentencia_preparada.executeQuery();
        
        if(resultado.next()){
            mensaje="Exixte Id";
        }else{
            mensaje="No existe Id";
        }
        conexion.close();
        
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Metodos_SQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return mensaje;
    }
    
    
    
    public void modificar_datos_alumnos(String nombre, String apellidoP, String apellidoM, String carrera, int id){
        
        try {
            conexion=Conexion_BD.conectar();
            String consulta="UPDATE datos_alumno SET Nombre = ?, Apellido_paterno = ?, Apellido_materno = ?, Carrera = ?, WERE Id = ?" ;
            sentencia_preparada=conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidoP);
             sentencia_preparada.setString(3, apellidoM);
              sentencia_preparada.setString(4, carrera);
             sentencia_preparada.setInt(5, id);
             
             int i=sentencia_preparada.executeUpdate();
             
             if(i>0){
                 JOptionPane.showMessageDialog(null, "Datos Modificados");
             }else{
                 JOptionPane.showMessageDialog(null, "No se modificaron los datos");
             }
             conexion.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error"+ e);
        }
        finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error " + e);
            }
        }
    }
}
