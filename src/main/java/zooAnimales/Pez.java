package zooAnimales;

import java.util.ArrayList;

import gestion.*;

public class Pez extends Animal{
    
    private ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas){

        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        listado.add(this);
        Animal.totalAnimales(this);
    }

    public Pez(){
        listado.add(this);
        Animal.totalAnimales(this);
    }

    public String getColorEscamas(){

        return colorEscamas;
    }

    public int getCantidadAletas(){

        return cantidadAletas;
    }

    public void cantidadPeces(){

        System.out.println(listado.size());
    }

    public String movimiento(){
        
        return "nadar";
    }

    public static Pez crearSalmon(String nombre,int edad,String genero){
        salmones++;
        return new Pez(nombre,edad,"oceano",genero,"rojo",6);
    }

    public static Pez crearBacalao(String nombre,int edad,String genero){
        bacalaos++;
        return new Pez(nombre,edad,"oceano",genero,"gris",6);
    }

}
