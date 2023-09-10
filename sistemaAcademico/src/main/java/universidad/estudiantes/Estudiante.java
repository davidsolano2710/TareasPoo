/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.estudiantes;


/**
 *
 * @author David Solano Campos y Jose Emilio Alvarado
 */
public class Estudiante {
    
    private String nombre;
    private int id;
    private String carrera;
    private String genero;
    private int telefono;
    
    
    public void Estudiante(){
    }
    
    
    public void Estudiante(String pNombre, int pId, String pCarrera, String pGenero, int pTelefono){
        nombre=pNombre;
        id=pId;
        carrera=pCarrera;
        genero=pGenero;
        telefono=pTelefono;
        
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
    
    public void setCarrera(String pCarrera){
        carrera=pCarrera;
        
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public void setGenero(String pGenero){
        genero=pGenero;
        
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setTelefono(int pTelefono){
        telefono=pTelefono;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n"+
                "Identificacion: " + id + "\n"+
                "Carrera: " + carrera + "\n"+
                "Genero: " + genero + "\n"+
                "Telefono: " + telefono + "\n";
    }
    
}