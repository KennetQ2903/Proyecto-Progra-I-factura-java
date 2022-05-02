/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import classes.Empleado;
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
import java.io.PrintWriter;
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

public class Empleados extends javax.swing.JPanel {

    /**
     * @return the emArray
     */
    public static ArrayList<Empleado> getEmArray() {
        return emArray;
    }

    private static ArrayList<Empleado> emArray = new ArrayList();

    public Empleados() {
        initComponents();
        readData();
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAddEdit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employedTable = new javax.swing.JTable();
        salaryEmployedField = new components.TextField();
        codigoEmployedField = new components.TextField();
        nameEmployedField = new components.TextField();
        puestoEmployedField = new components.Combobox();
        reportHTMLButton = new javax.swing.JButton();
        caja = new components.Spinner();
        searchInEmployes = new components.TextField();
        jLabel1 = new javax.swing.JLabel();

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

        employedTable.setModel(new javax.swing.table.DefaultTableModel(
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
        employedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employedTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employedTable);

        puestoEmployedField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---", "Cajero", "Bodeguero", "Seguridad" }));
        puestoEmployedField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                puestoEmployedFieldItemStateChanged(evt);
            }
        });

        reportHTMLButton.setBackground(new java.awt.Color(255, 153, 51));
        reportHTMLButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportHTMLButton.setForeground(new java.awt.Color(255, 255, 255));
        reportHTMLButton.setText("Generar Reporte HTML");
        reportHTMLButton.setBorder(null);
        reportHTMLButton.setBorderPainted(false);
        reportHTMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportHTMLButtonActionPerformed(evt);
            }
        });

        searchInEmployes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchInEmployesKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar/Editar Empleados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buttonAddEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salaryEmployedField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puestoEmployedField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(nameEmployedField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codigoEmployedField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(reportHTMLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchInEmployes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchInEmployes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(codigoEmployedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameEmployedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(puestoEmployedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salaryEmployedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAddEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportHTMLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddEditActionPerformed
        if (buttonAddEdit.getText().equals("Editar")) {
            editData(codigoEmployedField.getText());
            codigoEmployedField.setEditable(true);
        } else {
            saveData();
        }
        updateBinary();
    }//GEN-LAST:event_buttonAddEditActionPerformed

    private void reportHTMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportHTMLButtonActionPerformed
        generarReporte();
    }//GEN-LAST:event_reportHTMLButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void employedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employedTableMouseClicked
        int column = employedTable.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / employedTable.getRowHeight();
        if (row < employedTable.getRowCount() && row >= 0 && column < employedTable.getColumnCount() && column >= 0) {
            Object value = employedTable.getValueAt(row, column);
            if (value instanceof JButton) {
                String code = employedTable.getValueAt(employedTable.getSelectedRow(), 0).toString();
                String name = employedTable.getValueAt(employedTable.getSelectedRow(), 1).toString();
                String charge = employedTable.getValueAt(employedTable.getSelectedRow(), 2).toString();
                String salary = employedTable.getValueAt(employedTable.getSelectedRow(), 3).toString();
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                if (boton.getName().equals("Edit")) {
//                    editar campos
                    puestoEmployedField.setSelectedItem(charge);
                    nameEmployedField.setText(name);
                    codigoEmployedField.setText(code);
                    salaryEmployedField.setText(salary);
                    buttonAddEdit.setText("Editar");
                    codigoEmployedField.setEditable(false);

                } else {
//                      eliminar campo
                    deleteData(code);
                }
            }
        }
    }//GEN-LAST:event_employedTableMouseClicked

    private void puestoEmployedFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_puestoEmployedFieldItemStateChanged
        if (puestoEmployedField.getSelectedItem().toString().equals("Cajero")) {
            caja.setEnabled(true);
        } else {
            caja.setEnabled(false);
        }
    }//GEN-LAST:event_puestoEmployedFieldItemStateChanged

    private void searchInEmployesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInEmployesKeyPressed
        searchInTable(searchInEmployes.getText());
    }//GEN-LAST:event_searchInEmployesKeyPressed

    private void resetData() {
        buttonAddEdit.setText("Agregar");
        puestoEmployedField.setSelectedIndex(0);
        nameEmployedField.setText("");
        codigoEmployedField.setText("");
        salaryEmployedField.setText("");
        caja.setText("0");
    }

    private void saveData() {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            if (!validateEmployed(codigoEmployedField.getText(), caja.getText())) {
                Empleado e = new Empleado();
                e.setCode(codigoEmployedField.getText());
                e.setName(nameEmployedField.getText());
                e.setPuesto(puestoEmployedField.getSelectedItem().toString());
                e.setSalary(salaryEmployedField.getText());
                e.setNoCaja(caja.getText());
                getEmArray().add(e);
                resetData();
                setData();
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Empleado Guardado Correctamente!");
                noti.showNotification();
            }
        } catch (Exception err) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
            noti.showNotification();
            System.out.println(err.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddEdit;
    private components.Spinner caja;
    private components.TextField codigoEmployedField;
    private javax.swing.JTable employedTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private components.TextField nameEmployedField;
    private components.Combobox puestoEmployedField;
    private javax.swing.JButton reportHTMLButton;
    private components.TextField salaryEmployedField;
    private components.TextField searchInEmployes;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        String dir = System.getProperty("user.dir");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(dir + "\\resources\\web-programming.png");
        reportHTMLButton.setIcon(new ImageIcon(img));
        puestoEmployedField.setLabeText("Puesto");
        nameEmployedField.setLabelText("Nombre");
        codigoEmployedField.setLabelText("Codigo de Empleado");
        salaryEmployedField.setLabelText("Salario Q.");
        puestoEmployedField.setSelectedIndex(0);
        employedTable.setDefaultRenderer(Object.class, new Render());
        searchInEmployes.setLabelText("BUSCAR EMPLEADOS...");
        caja.setEnabled(false);
        caja.setLabelText("Numero de Caja");
        JButton edit = new JButton("Editar");
        JButton delete = new JButton("Eliminar");
        edit.setName("Edit");
        delete.setName("delete");

        Object[] col = {"Codigo", "Nombre", "Puesto", "Salario (Q)", "Numero Caja", " ", " "};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Iterator<Empleado> it = getEmArray().iterator();
        while (it.hasNext()) {
            Empleado e = it.next();
            Object[] dataRow = {e.getCode(), e.getName(), e.getPuesto(), e.getSalary(), e.getNoCaja(), edit, delete};
            tableModel.addRow(dataRow);
        }
        employedTable.setModel(tableModel);
        employedTable.setRowHeight(25);
    }

    private void editData(String c) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            Iterator<Empleado> it = getEmArray().iterator();
            while (it.hasNext()) {
                Empleado e = it.next();
                if (e.getCode().equals(c)) {
                    e.setCode(codigoEmployedField.getText());
                    e.setName(nameEmployedField.getText());
                    e.setPuesto(puestoEmployedField.getSelectedItem().toString());
                    e.setSalary(salaryEmployedField.getText());
                    e.setNoCaja(caja.getText());
                }
            }
            setData();
            resetData();
            Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Empleado Editado Correctamente!");
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
                "Estas seguro de Eliminar a este Empleado?", "Eliminar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            try {
                Iterator<Empleado> it = getEmArray().iterator();
                while (it.hasNext()) {
                    Empleado e = it.next();
                    if (e.getCode().equals(c)) {
                        it.remove();
                    }
                }
                updateBinary();
                setData();
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Empleado Eliminado Correctamente!");
                noti.showNotification();
            } catch (Exception err) {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
                noti.showNotification();
                System.out.println(err.getMessage());
            }
        }

    }

    private void updateBinary() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("employed.dat");
            salida = new ObjectOutputStream(fos);

            //Se escribe el objeto en el fichero
            salida.writeObject(getEmArray());

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

            fis = new FileInputStream("employed.dat");
            entrada = new ObjectInputStream(fis);
            emArray = (ArrayList<Empleado>) entrada.readObject(); //es necesario el casting

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
        DefaultTableModel model = (DefaultTableModel) employedTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        employedTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchString.trim()));
    }

    private boolean validateEmployed(String code, String caja) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        boolean flag = false;
        Iterator<Empleado> it = emArray.iterator();
        while (it.hasNext()) {
            Empleado e = it.next();
            if (e.getCode().equals(code)) {
                flag = true;
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Codigo de Empleado Ya Existente");
                noti.showNotification();
            }
            if (puestoEmployedField.getSelectedItem().toString().equals("---")) {
                flag = true;
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Porfavor seleccione un puesto");
                noti.showNotification();
            }
        }
        return flag;
    }

    private void generarReporte() {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            FileSystemView filesys = FileSystemView.getFileSystemView();
            try (BufferedWriter ficheroSalida = new BufferedWriter(
                    new FileWriter(new File(filesys.getHomeDirectory() + "/Reporte Empleados.html")))) {
                Iterator<Empleado> it = emArray.iterator();
                String tr = "";
                while(it.hasNext()){
                    Empleado e = it.next();
                    tr = tr + "<tr>\n" +
"						<td>" + e.getCode() + "</td>\n" +
    "						<td>" + e.getName() + "</td>\n" +
"						<td>" + e.getPuesto() + "</td>\n" +
"						<td>" + e.getNoCaja() + "</td>\n" +
"						<td>" + e.getSalary() + "</td>\n" +

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
                        + "						<td colspan=\"5\" style=\"background-color: black; font-size: 1.5rem\">REPORTE DE EMPLEADOS</td>\n"
                        + "					</tr>\n"
                        + "					<tr>\n"
                        + "						<th>Codigo</th>\n"
                        + "						<th>Nombre</th>\n"
                        + "						<th>Puesto</th>\n"
                        + "						<th>Numero de Caja</th>\n"
                        + "						<th>Salario (Q)</th>\n"
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
