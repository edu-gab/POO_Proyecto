/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Eduardo
 */
public class Datos_Urbanizacion{
    private String nombre_urba;
    private String etapa;
    private String email_admin;
    private String direccion;
    private String constructora;
    private String persona_responsable;

    public String getNombre_urba() {
        return nombre_urba;
    }

    public void setNombre_urba(String nombre_urba) {
        this.nombre_urba = nombre_urba;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getEmail_admin() {
        return email_admin;
    }

    public void setEmail_admin(String email_admin) {
        this.email_admin = email_admin;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getPersona_responsable() {
        return persona_responsable;
    }

    public void setPersona_responsable(String persona_responsable) {
        this.persona_responsable = persona_responsable;
    }

    public Datos_Urbanizacion(String nombre_urba, String etapa, String email_admin, String direccion, String constructora, String persona_responsable) {
        this.nombre_urba = nombre_urba;
        this.etapa = etapa;
        this.email_admin = email_admin;
        this.direccion = direccion;
        this.constructora = constructora;
        this.persona_responsable = persona_responsable;
    }    
    
    public void modificar_info(){
        System.out.println("Digite la nueva informacion de la urbanizacion: ");
    }

    @Override
    public String toString() {
        return "Datos_Urbanizacion{" + "nombre_urba=" + nombre_urba + ", etapa=" + etapa + ", email_admin=" + email_admin + ", direccion=" + direccion + ", constructora=" + constructora + ", persona_responsable=" + persona_responsable + '}';
    }
}
