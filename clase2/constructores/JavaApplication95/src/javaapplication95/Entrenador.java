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
public class Entrenador {
    private String nombre;
    private int edad;
    
    public Entrenador(String n, int e){
        setNombre(n);
        setEdad(e);
    }
    
    public void setNombre(String e){
        nombre = e;
    }
    
    public void setEdad(int e){
        edad = e;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    
    
}
