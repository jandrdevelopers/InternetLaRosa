/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Forms.Ventas.Ventas;
import Forms.Vendedores.Vendedores;
import Forms.Categorias.Categorias;
import Forms.Productos.Productos;
import Clases.Colores;
import Forms.Compras.Compras;
import Forms.Proveedores.Proveedores;
import Forms.Reportes.Reportes;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author julio
 */
public class Principal extends javax.swing.JFrame {

    Vendedores vendedores = new Vendedores();
    Ventas ventas = new Ventas();
    Productos producto = new Productos();
    Categorias categoria = new Categorias();
    Proveedores proveedores = new Proveedores();
    Reportes reportes = new Reportes();
    Compras compras = new Compras();

    boolean clickedventas = true;
    boolean clikcedvendedores = false;
    boolean clickedproductos = false;
    boolean clickedcategorias = false;
    boolean clickedproveedores = false;
    boolean clickedreportes = false;
    boolean clickedcompras = false;

    /**
     * Creates new form Principal
     */
    public Principal() {
        this.setUndecorated(true);
        initComponents();
        centrar_pantalla();
        diseñar_form();
    }

    private void diseñar_form() {
        this.pnlContenedor.add(ventas);
        this.pnlMenu.setBackground(Colores.texto_botones_clicked);
        this.lblVentas.setBackground(Colores.fondo_primario_oscuro);
        this.lblVentas.setOpaque(true);
        this.lblVentas.setForeground(Colores.texto_botones_clicked);
        this.lblVendedores.setBackground(Colores.fondo_primario);
        this.lblVendedores.setOpaque(true);
        this.lblProductos.setBackground(Colores.fondo_primario);
        this.lblProductos.setOpaque(true);
        this.lblCategorias.setBackground(Colores.fondo_primario);
        this.lblCategorias.setOpaque(true);
        this.lblProveedores.setBackground(Colores.fondo_primario);
        this.lblProveedores.setOpaque(true);
        this.lblReportes.setBackground(Colores.fondo_primario);
        this.lblReportes.setOpaque(true);
        this.lblFondo.setBackground(Colores.fondo_primario);
        this.lblFondo.setOpaque(true);
        this.lblCompras.setBackground(Colores.fondo_primario);
        this.lblCompras.setOpaque(true);
    }

