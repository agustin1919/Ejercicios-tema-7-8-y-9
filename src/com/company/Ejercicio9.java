package com.company;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio9 {
    public static void main(String[]args){
        escribir();
        try {
            InputStream in = new FileInputStream("datos.txt");

            int dato;
            do {
                dato = in.read();
                if(dato != -1){
                    System.out.println(dato);
                }else{
                    System.out.println("Fin");
                }
            } while (dato != -1);


        }catch(FileNotFoundException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }catch(IOException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public static void escribir(){
        try {
            PrintStream out = new PrintStream(new FileOutputStream("datos.txt"));

            ArrayList<Integer> numbers = new ArrayList<>();
            for(int i = 0; i<10; i++){
                numbers.add(i);
            }
            for(int i=0; i<numbers.size();i++){
                out.write(i);
            }
            out.close();

        }catch(FileNotFoundException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }catch(IOException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
