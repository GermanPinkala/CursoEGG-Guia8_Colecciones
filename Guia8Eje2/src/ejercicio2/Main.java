/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Sección ejercicio 1
        ArrayList<String> razas = new ArrayList();

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        boolean banderaCarga = true;
        char respuesta;

        do {
            System.out.print("Ingrese la raza del perro: ");
            razas.add(entrada.next().toUpperCase());
            System.out.println("");
            System.out.print("¿Desea Agregar otra raza de perro? Y/N: ");
            respuesta = Character.toUpperCase(entrada.next().charAt(0));

            if (respuesta == 'N') {
                banderaCarga = false;
            } else if (respuesta != 'Y') {

                do {
                    System.out.print("Respuesta incorrecta, vuelva a intentarlo: ");
                    respuesta = Character.toUpperCase(entrada.next().charAt(0));
                    System.out.println("");
                } while (respuesta != 'Y' && respuesta != 'N');

                if (respuesta == 'N') {
                    banderaCarga = false;
                }

            }
            System.out.println("");

        } while (banderaCarga);

        for (String mostrar : razas) {
            System.out.println(mostrar);
        }

        //Sección ejercicio 2
        Iterator iterator = razas.iterator();
        String findRaza;
        boolean encontro = false;

        System.out.print("");
        System.out.print("Ingrese una raza de perro que desea borrar de la lista: ");
        findRaza = entrada.next().toUpperCase();

        while (iterator.hasNext()) {
            if (iterator.next().equals(findRaza)) {
                iterator.remove();
                System.out.println("Se ha eliminado la raza de perro.");
                System.out.println("");
                encontro = true;
            }
        }
        
        if (encontro) {
            System.out.println("No se encontró la raza de perro.");
            System.out.println("");
        }
        

        
        Collections.sort(razas);

        for (String mostrar : razas) {
            System.out.println(mostrar);
        }

        System.out.println("");

        /*if (ArrayList1.equals(ArrayList2) == true) {
            System.out.println(" Array List are equal");
        }*/
    }
    
}
