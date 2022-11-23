/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Eduardo
 */
public class Colaboradores extends Persona{
    
    private String puesto_trabajo;
    private String tipo_empleado;
    private int fecha_inicio;
    private int fecha_fin;

    public String getPuesto_trabajo() {
        return puesto_trabajo;
    }

    public void setPuesto_trabajo(String puesto_trabajo) {
        this.puesto_trabajo = puesto_trabajo;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public int getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(int fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(int fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Colaboradores(String cedula, String nombre, String telefono, String email, Estado estado_persona, String puesto_trabajo, String tipo_empleado, int fecha_inicio, int fecha_fin) {
        super(cedula, nombre, telefono, email, estado_persona);
        this.puesto_trabajo = puesto_trabajo;
        //this.estado = estado;
        this.tipo_empleado = tipo_empleado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }
    
    
}
