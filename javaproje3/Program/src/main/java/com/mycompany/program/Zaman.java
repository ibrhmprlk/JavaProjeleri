/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program;

/**
 *
 * @author ibrah
 */
public class Zaman 
{
int saat;
int dakika ;
int saniye;

void ilerle()
{
    saniye++;
    if(saniye ==60){
        saniye = 0;
        dakika++;
        if(dakika==60)
        {
            dakika = 0;
            saat++;
            if(saat==24){
                saat = 0;
            }
        }
    }
    
}
void zamaniyaz(){
    System.out.println("zaman :"+saat+":"+dakika+":"+saniye);
}
}
