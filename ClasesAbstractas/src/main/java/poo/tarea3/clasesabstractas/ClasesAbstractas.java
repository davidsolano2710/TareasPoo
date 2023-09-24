/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.tarea3.clasesabstractas;

/**
 *
 * @author elite
 */
public class ClasesAbstractas {

    public static void main(String[] args) {
        Permanente proPer1 = new Permanente();
        proPer1.Permanente("10", "Software Hac", 500000, 2500000, 50000, 0.01);
        
        Permanente proPer2 = new Permanente();
        proPer2.Permanente("20", "Isthimus Software", 700000, 3400000, 10000, 0.03);
        
        System.out.print(proPer1.toString());
        
        System.out.print("\n");
               
        System.out.print(proPer2.toString());
        
        System.out.print("\n");
        
        Temporal proTemp1 = new Temporal();
        proTemp1.Temporal("30", "Chronical", 600000, 3000000, 564);
        
        System.out.print(proTemp1.toString());
        
        System.out.print("\n");
        
        Proyecto proyecto;
        
        proyecto = proPer1;
        
        System.out.print(proyecto);
        
        System.out.print("\n");
        
        proyecto = proPer2;
        
        System.out.print(proyecto);
        
        System.out.print("\n");
        
        proyecto = proTemp1;
        
        System.out.print(proyecto);
        
        
        
        
    }
}
