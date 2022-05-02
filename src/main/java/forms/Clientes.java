/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import classes.Cliente;
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

public class Clientes extends javax.swing.JPanel {

    public static ArrayList<Cliente> getClientArr() {
        return clientArr;
    }

    private static ArrayList<Cliente> clientArr = new ArrayList<>();

    public Clientes() {
        initComponents();
        readData();
        //createMatteBorder(arriba, izquierda, abajo, derecha)
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameClientField = new components.TextField();
        directionClientField = new components.TextField();
        nitClientField = new components.TextField();
        edadClientField = new components.Spinner();
        buttonAddEdit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        searchInClients = new components.TextField();
        reportHTMLButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setOpaque(false);

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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar/Editar Cliente");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(nitClientField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(directionClientField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edadClientField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAddEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameClientField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameClientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(directionClientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nitClientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edadClientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAddEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        clientTable.setModel(new javax.swing.table.DefaultTableModel(
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
        clientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientTable);

        searchInClients.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchInClientsKeyPressed(evt);
            }
        });

        reportHTMLButton.setBackground(new java.awt.Color(255, 153, 51));
        reportHTMLButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportHTMLButton.setForeground(new java.awt.Color(255, 255, 255));
        reportHTMLButton.setText("Generar Reporte");
        reportHTMLButton.setBorder(null);
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(searchInClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportHTMLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchInClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportHTMLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddEditActionPerformed
        if (buttonAddEdit.getText().equals("Editar")) {
            editData(nitClientField.getText());
            nitClientField.setEditable(true);
        } else {
            saveData();
        }
        updateBinary();
    }//GEN-LAST:event_buttonAddEditActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientTableMouseClicked
        int column = clientTable.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / clientTable.getRowHeight();
        if (row < clientTable.getRowCount() && row >= 0 && column < clientTable.getColumnCount() && column >= 0) {
            Object value = clientTable.getValueAt(row, column);
            if (value instanceof JButton) {
                String name = clientTable.getValueAt(clientTable.getSelectedRow(), 0).toString();
                String dir = clientTable.getValueAt(clientTable.getSelectedRow(), 1).toString();
                String nit = clientTable.getValueAt(clientTable.getSelectedRow(), 2).toString();
                String edad = clientTable.getValueAt(clientTable.getSelectedRow(), 3).toString();
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                if (boton.getName().equals("Edit")) {
//                    editar campos
                    nameClientField.setText(name);
                    directionClientField.setText(dir);
                    nitClientField.setText(nit);
                    edadClientField.setText(edad);
                    buttonAddEdit.setText("Editar");
                    nitClientField.setEditable(false);

                } else {
//                      eliminar campo
                    deleteData(nit);
                }
            }
        }
    }//GEN-LAST:event_clientTableMouseClicked

    private void searchInClientsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInClientsKeyPressed
        searchInTable(searchInClients.getText());
    }//GEN-LAST:event_searchInClientsKeyPressed

    private void reportHTMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportHTMLButtonActionPerformed
        generarReporte();
    }//GEN-LAST:event_reportHTMLButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddEdit;
    private javax.swing.JTable clientTable;
    private components.TextField directionClientField;
    private components.Spinner edadClientField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private components.TextField nameClientField;
    private components.TextField nitClientField;
    private javax.swing.JButton reportHTMLButton;
    private components.TextField searchInClients;
    // End of variables declaration//GEN-END:variables

    private void saveData() {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

        try {
            if (!validateClient(nitClientField.getText())) {
                Cliente e = new Cliente();
                e.setName(nameClientField.getText());
                e.setAge(edadClientField.getText());
                e.setNIT(nitClientField.getText());
                e.setDirection(directionClientField.getText());
                getClientArr().add(e);
                resetData();
                setData();
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Cliente Guardado Correctamente!");
                noti.showNotification();
            } else {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "NIT de Cliente Ya Existente");
                noti.showNotification();
            }
        } catch (Exception err) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
            noti.showNotification();
            System.out.println(err.getMessage());
        }
    }

    private void setData() {

        Object[] col = {"Nombre", "direccion", "NIT", "Edad", " ", " "};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        String dir = System.getProperty("user.dir");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(dir + "\\resources\\web-programming.png");
        reportHTMLButton.setIcon(new ImageIcon(img));

        nameClientField.setLabelText("Nombre");
        directionClientField.setLabelText("Direccion");
        nitClientField.setLabelText("NIT");
        edadClientField.setLabelText("Edad");
        clientTable.setDefaultRenderer(Object.class, new Render());
        searchInClients.setLabelText("BUSCAR CLIENTE...");
        JButton edit = new JButton("Editar");
        JButton delete = new JButton("Eliminar");
        edit.setName("Edit");
        delete.setName("delete");

        Iterator<Cliente> it = getClientArr().iterator();
        while (it.hasNext()) {
            Cliente e = it.next();
            Object[] dataRow = {e.getName(), e.getDirection(), e.getNIT(), e.getAge(), edit, delete};
            tableModel.addRow(dataRow);
        }
        clientTable.setModel(tableModel);
        clientTable.setRowHeight(25);
    }

    private void resetData() {
        buttonAddEdit.setText("Agregar");
        nameClientField.setText("");
        directionClientField.setText("");
        nitClientField.setText("");
        edadClientField.setText("0");
        nitClientField.setEditable(true);

    }

    private void deleteData(String nit) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

        if (JOptionPane.showConfirmDialog(this,
                "Estas seguro de Eliminar a este Cliente?", "Eliminar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            try {
                Iterator<Cliente> it = getClientArr().iterator();
                while (it.hasNext()) {
                    Cliente e = it.next();
                    if (e.getNIT().equals(nit)) {
                        it.remove();
                    }
                }
                updateBinary();
                setData();
                Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Cliente Eliminado Correctamente!");
                noti.showNotification();
            } catch (Exception err) {
                Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
                noti.showNotification();
                System.out.println(err.getMessage());
            }
        }
    }

    private void editData(String nit) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        try {
            Iterator<Cliente> it = getClientArr().iterator();
            while (it.hasNext()) {
                Cliente e = it.next();
                if (e.getNIT().equals(nit)) {
                    e.setName(nameClientField.getText());
                    e.setDirection(directionClientField.getText());
                    e.setNIT(nitClientField.getText());
                    e.setAge(edadClientField.getText());
                }
            }
            setData();
            resetData();
            Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Cliente Editado Correctamente!");
            noti.showNotification();
        } catch (Exception err) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
            noti.showNotification();
            System.out.println(err.getMessage());
        }
    }

    private void updateBinary() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("client.dat");
            salida = new ObjectOutputStream(fos);

            //Se escribe el objeto en el fichero
            salida.writeObject(getClientArr());

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

            fis = new FileInputStream("client.dat");
            entrada = new ObjectInputStream(fis);
            clientArr = (ArrayList<Cliente>) entrada.readObject(); //es necesario el casting

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
        DefaultTableModel model = (DefaultTableModel) clientTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        clientTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchString.trim()));
    }

    private boolean validateClient(String nit) {
        boolean flag = false;
        Iterator<Cliente> it = clientArr.iterator();
        while (it.hasNext()) {
            Cliente e = it.next();
            if (e.getNIT().equals(nit)) {
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
                    new FileWriter(new File(filesys.getHomeDirectory() + "/Reporte Clientes.html")))) {
                Iterator<Cliente> it = clientArr.iterator();
                String tr = "";
                while(it.hasNext()){
                    Cliente e = it.next();
                    tr = tr + "<tr>\n" +
"						<td>" + e.getName() + "</td>\n" +
    "						<td>" + e.getAge() + "</td>\n" +
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
                        + "						<td colspan=\"5\" style=\"background-color: black; font-size: 1.5rem\">REPORTE DE CLIENTES</td>\n"
                        + "					</tr>\n"
                        + "					<tr>\n"
                        + "						<th>Nombre</th>\n"
                        + "						<th>Edad</th>\n"
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
