/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zaman1;

/**
 *
 * @author ibrah
 */
public class zaman 
{
    int saat; 
 int dakika; 
 int saniye; 
 
 /** 
  * Her çağrıldığında nesneyi bir saniye sonrasına götüren yöntem. 
  * saniye 59, dakika 59, saat ise 23'ten büyük olamaz.  
  */ 
 void ilerle() { 
  saniye++; 
  if (saniye == 60) { 
   saniye = 0; 
   dakika++; 
   if (dakika == 60) { 
    dakika = 0; 
    saat++; 
    if (saat == 24) { 
     saat = 0; 
    } 
   } 
  }
}
 void zamaniYaz() { 
System.out.println("Zaman: " + saat + ":" + dakika + ":" + saniye); 
}  
}