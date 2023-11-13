/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uni.Sistema.dao.CategoriaDao;
import pe.edu.uni.Sistema.dto.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaDao dao;

    @Autowired
    public CategoriaServiceImpl(CategoriaDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Categoria> obtenerCategorias() {
        return dao.obtenerCategorias();
    }
}

