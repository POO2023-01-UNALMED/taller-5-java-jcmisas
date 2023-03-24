package zooAnimales;

import java.util.ArrayList;

import gestion.*;

public class Reptil extends Animal {

    private ArrayList<Reptil> listado=new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas,int largoCola){

        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        listado.add(this);
        Animal.totalAnimales(this);

    }

    public Reptil(){
        listado.add(this);
        Animal.totalAnimales(this);
    }

    public String getColorEscamas(){

        return colorEscamas;
    }

    public int getLargoCola(){

        return largoCola;
    }

    public void cantidadReptiles(){

        System.out.println(listado.size());
    }

    public String movimiento(){

        return "reptar";
    }

    public static Reptil crearIguana(String nombre,int edad,String genero){
        iguanas++;
        return new Reptil(nombre,edad,"humedal",genero,"verde",3);
    }

    public static Reptil crearSerpiente(String nombre,int edad,String genero){
        serpientes++;
        return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
    }
}
