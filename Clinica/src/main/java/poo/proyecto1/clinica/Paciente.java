/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.proyecto1.clinica;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author elite
 */
public class Paciente {
    
    private String nombre;
    private String apellidos;
    private String id;
    private int telefono;
    
    private String correoParte1 = "x";
    private String correoParte2 = "x";

    private String direccion;
    private Date nacimiento;
    
    public void Paciente(){};
    
    public void Paciente(String pNombre,String pApellidos,String pId,int pTel,String pC1,String pC2,String pDir, Date pFecha){
        nombre = pNombre;
        apellidos = pApellidos;
        id = pId;
        telefono = pTel;
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellidos(String pApellidos){
        apellidos = pApellidos;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setId(String pId){
        id = pId; 
    }
    
    public String getId(){
        return id;
    }
    
    public void setTelefono(int pTel){
        telefono = pTel;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public void setCorreop1(String pC1){
        correoParte1 = pC1;
    }
    
    public void setCorreop2(String pC2){
        correoParte2 = pC2;
    }
    
    public String getCorreo(){
        return correoParte1 + "@" + correoParte2;
    }
    
    public void setDireccion(String pDir){
        direccion = pDir;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setNacimiento(String pFecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            nacimiento = formato.parse(pFecha);
        } catch (ParseException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getNacimiento(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(nacimiento);
    }
  
    
    
    
}
