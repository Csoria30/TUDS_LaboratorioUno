package Vistas;

import Modelo.Alumno;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.time.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ABMAlumnos extends javax.swing.JInternalFrame {

    public ABMAlumnos() {
        initComponents();
        formatoCalendario();
        inicializarIconosValidacion(false);
        cargandoAlumnoDeshabilitadoV2();
        cargandoAlumnoHabilitadoV3();
        cargandoAlumnosV4();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jtpPanel = new javax.swing.JTabbedPane();
        ImageIcon icon = new ImageIcon ( getClass().getResource("/Imagenes/Fondo_para_formularios_transversal.png") );
        Image image = icon.getImage();
        jpNuevoAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        btnAltaGuardar1 = new javax.swing.JButton();
        btnAltaLimpiar1 = new javax.swing.JButton();
        jtDni1 = new javax.swing.JTextField();
        jtNombre1 = new javax.swing.JTextField();
        jtApellido1 = new javax.swing.JTextField();
        jdFechaNacimiento1 = new com.toedter.calendar.JDateChooser();
        iconDniVerificado = new javax.swing.JLabel();
        iconDniError = new javax.swing.JLabel();
        iconApellidoVerificado = new javax.swing.JLabel();
        iconApellidoError = new javax.swing.JLabel();
        iconNombreVerificado = new javax.swing.JLabel();
        iconNombreError = new javax.swing.JLabel();
        jpAltaAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jcbListaAlumnosDeshabilitados = new javax.swing.JComboBox<>();
        jtApellidoUp2 = new javax.swing.JTextField();
        jtNombreUp2 = new javax.swing.JTextField();
        jdFechaNacimientoDelete2 = new com.toedter.calendar.JDateChooser();
        btnAltaGuardarUp2 = new javax.swing.JButton();
        jtDniUp2 = new javax.swing.JTextField();
        jpBajaAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jcbListaAlumnosHabilitados = new javax.swing.JComboBox<>();
        jtApellidoUp3 = new javax.swing.JTextField();
        jtNombreUp3 = new javax.swing.JTextField();
        jdFechaNacimientoDelete3 = new com.toedter.calendar.JDateChooser();
        jtDniUp3 = new javax.swing.JTextField();
        btnAltaGuardarUp3 = new javax.swing.JButton();
        jpUpdateAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jtDniUp4 = new javax.swing.JTextField();
        jtApellidoUp4 = new javax.swing.JTextField();
        jtNombreUp4 = new javax.swing.JTextField();
        jdFechaNacimientoUp4 = new com.toedter.calendar.JDateChooser();
        btnAltaGuardarUp4 = new javax.swing.JButton();
        jcbListaAlumnosUpDatos = new javax.swing.JComboBox<>();
        btnUpCerrar4 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        btnAltaGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnAltaGuardar1.setText("Guardar");
        btnAltaGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardar1ActionPerformed(evt);
            }
        });

        btnAltaLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/escoba (1).png"))); // NOI18N
        btnAltaLimpiar1.setText("Limpiar");
        btnAltaLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaLimpiar1ActionPerformed(evt);
            }
        });

        jtDni1.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jtDni1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDni1KeyTyped(evt);
            }
        });

        jtNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        jtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombre1KeyTyped(evt);
            }
        });

        jtApellido1.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));
        jtApellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellido1KeyTyped(evt);
            }
        });

        jdFechaNacimiento1.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        iconDniVerificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/verificado.png"))); // NOI18N

        iconDniError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/VerificadoNO.png"))); // NOI18N

        iconApellidoVerificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/verificado.png"))); // NOI18N

        iconApellidoError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/VerificadoNO.png"))); // NOI18N

        iconNombreVerificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/verificado.png"))); // NOI18N

        iconNombreError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/VerificadoNO.png"))); // NOI18N

        javax.swing.GroupLayout jpNuevoAlumnoLayout = new javax.swing.GroupLayout(jpNuevoAlumno);
        jpNuevoAlumno.setLayout(jpNuevoAlumnoLayout);
        jpNuevoAlumnoLayout.setHorizontalGroup(
            jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtApellido1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtNombre1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtDni1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFechaNacimiento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaGuardar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaLimpiar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                        .addComponent(iconDniVerificado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconDniError))
                    .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                        .addComponent(iconApellidoVerificado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconApellidoError))
                    .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                        .addComponent(iconNombreVerificado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconNombreError)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jpNuevoAlumnoLayout.setVerticalGroup(
            jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoAlumnoLayout.createSequentialGroup()
                .addGroup(jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                        .addGroup(jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(iconDniVerificado)
                                    .addComponent(iconDniError))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(iconApellidoVerificado)
                                    .addComponent(iconApellidoError)))
                            .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jtDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconNombreVerificado)
                    .addComponent(iconNombreError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdFechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnAltaGuardar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAltaLimpiar1)
                .addGap(46, 46, 46))
        );

        jtpPanel.addTab("Nuevo Alumno", jpNuevoAlumno);

        jcbListaAlumnosDeshabilitados.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA ALUMNOS"));
        jcbListaAlumnosDeshabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosDeshabilitadosActionPerformed(evt);
            }
        });

        jtApellidoUp2.setEditable(false);
        jtApellidoUp2.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jtNombreUp2.setEditable(false);
        jtNombreUp2.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jdFechaNacimientoDelete2.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));
        jdFechaNacimientoDelete2.setEnabled(false);

        btnAltaGuardarUp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/habilitar.png"))); // NOI18N
        btnAltaGuardarUp2.setText("Dar de alta");
        btnAltaGuardarUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardarUp2ActionPerformed(evt);
            }
        });

        jtDniUp2.setEditable(false);
        jtDniUp2.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        javax.swing.GroupLayout jpAltaAlumnoLayout = new javax.swing.GroupLayout(jpAltaAlumno);
        jpAltaAlumno.setLayout(jpAltaAlumnoLayout);
        jpAltaAlumnoLayout.setHorizontalGroup(
            jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbListaAlumnosDeshabilitados, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDniUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellidoUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombreUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdFechaNacimientoDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAltaGuardarUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpAltaAlumnoLayout.setVerticalGroup(
            jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaAlumnoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jcbListaAlumnosDeshabilitados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jtDniUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtApellidoUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNombreUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jdFechaNacimientoDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAltaGuardarUp2))
        );

        jtpPanel.addTab("Alta de Alumno", jpAltaAlumno);

        jcbListaAlumnosHabilitados.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA ALUMNOS"));
        jcbListaAlumnosHabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosHabilitadosActionPerformed(evt);
            }
        });

        jtApellidoUp3.setEditable(false);
        jtApellidoUp3.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jtNombreUp3.setEditable(false);
        jtNombreUp3.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jdFechaNacimientoDelete3.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        jtDniUp3.setEditable(false);
        jtDniUp3.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        btnAltaGuardarUp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        btnAltaGuardarUp3.setText("Dar de baja");
        btnAltaGuardarUp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardarUp3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBajaAlumnoLayout = new javax.swing.GroupLayout(jpBajaAlumno);
        jpBajaAlumno.setLayout(jpBajaAlumnoLayout);
        jpBajaAlumnoLayout.setHorizontalGroup(
            jpBajaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajaAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpBajaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtApellidoUp3, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtNombreUp3, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtDniUp3)
                    .addComponent(jdFechaNacimientoDelete3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbListaAlumnosHabilitados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaGuardarUp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jpBajaAlumnoLayout.setVerticalGroup(
            jpBajaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBajaAlumnoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jcbListaAlumnosHabilitados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtDniUp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtApellidoUp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNombreUp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdFechaNacimientoDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAltaGuardarUp3)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jtpPanel.addTab("Baja de alumno", jpBajaAlumno);

        jtDniUp4.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        jtApellidoUp4.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jtNombreUp4.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jdFechaNacimientoUp4.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        btnAltaGuardarUp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/recargar.png"))); // NOI18N
        btnAltaGuardarUp4.setText("Actualizar Registro");
        btnAltaGuardarUp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardarUp4ActionPerformed(evt);
            }
        });

        jcbListaAlumnosUpDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA ALUMNOS"));
        jcbListaAlumnosUpDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosUpDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpUpdateAlumnoLayout = new javax.swing.GroupLayout(jpUpdateAlumno);
        jpUpdateAlumno.setLayout(jpUpdateAlumnoLayout);
        jpUpdateAlumnoLayout.setHorizontalGroup(
            jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtApellidoUp4, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                        .addComponent(jtNombreUp4, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                        .addComponent(jtDniUp4)
                        .addComponent(jdFechaNacimientoUp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAltaGuardarUp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jcbListaAlumnosUpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jpUpdateAlumnoLayout.setVerticalGroup(
            jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUpdateAlumnoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jcbListaAlumnosUpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDniUp4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtApellidoUp4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNombreUp4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jdFechaNacimientoUp4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnAltaGuardarUp4)
                .addGap(47, 47, 47))
        );

        jtpPanel.addTab("Actualizar Datos Personales", jpUpdateAlumno);

        btnUpCerrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnUpCerrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpCerrar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPanel)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpCerrar4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnUpCerrar4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializarIconosValidacion(boolean e){
        iconDniVerificado.setVisible(e);
        iconDniError.setVisible(e);
        iconApellidoVerificado.setVisible(e);
        iconApellidoError.setVisible(e);
        iconNombreVerificado.setVisible(e);
        iconNombreError.setVisible(e);
    }
    
    //Solapa 2 - Alta de Alumno
    private void cargandoAlumnoDeshabilitadoV2() {
        jcbListaAlumnosDeshabilitados.removeAllItems();
        List <Alumno> arrayAlumnosD = Menu.alumnoEscritorio.listarDeshabilitados();
        for (Alumno alumno : arrayAlumnosD) {
            jcbListaAlumnosDeshabilitados.addItem(alumno);
        }  
    }
    
    //Solapa 2 - Alta de alumno -> guarda los cambios
    private void btnAltaGuardarUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardarUp2ActionPerformed
            
        String dni = jtDniUp2.getText();
        String apellido = jtApellidoUp2.getText();
        String nombre = jtNombreUp2.getText();
        LocalDate fechaNacimiento = jdFechaNacimientoDelete2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
        if (!dni.isEmpty() ) {
            int dniParceado = Integer.parseInt(dni);
           // iconDniVerificado.setVisible(true);
           // iconDniError.setVisible(false);
        if (!apellido.isEmpty()) {
        if (!nombre.isEmpty()) {
            Alumno estudiante = new Alumno(dniParceado, apellido, nombre, fechaNacimiento, true);
            List<Alumno> arrayAlumnosD = Menu.alumnoEscritorio.listarDeshabilitados();
                        
            if(arrayAlumnosD.size() >= 0 ){
                          
                int posicion = jcbListaAlumnosDeshabilitados.getSelectedIndex();
                int id = arrayAlumnosD.get(posicion).getId_alumno();
                            
                Menu.alumnoEscritorio.habilitarAlumno(id);
                Menu.alumnoEscritorio.actualizarAlumno(estudiante);
                Menu.alumnoEscritorio.listarHabilitados();
                Menu.alumnoEscritorio.listarDeshabilitados();
                            
                limparCamposVista2();
                cargandoAlumnoDeshabilitadoV2();
                cargandoAlumnoHabilitadoV3();
            }             
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtNombreUp2.requestFocus(); }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un apellido", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtApellidoUp2.requestFocus(); }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            //iconDniVerificado.setVisible(false);
            //iconDniError.setVisible(true);
            jtDniUp2.requestFocus(); }    
    }//GEN-LAST:event_btnAltaGuardarUp2ActionPerformed

    //Solapa 2 - Alta de alumno -> Limpiar Campos
    private void limparCamposVista2(){
        jtDniUp2.setText("");
        jtApellidoUp2.setText("");
        jtNombreUp2.setText("");
        jdFechaNacimientoDelete2.setDate(new Date());
    }
    
    //Solapa 4 - Actualizar Datos -> Carga datos del registro
    private void cargandoAlumnosV4() {
        jcbListaAlumnosUpDatos.removeAllItems();
        List <Alumno> arrayAlumnos =  Menu.alumnoEscritorio.listarTodosAlumnos();
        
        for (Alumno alumno : arrayAlumnos) {
            jcbListaAlumnosUpDatos.addItem(alumno);
        }
          
    }
    
    //Solapa 4 - Actualizar Datos -> Btn guardar datos
    private void btnAltaGuardarUp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardarUp4ActionPerformed
        String dni = jtDniUp4.getText();
        String apellido = jtApellidoUp4.getText();
        String nombre = jtNombreUp4.getText();
        LocalDate fechaNacimiento = jdFechaNacimientoUp4.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        if (!dni.isEmpty()) {
            int dniParceado = Integer.parseInt(dni);
        if (!apellido.isEmpty()) {
        if (!nombre.isEmpty()) {
            
            Alumno estudiante = new Alumno(dniParceado, apellido, nombre, fechaNacimiento);
            Menu.alumnoEscritorio.actualizarAlumno(estudiante);
                            
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtNombre1.requestFocus(); }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un apellido", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtApellido1.requestFocus(); }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            iconDniVerificado.setVisible(false);
            iconDniError.setVisible(true);
            jtDni1.requestFocus(); }
    }//GEN-LAST:event_btnAltaGuardarUp4ActionPerformed

    // Boton Cerrar panel
    private void btnUpCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpCerrar4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnUpCerrar4ActionPerformed
 
    //Solapa 3 - Baja de alumno -> Cargando datos del alumno
    private void cargandoAlumnoHabilitadoV3() {
        jcbListaAlumnosHabilitados.removeAllItems();
        List<Alumno> arrayAlumnosA = Menu.alumnoEscritorio.listarHabilitados();
        
        for (Alumno alumno : arrayAlumnosA) {
            jcbListaAlumnosHabilitados.addItem(alumno);
        } 
    }

    //Solapa 3 - Baja de alumno -> Btn guardar datos
    private void btnAltaGuardarUp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardarUp3ActionPerformed
        String dni = jtDniUp3.getText();
        int dniParceado = Integer.parseInt(dni);
        String apellido = jtApellidoUp3.getText();
        String nombre = jtNombreUp3.getText();
        LocalDate fechaNacimiento = jdFechaNacimientoDelete3.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int posicion = 0 , id = 0;
        
        if (!dni.isEmpty() ) {
           // iconDniVerificado.setVisible(true);
           // iconDniError.setVisible(false);
        if (!apellido.isEmpty()) {
        if (!nombre.isEmpty()) {
            Alumno estudiante = new Alumno(dniParceado, apellido, nombre, fechaNacimiento, true);
            List<Alumno> arrayAlumnosA = Menu.alumnoEscritorio.listarHabilitados();
            
            if(arrayAlumnosA.size() >= 0 ){
                posicion = jcbListaAlumnosHabilitados.getSelectedIndex();
                id = arrayAlumnosA.get(posicion).getId_alumno();
                            
                Menu.alumnoEscritorio.deshabilitandoAlumno(id);
                Menu.alumnoEscritorio.actualizarAlumno(estudiante);
                Menu.alumnoEscritorio.listarHabilitados();
                Menu.alumnoEscritorio.listarDeshabilitados();
                cargandoAlumnoHabilitadoV3();
                cargandoAlumnoDeshabilitadoV2();
            }             
                
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtNombreUp3.requestFocus(); }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un apellido", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtApellidoUp3.requestFocus(); }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            //iconDniVerificado.setVisible(false);
            //iconDniError.setVisible(true);
            jtDni1.requestFocus(); }
    }//GEN-LAST:event_btnAltaGuardarUp3ActionPerformed

    //Solapa 3 - Baja de alumno -> Limpiar Campos
    private void limparCamposVista3(){
        jtDniUp3.setText("");
        jtApellidoUp3.setText("");
        jtNombreUp3.setText("");
        jdFechaNacimientoDelete3.setDate(new Date());
    }
    
    //Solapa 1 - Alta de alumno -> Limpiar Campos
    private void btnAltaLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaLimpiar1ActionPerformed
        jtDni1.setText("");
        jtApellido1.setText("");
        jtNombre1.setText("");
        jdFechaNacimiento1.setDate(new Date());
    }//GEN-LAST:event_btnAltaLimpiar1ActionPerformed

    //Solapa 1 - Alta de alumno -> btn Guargar registro
    private void btnAltaGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardar1ActionPerformed

        String dni = jtDni1.getText();
        String apellido = jtApellido1.getText();
        String nombre = jtNombre1.getText();
        LocalDate fechaNacimiento = jdFechaNacimiento1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        if (!dni.isEmpty()) {
            int dniParceado = Integer.parseInt(dni);
            iconDniVerificado.setVisible(true);
            iconDniError.setVisible(false);
        if (!apellido.isEmpty()) {
            iconApellidoVerificado.setVisible(true);
            iconApellidoError.setVisible(false);
        if (!nombre.isEmpty()) {
            iconNombreVerificado.setVisible(true);
            iconNombreError.setVisible(false);
            
            Alumno estudiante = new Alumno(dniParceado, apellido, nombre, fechaNacimiento, true);
            Menu.alumnoEscritorio.guardarAlumno(estudiante);
            Menu.alumnoEscritorio.actualizarAlumno(estudiante);
                        
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            iconNombreVerificado.setVisible(false);
            iconNombreError.setVisible(true);
            jtNombre1.requestFocus(); }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un apellido", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            iconApellidoVerificado.setVisible(false);
            iconApellidoError.setVisible(true);
            jtApellido1.requestFocus(); }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            iconDniVerificado.setVisible(false);
            iconDniError.setVisible(true);
            jtDni1.requestFocus();
        }
    }//GEN-LAST:event_btnAltaGuardar1ActionPerformed

       
    //Solapa 2 - Alta de alumno -> Cargar Datos del furmulario Items ComboBox
    private void jcbListaAlumnosDeshabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosDeshabilitadosActionPerformed
        List<Alumno> arrayAlumnosD = Menu.alumnoEscritorio.listarDeshabilitados();
        int posicion = jcbListaAlumnosDeshabilitados.getSelectedIndex();
        
        if (posicion > -1 ) {
            jtNombreUp2.setText(arrayAlumnosD.get(posicion).getNombre());
            jtApellidoUp2.setText(arrayAlumnosD.get(posicion).getApellido());
            jtDniUp2.setText(arrayAlumnosD.get(posicion).getDni() + "");
            jdFechaNacimientoDelete2.setDateFormatString(arrayAlumnosD.get(posicion).getFecha_nacimiento() + "");
        }
        
    }//GEN-LAST:event_jcbListaAlumnosDeshabilitadosActionPerformed

    //Solapa 3 - Baja de alumno -> Cargar Datos del furmulario Items ComboBox
    private void jcbListaAlumnosHabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosHabilitadosActionPerformed
        List<Alumno> arrayAlumnosA = Menu.alumnoEscritorio.listarHabilitados();
        int posicion = jcbListaAlumnosHabilitados.getSelectedIndex();
        
        if (posicion > -1 ) {
            jtNombreUp3.setText(arrayAlumnosA.get(posicion).getNombre());
            jtApellidoUp3.setText(arrayAlumnosA.get(posicion).getApellido());
            jtDniUp3.setText(arrayAlumnosA.get(posicion).getDni() + "");
            jdFechaNacimientoDelete3.setDateFormatString(arrayAlumnosA.get(posicion).getFecha_nacimiento() + "");
        }
    }//GEN-LAST:event_jcbListaAlumnosHabilitadosActionPerformed

    //Solapa 4 - Actualizar Datos -> Cargar Datos del furmulario Items ComboBox
    private void jcbListaAlumnosUpDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosUpDatosActionPerformed
        List<Alumno> arrayAlumnos = Menu.alumnoEscritorio.listarTodosAlumnos();
        int posicion = jcbListaAlumnosUpDatos.getSelectedIndex();
        
        if (posicion > -1 ) {
            jtNombreUp4.setText(arrayAlumnos.get(posicion).getNombre());
                jtApellidoUp4.setText(arrayAlumnos.get(posicion).getApellido());
                jtDniUp4.setText(arrayAlumnos.get(posicion).getDni() + "");
                jdFechaNacimientoUp4.setDateFormatString(arrayAlumnos.get(posicion).getFecha_nacimiento() + "");
        }else if (posicion == -1){
            JOptionPane.showMessageDialog(null, "No se encuentran alumno para dar de alta", "",JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_jcbListaAlumnosUpDatosActionPerformed
    
    //Solapa 1 - Alta de alumno / Apellido -> Validacion de solo letras
    private void jtApellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellido1KeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
            
        if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellido1KeyTyped
    
    //Solapa 1 - Alta de alumno / Nombre -> Validacion de solo letras
    private void jtNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombre1KeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
            
        if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombre1KeyTyped

    //Solapa 1 - Alta de alumno / DNI -> Validacion de solo numeros
    private void jtDni1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDni1KeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }

        if (jtDni1.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDni1KeyTyped
    
    
    public void formatoCalendario(){
        //jdFechaNacimiento.setLocale(new Locale("es"));
        //jdFechaNacimiento.setDateFormatString("dd-MM-yyyy");
       
        jdFechaNacimiento1.setDate(new Date());
        jdFechaNacimientoDelete2.setDate(new Date());
        jdFechaNacimientoUp4.setDate(new Date());
        jdFechaNacimientoDelete3.setDate(new Date());
        //jdFechaNacimientoDelete2.getJCalendar().setMaxSelectableDate(new Date());
        jdFechaNacimiento1.getJCalendar().setMaxSelectableDate(new Date());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaGuardar1;
    private javax.swing.JButton btnAltaGuardarUp2;
    private javax.swing.JButton btnAltaGuardarUp3;
    private javax.swing.JButton btnAltaGuardarUp4;
    private javax.swing.JButton btnAltaLimpiar1;
    private javax.swing.JButton btnUpCerrar4;
    private javax.swing.JLabel iconApellidoError;
    private javax.swing.JLabel iconApellidoVerificado;
    private javax.swing.JLabel iconDniError;
    private javax.swing.JLabel iconDniVerificado;
    private javax.swing.JLabel iconNombreError;
    private javax.swing.JLabel iconNombreVerificado;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnosDeshabilitados;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnosHabilitados;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnosUpDatos;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento1;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoDelete2;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoDelete3;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoUp4;
    private javax.swing.JPanel jpAltaAlumno;
    private javax.swing.JPanel jpBajaAlumno;
    private javax.swing.JPanel jpNuevoAlumno;
    private javax.swing.JPanel jpUpdateAlumno;
    private javax.swing.JTextField jtApellido1;
    private javax.swing.JTextField jtApellidoUp2;
    private javax.swing.JTextField jtApellidoUp3;
    private javax.swing.JTextField jtApellidoUp4;
    private javax.swing.JTextField jtDni1;
    private javax.swing.JTextField jtDniUp2;
    private javax.swing.JTextField jtDniUp3;
    private javax.swing.JTextField jtDniUp4;
    private javax.swing.JTextField jtNombre1;
    private javax.swing.JTextField jtNombreUp2;
    private javax.swing.JTextField jtNombreUp3;
    private javax.swing.JTextField jtNombreUp4;
    private javax.swing.JTabbedPane jtpPanel;
    // End of variables declaration//GEN-END:variables

  

   

    
}
