/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.clientecategorias;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Cliente implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Cliente.class);

    public static void main(String args[]) {
        SpringApplication.run(Cliente.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Cat c = restTemplate.getForObject("http://1.0.195.0:8080/getCategoriasbyId?id_categoria=2", Cat.class);
        //System.out.println("Tras conexión");
        //System.out.println(c.getId() + " " + c.getName());
        log.info(c.getId() + " " + c.getName());
        //log.info(Categoria.toString());
    }
    
}
