/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

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

public class Proveedores extends javax.swing.JPanel {

    static ArrayList<Proveedor> provArr = new ArrayList<>();

    public Proveedores() {
        initComponents();
        readData();
        //createMatteBorder(arriba, izquierda, abajo, derecha)
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAddEdit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        provTable = new javax.swing.JTable();
        codeProvField = new components.TextField();
        dirProvField = new components.TextField();
        NITProvField = new components.TextField();
        nameProvField = new components.TextField();
        searchInProvField = new components.TextField();
        jLabel2 = new javax.swing.JLabel();
        reportHTMLButton = new javax.swing.JButton();

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

        provTable.setModel(new javax.swing.table.DefaultTableModel(
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
        provTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(provTable);

        searchInProvField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchInProvFieldKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar/Editar Proveedores");

        reportHTMLButton.setBackground(new java.awt.Color(255, 153, 0));
        reportHTMLButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportHTMLButton.setForeground(new java.awt.Color(255, 255, 255));
        reportHTMLButton.setText("Generar Reporte HTML");
        reportHTMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportHTMLButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(buttonAddEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NITProvField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dirProvField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameProvField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codeProvField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addComponent(reportHTMLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(searchInProvField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchInProvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codeProvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameProvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dirProvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NITProvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
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
        if (buttonAddEdit.getText().equals("Editar")) {
            editData(codeProvField.getText());
            codeProvField.setEditable(true);
        } else {
            saveData();

        }
        updateBinary();
    }//GEN-LAST:event_buttonAddEditActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void provTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provTableMouseClicked
        int column = provTable.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / provTable.getRowHeight();
        if (row < provTable.getRowCount() && row >= 0 && column < provTable.getColumnCount() && column >= 0) {
            Object value = provTable.getValueAt(row, column);
            if (value instanceof JButton) {
                String code = provTable.getValueAt(provTable.getSelectedRow(), 0).toString();
                String name = provTable.getValueAt(provTable.getSelectedRow(), 1).toString();
                String dir = provTable.getValueAt(provTable.getSelectedRow(), 2).toString();
                String nit = provTable.getValueAt(provTable.getSelectedRow(), 3).toString();
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                if (boton.getName().equals("Edit")) {
//                    editar campos
                    codeProvField.setText(code);
                    nameProvField.setText(name);
                    dirProvField.setText(dir);
                    NITProvField.setText(nit);

                    buttonAddEdit.setText("Editar");
                    codeProvField.setEditable(false);

                } else {
//                      eliminar campo
                    deleteData(code);
                }
            }
        }
    }//GEN-LAST:event_provTableMouseClicked

    private void searchInProvFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInProvFieldKeyPressed
        searchInTable(searchInProvField.getText());
    }//GEN-LAST:event_searchInProvFieldKeyPressed

    private void reportHTMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportHTMLButtonActionPerformed
        generarReporte();
    }//GEN-LAST:event_reportHTMLButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.TextField NITProvField;
    private javax.swing.JButton buttonAddEdit;
    private components.TextField codeProvField;
    private components.TextField dirProvField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private components.TextField nameProvField;
    private javax.swing.JTable provTable;
    private javax.swing.JButton reportHTMLButton;
    private components.TextField searchInProvField;
    // End of variables declaration//GEN-END:variables

    private void saveData() {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            if (!validateProv(codeProvField.getText(), NITProvField.getText(), nameProvField.getText())) {
                Proveedor e = new Proveedor();
                e.setName(nameProvField.getText());
                e.setNIT(NITProvField.getText());
                e.setCode(codeProvField.getText());
                e.setDirection(dirProvField.getText());
                provArr.add(e);
                resetData();
                setData();
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Proveedor Guardado Correctamente!");
                noti.showNotification();
            } else {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "NIT, Codigo o Nombre de Proveedor Ya Existentes");
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
        codeProvField.setText("");
        nameProvField.setText("");
        dirProvField.setText("");
        NITProvField.setText("");
    }

    private void setData() {
        String dir = System.getProperty("user.dir");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(dir + "\\resources\\web-programming.png");
        reportHTMLButton.setIcon(new ImageIcon(img));
        codeProvField.setLabelText("Codigo del Proveedor");
        nameProvField.setLabelText("Nombre del Proveedor");
        dirProvField.setLabelText("Direccion del Proveedor");
        NITProvField.setLabelText("NIT del Proveedor");
        provTable.setDefaultRenderer(Object.class, new Render());
        searchInProvField.setLabelText("BUSCAR PROVEEDOR...");
        JButton edit = new JButton("Editar");
        JButton delete = new JButton("Eliminar");
        edit.setName("Edit");
        delete.setName("delete");

        Object[] col = {"Codigo", "Nombre", "Direccion", "NIT", " ", " "};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Iterator<Proveedor> it = provArr.iterator();
        while (it.hasNext()) {
            Proveedor e = it.next();
            Object[] dataRow = {e.getCode(), e.getName(), e.getDirection(), e.getNIT(), edit, delete};
            tableModel.addRow(dataRow);
        }
        provTable.setModel(tableModel);
        provTable.setRowHeight(25);
    }

    private void editData(String c) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            Iterator<Proveedor> it = provArr.iterator();
            while (it.hasNext()) {
                Proveedor e = it.next();
                if (e.getCode().equals(c)) {
                    e.setCode(codeProvField.getText());
                    e.setName(nameProvField.getText());
                    e.setDirection(dirProvField.getText());
                    e.setNIT(NITProvField.getText());
                }
            }
            setData();
            resetData();
            Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Proveedor Editado Correctamente!");
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
                "Estas seguro de Eliminar a este Proveedor?", "Eliminar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            try {
                Iterator<Proveedor> it = provArr.iterator();
                while (it.hasNext()) {
                    Proveedor e = it.next();
                    if (e.getCode().equals(c)) {
                        it.remove();
                    }
                }
                updateBinary();
                setData();
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Proveedor Eliminado Correctamente!");
                noti.showNotification();
            } catch (Exception err) {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
                noti.showNotification();
                System.out.println(err.getMessage());
            }
        }

    }

    public static ArrayList<Proveedor> getArray() {
        return provArr;
    }

    private void updateBinary() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("prov.dat");
            salida = new ObjectOutputStream(fos);

            //Se escribe el objeto en el fichero
            salida.writeObject(provArr);

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

            fis = new FileInputStream("prov.dat");
            entrada = new ObjectInputStream(fis);
            provArr = (ArrayList<Proveedor>) entrada.readObject(); //es necesario el casting

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
        DefaultTableModel model = (DefaultTableModel) provTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        provTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchString.trim()));
    }

    private boolean validateProv(String code, String nit, String name) {
        boolean flag = false;
        Iterator<Proveedor> it = provArr.iterator();
        while (it.hasNext()) {
            Proveedor p = it.next();
            if (p.getCode().equals(code) || p.getNIT().equals(nit) || p.getName().equals(name)) {
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
                    new FileWriter(new File(filesys.getHomeDirectory() + "/Reporte Proveedores.html")))) {
                Iterator<Proveedor> it = provArr.iterator();
                String tr = "";
                while(it.hasNext()){
                    Proveedor e = it.next();
                    tr = tr + "<tr>\n" +
"						<td>" + e.getCode()+ "</td>\n" +
    "						<td>" + e.getName() + "</td>\n" +
"						<td>" + e.getDirection()+ "</td>\n" +
"						<td>" + e.getNIT()+ "</td>\n" +

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
                        + "						<td colspan=\"5\" style=\"background-color: black; font-size: 1.5rem\">REPORTE DE PROVEEDORES</td>\n"
                        + "					</tr>\n"
                        + "					<tr>\n"
                        + "						<th>Codigo del Producto</th>\n"
                        + "						<th>Nombre del Proveedor</th>\n"
                        + "						<th>Direccion</th>\n"
                        + "						<th>NIT</th>\n"
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
