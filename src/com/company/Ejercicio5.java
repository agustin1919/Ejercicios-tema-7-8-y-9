package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("--------------ArrayList--------------");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Martin");
        lista.add("Franco");
        lista.add("Fernando");
        lista.add("Marcelo");

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("--------------LinkedList--------------");
        LinkedList<String> linkedList = new LinkedList<>(lista);

        for (int i = 0; i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
    }
}
