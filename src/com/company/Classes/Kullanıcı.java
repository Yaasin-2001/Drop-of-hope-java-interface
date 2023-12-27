package com.company.Classes;

public class Kullanıcı
{

    private int Kullanıcı_No;
    private String KullanıcıAdı;
    private String Email;
    private String Şifre;


    public Kullanıcı()
    {

    }
    public Kullanıcı(String ka, String email, String ş1) {
        setKullanıcı_No(Program.getLastId());
        KullanıcıAdı = ka;
        Email = email;
        Şifre = ş1;

    }




    public String getKullanıcıAdı() {
        return KullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        KullanıcıAdı = kullanıcıAdı;
    }

    public String getEmail() { return Email; }

    public void setEmail(String email) {
        Email = email;
    }

    public String getŞifre() {
        return Şifre;
    }

    public void setŞifre(String şifre) {
        Şifre = şifre;
    }


    public int getKullanıcı_No() {
        return Kullanıcı_No;
    }

    public void setKullanıcı_No(int kullanıcı_No) {
        Kullanıcı_No = kullanıcı_No;
    }
}
