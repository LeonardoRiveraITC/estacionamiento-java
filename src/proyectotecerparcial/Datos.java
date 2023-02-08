
package proyectotecerparcial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Datos {
    private String color;
    private String placas;
    private String modelo;
    private String lugar;
    private Time inicio;
    private Time fin;
    private double precio;
    private String marca;
    private String contraseña;
    private String usuario;
    
    
    public void setPrecio (double pre){
        precio = pre;
    }
    public double getPrecio () {
        return precio;
    }
    public void setColor (String col){
        color = col;
    }
    public String getColor () {
        return color;
    }
    public void setPlacas (String plac){
        placas = plac;
    }
    public String  getPlacas (){
        return placas;
    }
    public void setModelo (String mod){
        modelo = mod;
    }
    public String getModelo () {
        return modelo;
    }
    public void setLugar (String lug) {
        lugar = lug;
    }
    public String getLugar () {
        return lugar;
    }
    public void setInicio (Time ini){
        inicio = ini;
    }
    public Time getInicio () {
        return inicio;
    }
    public void setFin (Time fi){
        fin = fi;
    }
    public Time getFin (){
        return fin;
    }
    public void setMarca (String mar) {
        marca = mar;
    }
    public String getMarca () {
        return marca;
    }
    public void setUsuario (String usu) {
        usuario = usu;
    }
    public String getUsuario () {
        return usuario;
    }
    public void setContraseña (String contra) {
        contraseña = contra;
    }
    public String getContraseña () {
        return contraseña;
    }
  public String deleteRegistro () {
      String cadena = "delete from registro where pago != 0";
      return cadena;
  }
    public String InsertUsuario () {
         
        String cadena = "insert into usuarios values  ('"+ usuario + "','" + contraseña + "');"; 
        return cadena;
    }
    public String InsertAuto () {
         
        String cadena = "insert into auto values ('"+ placas + "','" + modelo + "','" + marca + "','" + color + "');" ; 
        return cadena;
    }
    public String RegistroAuto () {
         
        String cadena = "insert into registro values ('"+ placas + "','" + modelo + "','" + marca + "','" + color + "',CURRENT_TIMESTAMP,'00:00:00',0.0);" ; 
        return cadena;
    }
   
     public String InsertLugar () {
         
        String cadena = "insert into lugar values ('" + placas + "',+'" + lugar + "');"  ; 
        return cadena;
    }
      public String insertTiempo () {
         String cadena = "insert into tiempo (autoid2,fin) values ('" + placas + "','" + "00:00:00 " + "');";
         return cadena;
     }
     public String insertTiempoFin () {
         String cadena = "update registro set fin = CURRENT_TIMESTAMP, pago = " + precio + " where placas = '" + placas + "';"; 

         
         return cadena;
     }
      
    public String borrarAuto () {
       String cadena ="delete from auto where placas = '"+ placas +"';" ;
       return cadena;
   }
    public String borrarLugar () {
       String cadena ="delete from lugar where autoid ='" + placas + "';" ;
       return cadena;
   }
    public String borrarTiempo () {
       String cadena ="delete from tiempo where autoid2 = '" + placas + "';" ;
       return cadena;
   }
    public String getDatos () {
        String cadena = "select * from auto a inner join lugar l on a.placas = l.autoid inner join tiempo t on t.autoid2=a.placas where a.placas = '" + placas + "'";
        return cadena;
    }
    public String getDatosLogin () {
        String cadena = "select * from usuarios where nombre = '" + usuario + "';";
        return cadena;
    }
    public void setDatos (ResultSet dato) {
       try {
      placas = dato.getString("placas");
      modelo = dato.getString("modelo");
      color = dato.getString("color");
      lugar = dato.getString("lugar");
       } catch (SQLException ex) {
           Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
    public void nuevoUsuario () {
        String cadena = "";
    }
    public String borrarUsuario(){
        String cadena="delete from usuarios where nombre = '" + usuario + "';";
        return cadena;
    }
}
