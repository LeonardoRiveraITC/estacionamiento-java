/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotecerparcial;

import javax.swing.JOptionPane;




/**
 *
 * @author AndroidB
 */
public class Registro extends javax.swing.JFrame  {

     
FrmIntEntrada vEnt = new FrmIntEntrada();
FrmIntEliminar vEl = new FrmIntEliminar();
frmIntCredencialAñadir vAñ = new frmIntCredencialAñadir();
FrmIntCredencialEliminar vcel = new FrmIntCredencialEliminar();
Abrir ab = new Abrir();
BD bd = new BD();
Datos entrada = new Datos();



    /**
     * Creates new form Registro
     */
    public Registro() {
        
        initComponents();
        this.setExtendedState(Registro.MAXIMIZED_BOTH);
       
        this.desktopPane.add(vEnt);
        this.desktopPane.add (vEl);
       
        
      
    
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        AdministracionMenu = new javax.swing.JMenu();
        itemEntrada = new javax.swing.JMenuItem();
        itemSalida = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemAñadir = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        itemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        AdministracionMenu.setMnemonic('h');
        AdministracionMenu.setText("Administrar");

        itemEntrada.setMnemonic('c');
        itemEntrada.setText("Entrada");
        itemEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEntradaActionPerformed(evt);
            }
        });
        AdministracionMenu.add(itemEntrada);

        itemSalida.setMnemonic('a');
        itemSalida.setText("Salida");
        itemSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalidaActionPerformed(evt);
            }
        });
        AdministracionMenu.add(itemSalida);

        menuBar.add(AdministracionMenu);

        jMenu1.setText("Credenciales");

        itemAñadir.setText("Añadir");
        itemAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAñadirActionPerformed(evt);
            }
        });
        jMenu1.add(itemAñadir);

        itemEliminar.setText("Eliminar");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(itemEliminar);

        menuBar.add(jMenu1);

        Salir.setText("Otro");

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        Salir.add(itemSalir);

        itemAyuda.setText("Ayuda");
        itemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAyudaActionPerformed(evt);
            }
        });
        Salir.add(itemAyuda);

        menuBar.add(Salir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEntradaActionPerformed
        if (vEnt.isVisible()){
            
        }
        else {
            
            vEnt.setVisible(true);
             if (vEnt.isVisible()){
                 vEl.setVisible(false);
             }
            
        }
    }//GEN-LAST:event_itemEntradaActionPerformed

    private void itemSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalidaActionPerformed
          if (vEl.isVisible()){
            
        }
        else {
            
            vEl.setVisible(true);
             if (vEl.isVisible()){
         vEnt.setVisible(false);
        }
        }
    }//GEN-LAST:event_itemSalidaActionPerformed

    private void itemAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAñadirActionPerformed
       if (!(vAñ.isVisible())){
           frmIntCredencialAñadir vAñ = new frmIntCredencialAñadir();
            this.desktopPane.add(vAñ);
            vAñ.setVisible(true);
        }
    }//GEN-LAST:event_itemAñadirActionPerformed

    private void itemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAyudaActionPerformed
        ab.abrirmanual();
    }//GEN-LAST:event_itemAyudaActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opc;
        opc = JOptionPane.showConfirmDialog(this,"¿Estas seguro?");
        if (opc== JOptionPane.YES_OPTION){
            if (bd.abrir("estacionamiento","root", "")){ //para no sobrecargar la base de datos
                bd.Actualiza(entrada.deleteRegistro());
            }
            else {

            }
            bd.cerrar();
            System.exit(0);
        }
        else {

        }
    }//GEN-LAST:event_formWindowClosing

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
         if (!(vcel.isVisible())){
           FrmIntCredencialEliminar vcel = new FrmIntCredencialEliminar();
            this.desktopPane.add(vcel);
            vcel.setVisible(true);
        }
    }//GEN-LAST:event_itemEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdministracionMenu;
    private javax.swing.JMenu Salir;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemAyuda;
    private javax.swing.JMenuItem itemAñadir;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JMenuItem itemEntrada;
    private javax.swing.JMenuItem itemSalida;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
