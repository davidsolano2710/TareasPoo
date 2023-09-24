/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tarea3.clasesabstractas;

/**
 *
 * @author elite
 */
public abstract class Proyecto {
    String codigo;
    String nombre;
    double costoInicial;
    double ingresosAcumulados;
    
    void Proyecto(String pCodigo, String pNombre, double pCosto, double pIngresos){
        setCodigo(pCodigo);
        setNombre(pNombre);
        setCostoInicial(pCosto);
        setIngresosAcumulados(pIngresos);
    }
    
    void setCodigo(String pCodigo){
        codigo = pCodigo;
    }
    
    String getCodigo(){
        return codigo;
    }
    
    void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    String getNombre(){
        return nombre;
    }
    
    void setCostoInicial(double pCI){
        costoInicial = pCI;
    }
    
    double getCostoInicial(){
        return costoInicial;
    }
    
    void setIngresosAcumulados(double pIA){
        ingresosAcumulados = pIA;
    }
    
    double getIngresosAcumulados(){
        return ingresosAcumulados;
    }
    
    public abstract double calcularCostoActual();
    
    public double calcularBalance(){
        return getIngresosAcumulados() - calcularCostoActual();
    }
    
    @Override
    public String toString(){
        return "Codigo: " + codigo + ", " + "Nombre: " + nombre + ", " + "Costo Inicial: " + costoInicial + ", " + "Ingresos Acumulados: " + ingresosAcumulados;
    }
    
    
    
}
