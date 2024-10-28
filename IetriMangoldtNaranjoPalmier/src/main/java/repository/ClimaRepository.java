package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Clima;

public interface ClimaRepository extends JpaRepository<Clima, Integer> {
}
