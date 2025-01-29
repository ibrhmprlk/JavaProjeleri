/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ibrahim;

/**
 *
 * @author ibrah
 */
public class NewClass //public = her yerden erişilebilir
{
    /*
    public int id ;
    public String isim ;
    public String Soyisim;
   */
    // bunlara Properties denir.
private String color ;
private String model ;
private double engine ;
private int doors ;



public NewClass(){
    /*
    this.color = "bilgi yok";
    this.model = "bilgi yok";
    this.engine =0;
    this.doors=0;
    */
    this("bilgi yok","bilgi yok",0,0);
    
}

public NewClass(String color,String model,double engine , int doors )
{
    this.color = color;
    this.model=model;
    this.engine =engine;
    this.doors=doors;
}
    
public void setColor(String color)
{
   this.color = color;
}
  public String getColor(){
    return this.color;
  }  
  public void setModel(String Model)
{
   this.model = Model;
}
   public String getModel(){
    return this.model;
  }
   public void setEngine(double engine)
{
   this.engine = engine;
}
  
  public double getEngine(){
    return this.engine;
  }  
  
  
  public void setdoors(int doors)
{
    
    if(doors==2 || doors == 4)
   this.doors= doors;
    else{
        System.out.println("Kapı sayısı 2 veya 4 olabilir");
    }
}
  
  public int getDoors(){
    return this.doors;
  }  

 public void start (){
     System.out.println("Araba çalıstı");
 }
 public void stop(){
     System.out.println("Araba durdu");
 }
 
 public void showInfos(){
      System.out.println("Arabanın rengi :"+this.color);
        System.out.println("Arabanın Modeli :"+this.model);
        System.out.println("engine : :"+this.engine);
        System.out.println("doors :"+this.doors);
        
        
        
        
        
        
        
        

 }
 
}


