package Vistas;

import Modelo.*;
import Controlador.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InscripcionesMaterias extends javax.swing.JInternalFrame {
    private int idAlumno = -1;
    private int idMateria = -1;

    public InscripcionesMaterias() {
        initComponents();
        botonTransparente(btnCerrar);
        cargandoAlumnos();
        cargandoMaterias();
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
        jcAlumnos = new javax.swing.JComboBox<>();
        jcMaterias = new javax.swing.JComboBox<>();
        btnInscribir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 450));

        jpFondo.setSize(800, 450);

        jcAlumnos.setBorder(javax.swing.BorderFactory.createTitledBorder("ALUMNO"));
        jcAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnosActionPerformed(evt);
            }
        });

        jcMaterias.setBorder(javax.swing.BorderFactory.createTitledBorder("MATERIA"));
        jcMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriasActionPerformed(evt);
            }
        });

        btnInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnInscribir.setText("Realizar Inscripcion");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
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

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/inscripcion.png"))); // NOI18N
        labelTitulo.setText("Inscripcion a Materia");

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(labelTitulo)
                .addGap(256, 256, 256)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jcMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labelTitulo))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    //Boton Cerrar
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Guargar inscripcion
    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        InscripcionData inscripcionData = Menu.inscripcionEscritorio;
        Alumno alumno = new Alumno();
        Materia materia = new Materia();
        
        //Reconstruyendo 
        alumno = Menu.alumnoEscritorio.buscarAlumno(idAlumno);
        materia = Menu.materiaEscritorio.buscarMateria(idMateria);
        
        Inscripcion inscripcion = new Inscripcion(0, alumno, materia);
        
        inscripcionData.inscribirAlumno(inscripcion);
        
    }//GEN-LAST:event_btnInscribirActionPerformed

    // Obtener ID Alumno - Materia ComboBox
    private void jcAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnosActionPerformed
        List<Alumno> arrayAlumnosA = Menu.alumnoEscritorio.listarHabilitados();
        int posicion = -1;
        posicion = jcAlumnos.getSelectedIndex();
        
        if ( posicion > -1){
            idAlumno = arrayAlumnosA.get(posicion).getId_alumno();
        }
    }//GEN-LAST:event_jcAlumnosActionPerformed

    private void jcMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriasActionPerformed
        List<Materia> arrayMaterias = Menu.materiaEscritorio.listarTodasLasMaterias();
        int posicion = -1;
        posicion = jcMaterias.getSelectedIndex();
        
        if( posicion > -1 ){
            idMateria =  arrayMaterias.get(posicion).getId_materia();
        }
    }//GEN-LAST:event_jcMateriasActionPerformed
    
    //ComboBox alumnos
    private void cargandoAlumnos() {
        jcAlumnos.removeAllItems();
        List<Alumno> arrayAlumnosA = Menu.alumnoEscritorio.listarHabilitados();
        
        for (Alumno alumno : arrayAlumnosA) {
            jcAlumnos.addItem(alumno);
        }
    }

    private void cargandoMaterias() {
        jcMaterias.removeAllItems();
        List<Materia> arrayMaterias = Menu.materiaEscritorio.listarTodasLasMaterias();
        
        for (Materia alumno : arrayMaterias) {
            jcMaterias.addItem(alumno);
        }
    }

    void botonTransparente(javax.swing.JButton b){
        b.setFocusPainted(false);
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JComboBox<Alumno> jcAlumnos;
    private javax.swing.JComboBox<Materia> jcMaterias;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables

}
