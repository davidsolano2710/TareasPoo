/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.excepciones.programamanejoexcepciones;

/**
 *
 * @author curso
 */
public class Vector {
    private int [] numeros = new int[10];
    
    public Vector(){
        for (int i = 0; i < 10; i++){
           numeros[i] = i + 11;
        }
    }
    
    public void imprimirVector() throws ArrayIndexOutOfBoundsException{
        for (short i = 0; i <= 10; i++){
            System.out.println("indice " + i + " = " + numeros[i]);
        }
    }
}
