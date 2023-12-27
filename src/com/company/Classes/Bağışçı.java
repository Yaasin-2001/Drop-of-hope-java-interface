package com.company.Classes;

public class Bağışçı extends Kullanıcı{

    private String ad;
    private String soyad;
    private String tel;
    private String doğumTarihi;
    private String cinsiyet;
    private int TC;
    private String il;
    private String ilçe;
    private String kanGrubu;
    private double Ağırlık;


    public Bağışçı(){}
    public Bağışçı(String ka, String email, String ş1) {
        super(ka, email, ş1);
    }


    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlçe() {
        return ilçe;
    }

    public void setIlçe(String ilçe) {
        this.ilçe = ilçe;
    }

    public String getKanGrubu() {
        return kanGrubu;
    }

    public void setKanGrubu(String kanGrubu) {
        this.kanGrubu = kanGrubu;
    }

    public double getAğırlık() {
        return Ağırlık;
    }

    public void setAğırlık(double ağırlık) {
        Ağırlık = ağırlık;
    }



    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDoğumTarihi() {
        return doğumTarihi;
    }

    public void setDoğumTarihi(String doğumTarihi) {
        this.doğumTarihi = doğumTarihi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
