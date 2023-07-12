package Vistas;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
public class ListaInscripcionesAMaterias extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo=new DefaultTableModel();
    private int idMateriaSeleccionada=-1;

    public ListaInscripcionesAMaterias() {
        initComponents();
        botonTransparente(btnCerrar);
        cargandoMaterias();
        armarCabecera();
        llenartabla();
    }


    void botonTransparente(javax.swing.JButton b){
        b.setFocusPainted(false);
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo_para_formularios_transversal.png"));
        Image image = icon.getImage();
        jpFondo = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jcMaterias = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        jpEstado = new javax.swing.JPanel();
        jrbNoInscriptos = new javax.swing.JRadioButton();
        jrbInscriptos = new javax.swing.JRadioButton();

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Apellido", "Nombre", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMostrar);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png"))); // NOI18N
        jLabel2.setText("Ficha Mostrar Todos los Alumnos inscripto a una Materia");

        jcMaterias.setBorder(javax.swing.BorderFactory.createTitledBorder("MATERIA"));
        jcMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriasActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jpEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de los alumnos"));
        jpEstado.setBackground(new Color(0,0,0,0));

        jrbNoInscriptos.setText("No Inscriptos");
        jrbNoInscriptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptosActionPerformed(evt);
            }
        });

        jrbInscriptos.setText("Inscriptos");
        jrbInscriptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEstadoLayout = new javax.swing.GroupLayout(jpEstado);
        jpEstado.setLayout(jpEstadoLayout);
        jpEstadoLayout.setHorizontalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEstadoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jrbInscriptos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jrbNoInscriptos)
                .addGap(70, 70, 70))
        );
        jpEstadoLayout.setVerticalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbNoInscriptos)
                    .addComponent(jrbInscriptos))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel2)
                .addGap(126, 126, 126)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addComponent(jcMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jrbInscriptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptosActionPerformed
        // TODO add your handling code here:
        jrbInscriptos.setSelected(true);
        jrbNoInscriptos.setSelected(false);
        llenartabla();
    }//GEN-LAST:event_jrbInscriptosActionPerformed

    private void jrbNoInscriptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptosActionPerformed
        // TODO add your handling code here:
        jrbInscriptos.setSelected(false);
        jrbNoInscriptos.setSelected(true);
        llenartabla();

    }//GEN-LAST:event_jrbNoInscriptosActionPerformed

    private void jcMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriasActionPerformed
        // TODO add your handling code here:
        
        List<Materia> arrayMaterias= Menu.materiaEscritorio.listarMateriasHabilitadas();
        int posicion=-1;
        posicion=jcMaterias.getSelectedIndex();
        if(posicion>-1){
            idMateriaSeleccionada=arrayMaterias.get(posicion).getId_materia();
            
        }
    }//GEN-LAST:event_jcMateriasActionPerformed

    
    private void cargandoMaterias(){
        jcMaterias.removeAllItems();
        List<Materia> ArrayMaterias = Menu.materiaEscritorio.listarTodasLasMaterias();
        for (Materia ArrayMateria : ArrayMaterias) {
            jcMaterias.addItem(ArrayMateria);
        }
    }
    
    private void armarCabecera(){
        ArrayList<Object> titulos=new ArrayList<>();
        titulos.add("Apellido");
        titulos.add("Nombre");
        titulos.add("Dni");
        for (Object titulo : titulos) {
            modelo.addColumn(titulo);
        }
        tablaMostrar.setModel(modelo);
    }
    
    private void llenartabla(){
        borrarFilas();
        if(jrbInscriptos.isSelected()){
            List<Alumno> listaInscriptos=Menu.inscripcionEscritorio.buscarInscripcionIDMateria(idMateriaSeleccionada);
            for (Alumno m : listaInscriptos) {
                modelo.addRow(new Object[]{m.getApellido(),m.getNombre(),m.getDni()});
            }
        }else{
            List<Alumno>listaNoInscriptos=Menu.inscripcionEscritorio.buscarNoInscripcionIdmateria(idMateriaSeleccionada);
            for (Alumno listaNoInscripto : listaNoInscriptos) {
                modelo.addRow(new Object[]{listaNoInscripto.getApellido(),listaNoInscripto.getNombre(),listaNoInscripto.getDni()});
            }
        }
    }
    
     private void borrarFilas(){
        int filas=modelo.getRowCount()-1;
        for(int i=filas;i >=0;i--){
            modelo.removeRow(i);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Materia> jcMaterias;
    private javax.swing.JPanel jpEstado;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JRadioButton jrbInscriptos;
    private javax.swing.JRadioButton jrbNoInscriptos;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables
}
