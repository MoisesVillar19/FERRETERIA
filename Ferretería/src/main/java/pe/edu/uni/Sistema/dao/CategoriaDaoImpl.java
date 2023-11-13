/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.dao;

/**
 *
 * @author Hp
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.uni.Sistema.dto.Categoria;

@Repository
public class CategoriaDaoImpl implements CategoriaDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Categoria> obtenerCategorias() {
        String sql = "SELECT idCategoria, nombreCategoria, urlimagen FROM Categoría";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Categoria.class));
    }
}
