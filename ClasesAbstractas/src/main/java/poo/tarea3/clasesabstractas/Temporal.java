/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tarea3.clasesabstractas;

/**
 *
 * @author elite
 */
public class Temporal extends Proyecto{
    double valorDolar;
    
    void Temporal(String pCodigo, String pNombre, double pCosto, double pIngresos, double pValorDolar){
        setCodigo(pCodigo);
        setNombre(pNombre);
        setCostoInicial(pCosto);
        setIngresosAcumulados(pIngresos);
        setValorDolar(pValorDolar);
    }
   
    void setValorDolar(double pVD){
        valorDolar = pVD;
    }
    
    double getValorDolar(){
        return valorDolar;
    }
       
    @Override
    public double calcularCostoActual(){
        return getCostoInicial() * valorDolar;
    }
    
    @Override
    public String toString(){
        return "\nProyecto" + getCodigo() + " - " + getNombre () +

        "\nCosto inicial " + getCostoInicial() +

        "\nCosto Actual " + calcularCostoActual() +

        "\nIngresos Acumulados " + getIngresosAcumulados () +

        "\nBalance " + calcularBalance() +
                
        "\nValor dolar " + getValorDolar();
    }
}
