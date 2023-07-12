package Vistas;

import Clases.Alumno;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class VistaAgregarAlumnos extends javax.swing.JInternalFrame {
    
    private final String LEYENDA_LEGAJO = "Ingrese el numero de legajo";
    private final String LEYENDA_NOMBRE = "Ingrese el nombre";
    private final String LEYENDA_APELLIDO = "Ingrese el apellido";
    private HashSet <Alumno> hashAlumnos;
    
    public VistaAgregarAlumnos( HashSet hashAlumnos ) {
        initComponents();
        this.hashAlumnos = hashAlumnos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondo = new javax.swing.JPanel();
        label_Titulo = new javax.swing.JLabel();
        jt_Legajo = new javax.swing.JTextField();
        jt_Apellido = new javax.swing.JTextField();
        sp_legajo = new javax.swing.JSeparator();
        sp_apellido = new javax.swing.JSeparator();
        sp_nombre = new javax.swing.JSeparator();
        jt_Nombre = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        label_logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 500));

        panel_fondo.setBackground(new java.awt.Color(255, 255, 255));
        panel_fondo.setMinimumSize(new java.awt.Dimension(760, 480));
        panel_fondo.setPreferredSize(new java.awt.Dimension(730, 470));
        panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label_Titulo.setText("Registrar Alumnos");
        panel_fondo.add(label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 190, -1));

        jt_Legajo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_Legajo.setText("Ingrese el numero de legajo");
        jt_Legajo.setBorder(null);
        jt_Legajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jt_LegajoMousePressed(evt);
            }
        });
        jt_Legajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_LegajoActionPerformed(evt);
            }
        });
        panel_fondo.add(jt_Legajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 650, 30));

        jt_Apellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_Apellido.setText("Ingrese el apellido");
        jt_Apellido.setBorder(null);
        jt_Apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jt_ApellidoMousePressed(evt);
            }
        });
        jt_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_ApellidoActionPerformed(evt);
            }
        });
        panel_fondo.add(jt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 650, 20));

        sp_legajo.setBackground(new java.awt.Color(0, 102, 204));
        panel_fondo.add(sp_legajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 650, -1));

        sp_apellido.setBackground(new java.awt.Color(0, 102, 204));
        panel_fondo.add(sp_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 650, -1));

        sp_nombre.setBackground(new java.awt.Color(0, 102, 204));
        panel_fondo.add(sp_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, 650, 10));

        jt_Nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jt_Nombre.setText("Ingrese el nombre");
        jt_Nombre.setBorder(null);
        jt_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jt_NombreMousePressed(evt);
            }
        });
        jt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_NombreActionPerformed(evt);
            }
        });
        panel_fondo.add(jt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 650, 30));

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        panel_fondo.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 90, -1));

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        panel_fondo.add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        panel_fondo.add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        panel_fondo.add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_LegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_LegajoActionPerformed
    }//GEN-LAST:event_jt_LegajoActionPerformed

    private void jt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_ApellidoActionPerformed
    }//GEN-LAST:event_jt_ApellidoActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        
        String legajo = jt_Legajo.getText();
        String apellido = jt_Apellido.getText();
        String nombre = jt_Nombre.getText();
        int legajo_parseado;
        
        try{
            
            try{
                legajo_parseado = Integer.parseInt( legajo );
                
                if(!apellido.equals(LEYENDA_APELLIDO)){
                if(!apellido.isEmpty()){
                if(!nombre.equals(LEYENDA_NOMBRE)){
                if(!nombre.isEmpty()){ 
                
                    Alumno miAlumno = new Alumno( legajo_parseado, apellido, nombre );
                    hashAlumnos.add(miAlumno);
                    limpiar();
                
                    JOptionPane.showMessageDialog(null, "Alumno registrado con exito.");
                
                }else{JOptionPane.showMessageDialog(this,"Debe ingresar un nombre.");}  
                }else{JOptionPane.showMessageDialog(this,"Debe ingresar un nombre.");}  
                }else{JOptionPane.showMessageDialog(this,"Debe ingresar un apellido.");}
                }else{JOptionPane.showMessageDialog(this,"Debe ingresar un apellido.");}

            
            }catch(java.lang.NumberFormatException ex){ JOptionPane.showMessageDialog(null,"Debe ingresar el legajo del alumno."); }
                          
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Datos incorrectos");
        }
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void jt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_NombreActionPerformed
    }//GEN-LAST:event_jt_NombreActionPerformed

    private void jt_LegajoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_LegajoMousePressed
        jt_Legajo.setText("");
    }//GEN-LAST:event_jt_LegajoMousePressed

    private void jt_ApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ApellidoMousePressed
        jt_Apellido.setText("");
    }//GEN-LAST:event_jt_ApellidoMousePressed

    private void jt_NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_NombreMousePressed
        jt_Nombre.setText("");
    }//GEN-LAST:event_jt_NombreMousePressed
 
    public void limpiar(){
        jt_Legajo.setText(LEYENDA_LEGAJO);
        jt_Apellido.setText(LEYENDA_APELLIDO);
        jt_Nombre.setText(LEYENDA_NOMBRE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JTextField jt_Apellido;
    private javax.swing.JTextField jt_Legajo;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_logo;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JSeparator sp_apellido;
    private javax.swing.JSeparator sp_legajo;
    private javax.swing.JSeparator sp_nombre;
    // End of variables declaration//GEN-END:variables
}
