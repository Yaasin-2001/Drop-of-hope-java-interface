package com.company.Classes;

import com.company.Forms.KullanıcıOLFrom;
import com.company.Forms.MainForm;
import com.company.Forms.YeniÜyeForm;
import com.company.Main;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

    public static List<Kullanıcı> listKullanıcı = new ArrayList();
    public static KanGrublar kan;
    public static Bağışçı current = new Bağışçı();
    public static boolean ya_Giriş = false;
    public static List<String> il = new ArrayList();


    public static void setAllil()
    {
        il.add("Adana");
        il.add("Adıyaman"); il.add("Afyon"); il.add("Ağrı"); il.add("Amasya"); il.add("Ankara"); il.add("Antalya"); il.add("Artvin"); il.add("Aydın"); il.add("Balıkesir"); il.add("Bilecik"); il.add("Bingöl"); il.add("Bitlis"); il.add("Bolu"); il.add("Burdur"); il.add("Bursa"); il.add("Çanakkale"); il.add("Çankırı"); il.add("Çorum"); il.add("Denizli"); il.add("Diyarbakır"); il.add("Edirne"); il.add("Elazığ"); il.add("Erzincan"); il.add("Erzurum"); il.add("Eskişehir"); il.add("Gaziantep"); il.add("Giresun"); il.add("Gümüşhane"); il.add("Hakkari"); il.add("Hatay"); il.add("Isparta"); il.add("İçel (Mersin)"); il.add("İstanbul"); il.add("İzmir"); il.add("Kars"); il.add("Kastamonu"); il.add("Kayseri"); il.add("Kırklareli"); il.add("Kırşehir"); il.add("Kocaeli"); il.add("Konya"); il.add("Kütahya"); il.add("Malatya"); il.add("Manisa"); il.add("Kahramanmaraş"); il.add("Mardin"); il.add("Muğla"); il.add("Muş"); il.add("Nevşehir"); il.add("Niğde"); il.add("Ordu"); il.add("Rize"); il.add("Sakarya"); il.add("Samsun"); il.add("Siirt"); il.add("Sinop"); il.add("Sivas"); il.add("Tekirdağ"); il.add("Tokat"); il.add("Trabzon"); il.add("Tunceli"); il.add("Şanlıurfa"); il.add("Uşak"); il.add("Van"); il.add("Yozgat"); il.add("Zonguldak"); il.add("Aksaray"); il.add("Bayburt"); il.add("Karaman"); il.add("Kırıkkale"); il.add("Batman"); il.add("Şırnak"); il.add("Bartın"); il.add("Ardahan"); il.add("Iğdır"); il.add("Yalova"); il.add("Karabük"); il.add("Kilis"); il.add("Osmaniye"); il.add("Düzce");

    }
    public static boolean ChekGmail(String email){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
    }


    public static int Login(String u,String p)
    {
        for(int i=0;i<listKullanıcı.size();i++)
        {
            Kullanıcı kullanıcı = listKullanıcı.get(i);
            if(kullanıcı.getKullanıcıAdı().equals(u) && kullanıcı.getŞifre().equals(p)) {
                ya_Giriş = true;
               // current = (Bağışçı)listKullanıcı.get(i);
                return i;
            }
        }
        return -1;
    }

    public static boolean YeniKullanıcı(Kullanıcı YeniKullanıcı)
    {
        for(int i=0;i<listKullanıcı.size();i++)
        {
            Kullanıcı kullanıcı = listKullanıcı.get(i);
            if(kullanıcı.getKullanıcıAdı().equals(YeniKullanıcı.getKullanıcıAdı()))
                return false;
        }
        listKullanıcı.add(YeniKullanıcı);
        return true;
    }

    public static int getLastId()
    {
        //DataBase
        return 1;
    }


    public static void main(String[] args) {
     //   KullanıcıOLFrom K =new KullanıcıOLFrom(new Kullanıcı("u","u","u"));
       // K.setVisible(true);
       // YeniÜyeForm YUF = new YeniÜyeForm();
       // YUF.setVisible(true);
      //  MainForm f = new MainForm();
        setAllil();
        //new KullanıcıOLFrom();
    }
}
