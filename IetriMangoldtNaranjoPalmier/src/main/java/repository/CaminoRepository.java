package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Camino;

public interface CaminoRepository extends JpaRepository<Camino, String> {
}