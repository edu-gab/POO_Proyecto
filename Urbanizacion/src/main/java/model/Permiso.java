/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
//import static com.mycompany.urbanizacion.Urbanizacion.Permiso;

import java.awt.JobAttributes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author Euro
 *
 */
public class Permisos {

    static Calendar Hora = Calendar.getInstance();
    static Calendar Fecha = Calendar.getInstance();
//Metodo para saber la fecha actual

    public static ArrayList<String> fechita() {
        ArrayList<String> fechita = new ArrayList();
        int hora, minutos, seg, dia, mes, anio ;
        String fecha, horatotal;
        hora = Hora.get(Calendar.HOUR_OF_DAY);
        minutos = Hora.get(Calendar.MINUTE);
        seg = Hora.get(Calendar.SECOND);
        dia = Fecha.get(Calendar.DATE);
        mes = Fecha.get(Calendar.MONTH);
        anio = Fecha.get(Calendar.YEAR);
        int mesactual = (int)mes+1 ;
        horatotal = hora + ":" + minutos + ":" + seg;
        fecha = dia + "/" + mesactual + "/" + anio;
        fechita.add(horatotal);
        fechita.add(fecha);
        System.out.println("La hora al momento de realizar el registro es:" + horatotal + " , en la fecha del:" + fecha);
        return fechita;
       }
//Metodo para dar rango de TIEMPO

    public static void nuevo_Permiso() {
        Scanner nue_permiso = new Scanner(System.in);
        //String Codigo;

        String hora_ingreso, hora_salida;
        System.out.print("Ingrese la hora de INGRESO H:M  :");
        hora_ingreso = nue_permiso.nextLine();
        String[] horPart = hora_ingreso.split(":");
        int hora = Integer.parseInt(horPart[0]);
        int min = Integer.parseInt(horPart[1]);
        int minantes = 0;
        int mindespués = 0;
        int horantes = 0;
        int horadespués = 0;
        if ((min <= 45) && (min >= 15) && (min != 0)) {
            minantes = min - 15;
            horantes = hora;
            mindespués = min + 15;
            horadespués = hora;
        } else if ((min > 45) && (min != 0)) {
            minantes = min - 15;
            mindespués = 15 - (60 - min);
            if (hora > 0) {
                horantes = hora;
                horadespués = hora + 1;
            }
        } else if ((min < 15) && (min != 0)) {
            minantes = (60 - min) - 15;
            mindespués = min + 15;
            if (hora > 0) {
                horantes = hora - 1;
                horadespués = hora;

            }
        } else if ((hora != 0) && (min == 0)) {
            minantes = 45;
            mindespués = 15;
            if (hora > 0) {
                horantes = hora - 1;
                horadespués = hora + 1;
            }
        } else {
            mindespués = 15;
        }

        if (minantes < 10) {
            System.out.println("Puede Ingresar desde:" + horantes + ":0" + minantes);
            System.out.println("Puede Ingresar hasta:" + horadespués + ":" + mindespués);
        }
        if (mindespués < 10) {
            System.out.println("Puede Ingresar desde:" + horantes + ":" + minantes);
            System.out.println("Puede Ingresar hasta:" + horadespués + ":0" + mindespués);
        } else {
            System.out.println("Puede Ingresar desde:" + horantes + ":" + minantes);
            System.out.println("Puede Ingresar hasta:" + horadespués + ":" + mindespués);
        }

    }
    //Metodo para registrar al residente 

    //Metodo para sacar informacion
    public static void Informa() {
        int dia, mes, anio;
        String fecha;
        dia = Fecha.get(Calendar.DATE);
        mes = Fecha.get(Calendar.MONTH);
        anio = Fecha.get(Calendar.YEAR);
        int mesactual= (int)mes+1;
        fecha = dia + "/" + mesactual + "/" + anio;
        Scanner info = new Scanner(System.in);
        String cedula_info, ingreso_info, fecha_ingreso;
        int duracion_info;
        System.out.println("Residente Ingrese su numero de Cedula: ");
        cedula_info = info.nextLine();
        Visitante v = Visitante.agregar_visitante();
        System.out.println("Ingrese que va ingresar: ");
        ingreso_info = info.nextLine();
        System.out.println("Que día va a ingresar (dd/mm/aaaa): ");
        fecha_ingreso = info.nextLine();
        System.out.println("Duracion aproximada de la visita: ");
        duracion_info = info.nextInt();
        //if (fecha_ingreso == fecha) {
            System.out.println("*****************************************");
            System.out.print("El numero de cedula del residente es "+ cedula_info);
            System.out.println("El numero de cedula del visistante es "+v.getCedula());
            System.out.println("El nombre del visistante es "+v.getNombre());
            System.out.println("El email del visistante es "+v.getEmail());
            System.out.println("El nombre de telefono del visistante es "+v.getTelefono());
            System.out.println("sanciones del visistante es "+v.getSanciones());
            
            
            
       // }
  
       
        
   
    }
        //Metodo para generar un codigo unico

    

    public static String generar_codigo() {
        String Codigo;
        int numeroAleatorio1 = (int) (Math.random() * 9 + 1);
        int numeroAleatorio2 = (int) (Math.random() * 9 + 1);
        int numeroAleatorio3 = (int) (Math.random() * 9 + 1);
        int numeroAleatorio4 = (int) (Math.random() * 9 + 1);
        Codigo= "PVTS"+numeroAleatorio1+numeroAleatorio2+numeroAleatorio3+numeroAleatorio4;
        System.out.println(Codigo);
        return Codigo;

    }
    //Metodo para eliminar permiso
    public static void eliminar_permiso(){
        int codigo; 
        Scanner eliminar_res= new Scanner(System.in);
        for (Permisos p: Permisos )/*Help*/{
            System.out.println("\n" +p.toString());
        }
         System.err.println("\n Digite el codido que quieras eliminar: ");
         System.err.print("");
         codigo= eliminar_res.nextInt();
         //permiso.get(indice -1).setEstado_permiso(Estado.ELIMINADO);
        
        
        // metodo de consultat 
    }
