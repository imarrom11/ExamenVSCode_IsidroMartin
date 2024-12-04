package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura     = new Scanner(System.in);
        double valor1          = -1;
        double valor2          = -1;
        String operacion    = "null";
        boolean exit        = false;

        System.out.println("Calculadora");
        System.out.println("------------------");

        do{
            System.out.print("Introduce la operacion(+, -, *, /, salir): ");
            operacion = lectura.nextLine();

            switch(operacion){
                case "+":
                    System.out.print("Introduce el primer valor: ");
                    valor1 = Integer.parseInt(lectura.nextLine());

                    System.out.print("Introduce el segundo valor: ");
                    valor2 = Integer.parseInt(lectura.nextLine());

                    System.out.println("El resultado de " + valor1 + " más " + valor2 + " es: " + (valor1+valor2));
                    break;
                case "-":
                    System.out.print("Introduce el primer valor: ");
                    valor1 = Integer.parseInt(lectura.nextLine());

                    System.out.print("Introduce el segundo valor: ");
                    valor2 = Integer.parseInt(lectura.nextLine());

                    System.out.println("El resultado de " + valor1 + " menos " + valor2 + " es: " + (valor1-valor2));
                    break;
                case "*":
                    System.out.print("Introduce el primer valor: ");
                    valor1 = Integer.parseInt(lectura.nextLine());

                    System.out.print("Introduce el segundo valor: ");
                    valor2 = Integer.parseInt(lectura.nextLine());

                    System.out.println("El resultado de " + valor1 + " por " + valor2 + " es: " + (valor1*valor2));
                    break;
                case "/":
                    System.out.print("Introduce el primer valor: ");
                    valor1 = Integer.parseInt(lectura.nextLine());

                    System.out.print("Introduce el segundo valor: ");
                    valor2 = Integer.parseInt(lectura.nextLine());

                    System.out.println("El resultado de " + valor1 + " entre " + valor2 + " es: " + (valor1/valor2));
                    break;
                case "salir":
                    exit = true;
                    break;
                default:
                    System.out.println("Operacion erronea");
                    break;
            }
        } while (exit == false);
        
        System.out.println("Hasta otro dia!");
        lectura.close();
    }
}