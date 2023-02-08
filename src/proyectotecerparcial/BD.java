
package proyectotecerparcial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BD {
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBTis 198
 */
    private Connection conexion;
    
    public boolean abrir (String bd,String user,String pwd ){
       String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/"+ bd,user,pwd);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void cerrar () {
       
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
 
    }
     public boolean Actualiza (String sql) {
    try {
         Statement sentencia = conexion.createStatement();
         sentencia.execute(sql);
         return true;
    }catch  (SQLException ex) {
        System.out.println("Error"+ ex);
        return false;
    }
}
     public ResultSet Consulta (String sql){
      ResultSet datos;
      try {
         Statement sentencia = conexion.createStatement();
         datos = sentencia.executeQuery(sql);
         return datos;         
    }catch  (SQLException ex) {
        System.out.println("Error"+ ex);
 return null;
    }
    }
}

