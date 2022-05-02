package forms;

import classes.Factura;
import classes.Producto;
import classes.Render;
import classes.sellProduct;
import components.Notification;
import components.emptyInvoice;
import components.viewInvoice;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Facturas extends javax.swing.JPanel {

    ArrayList<Factura> factArr = new ArrayList();
    Factura actualInvoice = new Factura();

    public Facturas() {
        initComponents();
        setData();
        setTableData();
        emptyInvoice v = new emptyInvoice();
        addPanels(v);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        reportHTMLButton = new javax.swing.JButton();
        searchInvoiceField = new components.TextField();
        invoiceViewPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        invoiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(invoiceTable);

        reportHTMLButton.setBackground(new java.awt.Color(255, 153, 51));
        reportHTMLButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportHTMLButton.setForeground(new java.awt.Color(255, 255, 255));
        reportHTMLButton.setText("Generar Reporte HTML");
        reportHTMLButton.setBorder(null);
        reportHTMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportHTMLButtonActionPerformed(evt);
            }
        });

        searchInvoiceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchInvoiceFieldKeyPressed(evt);
            }
        });

        invoiceViewPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout invoiceViewPanelLayout = new javax.swing.GroupLayout(invoiceViewPanel);
        invoiceViewPanel.setLayout(invoiceViewPanelLayout);
        invoiceViewPanelLayout.setHorizontalGroup(
            invoiceViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        invoiceViewPanelLayout.setVerticalGroup(
            invoiceViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(reportHTMLButton, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(searchInvoiceField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(invoiceViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoiceViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchInvoiceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reportHTMLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchInvoiceFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInvoiceFieldKeyPressed
        searchInTable(searchInvoiceField.getText());
    }//GEN-LAST:event_searchInvoiceFieldKeyPressed

    private void invoiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceTableMouseClicked
        int column = invoiceTable.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / invoiceTable.getRowHeight();
        if (row < invoiceTable.getRowCount() && row >= 0 && column < invoiceTable.getColumnCount() && column >= 0) {
            Object value = invoiceTable.getValueAt(row, column);
            if (value instanceof JButton) {
                String ID = invoiceTable.getValueAt(invoiceTable.getSelectedRow(), 0).toString();
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                if (boton.getName().equals("Ver")) {
//                   ver factura
                    viewInvoicePanel(ID);
                } else {
//                      cancelar factura
                    cancelInvoice(ID);
                }
            }
        }
    }//GEN-LAST:event_invoiceTableMouseClicked

    private void reportHTMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportHTMLButtonActionPerformed
        generarReporte();
    }//GEN-LAST:event_reportHTMLButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable invoiceTable;
    private javax.swing.JPanel invoiceViewPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reportHTMLButton;
    private components.TextField searchInvoiceField;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        String dir = System.getProperty("user.dir");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(dir + "\\resources\\web-programming.png");
        reportHTMLButton.setIcon(new ImageIcon(img));
//        iconLblInvoice.setIcon(new ImageIcon(dir + "\\resources\\invoice black.png"));
        Ventas.readData();
        Productos.readData();
        factArr = Ventas.getFactArr();
        searchInvoiceField.setLabelText("BUSCAR FACTURA...");
        invoiceTable.setDefaultRenderer(Object.class, new Render());
    }

    private void setTableData() {
        Object[] col = {"ID", "Fecha de Emision", "Estado", " ", " "};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JButton view = new JButton("Ver");
        JButton delete = new JButton("Cancelar");
        view.setName("Ver");
        delete.setName("delete");
        Iterator<Factura> it = factArr.iterator();
        while (it.hasNext()) {
            Factura e = it.next();
            Object[] dataRow = {e.getID(), e.getDate(), e.getEstado(), view, delete};
            tableModel.addRow(dataRow);
        }
        invoiceTable.setModel(tableModel);
        invoiceTable.setRowHeight(25);
    }

    public void searchInTable(String searchString) {
        DefaultTableModel model = (DefaultTableModel) invoiceTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        invoiceTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchString.trim()));
    }

    private void viewInvoicePanel(String ID) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (searchInvoice(ID)) {
            loadInvoice();
            Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Factura Cargada con Exito!");
            noti.showNotification();
        } else {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "No se pudo cargar la factura");
            noti.showNotification();
        }
    }

    private boolean searchInvoice(String ID) {
        boolean flag = false;
        Iterator<Factura> it = factArr.iterator();
        while (it.hasNext()) {
            Factura i = it.next();
            if (i.getID().equals(ID)) {
                actualInvoice = i;
                flag = true;
            }
        }
        return flag;
    }

    private void loadInvoice() {
        viewInvoice v = new viewInvoice();
        v.setInvoice(actualInvoice);
        addPanels(v);
    }

    private void addPanels(JPanel p) {
        p.setLocation(0, 0);
        p.setSize(invoiceViewPanel.getWidth(), invoiceViewPanel.getHeight() + 10);
        invoiceViewPanel.removeAll();
        invoiceViewPanel.add(p, BorderLayout.CENTER);
        invoiceViewPanel.revalidate();
        invoiceViewPanel.repaint();

    }

    private void cancelInvoice(String ID) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (searchInvoice(ID)) {
            Iterator<Factura> it = factArr.iterator();
            while (it.hasNext()) {
                Factura e = it.next();
                if (e.getID().equals(ID)) {
                    if (e.getEstado().equals("Habilitada")) {
                        e.setEstado("Cancelada");
                        returnInventary(e);
                        updateBinary();
                        setTableData();
                        loadInvoice();
                    } else {
                        Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Factura cancelada con anterioridad");
                        noti.showNotification();
                    }
                }
            }
        } else {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio mal al actualizar la factura");
            noti.showNotification();
        }
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
            salida.writeObject(factArr);
            Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Factura Actualizada con Exito!");
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

    private void returnInventary(Factura inv) {
        Iterator<sellProduct> it = inv.getArrProd().iterator();
        while (it.hasNext()) {
            sellProduct e = it.next();
//            System.out.println("Devolver: " + e.getName() + "Con cantidad de: " + e.getCant());
            reintegerProduct(e.getCodeAr(), e.getCant());
        }
        Productos.updateBinary();
    }

    private void reintegerProduct(String code, String cant) {
        Iterator<Producto> it = Productos.getArrProducts().iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            if (p.getCodeAr().equals(code)) {
//                System.out.println("Devolviendo " + p.getCodeAr() + " - " + p.getName() + " con " + cant);
                Integer newCant = Integer.parseInt(cant) + Integer.parseInt(p.getCant());
//                System.err.println("Cantidad Nueva a Devolver: " + newCant);
                p.setCant(newCant.toString());
//                System.err.println("Devolucion terminada");
            }
        }
    }

    private void generarReporte() {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            FileSystemView filesys = FileSystemView.getFileSystemView();
            try (BufferedWriter ficheroSalida = new BufferedWriter(
                    new FileWriter(new File(filesys.getHomeDirectory() + "/Reporte Facturas.html")))) {
                Iterator<Factura> it = factArr.iterator();
                String tr = "";
                while (it.hasNext()) {
                    Factura e = it.next();
                    tr = tr + "<tr>\n"
                            + "						<td>" + e.getID() + "</td>\n"
                            + "						<td>" + e.getClientName() + "</td>\n"
                            + "						<td>" + e.getClientNIt() + "</td>\n"
                            + "						<td>" + e.getEmployedCashRegister() + "</td>\n"
                            + "						<td>" + e.getEmployedName() + "</td>\n"
                            + "						<td>" + e.getDate() + "</td>\n"
                            + "						<td>" + e.getEstado() + "</td>\n"
                            + "						<td>" + e.getTotal() + "</td>\n"
                            + "						<td>" + e.getSePagoCon()+ "</td>\n"
                            + "						<td>" + e.getCambio() + "</td>\n"
                            + "					</tr>";
                }
                ficheroSalida.write("<!DOCTYPE html>\n"
                        + "<html lang=\"en\">\n"
                        + "	<head>\n"
                        + "		<meta charset=\"UTF-8\" />\n"
                        + "		<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n"
                        + "		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n"
                        + "		<title>Reporte</title>\n"
                        + "		<link\n"
                        + "			href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n"
                        + "			rel=\"stylesheet\"\n"
                        + "			integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n"
                        + "			crossorigin=\"anonymous\"\n"
                        + "		/>\n"
                        + "	</head>\n"
                        + "	<body style=\"background-color: #000a12\">\n"
                        + "		<div class=\"container-fluid p-4\">\n"
                        + "			<table class=\"table table-lg table-dark table-striped table-hover w-100 text-center\">\n"
                        + "				<thead>\n"
                        + "					<tr>\n"
                        + "						<td colspan=\"10\" style=\"background-color: black; font-size: 1.5rem\">REPORTE DE FACTURAS</td>\n"
                        + "					</tr>\n"
                        + "					<tr>\n"
                        + "						<th>ID</th>\n"
                        + "						<th>Nombre del Cliente</th>\n"
                        + "						<th>NIT del Cliente</th>\n"
                        + "						<th>Numero de Caja</th>\n"
                        + "						<th>Empleado</th>\n"
                        + "						<th>Fecha de Emision</th>\n"
                        + "						<th>Estado</th>\n"
                        + "						<th>Total (Q)</th>\n"
                        + "						<th>Se Pago Con (Q)</th>\n"
                        + "						<th>Cambio (Q)</th>\n"
                        + "					</tr>\n"
                        + "				</thead>\n"
                        + "				<tbody>\n"
                        + tr
                        + "				</tbody>\n"
                        + "			</table>\n"
                        + "		</div>\n"
                        + "	</body>\n"
                        + "</html>");
            }
            Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Reporte Generado Con Exito en el Escritorio!");
            noti.showNotification();
        } catch (IOException errorDeFichero) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo Salio Mal al Crear el Reporte");
            noti.showNotification();
            System.out.println(
                    "Ha habido problemas: "
                    + errorDeFichero.getMessage());
        }
    }

}
