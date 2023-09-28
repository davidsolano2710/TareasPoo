/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.excepciones.programamanejoexcepciones;

/**
 *
 * @author curso
 */
public class CalculadoraBasica {
    private int operando1;
    private int operando2;
    private char operacion;
    private int resultado;
    
    public CalculadoraBasica(){
    operando1 = 0;
    operando2 = 0;
    operacion = ' ';
    resultado = 0;
    
    }

    public void calcular(int pOperando1, int pOperando2, char pOperacion){
        System.out.println("iniciando metoddo calcular...");
        operando1 = pOperando1;
        operando2 = pOperando2;
        operacion = pOperacion;
        
        try{
            if (operacion == '/'){
                if (operando2 == 0){
                    throw new ArithmeticException("ERROR: DIVISION POR CERO");
                }
            resultado = operando1 / operando2; 
            }
        }
        catch (ArithmeticException e){
            System.err.println("DIVISION POR CERO");
            e.printStackTrace();
            resultado = 0;
        }
        
        catch (Exception e){
            System.err.println("OTRA EXCEPCION");
            e.printStackTrace();
        }
        finally{
            System.err.println("EJECUCION DEL FINALLY");
        }
        
        System.out.println("...Terminando metodo calcular");
        }
        @Override
        public String toString(){
            return operando1 + " " + operacion + " " + operando2 + " = " + resultado;
        }
    } 

