/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ebobekok;

/**
 *
 * @author ibrah
 */
public class Ebob {
    
  
    Ebob(int sayi1,int sayi2){
        int ebob=0;
        int ekok=0;
        for(int i=1;i<=sayi1;i++){
            
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        ekok=(sayi1/ebob)*(sayi2/ebob)*ebob;
        
        System.out.println("Ebob :"+ebob+" Ekok : "+ekok);
        
    }
    
}
