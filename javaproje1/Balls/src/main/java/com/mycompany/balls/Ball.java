/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balls;

/**
 *
 * @author ibrah
 */
public abstract  class Ball implements Tossable {
    private String brandName;
    public Ball(){
            }
    public Ball(String brandName){
        this.brandName = brandName;
    }
    public String getBrandName(){
        return this.brandName;
    }
    public void bounce(){
        
    }
}
