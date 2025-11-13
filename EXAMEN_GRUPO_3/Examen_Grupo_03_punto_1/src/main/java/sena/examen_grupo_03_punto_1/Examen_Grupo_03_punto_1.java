/*Diseña un programa que controle la entrada de personas a un evento. El
sistema debe pedir el nombre y la edad del asistente. Solo podrán ingresar
las personas mayores de 18 años. El programa debe preguntar si desea
registrar a otra persona y continuar mientras el usuario responda "sí". Al
finalizar, muestra cuántas personas fueron aceptadas y cuántas fueron
rechazadas.
 */
package sena.examen_grupo_03_punto_1;

import java.util.Scanner;

public class Examen_Grupo_03_punto_1 {

    static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        int edad, Pi = 0, Np = 0;
        String nombre, Nr;
        do{
        System.out.println("Ingrese su nombre");
        nombre = dato.nextLine();
        System.out.println("ingrese su edad");
        edad = dato.nextInt();
        dato.nextLine();
        System.out.println("Desea registrar otra persona");
        Nr = dato.nextLine();
         if (edad > 18) {
                System.out.println("Puedes ingresar");
                Pi++;
             
            } else {
                System.out.println("No puede ingresar");
                Np++;
         }
        }while (Nr.equalsIgnoreCase("si"));
 

        System.out.println("Personas aceptadas " + Pi);
        System.out.println("Personas rechazadas " + Np);
    }

}
