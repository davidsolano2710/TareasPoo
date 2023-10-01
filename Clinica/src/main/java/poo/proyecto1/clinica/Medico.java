/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.proyecto1.clinica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elite
 */
public class Medico {private String nombre;
    private String apellidos;
    private String id;
    private int telefono;
    private String correoParte1 = "x";
    private String correoParte2 = "x";
    private String direccion;
    private Date nacimiento;
    private int costoCita;
    private int [][] horario;
    private int eec;
    
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
    
    public void setCostoCita(int pCosto){
        costoCita = pCosto;
    }
    
    public int getCostoCita(){
        return costoCita;
    }
    
    public void setHorarioMedico(int p1,int p21,int p2,int p22,int p3,int p23,
                                 int p4,int p24,int p5,int p25,int p6,int p26,
                                 int p7,int p27){
        
        
        horario = new int[7][2];
        
        horario[0][0]=p1;
        horario[0][1]=p21;
        horario[1][0]=p2;
        horario[1][1]=p22;
        horario[2][0]=p3;
        horario[2][1]=p23;
        horario[3][0]=p4;
        horario[3][1]=p24;
        horario[4][0]=p5;
        horario[4][1]=p25;
        horario[5][0]=p6;
        horario[5][1]=p26;
        horario[6][0]=p7;
        horario[6][1]=p27;
    }
    
    public int[][] getHorarioMedico(){
        return horario;
    }
    
    public void setEEC(int pEec){
        eec = pEec;
    }
    
    public int getEEC(){
        return eec;
    }
    
}
