/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hafta10;

/**
 *
 * @author ibrah
 */
public class hayvan 
{
private String color;
public String getcolor()
{
    return "yesil";
}
public void setcolor(String color){
    System.out.println(color+"renginde hayvan...");
}
public void eat(){
    System.out.println("yemeğini yedi");
}
public void eat(int a ){
    System.out.println(a +"tane yemeğini yedi");
}


}
