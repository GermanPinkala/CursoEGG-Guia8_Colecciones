package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        ProductoServicio productos = new ProductoServicio();

        boolean banderaContinuar = true;
        int opcion;

        do {
            
            

            System.out.println("¿Qué desea hacer?");
            System.out.println("1-Introducir producto/s.");
            System.out.println("2-Modificar precio de producto.");
            System.out.println("3-Eliminar producto.");
            System.out.println("4-Mostrar productos.");
            System.out.println("5-Finalizar.");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    productos.introducirProductos();
                    break;

                case 2:
                    productos.modificarPrecio();
                    break;

                case 3:
                    productos.eliminarProducto();
                    break;

                case 4:
                    productos.mostrarProductos();
                    break;
                
                case 5:
                    System.out.println("Hasta pronto.");
                    banderaContinuar = false;
                    break;
                    
                default:
                    System.out.println("Respuesta incorrecta, vuelva a intentarlo: ");
                    ;
            }
            
            System.out.println("");

        } while (banderaContinuar);

    }

}
