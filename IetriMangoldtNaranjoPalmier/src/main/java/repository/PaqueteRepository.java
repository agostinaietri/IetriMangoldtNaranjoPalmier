package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Paquete;

public interface PaqueteRepository extends JpaRepository<Paquete, Integer> {
}