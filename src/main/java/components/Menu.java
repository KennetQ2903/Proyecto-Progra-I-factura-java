/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import model.Model_Menu;

/**
 *
 * @author Namikaze
 */
public class Menu extends javax.swing.JPanel {

    public Menu() {
        String dir = System.getProperty("user.dir");
        initComponents();
        Menu.this.setOpaque(false);
        listMenu1.setOpaque(false);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(dir + "\\resources\\cart (1).png");
        lbltitle.setIcon(new ImageIcon(img));
        init();
    }
    

    private void init() {

        listMenu1.addItem(new Model_Menu("cv", "Empleados", Model_Menu.MenuType.MENU));

        listMenu1.addItem(new Model_Menu("suitcase", "Proveedores", Model_Menu.MenuType.MENU));

        listMenu1.addItem(new Model_Menu("user", "Clientes", Model_Menu.MenuType.MENU));

        listMenu1.addItem(new Model_Menu("shopping-bag", "Ventas", Model_Menu.MenuType.MENU));

        listMenu1.addItem(new Model_Menu("box", "Productos", Model_Menu.MenuType.MENU));

        listMenu1.addItem(new Model_Menu("invoice", "Facturas", Model_Menu.MenuType.MENU));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogo = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        listMenu1 = new panels.ListMenu<>();

        setOpaque(false);

        panelLogo.setOpaque(false);

        lbltitle.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Tienda MAS");

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        listMenu1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintChildren(Graphics grphcs) {

        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#DA4453"), 0, getHeight(), Color.decode("#89216B"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15); //(esquina, esquina, ancho, alto, esquina, esquina)
        g2.fillRect(getWidth(), 0, getWidth(), getHeight()); //Estirar el menu y no dejarlo con reborde
        super.paintChildren(grphcs);

    }
    private int x;
    private int y;

    public void initMoving(JFrame frm) { //Metodo para arrastrarlo tambien desde el logo
        panelLogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
//                super.mousePressed(me);
                x = me.getX();
                y = me.getY();
            }
        });
        panelLogo.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
//                super.mouseDragged(me);
                frm.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbltitle;
    private panels.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelLogo;
    // End of variables declaration//GEN-END:variables
}
