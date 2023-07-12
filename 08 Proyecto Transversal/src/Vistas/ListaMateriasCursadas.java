
package Vistas;
import Controlador.InscripcionData;
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

public class ListaMateriasCursadas extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    private int dniAlumnoSeleccionado = -1;
    private int idAlumnoSeleccionado = -1;
    
    public ListaMateriasCursadas() {
        initComponents();
        cargandoAlumnos();
        armarCabecera();
        llenarTabla();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        jcAlumnos = new javax.swing.JComboBox<>();
        labelTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jpEstadoAlumnos = new javax.swing.JPanel();
        jrbInscriptos = new javax.swing.JRadioButton();
        jrbNoInscriptos = new javax.swing.JRadioButton();

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tablaMostrar);

        jcAlumnos.setBorder(javax.swing.BorderFactory.createTitledBorder("Alumno"));
        jcAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnosActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png"))); // NOI18N
        labelTitulo.setText("Ficha Mostrar Todas las Materias Inscripto un Alumno");

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jpEstadoAlumnos.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de los alumnos"));
        jpEstadoAlumnos.setBackground(new Color(0,0,0,0));

        jrbInscriptos.setText("Inscriptos");
        jrbInscriptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptosActionPerformed(evt);
            }
        });

        jrbNoInscriptos.setText("No Inscriptos");
        jrbNoInscriptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEstadoAlumnosLayout = new javax.swing.GroupLayout(jpEstadoAlumnos);
        jpEstadoAlumnos.setLayout(jpEstadoAlumnosLayout);
        jpEstadoAlumnosLayout.setHorizontalGroup(
            jpEstadoAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoAlumnosLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jrbInscriptos)
                .addGap(122, 122, 122)
                .addComponent(jrbNoInscriptos)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jpEstadoAlumnosLayout.setVerticalGroup(
            jpEstadoAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEstadoAlumnosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpEstadoAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInscriptos)
                    .addComponent(jrbNoInscriptos))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(labelTitulo)
                .addGap(174, 174, 174)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jpEstadoAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelTitulo))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jpEstadoAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    //Materias no inscriptas
    private void jrbNoInscriptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptosActionPerformed
        jrbInscriptos.setSelected(false);
        jrbNoInscriptos.setSelected(true);
        llenarTabla();
    }//GEN-LAST:event_jrbNoInscriptosActionPerformed

    //Materias inscriptas
    private void jrbInscriptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptosActionPerformed
        jrbNoInscriptos.setSelected(false);
        jrbInscriptos.setSelected(true);
        llenarTabla();
    }//GEN-LAST:event_jrbInscriptosActionPerformed

    //Obteniendo DNI alumno seleccionado comboBox
    private void jcAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnosActionPerformed
        ArrayList <Alumno> arrayAlumnos = (ArrayList<Alumno>) Menu.alumnoEscritorio.listarTodosAlumnos();
        int posicion = -1;
        posicion= jcAlumnos.getSelectedIndex();
        
        if (posicion > -1 ) {
            dniAlumnoSeleccionado = arrayAlumnos.get(posicion).getDni();
            idAlumnoSeleccionado = arrayAlumnos.get(posicion).getId_alumno();
        }
        
    }//GEN-LAST:event_jcAlumnosActionPerformed

    //Cargar comboBox lista de Alumnos
    private void cargandoAlumnos() {
        jcAlumnos.removeAllItems();
        ArrayList <Alumno> arrayAlumnos = (ArrayList<Alumno>) Menu.alumnoEscritorio.listarTodosAlumnos();
        
        for (Alumno alumno : arrayAlumnos) {
            jcAlumnos.addItem(alumno);
        }
    }

    //Cabecera Tabla
    private void armarCabecera() {
        ArrayList<Object> titulos=new ArrayList<>();
        titulos.add("Materia");
        titulos.add("Año");
        for(Object tit:titulos){
        
            modelo.addColumn(tit);
        }
        tablaMostrar.setModel(modelo);
    }
    
    //Llenar tabla
    private void llenarTabla(){
        borrarFilas();
        if ( jrbInscriptos.isSelected() ){
            List <Inscripcion> listaInscriptos = Menu.inscripcionEscritorio.listarInscripcionesDNIsuario(idAlumnoSeleccionado);
            
            for(Inscripcion m : listaInscriptos){
                modelo.addRow(new Object[]{ m.getMateria().getNombre(), m.getMateria().getAnio() });
            }
        }else{
            List <Materia> listaNoInscriptos = Menu.inscripcionEscritorio.listarNOInscripcionesDNIsuario(idAlumnoSeleccionado);
        
            for(Materia m : listaNoInscriptos){
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
    private javax.swing.JComboBox<Alumno> jcAlumnos;
    private javax.swing.JPanel jpEstadoAlumnos;
    private javax.swing.JRadioButton jrbInscriptos;
    private javax.swing.JRadioButton jrbNoInscriptos;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables

    
}
