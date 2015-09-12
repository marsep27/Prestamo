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
public class Item {
    private String nombre;
    private String codigo;
    private String descripcion;
    private ArrayList<Categoria> categorias = new ArrayList();
    private ArrayList<Tipo> tipos = new ArrayList();
    
    public Item(String nombre, String codigo, String descripcion){
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String toString() {
        String result;
        result = "Item "+ "\n Nombre: " + nombre + "\n Codigo: " + codigo + "\nDescripción: " + descripcion;
        System.out.println("_______________\n");
        return result;
    }
    
}
