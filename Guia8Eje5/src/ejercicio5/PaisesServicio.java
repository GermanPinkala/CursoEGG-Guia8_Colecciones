package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class PaisesServicio {

    private HashSet<String> paises = new HashSet();

    public void cargaPaises() {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        boolean banderaCarga = true;
        char respuesta;

        do {
            System.out.print("Ingrese un país: ");
            paises.add(entrada.next());
            System.out.print("¿Desea cargar otro país? Y/N: ");
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

    }

    public void mostrarPaises() {

        for (String pais : paises) {
            System.out.println(pais);
        }
    }

    public void mostrarPaisesOrdenado() {

        ArrayList<String> listaPaises = new ArrayList(paises);
        Collections.sort(listaPaises);

        System.out.println("Paises ordenados: ");
        for (String pais : listaPaises) {
            System.out.println(pais);
        }

    }

    public boolean buscarPais(String paisBuscado) {

        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(paisBuscado)) {
                return true;
            }
        }
        return false;

    }
    
    public void eliminarPais(String paisAEliminar){
        
        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(paisAEliminar)) {
                
                iterator.remove();
                System.out.println("País eliminado correctamente.");
            }
        }
        
    }

}
