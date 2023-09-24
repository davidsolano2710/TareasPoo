/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tarea3.clasesabstractas;

/**
 *
 * @author elite
 */
public class Permanente extends Proyecto{
    double costoAnualFijo;
    double inflacion;
    
    void Permanente(){
    
    }
    
    void Permanente(String pCodigo, String pNombre, double pCosto, double pIngresos, double pCostoAnual, double pInflacion){
        setCodigo(pCodigo);
        setNombre(pNombre);
        setCostoInicial(pCosto);
        setIngresosAcumulados(pIngresos);
        setCostoAnualFijo(pCostoAnual);
        setInflacion(pInflacion);
    }
    
    void setCostoAnualFijo(double pCAF){
        costoAnualFijo = pCAF;
    }
    
    double getCostoAnualFijo(){
        return costoAnualFijo;
    }
    
    void setInflacion(double pInflacion){
        inflacion = pInflacion;
    }
    
    double getInflacion(){
        return inflacion;
    }
    
    @Override
    public double calcularCostoActual(){
        return getCostoInicial() + getCostoAnualFijo() * (1+getInflacion());
    }
    
    @Override
    public String toString(){
        return "\nProyecto" + getCodigo() + " - " + getNombre () +

        "\nCosto inicial " + getCostoInicial() +

        "\nCosto Anual Fijo " + getCostoAnualFijo() +

        "\nInflacion " + getInflacion() +

        "\nCosto Actual " + calcularCostoActual() +

        "\nIngresos Acumulados " + getIngresosAcumulados () +

        "\nBalance " + calcularBalance();
    }
    
    
}
