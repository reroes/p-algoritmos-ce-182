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
public class LibroCalificaciones {

    private String nombreDelCurso; // nombre del curso para este LibroCalificaciones
// el constructor inicializa nombreDelCurso con el objeto String que se provee como argumento

    public LibroCalificaciones(String nombre) {
        nombreDelCurso = nombre; // inicializa nombreDelCurso
    } // fin del constructor
// método para establecer el nombre del curso

    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso = nombre; // almacena el nombre del curso
    } // fin del método establecerNombreDelCurso
// método para obtener el nombre del curso

    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    } // fin del método obtenerNombreDelCurso
// muestra un mensaje de bienvenida al usuario de LibroCalificaciones

    public void mostrarMensaje() {
// esta instrucción llama a obtenerNombreDelCurso para obtener el
// nombre del curso que este LibroCalificaciones representa
        System.out.printf("Bienvenido al Libro de calificaciones para\n % s!\n",
                obtenerNombreDelCurso());
    } // fin del método mostrarMensaje
} // fin de la clase LibroCalificacione    

