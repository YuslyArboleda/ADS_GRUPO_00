
package com.mycompany.ejerciciog3;

import java.util.Scanner;

public class Ejerciciog3 {
    static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        int edad, p_acep = 0, p_rec = 0;
        String n_per, continuar;

        do {
            System.out.println("Ingrese su nombre:");
            n_per = dato.nextLine();

            System.out.println("Ingrese su edad:");
            edad = dato.nextInt();
            dato.nextLine(); 

            if (edad >= 18) {
                System.out.println("Puedes ingresar, " + n_per);
                p_acep++;
            } else {
                System.out.println("No puedes ingresar, " + n_per);
                p_rec++;
            }

            System.out.println("¿Desea registrar otra persona? (si/no)");
            continuar = dato.nextLine();

        } while (continuar.equals("si") || continuar.equals("sí"));

        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.println("Personas aceptadas: " + p_acep);
        System.out.println("Personas rechazadas: " + p_rec);
    }
}

    

