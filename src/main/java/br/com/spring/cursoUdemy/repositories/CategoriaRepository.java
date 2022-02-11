package br.com.spring.cursoUdemy.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.cursoUdemy.domain.Categoria;

// OU DAO
import org.springframework.context.annotation.Profile;

@Repository												// OBJ		  IDENTIFICADOR
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

	@Profile("dev")
	Optional<Categoria> findById(Integer id);
	
}
