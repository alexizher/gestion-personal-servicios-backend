package co.edu.udea.gestionpersonalservicios.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class ProductoDto {

    @NotBlank
    private String nombre;
    @Min(0)
    private Float precio;

    public ProductoDto() {
    }

    public ProductoDto(@NotBlank String nombre, @Min(0) Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
