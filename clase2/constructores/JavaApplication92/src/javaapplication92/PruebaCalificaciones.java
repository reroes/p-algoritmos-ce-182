/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication92;

/**
 *
 * @author reroes
 */
// Fig. 3.11: PruebaLibroCalificaciones.java
// El constructor de LibroCalificaciones se utiliza para especificar el
// nombre del curso cada vez que se crea cada objeto LibroCalificaciones.
public class PruebaCalificaciones {
// el método main empieza la ejecución del programa

    public static void main(String args[]) {
// crea objeto LibroCalificaciones
        LibroCalificaciones libroCalificaciones1 = new LibroCalificaciones(
                "CS101 Introduccion a la programacion en Java");
        LibroCalificaciones libroCalificaciones2 = new LibroCalificaciones(
                "CS102 Estructuras de datos en Java");
// muestra el valor inicial de nombreDelCurso para cada LibroCalificaciones
        System.out.printf("El nombre del curso de libroCalificaciones1 es: %s\n",
                libroCalificaciones1.obtenerNombreDelCurso());
        System.out.printf("El nombre del curso de libroCalificaciones2 es: %s\n",
                libroCalificaciones2.obtenerNombreDelCurso());
    } // fin de main
} // fin de la clase PruebaLibroCalificaciones
