/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uni.Sistema.dao.ClienteDao;
import pe.edu.uni.Sistema.dto.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteDao dao;

    @Autowired
    public ClienteServiceImpl(ClienteDao dao) {
        this.dao = dao;
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return dao.registrarCliente(cliente);
    }
}

