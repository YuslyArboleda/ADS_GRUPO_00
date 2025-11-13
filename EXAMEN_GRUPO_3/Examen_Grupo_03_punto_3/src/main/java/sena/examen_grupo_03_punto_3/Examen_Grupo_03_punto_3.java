/*Desarrolla un programa que simule el funcionamiento de un cajero
automático. Debe iniciar con un saldo inicial definido y mostrar un menú con
las opciones: consultar saldo, consignar dinero, retirar dinero o salir.
 */
package sena.examen_grupo_03_punto_3;

import java.util.Scanner;

public class Examen_Grupo_03_punto_3 {

    static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        int Si = 100000, opc, Dc, res, Dr;
        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consignar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("elija una opcion");
            opc = dato.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("------------------------------------------");
                    System.out.println("El saldo de su cuenta es " + Si);
                    System.out.println("------------------------------------------");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero que quiere consignar");
                    Dc = dato.nextInt();
                    res = Dc + Si;
                    System.out.println("---------------------------------------------");
                    System.out.println("Su saldo es " + res);
                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dinero que quiere retirar");
                    Dr = dato.nextInt();
                    if (Si > Dr) {
                        res = Si - Dr;
                        System.out.println("--------------------------------------------");
                        System.out.println("Su saldo es " + res);
                        System.out.println("---------------------------------------------");
                    } else {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Su saldo es insuficiente consulte su saldo o ingrese otra cantidad");
                        System.out.println("------------------------------------------------------------------");
                        break;
                    }
                case 4:
                    System.out.println("--------------------------------------------");
                    System.out.println("Gracias por utilizar nuestros servicios");
                    System.out.println("--------------------------------------------");
                    break;
                default:
                    System.out.println("--------------------------------------------");
                    System.out.println("Opcion no valida, intente de nuevo");
                    System.out.println("--------------------------------------------");
            }
        } while (opc != 4);
    }
}
