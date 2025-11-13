/*Crea un programa que permita calcular la propina de varios clientes en un
restaurante. Por cada cliente, se debe ingresar el valor de la cuenta y el
porcentaje de propina que desea dejar. El programa debe calcular y mostrar
la propina individual. Al final, muestra el total de propinas recolectadas
durante el turno. 
 */

package sena.examen_grupo_03_punto_dos;
import java.util.Scanner;
public class Examen_Grupo_03_punto_dos {
static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
       float Vc, Pr = 0,Prt, Pp;
        float x = 0;
        System.out.println("Ingrese el valor de la cuenta");
        Vc = dato.nextFloat();
        System.out.println("Ingrese el porcentaje de propina que desea dejar");
        Pp = dato.nextFloat();
        while (Vc !=0) {
            x = (x + Pr);
            Pr = (Vc * Pp )/100;
            System.out.println("su propina fue de "+Pr);
            System.out.println("Ingrese el valor de la cuenta");
            Vc = dato.nextFloat();
            System.out.println("Ingrese el porcentaje de propina que desea dejar");
            Pp = dato.nextFloat();
        }
        Prt = (Pr+ x);
        System.out.println("El total de propinas del dia fuero " + Prt);
    }
}
    
