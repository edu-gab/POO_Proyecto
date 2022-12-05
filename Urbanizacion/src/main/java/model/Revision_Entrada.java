/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import com.mycompany.urbanizacion.Urbanizacion;
import java.util.Scanner;

/**
 *
 * @author Euro
 */
public class Revision_Entrada {
    
    public static void Ingreso (){
        Scanner ingreso = new Scanner(System.in);
        String Codigo, cedula_ingreso;
        System.out.println("Ingrese el codigo de su pase");
        Codigo = ingreso.nextLine();
        System.out.println("Ingrese el numero de cedula de la persona que ingresa");
        cedula_ingreso= ingreso.nextLine();
        for (Visitante v :Urbanizacion.visitantes){
            System.out.println("\n"+ v.toString());
            if( cedula_ingreso.equals(v.getCedula())){
            System.out.println("EL PERMISO ES VALIDO");
            }else{
                System.out.println("EL PERMISO NO ES VALIDO O TAL VEZ SE CADUCO");
            }
        //revisar si el codigo es igual al que se ingresa-
        //revisar si el el numero de cedula es igual que el Del permiso
        // si la fecha es igual al permisoingresa 
        // si el ingreso esta activo
        
        
        }}
   
}
