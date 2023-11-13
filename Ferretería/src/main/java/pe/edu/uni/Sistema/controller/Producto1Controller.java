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
import pe.edu.uni.Sistema.dtorest.RespuestaProducto1;
import pe.edu.uni.Sistema.service.Producto1Service;

@RestController
@CrossOrigin(origins = {"*"})
public class Producto1Controller {
    @Autowired
    private Producto1Service service;

    @RequestMapping(
            value="/obtenerProducto1",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public RespuestaProducto1 obtenerProducto1(){
        RespuestaProducto1 rpta = new RespuestaProducto1(service.obtenerProducto1());
        return rpta;
    }


}

