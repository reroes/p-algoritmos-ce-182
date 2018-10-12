/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laclase;
import ElTiempo.Tiempo2;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Tiempo2 t1 = new Tiempo2(); // 00:00:00
       
        Tiempo2 t2 = new Tiempo2(2); // 02:00:00
             
        Tiempo2 t3 = new Tiempo2(21, 10); // 21:10:00
      
        Tiempo2 t4 = new Tiempo2(22, 10, 9); // 22:10:09
             
        Tiempo2 t5 = new Tiempo2(t1); // t1
        
        // arreglo de tipo Tiempos2
        // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
        ArrayList<Tiempo2> tiempos = new ArrayList<Tiempo2>();
        tiempos.add(t1);
        tiempos.add(t2);
        tiempos.add(t3);
        tiempos.add(t4);
        tiempos.add(t5);
                
        for(int i = 0; i<tiempos.size(); i++){
            System.out.println(tiempos.get(i).vistaUniversal());
        }
        
        
    }
}
