
package ejercicio5;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaisesServicio paisServicio = new PaisesServicio();
        String paisAEliminar;
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Carga de paises");
        paisServicio.cargaPaises();
        System.out.println("");
        
        System.out.println("Paises cargados:");
        paisServicio.mostrarPaises();
        System.out.println("");
        
        paisServicio.mostrarPaisesOrdenado();
        System.out.println("");
        
        System.out.print("Ingrese el país que desea eliminar: ");
        paisAEliminar = entrada.next();
        System.out.println("");
        
        if (paisServicio.buscarPais(paisAEliminar)) {
            paisServicio.eliminarPais(paisAEliminar);
            System.out.println("");
            System.out.println("Lista de paises actualizada: ");
            paisServicio.mostrarPaises();
        }else{
            System.out.println("El país ingresado no se encuentra en el sistema.");
        }
        
    }
    
}
