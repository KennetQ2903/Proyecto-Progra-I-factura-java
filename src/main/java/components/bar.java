/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class bar extends javax.swing.JPanel {

    public bar() {
        String dir = System.getProperty("user.dir");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(dir + "\\resources\\close (3).png");
        initComponents();
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 76, 76)));
        jButton1.setIcon(new ImageIcon(img));
    }
    
    public void setTitleBar(String a){
        lblTITLE.setText(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTITLE = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTITLE.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTITLE, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTITLE, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.awt.event.WindowEvent windowEvent = null;
        windowClosing(windowEvent);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (JOptionPane.showConfirmDialog(mainFrame,
                "Estas seguro de salir del programa Tienda MAS de Kennet Quiroz?", "Salir del Programa",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    private int x;
    private int y;

    public void initMoving(JFrame frm) { //Metodo para arrastrarlo tambien desde el logo
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
//                super.mousePressed(me);
                x = me.getX();
                y = me.getY();
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
//                super.mouseDragged(me);
                frm.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblTITLE;
    // End of variables declaration//GEN-END:variables

}
