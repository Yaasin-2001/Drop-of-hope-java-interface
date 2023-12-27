package com.company.Forms;

import com.company.Classes.Kullanıcı;
import com.company.Classes.Program;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class YeniÜyeForm extends JFrame{



    private JTextField Kullanıcı_adı;
    private JTextField Mail;
    private JTextField Şİfre;
    private JTextField Şİfre_tekrar;
    private JButton Oluştur;
    private JPanel GirişPanel;
    private JLabel z_ad;
    private JLabel z_email;
    private JLabel z_ş1;
    private JLabel z_ş2;
    private JTextField Kullaıncı_adı;
    private ImageIcon resim = new ImageIcon("src/img/YeniÜye.jpg");
    private ImageIcon logo  = new ImageIcon("img/Umut_Damlası_icon2.png");
    private JLabel ArkaPlan;

    public YeniÜyeForm(){

        ArkaPlan = new JLabel("", resim,JLabel.CENTER);
        ArkaPlan.setBounds(0,0,550,550);
        this.add(ArkaPlan);
        this.add(GirişPanel);
        this.setTitle("Umut Dalması");
        this.setIconImage(logo.getImage());
        this.setSize(565,585);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);


        Oluştur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String KA = Kullanıcı_adı.getText().toString();
                String email = Mail.getText().toString();
                String Ş1 = Şİfre.getText().toString();
                String Ş2 = Şİfre_tekrar.getText().toString();


                if(KA.isEmpty() || email.isEmpty() || Ş1.isEmpty() || Ş2.isEmpty()){
                    JOptionPane.showMessageDialog(YeniÜyeForm.this,"Eksik bilgiler var !!!");

                if(KA.isEmpty() )
                    z_ad.setVisible(true);
                if (email.isEmpty())
                    z_email.setVisible(true);
                if (Ş1.isEmpty())
                    z_ş1.setVisible(true);
                if (Ş2.isEmpty())
                    z_ş2.setVisible(true);

                }
                else if(Program.ChekGmail(email)){
                    if(Ş1.equals(Ş2)) {
                        Kullanıcı K = new Kullanıcı(KA,email,Ş1);
                        KullanıcıOLFrom KOLF = new KullanıcıOLFrom(K);
                        KOLF.setVisible(true);

                    }
                    else

                        JOptionPane.showMessageDialog(YeniÜyeForm.this,"Şifreler Ayni Değil !!!");
                }
                else
                    JOptionPane.showMessageDialog(YeniÜyeForm.this,"E-posta Hatalı !!! (....@gmail.com)");

            }
        });

    }


}
