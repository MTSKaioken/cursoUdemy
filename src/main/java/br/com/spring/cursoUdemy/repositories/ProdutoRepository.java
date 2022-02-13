package br.com.spring.cursoUdemy.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.cursoUdemy.domain.Produto;

// OU DAO

@Repository												// OBJ		  IDENTIFICADOR
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	
	Optional<Produto> findById(Integer id);
	
}
