/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servidorjavacategoria;

/**
 *
 * @author rafa
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aplicacion {

    public static void main(String[] args) {
        ServerController.getListaCategorias().add(new Categoria(1, "Baloncesto"));
        ServerController.getListaCategorias().add(new Categoria(2, "Ciclismo"));
        ServerController.getListaCategorias().add(new Categoria(3, "Tenis"));
        ServerController.getListaCategorias().add(new Categoria(4, "Frontón"));
        ServerController.getListaCategorias().add(new Categoria(5, "Correr"));
        ServerController.getListaCategorias().add(new Categoria(6, "Natación"));
        SpringApplication.run(Aplicacion.class, args);
    }
}
