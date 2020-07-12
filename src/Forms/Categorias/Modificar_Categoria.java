/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Categorias;

import Clases.BD;
import Clases.CRUD;
import Clases.Categoria;
import Clases.Colores;
import Clases.Strings;
import Clases.Vista;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author jandr
 */
public class Modificar_Categoria extends javax.swing.JPanel {

    public ArrayList<Categoria> categorias;
    DefaultListModel listModel;

    /**
     * Creates new form Eliminar_Categoria
     */
    public Modificar_Categoria() {
        initComponents();
        diseñar_form();
        new consultar().show();
    }

    private void diseñar_form() {
        this.pnlContenedor.setBackground(Colores.fondo_primario);
        this.setBackground(Colores.texto_botones_clicked);
        this.btnActualizar.setBackground(Colores.texto_botones_clicked);
        this.btnActualizar.setOpaque(true);
        this.lblLoader.setVisible(false);
        btnLista.setBackground(Colores.texto_botones_clicked);
        btnLista.setOpaque(true);
        this.txtDescripcion.setLineWrap(true);
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
        lstCategorias = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JLabel();
        lblLoader = new javax.swing.JLabel();
        btnLista = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("NOTA: Para modificar una categoria primero seleccione una de la lista.");

        lstCategorias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCategorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCategorias.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCategoriasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCategorias);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Modifique los datos y presione actualizar:");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de la categoria:");

        txtCategoria.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("Descripción de la categoria:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setAutoscrolls(false);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescripcion);

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

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(115, 115, 115))
                            .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addComponent(btnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblLoader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(lblLoader, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lstCategoriasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCategoriasValueChanged
        // TODO add your handling code here:
        if (lstCategorias.getSelectedIndex() != -1) {
            txtDescripcion.setText(categorias.get(lstCategorias.getSelectedIndex()).getDescripcion());
            txtCategoria.setText(categorias.get(lstCategorias.getSelectedIndex()).getNombreCategoria());
        }
    }//GEN-LAST:event_lstCategoriasValueChanged

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        // TODO add your handling code here:
        btnActualizar.setBackground(Colores.fondo_primario_oscuro);
        btnActualizar.setForeground(Colores.texto_botones_clicked);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        // TODO add your handling code here:
        btnActualizar.setBackground(Colores.texto_botones_clicked);
        btnActualizar.setForeground(Colores.texto_botones);
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        // TODO add your handling code here:
        if (lstCategorias.getSelectedIndex() != -1) {
            categorias.get(lstCategorias.getSelectedIndex()).setDescripcion(txtDescripcion.getText());
            categorias.get(lstCategorias.getSelectedIndex()).setNombreCategoria(txtCategoria.getText());
            new modificar().show();
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMouseEntered
        // TODO add your handling code here:
        btnLista.setBackground(Colores.fondo_primario_oscuro);
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

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        // TODO add your handling code here:
        if (txtCategoria.getText() != null && !txtCategoria.getText().equals("")) {
            txtCategoria.setText(txtCategoria.getText().toUpperCase());   
        }
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // TODO add your handling code here:
        if (txtDescripcion.getText() != null && !txtDescripcion.getText().equals("")) {
            txtDescripcion.setText(txtDescripcion.getText().toUpperCase());   
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    public class modificar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                mostrar_loading(true);
                if (CRUD.conexion_internet()) {
                    if (CRUD.modificar_categoria(categorias.get(lstCategorias.getSelectedIndex()))) {
                    mostrar_loading(false);
                        Vista.mensaje_informacion(Strings.categoria_modificada, Strings.ventana_informacion_titulo);
                    } else {
                    mostrar_loading(false);
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
                    categorias = CRUD.consultar_categorias();
                    listModel = new DefaultListModel();
                    for (int i = 0; i < categorias.size(); i++) {
                        listModel.add(i, categorias.get(i).getNombreCategoria());
                    }
                    lstCategorias.setModel(listModel);
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
        lblLoader.setVisible(mostrar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLoader;
    private javax.swing.JList<String> lstCategorias;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}