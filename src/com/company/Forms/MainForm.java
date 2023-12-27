package com.company.Forms;

import com.company.Classes.Kullanıcı;
import com.company.Classes.Program;
import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame{

    private JPanel Anasayfa;
    private JButton KanUyumTablosu;
    private JButton KanaİhtiyacımVar;
    private JButton GirişYap;
    private JButton Fayda;
    private JButton Kimler;
    private JButton Türkiye;
    private JButton Hemen;
    private JPanel Ana;
    private ImageIcon resim = new ImageIcon("src/img/arka.jpg");
    private ImageIcon Mesaj1 = new ImageIcon("src/img/mesaj1.jpg");
    private ImageIcon Mesaj2 = new ImageIcon("src/img/mesaj2.jpg");
    private ImageIcon Mesaj3 = new ImageIcon("src/img/mesaj3.jpg");
    private ImageIcon logo  = new ImageIcon("img/Umut_Damlası_icon2.png");
    private JLabel ArkaPlan;


    public MainForm(){



        ArkaPlan = new JLabel("", resim,JLabel.CENTER);
        ArkaPlan.setBounds(0,0,1080,720);
        this.add(ArkaPlan);

        this.setIconImage(logo.getImage());
        this.setTitle("Umut Dalması");

        this.add(Anasayfa);
        this.setSize(1093,754);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);


        Fayda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame mesaj = new JFrame();
                ArkaPlan = new JLabel("", Mesaj1,JLabel.CENTER);
                ArkaPlan.setBounds(0,0,1080,720);
                mesaj.add(ArkaPlan);
                mesaj.setIconImage(logo.getImage());
                mesaj.setTitle("Umut Dalması");
                mesaj.setSize(1093,555);
                mesaj.setVisible(true);
                mesaj.setResizable(false);
                mesaj.setLocationRelativeTo(null);
            }
        });
        KanUyumTablosu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KanGrublarTablosuFrom KGTF = new KanGrublarTablosuFrom();
                KGTF.setVisible(true);

            }
        });
        GirişYap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(Program.ya_Giriş) {
                    KullanıcıGirişForm KGF = new KullanıcıGirişForm();

                    KGF.setVisible(true);
                }
                else{
                    BilgilerGüncelleFrom BGF = new BilgilerGüncelleFrom();
                    BGF.setVisible(true);
                }
                new KullanıcıGirişForm();

            }
        });
        Türkiye.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame mesaj = new JFrame();
                ArkaPlan = new JLabel("", Mesaj3,JLabel.CENTER);
                ArkaPlan.setBounds(0,0,1080,720);
                mesaj.add(ArkaPlan);
                mesaj.setIconImage(logo.getImage());
                mesaj.setTitle("Umut Dalması");
                mesaj.setSize(1093,555);
                mesaj.setVisible(true);
                mesaj.setResizable(false);
                mesaj.setLocationRelativeTo(null);
            }
        });
        Hemen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                YeniÜyeForm YUF = new YeniÜyeForm();
                YUF.setVisible(true);
            }
        });
        Kimler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame mesaj = new JFrame();
                ArkaPlan = new JLabel("", Mesaj2,JLabel.CENTER);
                ArkaPlan.setBounds(0,0,1080,720);
                mesaj.add(ArkaPlan);
                mesaj.setIconImage(logo.getImage());
                mesaj.setTitle("Umut Dalması");
                mesaj.setSize(1093,555);
                mesaj.setVisible(true);
                mesaj.setResizable(false);
                mesaj.setLocationRelativeTo(null);
            }
        });

        KanaİhtiyacımVar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               KanaİhtiyacımVarFrom KIVF = new KanaİhtiyacımVarFrom();
                KIVF.setVisible(true);
            }
        });
    }

    public void chanageButton(){
        if(Program.ya_Giriş){
            ImageIcon resim = new ImageIcon("src/img/BG.png");
            GirişYap.setIcon(resim);
        }
        else{
            ImageIcon resim = new ImageIcon("src/img/GY.png");
            GirişYap.setIcon(resim);
        }


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


