/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.urbanizacion;
import java.util.ArrayList;
import java.util.Scanner;
import model.Colaboradores;
import model.Datos_Urbanizacion;
import model.Estado;
import model.Residente;
import model.Tipo_Empleado;
import model.Visitante;
/**
 *
 * @author Eduardo
 */
public class Urbanizacion {
    
    public static ArrayList<Datos_Urbanizacion> ciudadela;
    public static ArrayList<Residente> residentes;
    public static ArrayList<Visitante> visitantes;
    public static ArrayList<Colaboradores> colaboradores;
    

    //Llamada de funcion para que se creen los objetos
    public static void main(String[] args) {
        
        inicializarSistema();
        
        int opcion;
        String eleccion;
        
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
                    
                    System.out.println("\n" + ciudadela.get(0).toString());
                    System.out.println("\n¿Desea modificar los datos de la urbanizacion? y/n");
                    System.out.print("");
                    eleccion = entrada.next();
                    
                    if(eleccion.equals("y")){
                        ciudadela.get(0).modificar_info();
                    }
                    
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
    
    //Metodo que crea los primeros objetos que pide el proyectp
    public static void inicializarSistema(){
        ciudadela = new ArrayList<>();
        residentes = new ArrayList<>();
        visitantes = new ArrayList<>();
        colaboradores = new ArrayList<>();
        
        Datos_Urbanizacion ciudadela1 = new Datos_Urbanizacion("Metropolis 2", "2-C", "edu-gabriel@hotmail.com", "Aut. Terminal Terrestre", "Contructora_1", "Samuel Alejandro Sanchez Cabezas");
//        
//        Residente residente1 = new Residente("0941656548", "Eduardo Sanchez", "0987042324", "edu-gabriel@hotmail.com", Estado.Activo, 919, 13, 1, "2-C");
//        
        Visitante visitante1 = new Visitante("0702788472", "Jazmin Sanchez", "0984213239", "alejazmin@outlook.com", "Ninguna");
        Visitante visitante2 = new Visitante("0915421787", "Jorge Solorzano", "0989991111", "jsolorz@gmail.com", "Uber", "Ninguna");
//        
//        Colaboradores colaborador1 = new Colaboradores("09123453101", "Alvaro Vega", "0981234321", "alvarov@outlook.com", Estado.Activo, "Empleado", Tipo_Empleado.Guardia, "21/11/22", "24/11/22");
//        Colaboradores colaborador2 = new Colaboradores("09567283921", "William Gonzales", "0981234789", "williamg@gmail.com", Estado.Activo, "Empleado", Tipo_Empleado.Guardia, "21/11/22", "24/11/22");
//        
        ciudadela.add(ciudadela1);
//        residentes.add(residente1);
        visitantes.add(visitante1);
        visitantes.add(visitante2);
//        colaboradores.add(colaborador1);
//        colaboradores.add(colaborador2);
    }
}
