package co.edu.udea.gestionpersonalservicios.dto;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class SolicitudDto {

    @NotBlank
    @Temporal(TemporalType.DATE)
    private Date fecha_creacion;

    @NotBlank
    private String descripcion;

    private boolean estado;

    public SolicitudDto() {
    }

    public SolicitudDto(@NotBlank Date fecha_creacion,@NotBlank String descripcion, Boolean estado) {
        this.fecha_creacion = fecha_creacion;
        this.descripcion = descripcion;
        this.estado = estado;

    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
