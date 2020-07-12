/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Proveedores;

import Clases.CRUD;
import Clases.Colores;
import Clases.Proveedor;
import Clases.Strings;
import Clases.Vista;
import Forms.Categorias.Eliminar_Categoria;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author jandr
 */
public class Modificar_Proveedor extends javax.swing.JPanel {

    public ArrayList<Proveedor> proveedores;
    DefaultListModel listModel;

    /**
     * Creates new form Modificar_Proveedor
     */
    public Modificar_Proveedor() {
        initComponents();
        diseñar_form();
        new consultar().show();
    }

    private void diseñar_form() {
        this.setBackground(Colores.texto_botones_clicked);
        this.pnlContenedor.setBackground(Colores.fondo_primario);
        this.btnActualizar.setBackground(Colores.texto_botones_clicked);
        this.setForeground(Colores.texto_botones);
        this.btnActualizar.setOpaque(true);
        this.lblLoader.setVisible(false);
        btnLista.setBackground(Colores.texto_botones_clicked);
        btnLista.setForeground(Colores.texto_botones);
        btnLista.setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProveedores = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JLabel();
        lblLoader = new javax.swing.JLabel();
        btnLista = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("NOTA: Para modificar un proveedor, primero seleccione uno de la lista.");

        lstProveedores.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lstProveedores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstProveedores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProveedoresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstProveedores);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Modifique los datos y presione en actualizar:");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del proveedor:");

        txtProveedor.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("Dirección:");

        txtDireccion.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setText("RFC:");

        txtRfc.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtRfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcKeyTyped(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizar.setText("Actualizar datos");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
        });

        lblLoader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loader.gif"))); // NOI18N

        btnLista.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLista.setText("Actualizar lista");
        btnLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListaMouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setText("NOTA: En caso de no encontar el proveedor a modificar, actualice la lista.");

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContenedorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(txtProveedor)
                            .addComponent(txtDireccion)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(94, 94, 94))
                                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(132, 132, 132)))
                                .addGap(147, 147, 147))
                            .addComponent(txtRfc)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                                .addComponent(btnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblLoader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(lblLoader, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        // TODO add your handling code here:
        this.btnActualizar.setBackground(Colores.fondo_primario_oscuro);
        this.setForeground(Colores.texto_botones_clicked);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        // TODO add your handling code here:
        this.btnActualizar.setBackground(Colores.texto_botones_clicked);
        this.setForeground(Colores.texto_botones);
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        // TODO add your handling code here:
        if (lstProveedores.getSelectedIndex() != -1) {
            proveedores.get(lstProveedores.getSelectedIndex()).setNombreProveedor(txtProveedor.getText());
            proveedores.get(lstProveedores.getSelectedIndex()).setRFC(txtRfc.getText());
            proveedores.get(lstProveedores.getSelectedIndex()).setDireccion(txtDireccion.getText());
            new modificar().show();
        }
        new consultar().show();
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void lstProveedoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProveedoresValueChanged
        // TODO add your handling code here:
        if (lstProveedores.getSelectedIndex() != -1) {
            txtDireccion.setText(proveedores.get(lstProveedores.getSelectedIndex()).getDireccion());
            txtProveedor.setText(proveedores.get(lstProveedores.getSelectedIndex()).getNombreProveedor());
            txtRfc.setText(proveedores.get(lstProveedores.getSelectedIndex()).getRFC());
        }
    }//GEN-LAST:event_lstProveedoresValueChanged

    private void btnListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMouseEntered
        // TODO add your handling code here:
        btnLista.setBackground(Colores.fondo_primario_claro);
        btnLista.setForeground(Colores.texto_botones_clicked);
    }//GEN-LAST:event_btnListaMouseEntered

    private void btnListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMouseExited
        // TODO add your handling code here:
        btnLista.setBackground(Colores.texto_botones_clicked);
        btnLista.setForeground(Colores.texto_botones);
    }//GEN-LAST:event_btnListaMouseExited

    private void btnListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMouseClicked
        // TODO add your handling code here:
        new consultar().show();
    }//GEN-LAST:event_btnListaMouseClicked

    private void txtProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyTyped
        // TODO add your handling code here:
        if (txtProveedor.getText() != null && !txtProveedor.getText().equals("")) {
            txtProveedor.setText(txtProveedor.getText().toUpperCase());   
        }
    }//GEN-LAST:event_txtProveedorKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        if (txtDireccion.getText() != null && !txtDireccion.getText().equals("")) {
            txtDireccion.setText(txtDireccion.getText().toUpperCase());   
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtRfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcKeyTyped
        // TODO add your handling code here:
        if (txtRfc.getText() != null && !txtRfc.getText().equals("")) {
            txtRfc.setText(txtRfc.getText().toUpperCase());   
        }
    }//GEN-LAST:event_txtRfcKeyTyped

    public class modificar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                mostrar_loading(true);
                if (CRUD.conexion_internet()) {
                    if (CRUD.modificar_proveedor(proveedores.get(lstProveedores.getSelectedIndex()))) {
                        Vista.mensaje_informacion(Strings.proveedor_modificado, Strings.ventana_informacion_titulo);
                    } else {
                        Vista.mensaje_error(Strings.error_desconocido, Strings.error_desconocido);
                    }
                } else {
                    mostrar_loading(false);
                    Vista.mensaje_error(Strings.sin_internet, Strings.titulo_sin_internet);
                }
            } catch (InterruptedException | IOException | SQLException | ClassNotFoundException ex) {
                mostrar_loading(false);
                Logger.getLogger(Eliminar_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class consultar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                mostrar_loading(true);
                if (CRUD.conexion_internet()) {
                    proveedores = CRUD.consultar_proveedores();
                    listModel = new DefaultListModel();
                    for (int i = 0; i < proveedores.size(); i++) {
                        listModel.add(i, proveedores.get(i).getNombreProveedor());
                    }
                    lstProveedores.setModel(listModel);
                    mostrar_loading(false);
                } else {
                    mostrar_loading(false);
                    Vista.mensaje_error(Strings.sin_internet, Strings.titulo_sin_internet);
                }
            } catch (InterruptedException | IOException | SQLException | ClassNotFoundException ex) {
                mostrar_loading(false);
                Logger.getLogger(Eliminar_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void mostrar_loading(boolean mostrar) {
        btnActualizar.setVisible(!mostrar);
        btnLista.setVisible(!mostrar);
        lblLoader.setVisible(mostrar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLoader;
    private javax.swing.JList<String> lstProveedores;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables
}