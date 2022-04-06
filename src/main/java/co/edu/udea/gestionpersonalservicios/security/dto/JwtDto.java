package co.edu.udea.gestionpersonalservicios.security.dto;

import lombok.Data;

@Data
public class JwtDto {
    private String token;

    public JwtDto() {
    }

    public JwtDto(String token) {
        this.token = token;
    }
}
