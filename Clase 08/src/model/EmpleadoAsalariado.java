/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author matvelazquez
 */
public class EmpleadoAsalariado extends Empleado {

    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, String legajo, double salarioMensual) {
        super(nombre, legajo);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", legajo=" + legajo +"salarioMensual=" + salarioMensual + '}';
    }
    
    @Override
    public double calcularPago(){
        return this.salarioMensual;
    }

}
