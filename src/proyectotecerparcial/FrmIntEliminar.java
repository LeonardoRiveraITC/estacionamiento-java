
package proyectotecerparcial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class FrmIntEliminar extends javax.swing.JInternalFrame {
BD bd = new BD ();
String preciohoras  ;
int preciohora = 0;
Datos entrada = new Datos ();
Calendar calendario = new GregorianCalendar();
Validar val = new Validar();



   
    public FrmIntEliminar() {
        initComponents();
        
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPlacas = new javax.swing.JTextField();
        btnSalida = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Jlabel1 = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLugar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Salida");

        jLabel1.setText("Placas");

        txtPlacas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlacasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacasKeyTyped(evt);
            }
        });

        btnSalida.setText("Salida");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Jlabel1.setText("Modelo");

        lblModelo.setToolTipText("");
        lblModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Lugar");

        lblLugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Color");

        lblHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Marca");

        lblMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Hora entrada");

        lblColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalida)
                    .addComponent(btnCancelar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
     String horastr =lblHora.getText();
       if (lblModelo.getText().isEmpty()){ //Esto deberia ser un mejor proceso pero me ahorro tiempo,simplemente depende del anterior proceso para decir que las placas no esxisten
       JOptionPane.showMessageDialog(this, "Las placas no existen");
    }
    else {
    Calendar calendario = Calendar.getInstance();
    String cadena = "a";
    ResultSet dato;
    Time horap;
    long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos por dia
    java.util.Date hoy = new Date(); 
    System.out.println(lblHora.getText()); 
    String[] arregloEntrada = lblHora.getText().split(" "); //separa el arreglo por espacios, guiones y dos puntos
    String[] arregloFecha = arregloEntrada[0].split("-");
    String[] arregloHora = arregloEntrada[1].split(":");
    int año =Integer.valueOf(arregloFecha[0]);  //separa el arreglo por año,mes y dia
    int mes = Integer.valueOf(arregloFecha[1]); 
    int dia = Integer.valueOf(arregloFecha[2]); 
    Calendar calendar = new GregorianCalendar(año, mes-1, dia); //instancia el calendario
    java.sql.Date fecha = new java.sql.Date(calendar.getTimeInMillis()); //obtiene la fecha en milisegundos
//-------------------------------------------------------------------------------
//Obtiene la hora
    int hora = calendario.get(Calendar.HOUR_OF_DAY); //obtiene la hora del sistema
    long diferencia = ( hoy.getTime() - fecha.getTime() )/MILLSECS_PER_DAY; //obtiene la diferenci en milisegundos,se usa long por la longitud de el dato
    int dias = Integer.valueOf(String.valueOf(diferencia));
   
    try { //GENERA EL PROCESO MIENTRAS EL  PRECIO DE HORA SEA 0
       do{
    if (preciohora <= 0){ //genera el proceso si el precio de hora es mayor o 0
    JOptionPane.showMessageDialog(this,"Aviso: El precio por hora no puede ser 0 o dejarse vacio");
    Pattern pat = Pattern.compile("\\D"); // crea una regex (regular expresion) para solo digitos
     
    preciohoras = JOptionPane.showInputDialog(this,"Inserte su precio por hora");
   Matcher mat = pat.matcher(preciohoras); //la comparacion de la regex
   
   if (mat.matches()){ //si la regex es verdad,falsa
       JOptionPane.showMessageDialog(this, "Operacion cancelada");
       this.setVisible(false);
   }
   else 
    if (preciohoras.isEmpty()){ // establece el valor como 0 en caso de que se deje vacio
        preciohora = 0 ;
    }
   
    
   
    }
    preciohora = Integer.valueOf(preciohoras);
    entrada.setPrecio(preciohora);
    
    
    }while (preciohora <= 0);
     }catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Operacion cancelada");
        
    }
  
    
    
    int horas = hora - Integer.valueOf(arregloHora[0]); //calculo de horas
    float importeTotal=((dias*24)  * preciohora )+(horas+1*preciohora); 
    System.out.println (importeTotal);
    entrada.setPlacas(txtPlacas.getText());
    if (importeTotal <= 0.0){ //si el importe total es 0 (o dio a cancelar,debido a que genera una expresion nula),cierra la ventana y cancela el proceso
        this.setVisible(false);
    }
    else {
    JOptionPane.showMessageDialog(this, "Precio a pagar: " + importeTotal);

   if (bd.abrir("estacionamiento", "root", "")){
       
       if(bd.Actualiza(entrada.borrarLugar()))if(bd.Actualiza(entrada.borrarTiempo()))if(bd.Actualiza(entrada.borrarAuto())) if(bd.Actualiza(entrada.insertTiempoFin())){
           
       }
       else {
           JOptionPane.showMessageDialog(this, "Error,contacte a su administrador");
       }
   }
   bd.cerrar();
    }
       }
         txtPlacas.setText("");
         lblColor.setText("");
         lblModelo.setText("");
         lblLugar.setText("");
         lblMarca.setText("");
         lblHora.setText("");
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void txtPlacasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacasKeyReleased
ResultSet dato;

    entrada.setPlacas(txtPlacas.getText());
    if (bd.abrir("estacionamiento", "root", "")){
         dato = bd.Consulta(entrada.getDatos());
       if(dato != null){
           if(dato != null){
           try {              
               if(dato.first()) //si lo que devuelve dato no es nulo "setea" los valores
               {
               lblMarca.setText(dato.getString("marca"));
               lblLugar.setText(dato.getString("lugar"));
               lblColor.setText(dato.getString("color"));
               lblHora.setText(dato.getString("inicio"));
               lblModelo.setText(dato.getString("modelo"));
               }
               else //si el valor es nulo,no hay nada
               {
               lblColor.setText("");
               lblMarca.setText("");
               lblHora.setText("");
               lblLugar.setText("");
               lblModelo.setText("");
               lblHora.setText("");
               
               }
           } catch (SQLException ex) {
               Logger.getLogger(FrmIntEliminar.class.getName()).log(Level.SEVERE, null, ex);
           }
   
       }
   
       }
        txtPlacas.setText(txtPlacas.getText().toUpperCase());
   }
    bd.cerrar();
    }//GEN-LAST:event_txtPlacasKeyReleased

    private void txtPlacasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacasKeyTyped
         if (txtPlacas.getText().length() <= 11) {
           val.placas(txtPlacas, evt);
          
        }
        else {
            evt.consume();
        }
    }//GEN-LAST:event_txtPlacasKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPlacasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacasKeyPressed
         txtPlacas.setText(txtPlacas.getText().toUpperCase());
    }//GEN-LAST:event_txtPlacasKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLugar;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JTextField txtPlacas;
    // End of variables declaration//GEN-END:variables
}
