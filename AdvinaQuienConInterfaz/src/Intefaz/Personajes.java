/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intefaz;

import java.awt.font.TextAttribute;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author eplan
 */
public class Personajes implements Serializable {

    //atributos relacionados con 
    boolean[] opcion = new boolean[6];

    //atributos de personaje
    private static final long serialVersionUID=1L;
    private String nombre;
    private boolean pelo;//tiene pelo o tiene cabeza pulida
    private boolean pielClara;
    private boolean barba;//tiene o no tiene barba
    private boolean esHombre;
    private boolean gafas;//true para si false para no
    private boolean piloto;

    public Personajes() {

    }

    /**
     * @param nombre nombre del personaje
     * @param pelo tiene pelo o no
     * @param pielClara piel clara o oscura
     * @param barba tiene barba o no
     * @param esHombre es hombre o no
     * @param gafas tiene o no gafa
     * @param piloto es piloto de f1 o no
     */
    //incio constructor 
    public Personajes(String nombre, boolean pelo, boolean pielClara, boolean barba, boolean esHombre, boolean gafas, boolean piloto) {

        this.nombre = nombre;

        //inicia pelo
        this.pelo = pelo;
        //fin

        //asignamos piel
        this.pielClara = pielClara;
        //fin piel

        //inica barba
        this.barba = barba;
        //fin

        //asignamos sexo
        this.esHombre = esHombre;
        //fin sexo

        //inicio gafas
        this.gafas = gafas;
        //fin

        //inicio piloto
        this.piloto = piloto;
        //fin piloto

        opcion[0] = true;
        opcion[1] = true;
        opcion[2] = true;
        opcion[3] = true;
        opcion[4] = true;
        opcion[5] = true;

    }//fin constructor

    //inicio se seters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBarba(boolean barba) {
        this.barba = barba;
    }

    public void setGafas(boolean gafas) {
        this.gafas = gafas;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    public void setPielClara(boolean pielClara) {
        this.pielClara = pielClara;
    }

    public void setEsHombre(boolean esHombre) {
        this.esHombre = esHombre;
    }

    public void setPiloto(boolean piloto) {
        this.piloto = piloto;
    }

    //fin setters
    //inico getters
    public String getNombre() {
        return nombre;
    }

    public boolean isPelo() {
        return pelo;
    }

    public boolean isBarba() {
        return barba;
    }

    public boolean isGafas() {
        return gafas;
    }

    public boolean isPielClara() {
        return pielClara;
    }

    public boolean isEsHombre() {
        return esHombre;
    }

    public boolean isPiloto() {
        return piloto;
    }

    public String getSexoTexto() {

        if (esHombre) {

            return "El personaje es mujer";

        } else if (!esHombre) {
            return "El personaje es hombre";
        } else {
            return "No se a podido determinar el sexo del personaje";
        }

    }

    public String getPielTexto() {

        if (pielClara) {

            return "El Persoje es de piel clara";

        } else if (!pielClara) {

            return "El personaje tiene la piel oscura";

        } else {
            return "No se a podido determinar el color de la piel";
        }

    }

    //fin getters
    //METODOS
    //
    //
    public void pregunta() {
        Scanner input = new Scanner(System.in);

    }

    /**
     *
     * @param a[], oidiendo el array donde se almacenan y mostrarlos todos
     * @return Una lista de los personajes
     */
    public static Personajes listaP(Personajes[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getNombre());
        }

        return a[1];
    }

    public void eliminado(Personajes a) {

        String temp = "(" + a.getNombre() + ")";

        a.setNombre(temp);

    }

    /**
     * @param maq sera el que de la maquina
     * @param usu sera el cree el usuario que es
     */
    public Boolean comparaNombre(String usu) {

        if (getNombre().equalsIgnoreCase(usu)) {

            
            return true;

        } else {
            
            return false;
        }

    }
    
    

    public Boolean respuesta(int input){

        switch (input) {
            case 1:
                    if (pelo) {
                       
                        return true;
                    } else if (!pelo) {
                        
                        return false;
                    }
               
                break;
            case 2:
                
                if (pielClara) {
                       
                        return true;
                    } else if (!pielClara) {
                        
                        return false;
                    }
                
                break;
            case 3:
                if (barba) {
                       
                        return true;
                    } else if (!barba) {
                        
                        return false;
                    }
                break;
            case 4:
                if (esHombre) {
                       
                        return true;
                    } else if (!esHombre) {
                        
                        return false;
                    }
                break;
            case 5:
                if (gafas) {
                       
                        return true;
                    } else if (!gafas) {
                        
                        return false;
                    }
                break;
            case 6:
                if (piloto) {
                       
                        return true;
                    } else if (!piloto) {
                        
                        return false;
                    }
                break;
            default:
               
                break;
        }
        return null;

    }

    

}
