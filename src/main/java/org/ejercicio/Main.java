package org.ejercicio;

public class Main {
    public static void main(String[] args) {

       int numeroIf = 3;

       if(numeroIf == 0 ){
           System.out.println("Es un 0");
       } else if(numeroIf <= 0) {
           System.out.println("Es un número negativo");
       } else {
           System.out.print("Es un número positivo");
       }

       int numeroWhile = 0;

       while(numeroWhile < 3){

            System.out.println(numeroWhile);

            numeroWhile++;

       }

       do{

           System.out.println(numeroWhile);

           numeroWhile++;

       } while(numeroWhile < 3);

       for(int numeroFor = 0; numeroFor <= 3; numeroFor++){

           System.out.println("ejecutando for");

        }

       String estacion = "otoño";

       switch (estacion){
           case "verano":
               System.out.println("Es verano");
               break;
           case "otoño":
               System.out.println("Es otoño");
               break;
           case "invierno":
               System.out.println("Es invierno");
               break;
           case "primavera":
               System.out.println("Es primavera");
               break;
           default:
               System.out.println("Estoy en default");
       }

    }
}