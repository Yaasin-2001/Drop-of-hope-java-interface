package com.company.Forms;

import com.company.Classes.Kullanıcı;
import com.company.Classes.Program;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KullanıcıOLFrom extends JFrame{
    private JTextField TC;
    private JTextField Ad;
    private JTextField Soyad;
    private JComboBox Cisiyet;
    private JTextField DogumTarih;
    private JTextField Tel;
    private JTextField Gmail;
    private JComboBox il;
    private JComboBox ilçe;
    private JComboBox KanGrubu;
    private JTextField Ağırlık;
    private JCheckBox Soru0 = new JCheckBox("Kanama yada Kan hastalığı geçirdiniz mi ?");
    private JCheckBox Soru1 = new JCheckBox("Sigara Kullanıyormusunz ?");
    private JCheckBox Soru2 = new JCheckBox("Alkol, Uyuşturucu ve benzeri kullanıyormusunuz ?");
    private JCheckBox Soru3 = new JCheckBox("Alerjik reaksiyonu geçirdiniz mi ?");
    private JCheckBox Soru4 = new JCheckBox("hiç Toksoplazma geçirdiniz");
    private JCheckBox Soru5 = new JCheckBox("Şeker Hastalığınız var mı ?");
    private JCheckBox Soru6 = new JCheckBox("Son 12 ay içerisinde ameliyat yaptınız mı ?");
    private JCheckBox Soru7 = new JCheckBox("Son 12 ayda dövme yaptırdınız mı ?");
    private JCheckBox Soru8 = new JCheckBox("Bugüne kadar hiç kanser oldunuz mu ?");
    private JCheckBox Soru9 = new JCheckBox("Bugüne kadar hiç növbet geçirdiniz mi ?");
    private JButton Oluştur;
    private JPanel Ol_panel;
    private ImageIcon resim1 = new ImageIcon("src/img/Kişisel.jpg");
    private ImageIcon logo  = new ImageIcon("img/Umut_Damlası_icon2.png");
    private JLabel ArkaPlan;







   public KullanıcıOLFrom(Kullanıcı K) {

       ArkaPlan = new JLabel("", resim1,JLabel.CENTER);
       ArkaPlan.setBounds(0,0,1080,720);
       this.add(ArkaPlan);

       this.setIconImage(logo.getImage());
       this.setTitle("Umut Dalması");

       //this.add(Ol_panel);
       this.setSize(1093,754);
       this.setVisible(true);
       this.setResizable(false);
       this.setLocationRelativeTo(null);
       il.setModel(new DefaultComboBoxModel<String>(Program.il.toArray(new String[0])));

        Oluştur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tc = TC.getText().toString();
                String AD = Ad.getText().toString();
                String SOYAD = Soyad.getText().toString();
                String DT = DogumTarih.getText().toString();
                String Cins = Cisiyet.getActionCommand().toString();
                String tel = Tel.getText().toString();
                String email = Gmail.getText().toString();
                String İL = il.getSelectedItem().toString();
                String İLÇE = ilçe.getSelectedItem().toString();
                String Kan = KanGrubu.getSelectedItem().toString();
                String ağırlık = Ağırlık.getText().toString();



            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
