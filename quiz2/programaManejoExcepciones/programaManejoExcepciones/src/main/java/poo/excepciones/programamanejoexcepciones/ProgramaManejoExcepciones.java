/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.excepciones.programamanejoexcepciones;

/**
 *
 * @author curso
 */
public class ProgramaManejoExcepciones {
    
            public static void controladorExcepciones(){
            Vector vector = new Vector();
            try{
                vector.imprimirVector();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.err.println("ATRAPANDO EXCEPCION EN EL INVOCADOR");
                e.printStackTrace();
            }
        }
            
    public static void main(String[] args) {
        System.out.println("INICIANDO PROGRAMA -->");
        
        CalculadoraBasica obj1 = new CalculadoraBasica();
        obj1.calcular(50, 0, '/');
        System.out.println(obj1);
        
        System.out.println("--> TERMINANDO PROGRAMA");
        
        controladorExcepciones();
        
    }
}
