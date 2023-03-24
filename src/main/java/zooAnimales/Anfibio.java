package zooAnimales;

import java.util.ArrayList;

import gestion.*;

public class Anfibio extends Animal{
    
    private ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){

        super(nombre,edad,habitat,genero);
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
    }

    public Anfibio(){

    }

    public String getColorPiel(){

        return colorPiel;
    }

    public boolean isVenenoso(){

        return venenoso;
    }

    public void cantidadAnfibios(){
        System.out.println(listado.size());
    }

    public String movimiento(){

        return "saltar";
    }

    public static Anfibio crearRana(String nombre,int edad,String genero){
        ranas++;
        return new Anfibio(nombre, edad,"selva",genero, "rojo",true);
    }

    public static Anfibio crearSalamandra(String nombre,int edad,String genero){
        salamandras++;
        return new Anfibio(nombre, edad,"selva",genero, "negro y amarillo",false);
    }
}
