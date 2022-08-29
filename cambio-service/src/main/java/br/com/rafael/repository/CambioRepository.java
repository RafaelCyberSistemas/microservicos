package br.com.rafael.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafael.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
}
