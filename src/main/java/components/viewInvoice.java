/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import classes.Factura;
import classes.sellProduct;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Namikaze
 */
public class viewInvoice extends javax.swing.JPanel {

    Object[] col = {"Cantidad", "Producto", "Precio", "SubTotal"};
    DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public viewInvoice() {
        initComponents();
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        invoiceIDLbl = new javax.swing.JLabel();
        invoiceClientName = new components.TextField();
        invoiceClientNit = new components.TextField();
        invoiceEmitDate = new components.TextField();
        invoiceCashRegister = new components.TextField();
        invoiceEmployedName = new components.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceProductsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invoiceTotalLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        invoiceCambioLbl = new javax.swing.JLabel();
        cancelAlert = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sePagoConLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("FACTURA ID - ");

        invoiceIDLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        invoiceIDLbl.setForeground(new java.awt.Color(51, 153, 255));
        invoiceIDLbl.setText("##########");

        invoiceProductsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(invoiceProductsTable);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Productos");
        jPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TOTAL Q.");

        invoiceTotalLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        invoiceTotalLbl.setForeground(new java.awt.Color(0, 0, 0));
        invoiceTotalLbl.setText("00.00");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cambio Q.");

        invoiceCambioLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        invoiceCambioLbl.setForeground(new java.awt.Color(0, 0, 0));
        invoiceCambioLbl.setText("00.00");

        cancelAlert.setBackground(new java.awt.Color(255, 51, 51));
        cancelAlert.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CANCELADA");
        cancelAlert.add(jLabel2);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Se Pago Con Q.");

        sePagoConLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        sePagoConLbl.setForeground(new java.awt.Color(0, 0, 0));
        sePagoConLbl.setText("00.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(invoiceCashRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(invoiceEmitDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invoiceClientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceClientNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoiceIDLbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(invoiceEmployedName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceTotalLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceCambioLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sePagoConLbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(cancelAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(invoiceIDLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceClientNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoiceEmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceCashRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceEmployedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invoiceCambioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sePagoConLbl)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceTotalLbl)
                            .addComponent(jLabel4))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancelAlert;
    private static javax.swing.JLabel invoiceCambioLbl;
    private static components.TextField invoiceCashRegister;
    private static components.TextField invoiceClientName;
    private static components.TextField invoiceClientNit;
    private static components.TextField invoiceEmitDate;
    private static components.TextField invoiceEmployedName;
    private static javax.swing.JLabel invoiceIDLbl;
    private static javax.swing.JTable invoiceProductsTable;
    private static javax.swing.JLabel invoiceTotalLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sePagoConLbl;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        invoiceProductsTable.setModel(tableModel);
        invoiceClientName.setLabelText("Nombre del Cliente:");
        invoiceClientNit.setLabelText("NIT del Cliente:");
        invoiceCashRegister.setLabelText("Caja Numero:");
        invoiceEmployedName.setLabelText("Le atendió:");
        invoiceEmitDate.setLabelText("Fecha de Emisión:");

        invoiceClientName.setEditable(false);
        invoiceClientNit.setEditable(false);
        invoiceCashRegister.setEditable(false);
        invoiceEmployedName.setEditable(false);
        invoiceEmitDate.setEditable(false);
    }

    public void setInvoice(Factura obj) {
        invoiceIDLbl.setText(obj.getID());
        invoiceCambioLbl.setText(obj.getCambio());
        invoiceTotalLbl.setText(obj.getTotal());
        invoiceClientName.setText(obj.getClientName());
        invoiceClientNit.setText(obj.getClientNIt());
        invoiceEmitDate.setText(obj.getDate());
        invoiceEmployedName.setText(obj.getEmployedName());
        invoiceCashRegister.setText(obj.getEmployedCashRegister());
        sePagoConLbl.setText(obj.getSePagoCon());
        if (obj.getEstado().equals("Cancelada")) {
            cancelAlert.setVisible(true);
        } else {
            cancelAlert.setVisible(false);
        }

        Iterator<sellProduct> it = obj.getArrProd().iterator();
        while (it.hasNext()) {
            sellProduct e = it.next();
            Object[] dataRow = {e.getCant(), e.getName(), e.getPrice(), e.getSubTotal()};
            tableModel.addRow(dataRow);
        }
    }
}
