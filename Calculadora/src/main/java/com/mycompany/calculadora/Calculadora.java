

package com.mycompany.calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa primer número");
        double x = leer.nextDouble();
        System.out.println("Ingresa segundo número");
        double y = leer.nextDouble();
        
        Calculator calculadora = new Calculator (x, y);
        System.out.println(calculadora.valorUno);
        System.out.println(calculadora.valorDos);
        double sumaFinal = calculadora.suma();
        System.out.println("Suma: " + sumaFinal);
        
        double restaFinal = calculadora.resta();
        System.out.println("Resta: " + restaFinal);
        
        double multiplicacionFinal = calculadora.multiplicacion();
        System.out.println("Mulltiplicación: " + multiplicacionFinal);
        
        double divisionFinal = calculadora.division();
        System.out.println("Division: " + divisionFinal);
        
        System.out.println("**********");
        System.out.println(calculadora.principal());
   
    }
}
