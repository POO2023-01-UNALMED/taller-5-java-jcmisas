package zooAnimales;

import java.util.ArrayList;

import gestion.*;

public class Ave extends Animal {
    
    private ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas){

        super(nombre,edad,habitat,genero);
        this.colorPlumas=colorPlumas;
        listado.add(this);
        Animal.totalAnimales(this);
    }

    public Ave(){

        listado.add(this);
        Animal.totalAnimales(this);

    }

    public void cantidadAves(){

    }

    public String getColorPlumas(){

        return colorPlumas;
    }


    public String movimiento(){

        return "volar";
    }

    public static Ave crearHalcon(String nombre,int edad,String genero){
        halcones++;
        return new Ave(nombre,edad,"montanas",genero,"color glorioso");
    }

    public static Ave crearAguila(String nombre,int edad,String genero){
        aguilas++;
        return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
    }



}
