/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Eduardo
 */

/**
 *Esta clase es la clase padre de residente, visitante y colaboradores
 */
public class Persona{
    private String cedula;
    private String nombre;
    private String telefono;
    private String email;
    private Estado estado_persona;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Estado getEstado_persona() {
        return estado_persona;
    }

    public void setEstado_persona(Estado estado_persona) {
        this.estado_persona = estado_persona;
    }
   
    public Persona(String cedula, String nombre, String telefono, String email, Estado estado_persona){
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.estado_persona = estado_persona;
    }

    public Persona(String cedula, String nombre, String telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    
}
