/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.Sistema.dtorest;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.uni.Sistema.dto.Categoria;

@Data
@NoArgsConstructor
public class RespuestaCategoria {

    private List<Categoria> categoria;

    public RespuestaCategoria(List<Categoria> categoria) {

        this.categoria = categoria;
    }
}
