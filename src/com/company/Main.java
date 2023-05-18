package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("hola mundo"));
    }
    public static String reverse(String texto) {
        String cadena = "";
        for(int i = texto.length()-1; i>=0; i--){
            cadena+=texto.charAt(i);

        }
        return cadena;
    }
}
