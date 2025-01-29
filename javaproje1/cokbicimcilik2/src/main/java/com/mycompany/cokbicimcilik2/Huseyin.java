/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cokbicimcilik2;

/**
 *
 * @author ibrah
 */
public class Huseyin extends Calisan
{
    private static final int AYLIK_TÜM_SATIŞ = 5;
 private static final int PRIM_LIMITI = 100;
 private int satis; 
 private static final int MAAS = 600; 
 
 public Huseyin(String ad, String soyad){ 
  super(ad, soyad); 
 } 
 public void setToplamSatis(int satis)
 { 
  this.satis = satis; 
 }
 public int maasHesapla()
 { 
  if (this.satis >Huseyin.PRIM_LIMITI) 
{ 
   return + AYLIK_TÜM_SATIŞ + 
  (this.satis - Huseyin.PRIM_LIMITI)+2; 
} 
  return AYLIK_TÜM_SATIŞ ; 
 } 
 
 
 public String kimimBen() 
 { 
  return "Huseyin cay"; 
 } 
}
