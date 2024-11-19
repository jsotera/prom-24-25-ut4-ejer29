package es.masanz.ut4;

import es.masanz.ut4.util.ColoresConsola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        while(!nombre.equals("NULL")){
            System.out.println("------------------------------------------------");
            System.out.printf("| %-17s", "JUGADOR");
            System.out.printf(" | %11s", "PUNTUACION");
            System.out.printf(" | %-10s |", "RANGO");
            System.out.println();
            System.out.println("------------------------------------------------");
            int num = (int) (Math.random() * 201);
            System.out.printf("| %-17s", nombre);
            System.out.printf(" | %11d", num);
            if(num <= 50){
                System.out.printf(" | "+ColoresConsola.ROJO+"%-10s"+ColoresConsola.RESET+" |", "ROJO");
            } else if (num <= 100) {
                System.out.printf(" | "+ColoresConsola.AMARILLO+"%-10s"+ColoresConsola.RESET+" |", "AMARILLO");
            } else {
                System.out.printf(" | "+ColoresConsola.VERDE+"%-10s"+ColoresConsola.RESET+" |", "VERDE");
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("INTRODUCE UN NOMBRE: ");
            nombre = scanner.next();
            System.out.println();
            System.out.println();
            System.out.println();
        }


    }
}