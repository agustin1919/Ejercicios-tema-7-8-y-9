package com.company;

import java.io.*;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Ejercicio8 {
    public static void main(String[] args) {

    }
    public static void copyFile(String fileIn, String fileOut){
        try{
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
        } catch(FileNotFoundException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        } catch(IOException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
