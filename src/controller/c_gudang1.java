/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.m_gudang1;
import view.gudang1;

/**
 *
 * @author Brian R
 */
public class c_gudang1 {

    m_gudang1 model;
    gudang1 gudang;

    public c_gudang1(m_gudang1 m, gudang1 v) {
        this.model = m;
        this.gudang = v;
//        gudang = new gudang1();
        gudang.setVisible(true);
        gudang.getBtnSimpan().addActionListener(new ButtonSimpan());
        gudang.getBtnUbah().addActionListener(new ButtonUbah());
        gudang.getBtnHapus().addActionListener(new ButtonHapus());//bisa
        gudang.getBtnReset().addActionListener(new ButtonReset());//bisa

    }

    private class ButtonReset implements ActionListener {

        public ButtonReset() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                clear();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private class ButtonHapus implements ActionListener {

        public ButtonHapus() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            String kodeBarang = gudang.getKode_barang().getText();
            try {
                model.hapusData(kodeBarang);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private class ButtonUbah implements ActionListener {

        public ButtonUbah() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            String kodeBarang = gudang.getKode_barang().getText();
            String namaBarang = gudang.getNama_barang().getText();
            String jumlahStok = gudang.getJumlah_stok().getText();
            String hargaBarang = gudang.getHarga_barang().getText();

            try {
                model.updateData(kodeBarang, namaBarang, jumlahStok, hargaBarang);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private class ButtonSimpan implements ActionListener {

        public ButtonSimpan() {
//            System.out.println("qwertyuio");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("asdfghjkl;");
//            int kodeBarang = Integer.parseInt(gudang.getKode_barang().getText().toString());
            String namaBarang = gudang.getNama_barang().getText();
            int jumlahStok = Integer.parseInt(gudang.getJumlah_stok().getText()); 
            int hargaBarang = Integer.parseInt(gudang.getHarga_barang().getText());
            System.out.println(namaBarang + " " + jumlahStok + " " + hargaBarang);
            try {
                model.simpanData(namaBarang, jumlahStok, hargaBarang);
                clear();
            } catch (Exception le) {
//                System.out.println(e.getMessage());
            }

        }
    }

    private void clear() {
        String clear = "";
        gudang.setHarga_barang(clear);
        gudang.setNama_barang(clear);
        gudang.setJumlah_stok(clear);
    }

}