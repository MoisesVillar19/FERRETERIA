/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.dao;

/**
 *
 * @author Hp
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.uni.Sistema.dto.Producto1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Producto2DaoImpl implements Producto2Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Producto1> obtenerProducto2() {
        List<Producto1> productos2 = new ArrayList<>();

        String sql = "SELECT p.idProducto, p.nombre, p.descripcion, p.precio, p.idCategoria, p.urlimagen \n" +
                     "FROM producto p \n" +
                     "INNER JOIN Categoría c ON (p.idCategoria = c.idCategoria) \n" +
                     "WHERE c.idCategoria = 2";

        try (PreparedStatement st = jdbcTemplate.getDataSource().getConnection().prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                Producto1 p = new Producto1(
                        rs.getInt("p.idProducto"),
                        rs.getString("p.nombre"),
                        rs.getString("p.descripcion"),
                        rs.getFloat("p.precio"),
                        rs.getInt("p.idCategoria"),
                        rs.getString("p.urlimagen")
                );
                productos2.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productos2;
    }
}
