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
import pe.edu.uni.Sistema.dtorest.RespuestaProducto2;
import pe.edu.uni.Sistema.service.Producto2Service;


@RestController
@CrossOrigin(origins = {"*"})
public class Producto2Controller {
    @Autowired
    private Producto2Service service;

    @RequestMapping(
            value="/obtenerProducto2",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public RespuestaProducto2 obtenerProducto2(){
        RespuestaProducto2 rpta2 = new RespuestaProducto2(service.obtenerProducto2());
        return rpta2;
    }


}
