/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import GUI.ModificarItem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarahi
 */
public class Controladora {
    public static ArrayList<Tipo> tipos = new ArrayList();
    public static ArrayList<Item> items = new ArrayList();
    public static ArrayList<Usuario> usuarios = new ArrayList();

    public Controladora() {
    }

    
    public void crearItem(String nombre, String codigo, String descripcion)
    {
        Item it = new Item(nombre, codigo, descripcion);
        items.add(it);
    }
    public void imprimirItem()
    {
        Iterator item = items.iterator();
            while(item.hasNext())
            {
                Object elemento = item.next();
                Item items = (Item) elemento;
                System.out.println(items);
            }
    }
    public void crearTipo(String nombre)
    {
        Tipo t = new Tipo(nombre);
        tipos.add(t);
    }
    public void imprimirTipo()
    {
        Iterator tipo = tipos.iterator();
            while(tipo.hasNext())
            {
                Object elemento = tipo.next();
                Tipo tipos = (Tipo) elemento;
                System.out.println(tipos);
            }
    }

}
