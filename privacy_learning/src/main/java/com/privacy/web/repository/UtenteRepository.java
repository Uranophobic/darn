package com.privacy.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.privacy.web.model.Utente;

public interface UtenteRepository extends CrudRepository<Utente, String> {

	@Query(value = "SELECT Utente u FROM Utente WHERE u.email=?1 and u.password=?2", nativeQuery = true)
	public Utente login(String email, String password);

	public Utente findUtenteByEmailAndPassword(String email, String password);

	public Utente findUtenteByEmail(String email);

	@Query(value = "Delete Utente u FROM Utente u WHERE u.email=?1", nativeQuery = true)
	public void deleteByEmail(String email);

	@Query(value = "Update u FROM Utente u WHERE u.email=?1", nativeQuery = true)
	public void updateByEmail(String email);
	
	/* query per l'amministratore*/
	
	@Query(value="SELECT * FROM utente u WHERE u.livello=?", nativeQuery=true)
	public List<Utente> findUtenteByLivello(String livello);
	
	
	
	@Query(value="SELECT * FROM utente u WHERE u.percentuale<=40", nativeQuery=true)
	public List<Utente> findUtenteByPercentuale40();
	
	@Query(value="SELECT * FROM utente u WHERE u.percentuale>40 and u.percentuale<=60 ", nativeQuery=true)
	public List<Utente> findUtenteByPercentuale60();
	
	@Query(value="SELECT * FROM utente u WHERE u.percentuale>60 and u.percentuale<=80 ", nativeQuery=true)
	public List<Utente> findUtenteByPercentuale80();
	
	@Query(value="SELECT * FROM utente u WHERE u.percentuale>80", nativeQuery=true)
	public List<Utente> findUtenteByPercentuale100();
}
