package com.sena.examen4;

import java.util.Scanner;

public class Examen4 {
    public static void main(String[] args) {
        Scanner votos = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        String continuar;

        System.out.println("sistema de votaciones");
        System.out.println("Candidatos:");
        System.out.println("1. Ana Torres");
        System.out.println("2. Juan Perez");
        System.out.println("3. Maria Gomez");

        do {
            System.out.print("Ingrese el numero del candidato por quien desea votar: ");
            int voto = votos.nextInt();
            votos.nextLine();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    System.out.println("Has votado por Ana Torres.");
                    break;
                case 2:
                    votosCandidato2++;
                    System.out.println("Has votado por Juan Perez.");
                    break;
                case 3:
                    votosCandidato3++;
                    System.out.println("Has votado por Maria Gomez.");
                    break;
                default:
                    System.out.println("Opción no valida. Voto no registrado.");
                    break;
            }

            System.out.print("Desea registrar otro voto? (si/no): ");
            continuar = votos.nextLine().toLowerCase();

        } while (continuar.equals("si"));

        
        System.out.println(" resultados finales");
        System.out.println("Ana Torres: " + votosCandidato1 + " votos");
        System.out.println("Juan Pe"
                + "1"
                + "rez: " + votosCandidato2 + " votos");
        System.out.println("Maria Gomez: " + votosCandidato3 + " votos");


        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println("Ganadora: Ana Torres");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println(" Ganador: Juan Perez");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            System.out.println(" Ganadora: Maria Gomez");
        } else {
            System.out.println("Hay un empate entre los candidatos.");
        }

        votos.close();
    }
}
