/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.proyecto1.clinica;

import java.util.ArrayList;


/**
 *
 * @author elite
 */
public class Clinica {
    private ArrayList<Paciente> listaPacientes;
    private ArrayList<Medico> listaMedico;
    private ArrayList<Cita> listaCitas; 
    
    
    public void addPaciente(Paciente p1){
        listaPacientes.add(p1);
        
    }
    public void addMedico(Medico p1){
        listaMedico.add(p1);
        
    }
    
}

