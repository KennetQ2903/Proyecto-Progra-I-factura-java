/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import classes.Producto;
import classes.Proveedor;
import classes.Render;
import components.Notification;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Productos extends javax.swing.JPanel {

    public static ArrayList<Producto> getArrProducts() {
        return arrProducts;
    }

    ArrayList<Proveedor> arrProv = new ArrayList();
    private static ArrayList<Producto> arrProducts = new ArrayList();

    public Productos() {
        initComponents();
        readData();
        setData();
        setProveedorCodes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAddEdit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        priceProdField = new components.TextField();
        codProvField = new components.Combobox();
        nameProdField = new components.TextField();
        cantProdField = new components.Spinner();
        codProd = new components.TextField();
        searchProductField = new components.TextField();
        reportHTMLButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        buttonAddEdit.setBackground(new java.awt.Color(0, 98, 163));
        buttonAddEdit.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddEdit.setText("Agregar");
        buttonAddEdit.setBorder(null);
        buttonAddEdit.setBorderPainted(false);
        buttonAddEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddEditActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
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
        prodTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prodTable);

        searchProductField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchProductFieldKeyPressed(evt);
            }
        });

        reportHTMLButton.setBackground(new java.awt.Color(255, 153, 0));
        reportHTMLButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportHTMLButton.setForeground(new java.awt.Color(255, 255, 255));
        reportHTMLButton.setText("Generar Reporte HTML");
        reportHTMLButton.setBorderPainted(false);
        reportHTMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportHTMLButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar/Editar Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(buttonAddEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(priceProdField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(cantProdField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(nameProdField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(codProvField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(codProd, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchProductField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addComponent(reportHTMLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchProductField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(codProvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameProdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cantProdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(priceProdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(buttonAddEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(reportHTMLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddEditActionPerformed
        if (codProvField.getSelectedItem() != "---") {
            if (buttonAddEdit.getText().equals("Editar")) {
                editData(codProd.getText());
                codProd.setEditable(true);
            } else {
                saveData();
                
            }
            updateBinary();
        } else {
            JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Seleccione un Codigo de Proveedor");
            noti.showNotification();
        }
    }//GEN-LAST:event_buttonAddEditActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void prodTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodTableMouseClicked
        int column = prodTable.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / prodTable.getRowHeight();
        if (row < prodTable.getRowCount() && row >= 0 && column < prodTable.getColumnCount() && column >= 0) {
            Object value = prodTable.getValueAt(row, column);
            if (value instanceof JButton) {
                String codeAr = prodTable.getValueAt(prodTable.getSelectedRow(), 0).toString();
                String codeProv = prodTable.getValueAt(prodTable.getSelectedRow(), 1).toString();
                String name = prodTable.getValueAt(prodTable.getSelectedRow(), 2).toString();
                String cant = prodTable.getValueAt(prodTable.getSelectedRow(), 3).toString();
                String price = prodTable.getValueAt(prodTable.getSelectedRow(), 4).toString();

                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                if (boton.getName().equals("Edit")) {
//                    editar campos
                    codProd.setText(codeAr);
                    codProvField.setSelectedItem(codeProv);
                    nameProdField.setText(name);
                    cantProdField.setText(cant);
                    priceProdField.setText(price);

                    buttonAddEdit.setText("Editar");
                    codProd.setEditable(false);

                } else {
//                      eliminar campo
                    deleteData(codeAr);
                }
            }
        }
    }//GEN-LAST:event_prodTableMouseClicked

    private void searchProductFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchProductFieldKeyPressed
        searchInTable(searchProductField.getText());
    }//GEN-LAST:event_searchProductFieldKeyPressed

    private void reportHTMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportHTMLButtonActionPerformed
        generarReporte();
    }//GEN-LAST:event_reportHTMLButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddEdit;
    private components.Spinner cantProdField;
    private components.TextField codProd;
    private components.Combobox codProvField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private components.TextField nameProdField;
    private components.TextField priceProdField;
    private javax.swing.JTable prodTable;
    private javax.swing.JButton reportHTMLButton;
    private components.TextField searchProductField;
    // End of variables declaration//GEN-END:variables

    private void setProveedorCodes() {
        Proveedores.readData();
        arrProv = Proveedores.getArray();
        codProvField.addItem("---");
        Iterator<Proveedor> it = arrProv.iterator();
        while (it.hasNext()) {
            Proveedor p = it.next();
            codProvField.addItem(p.getCode());
        }
    }

    private void saveData() {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            if (!searchProduct(codProd.getText(), nameProdField.getText())) {
                Producto e = new Producto();
                e.setCodeAr(codProd.getText());
                e.setName(nameProdField.getText());
                e.setCode((String) codProvField.getSelectedItem());
                e.setCant(cantProdField.getText());
                e.setPrice(priceProdField.getText());
                getArrProducts().add(e);
                resetData();
                setData();
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Producto Guardado Correctamente!");
                noti.showNotification();
            } else {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Codigo o Nombre del Producto Ya Existentes");
                noti.showNotification();
            }
        } catch (Exception err) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
            noti.showNotification();
            System.out.println(err.getMessage());
        }
    }

    private void resetData() {
        buttonAddEdit.setText("Agregar");
        codProvField.setSelectedIndex(0);
        codProd.setText("");
        nameProdField.setText("");
        cantProdField.setText("0");
        priceProdField.setText("");
    }

    private void setData() {
        String dir = System.getProperty("user.dir");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(dir + "\\resources\\web-programming.png");
        reportHTMLButton.setIcon(new ImageIcon(img));
        codProd.setLabelText("Codigo del Producto");
        codProvField.setLabeText("Codigo del Proveedor");
        nameProdField.setLabelText("Nombre del Producto");
        cantProdField.setLabelText("Cantidad");
        priceProdField.setLabelText("Precio Unitario Q.");
        prodTable.setDefaultRenderer(Object.class, new Render());
        searchProductField.setLabelText("BUSCAR PRODUCTO...");
        JButton edit = new JButton("Editar");
        JButton delete = new JButton("Eliminar");
        edit.setName("Edit");
        delete.setName("delete");

        Object[] col = {"Cod.Producto", "Cod.Proveedor", "Nombre Producto", "Cantidad", "Precio (Q)", " ", " "};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Iterator<Producto> it = getArrProducts().iterator();
        while (it.hasNext()) {
            Producto e = it.next();
            Object[] dataRow = {e.getCodeAr(), e.getCode(), e.getName(), e.getCant(), e.getPrice(), edit, delete};
            tableModel.addRow(dataRow);
        }
        prodTable.setModel(tableModel);
        prodTable.setRowHeight(25);
    }

    public static void updateBinary() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("product.dat");
            salida = new ObjectOutputStream(fos);

            //Se escribe el objeto en el fichero
            salida.writeObject(getArrProducts());

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

    private void editData(String codeAr) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            Iterator<Producto> it = getArrProducts().iterator();
            while (it.hasNext()) {
                Producto e = it.next();
                if (e.getCodeAr().equals(codeAr)) {
                    e.setCodeAr(codProd.getText());
                    e.setCode(codProvField.getSelectedItem().toString());
                    e.setName(nameProdField.getText());
                    e.setCant(cantProdField.getText());
                    e.setPrice(priceProdField.getText());
                }
            }
            setData();
            resetData();
            Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Producto Editado Correctamente!");
            noti.showNotification();
        } catch (Exception err) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
            noti.showNotification();
            System.out.println(err.getMessage());
        }
    }

    private void deleteData(String c) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

        if (JOptionPane.showConfirmDialog(this,
                "Estas seguro de Eliminar este Producto?", "Eliminar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            try {
                Iterator<Producto> it = getArrProducts().iterator();
                while (it.hasNext()) {
                    Producto e = it.next();
                    if (e.getCodeAr().equals(c)) {
                        it.remove();
                    }
                }
                updateBinary();
                setData();
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Producto Eliminado Correctamente!");
                noti.showNotification();
            } catch (Exception err) {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
                noti.showNotification();
                System.out.println(err.getMessage());
            }
        }

    }

    public static void readData() {
        FileInputStream fis = null;
        ObjectInputStream entrada = null;

        try {

            fis = new FileInputStream("product.dat");
            entrada = new ObjectInputStream(fis);
            arrProducts = (ArrayList<Producto>) entrada.readObject(); //es necesario el casting

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

    public void searchInTable(String searchString) {
        DefaultTableModel model = (DefaultTableModel) prodTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        prodTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchString.trim()));
    }

    private boolean searchProduct(String cod, String name) {
        boolean flag = false;
        Iterator<Producto> it = arrProducts.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            if (p.getCodeAr().equals(cod) || p.getName().equals(name)) {
                flag = true;
            }
        }
        return flag;
    }
    
    
    private void generarReporte() {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            FileSystemView filesys = FileSystemView.getFileSystemView();
            try (BufferedWriter ficheroSalida = new BufferedWriter(
                    new FileWriter(new File(filesys.getHomeDirectory() + "/Reporte Productos.html")))) {
                Iterator<Producto> it = arrProducts.iterator();
                String tr = "";
                while(it.hasNext()){
                    Producto e = it.next();
                    tr = tr + "<tr>\n" +
"						<td>" + e.getCode()+ "</td>\n" +
    "						<td>" + e.getCodeAr()+ "</td>\n" +
"						<td>" + e.getName()+ "</td>\n" +
"						<td>" + e.getCant()+ "</td>\n" +
    "						<td>" + e.getPrice()+ "</td>\n" +

"					</tr>";
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
                        + "						<td colspan=\"5\" style=\"background-color: black; font-size: 1.5rem\">REPORTE DE PRODUCTOS</td>\n"
                        + "					</tr>\n"
                        + "					<tr>\n"
                        + "						<th>Codigo del Producto</th>\n"
                        + "						<th>Codigo del Proveedor</th>\n"
                        + "						<th>Nombre del Producto</th>\n"
                        + "						<th>Cantidad en Inventario</th>\n"
                        + "						<th>Precio Unitario (Q)</th>\n"
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
