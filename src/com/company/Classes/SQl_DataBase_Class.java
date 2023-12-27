
package com.company.Classes;

import java.awt.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SQl_DataBase_Class {
    
    private static Connection con = null;

 
    public static Connection connection()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:src/Dema.db";
            con = DriverManager.getConnection(url);
            System.out.println("Connection succesful!");
            return con; 
        }
        catch(Exception e)
        {
            System.out.println("Connection failed!");
             return null;
        }
    }
    
    public static boolean Login(String adi,String S) {
        try {
            String sql = "SELECT No,Adi,Email,Sifre,TC,il,ilce,kanGrubu,Agirlik,ad,soyad,tel,dogumtarihi,cinsiyet FROM Kull" +
                    "where Adi = '"+adi+"' and Sifre = '"+S+"'";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                Bağışçı Ba = new Bağışçı();
                Ba.setKullanıcı_No(rs.getInt("No"));
                Ba.setKullanıcıAdı(rs.getString("Adi"));
                Ba.setEmail(rs.getString("Email"));
                Ba.setŞifre(rs.getString("Sifre"));
                Ba.setTC(rs.getInt("TC"));
                Ba.setIl(rs.getString("il"));
                Ba.setIlçe(rs.getString("ilçe"));
                Ba.setKanGrubu(rs.getString("KanGrubu"));
                Ba.setAğırlık(rs.getDouble("Agirlik"));
                Ba.setAd(rs.getString("ad"));
                Ba.setSoyad(rs.getString("soyad"));
                Ba.setTel(rs.getString("tel"));
                Ba.setDoğumTarihi(rs.getString("dogumtarihi"));
                Ba.setCinsiyet(rs.getString("cinsiyet"));
                Program.current = Ba;
                return true;
            }


        } catch (SQLException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
