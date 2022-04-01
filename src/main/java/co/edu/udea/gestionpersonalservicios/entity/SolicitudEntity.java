package co.edu.udea.gestionpersonalservicios.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class SolicitudEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    private String direccion;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date fecha_creacion;

    private String descripcion;

    private boolean estado;

    private Date Fecha_inicio;

    private Date fecha_finalizacion;

    private String nombre_contacto;

    private Integer tel_contacto;
}
