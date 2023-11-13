/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uni.Sistema.dao.Producto3Dao;
import pe.edu.uni.Sistema.dto.Producto1;

@Service
public class Producto3ServiceImpl implements Producto3Service {

    private final Producto3Dao dao;

    @Autowired
    public Producto3ServiceImpl(Producto3Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Producto1> obtenerProducto3() {
        return dao.obtenerProducto3();
    }
}
