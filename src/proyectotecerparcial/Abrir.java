
package proyectotecerparcial;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Abrir {
    public void abrirmanual() {
 
String arch = new String("../Archivos/ManualUsuario.pdf"); 
try{ 
 
   File path = new File (arch);
   Desktop.getDesktop().open(path);
  
  }catch(IOException e){
     e.printStackTrace();
  }catch(IllegalArgumentException e){
     JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo","Error",JOptionPane.ERROR_MESSAGE);
     e.printStackTrace();
 }  
}
}