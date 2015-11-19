/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.categorias;

import java.util.ArrayList;

/**
 *
 * @author formacion
 */
public class Categorias {
    
    private static ArrayList<Categoria> categorias;

    public Categorias(){
        categorias = new ArrayList<Categoria>();
    }
    
    public static ArrayList<Categoria> getCategorias() { //TODAS
        return categorias;
    }
    
    public Categoria buscaCategoria(int id){
        return categorias.get(id);
    }
    
    public void creaCategoria(int id, String nombre){ //POST
        Categoria aux = new Categoria(id, nombre);
        categorias.add(aux);
    }
    
    public void modificaCategoria(int id, String nombre){ //PUT
        Categoria aux = new Categoria(id, nombre);
        categorias.set(id, aux);
    }
    
    public void eliminaCategoria(int id){ //DELETE
        categorias.remove(id);
    }
    
}
