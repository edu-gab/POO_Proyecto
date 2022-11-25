/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Eduardo
 */
public class Visitante extends Persona{
    
    private String empresa;
    private String sanciones;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getSanciones() {
        return sanciones;
    }

    public void setSanciones(String sanciones) {
        this.sanciones = sanciones;
    }

    public Visitante(String cedula, String nombre, String telefono, String email, String empresa, String sanciones) {
        super(cedula, nombre, telefono, email);
        this.empresa = empresa;
        this.sanciones = sanciones;
    }

    public Visitante(String cedula, String nombre, String telefono, String email, String sanciones) {
        super(cedula, nombre, telefono, email);
        this.sanciones = sanciones;
    }
    
    
}
