/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
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
    }
    
}
