package com.company;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] nombres = {"Facundo", "Paz", "Leandro", "Giuliano", "Zoe"};

        //For
        System.out.println("------------------For------------------");
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        // For Each
        System.out.println("------------------For Each------------------");
        for(String nombre : nombres){
            System.out.println(nombre);
        }
    }
}
