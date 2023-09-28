/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionarchivo.poo;
import java.io.Serializable;

/**
 *
 * @author JE
 */

public class Estudiante implements Serializable{
    private String nombre;
    private int id;

    // Constructor sin argumentos
    public Estudiante() {
    }

    // Constructor con argumentos
    public Estudiante(String pNombre, int pId) {
        nombre = pNombre;
        id = pId;
    }
    
    public void setNombre(String pNombre){
        nombre=pNombre;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setId(int pId){
        id=pId;
    }
    
    public int getId(){
        return id;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n"+
                "Identificacion: " + id + "\n";
    }
}
