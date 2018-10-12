/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication94;

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String m){
        setNombre(m);
        setEdad(20);
    }
    public Persona(String n, int e){
        
        String minombre = n.toUpperCase();
        setNombre(minombre);
        
        
        // setNombre(n.toUpperCase());
        
        if (e < 18){
            setEdad(18);
        }else{
            setEdad(e);
        }
        
                
    }
    
    public void setNombre(String m){
        nombre = m;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int e){
        edad = e;
    }
    
    public int getEdad(){
        return edad;
    }
    
}
