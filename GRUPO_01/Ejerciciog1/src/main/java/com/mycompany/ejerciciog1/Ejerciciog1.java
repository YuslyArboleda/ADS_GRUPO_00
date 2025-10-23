
package com.mycompany.ejerciciog1;
import java.util.Scanner;

public class Ejerciciog1 {
    static Scanner dato=new Scanner(System.in);
    public static void main(String[] args) {
        float s_inicial = 2000000, consig, retiro;
        int opcion;
        System.out.println("===Cajero automatico===");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Consignar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.println("Elija una opcion:");
        opcion = dato.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Su saldo disponible es:"+s_inicial);
                break;
            case 2:
                System.out.println("Ingrese el valor que va a consignar");
                consig = dato.nextFloat();
                s_inicial = s_inicial + consig;
                System.out.println("Su nuevo saldo es:" + s_inicial);
                break;
            case 3:
                System.out.println("Ingrese el valor que va a retirar");
                retiro= dato.nextFloat();
                if (retiro<s_inicial){
                    s_inicial = s_inicial - retiro;
                    System.out.println("su saldo restante es:" + s_inicial);
                }else{
                    System.out.println("No tienes saldo sufienciente");
                }         
            case 4:
                System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
        }while (opcion != 5);
    }
}
