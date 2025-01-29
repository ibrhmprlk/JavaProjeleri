/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cokbicimcilik2;

/**
 *
 * @author ibrah
 */
public class Tezgahtar extends Calisan
{
    private int satis;  
 
 public Tezgahtar(String ad, String soyad){ 
  super(ad, soyad); 
 } 
 
 public void setSatis(int satis) { 
  this.satis = satis; 
 } 
 
 public int maasHesapla() { 
  return this.satis / 10; 
 } 
  
 public String kimimBen() { 
  return "Tezgahtar"; 
 }  
}
