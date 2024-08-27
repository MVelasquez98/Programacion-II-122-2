/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import model.Auto;

/**
 *
 * @author matvelazquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        // Objeto : Instanciar una clase
        Auto miAuto = new Auto("Fiat Cronos",2023,"AGDGDG");
        //System.out.println(miAuto.nombre);        
        System.out.println(miAuto.getNombre());
        miAuto.setNombre("Fiat Palio");
        System.out.println(miAuto.getNombre());
        miAuto.acelerar(60.0);
        System.out.println("El auto acelero a : "+ miAuto.getVelocidad()+"Km/h");
        System.out.println(String.format("el nombre es: %s, el año es %d ", miAuto.getNombre(), miAuto.getAnio()));
    }
    
}
