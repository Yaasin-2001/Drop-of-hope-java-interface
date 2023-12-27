package com.company.Forms;

import com.company.Classes.Program;
import com.company.Classes.SQl_DataBase_Class;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KullanıcıGirişForm extends JFrame{

    private JTextField Kullanıcı_adı;
    private JPanel panel1;
    private JTextField Şifre_giriş;
    private JButton GirişYap;
    MainForm mf;

    private ImageIcon resim = new ImageIcon("src/img/GirişYap.jpg");
    private ImageIcon logo  = new ImageIcon("img/Umut_Damlası_icon2.png");
    private JLabel ArkaPlan;



    public KullanıcıGirişForm() {

        ArkaPlan = new JLabel("", resim,JLabel.CENTER);
        ArkaPlan.setBounds(0,0,550,550);
        this.add(ArkaPlan);
        this.add(panel1);
        this.setTitle("Umut Dalması");
        this.setIconImage(logo.getImage());
        this.setSize(565,585);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);


        this.mf = mf;
        GirişYap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String adi = Kullanıcı_adı.getText().toString();
                String Sif = Şifre_giriş.getText().toString();
                if(SQl_DataBase_Class.Login(adi,Sif))
                {
                    mf.chanageButton();
                    JOptionPane.showMessageDialog(KullanıcıGirişForm.this,"Giriş Tamamlandı...");

                }
                else
                {
                    JOptionPane.showMessageDialog(KullanıcıGirişForm.this,"Kullanıcı Adı veya Şifre Hatalı !!!");
                }
            }
        });
    }
}
