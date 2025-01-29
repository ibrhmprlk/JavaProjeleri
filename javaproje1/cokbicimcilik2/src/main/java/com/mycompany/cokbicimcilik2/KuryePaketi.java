/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cokbicimcilik2;

/**
 *
 * @author ibrah
 */
public class KuryePaketi extends Calisan
{
    private static final int KURYE_PAKETİ = 150; 

 private static final int PRIM_LIMITI = 3000;
 private int satis; 

 
 
 
 
 public KuryePaketi(String ad, String soyad)
 { 
  super(ad, soyad); 
 } 
  public void setToplamSatis(int satis)
 { 
  this.satis = satis; 
 }
 

 public String kimimBen() { 
  return "Kurye paketi"; 
 } 
 public int maasHesapla()
 { 
  if (this.satis > KuryePaketi.KURYE_PAKETİ) 
{ 
   return KURYE_PAKETİ +  
  (this.satis - KuryePaketi.KURYE_PAKETİ)+202; 
} 
  return KURYE_PAKETİ; 
 } 
 
}
