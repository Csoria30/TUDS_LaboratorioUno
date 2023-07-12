package Vistas;

import Modelo.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ABMMaterias extends javax.swing.JInternalFrame {

    public ABMMaterias() {
        initComponents();
        mostrandoMateriasV2();
        mostrandoTodasMateriasV3();
        mostrarMateriasV4();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpMaterias = new javax.swing.JTabbedPane();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo_para_formularios_transversal.png"));
        Image image = icon.getImage();
        jpNuevaMateria = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        btnMateriaNuevaGuardar = new javax.swing.JButton();
        btnMateriaNuevaLimpiar = new javax.swing.JButton();
        jtMateriaNuevaNueva = new javax.swing.JTextField();
        jtMateriaNuevaAnio = new javax.swing.JTextField();
        jpBajaMateria = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jcbMateriaBajaListaHab = new javax.swing.JComboBox<>();
        btnMateriaBajaEliminar = new javax.swing.JButton();
        jtMateriaBajaAnio = new javax.swing.JTextField();
        jtMateriaBajaNombre = new javax.swing.JTextField();
        jpActualizarDatosMateria = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jtMateriaUpAnio = new javax.swing.JTextField();
        jcbMateriaUpMaterias = new javax.swing.JComboBox<>();
        jtMateriaUpNombre = new javax.swing.JTextField();
        btnMateriaUp = new javax.swing.JButton();
        jtMateriaUpID = new javax.swing.JTextField();
        jpAltaMateria = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jcbMateriaAltaListaNoHab = new javax.swing.JComboBox<>();
        jtMateriaAltaNombre = new javax.swing.JTextField();
        jtMateriaAltaAnio = new javax.swing.JTextField();
        btnMateriaAltaHabilitar = new javax.swing.JButton();
        btnCerrarmaterias = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        btnMateriaNuevaGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnMateriaNuevaGuardar.setText("Guardar");
        btnMateriaNuevaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaNuevaGuardarActionPerformed(evt);
            }
        });

        btnMateriaNuevaLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/escoba (1).png"))); // NOI18N
        btnMateriaNuevaLimpiar.setText("Limpiar");
        btnMateriaNuevaLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaNuevaLimpiarActionPerformed(evt);
            }
        });

        jtMateriaNuevaNueva.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jtMateriaNuevaAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("AÑO"));
        jtMateriaNuevaAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMateriaNuevaAnioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpNuevaMateriaLayout = new javax.swing.GroupLayout(jpNuevaMateria);
        jpNuevaMateria.setLayout(jpNuevaMateriaLayout);
        jpNuevaMateriaLayout.setHorizontalGroup(
            jpNuevaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevaMateriaLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jpNuevaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtMateriaNuevaAnio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtMateriaNuevaNueva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(btnMateriaNuevaGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMateriaNuevaLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jpNuevaMateriaLayout.setVerticalGroup(
            jpNuevaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevaMateriaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jtMateriaNuevaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMateriaNuevaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnMateriaNuevaGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnMateriaNuevaLimpiar)
                .addGap(32, 32, 32))
        );

        jtpMaterias.addTab("Nueva Materia", jpNuevaMateria);

        jcbMateriaBajaListaHab.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA DE MATERIAS"));
        jcbMateriaBajaListaHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriaBajaListaHabActionPerformed(evt);
            }
        });

        btnMateriaBajaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        btnMateriaBajaEliminar.setText("Borrar Registro");
        btnMateriaBajaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaBajaEliminarActionPerformed(evt);
            }
        });

        jtMateriaBajaAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("AÑO"));

        jtMateriaBajaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        javax.swing.GroupLayout jpBajaMateriaLayout = new javax.swing.GroupLayout(jpBajaMateria);
        jpBajaMateria.setLayout(jpBajaMateriaLayout);
        jpBajaMateriaLayout.setHorizontalGroup(
            jpBajaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jpBajaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                        .addComponent(jtMateriaBajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                        .addComponent(jcbMateriaBajaListaHab, 0, 553, Short.MAX_VALUE)
                        .addGap(119, 119, 119))
                    .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                        .addGroup(jpBajaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMateriaBajaEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtMateriaBajaAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpBajaMateriaLayout.setVerticalGroup(
            jpBajaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jcbMateriaBajaListaHab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMateriaBajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtMateriaBajaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnMateriaBajaEliminar)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jtpMaterias.addTab("Baja de Materia", jpBajaMateria);

        jtMateriaUpAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("AÑO"));
        jtMateriaUpAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMateriaUpAnioKeyTyped(evt);
            }
        });

        jcbMateriaUpMaterias.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA DE MATERIAS"));
        jcbMateriaUpMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriaUpMateriasActionPerformed(evt);
            }
        });

        jtMateriaUpNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        btnMateriaUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/recargar.png"))); // NOI18N
        btnMateriaUp.setText("Actualizar Registro");
        btnMateriaUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaUpActionPerformed(evt);
            }
        });

        jtMateriaUpID.setEditable(false);
        jtMateriaUpID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        javax.swing.GroupLayout jpActualizarDatosMateriaLayout = new javax.swing.GroupLayout(jpActualizarDatosMateria);
        jpActualizarDatosMateria.setLayout(jpActualizarDatosMateriaLayout);
        jpActualizarDatosMateriaLayout.setHorizontalGroup(
            jpActualizarDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActualizarDatosMateriaLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jpActualizarDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcbMateriaUpMaterias, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtMateriaUpAnio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtMateriaUpNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMateriaUp, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtMateriaUpID))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jpActualizarDatosMateriaLayout.setVerticalGroup(
            jpActualizarDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActualizarDatosMateriaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jtMateriaUpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbMateriaUpMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtMateriaUpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtMateriaUpAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnMateriaUp)
                .addGap(23, 23, 23))
        );

        jtpMaterias.addTab("Actualizar datos", jpActualizarDatosMateria);

        jcbMateriaAltaListaNoHab.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA DE MATERIAS"));
        jcbMateriaAltaListaNoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriaAltaListaNoHabActionPerformed(evt);
            }
        });

        jtMateriaAltaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jtMateriaAltaAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("AÑO"));

        btnMateriaAltaHabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/habilitar.png"))); // NOI18N
        btnMateriaAltaHabilitar.setText("Habilitar Materia");
        btnMateriaAltaHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaAltaHabilitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAltaMateriaLayout = new javax.swing.GroupLayout(jpAltaMateria);
        jpAltaMateria.setLayout(jpAltaMateriaLayout);
        jpAltaMateriaLayout.setHorizontalGroup(
            jpAltaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jpAltaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                        .addComponent(jtMateriaAltaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                        .addComponent(jcbMateriaAltaListaNoHab, 0, 553, Short.MAX_VALUE)
                        .addGap(119, 119, 119))
                    .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                        .addGroup(jpAltaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMateriaAltaHabilitar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtMateriaAltaAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpAltaMateriaLayout.setVerticalGroup(
            jpAltaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jcbMateriaAltaListaNoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMateriaAltaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtMateriaAltaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnMateriaAltaHabilitar)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jtpMaterias.addTab("Alta de Materia", jpAltaMateria);

        btnCerrarmaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrarmaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarmateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpMaterias)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrarmaterias))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCerrarmaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpMaterias))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMateriaNuevaLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaNuevaLimpiarActionPerformed
        jtMateriaNuevaNueva.setText("");
        jtMateriaNuevaAnio.setText("");
    }//GEN-LAST:event_btnMateriaNuevaLimpiarActionPerformed
    
    //Solapa 4 - Alta de Materia -> Da de alta una materia 
    private void btnMateriaAltaHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaAltaHabilitarActionPerformed
        List <Materia> arrayMateriasD =  Menu.materiaEscritorio.listarMateriasNOHabilitadas();
        int posicion = jcbMateriaAltaListaNoHab.getSelectedIndex();
        int idMateria = arrayMateriasD.get(posicion).getId_materia();
        Menu.materiaEscritorio.habilitarMateria(idMateria);
        mostrarMateriasV4();
    }//GEN-LAST:event_btnMateriaAltaHabilitarActionPerformed

    //Solapa 2 - Baja Materia -> Da de baja una materia 
    private void btnMateriaBajaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaBajaEliminarActionPerformed
        List <Materia> arrayMateriasH =  Menu.materiaEscritorio.listarMateriasHabilitadas();
        int posicion = jcbMateriaBajaListaHab.getSelectedIndex();
        int idMateria = arrayMateriasH.get(posicion).getId_materia();
        Menu.materiaEscritorio.deshabilitarMateria(idMateria);
        mostrandoMateriasV2();
    }//GEN-LAST:event_btnMateriaBajaEliminarActionPerformed

    //Boton Cerrar Panel
    private void btnCerrarmateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarmateriasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarmateriasActionPerformed
     
    //Solapa 3 - Actualizar Materia -> Actualiza una materia 
    private void btnMateriaUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaUpActionPerformed
        List <Materia> arrayMaterias =  Menu.materiaEscritorio.listarTodasLasMaterias();
        int posicion = -1;
        String nombre = jtMateriaUpNombre.getText();
        String year = jtMateriaUpAnio.getText();
        String id = jtMateriaUpID.getText();
        
        if (!year.isEmpty()) {
            int yearParceado = Integer.parseInt(year);
            int idParceado = Integer.parseInt(id);
        if (!nombre.isEmpty()) {
            
            Materia materiaActualizada = new Materia(idParceado, nombre, yearParceado);
            Menu.materiaEscritorio.actualizarMateria(materiaActualizada);
                            
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un año", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            //jtApellido1.requestFocus(); 
        }        
    }//GEN-LAST:event_btnMateriaUpActionPerformed
    
    //Solapa 1 - Nueva Materia -> Guardar
    private void btnMateriaNuevaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaNuevaGuardarActionPerformed
        String materia = jtMateriaNuevaNueva.getText();
        String year = jtMateriaNuevaAnio.getText();
        
        if (!materia.isEmpty()) {
        if (!year.isEmpty()) {
            
            int yearParceado= Integer.parseInt(year);

            Materia nuevaMateria = new Materia(materia,yearParceado, true);
            
            Menu.materiaEscritorio.guardarMateria(nuevaMateria);
           // Menu.materiaEscritorio.actualizarMateria(nuevaMateria);
           
                        
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un año", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtMateriaNuevaAnio.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtMateriaNuevaNueva.requestFocus();
            } 
    }//GEN-LAST:event_btnMateriaNuevaGuardarActionPerformed

    //Solapa 2 - Baja Materia -> Cargar Datos del furmulario Items ComboBox
    private void jcbMateriaBajaListaHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriaBajaListaHabActionPerformed
        // TODO add your handling code here:
        List <Materia> arrayMateriasB =  Menu.materiaEscritorio.listarMateriasHabilitadas();
        int posicion = -1;
        posicion= jcbMateriaBajaListaHab.getSelectedIndex();
      
        if (posicion > -1 ) {
            jtMateriaBajaNombre.setText(arrayMateriasB.get(posicion).getNombre());
            jtMateriaBajaAnio.setText(arrayMateriasB.get(posicion).getAnio() + "");
            btnMateriaBajaEliminar.setEnabled(true);
        }   
    }//GEN-LAST:event_jcbMateriaBajaListaHabActionPerformed

    private void mostrandoMateriasV2() {
        jcbMateriaBajaListaHab.removeAllItems();
        List <Materia> arrayMaterias =  Menu.materiaEscritorio.listarMateriasHabilitadas();
        
        for (Materia alumno : arrayMaterias) {
            jcbMateriaBajaListaHab.addItem(alumno);
        }
    }

    private void mostrandoTodasMateriasV3() {
       jcbMateriaUpMaterias.removeAllItems();
       List <Materia> arrayMaterias =  Menu.materiaEscritorio.listarTodasLasMaterias();
        
        for (Materia alumno : arrayMaterias) {
            jcbMateriaUpMaterias.addItem(alumno);
        }
    
     }

    //Solapa 3 - Actualizar Materia -> Cargar Datos del furmulario Items ComboBox
    private void jcbMateriaUpMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriaUpMateriasActionPerformed
        List <Materia> arrayTodasMaterias =  Menu.materiaEscritorio.listarTodasLasMaterias();
        int posicion = -1;
        posicion = jcbMateriaUpMaterias.getSelectedIndex();
        
        if (posicion > -1 ) {
            jtMateriaUpNombre.setText(arrayTodasMaterias.get(posicion).getNombre());
            jtMateriaUpAnio.setText(arrayTodasMaterias.get(posicion).getAnio() + "");
            jtMateriaUpID.setText(arrayTodasMaterias.get(posicion).getId_materia() + "");
            
            
        }else if (posicion == -1){
            JOptionPane.showMessageDialog(null, "No se encuentran materia para dar de alta", "",JOptionPane.WARNING_MESSAGE); 
        }        
    }//GEN-LAST:event_jcbMateriaUpMateriasActionPerformed
    
    //Solapa 4 - Alta de Materia -> Cargar Datos del furmulario Items ComboBox
    private void jcbMateriaAltaListaNoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriaAltaListaNoHabActionPerformed
        List <Materia> arrayMateriasD =  Menu.materiaEscritorio.listarMateriasNOHabilitadas();
        int posicion =jcbMateriaAltaListaNoHab.getSelectedIndex();
        
            jtMateriaAltaNombre.setText(arrayMateriasD.get(posicion).getNombre());
            jtMateriaAltaAnio.setText(arrayMateriasD.get(posicion).getAnio() + "");        
    }//GEN-LAST:event_jcbMateriaAltaListaNoHabActionPerformed

    //Solapa 1 - Alta de Materia -> Validacion solo numeros
    private void jtMateriaNuevaAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMateriaNuevaAnioKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }

        if (jtMateriaNuevaAnio.getText().trim().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jtMateriaNuevaAnioKeyTyped

    //solapa 3 - Actualizar Materia -> Validacion año solo numeros
    private void jtMateriaUpAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMateriaUpAnioKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }

        if (jtMateriaUpAnio.getText().trim().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jtMateriaUpAnioKeyTyped

    private void mostrarMateriasV4() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        jcbMateriaAltaListaNoHab.removeAllItems();
        List <Materia> arrayMateriasD =  Menu.materiaEscritorio.listarMateriasNOHabilitadas();
        
        for (Materia materias : arrayMateriasD) {
            jcbMateriaAltaListaNoHab.addItem(materias);
        }
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarmaterias;
    private javax.swing.JButton btnMateriaAltaHabilitar;
    private javax.swing.JButton btnMateriaBajaEliminar;
    private javax.swing.JButton btnMateriaNuevaGuardar;
    private javax.swing.JButton btnMateriaNuevaLimpiar;
    private javax.swing.JButton btnMateriaUp;
    private javax.swing.JComboBox<Materia> jcbMateriaAltaListaNoHab;
    private javax.swing.JComboBox<Materia> jcbMateriaBajaListaHab;
    private javax.swing.JComboBox<Materia> jcbMateriaUpMaterias;
    private javax.swing.JPanel jpActualizarDatosMateria;
    private javax.swing.JPanel jpAltaMateria;
    private javax.swing.JPanel jpBajaMateria;
    private javax.swing.JPanel jpNuevaMateria;
    private javax.swing.JTextField jtMateriaAltaAnio;
    private javax.swing.JTextField jtMateriaAltaNombre;
    private javax.swing.JTextField jtMateriaBajaAnio;
    private javax.swing.JTextField jtMateriaBajaNombre;
    private javax.swing.JTextField jtMateriaNuevaAnio;
    private javax.swing.JTextField jtMateriaNuevaNueva;
    private javax.swing.JTextField jtMateriaUpAnio;
    private javax.swing.JTextField jtMateriaUpID;
    private javax.swing.JTextField jtMateriaUpNombre;
    private javax.swing.JTabbedPane jtpMaterias;
    // End of variables declaration//GEN-END:variables

}


    
    
    

