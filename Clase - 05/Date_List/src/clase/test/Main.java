/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.test;

import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import model.Socio;

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
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMWV");
        cars.add("Ford");
        cars.add(1, "Madza");
        System.out.println(cars);
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println(cars.get(0));
        cars.set(2, "Fiat");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
// Wrapper o clase contenedora del tipo de dato primitivo
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(5);
        myNumbers.add(13);
        myNumbers.add(25);

        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        ArrayList<Socio> socios = new ArrayList<Socio>();

        socios.add(new Socio("Matias"));

        Socio socio = new Socio("Miguel");
        socios.add(socio);

        System.out.println(socios);
        ArrayList<String> nombres = new ArrayList<String>();
        for (Socio s : socios) {
            System.out.println(s.traerHolaMundo());
            nombres.add(s.getNombre());
        }
        System.out.println(nombres);

        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime fechaHora = LocalDateTime.of(2024, Month.DECEMBER, 30, 12, 30);
        System.out.println(fechaHora);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formmatedDate = fechaHora.format(format);
        System.out.println(formmatedDate);

    }

}
