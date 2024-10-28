package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.EstadoCamino;

public interface EstadoCaminoRepository extends JpaRepository<EstadoCamino, Integer> {
}