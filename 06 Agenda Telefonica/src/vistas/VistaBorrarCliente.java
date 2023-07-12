/**
 @author Grupo 11
*/
package vistas;

import javax.swing.JOptionPane;
import negocio.Cliente;

public class VistaBorrarCliente extends javax.swing.JInternalFrame {

    public VistaBorrarCliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_busqueda = new javax.swing.JTextField();
        label_dni = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
        tf_dni = new javax.swing.JTextField();
        label_apellido = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lable_nombre = new javax.swing.JLabel();
        label_ciudad = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tf_apellido = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        label_titulo = new javax.swing.JLabel();
        tf_ciudad = new javax.swing.JTextField();
        label_subtitulo1 = new javax.swing.JLabel();
        btn_borrar = new javax.swing.JButton();
        label_direccion = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        label_icono = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        label_subtitulo2 = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(176, 218, 255));

        tf_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_busquedaActionPerformed(evt);
            }
        });

        label_dni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_dni.setText("Dni:");

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        label_apellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_apellido.setText("Apellido: ");

        lable_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lable_nombre.setText("Nombre:");

        label_ciudad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_ciudad.setText("Ciudad:");

        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        label_titulo.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        label_titulo.setText("Borrar Cliente");

        label_subtitulo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_subtitulo1.setText("Buscar cliente por telefono");

        btn_borrar.setText("Borrar Cliente");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        label_direccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_direccion.setText("Direccion:");

        tf_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_direccionActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        label_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/clientePapelera.png"))); // NOI18N

        label_subtitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_subtitulo2.setText("Datos del cliente");

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(label_titulo)
                        .addGap(18, 18, 18)
                        .addComponent(label_icono))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_subtitulo2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_subtitulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lable_nombre)
                                                    .addComponent(label_apellido)
                                                    .addComponent(label_ciudad)
                                                    .addComponent(label_direccion))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tf_nombre)
                                                    .addComponent(tf_ciudad)
                                                    .addComponent(tf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                                                    .addComponent(tf_direccion)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_dni)
                                                .addGap(62, 62, 62)
                                                .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(tf_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_buscar)
                                        .addGap(46, 46, 46)))))))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(btn_borrar)
                .addGap(91, 91, 91)
                .addComponent(btn_nuevo)
                .addGap(97, 97, 97)
                .addComponent(btn_cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_icono)))
                .addGap(42, 42, 42)
                .addComponent(label_subtitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(label_subtitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_apellido)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable_nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_ciudad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_direccion)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_nuevo))
                .addGap(148, 148, 148))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_busquedaActionPerformed
        Cliente cell = Menu.miDirectorio.buscarCliente(title);
    }//GEN-LAST:event_tf_busquedaActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void tf_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_direccionActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String telefono = tf_busqueda.getText();
        
        if ( !telefono.isEmpty() ){
            Cliente buscandoCliente = (Menu.miDirectorio.buscarCliente(telefono));
            
            if (buscandoCliente != null) {
                tf_dni.setText(buscandoCliente.getDni() + " ");
                tf_apellido.setText(buscandoCliente.getApellido() + " ");
                tf_nombre.setText(buscandoCliente.getNombre() + " ");
                tf_ciudad.setText(buscandoCliente.getCiudad() + " ");
                tf_direccion.setText(buscandoCliente.getDireccion() + " ");   
             
            } else {
                JOptionPane.showMessageDialog(this, "Telefono no encontrado");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de telefono para realizar la busqueda.");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        String telefono = tf_busqueda.getText();
        Cliente buscandoCliente = (Menu.miDirectorio.buscarCliente(telefono));
        
        if( buscandoCliente != null ){
            Menu.miDirectorio.borrarCliente(telefono);
            JOptionPane.showMessageDialog(this, "Registro eliminado correctamente.");
            limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "Debe realizar una busqueda.");
        }
        
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    public void limpiar(){
        tf_dni.setText("");
        tf_apellido.setText("");
        tf_nombre.setText("");
        tf_ciudad.setText("");
        tf_busqueda.setText("");
        tf_direccion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_ciudad;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_icono;
    private javax.swing.JLabel label_subtitulo1;
    private javax.swing.JLabel label_subtitulo2;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel lable_nombre;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_busqueda;
    private javax.swing.JTextField tf_ciudad;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
