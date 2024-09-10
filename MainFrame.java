/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nmenj
 */
import java.awt.Container;
    import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public class MainFrame extends JFrame {
    private final JTable tablaProductos;
    private final JTable tablaFactura;
    private final DefaultTableModel modeloTabla;
    private final DefaultTableModel modeloFactura;
    private final JTextField txtCodigo;
    private final JTextField txtNombre;
    private final JTextField txtCantidad;
    private final JTextField txtPrecio;
    private final JLabel lblTotalSinIVA;
    private final JLabel lblIVA;
    private final JLabel lblTotalConIVA;

    public MainFrame() {

        // Configuración de la ventana
        setTitle("CRUD de Productos y Factura");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Campos de texto
        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 20, 100, 20);
        panel.add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 20, 100, 20);
        panel.add(txtCodigo);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 50, 100, 20);
        panel.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 50, 100, 20);
        panel.add(txtNombre);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(20, 80, 100, 20);
        panel.add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(120, 80, 100, 20);
        panel.add(txtCantidad);

        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(20, 110, 100, 20);
        panel.add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(120, 110, 100, 20);
        panel.add(txtPrecio);

        // Botones CRUD
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(20, 150, 100, 30);
        panel.add(btnAgregar);

        JButton btnModificar = new JButton("Modificar");
        btnModificar.setBounds(130, 150, 100, 30);
        panel.add(btnModificar);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(240, 150, 100, 30);
        panel.add(btnEliminar);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(350, 150, 100, 30);
        panel.add(btnBuscar);

        // Tabla de productos
        String[] columnas = {"Código", "Nombre", "Cantidad", "Precio"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaProductos = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaProductos);
        scrollPane.setBounds(20, 200, 550, 150);
        panel.add(scrollPane);

        // Tabla de factura
        String[] columnasFactura = {"Código", "Nombre", "Cantidad", "Precio"};
        modeloFactura = new DefaultTableModel(columnasFactura, 0);
        tablaFactura = new JTable(modeloFactura);
        JScrollPane scrollFactura = new JScrollPane(tablaFactura);
        scrollFactura.setBounds(20, 370, 550, 100);
        panel.add(scrollFactura);

        // Botón para generar factura
        JButton btnGenerarFactura = new JButton("Generar Factura");
        btnGenerarFactura.setBounds(600, 200, 150, 30);
        panel.add(btnGenerarFactura);

        // Totales
        lblTotalSinIVA = new JLabel("Total sin IVA: $0.00");
        lblTotalSinIVA.setBounds(600, 250, 150, 20);
        panel.add(lblTotalSinIVA);

        lblIVA = new JLabel("IVA (19%): $0.00");
        lblIVA.setBounds(600, 280, 150, 20);
        panel.add(lblIVA);

        lblTotalConIVA = new JLabel("Total con IVA: $0.00");
        lblTotalConIVA.setBounds(600, 310, 150, 20);
        panel.add(lblTotalConIVA);

        // Funcionalidad de los botones
        btnAgregar.addActionListener((var e) -> {
agregarProducto();
        });

        btnModificar.addActionListener((var e) -> {
modificarProducto();
        });

        btnEliminar.addActionListener((ActionEvent e) -> {
eliminarProducto();
        });

        btnBuscar.addActionListener((ActionEvent e) -> {
buscarProducto();
        });

        btnGenerarFactura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarFactura();
            }

            private void generarFactura() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        add(panel);
    }

    // Métodos para CRUD y Factura (explicados en los pasos anteriores)
    // ...

        private void agregarProducto() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void modificarProducto() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void buscarProducto() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void eliminarProducto() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

