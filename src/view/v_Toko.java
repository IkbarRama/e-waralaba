/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.c_login;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import model.m_login;

/**
 *
 * @author Brian R
 */
public class v_Toko extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();

    toko1 t1;
    toko2 t2;

    public v_Toko(toko1 t1, toko2 t2) {
        initComponents();
        this.setLocationRelativeTo(null);
        btnLogout.setBackground(new Color(0, 0, 0, 0));

        this.t1 = t1;
        this.t2 = t2;

        panelToko.setLayout(layout);
        panelToko.add(t1);
        panelToko.add(t2);

        t1.setVisible(true);
        t2.setVisible(false);

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                m_login m = new m_login();
                Login v = new Login();
                c_login c = new c_login(m, v);
                dispose();
            }
        });
    }

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(245, 87, 108));
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(new Color(247, 176, 255));
    }
    public void setNama(String user){
        nama.setText(user);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        panelToko = new javax.swing.JPanel();
        tokoStok = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tokoBarang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        bgToko = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnHide.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 30, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnExit.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 30, -1));

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnLogout.png"))); // NOI18N
        btnLogout.setToolTipText("");
        btnLogout.setContentAreaFilled(false);
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        panelToko.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelTokoLayout = new javax.swing.GroupLayout(panelToko);
        panelToko.setLayout(panelTokoLayout);
        panelTokoLayout.setHorizontalGroup(
            panelTokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        panelTokoLayout.setVerticalGroup(
            panelTokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(panelToko, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 690, 490));

        tokoStok.setBackground(new java.awt.Color(245, 87, 108));
        tokoStok.setPreferredSize(new java.awt.Dimension(260, 47));
        tokoStok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tokoStokMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data PENJUALAN");

        javax.swing.GroupLayout tokoStokLayout = new javax.swing.GroupLayout(tokoStok);
        tokoStok.setLayout(tokoStokLayout);
        tokoStokLayout.setHorizontalGroup(
            tokoStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tokoStokLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );
        tokoStokLayout.setVerticalGroup(
            tokoStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tokoStokLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(tokoStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 260, 50));

        tokoBarang.setBackground(new java.awt.Color(247, 176, 255));
        tokoBarang.setPreferredSize(new java.awt.Dimension(260, 47));
        tokoBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tokoBarangMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data STOK");

        javax.swing.GroupLayout tokoBarangLayout = new javax.swing.GroupLayout(tokoBarang);
        tokoBarang.setLayout(tokoBarangLayout);
        tokoBarangLayout.setHorizontalGroup(
            tokoBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tokoBarangLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(89, 89, 89))
        );
        tokoBarangLayout.setVerticalGroup(
            tokoBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tokoBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(tokoBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 50));

        nama.setText("jLabel3");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        bgToko.setBackground(new java.awt.Color(255, 255, 255));
        bgToko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgToko.png"))); // NOI18N
        getContentPane().add(bgToko, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tokoStokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tokoStokMousePressed
        setColor(tokoStok);
        resetColor(tokoBarang);
        t1.setVisible(true);
        t2.setVisible(false);
    }//GEN-LAST:event_tokoStokMousePressed

    private void tokoBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tokoBarangMousePressed
        setColor(tokoBarang);
        resetColor(tokoStok);
        t1.setVisible(false);
        t2.setVisible(true);
    }//GEN-LAST:event_tokoBarangMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(v_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_Toko(t1,t2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgToko;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nama;
    private javax.swing.JPanel panelToko;
    private javax.swing.JPanel tokoBarang;
    private javax.swing.JPanel tokoStok;
    // End of variables declaration//GEN-END:variables
}
