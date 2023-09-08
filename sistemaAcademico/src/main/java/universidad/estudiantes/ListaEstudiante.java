/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.estudiantes;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author elite
 */
public class ListaEstudiante {
    private List<Estudiante> listaEstudiantes;
    
    public ListaEstudiante(){
        listaEstudiantes = new ArrayList<>(); // crear instancia de lista y dejarla en variable
    }
    
    public boolean agregarAListaEstudiante(Estudiante pEstudiante){
        int indice = buscarEstudiante(pEstudiante.getId());
        if (indice == -1){
            return false;
        }
        listaEstudiantes.add(pEstudiante);
        
        return true; 
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
        listaEstudiantes.remove(pEstudiante);
        return true;
    }
    //desplegarListaEstudiante
    
    
    
}
