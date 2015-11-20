/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servidorjavacategoria;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author rafa
 */

@RestController
public class ServerController {
    
    private static ArrayList<Categoria> listaCategorias = new ArrayList<>();

    /**
     * @return the listaCategorias
     */
    public static ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    /**
     * @param aListaCategorias the listaCategorias to set
     */
    public static void setListaCategorias(ArrayList<Categoria> aListaCategorias) {
        listaCategorias = aListaCategorias;
    }
    
    /* -------------------- Inicio de los GET ---------------------------------*/
    
    @RequestMapping(path = "/getAllCategorias", method = {RequestMethod.GET})
    public ArrayList<Categoria> categoria(){
        return getListaCategorias();
    }
    
    @RequestMapping(path = "/getCategoriasbyId", method = {RequestMethod.GET})
    public Categoria getCategoriaById(@RequestParam(value="id_categoria", defaultValue = "-1") int idCategoria){
        return AuxiliarController.getCategoriaById(idCategoria);
    }
    
    @RequestMapping(path = "/getCategoriasbyName", method = {RequestMethod.GET})
    public Categoria getCategoriaByName(@RequestParam(value="name_categoria", defaultValue = "-1") String nameCategoria){
        return AuxiliarController.getCategoriaByName(nameCategoria);
    }
    
    /* ----------------------- Fin de los GET ---------------------------------*/
    
    /* -------------------- Inicio de los POST ---------------------------------*/
    
    @RequestMapping(path = "/addCategoria", method = {RequestMethod.POST})
    public int addCategoria(@RequestBody Categoria categoria){
        return AuxiliarController.addCategoria(categoria);
    }
    
    /* -------------------- Fin de los POST ---------------------------------*/
    
    /* -------------------- Inicio de los PUT ---------------------------------*/
    
    @RequestMapping(path = "/setCategoria", method = {RequestMethod.PUT})
    public int setCategoria(@RequestBody Categoria categoria){
        return AuxiliarController.setCategoria(categoria);
    }
    
    /* -------------------- Fin de los PUT ---------------------------------*/
    
    /* -------------------- Inicio de los DELETE ---------------------------------*/
    
    @RequestMapping(path = "/deleteCategoria", method = {RequestMethod.DELETE})
    public int deleteCategoria(@RequestParam(value="id_categoria", defaultValue = "-1") int idCategoria){
        return AuxiliarController.deleteCategoria(idCategoria);
    }
    
    /* -------------------- Fin de los DELETE ---------------------------------*/
    
    
}
