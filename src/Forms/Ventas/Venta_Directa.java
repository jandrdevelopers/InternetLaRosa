/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Ventas;

import Clases.CRUD;
import Clases.Colores;
import Clases.Producto;
import Clases.Strings;
import Clases.Vendedor;
import Clases.Venta;
import Clases.Vista;
import Forms.Categorias.Eliminar_Categoria;
import Forms.Categorias.Registrar_Categoria;
import Forms.Productos.Modificar_Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jandr
 */
public class Venta_Directa extends javax.swing.JPanel {

    ArrayList<Producto> productos = new ArrayList<Producto>();
    ArrayList<Producto> filtro = new ArrayList<Producto>();
    ArrayList<Venta> ventas = new ArrayList<Venta>();
    DefaultListModel listModel;
    String col[] = {"Producto", "Cantidad", "Precio", "Total", "Fecha", "Vendedor", "Categoria"};
    DefaultTableModel tableModel = new DefaultTableModel(col, 0);

    /**
     * Creates new form Venta_Directa
     */
    public Venta_Directa() {
        initComponents();
        diseñar_form();
        new consultar_productos().show();
        new consultar_ventas().show();
    }

    private void diseñar_form() {
        this.setBackground(Colores.texto_botones_clicked);
        pnlContenedor.setBackground(Colores.fondo_primario);
        btnLista.setBackground(Colores.texto_botones_clicked);
        btnLista.setOpaque(true);
        btnVender.setBackground(Colores.texto_botones_clicked);
        btnVender.setOpaque(true);
        lblLoader.setVisible(false);
        int height2 = this.getSize().height;
        int width2 = this.getSize().width;
        this.setMaximumSize(new Dimension(width2, height2));
        int height = pnlContenedor.getSize().height;
        int width = pnlContenedor.getSize().width;
        pnlContenedor.setMaximumSize(new Dimension(width, height));
        update_calendar();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        btnVender = new javax.swing.JLabel();
        lblLoader = new javax.swing.JLabel();
        btnLista = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jdcVentas = new com.toedter.calendar.JDateChooser();
        lblExistencia = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("NOTA: Puede filtrar los productos con la barra de busqueda y seleccionar uno de la lista.");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("NOTA: La cantidad a vender siempre es uno, en caso de no serla modifiquela.");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lstProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstProductos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstProductos);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Producto:");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cantidad:");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Total:");

        txtProducto.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        txtPrecio.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        txtTotal.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        spnCantidad.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 500, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        spnCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnCantidadMouseClicked(evt);
            }
        });

        btnVender.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnVender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVender.setText("Vender");
        btnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVenderMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVenderMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVenderMouseEntered(evt);
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

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblVentas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel9.setText("Ultimas ventas registradas:");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fecha:");

        lblExistencia.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lblExistencia.setText("Existencia:");

        txtExistencia.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtExistencia.setText("0");

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar))
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLoader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblExistencia)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtExistencia)
                                        .addGap(53, 53, 53))
                                    .addComponent(spnCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdcVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscar)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblExistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(lblLoader, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addGap(23, 23, 23)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here: 
        if (txtBuscar.getText() != null && !txtBuscar.getText().equals("")) {
            txtBuscar.setText(txtBuscar.getText().toUpperCase());
            filtro.clear();
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getNombreProducto().contains(txtBuscar.getText())) {
                    filtro.add(productos.get(i));
                }
            }
            listModel = new DefaultListModel();
            for (int i = 0; i < filtro.size(); i++) {
                listModel.add(i, filtro.get(i).getNombreProducto());
            }
            lstProductos.setModel(listModel);
        } else {
            listModel = new DefaultListModel();
            filtro.clear();
            for (int i = 0; i < productos.size(); i++) {
                filtro.add(productos.get(i));
                listModel.add(i, productos.get(i).getNombreProducto());
            }
            lstProductos.setModel(listModel);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void lstProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductosValueChanged
        // TODO add your handling code here: 
        if (lstProductos.getSelectedIndex() != -1) {
            String pro = filtro.get(lstProductos.getSelectedIndex()).getNombreProducto();
            if (pro.length() > 34) pro = pro.substring(0, 34);
            txtProducto.setText(pro);
            txtPrecio.setText(String.valueOf(filtro.get(lstProductos.getSelectedIndex()).getPrecioVenta()));
            Double precio = filtro.get(lstProductos.getSelectedIndex()).getPrecioVenta();
            int cantidad = (int) spnCantidad.getValue();
            Double total = precio * cantidad;
            txtTotal.setText(String.valueOf(total));
            int existencia = filtro.get(lstProductos.getSelectedIndex()).getExistencia() - cantidad;
            change_color_existencia(existencia);
        }
    }//GEN-LAST:event_lstProductosValueChanged

    private void spnCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnCantidadMouseClicked
        // TODO add your handling code here:
        System.out.println("cambio valor spnCantidad clicked");
        if (txtPrecio.getText() != null && !txtPrecio.getText().equals("")) {
            Double precio = filtro.get(lstProductos.getSelectedIndex()).getPrecioVenta();
            int cantidad = (int) spnCantidad.getValue();
            Double total = precio * cantidad;
            txtTotal.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_spnCantidadMouseClicked

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        // TODO add your handling code here:        
        if (txtPrecio.getText() != null && !txtPrecio.getText().equals("")) {
            System.out.println("cambio valor spnCantidad statechanged");
            Double precio = filtro.get(lstProductos.getSelectedIndex()).getPrecioVenta();
            int cantidad = (int) spnCantidad.getValue();
            Double total = precio * cantidad;
            txtTotal.setText(String.valueOf(total));
            int existencia = filtro.get(lstProductos.getSelectedIndex()).getExistencia() - cantidad;
            change_color_existencia(existencia);
        }
    }//GEN-LAST:event_spnCantidadStateChanged

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
        new consultar_productos().show();
    }//GEN-LAST:event_btnListaMouseClicked

    private void btnVenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseEntered
        // TODO add your handling code here:
        btnVender.setBackground(Colores.fondo_primario_oscuro);
        btnVender.setForeground(Colores.texto_botones_clicked);
    }//GEN-LAST:event_btnVenderMouseEntered

    private void btnVenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseExited
        // TODO add your handling code here:
        btnVender.setBackground(Colores.texto_botones_clicked);
        btnVender.setForeground(Colores.texto_botones);
    }//GEN-LAST:event_btnVenderMouseExited

    private void btnVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseClicked
        // TODO add your handling code here:
        java.util.Date date = jdcVentas.getDate(); 
        Double precio = filtro.get(lstProductos.getSelectedIndex()).getPrecioVenta();
        int cantidad = (int) spnCantidad.getValue();
        Double total = precio * cantidad;
        Venta venta = new Venta(0, filtro.get(lstProductos.getSelectedIndex()), cantidad, total, date, Vendedor.recuperar_instancia());
        new agregar_venta(venta).show();
        update_calendar();
    }//GEN-LAST:event_btnVenderMouseClicked

     public class modificar_producto implements Runnable {

        private Producto producto;
        public void show() {
            new Thread(this).start();
        }

        public modificar_producto(Producto producto) {
            this.producto = producto;
        }

        @Override
        public void run() {
            try {
                CRUD.modificar_producto(producto);
            } catch (SQLException ex) {
                Logger.getLogger(Venta_Directa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Venta_Directa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
    public class consultar_productos implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                mostrar_loading(true);
                if (CRUD.conexion_internet()) {
                    productos = CRUD.consultar_productos(1, "categoria, nombreProducto");
                    filtro.clear();
                    for (int i = 0; i < productos.size(); i++) {
                        filtro.add(productos.get(i));
                    }
                    listModel = new DefaultListModel();
                    for (int i = 0; i < productos.size(); i++) {
                        listModel.add(i, productos.get(i).getNombreProducto());
                    }
                    lstProductos.setModel(listModel);
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

    public class consultar_ventas implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                mostrar_loading(true);
                if (CRUD.conexion_internet()) {
                    ventas = CRUD.consultar_ventas_dia(Strings.getStringDate());
                    int contador = ventas.size() > 20 ? 20 : ventas.size();
                    for (int i = 0; i < contador; i++) {
                        String producto = ventas.get(i).getProducto().getNombreProducto();
                        int cantidad = ventas.get(i).getCantidad();
                        double precio = ventas.get(i).getTotal() / ventas.get(i).getCantidad();
                        double total = ventas.get(i).getTotal();
                        String fecha = ventas.get(i).getFechaFormat();
                        String vendedor = ventas.get(i).getVendedor().getNombre_vendedor();
                        String categoria = ventas.get(i).getProducto().getCategoria().getNombreCategoria();
                        Object[] data = {producto, cantidad, precio, total, fecha, vendedor, categoria};
                        tableModel.addRow(data);
                    }
                    tblVentas.setModel(tableModel);
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

    public class agregar_venta implements Runnable {

        private Venta venta;

        public agregar_venta(Venta venta) {
            this.venta = venta;
        }

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                mostrar_loading(true);
                if (CRUD.conexion_internet()) {
                    if (CRUD.insertar_venta(venta) != 0) {
                        ventas.add(0, venta);
                        int contador = ventas.size() > 20 ? 20 : ventas.size();
                        tableModel.getDataVector().removeAllElements();
                        revalidate();
                        System.out.println(contador);
                        Producto producto1 = venta.getProducto();
                        producto1.setExistencia(producto1.getExistencia() - venta.getCantidad());
                        for (int i = 0; i < contador; i++) {
                            String producto = ventas.get(i).getProducto().getNombreProducto();
                            int cantidad = ventas.get(i).getCantidad();
                            double precio = ventas.get(i).getTotal() / ventas.get(i).getCantidad();
                            double total = ventas.get(i).getTotal();
                            String fecha = ventas.get(i).getFechaFormat();
                            String vendedor = ventas.get(i).getVendedor().getNombre_vendedor();
                            String categoria = ventas.get(i).getProducto().getCategoria().getNombreCategoria();
                            Object[] data = {producto, cantidad, precio, total, fecha, vendedor, categoria};
                            tableModel.addRow(data);
                        }
                        tblVentas.setModel(tableModel);
                        mostrar_loading(false);
                        new modificar_producto(producto1).show();
                        Vista.mensaje_informacion(Strings.venta_agregada, Strings.ventana_informacion_titulo);
                        clear_text();
                    } else {
                        mostrar_loading(false);
                        Vista.mensaje_error(Strings.error_desconocido, Strings.titulo_error_vendedor);
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

    private void clear_text() {
        txtExistencia.setText("");
        lblExistencia.setForeground(Color.BLACK);
        txtBuscar.setText("");
        txtProducto.setText("");
        txtPrecio.setText("");
        spnCantidad.setValue(1);
        txtTotal.setText("");
        filtro.clear();
        for (int i = 0; i < productos.size(); i++) {
            filtro.add(productos.get(i));
        }
        listModel = new DefaultListModel();
        for (int i = 0; i < productos.size(); i++) {
            listModel.add(i, productos.get(i).getNombreProducto());
        }
        lstProductos.setModel(listModel);
    }

    private void mostrar_loading(boolean mostrar) {
        btnLista.setVisible(!mostrar);
        btnVender.setVisible(!mostrar);
        lblLoader.setVisible(mostrar);
    }
    
    private void update_calendar() {
        Calendar c = Calendar.getInstance();
        java.util.Date date = c.getTime();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fecha = hourdateFormat.format(date);
        jdcVentas.setDate(date);
    }
    
    private void change_color_existencia(int existencia) {
        txtExistencia.setText("" + existencia);
        txtExistencia.setForeground(existencia <= 5 ? Color.RED : Color.BLACK);
        lblExistencia.setForeground(existencia <= 5 ? Color.RED : Color.BLACK);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLista;
    private javax.swing.JLabel btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcVentas;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblLoader;
    private javax.swing.JList<String> lstProductos;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtExistencia;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtProducto;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
