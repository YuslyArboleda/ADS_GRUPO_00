package sena.examen_grupo_3_punto_4;

import java.util.Scanner;

public class Examen_grupo_3_punto_4 {

    static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        int Vt, Vm = 0, Va = 0, Vr = 0, Vb = 0;
        String Nv = "";
        do {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Bienvenido a las elecciones de camara de reprensentate,¿por quien quiere vota?");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("1. Miguel Perez");
            System.out.println("2. Ana Murillo");
            System.out.println("3. Rubi ledezma");
            System.out.println("4. Voto en blaco");
            System.out.println("-------------------------------------------------");
            System.out.println("Seleccione la persona por la cual va a vota");
            System.out.println("-------------------------------------------------");
            Vt = dato.nextInt();
            dato.nextLine();
            System.out.println("Desea registrar otro voto?");
            Nv = dato.nextLine();
            switch (Vt) {
                case 1 -> {
                    System.out.println("---------------------------");
                    System.out.println("Usted voto por Miguel Perez");
                    System.out.println("---------------------------");
                    Vm++;
                    break;
                }
                case 2 -> {
                    System.out.println("---------------------------");
                    System.out.println("Usted voto por Ana Murillo");
                    System.out.println("---------------------------");
                    Va++;
                    break;
                }
                case 3 -> {
                    System.out.println("---------------------------");
                    System.out.println("Usted voto por Rubi ledezma");
                    System.out.println("---------------------------");
                    Vr++;
                    break;
                }
                case 4 -> {
                    System.out.println("--------------------");
                    System.out.println("Usted voto en blanco");
                    System.out.println("--------------------");
                    Vb++;
                    break;
                }
                default -> {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("La opcion escogida no es valida para el voto, intente de nuevo");
                    System.out.println("--------------------------------------------------------------");
                }

            }
        } while (!Nv.equalsIgnoreCase("no"));

        if (Vm > Va && Vm > Vr && Vm > Vb) {
            System.out.println("--------------------------------");
            System.out.println("El ganador de la elecion es Miguel Perez");
            System.out.println("--------------------------------");
        } else if ((Va > Vm && Va > Vr && Va > Vb)) {
            System.out.println("--------------------------------");
            System.out.println("La ganador de la elecion es Ana Murillo");
            System.out.println("--------------------------------");
        } else if ((Vr > Vm && Vr > Va && Vr > Vb)) {
            System.out.println("--------------------------------");
            System.out.println("El ganador de la elecion es Rubi ledezma");
            System.out.println("--------------------------------");
        } else if ((Vb > Vm && Vb > Vr && Vb > Va)) {
            System.out.println("--------------------------------");
            System.out.println("El ganador de la elecion es voto en blanco");
            System.out.println("--------------------------------");
        } else if (Vm > Va && Vm == Vr && Vm > Vb) {
            System.out.println("--------------------------------");
            System.out.println("Empate entre Rubi ledezma y Miguel Perez");
            System.out.println("--------------------------------");
        } else if (Vm == Va && Vm > Vr && Vm > Vb) {
            System.out.println("--------------------------------");
            System.out.println("Empate entre Miguel Perez  y Ana Murillo");
            System.out.println("--------------------------------");
        } else if (Va > Vm && Va == Vr && Va < Vb) {
            System.out.println("--------------------------------");
            System.out.println("Empate entre Ana Murillo y Rubi ledezma");
            System.out.println("--------------------------------");
        }
    }
}
