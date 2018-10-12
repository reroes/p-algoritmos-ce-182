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
public class Equipo {
    private String nombre;
    private String nombre_estadio;
    private Entrenador entrenador;
    
    public Equipo(String n, String n_estadio, Entrenador e){
        setNombre(n);
        setNombreEstadio(n_estadio);
        setEntrenador(e);
        
    }
    
    public Equipo(String n, Entrenador e){
        setNombre(n);
        setNombreEstadio("Sin nombre");
        setEntrenador(e);
        
    }
    
    public String imprimir(){
        String cadena = String.format("Mi Equipo %s, tiene un estadio"
                + "llamado %s\nSu entrenador es %s. Su edad es: %s", 
                getNombre(), getNombreEstadio(),
                getEntrenador().getNombre(), getEntrenador().getEdad());
        return cadena;
    }
    
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setNombreEstadio(String n){
        nombre_estadio = n;
    }
    
    public void setEntrenador(Entrenador n){
        entrenador = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getNombreEstadio(){
        return nombre_estadio;
    }
    
    public Entrenador getEntrenador(){
        return entrenador;
    }
    
    
}
