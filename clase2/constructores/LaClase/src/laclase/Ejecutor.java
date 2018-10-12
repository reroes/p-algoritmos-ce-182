/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laclase;
import ElTiempo.Tiempo2;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        // TODO code application logic here
        Tiempo2 t1 = new Tiempo2(); // 00:00:00
        System.out.println(t1.vistaUniversal());
        
        Tiempo2 t2 = new Tiempo2(2); // 02:00:00
        System.out.println(t2.vistaUniversal());
        
        Tiempo2 t3 = new Tiempo2(21, 10); // 21:10:00
        System.out.println(t3.vistaUniversal());

        Tiempo2 t4 = new Tiempo2(22, 10, 9); // 22:10:09
        System.out.println(t4.vistaUniversal());
        
        Tiempo2 t5 = new Tiempo2(t1); // t1
        System.out.println(t5.vistaUniversal());
        
        
    }
}
