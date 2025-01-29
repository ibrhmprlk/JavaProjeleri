/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cokbicimcilik2;

/**
 *
 * @author ibrah
 */
public class Hizmetli extends Calisan
{
    private static final int SAAT_UCRETI = 10; 
 private int mesaiSaati; 
  
 public Hizmetli(String ad, String soyad){ 
  super(ad, soyad); 
 } 
 
 public void setMesaiSaati(int mesaiSaati) { 
  this.mesaiSaati = mesaiSaati; 
 } 
  
 public int maasHesapla() { 
  return this.mesaiSaati * Hizmetli.SAAT_UCRETI; 
 } 
  
 public String kimimBen() { 
  return "Hizmetli"; 
 }  
}
