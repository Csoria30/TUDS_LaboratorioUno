/**
 @author Grupo 11
*/

package vistas;

import javax.swing.JOptionPane;
import negocio.Cliente;

public class ViewAgregarCliente extends javax.swing.JInternalFrame {

    public ViewAgregarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        label_titulo = new javax.swing.JLabel();
        label_dni = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_ciudad = new javax.swing.JLabel();
        label_telefono = new javax.swing.JLabel();
        tf_dni = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_ciudad = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        label_direccion = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        label_icono = new javax.swing.JLabel();
        label_subtitulo = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(176, 218, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        label_titulo.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        label_titulo.setText("Agregar Cliente");
        label_titulo.setPreferredSize(new java.awt.Dimension(2548, 2305));

        label_dni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_dni.setText("Dni:");

        label_apellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_apellido.setText("Apellido:");

        label_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_nombre.setText("Nombre:");

        label_ciudad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_ciudad.setText("Ciudad:");

        label_telefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_telefono.setText("Telefono:");

        tf_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dniActionPerformed(evt);
            }
        });

        tf_apellido.setMaximumSize(new java.awt.Dimension(800, 600));

        tf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telefonoActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        label_direccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_direccion.setText("Direccion:");

        tf_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_direccionActionPerformed(evt);
            }
        });

        label_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/clientesAdd.png"))); // NOI18N

        label_subtitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_subtitulo.setText("Datos del cliente");

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
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_icono))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_direccion)
                                    .addComponent(label_ciudad)
                                    .addComponent(label_nombre)
                                    .addComponent(label_apellido)
                                    .addComponent(label_dni)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(btn_guardar)
                                        .addGap(109, 109, 109)
                                        .addComponent(btn_nuevo)
                                        .addGap(119, 119, 119)
                                        .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_telefono)
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_direccion)
                                            .addComponent(tf_telefono)
                                            .addComponent(tf_ciudad)
                                            .addComponent(tf_nombre)
                                            .addComponent(tf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label_subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_icono))
                .addGap(14, 14, 14)
                .addComponent(label_subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_dni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_dni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ciudad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_ciudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_telefono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_direccion)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_cerrar)
                    .addComponent(btn_nuevo))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        label_icono.getAccessibleContext().setAccessibleName("iconoAdd");
        label_icono.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        try{
            String dni = tf_dni.getText();
            int dni_parceado = 0;
            String apellido = tf_apellido.getText();
            String nombre = tf_nombre.getText();
            String ciudad = tf_ciudad.getText();
            String telefono = tf_telefono.getText();
            String direccion = tf_direccion.getText();
            
            if ( !dni.isEmpty() ){
                dni_parceado = Integer.parseInt(dni);
                
            if ( !apellido.isEmpty() ){    
            if ( !nombre.isEmpty() ){
            if ( !ciudad.isEmpty() ){
            if ( !telefono.isEmpty() ){
            if ( !direccion.isEmpty() ){
                                    
                Cliente miCliente = new Cliente( dni_parceado, nombre, apellido, ciudad, direccion );
                boolean resultado = Menu.miDirectorio.agregarCliente(telefono, miCliente);
        
                if ( resultado ) {
                    JOptionPane.showMessageDialog(this,"Cliente registrado");
                } else {
                    JOptionPane.showMessageDialog(this,"Telefono duplicado");  
                }
                limpiar();
                                    
            } else { JOptionPane.showMessageDialog(this,"Debe ingresar una direccion."); }
            } else { JOptionPane.showMessageDialog(this,"Debe ingresar un telefono."); }
            } else { JOptionPane.showMessageDialog(this,"Debe ingresar una ciudad."); }
            } else { JOptionPane.showMessageDialog(this,"Debe ingresar un Nombre"); }
            } else { JOptionPane.showMessageDialog(this,"Debe ingresar un Apellido"); }
            } else { JOptionPane.showMessageDialog(this,"Debe ingresar un DNI"); }
        
        }catch(Exception atrapa){
        
            JOptionPane.showMessageDialog(this,"Datos incorrectos");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void tf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telefonoActionPerformed

    private void tf_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_direccionActionPerformed

    private void tf_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dniActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    public void limpiar(){
    
        tf_dni.setText("");
        tf_apellido.setText("");
        tf_nombre.setText("");
        tf_ciudad.setText("");
        tf_telefono.setText("");
        tf_direccion.setText("");
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_ciudad;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_icono;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_subtitulo;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_ciudad;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
