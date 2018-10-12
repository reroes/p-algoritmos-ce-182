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
public class Cuenta {
    private String apellido;
    private double saldo;
    private String ciudad;
    private String tipo_cuenta;
    
    public Cuenta(String n){
        setApellido(n);
    }
    
    public Cuenta(String n, double s, String c){
        setApellido(n);
        setCiudad(c);
        setSaldo(s);
        
        if(c.equals("Loja")){
            setTipoCuenta("Ahorros");
        }else{
            setTipoCuenta("Corriente");
        }
    }
    
    public String imprimir(){
        
        String cadena = String.format("Ciudad: \n\tApellido:%s", getApellido());
        return cadena;
    }
    
    public void setApellido(String a){
        apellido = a;    
    }
    
    public void setCiudad(String a){
        ciudad = a;    
    }
    
    public void setTipoCuenta(String a){
        tipo_cuenta = a;    
    }
    
    public void setSaldo(double a){
        saldo = a;    
    }
    
    public String getApellido(){
        return apellido;    
    }
    
    public String getCiudad(){
        return ciudad;    
    }
    
    public String getTipoCuenta(){
        return tipo_cuenta;    
    }
    
    public double getSaldo(){
        return saldo;    
    }
    
    
    
    
}
