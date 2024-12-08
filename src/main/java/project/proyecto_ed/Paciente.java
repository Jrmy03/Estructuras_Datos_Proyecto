/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.proyecto_ed;

/**
 *
 * @author Usuario
 */
public class Paciente {
    
    private String Timestamp, nombrePaciente,numeroFicha, genero, numeroCedulaPaciente;
   private int  edad;
   
    
   
    public Paciente() {
    }

    public Paciente(String Timestamp, String nombrePaciente, String numeroFicha, String genero, String numeroCedulaPaciente, int edad) {
        this.Timestamp = Timestamp;
        this.nombrePaciente = nombrePaciente;
        this.numeroFicha = numeroFicha;
        this.genero = genero;
        this. numeroCedulaPaciente =  numeroCedulaPaciente;
        this.edad = edad;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getNumeroFicha() {
        return numeroFicha;
    }

    public String getGenero() {
        return genero;
    }

    public String getNumeroCedulaPaciente() {
        return numeroCedulaPaciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public void setNumeroFicha(String numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumeroCedulaPaciente(String numeroCedulaPaciente) {
        this.numeroCedulaPaciente = numeroCedulaPaciente;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
