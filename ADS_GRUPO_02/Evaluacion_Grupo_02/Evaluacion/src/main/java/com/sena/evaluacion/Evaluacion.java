
package com.sena.evaluacion;
import java.util.Scanner;

public class Evaluacion {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       /*1. Diseña un programa que controle la entrada de personas a un evento. El
sistema debe pedir el nombre y la edad del asistente. Solo podrán ingresar
las personas mayores de 18 años. El programa debe preguntar si desea
registrar a otra persona y continuar mientras el usuario responda "sí". Al
finalizar, muestra cuántas personas fueron aceptadas y cuántas fueron
rechazadas.*//*
       int eda, ace=0, rech=0;
       String nom, reg, ter="";
       do{
           System.out.println("Ingrese el nombre: ");
           nom=sc.nextLine();
           System.out.println("Ingrese la edad: ");
           eda=sc.nextInt();
           if(eda>=18){
             ace++;  
           }else if(eda<18){
               rech++;
               break;
           }else{
               System.out.println("Dato edad incorrecto");
           }
           sc.nextLine();
           System.out.println("¿Desea Registrar otra persona?: ");
           reg=sc.nextLine();
           if(reg.equalsIgnoreCase("No")){
           System.out.println("Desea terminar el programa: ");
           ter=sc.nextLine();   
           }
           
          
       }while(!ter.equalsIgnoreCase("Si"));
        System.out.println("Aceptados: "+ ace);
        System.out.println("Rechazados: "+ rech);
        *//*2. Crea un programa que permita calcular la propina de varios clientes en un
restaurante. Por cada cliente, se debe ingresar el valor de la cuenta y el
porcentaje de propina que desea dejar. El programa debe calcular y mostrar
la propina individual. Al final, muestra el total de propinas recolectadas
durante el turno.*//*
        int vlcu, por, mult, sum=0;
        float div;
        String fin="";
        while(!fin.equalsIgnoreCase("No")){
            System.out.println("Ingrese valor de la cuenta: ");
            vlcu=sc.nextInt();
            System.out.println("Ingrese el porcentaje que desea dejar: ");
            por=sc.nextInt();
            sc.nextLine();
            mult=vlcu*por;
            div=mult/100;
            sum+=div;
            System.out.println("El valor de su propina es "+div);
            System.out.println("Desea continuar con otra propina?");
            fin=sc.nextLine();
            
            
            
        }
        System.out.println("El total de las propinas son: "+ sum);
*//*3. Desarrolla un programa que simule el funcionamiento de un cajero
automático. Debe iniciar con un saldo inicial definido y mostrar un menú con
las opciones: consultar saldo, consignar dinero, retirar dinero o salir.
*//*
        int saldo=100000, ope, res, opc, caso2, caso3;
        do{
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Consignar dinero.");
            System.out.println("3. Retirar dinero.");
            System.out.println("4. Salir.");
            System.out.println("Seleccionar una opcion: ");
            opc=sc.nextInt();
              ope=saldo+0;
              res=ope+0;
            switch(opc){
                case 1:
                    System.out.println("Su saldo es "+ saldo);
                    break;
                case 2:
                    System.out.println("Ingrese cuanto va a consignar: ");
                    caso2=sc.nextInt();
                    ope+=caso2;
                    System.out.println("Su nuevo saldo es "+ ope);
                    break;
                case 3: 
                    System.out.println("Ingrese cuanto va a retirar: " );
                    caso3=sc.nextInt();
                    res-=caso3;
                    System.out.println("Su nuevo saldo es "+ res);
                    break;
                case 4:
                     System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }while(opc!=4);
            *//*4. Desarrolla un programa que simule una votación entre tres candidatos.
Debe mostrar un menú con los nombres de los candidatos y permitir registrar votos
por cada uno. Después de cada voto, el programa preguntará si desea registrar
otro. Al finalizar, mostrará el total de votos de cada candidato y el ganador de la
elección.*/
            int cand, B=0, E=0, Y=0, Bl=0, pri, seg, ter, cuar;
            String fin="";
            while(!fin.equalsIgnoreCase("No")){
                System.out.println("Usted desea votar: "); 
                fin=sc.nextLine();
                
                if(fin.equalsIgnoreCase("No")){
                    break;
                }
                System.out.println("===Candidatos===");
                System.out.println("1. Brayan.");
                System.out.println("2. Elisa.");
                System.out.println("3. Yojan.");
                System.out.println("4. Blanco");
                System.out.println("Ingrese el numero de la persona que quiere elegir: ");
                cand=sc.nextInt();
                sc.nextLine();
                if(cand==1){
                    System.out.println("Usted eligio al candidato Brayan");
                    B++;
                }else if(cand==2){
                    System.out.println("Usted eligio al candidato Elisa");
                    E++;
                } else if(cand==3){
                    System.out.println("Ustde eligio al candidato Yojan");
                    Y++;
                }else if (cand==4){
                    System.out.println("Usted voto en blanco");
                    Bl++;
                }
                    
            }
             System.out.println("==Resultados de las votaciones==");
            System.out.println("Brayan tiene "+B);
            System.out.println("Elisa "+E);
            System.out.println("Yojan "+Y);
            System.out.println("Voto en blanco "+Bl);
            
            if(B>E & E>Y & Y>Bl){
                pri=B;
                seg=E;
                ter=Y;
                cuar=Bl;
                System.out.println("El ganador de la eleccion es Brayan");
            }else if(E>B & B>Y & Y>Bl){
                pri=E;
                seg=B;
                ter=Y;
                cuar=Bl;
                System.out.println("El ganador de la eleccion es Elias");
            }else if(Y>E & E>B & B>Bl){
                pri=Y;
                seg=E;
                ter=B;
                cuar=Bl;
                System.out.println("El ganador de la eleccion es Yojan");
            }else if(B==E & E==Bl ){
                if(Y>B){
                    System.out.println("El ganador de la eleccion es Yojan");
                }
                
            }else if(E==Y & Y==Bl){
                if(B>Y){
                    System.out.println("El ganador es Brayan");
                }
            }else if(B==Y & B==Bl){
                if(E>B){
                    System.out.println("El ganador de la eleccion es Elias");
                }
            }else if(B==Y & Y==E){
                if(Bl>Y){
                    System.out.println("El voto en blanco es el ganador de la eleccion");
                }
                
            }
           
       
            
    }
}
