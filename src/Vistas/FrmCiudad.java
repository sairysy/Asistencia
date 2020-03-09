/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Ciudad;
import Funciones.FCiudad;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class FrmCiudad extends javax.swing.JFrame {

    /**
     * Creates new form Ciudad
     */
    public FrmCiudad() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
  private void limpiarContCiudades() {
        txtCodigo.setText("");
        
        txtNombre.setText("");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBuscarCodigo = new javax.swing.JLabel();
        txtBuscarcodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblCodigofacultad1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        bntImprimir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListarnivel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel2.setText("jLabel1");

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipounach2015-01 (5).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Nivel");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chica.png"))); // NOI18N

        lblBuscarCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBuscarCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblBuscarCodigo.setText("Codigo:");

        txtBuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarcodigoActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Informacion");

        lblCodigofacultad1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigofacultad1.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigofacultad1.setText("Codigo:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 102));
        lblNombre.setText("Nombre:");

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnListar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnListar.setForeground(new java.awt.Color(0, 0, 102));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        bntImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntImprimir.setForeground(new java.awt.Color(0, 0, 102));
        bntImprimir.setText("Imprimir");
        bntImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntImprimirActionPerformed(evt);
            }
        });

        TablaListarnivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Codigo sicoa", "Nombre", "Paralelo", "Modalidad", "Codigo escuela"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaListarnivel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(TablaListarnivel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addComponent(txtNombre))
                                .addComponent(jSeparator1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnNuevo)
                                    .addGap(51, 51, 51)
                                    .addComponent(btnEliminar)
                                    .addGap(55, 55, 55)
                                    .addComponent(btnModificar)
                                    .addGap(28, 28, 28)
                                    .addComponent(btnListar)
                                    .addGap(34, 34, 34))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(txtBuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscar)
                                    .addGap(163, 163, 163))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCodigofacultad1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addComponent(jLabel6)))
                                    .addGap(349, 349, 349))))
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(161, 161, 161)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntImprimir)
                        .addContainerGap(251, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(51, 51, 51)
                        .addComponent(btnSalir)
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar)
                                .addComponent(lblBuscarCodigo)))
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodigofacultad1)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(lblNombre))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnListar)
                    .addComponent(bntImprimir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnSalir))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
//Menu obj=new Menu();
//        obj.setVisible(true);
//        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtBuscarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarcodigoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        FCiudad fciudad = new FCiudad();
                
        try {
            limpiarContCiudades();
            ciudad = fciudad.ObtenerCiudadDadoCodigo(
                Integer.parseInt(txtBuscarcodigo.getText()));
            if (ciudad != null) {
                txtCodigo.setText(Integer.toString(ciudad.getIdciudad()));
                txtNombre.setText(ciudad.getNombreciudad());
                

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar  ciudad!!",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().compareTo("Nuevo")==0) {
             limpiarContCiudades();
            btnNuevo.setText("Registrar");
        }else{
            if(btnNuevo.getText().compareTo("Registrar")==0){
                try {
                    Ciudad ciudad = new Ciudad();
                    FCiudad fciudad = new FCiudad();
                   //ciudad.setCodigo(Integer.parseInt(txtCodigo.getText()));
                   
                    ciudad.setNombreciudad(txtNombre.getText());
                   
                    if(fciudad.Insertar(ciudad) ){
                       limpiarContCiudades();
                        JOptionPane.showMessageDialog(this,"Registrado correctamente!!",
                            "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                        btnNuevo.setText("Nuevo");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        FCiudad fciudad = new FCiudad();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere eliminar el ciudad?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                if (fciudad.eliminar(ciudad) ) {
                    JOptionPane.showMessageDialog(this,
                        "Ciudad eliminado correctamente!!",
                        "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                   limpiarContCiudades();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el ciudad!!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        FCiudad fciudad = new FCiudad();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere modificar el ciudad?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                    ciudad.setIdciudad(Integer.parseInt(txtCodigo.getText()));                    
                    ciudad.setNombreciudad(txtNombre.getText());
                    
                if(fciudad.actualizar(ciudad) ){
                    JOptionPane.showMessageDialog(this,"Ciudad modificado correctamente!!",
                        "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TablaListarnivel.getModel();
        ArrayList<Ciudad> lista = new ArrayList<>();
        try {
            FCiudad fciudad = new FCiudad();
            lista = fciudad.ObtenerCiudades();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",
                JOptionPane.ERROR_MESSAGE);
        }
        for(Ciudad r : lista){
            modelo.addRow(new Object[]{ r.getIdciudad(),r.getNombreciudad()});
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void bntImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntImprimirActionPerformed
//
//        try {
//            Reportes reporte = new Reportes();
//            reporte.ReporteCiudades ();
//        }catch (JRException ex) {
//            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
//        }catch (SQLException ex){
//            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
//        }
    }//GEN-LAST:event_bntImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCiudad().setVisible(true);
            }
        });
    }
   Ciudad ciudad ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListarnivel;
    private javax.swing.JButton bntImprimir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBuscarCodigo;
    private javax.swing.JLabel lblCodigofacultad1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtBuscarcodigo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}