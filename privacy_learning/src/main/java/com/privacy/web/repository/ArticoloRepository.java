package com.privacy.web.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.privacy.web.model.Articolo;

public interface ArticoloRepository extends CrudRepository<Articolo, Integer> {

	boolean existsByTitolo(String titolo);

	boolean existsByLink(String link);

	@Query(value = "Select * FROM Articolo a WHERE a.id_articolo=?1", nativeQuery = true)
	Articolo findArticoloById(int id);

}
