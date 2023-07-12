package Vistas;

import Clases.Materia;
import java.util.HashSet;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class VistaAgregarMaterias extends javax.swing.JInternalFrame {
    
    private final String LEYENDA_CODIGO = "Ingrese el codigo de la materia";
    private final String LEYENDA_NOMBRE = "Ingrese el nombre de la materia";
    private final String LEYENDA_ANIO = "Ingrese el año de la materia";
    private HashSet <Materia> hashMaterias = new HashSet<>();
    
    public VistaAgregarMaterias( HashSet<Materia> hashMaterias ) {
        initComponents();
        this.hashMaterias = hashMaterias;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondo = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        jtCodigoMateria = new javax.swing.JTextField();
        jtNombreMateria = new javax.swing.JTextField();
        jtAñoPertenece = new javax.swing.JTextField();
        sp_codMateria = new javax.swing.JSeparator();
        sp_nombreMateria = new javax.swing.JSeparator();
        sp_anioMateria = new javax.swing.JSeparator();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        label_Titulo = new javax.swing.JLabel();

        panel_fondo.setBackground(new java.awt.Color(255, 255, 255));
        panel_fondo.setMinimumSize(new java.awt.Dimension(750, 500));
        panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        panel_fondo.add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        jtCodigoMateria.setText("Ingrese el codigo de la materia");
        jtCodigoMateria.setBorder(null);
        jtCodigoMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtCodigoMateriaMousePressed(evt);
            }
        });
        jtCodigoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoMateriaActionPerformed(evt);
            }
        });
        panel_fondo.add(jtCodigoMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 650, -1));

        jtNombreMateria.setText("Ingrese el nombre de la materia");
        jtNombreMateria.setBorder(null);
        jtNombreMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtNombreMateriaMousePressed(evt);
            }
        });
        jtNombreMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreMateriaActionPerformed(evt);
            }
        });
        panel_fondo.add(jtNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 650, -1));

        jtAñoPertenece.setText("Ingrese el año de la materia");
        jtAñoPertenece.setBorder(null);
        jtAñoPertenece.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtAñoPerteneceMousePressed(evt);
            }
        });
        jtAñoPertenece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAñoPerteneceActionPerformed(evt);
            }
        });
        panel_fondo.add(jtAñoPertenece, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 650, -1));

        sp_codMateria.setBackground(new java.awt.Color(0, 102, 204));
        panel_fondo.add(sp_codMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 650, -1));

        sp_nombreMateria.setBackground(new java.awt.Color(0, 102, 204));
        panel_fondo.add(sp_nombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 650, -1));

        sp_anioMateria.setBackground(new java.awt.Color(0, 102, 204));
        panel_fondo.add(sp_anioMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 650, -1));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        panel_fondo.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        panel_fondo.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        panel_fondo.add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));
        panel_fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        label_Titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label_Titulo.setText("Registrar Materia");
        panel_fondo.add(label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        String codMateria = jtCodigoMateria.getText();
        String nombre = jtNombreMateria.getText();
        String anio = jtAñoPertenece.getText();
        int codMateria_parseado = 0;
        int anio_parseado;
        
        try {
            
            try{ 
                codMateria_parseado = Integer.parseInt(codMateria); 
                
                if(!nombre.equals(LEYENDA_NOMBRE)){
                if(!nombre.isEmpty()){
                if(!anio.equals(LEYENDA_ANIO)){
                if(!anio.isEmpty()){
                    
                    anio_parseado = Integer.parseInt(anio);
                    Materia miMateria = new Materia(codMateria_parseado, nombre, anio_parseado);
                    hashMaterias.add(miMateria);
                    limpiar();
                    
                    JOptionPane.showMessageDialog(null, "Materia registrada con exito.");
                    
                }else {JOptionPane.showMessageDialog(this,"Debe ingresar el año de la materia.");}
                }else {JOptionPane.showMessageDialog(this,"Debe ingresar el año de la materia.");}
                }else {JOptionPane.showMessageDialog(this,"Debe ingresar el nombre de la materia.");}
                }else {JOptionPane.showMessageDialog(this,"Debe ingresar el nombre de la materia.");}
            }
            catch(java.lang.NumberFormatException ex){ JOptionPane.showMessageDialog(null,"Debe ingresar un codigo de materia."); }
            
        } catch (InputMismatchException ex) {
            JOptionPane.showMessageDialog(null,"ERROR FATAL: " + ex);
        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtAñoPerteneceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAñoPerteneceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAñoPerteneceActionPerformed

    private void jtCodigoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoMateriaActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jtNombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreMateriaActionPerformed

    private void jtCodigoMateriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCodigoMateriaMousePressed
        jtCodigoMateria.setText("");
    }//GEN-LAST:event_jtCodigoMateriaMousePressed

    private void jtNombreMateriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombreMateriaMousePressed
        jtNombreMateria.setText("");
    }//GEN-LAST:event_jtNombreMateriaMousePressed

    private void jtAñoPerteneceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAñoPerteneceMousePressed
        jtAñoPertenece.setText("");
    }//GEN-LAST:event_jtAñoPerteneceMousePressed

    public void limpiar(){
        jtAñoPertenece.setText(LEYENDA_ANIO);
        jtCodigoMateria.setText(LEYENDA_CODIGO);
        jtNombreMateria.setText(LEYENDA_NOMBRE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JTextField jtAñoPertenece;
    private javax.swing.JTextField jtCodigoMateria;
    private javax.swing.JTextField jtNombreMateria;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_logo;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JSeparator sp_anioMateria;
    private javax.swing.JSeparator sp_codMateria;
    private javax.swing.JSeparator sp_nombreMateria;
    // End of variables declaration//GEN-END:variables
}
