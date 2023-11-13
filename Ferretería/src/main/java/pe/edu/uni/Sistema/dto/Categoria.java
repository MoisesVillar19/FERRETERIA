package pe.edu.uni.Sistema.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    private int idCategoria;
    private String nombreCategoria;
    private String urlimagen;
}
