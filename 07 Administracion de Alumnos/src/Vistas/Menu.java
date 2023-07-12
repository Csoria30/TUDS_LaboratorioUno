package Vistas;


import Clases.Alumno;
import Clases.Materia;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    private HashSet <Materia> hashMaterias = new HashSet<>();
    private HashSet <Alumno> hashAlumnos = new HashSet<>();

    
    public Menu() {
        super("Sistema de administracion escolar");
        initComponents();
    }
    
    private void showPopMenu (MouseEvent e){
        PopMenu.show(this, e.getX(), e.getY());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        PopMenu = new javax.swing.JPopupMenu();
        AgregarMateria = new javax.swing.JMenuItem();
        AgregarAlumno = new javax.swing.JMenuItem();
        InscribirAlumno = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/fondo_escritorio.png"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        menuBar_Admin_ = new javax.swing.JMenu();
        menuBar_Admin_AgregarMaterias = new javax.swing.JMenuItem();
        menuBar_Admin_AgregarAlumnos = new javax.swing.JMenuItem();
        menuBar_Admin_iInscrbirAlumno = new javax.swing.JMenuItem();
        menuBar_Salir = new javax.swing.JMenu();
        menuBar_Salir_Cerrar = new javax.swing.JMenuItem();

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        AgregarMateria.setText("Agregar Materia");
        AgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMateriaActionPerformed(evt);
            }
        });
        PopMenu.add(AgregarMateria);
        AgregarMateria.getAccessibleContext().setAccessibleName("Agregar Materia");

        AgregarAlumno.setText("Agregar Alumno");
        AgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlumnoActionPerformed(evt);
            }
        });
        PopMenu.add(AgregarAlumno);
        AgregarAlumno.getAccessibleContext().setAccessibleName("Agregar Alumno");

        InscribirAlumno.setText("Inscribir Alumno");
        InscribirAlumno.setActionCommand("Inscribir Alumno");
        InscribirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirAlumnoActionPerformed(evt);
            }
        });
        PopMenu.add(InscribirAlumno);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        PopMenu.add(Salir);
        Salir.getAccessibleContext().setAccessibleName("Salir");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 51));

        escritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escritorioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                escritorioMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        menuBar_Admin_.setText("Administracion");

        menuBar_Admin_AgregarMaterias.setText("Agregar Materias");
        menuBar_Admin_AgregarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBar_Admin_AgregarMateriasActionPerformed(evt);
            }
        });
        menuBar_Admin_.add(menuBar_Admin_AgregarMaterias);

        menuBar_Admin_AgregarAlumnos.setText("Agregar Alumnos");
        menuBar_Admin_AgregarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBar_Admin_AgregarAlumnosActionPerformed(evt);
            }
        });
        menuBar_Admin_.add(menuBar_Admin_AgregarAlumnos);

        menuBar_Admin_iInscrbirAlumno.setText("Inscribir Alumnos");
        menuBar_Admin_iInscrbirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBar_Admin_iInscrbirAlumnoActionPerformed(evt);
            }
        });
        menuBar_Admin_.add(menuBar_Admin_iInscrbirAlumno);

        menuBar.add(menuBar_Admin_);

        menuBar_Salir.setText("Salir");

        menuBar_Salir_Cerrar.setText("Cerrar");
        menuBar_Salir_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBar_Salir_CerrarActionPerformed(evt);
            }
        });
        menuBar_Salir.add(menuBar_Salir_Cerrar);

        menuBar.add(menuBar_Salir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBar_Admin_AgregarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBar_Admin_AgregarMateriasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAgregarMaterias vam = new VistaAgregarMaterias(hashMaterias);
        vam.setVisible(true);
        escritorio.add(vam);
        escritorio.moveToFront(vam);
    }//GEN-LAST:event_menuBar_Admin_AgregarMateriasActionPerformed

    private void menuBar_Admin_AgregarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBar_Admin_AgregarAlumnosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAgregarAlumnos vaa=new VistaAgregarAlumnos(hashAlumnos);
        vaa.setVisible(true);
        escritorio.add(vaa);
        escritorio.moveToFront(vaa);
    }//GEN-LAST:event_menuBar_Admin_AgregarAlumnosActionPerformed

    private void menuBar_Admin_iInscrbirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBar_Admin_iInscrbirAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscribirAlumnos via=new VistaInscribirAlumnos(hashAlumnos, hashMaterias);
        via.setVisible(true);
        escritorio.add(via);
        escritorio.moveToFront(via);
    }//GEN-LAST:event_menuBar_Admin_iInscrbirAlumnoActionPerformed

    private void menuBar_Salir_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBar_Salir_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuBar_Salir_CerrarActionPerformed

    private void escritorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escritorioMousePressed
        if(evt.isPopupTrigger()){
            showPopMenu(evt);
        }
    }//GEN-LAST:event_escritorioMousePressed

    private void escritorioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escritorioMouseReleased
        if(evt.isPopupTrigger()){
            showPopMenu(evt);
        }
    }//GEN-LAST:event_escritorioMouseReleased

    private void AgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAgregarMaterias vam = new VistaAgregarMaterias(hashMaterias);
        vam.setVisible(true);
        escritorio.add(vam);
        escritorio.moveToFront(vam);
    }//GEN-LAST:event_AgregarMateriaActionPerformed

    private void AgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAgregarAlumnos vaa=new VistaAgregarAlumnos(hashAlumnos);
        vaa.setVisible(true);
        escritorio.add(vaa);
        escritorio.moveToFront(vaa);
    }//GEN-LAST:event_AgregarAlumnoActionPerformed

    private void InscribirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscribirAlumnos via=new VistaInscribirAlumnos(hashAlumnos, hashMaterias);
        via.setVisible(true);
        escritorio.add(via);
        escritorio.moveToFront(via);
    }//GEN-LAST:event_InscribirAlumnoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarAlumno;
    private javax.swing.JMenuItem AgregarMateria;
    private javax.swing.JMenuItem InscribirAlumno;
    private javax.swing.JPopupMenu PopMenu;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBar_Admin_;
    private javax.swing.JMenuItem menuBar_Admin_AgregarAlumnos;
    private javax.swing.JMenuItem menuBar_Admin_AgregarMaterias;
    private javax.swing.JMenuItem menuBar_Admin_iInscrbirAlumno;
    private javax.swing.JMenu menuBar_Salir;
    private javax.swing.JMenuItem menuBar_Salir_Cerrar;
    // End of variables declaration//GEN-END:variables
}
