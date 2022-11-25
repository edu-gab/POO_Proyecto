/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Eduardo
 */
public class Residente extends Persona{
    
    private int mz;
    private int villa;
    private int cantidad_persona;
    private String urbanizacion;

    public int getMz() {
        return mz;
    }

    public void setMz(int mz) {
        this.mz = mz;
    }

    public int getVilla() {
        return villa;
    }

    public void setVilla(int villa) {
        this.villa = villa;
    }

    public int getCantidad_persona() {
        return cantidad_persona;
    }

    public void setCantidad_persona(int cantidad_persona) {
        this.cantidad_persona = cantidad_persona;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public Residente(String cedula, String nombre, String telefono, String email, Estado estado_persona, int mz, int villa, int cantidad_persona, String urbanizacion){
        super(cedula, nombre, telefono, email, estado_persona);
        this.mz = mz;
        this.villa = villa;
        this.cantidad_persona = cantidad_persona;
        this.urbanizacion = urbanizacion;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "mz=" + mz + ", villa=" + villa + ", cantidad_persona=" + cantidad_persona + ", urbanizacion=" + urbanizacion + '}';
//    }

       
}
