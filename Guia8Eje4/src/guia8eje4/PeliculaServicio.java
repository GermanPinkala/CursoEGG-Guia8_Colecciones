/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8eje4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PeliculaServicio {

    private ArrayList<Pelicula> peliculas = new ArrayList();

    public Pelicula crearPelicula() {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Pelicula pelicula = new Pelicula();

        System.out.print("Ingrese el título de la película: ");
        pelicula.setTitulo(leer.next());

        System.out.print("Ingrese el nombre del director: ");
        pelicula.setDirector(leer.next());

        System.out.print("Ingrese la duración en horas: ");
        pelicula.setDuracion(leer.nextDouble());

        return pelicula;

    }

    public void crearPeliculas() {

        Pelicula pelicula;
        char respuesta;
        boolean banderaCarga = true;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        do {
            System.out.print("·············: Carga de Películas :·············");
            pelicula = crearPelicula();
            peliculas.add(pelicula);
            System.out.println("");
            System.out.print("¿Desea Agregar otra película? Y/N: ");
            respuesta = Character.toUpperCase(leer.next().charAt(0));

            if (respuesta == 'N') {
                banderaCarga = false;
            } else if (respuesta != 'Y') {

                do {
                    System.out.print("Respuesta incorrecta, vuelva a intentarlo: ");
                    respuesta = Character.toUpperCase(leer.next().charAt(0));
                    System.out.println("");
                } while (respuesta != 'Y' && respuesta != 'N');

                if (respuesta == 'N') {
                    banderaCarga = false;
                }

            }
            System.out.println("");

        } while (banderaCarga);

    }

    public void mostrarPeliculas() {

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }

    }

    public void mostrarPelisDeUnaHora() {

        boolean hayPelicula = false;

        for (Pelicula pelicula : peliculas) {

            if (pelicula.getDuracion() < 1) {
                System.out.println("-" + pelicula.toString());
                hayPelicula = true;
            }

        }
        if (!hayPelicula) {
            System.out.println("No se encontraron películas de 1 hora de duración.");
        }
    }
    
    

}
