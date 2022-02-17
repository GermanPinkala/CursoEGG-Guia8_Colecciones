package guia8eje4;

import java.util.Locale;
import java.util.Scanner;

public class Guia8Eje4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        PeliculaServicio peliculaServicio = new PeliculaServicio();
        
        peliculaServicio.crearPeliculas();
        
        System.out.println("-----------------------");
        System.out.println("Películas cargadas: ");
        peliculaServicio.mostrarPeliculas();
        
        
        
    }

}
