/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servidorjavacategoria;

import java.util.ArrayList;


/**
 *
 * @author rafa
 */
public class AuxiliarController {
    
    public static Categoria getCategoriaById(int id){
        
        for(Categoria c : ServerController.getListaCategorias()){
            if(c.getId()!= -1 && c.getId() == id)
               return c;
        }
        return null;
    }
    
    public static Categoria getCategoriaByName(String name){
        
        for(Categoria c : ServerController.getListaCategorias()){
            if(c.getName()!= null && c.getName().equals(name))
               return c;
        }
        return null;
    }
    
    public static int setCategoria(Categoria categoria){
        try{
            for(int i = 0; i < ServerController.getListaCategorias().size(); i++){
            if(ServerController.getListaCategorias().get(i).getId() == categoria.getId()){
               ServerController.getListaCategorias().set(i, categoria);
               return 200;
            }
        } 
            return 200;
        }catch(Exception e){
            return 500;
        }
    }
    
    public static int addCategoria(Categoria categoria){
        try{
            categoria.setId(ServerController.getListaCategorias().size()+2);
            ServerController.getListaCategorias().add(categoria);
            return 200;
        }catch(Exception e){
            return 500;
        }
    }
    
    public static int deleteCategoria(int id){
      
        for(int i = 0; i < ServerController.getListaCategorias().size(); i++){
            if(ServerController.getListaCategorias().get(i).getId() != -1 
                    && ServerController.getListaCategorias().get(i).getId() == id){
               ServerController.getListaCategorias().remove(id-1);
               return 200;
            }
        }  
        return 404;
    }
}
