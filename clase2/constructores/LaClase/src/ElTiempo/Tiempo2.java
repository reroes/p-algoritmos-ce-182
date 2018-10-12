/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElTiempo;

/**
 *
 * @author reroes
 */
// Fig. 8.5: Tiempo2.java
// Declaración de la clase Tiempo2 con constructores sobrecargados.
public class Tiempo2 {

    private int hora; // 0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59
// Constructor de Tiempo2 sin argumentos: inicializa cada variable de instancia
// a cero; asegura que los objetos Tiempo2 empiecen en un estado consistente

    public Tiempo2() {
        this(0, 0, 0); // invoca al constructor de Tiempo2 con tres argumentos
    } // fin del constructor de Tiempo2 sin argumentos
// Constructor de Tiempo2: se suministra hora, minuto y segundo con valor predeterminado de 0

    public Tiempo2(int h) {
        this(h, 0, 0); // invoca al constructor de Tiempo2 con tres argumentos
    } // fin del constructor de Tiempo2 con un argumento
// Constructor de Tiempo2: se suministran hora y minuto, segundo con valor predeterminado de 0

    public Tiempo2(int h, int m) {
        this(h, m, 0); // invoca al constructor de Tiempo2 con tres argumentos
    } // fin del constructor de Tiempo2 con dos argumentos
// Constructor de Tiempo2:

   // Constructor de Tiempo2: se suministran hora, minuto y segundo
    public Tiempo2(int h, int m, int s) {
        establecerTiempo(h, m, s); // invoca a establecerTiempo para validar el tiempo
    } // fin del constructor de Tiempo2 con tres argumentos

    public Tiempo2(Tiempo2 tiempo) {
// invoca al constructor de Tiempo2 con tres argumentos
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    } // fin del constructor de Tiempo2 con un objeto Tiempo2 como argumento
// Métodos "establecer"
// establece un nuevo valor de tiempo usando la hora universal; asegura que
// los datos sean consistentes, estableciendo los valores inválidos en cero

    public void establecerTiempo(int h, int m, int s) {
        establecerHora(h); // establece la hora
        establecerMinuto(m); // establece el minuto
        establecerSegundo(s); // establece el segundo
    } // fin del método establecerTiempo // valida y

    public void establecerHora(int h){
        hora = h;
    }
    
    public void establecerMinuto(int m){
        minuto = m;
    }
    
    public void establecerSegundo(int s){
        segundo = s;
    }
    
    public int obtenerHora(){
        return hora;
    }
    
    public int obtenerMinuto(){
        return minuto;
    }
    
    public int obtenerSegundo(){
        return segundo;
    }
    
    public String vistaUniversal(){
        return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }
}

