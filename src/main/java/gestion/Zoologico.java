package gestion;

import java.util.ArrayList;

public class Zoologico {
    
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas=new ArrayList<Zona>();

    public Zoologico(String nombre, String ubicacion){

        this.nombre=nombre;
        this.ubicacion=ubicacion;
    }

    public Zoologico(){
        
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public ArrayList<Zona> getZona(){

        return zonas;
    }

    public void agregarZonas(Zona zona){

        zonas.add(zona);
    }

    public int cantidadTotalAnimales(){

        int c=0;
        for(Zona zona: zonas){

            c+=zona.cantidadAnimales();
        }

        return c;
    }
}
