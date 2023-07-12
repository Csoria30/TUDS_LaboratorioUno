/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.Comentarios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class GestionesInternasHistorialComentarios extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    public GestionesInternasHistorialComentarios() {
        initComponents();
        armarCabecera();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdComentario", "Comentario", "Fecha de Avance", "IdTarea"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMostrar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaMostrar);
        if (tablaMostrar.getColumnModel().getColumnCount() > 0) {
            tablaMostrar.getColumnModel().getColumn(0).setResizable(false);
            tablaMostrar.getColumnModel().getColumn(1).setResizable(false);
            tablaMostrar.getColumnModel().getColumn(2).setResizable(false);
            tablaMostrar.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRefrescar.setText("Refrescar");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefrescar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(btnRefrescar))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu.GIHC.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        // TODO add your handling code here:
        llenarTabla();
    }//GEN-LAST:event_btnRefrescarActionPerformed

                /*|--------------------|*/   
                /*|        Tabla       |*/   
                /*|--------------------|*/
    // Tabla - Cabecera   

    private void armarCabecera(){   

            ArrayList<Object> titulos=new ArrayList<>();   
            titulos.add("IdComentarios");   
            titulos.add("Comentario");   
            titulos.add("Fecha de Avance");  
            titulos.add("IdTarea"); 
            for (Object titulo : titulos) {  
                modelo.addColumn(titulo);  
            }  
            tablaMostrar.setModel(modelo);  
        }  
    // Tabla - Llenar tabla   

    private void llenarTabla(){   
            borrarFilas(); 
            List<Comentarios> listarComentarios = Menu.comentarioDataLocal.listarComentariosTareas(Menu.tareaSeleccionadaTabla);   
            for (Comentarios LC : listarComentarios)  
            {  
                modelo.addRow(new Object[]{LC.getId_comentario(),LC.getComentario(),LC.getFecha_avance(),LC.getTarea().getId_tarea()});  
            }   
    }  
    // Tabla - Borrar Filas   

    private void borrarFilas(){   
            int filas=modelo.getRowCount()-1;  
            for(int i=filas;i >=0;i--){  
                modelo.removeRow(i);  
            }  
        } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables
}