    public final void centrar_pantalla() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width - 200, height - 100);
        setLocationRelativeTo(null);
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
        pnlMenu = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();
        lblVendedores = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContenedor.setLayout(new java.awt.BorderLayout());

        pnlMenu.setPreferredSize(new java.awt.Dimension(300, 507));

        lblVentas.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ventas.png"))); // NOI18N
        lblVentas.setText("          Ventas");
        lblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVentasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVentasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVentasMouseEntered(evt);
            }
        });

        lblVendedores.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vendedores.png"))); // NOI18N
        lblVendedores.setText("          Vendedores");
        lblVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVendedoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVendedoresMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVendedoresMouseEntered(evt);
            }
        });

        lblProductos.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/productos.png"))); // NOI18N
        lblProductos.setText("          Productos");
        lblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblProductosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProductosMouseEntered(evt);
            }
        });

        lblCategorias.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/categorias.png"))); // NOI18N
        lblCategorias.setText("          Categorias");
        lblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoriasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCategoriasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCategoriasMouseEntered(evt);
            }
        });

        lblProveedores.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proveedores.png"))); // NOI18N
        lblProveedores.setText("          Proveedores");
        lblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseEntered(evt);
            }
        });

        lblReportes.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reportes.png"))); // NOI18N
        lblReportes.setText("          Reportes");
        lblReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReportesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReportesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReportesMouseEntered(evt);
            }
        });

        lblCompras.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/compras.png"))); // NOI18N
        lblCompras.setText("          Compras");
        lblCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComprasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComprasMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCategorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(lblVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pnlContenedor.add(pnlMenu, java.awt.BorderLayout.LINE_START);

        getContentPane().add(pnlContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentasMouseEntered
        // TODO add your handling code here:
        if (!this.clickedventas) {
            this.lblVentas.setBackground(Colores.fondo_primario_oscuro);
            this.lblVentas.setOpaque(true);
        }
    }//GEN-LAST:event_lblVentasMouseEntered

    private void lblVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentasMouseExited
        // TODO add your handling code here:
        if (!this.clickedventas) {
            this.lblVentas.setBackground(Colores.fondo_primario);
            this.lblVentas.setOpaque(true);
        }
    }//GEN-LAST:event_lblVentasMouseExited

    private void lblVendedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendedoresMouseEntered
        // TODO add your handling code here:
        if (!this.clikcedvendedores) {
            this.lblVendedores.setBackground(Colores.fondo_primario_oscuro);
            this.lblVendedores.setOpaque(true);
        }
    }//GEN-LAST:event_lblVendedoresMouseEntered

    private void lblVendedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendedoresMouseExited
        // TODO add your handling code here:
        if (!this.clikcedvendedores) {
            this.lblVendedores.setBackground(Colores.fondo_primario);
            this.lblVendedores.setOpaque(true);
        }
    }//GEN-LAST:event_lblVendedoresMouseExited

    private void lblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentasMouseClicked
        // TODO add your handling code here:
        deshabilitar_paneles(true, false, false, false, false, false, false);
        pnlContenedor.add(ventas);
        pnlContenedor.validate();
        deshabilitar_botones(true, false, false, false, false, false, false);
        colorear_botones();
    }//GEN-LAST:event_lblVentasMouseClicked

    private void lblVendedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendedoresMouseClicked
        // TODO add your handling code here:
        deshabilitar_paneles(false, true, false, false, false, false, false);
        pnlContenedor.add(vendedores);
        pnlContenedor.validate();
        deshabilitar_botones(false, true, false, false, false, false, false);
        colorear_botones();
    }//GEN-LAST:event_lblVendedoresMouseClicked

    private void lblProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseEntered
        // TODO add your handling code here:
        if (!this.clickedproductos) {
            this.lblProductos.setBackground(Colores.fondo_primario_oscuro);
            this.lblProductos.setOpaque(true);
        }
    }//GEN-LAST:event_lblProductosMouseEntered

    private void lblProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseExited
        // TODO add your handling code here:
        if (!this.clickedproductos) {
            this.lblProductos.setBackground(Colores.fondo_primario);
            this.lblProductos.setOpaque(true);
        }
    }//GEN-LAST:event_lblProductosMouseExited

    private void lblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseClicked
        // TODO add your handling code here:
        deshabilitar_paneles(false, false, true, false, false, false, false);
        pnlContenedor.add(producto);
        pnlContenedor.validate();
        deshabilitar_botones(false, false, true, false, false, false, false);
        colorear_botones();
    }//GEN-LAST:event_lblProductosMouseClicked

    private void lblCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriasMouseEntered
        // TODO add your handling code here:
        if (!this.clickedcategorias) {
            this.lblCategorias.setBackground(Colores.fondo_primario_oscuro);
            this.lblCategorias.setOpaque(true);
        }
    }//GEN-LAST:event_lblCategoriasMouseEntered

    private void lblCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriasMouseExited
        // TODO add your handling code here:
        if (!this.clickedcategorias) {
            this.lblCategorias.setBackground(Colores.fondo_primario);
            this.lblCategorias.setOpaque(true);
        }
    }//GEN-LAST:event_lblCategoriasMouseExited

    private void lblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriasMouseClicked
        // TODO add your handling code here:
        deshabilitar_paneles(false, false, false, true, false, false, false);
        pnlContenedor.add(categoria);
        pnlContenedor.validate();
        deshabilitar_botones(false, false, false, true, false, false, false);
        colorear_botones();
    }//GEN-LAST:event_lblCategoriasMouseClicked

    private void lblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseClicked
        // TODO add your handling code here:
        deshabilitar_paneles(false, false, false, false, true, false, false);
        pnlContenedor.add(proveedores);
        pnlContenedor.validate();
        deshabilitar_botones(false, false, false, false, true, false, false);
        colorear_botones();
    }//GEN-LAST:event_lblProveedoresMouseClicked

    private void lblProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseEntered
        // TODO add your handling code here:
        if (!this.clickedproveedores) {
            this.lblProveedores.setBackground(Colores.fondo_primario_oscuro);
            this.lblProveedores.setOpaque(true);
        }
    }//GEN-LAST:event_lblProveedoresMouseEntered

    private void lblProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseExited
        // TODO add your handling code here:
        if (!this.clickedproveedores) {
            this.lblProveedores.setBackground(Colores.fondo_primario);
            this.lblProveedores.setOpaque(true);
        }
    }//GEN-LAST:event_lblProveedoresMouseExited

    private void lblReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseEntered
        // TODO add your handling code here:
        if (!this.clickedreportes) {
            this.lblReportes.setBackground(Colores.fondo_primario_oscuro);
            this.lblReportes.setForeground(Colores.texto_botones_clicked);
        }
    }//GEN-LAST:event_lblReportesMouseEntered

    private void lblReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseExited
        // TODO add your handling code here:
        if (!this.clickedreportes) {
            this.lblReportes.setBackground(Colores.fondo_primario);
            this.lblReportes.setForeground(Colores.texto_botones);
        }
    }//GEN-LAST:event_lblReportesMouseExited

    private void lblReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseClicked
        // TODO add your handling code here:
        deshabilitar_paneles(false, false, false, false, false, true, false);
        pnlContenedor.add(reportes);
        pnlContenedor.validate();
        deshabilitar_botones(false, false, false, false, false, true, false);
        colorear_botones();
    }//GEN-LAST:event_lblReportesMouseClicked

    private void lblComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprasMouseEntered
        // TODO add your handling code here:
        if (!this.clickedcompras) {
            this.lblCompras.setBackground(Colores.fondo_primario_oscuro);
            this.lblCompras.setForeground(Colores.texto_botones_clicked);
        }
    }//GEN-LAST:event_lblComprasMouseEntered

    private void lblComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprasMouseExited
        // TODO add your handling code here:
        if (!this.clickedcompras) {
            this.lblCompras.setBackground(Colores.fondo_primario);
            this.lblCompras.setForeground(Colores.texto_botones);
        }
    }//GEN-LAST:event_lblComprasMouseExited

    private void lblComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprasMouseClicked
        // TODO add your handling code here:
        deshabilitar_paneles(false, false, false, false, false, false, true);
        pnlContenedor.add(compras);
        pnlContenedor.validate();
        deshabilitar_botones(false, false, false, false, false, false, true);
        colorear_botones();
    }//GEN-LAST:event_lblComprasMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblVendedores;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables

    private void deshabilitar_botones(boolean ventas, boolean vendedores, boolean productos, boolean categorias,
            boolean proveedores, boolean reportes, boolean compras) {
        this.clickedventas = ventas;
        this.clikcedvendedores = vendedores;
        this.clickedproductos = productos;
        this.clickedcategorias = categorias;
        this.clickedproveedores = proveedores;
        this.clickedreportes = reportes;
        this.clickedcompras = compras;
    }

    private void deshabilitar_paneles(boolean ventas, boolean vendedores, boolean productos, boolean categorias,
            boolean proveedores, boolean reportes, boolean compras) {
        this.ventas.setVisible(ventas);
        this.vendedores.setVisible(vendedores);
        this.producto.setVisible(productos);
        this.categoria.setVisible(categorias);
        this.proveedores.setVisible(proveedores);
        this.reportes.setVisible(reportes);
        this.compras.setVisible(compras);
    }

    private void colorear_botones() {
        this.lblVentas.setBackground(this.clickedventas ? Colores.fondo_primario_oscuro : Colores.fondo_primario);
        this.lblVendedores.setBackground(this.clikcedvendedores ? Colores.fondo_primario_oscuro : Colores.fondo_primario);
        this.lblProductos.setBackground(this.clickedproductos ? Colores.fondo_primario_oscuro : Colores.fondo_primario);
        this.lblCategorias.setBackground(this.clickedcategorias ? Colores.fondo_primario_oscuro : Colores.fondo_primario);
        this.lblProveedores.setBackground(this.clickedproveedores ? Colores.fondo_primario_oscuro : Colores.fondo_primario);
        this.lblReportes.setBackground(this.clickedreportes ? Colores.fondo_primario_oscuro : Colores.fondo_primario);
        this.lblCompras.setBackground(this.clickedcompras ? Colores.fondo_primario_oscuro : Colores.fondo_primario);

        this.lblVentas.setForeground(this.clickedventas ? Colores.texto_botones_clicked : Colores.texto_botones);
        this.lblVendedores.setForeground(this.clikcedvendedores ? Colores.texto_botones_clicked : Colores.texto_botones);
        this.lblProductos.setForeground(this.clickedproductos ? Colores.texto_botones_clicked : Colores.texto_botones);
        this.lblCategorias.setForeground(this.clickedcategorias ? Colores.texto_botones_clicked : Colores.texto_botones);
        this.lblProveedores.setForeground(this.clickedproveedores ? Colores.texto_botones_clicked : Colores.texto_botones);
        this.lblReportes.setForeground(this.clickedreportes ? Colores.texto_botones_clicked : Colores.texto_botones);
        this.lblCompras.setForeground(this.clickedcompras ? Colores.texto_botones_clicked : Colores.texto_botones);
    }
}

