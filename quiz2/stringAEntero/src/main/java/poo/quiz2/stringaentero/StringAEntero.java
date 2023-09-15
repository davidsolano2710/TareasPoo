/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.quiz2.stringaentero;
import java.util.Scanner;


/**
 *
 * @author David Solano y Jose Emilio Alvarado 
 */
public class StringAEntero {
    
    public static void stringAEntero(String pString) throws strToIntException{
        
        for (int i = 0; i < pString.length(); i++){
            if(!Character.isDigit(pString.charAt(i))){
                throw new strToIntException("DATO INGRESADO CONTIENE VALORES NO NUMERICOS");
            }
            
        }
        int formatoEntero = Integer.parseInt(pString);
        System.out.println(formatoEntero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dato a ingresar: ");
        String str = scanner.nextLine();
        try{
            stringAEntero(str);
        }
        catch(strToIntException ex){
            ex.printStackTrace();
        }
        
    }
}