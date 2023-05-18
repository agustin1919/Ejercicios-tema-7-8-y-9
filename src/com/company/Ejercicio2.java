package com.company;

public class Ejercicio2 {
    public static void main(String[] args) {
        int [][] numeros = new int[][]{
                {10,20,30,40,50},
                {60,70,80,90,100}
        };
        for(int i= 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                System.out.println(numeros[i][j]);
            }
        }
    }
}
