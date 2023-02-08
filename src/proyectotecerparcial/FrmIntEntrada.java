
package proyectotecerparcial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class FrmIntEntrada extends javax.swing.JInternalFrame {
BD bd = new BD ();
Datos entrada = new Datos ();
Validar val = new Validar ();
  
    public FrmIntEntrada() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPlacas = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Entrada");
        setFocusTraversalPolicyProvider(true);

        jLabel1.setText("Placas");

        jLabel2.setText("Modelo");

        jLabel3.setText("Lugar");

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

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        txtLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLugarKeyTyped(evt);
            }
        });

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Color");

        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });

        jLabel5.setText("Marca");

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlacas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLugar)
                            .addComponent(txtColor)
                            .addComponent(txtMarca)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadir)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
     boolean valido;
      Pattern pat1 = Pattern.compile("[\\w].*" + (".*[\\d]")); //crea una expresion regular donde se debe empezar con letras y acabar con digitos (el formato de las placas)
     Matcher mat1 = pat1.matcher(txtPlacas.getText());
  
        //Esto es obvio.
         if ((txtPlacas.getText().length() <= 11) && (txtPlacas.getText().length() >= 8) && mat1.matches()){  //se encarga de asignar un valor verdadero o falso con los parametros dados
        valido = true;
       }
         else {
             valido = false;
         }
         if (valido == true){
        if (txtPlacas.getText().isEmpty() || (txtModelo.getText().isEmpty()) || (txtColor.getText().isEmpty()) || (txtMarca.getText().isEmpty()) || (txtLugar.getText().isEmpty()) ) {
            JOptionPane.showMessageDialog(this, "error,falta añadir un parametro");
        }
        
            else{
            String placas = txtPlacas.getText();
        String lugar = txtLugar.getText();
        String modelo = txtModelo.getText();
        String color = txtColor.getText();
        String marca = txtMarca.getText();
        entrada.setPlacas(placas);
        entrada.setModelo(modelo);
        entrada.setLugar(lugar);
        entrada.setColor(color);
        entrada.setMarca(marca);
      
        
        if (bd.abrir("estacionamiento", "root" ,"" )){
            
             if (bd.Actualiza (entrada.InsertAuto())) 
                if (bd.Actualiza (entrada.RegistroAuto()))
                 if (bd.Actualiza(entrada.InsertLugar())) 
                     if (bd.Actualiza(entrada.insertTiempo())) {
                 
            
             
          }
           
        }else {
            JOptionPane.showMessageDialog(this, "Error,contacte a su administrador");
        }
        bd.cerrar();
        
        }
         }
         else {
             JOptionPane.showMessageDialog(this,"placas invalidas,deben ser de 8 a 11 caracteres y contener su respectivo formato");
         
         }
         txtPlacas.setText("");
         txtColor.setText("");
         txtModelo.setText("");
         txtLugar.setText("");
         txtMarca.setText("");
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txtPlacasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacasKeyTyped
     if (txtPlacas.getText().length() <= 10) {
           val.placas(txtPlacas, evt);
          
        }
        else {
            evt.consume();
        }
      
    }//GEN-LAST:event_txtPlacasKeyTyped

    private void txtPlacasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacasKeyReleased
     txtPlacas.setText(txtPlacas.getText().toUpperCase());
     
    }//GEN-LAST:event_txtPlacasKeyReleased

    private void txtPlacasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacasKeyPressed
       txtPlacas.setText(txtPlacas.getText().toUpperCase());
    
    }//GEN-LAST:event_txtPlacasKeyPressed

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
      if (txtModelo.getText().length() <= 59) {
           val.textonum(txtModelo, evt);
          
        }
        else {
            evt.consume();
        }
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtLugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarKeyTyped
        if (txtLugar.getText().length() <= 29) {
           val.textonum(txtLugar, evt);
          
        }
        else {
            evt.consume();
        }
    }//GEN-LAST:event_txtLugarKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
         if (txtColor.getText().length() <= 29) {
           val.textonum(txtColor, evt);
          
        }
        else {
            evt.consume();
        }
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
         if (txtMarca.getText().length() <= 29) {
           val.textonum(txtMarca, evt);
          
        }
        else {
            evt.consume();
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlacas;
    // End of variables declaration//GEN-END:variables
}
