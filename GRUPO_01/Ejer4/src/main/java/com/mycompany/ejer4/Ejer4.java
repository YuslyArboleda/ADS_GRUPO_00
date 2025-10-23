

package com.mycompany.ejer4;

import java.util.Scanner;
public class Ejer4 {
    static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
        int candi1 = 0, voto=1, candi2 = 0, candi3 = 0, v_blanco=0, opc;
        String continuar, nomb1= "Juan Palacios:", nomb2 = "Keyner Mosquera:", nomb3= "Maria Rodrigues:", nomb4="Voto en blanco:";

        System.out.println("=== VOTACIONES ===");

        do {
            
            System.out.println("1. " + nomb1);
            System.out.println("2. " + nomb2);
            System.out.println("3. " + nomb3);
            System.out.println("4. " + nomb4);
            System.out.print("Ingrese una opcion: ");
            opc = dato.nextInt();
            dato.nextLine(); 

            switch (opc) {
                case 1:
                    System.out.println("Su voto fue para: " + nomb1);
                    candi1++;
                    break;
                case 2:
                    System.out.println("Su voto fue para: " + nomb2);
                    candi2++;
                    break;
                case 3:
                    System.out.println("Su voto fue para: " + nomb3);
                    candi3++;
                    break;
                case 4:
                    System.out.println("Su voto fue para: " + nomb4);
                    v_blanco++;
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }

            System.out.print("¿Desea registrar otra persona? (si/no): ");
            continuar = dato.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        
        System.out.println("=== RESULTADOS ===");
        System.out.println(nomb1 + ": " + candi1 + " votos");
        System.out.println(nomb2 + ": " + candi2 + " votos");
        System.out.println(nomb3 + ": " + candi3 + " votos");
        System.out.println(nomb4 + ": " + v_blanco + " votos");
        
        if (candi1 > candi2 && candi1 > candi3 && candi1 > v_blanco) {
            System.out.println("El ganador es Juan Palacios");
        } else if (candi2 > candi1 && candi2 > candi3 && candi2 > v_blanco) {
            System.out.println("El ganador es Keyner Mosquera");
        } else if (candi3 > candi1 && candi3 > candi2 && candi3 > v_blanco) {
            System.out.println("El ganador es Maria Rodriguez");
        } else if (v_blanco > candi1 && v_blanco > candi2 && v_blanco > candi3) {
            System.out.println("Ganó el voto en blanco");
        } else {
            System.out.println("Hubo un empate");
        }
    }
}
        
    

