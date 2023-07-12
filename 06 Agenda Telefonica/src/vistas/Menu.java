/**
 @author Grupo 11
*/
package vistas;

import java.awt.event.MouseEvent;
import negocio.Directorio;


public class Menu extends javax.swing.JFrame {

    public static Directorio miDirectorio = new Directorio();
   
    public Menu() {
        super("Agenda");
        initComponents();
        
    }
    
    private void showPopMenu (MouseEvent e){
        PopMenu.show(this, e.getX(), e.getY());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopMenu = new javax.swing.JPopupMenu();
        PopMenu_agregarCliente = new javax.swing.JMenuItem();
        PopMenu_buscarCliente = new javax.swing.JMenuItem();
        PopMenu_borrarCliente = new javax.swing.JMenuItem();
        PopMenu_buscarTelefono = new javax.swing.JMenuItem();
        PopMenu_buscarClientes = new javax.swing.JMenuItem();
        PopMenu_Salir = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        mb = new javax.swing.JMenuBar();
        mb_menu = new javax.swing.JMenu();
        mb_menu_agregarCliente = new javax.swing.JMenuItem();
        mb_menu_buscarCliente = new javax.swing.JMenuItem();
        mb_menu_borrarCliente = new javax.swing.JMenuItem();
        mb_menu_buscarTelefono = new javax.swing.JMenuItem();
        mb_menu_buscarClientes = new javax.swing.JMenuItem();
        mb_salir = new javax.swing.JMenu();
        mb_salir_salirSistema = new javax.swing.JMenuItem();
        mb_ayuda = new javax.swing.JMenu();

        PopMenu_agregarCliente.setText("Agregar Cliente");
        PopMenu_agregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopMenu_agregarClienteActionPerformed(evt);
            }
        });
        PopMenu.add(PopMenu_agregarCliente);

        PopMenu_buscarCliente.setText("Buscar Cliente");
        PopMenu_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopMenu_buscarClienteActionPerformed(evt);
            }
        });
        PopMenu.add(PopMenu_buscarCliente);

        PopMenu_borrarCliente.setText("Borrar Cliente");
        PopMenu_borrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopMenu_borrarClienteActionPerformed(evt);
            }
        });
        PopMenu.add(PopMenu_borrarCliente);

        PopMenu_buscarTelefono.setText("Buscar Telefono");
        PopMenu_buscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopMenu_buscarTelefonoActionPerformed(evt);
            }
        });
        PopMenu.add(PopMenu_buscarTelefono);

        PopMenu_buscarClientes.setText("Buscar Clientes");
        PopMenu_buscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopMenu_buscarClientesActionPerformed(evt);
            }
        });
        PopMenu.add(PopMenu_buscarClientes);

        PopMenu_Salir.setText("Salir");
        PopMenu_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PopMenu_SalirActionPerformed(evt);
            }
        });
        PopMenu.add(PopMenu_Salir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        escritorio.setBackground(new java.awt.Color(20, 108, 148));
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio.setDesktopManager(null);
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
            .addGap(0, 800, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        mb.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        mb_menu.setText("Menu");

        mb_menu_agregarCliente.setText("Agregar Cliente");
        mb_menu_agregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb_menu_agregarClienteActionPerformed(evt);
            }
        });
        mb_menu.add(mb_menu_agregarCliente);

        mb_menu_buscarCliente.setText("Buscar Cliente");
        mb_menu_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb_menu_buscarClienteActionPerformed(evt);
            }
        });
        mb_menu.add(mb_menu_buscarCliente);

        mb_menu_borrarCliente.setText("Borrar Cliente");
        mb_menu_borrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb_menu_borrarClienteActionPerformed(evt);
            }
        });
        mb_menu.add(mb_menu_borrarCliente);

        mb_menu_buscarTelefono.setText("Buscar Telefono");
        mb_menu_buscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb_menu_buscarTelefonoActionPerformed(evt);
            }
        });
        mb_menu.add(mb_menu_buscarTelefono);

        mb_menu_buscarClientes.setText("Buscar Clientes");
        mb_menu_buscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb_menu_buscarClientesActionPerformed(evt);
            }
        });
        mb_menu.add(mb_menu_buscarClientes);

        mb.add(mb_menu);

        mb_salir.setText("Salir");

        mb_salir_salirSistema.setText("Salir del Sistema");
        mb_salir_salirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb_salir_salirSistemaActionPerformed(evt);
            }
        });
        mb_salir.add(mb_salir_salirSistema);

        mb.add(mb_salir);

        mb_ayuda.setText("Ayuda");
        mb.add(mb_ayuda);

        setJMenuBar(mb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mb_menu_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb_menu_buscarClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaBuscarCliente vbc = new VistaBuscarCliente();
        vbc.setVisible(true);
        escritorio.add(vbc);
        escritorio.moveToFront(vbc);
    }//GEN-LAST:event_mb_menu_buscarClienteActionPerformed

    private void mb_menu_agregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb_menu_agregarClienteActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        ViewAgregarCliente vac = new ViewAgregarCliente();
        vac.setVisible(true);
        escritorio.add(vac);
        escritorio.moveToFront(vac);
    }//GEN-LAST:event_mb_menu_agregarClienteActionPerformed

    private void mb_menu_borrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb_menu_borrarClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaBorrarCliente vbrc = new VistaBorrarCliente();
        vbrc.setVisible(true);
        escritorio.add(vbrc);
        escritorio.moveToFront(vbrc);
    }//GEN-LAST:event_mb_menu_borrarClienteActionPerformed

    private void mb_menu_buscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb_menu_buscarClientesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
         VistaBuscarClientes vbcs = new VistaBuscarClientes();
        vbcs.setVisible(true);
        escritorio.add(vbcs);
        escritorio.moveToFront(vbcs);
    }//GEN-LAST:event_mb_menu_buscarClientesActionPerformed

    private void mb_menu_buscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb_menu_buscarTelefonoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaBuscarTelefono vbt = new VistaBuscarTelefono();
        vbt.setVisible(true);
        escritorio.add(vbt);
        escritorio.moveToFront(vbt);
    }//GEN-LAST:event_mb_menu_buscarTelefonoActionPerformed

    private void mb_salir_salirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb_salir_salirSistemaActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_mb_salir_salirSistemaActionPerformed

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

    private void PopMenu_agregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopMenu_agregarClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ViewAgregarCliente vac = new ViewAgregarCliente();
        vac.setVisible(true);
        escritorio.add(vac);
        escritorio.moveToFront(vac);
    }//GEN-LAST:event_PopMenu_agregarClienteActionPerformed

    private void PopMenu_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopMenu_buscarClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaBuscarCliente vbc = new VistaBuscarCliente();
        vbc.setVisible(true);
        escritorio.add(vbc);
        escritorio.moveToFront(vbc);
    }//GEN-LAST:event_PopMenu_buscarClienteActionPerformed

    private void PopMenu_borrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopMenu_borrarClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaBorrarCliente vbrc = new VistaBorrarCliente();
        vbrc.setVisible(true);
        escritorio.add(vbrc);
        escritorio.moveToFront(vbrc);
    }//GEN-LAST:event_PopMenu_borrarClienteActionPerformed

    private void PopMenu_buscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopMenu_buscarTelefonoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaBuscarTelefono vbt = new VistaBuscarTelefono();
        vbt.setVisible(true);
        escritorio.add(vbt);
        escritorio.moveToFront(vbt);
    }//GEN-LAST:event_PopMenu_buscarTelefonoActionPerformed

    private void PopMenu_buscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopMenu_buscarClientesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
         VistaBuscarClientes vbcs = new VistaBuscarClientes();
        vbcs.setVisible(true);
        escritorio.add(vbcs);
        escritorio.moveToFront(vbcs);
    }//GEN-LAST:event_PopMenu_buscarClientesActionPerformed

    private void PopMenu_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PopMenu_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_PopMenu_SalirActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Menu windor = new Menu();
            windor.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopMenu;
    private javax.swing.JMenuItem PopMenu_Salir;
    private javax.swing.JMenuItem PopMenu_agregarCliente;
    private javax.swing.JMenuItem PopMenu_borrarCliente;
    private javax.swing.JMenuItem PopMenu_buscarCliente;
    private javax.swing.JMenuItem PopMenu_buscarClientes;
    private javax.swing.JMenuItem PopMenu_buscarTelefono;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar mb;
    private javax.swing.JMenu mb_ayuda;
    private javax.swing.JMenu mb_menu;
    private javax.swing.JMenuItem mb_menu_agregarCliente;
    private javax.swing.JMenuItem mb_menu_borrarCliente;
    private javax.swing.JMenuItem mb_menu_buscarCliente;
    private javax.swing.JMenuItem mb_menu_buscarClientes;
    private javax.swing.JMenuItem mb_menu_buscarTelefono;
    private javax.swing.JMenu mb_salir;
    private javax.swing.JMenuItem mb_salir_salirSistema;
    // End of variables declaration//GEN-END:variables
 

}
