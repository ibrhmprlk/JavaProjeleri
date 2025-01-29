/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cokbicimcilik2;

/**
 *
 * @author ibrah
 */
public class Mudur extends Calisan
{
    private static final int CIPLAK_MAAS = 2000; 

 private static final int PRIM_LIMITI = 20000;
 private int satis; 
  
 public Mudur(String ad, String soyad){ 
  super(ad, soyad); 
 } 
  
 public void setToplamSatis(int satis) { 
  this.satis = satis; 
 } 
 
 public int maasHesapla()
 { 
  if (this.satis > Mudur.PRIM_LIMITI) 
{ 
   return CIPLAK_MAAS +  
  (this.satis - Mudur.PRIM_LIMITI) / 10; 
} 
  return CIPLAK_MAAS; 
 } 
 
 public String kimimBen() { 
  return "Müdür"; 
 }
}
