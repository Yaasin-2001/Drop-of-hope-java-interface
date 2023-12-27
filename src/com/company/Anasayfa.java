package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Anasayfa extends JFrame{

    private JPanel U_Panel;
    private JButton U_Detay1;
    private JButton U_Detay2;
    private JButton U_Detay3;
    private JButton U_Abone;
    private  JLabel ArkaPlan;
    private JLabel U_D1_Label;



    private ImageIcon resim = new ImageIcon("img/Umut2.jpg");
    private ImageIcon logo  = new ImageIcon("img/Umut_Damlası_icon2.png");


    public Anasayfa(){


        ArkaPlan = new JLabel("",resim,JLabel.CENTER);
        ArkaPlan.setBounds(0,0,1080,720);
        this.add(ArkaPlan);

        this.setIconImage(logo.getImage());


        this.setTitle("Umut Dalması");


       this.add(U_Panel);


        this.setSize(1093,754);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);


        U_Detay1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(null,"neden bastın la", "yasin",JOptionPane.ERROR_MESSAGE);

            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
