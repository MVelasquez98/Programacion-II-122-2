/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author matvelazquez
 */

/*
Estudiante
- nombre: String
- apellido: String
- edad: int
- curso : String
- calificaciónFinal: double

 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private double calificaciónFinal;

    public Estudiante(String nombre, String apellido, int edad, String curso, double calificaciónFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        this.calificaciónFinal = calificaciónFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificaciónFinal() {
        return calificaciónFinal;
    }

    public void setCalificaciónFinal(double calificaciónFinal) {
        this.calificaciónFinal = calificaciónFinal;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ","
                + " apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + ", calificaci\u00f3nFinal=" + calificaciónFinal + '}';
    }

    public void mostraInformacion() {
        System.out.println("Nombre: " + this.nombre);
    }

}
