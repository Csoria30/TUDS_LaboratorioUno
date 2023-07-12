package Vistas;

import Conexion.*;
import Modelo.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class FormLogin extends javax.swing.JFrame {
    private final Connection con;
    static String usuarioSesion = "";
    static String rolSesion = "";
    
    
    public FormLogin() {  
        con = Conexion.getConexion();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon ( getClass().getResource("/Imagenes/fondo_login.png") );
        Image image = icon.getImage();
        jPandel_derecho = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

        };
        btn_login = new javax.swing.JButton();
        label_usuario = new javax.swing.JLabel();
        label_contraseña = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        tf_contrasenia = new javax.swing.JPasswordField();
        btn_salir = new javax.swing.JButton();

        setUndecorated(true);

        jPandel_derecho.setBackground(new java.awt.Color(153, 153, 153));

        btn_login.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Iniciar Sesion");
        btn_login.setFocusPainted(false);
        btn_login.setContentAreaFilled(false);
        btn_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        label_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        label_usuario.setRequestFocusEnabled(false);

        label_contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/password.png"))); // NOI18N

        btn_salir.setForeground(Color.red);
        btn_salir.setFont(new java.awt.Font("Dialog", 1, 14));
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setFocusPainted(false);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salir_sistema.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPandel_derechoLayout = new javax.swing.GroupLayout(jPandel_derecho);
        jPandel_derecho.setLayout(jPandel_derechoLayout);
        jPandel_derechoLayout.setHorizontalGroup(
            jPandel_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPandel_derechoLayout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addGroup(jPandel_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPandel_derechoLayout.createSequentialGroup()
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPandel_derechoLayout.createSequentialGroup()
                        .addGroup(jPandel_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_usuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_contraseña))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPandel_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addGroup(jPandel_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_contrasenia)
                                .addComponent(tf_usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))))
        );
        jPandel_derechoLayout.setVerticalGroup(
            jPandel_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPandel_derechoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPandel_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_usuario)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPandel_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_contraseña))
                .addGap(33, 33, 33)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPandel_derecho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPandel_derecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        String user = tf_usuario.getText();
        String pass = tf_contrasenia.getText();
        
        String query    = "SELECT usuario, contrasenia, rol " 
                        + "FROM usuarios " 
                        + "WHERE estado = 1 "
                        + "AND usuario = '"+user+"' "
                        + "LIMIT 1";

        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet resultado = stmt.executeQuery();
            
            if( resultado.next() ){
                //Si Existe el usuario
                String usuarioValidado = resultado.getString("usuario");
                String passValidado = resultado.getString("contrasenia");
                String rolValidado = resultado.getString("rol");
                
                if ( pass.equals(passValidado) ){ //Validando contraseñas
                    usuarioSesion = usuarioValidado;
                    rolSesion = rolValidado;
                    Menu menu = new Menu();
                    this.setVisible(false);
                    menu.setExtendedState(menu.MAXIMIZED_BOTH); // abrir en pantalla completa
                    menu.setVisible(true);                   

                }else{
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta","ERROR de autenticacion",JOptionPane.WARNING_MESSAGE);
                }
                
            }else{
                //El usuario no existe
                JOptionPane.showMessageDialog(null, "Usuario incorrecto","ERROR de autenticacion",JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex);
        }
        
    }//GEN-LAST:event_btn_loginMouseClicked
      
    private void limpiarCampos(){
        tf_usuario.setText("");
        tf_contrasenia.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> {
            new FormLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPandel_derecho;
    private javax.swing.JLabel label_contraseña;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JPasswordField tf_contrasenia;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
}
