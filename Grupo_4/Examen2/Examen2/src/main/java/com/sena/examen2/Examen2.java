
package com.sena.examen2;
import java.util.Scanner;
public class Examen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalPropinas = 0;
        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el valor de la cuenta del cliente: ");
            double cuenta = sc.nextDouble();

            System.out.print("Ingrese el porcentaje de propina que desea dejar: ");
            double porcentaje = sc.nextDouble();
            sc.nextLine(); 

            double propina = cuenta * (porcentaje / 100);
            System.out.println("La propina del cliente es: $" + propina);

            totalPropinas += propina;

            System.out.print("¿Desea registrar otro cliente? (si/no): ");
            continuar = sc.nextLine();
        }

        System.out.println("120Total de propinas recolectadas durante el turno: $" + totalPropinas);
    }
}
