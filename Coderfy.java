/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coderfy;

import java.util.Scanner;

/**
 *
 * @author devxa
 */
public class Coderfy {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //SWITCH BASICO
//        int dia=10;
//        switch(dia){
//            case 1 -> System.out.println("Lunes");
//            case 2 -> System.out.println("Martes");
//            case 3 -> System.out.println("Miercoles");
//            case 4 -> System.out.println("Jueves");
//            case 5 -> System.out.println("Viernes");
//            case 6 -> System.out.println("Sabado");
//            case 7 -> System.out.println("Domingo");
//            default -> System.out.println("No existe el dia");
//        }
//        
//        //CALCULADORA BASICA
//        char op='/';
//        double num1=10;
//        double num2=10;
//        switch(op){
//            case '+' -> System.out.println((num1+num2));
//            case '-' -> System.out.println((num1-num2));
//            case '*' -> System.out.println((num1*num2));
//            case '/' -> { 
//                if(num2!=0)System.out.println((num1/num2));
//                else System.out.println("El segundo numero debe ser diferente de 0");
//            }
//            default -> System.out.println("La operacion no existe");
//        }
//        
//        //MAYOR MENOR
//        System.out.println("Ingresa 3 numeros");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        
//        System.out.println("El mayor es: " + Math.max(a, Math.max(b, c)));
//        System.out.println("El menor es: " + Math.min(a, Math.min(b, c)));
//        
//        //PAR O IMPAR
//        System.out.println("Ingresa un numero");
//        int v=sc.nextInt();
//        System.out.println(v%2==0 ? "Es par" : "Es impar");
//        
//        //TABLA DE MULTIPLICAR
//        System.out.println("Ingrea un numero");
//        int t=sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(t+" * " + i + " = " + (t*i));
//        }
        //CALCULADORA DE PROPINA
//        System.out.println("Ingresa el total y la propina");
//        double total=sc.nextDouble();
//        double propina=(total*sc.nextDouble())/100;
//        double res=total+propina;
//        System.out.println(res);

        //Numero primo
//        System.out.println("Escribe un numero");
//        int primo = sc.nextInt();
//        if (primo <= 1) {
//            System.out.println("No es primo");
//        } else {
//            for (int i = 2; i <= Math.sqrt(primo); i++) {
//                if (primo % i == 0) {
//                    System.out.println("No es primo");
//                }else{
//                    System.out.println("Es primo");
//                }
//            }
//        }

        //CONVERTIDOR DE CALIFICACIONES
        int calif=sc.nextInt();
        if(calif<60) System.out.println("Tu calificacion es: F");
        else if(calif>=60 && calif <=69) System.out.println("Tu calificacion es: D");
        else if(calif>=70 && calif <=79) System.out.println("Tu calificacion es: C");
        else if(calif>=80 && calif <=89) System.out.println("Tu calificacion es: B");
        else if(calif>=90 && calif <=100) System.out.println("Tu calificacion es: A");
    }
}
