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
    private Tipo_Empleado tipo_empleado;
    private String fecha_inicio;
    private String fecha_fin;

    public String getPuesto_trabajo() {
        return puesto_trabajo;
    }

    public void setPuesto_trabajo(String puesto_trabajo) {
        this.puesto_trabajo = puesto_trabajo;
    }

    public Tipo_Empleado getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_mpleado(Tipo_Empleado tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Colaboradores(String cedula, String nombre, String telefono, String email, Estado estado_persona, String puesto_trabajo, Tipo_Empleado tipo_empleado, String fecha_inicio, String fecha_fin) {
        super(cedula, nombre, telefono, email, estado_persona);
        this.puesto_trabajo = puesto_trabajo;
        this.tipo_empleado = tipo_empleado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return super.toString() + "puesto_trabajo=" + puesto_trabajo + ", tipo_empleado=" + tipo_empleado + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin;
    }
    
    
    
}
