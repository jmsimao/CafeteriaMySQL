package br.com.ifsp.CafeteriaMySQL.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.ifsp.CafeteriaMySQL.Model.Cafe;

public interface CafeRepository extends CrudRepository<Cafe, String> {

	Iterable<Cafe> findAll();	
	
	Optional<Cafe> findById(int id);
	
	Optional<Cafe> findByName(String nome);
	
	boolean existsById(int id);
	
	boolean existsByName(String nome);
	
	void deleteById(int id);
}
