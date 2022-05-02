package components;

import classes.Cliente;
import forms.Clientes;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class addClient extends javax.swing.JPanel {

    public addClient() {
        initComponents();
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameAddClientField = new components.TextField();
        directionAddClientFielld = new components.TextField();
        NITAddClientField = new components.TextField();
        ageAddClientField = new components.Spinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        addClientButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(51, 102, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Agregar Cliente");

        addClientButton.setBackground(new java.awt.Color(51, 102, 255));
        addClientButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addClientButton.setForeground(new java.awt.Color(255, 255, 255));
        addClientButton.setText("Agregar");
        addClientButton.setBorder(null);
        addClientButton.setBorderPainted(false);
        addClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ageAddClientField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameAddClientField, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(directionAddClientFielld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addClientButton, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(NITAddClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameAddClientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directionAddClientFielld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NITAddClientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ageAddClientField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addClientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientButtonActionPerformed
        saveData();
        updateBinary();
    }//GEN-LAST:event_addClientButtonActionPerformed

    private void saveData() {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

        try {
            Cliente e = new Cliente();
            e.setName(nameAddClientField.getText());
            e.setAge(ageAddClientField.getText());
            e.setNIT(NITAddClientField.getText());
            e.setDirection(directionAddClientFielld.getText());
            Clientes.getClientArr().add(e);
            Notification noti = new Notification(mainFrame, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Cliente Guardado Correctamente!");
            noti.showNotification();
        } catch (Exception err) {
            Notification noti = new Notification(mainFrame, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Algo salio Mal!");
            noti.showNotification();
            System.out.println(err.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.TextField NITAddClientField;
    private javax.swing.JButton addClientButton;
    private components.Spinner ageAddClientField;
    private components.TextField directionAddClientFielld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private components.TextField nameAddClientField;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        nameAddClientField.setLabelText("Nombre");
        directionAddClientFielld.setLabelText("Direccion");
        NITAddClientField.setLabelText("NIT");
        ageAddClientField.setLabelText("Edad");
        
    }
    
    
    
    private void updateBinary() {
         FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        
        try {
            //Se crea el fichero
            fos = new FileOutputStream("client.dat");                                                 
            salida = new ObjectOutputStream(fos);
   
            //Se escribe el objeto en el fichero
            salida.writeObject(Clientes.getClientArr());
            
        } catch (FileNotFoundException e) {
                 System.out.println("1"+e.getMessage());                                                          
        } catch (IOException e) {
                 System.out.println("2"+e.getMessage());
        } finally {
            try {
                if(fos!=null){
                   fos.close();
                }
                if(salida!=null){
                   salida.close();
                }
            } catch (IOException e) {
                     System.out.println("3"+e.getMessage());
            }
        }
    }
}
