package forms;

import classes.Cliente;
import classes.Empleado;
import classes.Factura;
import classes.Producto;
import classes.sellProduct;
import components.Notification;
import components.actualClient;
import components.addClient;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import main.Main;

public class Ventas extends javax.swing.JPanel {

    public static ArrayList<Factura> getFactArr() {
        return factArr;
    }

    ArrayList<Producto> productsArrSell = new ArrayList();
    Cliente actual = new Cliente();
    Producto productActual = new Producto();
    Empleado empleadoActual = new Empleado();
    private static ArrayList<Factura> factArr = new ArrayList();

    Object[] col = {"Cod.Producto", "Nombre Producto", "Cantidad en Venta", "Existencia", "Precio (Q)", "SubTotal"};
    DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public Ventas() {
        initComponents();
        Config();
        setData();
        readData();
    }

    private void Config() {
        sellTable.setModel(tableModel);
        sellTable.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchProductField = new components.TextField();
        addProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        actualSellLBL = new javax.swing.JLabel();
        addOrAsignClientPanel = new javax.swing.JPanel();
        clientCodeSell = new components.TextField();
        addClient = new javax.swing.JButton();
        TOTAL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addSell = new javax.swing.JButton();
        employedCode = new components.TextField();
        addEmployment = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        cambioLBL1 = new javax.swing.JLabel();
        pagaraConField = new components.TextField();

        setBackground(new java.awt.Color(255, 255, 255));

        addProduct.setForeground(new java.awt.Color(0, 0, 0));
        addProduct.setBorder(null);
        addProduct.setBorderPainted(false);
        addProduct.setContentAreaFilled(false);
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });

        sellTable.setModel(new javax.swing.table.DefaultTableModel(
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
        sellTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(sellTable);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        actualSellLBL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        actualSellLBL.setForeground(new java.awt.Color(255, 255, 255));
        actualSellLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualSellLBL.setText("Venta Actual - Caja No: -- - Le Atiende: -----");
        jPanel1.add(actualSellLBL);

        javax.swing.GroupLayout addOrAsignClientPanelLayout = new javax.swing.GroupLayout(addOrAsignClientPanel);
        addOrAsignClientPanel.setLayout(addOrAsignClientPanelLayout);
        addOrAsignClientPanelLayout.setHorizontalGroup(
            addOrAsignClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        addOrAsignClientPanelLayout.setVerticalGroup(
            addOrAsignClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );

        addClient.setBackground(new java.awt.Color(51, 102, 255));
        addClient.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addClient.setForeground(new java.awt.Color(255, 255, 255));
        addClient.setText("Asignar Cliente");
        addClient.setBorder(null);
        addClient.setBorderPainted(false);
        addClient.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        addClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientActionPerformed(evt);
            }
        });

        TOTAL.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(0, 0, 0));
        TOTAL.setText("00.00");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total Q.");

        addSell.setBackground(new java.awt.Color(0, 153, 255));
        addSell.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addSell.setForeground(new java.awt.Color(255, 255, 255));
        addSell.setText("Realizar Venta");
        addSell.setBorder(null);
        addSell.setBorderPainted(false);
        addSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSellActionPerformed(evt);
            }
        });

        addEmployment.setBackground(new java.awt.Color(51, 153, 0));
        addEmployment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addEmployment.setForeground(new java.awt.Color(255, 255, 255));
        addEmployment.setBorderPainted(false);
        addEmployment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmploymentActionPerformed(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbl.setForeground(new java.awt.Color(0, 0, 0));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("CAMBIO: Q.");

        cambioLBL1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        cambioLBL1.setForeground(new java.awt.Color(0, 0, 0));
        cambioLBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cambioLBL1.setText("00.00");

        pagaraConField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pagaraConField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pagaraConFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addOrAsignClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchProductField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(employedCode, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addEmployment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientCodeSell, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addClient, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pagaraConField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cambioLBL1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(searchProductField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addEmployment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(employedCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clientCodeSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addClient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addOrAsignClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagaraConField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambioLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSell, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientActionPerformed
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

        if (!clientCodeSell.getText().equals("")) {
            if (searchClient(clientCodeSell.getText())) { //buscamos si existe lo agregamos a la factura como tal
                addPanels(new actualClient());
                actualClient.setExternData(actual.getName(), actual.getDirection(), actual.getNIT(), actual.getAge());
            } else {
                addPanels(new addClient());
            }
        } else {
            Notification noti = new Notification(mainFrame, Notification.Type.INFO, Notification.Location.BOTTOM_RIGHT, "Se Creará Un Nuevo Cliente para la Venta Actual");
            noti.showNotification();
            addPanels(new addClient());
        }
    }//GEN-LAST:event_addClientActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (!searchProductField.getText().equals("")) {
            if (searchProduct(searchProductField.getText())) {
                if (!searchProductToSell(searchProductField.getText())) {
                    productsArrSell.add(productActual);
                    addNewProduct(searchProductField.getText());
                } else {
                    addSameProduct(searchProductField.getText());
                }
            }
            actualizarTotal();
            searchProductField.setText("");
            searchProductField.requestFocus();
        } else {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Campo Codigo de Producto Vacio");
            noti.showNotification();
        }
    }//GEN-LAST:event_addProductActionPerformed

    private void addSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSellActionPerformed
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (sellTable.getRowCount() <= 0) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Porfavor Agregue Productos a la venta actual");
            noti.showNotification();
        } else {
            if (actual.getNIT() == null) {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Porfavor Asigne un Cliente a la Venta Actual");
                noti.showNotification();
            } else {
                if (empleadoActual.getCode() == null) {
                    Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Porfavor Asigne un Empleado a la Venta Actual");
                    noti.showNotification();
                } else {
                    //Todo sale bien
                    Notification noti = new Notification(mainFrame, Notification.Type.INFO, Notification.Location.BOTTOM_RIGHT, "Procesando Venta");
                    noti.showNotification();
//                  Abrir ventana de pago y cambio
                    if (validNumber()) {
                        if (Float.parseFloat(pagaraConField.getText()) < Float.parseFloat(TOTAL.getText())) {
                            Notification noti1 = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "El pago no puede ser menor al total");
                            noti1.showNotification();
                        } else {
                            Notification noti2 = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Se realizara la venta actual");
                            noti2.showNotification();
//                            SE GUARDARA LA VENTA ACTUAL
                            AddFact();
                        }
                    } else {
                        Notification noti3 = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Ingrese un numero valido para hacer el pago");
                        noti3.showNotification();
                    }
                }
            }
        }
    }//GEN-LAST:event_addSellActionPerformed

    private void addEmploymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmploymentActionPerformed
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (employedCode.getText().equals("")) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Campo Codigo de Empleado Vacio");
            noti.showNotification();
        } else {
            if (!searchEmployed(employedCode.getText())) {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "El empleado no existe");
                noti.showNotification();
            } else {
                if (empleadoActual.getPuesto().equals("Cajero")) { //asignacion de factura
                    actualSellLBL.setText("Venta Actual - Caja No: " + empleadoActual.getNoCaja() + " - Le Atiende: " + empleadoActual.getName());
                    Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Se Asigno a " + empleadoActual.getName() + " a la Venta Actual");
                    noti.showNotification();
                } else {
                    Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "El Empleado No Posee el Puesto de Cajero");
                    noti.showNotification();
                }
            }
        }
    }//GEN-LAST:event_addEmploymentActionPerformed

    private void pagaraConFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagaraConFieldKeyReleased
        setCambio();        // TODO add your handling code here:
    }//GEN-LAST:event_pagaraConFieldKeyReleased

    private void setCambio() {
        if (validNumber() && pagaraConField.getText() != null) {
            Float pagara = 0f;
            Float cambio = 0f;
            Float total = 0f;
            total = Float.parseFloat(TOTAL.getText());
            pagara = Float.parseFloat(pagaraConField.getText());
            cambio = pagara - total;
            double c = Math.round(cambio * 100.0) / 100.0;
            cambioLBL1.setText(String.valueOf(c));
        } else {
            cambioLBL1.setText("00.00");
        }
    }

    private boolean validNumber() {
        boolean flag = false;
        try {
            Float.parseFloat(pagaraConField.getText());
            flag = true;

        } catch (Exception err) {
            flag = false;
        }
        return flag;
    }

    private void addPanels(JPanel p) {
        p.setLocation(0, 0);
        p.setSize(addOrAsignClientPanel.getWidth(), addOrAsignClientPanel.getHeight());
        addOrAsignClientPanel.removeAll();
        addOrAsignClientPanel.add(p, BorderLayout.CENTER);
        addOrAsignClientPanel.revalidate();
        addOrAsignClientPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel TOTAL;
    private javax.swing.JLabel actualSellLBL;
    private javax.swing.JButton addClient;
    private javax.swing.JButton addEmployment;
    private javax.swing.JPanel addOrAsignClientPanel;
    private javax.swing.JButton addProduct;
    private javax.swing.JButton addSell;
    private javax.swing.JLabel cambioLBL1;
    private components.TextField clientCodeSell;
    private components.TextField employedCode;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private components.TextField pagaraConField;
    private components.TextField searchProductField;
    private javax.swing.JTable sellTable;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        String dir = System.getProperty("user.dir");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(dir + "\\resources\\plus (1).png");
//        Image r = kit.createImage(dir + "\\resources\\web-programming.png");
        Image u = kit.createImage(dir + "\\resources\\contact.png");
        Image a = kit.createImage(dir + "\\resources\\add.png");
        Image e = kit.createImage(dir + "\\resources\\employment.png");
        addEmployment.setIcon(new ImageIcon(e));
        searchProductField.setLabelText("Codigo de Producto");
        employedCode.setLabelText("Codigo del Empleado");
        pagaraConField.setLabelText("Se Pagará Con:");
        addProduct.setIcon(new ImageIcon(img));
        addSell.setIcon(new ImageIcon(a));
//        reportSells.setIcon(new ImageIcon(r));
        addClient.setIcon(new ImageIcon(u));
        clientCodeSell.setLabelText("NIT del Cliente");
        Clientes.readData();
        Productos.readData();
        Empleados.readData();
//        clientSellArr = Clientes.getClientArr();
    }

    private boolean searchClient(String nit) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

        boolean Flag = false;
        try {
            Iterator<Cliente> it = Clientes.getClientArr().iterator();
            while (it.hasNext()) {
                Cliente e = it.next();
                if (e.getNIT().equals(nit)) {
                    actual.setName(e.getName());
                    actual.setDirection(e.getDirection());
                    actual.setNIT(e.getNIT());
                    actual.setAge(e.getAge());
                    Flag = true;
                }
            }
            if (Flag) {
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Cliente Agregado a la Venta Actual");
                noti.showNotification();
            } else {
                Notification noti = new Notification(mainFrame, Notification.Type.INFO, Notification.Location.BOTTOM_RIGHT, "El cliente se Agregará como Nuevo");
                noti.showNotification();
            }
        } catch (Exception err) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
            noti.showNotification();
            System.out.println(err.getMessage());
        }
        return Flag;
    }

    private boolean searchProduct(String cod) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        boolean Flag = false;
        try {
            Iterator<Producto> it = Productos.getArrProducts().iterator();
            while (it.hasNext()) {
                Producto e = it.next();
                if (e.getCodeAr().equals(cod)) {
                    productActual.setCodeAr(e.getCodeAr());
                    productActual.setName(e.getName());
                    productActual.setPrice(e.getPrice());
                    productActual.setCant(e.getCant());
                    productActual.setCode(e.getCode()); //codigo proveedor
                    Flag = true;
                }
            }
            if (Flag) {
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Producto Agregado a la Venta Actual");
                noti.showNotification();
            } else {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Parece que este producto no existe");
                noti.showNotification();
            }
        } catch (Exception err) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
            noti.showNotification();
            System.out.println(err.getMessage());
        }
        return Flag;
    }

    private boolean searchProductToSell(String cod) {
        boolean flag = false;
        for (int i = 0; i < sellTable.getRowCount(); i++) {
            if (sellTable.getValueAt(i, 0).toString().equals(cod)) {
                flag = true;
            }
        }
        return flag;
    }

    private void addNewProduct(String code) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        Iterator<Producto> it = productsArrSell.iterator();
        while (it.hasNext()) {
            Producto e = it.next();
            if (e.getCodeAr().equals(code)) {
                Integer c = Integer.parseInt(e.getCant());
                if (c > 0) {
                    c -= 1;
                    Float i = Float.parseFloat(e.getPrice());
                    Object[] dataRow = {e.getCodeAr(), e.getName(), 1, c, e.getPrice(), i};
                    if (!searchProductToSell(e.getCodeAr())) {
                        tableModel.addRow(dataRow);
                    }
                } else {
                    Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "No hay Existencia de Este Producto");
                    noti.showNotification();
                }
            }
        }
    }

    private void addSameProduct(String code) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        for (int i = 0; i < sellTable.getRowCount(); i++) {
            if (sellTable.getValueAt(i, 0).toString().equals(code)) {
                Integer editCant = Integer.parseInt(sellTable.getValueAt(i, 2).toString());
                Integer editEx = Integer.parseInt(sellTable.getValueAt(i, 3).toString());
                Float subtotal = Float.parseFloat(sellTable.getValueAt(i, 4).toString());

                if (editEx <= 0) {
                    Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "No hay mas existencias del producto");
                    noti.showNotification();
                } else {
                    editCant += 1;
                    subtotal *= editCant;
                    editEx -= 1;
                    sellTable.setValueAt(editCant, i, 2);
                    sellTable.setValueAt(editEx, i, 3);
                    sellTable.setValueAt(subtotal, i, 5);
                }
            }
        }
    }

    private void actualizarTotal() {
        if (sellTable.getRowCount() > 0) { // hay productos en la venta
            Float total = 0f;
            for (int i = 0; i < sellTable.getRowCount(); i++) {
                total += Float.parseFloat(sellTable.getValueAt(i, 5).toString());
            }
            TOTAL.setText(total.toString());
        }
    }

    private boolean searchEmployed(String code) {
        boolean flag = false;
        Iterator<Empleado> it = Empleados.getEmArray().iterator();
        while (it.hasNext()) {
            Empleado e = it.next();
            if (e.getCode().equals(code)) {
                empleadoActual.setCode(e.getCode());
                empleadoActual.setName(e.getName());
                empleadoActual.setPuesto(e.getPuesto());
                empleadoActual.setSalary(e.getSalary());
                empleadoActual.setNoCaja(e.getNoCaja());
                flag = true;
            }
        }
        return flag;
    }

    public static String generateRandomString(int length) {
        // Puede personalizar los personajes que desea agregar a
        // las cadenas al azar
        String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        String CHAR_UPPER = CHAR_LOWER.toUpperCase();
        String NUMBER = "0123456789";

        String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
        SecureRandom random = new SecureRandom();

        if (length < 1) {
            throw new IllegalArgumentException();
        }

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            // 0-62 (exclusive), retornos aleatorios 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

            sb.append(rndChar);
        }

        return sb.toString();
    }

    public static String getTOTAL() {
        return TOTAL.getText();
    }

    public void AddFact() {
        Factura invoice = new Factura();
        
        
        ArrayList<sellProduct> arrSellP = new ArrayList<>();
        
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        
//      GUARDAR DATOS GENERALES DE LA FACTURA
        invoice.setID(generateRandomString(10));
        invoice.setClientName(actual.getName());
        invoice.setClientNIt(actual.getNIT());
        invoice.setEmployedCashRegister(empleadoActual.getNoCaja());
        invoice.setEmployedName(empleadoActual.getName());
        invoice.setDate(simpleDateFormat.format(new Date()));
        invoice.setTotal(TOTAL.getText());
        invoice.setCambio(cambioLBL1.getText());
        invoice.setEstado("Habilitada");
        invoice.setSePagoCon(pagaraConField.getText());
//      OBTENER LISTADO DE PRODUCTOS
        for (int i = 0; i < sellTable.getRowCount(); i++) {
            sellProduct sellP = new sellProduct();
            
            String codeAr = sellTable.getValueAt(i, 0).toString();
            String name = sellTable.getValueAt(i, 1).toString();
            String cantidad = sellTable.getValueAt(i, 2).toString();
            Integer existencia = Integer.parseInt(sellTable.getValueAt(i, 3).toString());
            String unitPrice = sellTable.getValueAt(i, 4).toString();
            String subtotal = sellTable.getValueAt(i, 5).toString();
            
            sellP.setCant(cantidad);
            sellP.setCodeAr(codeAr);
            sellP.setName(name);
            sellP.setPrice(unitPrice);
            sellP.setSubTotal(subtotal);
            arrSellP.add(sellP);

            Iterator<Producto> it = Productos.getArrProducts().iterator();
            while (it.hasNext()) {
                Producto product = it.next();
                if (product.getCodeAr().equals(codeAr)) {
                    product.setCant(existencia.toString());
                }
            }
            Productos.updateBinary();
        }
        invoice.setArrProd(arrSellP);
        getFactArr().add(invoice);
        updateBinary();
        resetData();
    }

    private void updateBinary() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

        try {
            //Se crea el fichero
            fos = new FileOutputStream("invoice.dat");
            salida = new ObjectOutputStream(fos);
            //Se escribe el objeto en el fichero
            salida.writeObject(getFactArr());
            Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Venta Realizada con Exito!");
            noti.showNotification();
        } catch (FileNotFoundException e) {
            System.out.println("1" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2" + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println("3" + e.getMessage());
            }
        }
    }

    public static void readData() {
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        try {
            fis = new FileInputStream("invoice.dat");
            entrada = new ObjectInputStream(fis);
            factArr = (ArrayList<Factura>) entrada.readObject(); //es necesario el casting
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void resetData() {
        Main.setPanels(3);
    }

}
