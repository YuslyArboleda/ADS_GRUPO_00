package com.sena.examen_1;

import java.util.Scanner;

public class Examen_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aceptados = 0;
        int rechazados = 0;
        String continuar;

        do {
            System.out.print("Ingrese el nombre del asistente: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = sc.nextInt();
            sc.nextLine(); 

            if (edad >= 18) {
                System.out.println(nombre + " puede ingresar al evento.");
                aceptados++;
            } else {
                System.out.println(nombre + " no puede ingresar (menor de edad).");
                rechazados++;
            }

            System.out.print("Desea registrar a otra persona? (si/no): ");
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println(" Resumen del Registro ");
        System.out.println("Personas aceptadas: " + aceptados);
        System.out.println("Personas rechazadas: " + rechazados);

        
        sc.close();
    }
}
