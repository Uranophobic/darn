package com.privacy.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utente")
@Data // crea i metodi hashCode, equals e toString, getter e setter
@NoArgsConstructor // crea il costruttore vuoto
@AllArgsConstructor // crea il costruttore con paramentri
public class Utente {

	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cognome")
	private String cognome;

	@Column(name = "data_nascita")
	private String dataNascita;

	@Column(name = "percentuale")
	private int percentuale;

	@Column(name = "livello")
	private String livello;

}
