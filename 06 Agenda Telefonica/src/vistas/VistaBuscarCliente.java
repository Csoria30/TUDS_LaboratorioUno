/**
 @author Grupo 11
*/

package vistas;
import javax.swing.JOptionPane;
import negocio.Cliente;

public class VistaBuscarCliente extends javax.swing.JInternalFrame {

    public VistaBuscarCliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        label_dni = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_ciudad = new javax.swing.JLabel();
        tf_telefono = new javax.swing.JTextField();
        tf_dni = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_ciudad = new javax.swing.JTextField();
        btn_cerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        label_direccion = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        label_icono = new javax.swing.JLabel();
        label_subtitulo1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        label_subtitulo2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(176, 218, 255));

        label_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label_titulo.setText("Buscar Cliente");

        label_dni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_dni.setText("Dni:");

        label_apellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_apellido.setText("Apellido: ");

        label_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_nombre.setText("Nombre:");

        label_ciudad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_ciudad.setText("Ciudad: ");

        tf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telefonoActionPerformed(evt);
            }
        });

        tf_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dniActionPerformed(evt);
            }
        });

        tf_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_apellidoActionPerformed(evt);
            }
        });

        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });

        tf_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ciudadActionPerformed(evt);
            }
        });

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        label_direccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_direccion.setText("Direccion: ");

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

        label_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/buscar.png"))); // NOI18N

        label_subtitulo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_subtitulo1.setText("Buscar cliente por telefono");

        label_subtitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_subtitulo2.setText("Datos del cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(label_titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_icono))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_subtitulo1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_subtitulo2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_cerrar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_apellido)
                                            .addComponent(label_nombre)
                                            .addComponent(label_ciudad)
                                            .addComponent(label_direccion)
                                            .addComponent(label_dni))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_ciudad, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_dni, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_buscar)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(label_titulo)))
                .addGap(11, 11, 11)
                .addComponent(label_subtitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(37, 37, 37)
                .addComponent(label_subtitulo2)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_dni))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_apellido)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ciudad)
                    .addComponent(tf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btn_cerrar)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dniActionPerformed

    private void tf_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_apellidoActionPerformed

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void tf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telefonoActionPerformed

    private void tf_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ciudadActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void tf_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_direccionActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String telefono = tf_telefono.getText(); //recibe el telefono
        
        if ( !telefono.isEmpty() ) {
            
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
            
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un telefono para realizar la busqueda.");
        }
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_ciudad;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_icono;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_subtitulo1;
    private javax.swing.JLabel label_subtitulo2;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_ciudad;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_dni;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
