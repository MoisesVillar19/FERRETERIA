/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uni.Sistema.dtorest.RespuestaCategoria;
import pe.edu.uni.Sistema.service.CategoriaService;

@RestController
@CrossOrigin(origins = {"*"})
public class CategoriaController {
    @Autowired
    private CategoriaService service;

    @RequestMapping(
            value="/obtenerCategorias",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public RespuestaCategoria obtenerCategorias(){
        RespuestaCategoria rpta = new RespuestaCategoria(service.obtenerCategorias());
        return rpta;
    }


}

