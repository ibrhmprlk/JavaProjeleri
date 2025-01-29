/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fonksiyon;

import java.util.Scanner;

/**
 *
 * @author ibrah
 */

public class Fonksiyon
{

    public static void fak()
{
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Sayi : ");
    int sayi = scan.nextInt();
    int fak = 1;
for(int i = 1;i<=sayi;i++)
{
    fak *= i;
    
}
    System.out.println("cevap :"+fak);
}
   
   public static void/*geriye değer döndürmeyen*/ toplama(int a,int b ,int c)//paremetridir
   {
       System.out.println("Toplamlari :" +(a+b+c));//sout yaz ve tab a bas
   }
   
   public static int toplama1(int d , int e,int m)
   {
       return/*bu değer döndürüyor*/ (d+e+m);
            
   }
   
   public static int carpma()
   {  Scanner scan = new Scanner(System.in);
       System.out.println("Bir sayi girinz : ");
       int a = scan.nextInt();
       return a*4; 
      
   }
   
   public static void skorHesapla(String name , int score)
   {
       System.out.println(name +"isimli oyuncunun puani :"+score);
       
   }
   public static void skorHesapla(int score)
   {
       System.out.println("Isimsiz oyunucunun puani : ");
   }
      public static void skorHesapla(String name)
   {
       System.out.println(name +"Isimli oyunucunun puani : 0");
   }
 
 
    public static void main(String[] args)
    {
      fak();
      toplama(3,4,5);
      toplama(29,3,40);
      System.out.println("Fonsiyondan donen deger :" +toplama1(3,4,5));     
      System.out.println("cevap : "+carpma());
      skorHesapla("murat ",3000);
      skorHesapla(1000);
      skorHesapla("mustafa");
      
    }
}
