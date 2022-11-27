/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static com.mycompany.urbanizacion.Urbanizacion.visitantes;
import java.util.Scanner;

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

    @Override
    public String toString() {
        return super.toString() + "empresa=" + empresa + ", sanciones=" + sanciones + '}';
    }
    
    //Metodo que agrega nuevos visitantes
    public static void agregar_visitante(){
        
        Scanner entrada_vis = new Scanner(System.in);
        String vis_cedula, vis_nombre, vis_telefono, vis_email, condicion, vis_empresa, vis_sanciones;
        
        System.out.println("Digite la informacion del nuevo visitante: ");
        
        System.out.print("\nCedula del visitante: ");
        vis_cedula = entrada_vis.nextLine();
        System.out.print("Nombre del visitante: ");
        vis_nombre = entrada_vis.nextLine();
        System.out.print("Telefono del visitante: ");
        vis_telefono = entrada_vis.nextLine();
        System.out.print("Email del visitante: ");
        vis_email = entrada_vis.nextLine();
        vis_sanciones = "Ninguna";
        
        System.out.println("¿Viene de parte de una empresa? y/n");
        condicion = entrada_vis.nextLine();
        if(condicion.equals("y")){
            System.out.print("\nEmpresa del visitante: ");
            vis_empresa = entrada_vis.nextLine();
            visitantes.add(new Visitante(vis_cedula, vis_nombre, vis_telefono, vis_email, vis_empresa, vis_sanciones));
        }       
        else{
            visitantes.add(new Visitante(vis_cedula, vis_nombre, vis_telefono, vis_email, vis_sanciones));
        }
    }
    
    //Metodo que modifica la informacion de los visitantes
    public static void modificar_visitante(){
        Scanner entrada_vis = new Scanner(System.in);
        
        String vis_cedula, vis_nombre, vis_telefono, vis_email, condicion, vis_empresa, vis_sanciones;
        int indice;
        
        for(Visitante v: visitantes){
            System.out.println("\n" + v.toString());
            
        }
        
        System.out.println("\nDigita el visitante que quiera modificar: ");
        System.out.print("");
        indice = Integer.parseInt(entrada_vis.nextLine());
        vis_cedula = visitantes.get(indice-1).getCedula();
        System.out.print("Nombre del visitante: ");
        vis_nombre = entrada_vis.nextLine();
        System.out.print("Telefono del visitante: ");
        vis_telefono = entrada_vis.nextLine();
        System.out.print("Email del visitante: ");
        vis_email = entrada_vis.nextLine();
        vis_sanciones = "Ninguna";

        System.out.println("¿Viene de parte de una empresa? y/n");
        condicion = entrada_vis.nextLine();
        if(condicion.equals("y")){
            System.out.print("\nEmpresa del visitante: ");
            vis_empresa = entrada_vis.nextLine();
            visitantes.set(indice-1, new Visitante(vis_cedula, vis_nombre, vis_telefono, vis_email, vis_empresa, vis_sanciones));
        }       
        else{
            visitantes.set(indice-1, new Visitante(vis_cedula, vis_nombre, vis_telefono, vis_email, vis_sanciones));
        }
        
        
    }
}
