/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.urbanizacion;
import java.util.Scanner;
import model.Datos_Urbanizacion;
/**
 *
 * @author Eduardo
 */
public class Urbanizacion {

    public static void main(String[] args) {
        
        int opcion;
        String eleccion;
        
        Datos_Urbanizacion ciudadela = new Datos_Urbanizacion("Metropolis 2", "2-C", "edu-gabriel@hotmail.com", "Aut. Terminal terrestre", "Constructor_1", "Alejandro Samuel Sanchez Cabezas");
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            //Menu del programa
            System.out.println("\n1. Urbanizacion");
            System.out.println("2. Residentes");
            System.out.println("3. Visitantes");
            System.out.println("4. Colaboradores de la urbanizacion");
            System.out.println("5. Permisos de entrada");
            System.out.println("6. Revision de entrada");
            System.out.println("7. Reportes");
            System.out.println("8. Salir");

            /**
             * Dependiendo que digites se seleccionara la opcion que requiere. Se seguira ensenando el menu
             * excepto cuando use la opcion 8, que hara que salga del switch y del do finalizando el programa
            */
            System.out.println("Digite la opcion: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    
                    System.out.println(ciudadela.toString());
                    System.out.println("¿Desea modificar los datos de la urbanizacion? y/n");
                    System.out.print("");
                    eleccion = entrada.next();
                    
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("1");
                    break;
                case 6:
                    System.out.println("2");
                    break;
                case 7:
                    System.out.println("3");
                    break;
                case 8:
                    break;                 
            }
        } while(opcion != 8);
        
    }
}
