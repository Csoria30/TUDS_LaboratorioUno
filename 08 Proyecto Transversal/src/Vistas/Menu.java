package Vistas;

import Controlador.*;
import Modelo.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends javax.swing.JFrame {

    private JMenuBar barra;
    private JMenu Menu_Alumnos, Menu_Materias, Menu_Salir;
    private JMenuItem A_opcion1, A_opcion2, A_opcion3, M_opcion1, M_opcion2, M_opcion3, M_opcion4, M_opcion5, S_opcion1;
    private static FormLogin form = new FormLogin();
    public static AlumnoData alumnoEscritorio = new AlumnoData();
    public static MateriaData materiaEscritorio = new MateriaData();
    public static InscripcionData inscripcionEscritorio = new InscripcionData();
    
    public Menu() {
        crearMenu();
        initComponents();
    }
    
    
    
    private void centrarJinternalFrame (JInternalFrame i ){
    
        Dimension tamanioEscritorio =  Escritorio.getSize();
        Dimension tamanioVentana = i.getSize();
        i.setLocation((tamanioEscritorio.width - tamanioVentana.width) / 2, (tamanioEscritorio.height - tamanioVentana.height) /2);
        
    }

    private void crearMenu(){
        barra = new JMenuBar();
        Menu_Alumnos = new JMenu("Alumnos");
        Menu_Alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estudiante.png")));
        Menu_Alumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu_Materias = new JMenu("Materias");
        Menu_Materias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png")));
        Menu_Materias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu_Salir = new JMenu("Salir");
        Menu_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salir_sistema.png")));
        Menu_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        //Menu Alumnos        
        A_opcion2 = new JMenuItem("Lista inscripciones a materias");
        A_opcion2.addActionListener((java.awt.event.ActionEvent evt) -> {
            Escritorio.removeAll();
            Escritorio.repaint();
            ListaMateriasCursadas inscripcionesAlumnos = new ListaMateriasCursadas();
            centrarJinternalFrame(inscripcionesAlumnos);
            inscripcionesAlumnos.setVisible(true);
            Escritorio.add(inscripcionesAlumnos);
            Escritorio.moveToFront(inscripcionesAlumnos);
        });
        
        A_opcion3 = new JMenuItem("ABM Alumnos");
        A_opcion3.addActionListener((java.awt.event.ActionEvent evt) -> {
            Escritorio.removeAll();
            Escritorio.repaint();
            ABMAlumnos abmAlumnos = new ABMAlumnos();
            centrarJinternalFrame(abmAlumnos);
            abmAlumnos.setVisible(true);
            Escritorio.add(abmAlumnos);
            Escritorio.moveToFront(abmAlumnos);
        });
        
        
        
        //Menu Materias
        M_opcion1 = new JMenuItem("Lista Materias"); // ???????????????????
        M_opcion1.addActionListener((java.awt.event.ActionEvent evt) -> {
            Escritorio.removeAll();
            Escritorio.repaint();
            ListaMaterias listaMaterias = new ListaMaterias();
            centrarJinternalFrame(listaMaterias);
            listaMaterias.setVisible(true);
            Escritorio.add(listaMaterias);
            Escritorio.moveToFront(listaMaterias);
        });
        
        M_opcion2 = new JMenuItem("Lista de inscripciones"); // OK  OK    OK
        M_opcion2.addActionListener((java.awt.event.ActionEvent evt) -> {
            Escritorio.removeAll();
            Escritorio.repaint();
            ListaInscripcionesAMaterias listaMateriasIns = new ListaInscripcionesAMaterias();
            centrarJinternalFrame(listaMateriasIns);
            listaMateriasIns.setVisible(true);
            Escritorio.add(listaMateriasIns);
            Escritorio.moveToFront(listaMateriasIns);
        });
        
        M_opcion3 = new JMenuItem("ABM Materias"); // OK  ??  OK
        M_opcion3.addActionListener((java.awt.event.ActionEvent evt) -> {
            Escritorio.removeAll();
            Escritorio.repaint();
            ABMMaterias abmMaterias = new ABMMaterias();
            centrarJinternalFrame(abmMaterias);
            abmMaterias.setVisible(true);
            Escritorio.add(abmMaterias);
            Escritorio.moveToFront(abmMaterias);
        });
        
        M_opcion4 = new JMenuItem("Inscribir Alumnos"); // OK  OK    OK
        M_opcion4.addActionListener((java.awt.event.ActionEvent evt) -> {
            Escritorio.removeAll();
            Escritorio.repaint();
            InscripcionesMaterias listaInscripciones = new InscripcionesMaterias();
            listaInscripciones.setVisible(true);
            centrarJinternalFrame(listaInscripciones);
            Escritorio.add(listaInscripciones);
            Escritorio.moveToFront(listaInscripciones);
        });
        
        M_opcion5 = new JMenuItem("Calificaciones"); // OK  OK    OK
        M_opcion5.addActionListener((java.awt.event.ActionEvent evt) -> {
            Escritorio.removeAll();
            Escritorio.repaint();
            Calificaciones calificaciones = new Calificaciones();
            centrarJinternalFrame(calificaciones);
            calificaciones.setVisible(true);
            Escritorio.add(calificaciones);
            Escritorio.moveToFront(calificaciones);
        });
        
        //Menu Salir
        S_opcion1 = new JMenuItem("Cerrar Sesion");
        S_opcion1.addActionListener((java.awt.event.ActionEvent evt) -> {
            this.dispose();
            form.setVisible(true);
        });
        
        if ( form.rolSesion.equals("alumno") ){

            Menu_Alumnos.add(A_opcion3);
            Menu_Alumnos.add(A_opcion2);
            Menu_Salir.add("Usuario: " + form.usuarioSesion);
            Menu_Salir.add("Perfil: " + form.rolSesion);
            Menu_Salir.add(S_opcion1);
        
            barra.add(Menu_Alumnos);
            barra.add(Box.createHorizontalGlue()); //Elemento pegamento entre los menu, para alinear a la derecha
            barra.add(Menu_Salir);
        }
        
        if ( form.rolSesion.equals("docente") ){

            Menu_Alumnos.add(A_opcion2);
            Menu_Alumnos.add(A_opcion3);
            Menu_Materias.add(M_opcion1);
            Menu_Materias.add(M_opcion2);
            Menu_Materias.add(M_opcion3);
            Menu_Materias.add(M_opcion4);
            Menu_Materias.add(M_opcion5);
            Menu_Salir.add("Usuario: " + form.usuarioSesion);
            Menu_Salir.add("Perfil: " + form.rolSesion);
            Menu_Salir.add(S_opcion1);
        
            barra.add(Menu_Alumnos);
            barra.add(Menu_Materias);
            barra.add(Box.createHorizontalGlue()); //Elemento pegamento entre los menu, para alinear a la derecha
            barra.add(Menu_Salir);
        }
        
        setJMenuBar(barra);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo_escritorio_transversal.png"));
        Image image = icon.getImage();
        Escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    // End of variables declaration//GEN-END:variables
}
