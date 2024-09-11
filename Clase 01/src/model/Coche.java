/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author matvelazquez
 */
public class Coche {
    private Motor motor;
    private Estereo estereo;
    
    public Coche(){
     this.motor = new Motor();
    }
    
    public void ensamblar (Estereo estereo){
        this.estereo= estereo;
        // ensamblado
    }
}
