package com.company;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            System.out.println(dividePorCero(1, 0));
        } catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse" + e.getMessage());
        }
    }
    public static double dividePorCero(double a, double b) throws ArithmeticException{
        return a/b;
    }
}
