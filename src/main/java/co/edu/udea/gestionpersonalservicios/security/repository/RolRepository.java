package co.edu.udea.gestionpersonalservicios.security.repository;

import co.edu.udea.gestionpersonalservicios.security.entity.Rol;
import co.edu.udea.gestionpersonalservicios.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
