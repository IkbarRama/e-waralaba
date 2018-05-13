/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.m_admin1;
import model.m_gudang1;
import model.m_gudang2;
import model.m_login;
import view.Login;
import view.admin1;
import view.admin2;
import view.admin3;
import view.gudang1;
import view.gudang2;
import view.toko1;
import view.toko2;
import view.v_Admin;
import view.v_Gudang;
import view.v_Toko;

/**
 *
 * @author Brian R
 */
public class c_login {

    m_login model;
    Login login;

    public c_login(m_login m, Login v) {
        this.model = m;
        this.login = v;

        login.setVisible(true);
        login.getBtnLogin().addActionListener(new ButtonLogin());
        login.getUsername().addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent key) {
                if (key.getKeyChar() == KeyEvent.VK_ENTER) {
                    login.getBtnLogin().doClick();
                }
            }
        });
        login.getPassword().addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent key) {
                if (key.getKeyChar() == KeyEvent.VK_ENTER) {
                    login.getBtnLogin().doClick();
                }
            }
        });
        login.getShowPassword().addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent key) {
                if (key.getKeyChar() == KeyEvent.VK_ENTER) {
                    login.getBtnLogin().doClick();
                }
            }
        });

    }

    private class ButtonLogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String user = login.getUsername().getText();
            String pass = login.getPassword().getText();

            try {
                int status[] = model.getAkun(user, pass);
                if (status[1] == 3) {
                    login.dispose();
                    toko1 t1 = new toko1();
                    toko2 t2 = new toko2();
                    v_Toko toko = new v_Toko(t1, t2);
                    toko.setVisible(true);
                    t1.setVisible(true);
                    t2.setVisible(false);
                    login = null;
                    toko.setNama(model.getUsername(status[0]));
                } else if (status[1] == 2) {
                    login.dispose();
                    gudang1 v1 = new gudang1();
                    gudang2 v2 = new gudang2();
                    v_Gudang gudang = new v_Gudang(v1, v2);
                    m_gudang1 mg1 = new m_gudang1();
                    c_gudang1 cg1 = new c_gudang1(mg1, v1);
                    m_gudang2 mg2 = new m_gudang2();
                    c_gudang2 cg2 = new c_gudang2(mg2, v2);
                    v1.setVisible(true);
                    v2.setVisible(false);
                    gudang.setVisible(true);
                    login = null;
                } else if (status[1] == 1) {
                    login.dispose();
                    admin1 a1 = new admin1();
                    admin2 a2 = new admin2();
                    admin3 a3 = new admin3();
                    v_Admin admin = new v_Admin(a1, a2, a3);
                    m_admin1 ma1 = new m_admin1();
                    c_admin1 ca1 = new c_admin1(ma1, a1);
                    a1.setVisible(true);
                    a2.setVisible(false);
                    a3.setVisible(false);
                    admin.setVisible(true);
                    login = null;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Login Gagal !");
            }
        }

    }

}
