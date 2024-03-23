/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123220160_kuis_if.f;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class HalamanLogin extends JFrame implements ActionListener{
    
    JLabel tulisan = new JLabel("Selamat Datang");
    JLabel tulisan2 = new JLabel("Silahkan masukkan data");
    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    
    JTextField inputuser = new JTextField();
    JTextField inputpass = new JTextField();
    
    JButton submit = new JButton("Login");
    
    HalamanLogin(){
    setVisible(true);
    setSize(520, 480);
    setTitle("Halaman Login");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    
    add(tulisan);
    tulisan.setBounds(10,0,300,40);
    tulisan.setFont(tulisan.getFont().deriveFont(30f));
    
    add(tulisan2);
    tulisan2.setBounds(10,35,300,40);
    tulisan2.setFont(tulisan2.getFont().deriveFont(20f));
    
    add(user);
    user.setBounds(10,110,300,40);
    user.setFont(user.getFont().deriveFont(15f));
    
    add(inputuser);
    inputuser.setBounds(10,149,490,40);
    
    add(pass);
    pass.setBounds(10,200,300,40);
    pass.setFont(pass.getFont().deriveFont(15f));
    
    add(inputpass);
    inputpass.setBounds(10,235,490,40);
    
    add(submit);
    submit.setBounds(10,360,490,40);
    submit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = inputuser.getText();
            String password = inputpass.getText();
            
            if(!username.equals("123220160") || !password.equals("12345")){
                throw new Exception("Username dan Password SALAH!!!");
            }
            
            new HalamanUtama(username);
            this.dispose();
            
        } catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    } 
}
