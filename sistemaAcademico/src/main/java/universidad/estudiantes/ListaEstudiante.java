/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.estudiantes;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author David Solano Campos y Jose Emilio Alvarado
 */
public class ListaEstudiante {
    private List<Estudiante> listaEstudiantes;
    
    public ListaEstudiante(){
        listaEstudiantes = new ArrayList<>(); // crear instancia de lista y dejarla en variable
    }
    
    public boolean agregarAListaEstudiante(Estudiante pEstudiante){
        int indice = buscarEstudiante(pEstudiante.getId());
        if (indice == -1){
            listaEstudiantes.add(pEstudiante);
            return true;
        }
        
        
        return false; 
    }
    
    public int buscarEstudiante(int pId){
        int indice = 0;
        for(Estudiante i : listaEstudiantes){
            if(i.getId() == pId){
            return indice;
            }
            indice++;
        }
        return -1;
        
    }
    
    public boolean eliminarDeLaListaEstudiante(Estudiante pEstudiante){
        if(buscarEstudiante(pEstudiante.getId())== -1){
            return false;
        }
        listaEstudiantes.remove(pEstudiante);
        return true;
    }
    
    public void desplegarListaEstudiante(){
        for(Estudiante i : listaEstudiantes){
            System.out.println(i.toString());
        }
    }
    
    
    
}
