/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.categorias;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author formacion
 */
public class CategoriasController {

    @RequestMapping("/categorias")
    public Categoria categoria(@RequestParam(value="nombre", defaultValue="Deportes") String nombre,
            @RequestParam(value="id", defaultValue="2") int id) {
        return new Categoria(id, nombre);
    }
    
}
