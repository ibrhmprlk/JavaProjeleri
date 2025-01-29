/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cokbicimcilik2;

/**
 *
 * @author ibrah
 */
public class IdariPersonel extends Calisan
{
    private static final int MAAS = 800; 
 
 public IdariPersonel(String ad, String soyad){ 
  super(ad, soyad); 
 } 
 
 public int maasHesapla() { 
  return IdariPersonel.MAAS; 
 } 
 
 public String kimimBen() { 
  return "İdari Personel"; 
 } 
}
