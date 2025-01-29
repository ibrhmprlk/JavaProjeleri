/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cokbicimcilik2;

/**
 *
 * @author ibrah
 */
public  abstract class Calisan
{
    private String ad; 
private String soyAd; 
public Calisan(String ad, String soyAd) { 
this.ad = ad; 
this.soyAd = soyAd; 
}
public String getAd() { 
return ad; 
} 
public String getSoyAd() { 
return soyAd; 
} 
public abstract int maasHesapla();

public String getBilgi()
{ 
return this.kimimBen() + ": " + this.ad + " " + this.soyAd +  
", bu ay " + this.maasHesapla() + " YTL alacaktır."; 
} 
public abstract String kimimBen();
}
