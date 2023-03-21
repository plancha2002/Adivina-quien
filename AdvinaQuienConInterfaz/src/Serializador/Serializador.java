/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Serializador;

import Intefaz.Personajes;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author placha
 */
public class Serializador {
    
    public static void main(String[] args) {
        Personajes[] lista = new Personajes[9];
    
        lista[0] = new Personajes("Fernando Alonso", true, true, true, true, false, true);//bien 
        lista[1] = new Personajes("Lewis Hamilton", true, false, true, true, false, true);//bien 
        lista[2] = new Personajes("Flavio Briatore", true, true, true, true, true, false);//bien 
        lista[3] = new Personajes("Hanna Schmitz", true, true, false, false, false, false);//bien 
        lista[4] = new Personajes("Antonio Lobato", false, true, false, true, false, false);//bien 
        lista[5] = new Personajes("Esteban Mojon", true, true, false, true, false, true);//bien 
        lista[6] = new Personajes("Stephanie Travers", true, false, false, false, true, false);//bien
        lista[7] = new Personajes("Jamie Chadwick", true, true, false, false, true, true);//bien
        lista[8] = new Personajes("Anthony Hamilton", false, false, false, true, true, false);//bie
        
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        
        try{
            fos = new FileOutputStream("Personajes.dat");
            salida = new ObjectOutputStream (fos);
            
            for (int i = 0; i < lista.length; i++) {
                salida.writeObject(lista[i]);
                
            }
        }catch (IOException e){
            System.out.println("Error 1: "+ e.toString());
        }finally{
            try{
                salida.close();
                fos.close();
            }catch(IOException e){
                System.out.println("error: "+ e.toString());
            }
        }
    }
    
}
