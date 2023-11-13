/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.uni.Sistema.dto.Cliente;

@Repository
public class ClienteDaoImpl implements ClienteDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(
                sql,
                cliente.getDniCliente(),
                cliente.getContrasena(),
                cliente.getNombres(),
                cliente.getApellidos(),
                cliente.getTelefono()
        );
        return cliente;
    }
}

