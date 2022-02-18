package ejercicio6;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    private HashMap<String, Double> productos = new HashMap();

    public void introducirProducto() {

        String nombreProducto;
        Double precio;

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el nombre: ");
        nombreProducto = entrada.next();

        System.out.println("Ingrese el precio: ");
        precio = entrada.nextDouble();

        productos.put(nombreProducto, precio);

    }

    public void introducirProductos() {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        boolean banderaCarga = true;
        char respuesta;

        do {
            System.out.println("Ingrese los datos del producto: ");
            introducirProducto();
            System.out.print("¿Desea cargar otro producto? Y/N: ");
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

    public void modificarPrecio() {

        String nombreProducto;
        Double precio;

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el producto que desea modificar precio: ");
        nombreProducto = entrada.next();

        if (productos.containsKey(nombreProducto)) {
            System.out.println("Se encontró el producto.");
            System.out.println("Ingrese el nuevo precio: ");
            precio = entrada.nextDouble();
            productos.replace(nombreProducto, precio);
            System.out.println("Precio modificado.");
            

        } else {
            System.out.println("El producto no está registrado.");
        }

    }

    public void eliminarProducto() {

        String nombreProducto;

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el producto que desea eliminar: ");
        nombreProducto = entrada.next();

        if (productos.containsKey(nombreProducto)) {
            System.out.println("Se encontró el producto.");

            productos.remove(nombreProducto);

            System.out.println("Producto eliminado.");

        } else {
            System.out.println("El producto no está registrado.");
        }

    }

    public void mostrarProductos() {
        
        System.out.println("Productos: ");

        for (Map.Entry<String, Double> entry : productos.entrySet()) {

            System.out.println("·Producto: " + entry.getKey() + ", Precio: $" + entry.getValue());

        }

    }

}
