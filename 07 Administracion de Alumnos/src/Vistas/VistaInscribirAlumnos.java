package Vistas;

import Clases.Alumno;
import Clases.Materia;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class VistaInscribirAlumnos extends javax.swing.JInternalFrame {

    private HashSet <Alumno> hashAlumnos;
    private HashSet <Materia> hashMaterias;
    
    public VistaInscribirAlumnos( HashSet <Alumno> hashAlumnos, HashSet<Materia> hashMaterias) {
        initComponents();
        
        this.hashMaterias = hashMaterias;
        this.hashAlumnos = hashAlumnos;
        
        agregarMateria();
        agregarAlumno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbElegirMateria = new javax.swing.JComboBox<>();
        jcbElegirAlumno = new javax.swing.JComboBox<>();
        jbInscribir = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_cantidadInscripciones = new javax.swing.JButton();
        label_Titulo = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();

        panel_fondo.setBackground(new java.awt.Color(255, 255, 255));
        panel_fondo.setMinimumSize(new java.awt.Dimension(750, 500));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Elija una Materia: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Elija un Alumno:");

        jcbElegirMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcbElegirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbElegirMateriaActionPerformed(evt);
            }
        });

        jcbElegirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbElegirAlumnoActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        btn_cantidadInscripciones.setText("Cantidad de inscripciones");
        btn_cantidadInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cantidadInscripcionesActionPerformed(evt);
            }
        });

        label_Titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label_Titulo.setText("Inscripciones a materias");

        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout panel_fondoLayout = new javax.swing.GroupLayout(panel_fondo);
        panel_fondo.setLayout(panel_fondoLayout);
        panel_fondoLayout.setHorizontalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_logo)
                .addContainerGap())
            .addGroup(panel_fondoLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(label_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_fondoLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btn_cantidadInscripciones)
                .addGap(54, 54, 54)
                .addComponent(jbInscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jbCerrar)
                .addGap(101, 101, 101))
            .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_fondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_fondoLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(26, 26, 26)
                            .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcbElegirMateria, 0, 473, Short.MAX_VALUE)
                                .addComponent(jcbElegirAlumno, 0, 473, Short.MAX_VALUE))
                            .addGap(98, 98, 98))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fondoLayout.createSequentialGroup()
                            .addComponent(jSeparator1)
                            .addContainerGap()))))
        );
        panel_fondoLayout.setVerticalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cantidadInscripciones)
                    .addComponent(jbInscribir)
                    .addComponent(jbCerrar))
                .addGap(47, 47, 47)
                .addComponent(label_logo)
                .addContainerGap())
            .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_fondoLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)
                    .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jcbElegirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jcbElegirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(264, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbElegirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbElegirMateriaActionPerformed
    }//GEN-LAST:event_jcbElegirMateriaActionPerformed

    private void jcbElegirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbElegirAlumnoActionPerformed
    }//GEN-LAST:event_jcbElegirAlumnoActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        try{
            Alumno alumnoSeleccionado = (Alumno)jcbElegirAlumno.getSelectedItem();
            Materia materiaSeleccionada = (Materia)jcbElegirMateria.getSelectedItem();
            alumnoSeleccionado.agregarMateria(materiaSeleccionada);
        }catch(java.lang.NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Debe tener registrado al menos una materia y un alumno.");
        }

    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void btn_cantidadInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cantidadInscripcionesActionPerformed
        try{    
            Alumno alumnoSeleccionado = (Alumno)jcbElegirAlumno.getSelectedItem();
            Integer nMaterias = alumnoSeleccionado.cantidadMaterias();
            JOptionPane.showMessageDialog(null,"Total de inscripciones: " + nMaterias);
        }catch(java.lang.NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Primero debe registrar un alumno");
        }
    }//GEN-LAST:event_btn_cantidadInscripcionesActionPerformed

    
    private void agregarMateria(){
        for ( Materia materia_n : hashMaterias){
            jcbElegirMateria.addItem(materia_n);
        }
    }
    
    private void agregarAlumno(){
        for ( Alumno alumno_n : hashAlumnos){
            jcbElegirAlumno.addItem(alumno_n);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cantidadInscripciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JComboBox<Alumno> jcbElegirAlumno;
    private javax.swing.JComboBox<Materia> jcbElegirMateria;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_logo;
    private javax.swing.JPanel panel_fondo;
    // End of variables declaration//GEN-END:variables
}
