/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coderfy;
//Importación de la libreria Scanner
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Creación de un objeto Scanner
        Scanner sc=new Scanner(System.in);
        
        //Solicitar los dos numeros
        System.out.println("Ingresa dos numeros");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        
        //Solicitar el caracter
        System.out.println("Ingresa el caracter de la operacion a usar");
        char c=sc.next().charAt(0); //Obtiene una cadena y en caso de ser mayor a 1 en tamaño, se tomara el primer caracter
        
        /*
          Revision de caracter y procedimiento correspondiente
          Se usa el switch expresivo para ahorrar lineas de codigo y hacerlo mas entendible.  
        */
        switch(c){
            case '+' -> System.out.println("La suma es: " + (num1+num2));
            case '-' -> System.out.println("La resta es: " + (num1-num2));
            case '*' -> System.out.println("La multiplicacion es: " + (num1*num2));
            case '/' -> { 
                if(num2!=0)System.out.println("La division es: " + (num1/num2));
                else System.out.println("No es posible hacer la division");
            }
            default -> System.out.println("Ese caracter no existe");
        }
    }
}
