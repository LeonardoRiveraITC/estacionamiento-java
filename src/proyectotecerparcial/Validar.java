
package proyectotecerparcial;

import javax.swing.JTextField;


public class Validar {
 public  void placas (JTextField caja,java.awt.event.KeyEvent evt){
   int codigo;
   codigo = (int) evt.getKeyChar ();
      
   if (!((codigo >= 65) && (codigo<=90) )) //esto tambien es obvio
   if (!((codigo >= 97) && (codigo<=122) ))   
     if (!((codigo >= 48) && (codigo<=57) ))    
       switch (codigo) {
           case 8: 
           case 9:
           case 45:
               if (caja.getText().contains("--"))
                   evt.consume();
           case 209:break;
           default:evt.consume();
        
        
   }
  
}
 public  void texto (JTextField caja,java.awt.event.KeyEvent evt){
   int codigo;
   codigo = (int) evt.getKeyChar ();
      
   if (!((codigo >= 65) && (codigo<=90) )) //esto tambien es obvio
   if (!((codigo >= 97) && (codigo<=122) ))   
   
       switch (codigo) {
           case 8: 
           case 9:
           case 32:
           break;
           default:evt.consume();
        
}
 }
 public  void textonum (JTextField caja,java.awt.event.KeyEvent evt){
   int codigo;
   codigo = (int) evt.getKeyChar ();
      
   if (!((codigo >= 65) && (codigo<=90) )) //esto tambien es obvio
   if (!((codigo >= 97) && (codigo<=122) ))   
   if (!((codigo >= 48) && (codigo<=57) ))
       switch (codigo) {
           case 8: 
           case 9:
           case 32:
           break;
           default:evt.consume();
}
 }
}