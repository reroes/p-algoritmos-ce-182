/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication95;

/**
 *
 * @author reroes
 */
public class JavaApplication95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Entrenador e = new Entrenador("Alamada", 50);
        Entrenador e2 = new Entrenador("Arias", 52);
        
        Equipo equipo = new Equipo("Barcelona", "Pichincha", e);
        Equipo equipo2 = new Equipo("Emelec", e2);
        
        Equipo [] equipos = new Equipo[2];
        equipos[0] = equipo;
        equipos[1] = equipo2;
        
        for(int i = 0; i<equipos.length; i++){
            System.out.println(equipos[i].imprimir());
        }
        
        // System.out.println(equipo.imprimir());
        // System.out.println(equipo2.imprimir());
    }
    
}
