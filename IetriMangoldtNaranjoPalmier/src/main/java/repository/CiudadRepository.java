package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {
}