/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220160_kuis_if.f;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class HalamanPembelian extends JFrame implements ActionListener{
    
    JLabel judul = new JLabel("Pembelian Majalah");
    JLabel namakategori = new JLabel();
    JLabel hargakategori = new JLabel();
    JLabel jumlah = new JLabel();
    JLabel total = new JLabel("Total: Rp");
    
    JTextField inputjumlah = new JTextField();
    
    JButton tombolpembelian = new JButton("Pembelian");
    JButton tombolkembali = new JButton("Kembali");
    
    HalamanPembelian(String kategori, String harga){
    setVisible(true);
    setSize(520, 480);
    setTitle("Halaman Pembelian");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    
    add(judul);
    judul.setBounds(10,0,300,40);
    judul.setFont(judul.getFont().deriveFont(30f));
    
    add(namakategori);
    namakategori.setText("Kategoti: " +kategori);
    namakategori.setBounds(10,50,300,40);
    namakategori.setFont(namakategori.getFont().deriveFont(20f));
    
    add(hargakategori);
    hargakategori.setText("Harga  : " +harga);
    hargakategori.setBounds(10,80,300,40);
    hargakategori.setFont(hargakategori.getFont().deriveFont(20f));
    
    add(jumlah);
    hargakategori.setText("Jumlah : ");
    jumlah.setBounds(10,110,300,40);
    jumlah.setFont(jumlah.getFont().deriveFont(20f));
    
    add(inputjumlah);
    inputjumlah.setBounds(10,140,490,40);
    inputjumlah.setFont(inputjumlah.getFont().deriveFont(15f));
    
    add(tombolpembelian);
    tombolpembelian.setBounds(10,270,490,40);
    tombolpembelian.setFont(tombolpembelian.getFont().deriveFont(15f));
    
    add(tombolkembali);
    tombolkembali.setBounds(10,310,490,40);
    tombolkembali.setFont(tombolkembali.getFont().deriveFont(15f));
    
    add(total);
    total.setBounds(10,345,340,40);
    total.setFont(total.getFont().deriveFont(15f));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tombolkembali){
            new HalamanUtama("123220160");
            this.dispose();
        } else if(e.getSource() == tombolpembelian){
            int banyak = Integer.parseInt(inputjumlah.getText());
            String kategoriri = namakategori.getText().replace("Kategori Majalah: ", "");
            
            double hargaperpcs = 0;
            
            switch(kategoriri){
                case"Majalah Anak":
                    hargaperpcs = 10800;
                    break;
                case"Majalah Remaja":
                    hargaperpcs = 13100;
                    break;
                case"Majalah Dewasa":
                    hargaperpcs = 69400;
                    break;
            }
            
            double totalharga = banyak * hargaperpcs;
            total.setText("Total harga: Rp" +totalharga);
        }
    }
    
}
