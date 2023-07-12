/**
 @author Grupo 11
*/

package vistas;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import negocio.Cliente;


public class VistaBuscarTelefono extends javax.swing.JInternalFrame{

    public VistaBuscarTelefono() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        label_apellido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_clientes = new javax.swing.JTable();
        btn_cerrar = new javax.swing.JButton();
        label_icono = new javax.swing.JLabel();
        label_subtitulo1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jcb_buscarApellido = new javax.swing.JTextField();

        setBackground(new java.awt.Color(176, 218, 255));

        label_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label_titulo.setText("Buscar Telefono");

        label_apellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_apellido.setText("Apellido: ");

        jtable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "APELLIDO", "NOMBRE", "CIUDAD", "DIRECCION", "TELEFONO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_clientes);

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        label_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/buscar.png"))); // NOI18N

        label_subtitulo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_subtitulo1.setText("Buscar clientes por apellido");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btn_cerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_apellido)
                                .addGap(60, 60, 60)
                                .addComponent(jcb_buscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(label_titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_icono))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label_subtitulo1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(label_subtitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_apellido)
                    .addComponent(btn_buscar)
                    .addComponent(jcb_buscarApellido, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrar)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String apellido = jcb_buscarApellido.getText(); //recibe el apellido
        
        if ( !apellido.isEmpty() ){          
            
            ArrayList<String> arrayClientes = (Menu.miDirectorio.buscarTelefono(apellido));
            
            DefaultTableModel modeloDefault = new DefaultTableModel(new String[]{"DNI", "APELLIDO", "NOMBRE", "CIUDAD", "DIRECCION", "TELEFONO"},Menu.miDirectorio.getRegistros());
            jtable_clientes.setModel(modeloDefault);
            
            TableModel modeloDatos = jtable_clientes.getModel();
            
            for ( int i = 0; i < arrayClientes.size() ; i++){
                /*
                modeloDatos.setValueAt(arrayClientes.get(i) , i, 0);
                modeloDatos.setValueAt(arrayClientes.get(i) , i, 1);
                modeloDatos.setValueAt(arrayClientes.get(i) , i, 2);
                modeloDatos.setValueAt(arrayClientes.get(i) , i, 3);
                modeloDatos.setValueAt(arrayClientes.get(i) , i, 4);
                modeloDatos.setValueAt(arrayClientes , i, 5);
                */
                
            }
            
            
            
            
/*
            String col[] = {"DNI","APELLIDO","NOMBRE", "CIUDAD", "DIRECCION", "TELEFONO"};
            DefaultTableModel jtable_clientes = new DefaultTableModel(col, 0);
            JTable table = new JTable(jtable_clientes);

            Object[] objs = {35475532, "Soria", "Cristian", "San Luis", "Calderon", 2664};
            jtable_clientes.addRow(objs);
*/

   
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar un apellido para realizar la busqueda.");
        }

    }//GEN-LAST:event_btn_buscarActionPerformed
    
    public void llenarTabla(){
        DefaultTableModel modeloDefault = new DefaultTableModel(new String[]{"DNI", "APELLIDO", "NOMBRE", "CIUDAD", "DIRECCION", "TELEFONO"},Menu.miDirectorio.getRegistros());
        jtable_clientes.setModel(modeloDefault);
            
        TableModel modeloDatos = jtable_clientes.getModel();
            
        for ( int i = 0; i < Menu.miDirectorio.getRegistros() ; i++){
            modeloDatos.setValueAt("Arrays" , i, 0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jcb_buscarApellido;
    private javax.swing.JTable jtable_clientes;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_icono;
    private javax.swing.JLabel label_subtitulo1;
    private javax.swing.JLabel label_titulo;
    // End of variables declaration//GEN-END:variables

    
}
