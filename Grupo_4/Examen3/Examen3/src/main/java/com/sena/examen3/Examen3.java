package com.sena.examen3;

        import java.util.Scanner;

public class Examen3 {
    public static void main(String[] args) {
         Scanner dinero = new Scanner(System.in);
            double saldo = 100000.0;
            int opcion;
            do {
                System.out.println(" cajero automatico");
                System.out.println("1. Consultar saldo");
                        
                System.out.println("2. Consignar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = dinero.nextInt();
                
                switch (opcion) {
                    case 1 -> System.out.println("Su saldo actual es: $" + saldo);
                        
                    case 2 -> {
                        System.out.print("Ingrese el monto a consignar: ");
                        double consignacion = dinero.nextDouble();
                        if (consignacion > 0) {
                            saldo += consignacion;
                            System.out.println("Ha consignado $" + consignacion);
                        } else {
                            System.out.println("Monto inválido. Intente nuevamente.");
                        }
                    }
                        
                    case 3 -> {
                        System.out.print("Ingrese el monto a retirar: ");
                        double retiro = dinero.nextDouble();
                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("Ha retirado $" + retiro);
                        } else if (retiro > saldo) {
                            System.out.println("Fondos insuficientes.");
                        } else {
                            System.out.println("Monto inválido. Intente nuevamente.");
                        }
                    }
                        
                    case 4 -> System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                        
                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 4);
        }
    }


