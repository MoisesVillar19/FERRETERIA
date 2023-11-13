/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.service;

/**
 *
 * @author Hp
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uni.Sistema.dao.Producto2Dao;
import pe.edu.uni.Sistema.dto.Producto1;

@Service
public class Producto2ServiceImpl implements Producto2Service {

    private final Producto2Dao dao;

    @Autowired
    public Producto2ServiceImpl(Producto2Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Producto1> obtenerProducto2() {
        return dao.obtenerProducto2();
    }
}
