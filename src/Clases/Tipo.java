/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Tipo {
    private String nombre;
    private ArrayList<Item> items = new ArrayList();
    
    
    public Tipo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarItem(Item item)
    {
        items.add(item);
    }
     public String toString() {
        String result;
        result = "Tipo "+ "\n Nombre: " + nombre;
        
        System.out.println("_______________\n");
        return result;
    }
}
