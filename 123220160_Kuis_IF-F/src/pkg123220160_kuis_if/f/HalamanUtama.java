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

/**
 *
 * @author acer
 */
public class HalamanUtama extends JFrame implements ActionListener{
    
    JLabel teks = new JLabel();
    JLabel teks2 = new JLabel("Silahkan pilih menu dibawah ini untuk membeli majalah");
    
    JButton tombol = new JButton("Majalah Anak");
    JButton tombol1 = new JButton("Majalah Remaja");
    JButton tombol2 = new JButton("Majalah Dewasa");
    
    HalamanUtama(String username){
    setVisible(true);
    setSize(520, 480);
    setTitle("Halaman Utama");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    
    add(teks);
    teks.setText("Welcome, " + username);
    teks.setBounds(10,0,400,40);
    teks.setFont(teks.getFont().deriveFont(30f));
    
    add(teks2);
    teks2.setBounds(10,35,450,40);
    teks2.setFont(teks2.getFont().deriveFont(15f));
    
    add(tombol);
    tombol.setBounds(10,120,490,40);
    tombol.setFont(tombol.getFont().deriveFont(15f));
    tombol.addActionListener(this);
    
    add(tombol1);
    tombol1.setBounds(10,240,490,40);
    tombol1.setFont(tombol1.getFont().deriveFont(15f));
    tombol1.addActionListener(this);
    
    add(tombol2);
    tombol2.setBounds(10,360,490,40);
    tombol2.setFont(tombol2.getFont().deriveFont(15f));
    tombol2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tombol){
            new HalamanPembelian("Majalah Anak", "Rp10.800");
            this.dispose();
        } else if(e.getSource() == tombol1){
            new HalamanPembelian("Majalah Remaja", "Rp13.100");
            this.dispose();
        } else if(e.getSource() == tombol2){
            new HalamanPembelian("Majalah Dewasa", "Rp69.400");
            this.dispose();
        }
    }
}
