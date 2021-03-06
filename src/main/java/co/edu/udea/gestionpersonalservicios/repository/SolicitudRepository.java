package co.edu.udea.gestionpersonalservicios.repository;

import co.edu.udea.gestionpersonalservicios.entity.Producto;
import co.edu.udea.gestionpersonalservicios.entity.SolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;


@Repository
@RepositoryRestResource(path = "solicitudes", collectionResourceRel = "solicitudes")
public interface SolicitudRepository extends JpaRepository<SolicitudEntity, Integer> {
    /*
    Optional<SolicitudEntity> findByDescripcion(String descripcion);
     */

}
