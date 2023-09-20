/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package excepcionarchivo.poo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcepcionArchivo {
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Andres", 2022010101);
        FileOutputStream fichero = null;
        
        try{
            fichero = new FileOutputStream("datos.txt");
            ObjectOutputStream proceso = new ObjectOutputStream(fichero);
            proceso.writeObject(estudiante1);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                fichero.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        
        FileInputStream ficheroEntrada = null;
        Estudiante e;
        
        try{
            ficheroEntrada = new FileInputStream("datos.txt");
            ObjectInputStream procesoEntradda = new ObjectInputStream(ficheroEntrada);
            e = (Estudiante)procesoEntradda.readObject();
            System.out.println(e.toString());
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}