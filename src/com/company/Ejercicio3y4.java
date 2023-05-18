package com.company;
import java.util.Vector;
public class Ejercicio3y4 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println(vector);
        for(int i = 0; i<vector.size(); i++){
            if (i==2){
                vector.remove(i);
                vector.remove(i);
            }
        }
        System.out.println(vector);
        /**
         * Ejercicio 4: El problema de no ponerle la capacidad del vector es que se dobla la capacidad cuando
         * el tamaño del vector supera a este. Al ponerle 1000 elementos, la capacidad se supera reiteradas veces
         * generando así que el vector tenga una capacidad muy grande y gastando espacio en memoria que no es
         * utilizada.
         *
         */

    }
}
