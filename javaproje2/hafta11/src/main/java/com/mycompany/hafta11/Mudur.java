/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hafta11;

/**
 *
 * @author ibrah
 */
public class Mudur 
{
    private String ad ;
    private String soyad ;
    private int maas ;
    
    public Mudur (String ad ,String soyad)
    {
        this.ad = ad;
        this.soyad = soyad ;
        
    }
    public String getAd()
    {
        return ad;
    }
    public String getSoyad()
    {
        return soyad;
    }
    public void setMaas(int maas)
    {
        this.maas = maas ;
    }
    public String getBilgi()
    {
    return"müdür:"+this.ad+""+this.soyad+",bu ay"+this.maas+"ytl alacak.";
    }
    
    
}

