 package Vistas;

import Controlador.*;
import Modelo.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaMaterias extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public ListaMaterias() {
        initComponents();
        armarCabecera();
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
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        jpEstadoMaterias = new javax.swing.JPanel();
        jrbMateriasActivas = new javax.swing.JRadioButton();
        jrbMateriasNoActivas = new javax.swing.JRadioButton();

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png"))); // NOI18N
        labelTitulo.setText("Ficha mostrar todas las materias");

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "YEAR", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMostrar);

        jpEstadoMaterias.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de las materias"));
        jpEstadoMaterias.setBackground(new Color(0,0,0,0));

        jrbMateriasActivas.setText("Activas");
        jrbMateriasActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasActivasActionPerformed(evt);
            }
        });

        jrbMateriasNoActivas.setText("No Activas");
        jrbMateriasNoActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasNoActivasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEstadoMateriasLayout = new javax.swing.GroupLayout(jpEstadoMaterias);
        jpEstadoMaterias.setLayout(jpEstadoMateriasLayout);
        jpEstadoMateriasLayout.setHorizontalGroup(
            jpEstadoMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoMateriasLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jrbMateriasActivas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jrbMateriasNoActivas)
                .addGap(147, 147, 147))
        );
        jpEstadoMateriasLayout.setVerticalGroup(
            jpEstadoMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEstadoMateriasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpEstadoMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMateriasActivas)
                    .addComponent(jrbMateriasNoActivas))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(labelTitulo)
                .addGap(202, 202, 202)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jpEstadoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelTitulo))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jpEstadoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    
    //Radio Buttons
    private void jrbMateriasActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasActivasActionPerformed
        jrbMateriasActivas.setSelected(true);
        jrbMateriasNoActivas.setSelected(false);
        llenarTabla();
    }//GEN-LAST:event_jrbMateriasActivasActionPerformed

    private void jrbMateriasNoActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasNoActivasActionPerformed
        jrbMateriasActivas.setSelected(false);
        jrbMateriasNoActivas.setSelected(true);
        llenarTabla();
    }//GEN-LAST:event_jrbMateriasNoActivasActionPerformed

    //Cabecera Tabla
    private void armarCabecera() {
        ArrayList<Object> titulos = new ArrayList<>();
        titulos.add("Nombre");
        titulos.add("Año");
        
        for(Object tit:titulos){
            modelo.addColumn(tit);
        }
        tablaMostrar.setModel(modelo);
    }

    //Llenar Tabla
    private void llenarTabla(){
        borrarFilas();
        if ( jrbMateriasActivas.isSelected() ){
            List <Materia> materiasActivas = Menu.materiaEscritorio.listarMateriasHabilitadas();
            
            for(Materia m : materiasActivas){
                modelo.addRow(new Object[]{ m.getNombre(), m.getAnio() });
            }
        }else{
            List <Materia> materiasNOActivas = Menu.materiaEscritorio.listarMateriasNOHabilitadas();
            
            for(Materia m : materiasNOActivas){
                modelo.addRow(new Object[]{ m.getNombre(), m.getAnio() });
            }
        }
    }
    
    //Limpiar Tabla
    private void borrarFilas(){
    
        int filas=modelo.getRowCount()-1;
        for(int i=filas;i >=0;i--){
        
            modelo.removeRow(i);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpEstadoMaterias;
    private javax.swing.JRadioButton jrbMateriasActivas;
    private javax.swing.JRadioButton jrbMateriasNoActivas;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables
}
