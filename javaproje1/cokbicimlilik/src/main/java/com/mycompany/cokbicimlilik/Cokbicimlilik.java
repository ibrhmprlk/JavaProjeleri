/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cokbicimlilik;

/**
 *
 * @author ibrah
 */
public class Cokbicimlilik {

    public static void main(String[] args) {
        
        Mudur mudur1 = new Mudur("Ahmet","mehmet");
        mudur1.setMaas(5000);
        System.out.println(mudur1.getBilgi());
        
        Tezgahtar tezgahtar1 = new Tezgahtar("OKAN","yeşil");
        tezgahtar1.setMaas(1500);
         System.out.println(tezgahtar1.getBilgi());
        
        Idaripersonel ıdari1 = new Idaripersonel("ayse","demir");
         ıdari1.setMaas(800);
         System.out.println(ıdari1.getBilgi());
         
        Hizmetli hızmetli1 = new Hizmetli("ali","kaya");
         hızmetli1.setMaas(600);
         System.out.println(hızmetli1.getBilgi());
         
         
    }
}
