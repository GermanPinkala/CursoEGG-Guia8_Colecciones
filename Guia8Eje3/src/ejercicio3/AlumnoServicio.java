/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class AlumnoServicio {

    private ArrayList<Alumno> alumnos = new ArrayList();

    public Alumno crearAlumno() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Alumno alumno = new Alumno();
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese el nombre del alumno: ");
        alumno.setNombre(leer.next());
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota nro " + (i + 1));
            notas.add(leer.nextInt());
        }
        alumno.setNotas(notas);
        return alumno;
    }

    public void crearAlumnos() {

        Alumno alumno;
        char respuesta;
        boolean banderaCarga = true;

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        do {
            System.out.println("------Carga de alumno------");
            alumno = crearAlumno();
            alumnos.add(alumno);
            System.out.println("desea cargar otro alumno? Y/N");
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

    public void mostrarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
    }

    public double notaFinal(Alumno alumno) {
        int total = 0;
        double promedio;
        for (Integer nota : alumno.getNotas()) {
            total += nota;
        }
        promedio = total / alumno.getNotas().size();
        return promedio;
    }

    public Alumno buscarAlumno(String nombreAlumno) {

        Alumno alumnoBuscado = null;

        for (Alumno alumno : alumnos) {

            if (alumno.getNombre().equals(nombreAlumno)) {
                alumnoBuscado = alumno;
            }

        }

        return alumnoBuscado;
    }

}
