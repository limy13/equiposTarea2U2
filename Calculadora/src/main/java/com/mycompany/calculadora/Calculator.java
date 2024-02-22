
package com.mycompany.calculadora;


public class Calculator {
    double valorUno, valorDos;
    
    public Calculator (double valorUno, double valorDos){
    this.valorUno = valorUno;
    this.valorDos = valorDos;
    
}
    
    double suma(){
        double resultado = valorUno + valorDos;
        return resultado;   
    }
    
    double resta(){
        double resultado = valorUno - valorDos;
        return resultado;
    }
    
    double multiplicacion(){
        double resultado = valorUno * valorDos;
        return resultado;
    }
    
    double division(){
        double resultado = valorUno/valorDos;
        return resultado;
    }
    
    String principal(){
        double suma = valorUno + valorDos;
        double resta = valorUno - valorDos;
        double multiplicacion = valorUno * valorDos;
        double division = valorUno/valorDos;
        
        String data = String.format("Suma: %f \n Resta: %f \n Multiplicacion: %f \n Division: %f \n", 
                suma, resta, multiplicacion, division);
        
        return data; 
        
    }
    
}
