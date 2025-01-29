/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hafta11;

/**
 *
 * @author ibrah
 */
public class Hafta11 
{

    public static void main(String[] args) 
    {
        Mudur mudur1 = new Mudur("TALHA","CUMHURBAŞKANIMIZ");
        mudur1.setMaas(5000);
        System.out.println(mudur1.getBilgi());
        
        
        Tezgahtar tezgahtar1 = new Tezgahtar("Ömer","Uren");
        tezgahtar1.setMaas(3000);
        System.out.println(tezgahtar1.getBilgi());
        
        Tezgahtar tezgahtar2 = new Tezgahtar("IBRAHIM","PARLAK");
        tezgahtar2.setMaas(2900);
        System.out.println(tezgahtar2.getBilgi());
        
        IdariPersonel idaripersonel = new IdariPersonel("mehmet","celik");
        idaripersonel.setMaas(700);
        System.out.println(idaripersonel.getBilgi());
        
        IdariPersonel idaripersonel1 = new IdariPersonel("ayşe","ateş");
        idaripersonel1.setMaas(600);
        System.out.println(idaripersonel1.getBilgi());
        
        Hizmetli hızmet = new Hizmetli("alı","kaya");
        hızmet.setMaas(400);
        System.out.println(hızmet.getBilgi());
        
        Hizmetli hızmet1 = new Hizmetli("kuzu","kaya");
        hızmet1.setMaas(500);
        System.out.println(hızmet1.getBilgi());
        
        
    }
}
