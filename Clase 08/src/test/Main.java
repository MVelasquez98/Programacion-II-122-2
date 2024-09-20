/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import model.Empleado;
import model.EmpleadoAsalariado;
import model.EmpleadoPorHora;

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

        List<Empleado> empleados = new ArrayList<Empleado>();

        empleados.add(new EmpleadoAsalariado("Carlos Perez", "001", 3000));
        empleados.add(new EmpleadoPorHora("Ana Garcia", "002", 20, 160));        
        empleados.add(new Empleado("Matias Velasquez", "003"));

        
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
            System.out.println("Pago:" + empleado.calcularPago());              
        }
      

    }

}
