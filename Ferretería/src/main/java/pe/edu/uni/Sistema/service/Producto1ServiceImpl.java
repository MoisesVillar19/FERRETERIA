/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uni.Sistema.dao.Producto1Dao;
import pe.edu.uni.Sistema.dto.Producto1;

/**
 *
 * @author Hp
 */
@Service
public class Producto1ServiceImpl implements Producto1Service {

    private final Producto1Dao dao;

    @Autowired
    public Producto1ServiceImpl(Producto1Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Producto1> obtenerProducto1() {
        return dao.obtenerProducto1();
    }
}
