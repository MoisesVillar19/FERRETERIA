/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uni.Sistema.dto.Cliente;
import pe.edu.uni.Sistema.service.ClienteService;

@RestController
@CrossOrigin(origins = {"*"})
public class ClienteController {
    @Autowired
    private ClienteService service;
    @RequestMapping(
            value="/registrarCliente",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public Cliente registrarCliente(@RequestBody Cliente cliente){
        return service.registrarCliente(cliente);
    }

}