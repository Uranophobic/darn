package com.privacy.web.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.privacy.web.model.ArgomentoStudio;

public interface ArgomentoStudioRepository extends CrudRepository<ArgomentoStudio, Integer> {

	@Query(value = "Select max(id_studio) FROM argomento_studio ORDER BY id_studio ASC", nativeQuery = true)
	int returnLastId();

	// argomenti da studiare dell'utente
	@Query(value = "SELECT argomento_studio.* FROM argomento_studio JOIN progresso_studio ON progresso_studio.meta_info = argomento_studio.meta_info JOIN utente ON progresso_studio.email_utente=utente.email WHERE utente.email=?1", nativeQuery = true)
	List<ArgomentoStudio> findAllArgDaStudiare(String email);

	boolean existsByTitolo(String titolo);

	boolean existsByDescrizione(String descrizione);

	boolean existsByLinkvideo(String link);

	ArgomentoStudio findArgomentoByTitolo(String titolo);

	@Query(value = "SELECT * FROM argomento_studio WHERE argomento_studio.meta_info=?1", nativeQuery = true)
	List<ArgomentoStudio> findArgomentoByMeta(String meta_info);

	@Query(value = "SELECT * FROM argomento_studio AS a WHERE a.id_studio= :id", nativeQuery = true)
	ArgomentoStudio findArgomentoById(@Param("id") int id);
}
