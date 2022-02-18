/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8eje4;

import java.util.Comparator;

/**
 *
 * @author Win 10
 */
public class PeliculaComparator {
    
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula d1, Pelicula d2) {
                return d2.getDuracion().compareTo(d1.getDuracion());
            }
        };
    
}

