/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cokbicimcilik2;

import java.util.HashSet;

/**
 *
 * @author ibrah
 */
public class Cokbicimcilik2 {

    public static void main(String[] args) {
       Mudur mudur1 = new Mudur("furkan","kartal");
       mudur1.setToplamSatis(5000);
       System.out.println(mudur1.getBilgi());
       
       IdariPersonel idari1 = new IdariPersonel("ibrahim","parlak");
       idari1.maasHesapla();
       System.out.println(idari1.getBilgi());
       
        Tezgahtar tezgahtar1 = new Tezgahtar ("ömer","üren");
        tezgahtar1.maasHesapla();
        System.out.println(tezgahtar1.getBilgi());
        
        Hizmetli hizmetli1 = new Hizmetli("sahin","topac");
        hizmetli1.maasHesapla();
        System.out.println(hizmetli1.getBilgi());
       
        MudurYardımcısı mudury1 = new MudurYardımcısı("ibrahim","parlak");
        mudury1.setToplamSatis(5000);
        System.out.println(mudury1.getBilgi());
        
        
        KuryePaketi kurye1= new KuryePaketi("yunus","cakar");
        kurye1.setToplamSatis(3000);
        System.out.println(kurye1.getBilgi());
        
       Huseyin huseyin1 = new Huseyin("talha","parlak");
       huseyin1.setToplamSatis(30);
        System.out.println(huseyin1.getBilgi());
        
    }
}
