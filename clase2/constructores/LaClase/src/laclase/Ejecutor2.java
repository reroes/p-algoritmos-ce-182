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
public class Ejecutor2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Tiempo2 t1 = new Tiempo2(); // 00:00:00
        
        
        Tiempo2 t2 = new Tiempo2(2); // 02:00:00
        
        
        Tiempo2 t3 = new Tiempo2(21, 10); // 21:10:00
        

        Tiempo2 t4 = new Tiempo2(22, 10, 9); // 22:10:09
        
        
        Tiempo2 t5 = new Tiempo2(t1); // t1
        
        // arreglo de tipo Tiempos2
        
        Tiempo2 [] tiempos = new Tiempo2[5];
        tiempos[0] = t1;
        tiempos[1] = t2;
        tiempos[2] = t3;
        tiempos[3] = t4;
        tiempos[4] = t5;
        
        for(int i = 0; i<tiempos.length; i++){
            System.out.println(tiempos[i].vistaUniversal());
        }
        
        
    }
}
