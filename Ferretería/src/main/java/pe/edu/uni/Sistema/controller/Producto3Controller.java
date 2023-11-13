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
import pe.edu.uni.Sistema.dtorest.RespuestaProducto3;
import pe.edu.uni.Sistema.service.Producto3Service;

@RestController
@CrossOrigin(origins = {"*"})
public class Producto3Controller {
    @Autowired
    private Producto3Service service;

    @RequestMapping(
            value="/obtenerProducto3",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public RespuestaProducto3 obtenerProducto3(){
        RespuestaProducto3 rpta3 = new RespuestaProducto3(service.obtenerProducto3());
        return rpta3;
    }


}