package Vistas;

import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Calificaciones extends javax.swing.JInternalFrame {
    private int idAlumno = -1;
    public Calificaciones() {
        initComponents();
        botonTransparente(btnCerrar);
        panelFormularios(jpFondo, 800, 450);
        cargandoAlumnos();
        cargandoMaterias();
    }

    void panelFormularios(JPanel p, int ancho, int alto) {
        p.setSize(ancho, alto);
    }

    void botonTransparente(javax.swing.JButton b) {
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
        btnCerrar = new javax.swing.JButton();
        jcbListaAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jcbListaMaterias = new javax.swing.JComboBox<>();
        jtNota = new javax.swing.JTextField();
        btnGuardarClasificacion = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 450));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jcbListaAlumnos.setBorder(javax.swing.BorderFactory.createTitledBorder("ALUMNOS"));
        jcbListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/clasificaciones.png"))); // NOI18N
        jLabel1.setText("Registro de Clasificaciones");

        jcbListaMaterias.setBorder(javax.swing.BorderFactory.createTitledBorder("MATERIAS"));

        jtNota.setBorder(javax.swing.BorderFactory.createTitledBorder("NOTA"));

        btnGuardarClasificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnGuardarClasificacion.setText("Guardar Nota");
        btnGuardarClasificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClasificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoLayout.createSequentialGroup()
                .addGap(0, 240, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219)
                .addComponent(btnCerrar))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNota)
                    .addComponent(jcbListaMaterias, 0, 458, Short.MAX_VALUE)
                    .addComponent(jcbListaAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarClasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27)
                .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnGuardarClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    
    //ComboBox Alumnos
    private void cargandoAlumnos() {
        List<Alumno> arrayAlumnos = Menu.alumnoEscritorio.listarHabilitados();
        
        for (Alumno alumno : arrayAlumnos) {
            jcbListaAlumnos.addItem(alumno);
        }
    }
    
    private void jcbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosActionPerformed
        List<Alumno> arrayAlumnos = Menu.alumnoEscritorio.listarHabilitados();

        int posicion = -1;
        posicion = jcbListaAlumnos.getSelectedIndex();

        if (posicion > -1) {
             idAlumno = arrayAlumnos.get(posicion).getId_alumno();
        }
        cargandoMaterias();
    }//GEN-LAST:event_jcbListaAlumnosActionPerformed

    private void btnGuardarClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClasificacionActionPerformed
        int posicionAlum = -1 , posicionMateria =-1;
        
         posicionAlum = jcbListaAlumnos.getSelectedIndex();
         posicionMateria = jcbListaMaterias.getSelectedIndex();
         String nota = jtNota.getText();
         double notaParceada = Double.parseDouble(nota);
         
         List<Materia> materiasCursadas = Menu.inscripcionEscritorio.listarCursadaIDAlumno(idAlumno);
         List<Alumno> arrayAlumnos = Menu.alumnoEscritorio.listarHabilitados();
         List<Inscripcion> arrayInscripcion = Menu.inscripcionEscritorio.listarInscripciones();
      
         int id_alumno = arrayAlumnos.get(posicionAlum).getId_alumno();
         int id_materia = materiasCursadas.get(posicionMateria).getId_materia();
         
         for(int i =0 ; i < arrayInscripcion.size() ; i++){
           
             if(arrayInscripcion.get(i).getAlumno().getId_alumno() == id_alumno){
                if(arrayInscripcion.get(i).getMateria().getId_materia() == id_materia){
                    int idInscripcion = arrayInscripcion.get(i).getId_inscripto();
                     Menu.inscripcionEscritorio.actualizarNotaID(idInscripcion,  notaParceada);
                }
             }
             
         }
         
    }//GEN-LAST:event_btnGuardarClasificacionActionPerformed

    //ComboBox Materias
    private void cargandoMaterias(){
        jcbListaMaterias.removeAllItems();
        List<Materia> materiasCursadas = new ArrayList<Materia>();
        materiasCursadas = Menu.inscripcionEscritorio.listarCursadaIDAlumno(idAlumno);
        
        for (Materia materia : materiasCursadas) {
            jcbListaMaterias.addItem(materia);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardarClasificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    private javax.swing.JComboBox<Materia> jcbListaMaterias;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField jtNota;
    // End of variables declaration//GEN-END:variables

}
