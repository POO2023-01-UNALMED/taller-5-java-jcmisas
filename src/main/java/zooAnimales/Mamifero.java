package zooAnimales;

import java.util.ArrayList;

import gestion.*;

public class Mamifero extends Animal {

    private ArrayList<Mamifero> listado=new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        
        super(nombre,edad,habitat,genero);
        this.pelaje=pelaje;
        this.patas=patas;
        listado.add(this);
        Animal.totalAnimales(this);
    }

    public Mamifero(){

        listado.add(this);
        Animal.totalAnimales(this);
    }

    public boolean isPelaje(){

        return pelaje;
    }

    public int getPatas(){

        return patas;
    }

    public void cantidadMamiferos(){

        System.out.println(listado.size());
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos++;
        return new Mamifero(nombre,edad,"pradera",genero,true,4);
        
    }

    public static Mamifero crearLeon(String nombre,int edad,String genero){
        leones++;
        return new Mamifero(nombre,edad,"selva",genero,true,4);

    }
}
