
package com.mycompany.ejerciciog2;

import java.util.Scanner;
public class Ejerciciog2 {
    static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
        float v_cuen, porce, propi, t_propi = 0;
        String conti;

        do {
            System.out.println("Ingrese el valor de la cuenta del cliente:");
            v_cuen = dato.nextFloat();

            System.out.println("Ingrese el porcentaje de propina que desea dejar:");
            porce = dato.nextFloat();

            
            propi = v_cuen * (porce / 100);
            System.out.println("La propina del cliente es: $" + propi);

            
            t_propi += propi;

            dato.nextLine(); 
            System.out.println("¿Desea registrar otro cliente? (si/no)");
            conti = dato.nextLine();

        } while (conti.equals("si") || conti.equals("sí"));

        System.out.println("\n--- TOTAL DE PROPINAS RECOLECTADAS ---");
        System.out.println("Propinas totales del turno: $" + t_propi);
    }
}
