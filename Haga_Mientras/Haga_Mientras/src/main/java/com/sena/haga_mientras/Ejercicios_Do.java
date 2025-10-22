package com.sena.haga_mientras;

import java.util.Scanner;

public class Ejercicios_Do {

    public void operaciones() {
        /* Crea un programa que presente un menú con opciones para realizar operaciones 
        aritméticas básicas (suma, resta, multiplicación y división) entre dos números ingresados por el usuario.*/
        Scanner dato = new Scanner(System.in);
        int opc;
        float num1, num2, res;

        do {
            System.out.println("===== MENÚ DE OPERACIONES ARITMETICAS =====");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opc = dato.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = dato.nextFloat();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = dato.nextFloat();
                    res = num1 + num2;
                    System.out.println("Resultado de la suma: " + res);
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = dato.nextFloat();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = dato.nextFloat();
                    res = num1 - num2;
                    System.out.println("Resultado de la resta: " + res);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = dato.nextFloat();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = dato.nextFloat();
                    res = num1 * num2;
                    System.out.println("Resultado de la multiplicación : " + res);
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = dato.nextFloat();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = dato.nextFloat();
                    if (num2 != 0) {
                        res = num1 / num2;
                        System.out.println("Resultado de la división: " + res);
                    } else {
                        System.out.println("Error: no se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opc != 5);

    }
    public void ejercicio2(){
        
    }

}
