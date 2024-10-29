package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import model.Camion;

public interface CamionRepository extends JpaRepository<Camion, String> {
}