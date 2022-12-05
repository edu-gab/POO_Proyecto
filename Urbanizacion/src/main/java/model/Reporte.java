/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mycompany.urbanizacion.Urbanizacion;
import static com.mycompany.urbanizacion.Urbanizacion.residentes;
import java.util.Scanner;

/**
 *
 * @author Euro
 */
public class Reporte {

    //
    public static void immprimir() {
        Scanner imprimir = new Scanner(System.in);
        String cedula = null;

        for (Residente r : residentes) {
            System.out.println(r.toString());
            System.out.println("Ingrese el numero de cedula del residente ");
            cedula = imprimir.nextLine();
        }
        for (Residente r : Urbanizacion.residentes) {
            if (cedula.equals(r.getCedula())) {
                System.out.println("El usuario esta en la lista de residentes");
                for (Visitante p : Urbanizacion.permiso) {
                    if (p.equals("null")) {
                        System.out.println("El usuario no tiene ninguna permiso de visita");
                    }else{
                        System.out.println("EL USUARIO SI TIENE VISITAS");
                    }
                }
            }
        }
    }
}
