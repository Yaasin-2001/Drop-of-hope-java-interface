package com.company.Forms;

import javax.swing.*;

public class KanGrublarTablosuFrom extends JFrame{

    private JPanel panel1;
    private ImageIcon resim = new ImageIcon("src/img/tablo.jpg");
    private ImageIcon logo  = new ImageIcon("img/Umut_Damlası_icon2.png");
    private JLabel ArkaPlan;

    public KanGrublarTablosuFrom(){
        ArkaPlan = new JLabel("", resim,JLabel.CENTER);
        ArkaPlan.setBounds(0,0,1080,720);
        this.add(ArkaPlan);

        this.setTitle("Umut Dalması");
        this.setIconImage(logo.getImage());
        this.setSize(1093,754);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
