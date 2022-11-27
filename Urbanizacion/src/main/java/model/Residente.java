/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static com.mycompany.urbanizacion.Urbanizacion.residentes;
import java.util.Scanner;


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

    @Override
    public String toString() {
        return super.toString() + "mz=" + mz + ", villa=" + villa + ", cantidad_persona=" + cantidad_persona + ", urbanizacion=" + urbanizacion;
    }
    
    //Metodo que agrega un nuevo residente
    public static void agregar_residente(){
        
        Scanner entrada_res = new Scanner(System.in);
        String res_cedula, res_nombre, res_telefono, res_email, res_urbanizacion;
        Estado res_estado;
        int res_mz, res_villa, res_personas;
        
        System.out.println("Digite la informacion del nuevo residente");

        System.out.print("\nCedula del residente: ");
        res_cedula = entrada_res.nextLine();
        System.out.print("Nombre del residente: ");
        res_nombre = entrada_res.nextLine();
        System.out.print("Telefono del residente: ");
        res_telefono = entrada_res.nextLine();
        System.out.print("Correo del residente: ");
        res_email = entrada_res.nextLine();
        res_estado = Estado.ACTIVO;
        System.out.print("Manzana en la que vive el residente: ");
        res_mz = Integer.parseInt(entrada_res.nextLine());
        System.out.print("Villa en la que vive el residente: ");
        res_villa = Integer.parseInt(entrada_res.nextLine());
        System.out.print("Cantidad de personas: ");
        res_personas = Integer.parseInt(entrada_res.nextLine());
        System.out.print("Urbanizacion en la que vive el residente: ");
        res_urbanizacion = entrada_res.nextLine();

        residentes.add(new Residente(res_cedula, res_nombre, res_telefono, res_email, res_estado, res_mz, res_villa, res_personas, res_urbanizacion));
        
    }
    
    //Metodo que cambia el estado de un residente a inactivo
    public static void eliminar_residente(){
        
        int indice;
        Scanner entrada_res = new Scanner(System.in);
        
        for(Residente r: residentes){
            System.out.println("\n" + r.toString());
                                    
        }
        
        System.out.println("\nDigita el residente que quiera eliminar: ");
        System.out.print("");
        indice = entrada_res.nextInt();


        residentes.get(indice -1).setEstado_persona(Estado.INACTIVO);
    }
    
    //Metodo que modifica a un residente
    public static void modificar_residente(){
        
        Scanner entrada_res = new Scanner(System.in);
        
        String res_cedula, res_nombre, res_telefono, res_email, res_urbanizacion;
        Estado res_estado;
        int res_mz, res_villa, res_personas, indice;
        
        for(Residente r: residentes){
            
            System.out.println("\n" + r.toString());
            
        }
        
        System.out.println("\nDigita el residente que quiera modificar: ");
        System.out.print("");
        indice = Integer.parseInt(entrada_res.nextLine());

        System.out.print("\nCedula del residente: ");
        res_cedula = entrada_res.nextLine();
        System.out.print("Nombre del residente: ");
        res_nombre = entrada_res.nextLine();
        System.out.print("Telefono del residente: ");
        res_telefono = entrada_res.nextLine();
        System.out.print("Correo del residente: ");
        res_email = entrada_res.nextLine();
        res_estado = Estado.ACTIVO;
        System.out.print("Manzana en la que vive el residente: ");
        res_mz = Integer.parseInt(entrada_res.nextLine());
        System.out.print("Villa en la que vive el residente: ");
        res_villa = Integer.parseInt(entrada_res.nextLine());
        System.out.print("Cantidad de personas: ");
        res_personas = Integer.parseInt(entrada_res.nextLine());
        System.out.print("Urbanizacion en la que vive el residente: ");
        res_urbanizacion = entrada_res.nextLine();


        residentes.set(indice-1, new Residente(res_cedula, res_nombre, res_telefono, res_email, res_estado, res_mz, res_villa, res_personas, res_urbanizacion));
    }
}
