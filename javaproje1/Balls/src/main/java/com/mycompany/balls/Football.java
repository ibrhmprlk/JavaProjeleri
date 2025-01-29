/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balls;

/**
 *
 * @author ibrah
 */
public class Football extends Ball {
    public Football(String brandName){
        super(brandName);
    }
    public void toss(){
        System.out.println("football is tossed");
    }
    public void bounce(){
        System.out.println("footballis bouncing");
    }
}
