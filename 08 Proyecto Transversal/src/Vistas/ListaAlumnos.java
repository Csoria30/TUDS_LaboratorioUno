package Vistas;

import Modelo.Alumno;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListaAlumnos extends javax.swing.JInternalFrame {
    
    
    public ListaAlumnos() {
        initComponents();        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo_para_formularios_transversal.png"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        btnCerrar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        rbBajados = new javax.swing.JRadioButton();
        rbActivo = new javax.swing.JRadioButton();
        btnLimpiar = new javax.swing.JButton();

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTitulo.setText("Ficha mostrar todos los alumnos");

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "APELLIDO", "NOMBRE", "FECHA DE NACIMIENTO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMostrar);

        rbBajados.setText("Bajados");
        rbBajados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbBajadosMouseClicked(evt);
            }
        });

        rbActivo.setText("Activos");
        rbActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbActivoMouseClicked(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(rbActivo)
                .addGap(216, 216, 216)
                .addComponent(rbBajados)
                .addGap(296, 296, 296)
                .addComponent(btnMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 181, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(135, 135, 135)
                        .addComponent(btnCerrar)
                        .addGap(370, 370, 370))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(524, 524, 524))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBajados)
                    .addComponent(rbActivo)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnLimpiar))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        //ArrayList <Alumno> estudiantes ;
       
        int dni;
        String apellido, nombre, fechaParceada;
        LocalDate fecha;
        boolean estado;

        if (!rbActivo.isSelected() && !rbBajados.isSelected()) {
            JOptionPane.showMessageDialog(null, "No selecciono ninguna opción para mostrar");
        } else if (rbActivo.isSelected()) {
              
            DefaultTableModel tabla = (DefaultTableModel) tablaMostrar.getModel();
            ArrayList<Alumno> arrayAlumnosA = (ArrayList<Alumno>) Menu.alumnoEscritorio.listarHabilitados();

            for (int j = 0; j < arrayAlumnosA.size(); j++) {
                dni = arrayAlumnosA.get(j).getDni();
                apellido = arrayAlumnosA.get(j).getApellido();
                nombre = arrayAlumnosA.get(j).getNombre();
                fecha = arrayAlumnosA.get(j).getFecha_nacimiento();
                fechaParceada = fecha + "";

                tabla.addRow(new Object[]{dni, apellido, nombre, fechaParceada});

            }

        } else if (rbBajados.isSelected()) {
            
            DefaultTableModel tabla = (DefaultTableModel) tablaMostrar.getModel();

            ArrayList<Alumno> arrayAlumnosD = (ArrayList<Alumno>) Menu.alumnoEscritorio.listarDeshabilitados();

            for (int j = 0; j < arrayAlumnosD.size(); j++) {
                dni = arrayAlumnosD.get(j).getDni();
                apellido = arrayAlumnosD.get(j).getApellido();
                nombre = arrayAlumnosD.get(j).getNombre();
                fecha = arrayAlumnosD.get(j).getFecha_nacimiento();
                fechaParceada = fecha + "";

                tabla.addRow(new Object[]{dni, apellido, nombre, fechaParceada});

            }
        }


    }//GEN-LAST:event_btnMostrarActionPerformed

    private void rbActivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbActivoMouseClicked
        // TODO add your handling code here:
          if( rbBajados.isSelected()){
            rbBajados.setSelected(false); 
            rbActivo.setSelected(true);
        } 
    }//GEN-LAST:event_rbActivoMouseClicked

    private void rbBajadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbBajadosMouseClicked
        // TODO add your handling code here:
        if( rbBajados.isSelected()){
            rbBajados.setSelected(true); 
            rbActivo.setSelected(false);
        } 
    }//GEN-LAST:event_rbBajadosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tabla = (DefaultTableModel) tablaMostrar.getModel();
        while (tablaMostrar.getRowCount() > 0){
        tabla.removeRow(0);
       } 
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

   
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbBajados;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables
}
