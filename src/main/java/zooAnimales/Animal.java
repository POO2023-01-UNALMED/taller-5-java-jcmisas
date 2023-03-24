package zooAnimales;

import java.util.ArrayList;

import gestion.*;

public class Animal {
    
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
    private static int m, p, r, a, an;

    public Animal(String nombre, int edad, String habitat, String genero){

        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        totalAnimales++;

    }
    public Animal(){


    }

    public String getNombre(){
        
        return nombre;
    }

    public int getEdad(){
        
        return edad;
    }

    public String getHabitat(){
        
        return habitat;
    }

    public String getGenero(){
        
        return genero;
    }

    public void setNombre(String nombre){

        this.nombre=nombre;
    }

    public void setEdad(int edad){

        this.edad=edad;
    }

    public void setHabitat(String habitat){

        this.habitat=habitat;
    }

    public void setGenero(String genero){

        this.genero=genero;
    }

    public int totalAnimales(){

        return totalAnimales;
    }

    public String movimiento(){

        return "desplazarse";

    }

    public static void totalAnimales(Object o){
        totalAnimales++;
        switch(o.getClass().getSimpleName()){
            case("Mamifero"):
                m++;
                break;
            case("Pez"):
                p++;
                break;
            case("Reptil"):
                r++;
                break;
            case("Anfibio"):
                an++;
                break;
            case("Ave"):
                a++;
                break;
            
            
        }


    }

    public static String totalPorTipo(){

        return "Mamiferos: " + m +"\nAves: " + a + "\nReptiles: " + r + "\nPeces: " + p + "\nAnfibios: " + an;
    }

    public String toString(){
        
        return zona==null?"Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero:"Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + 
        ", la zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoo();

    }
}