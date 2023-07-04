package com.privacy.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gioco")
@Data // crea i metodi hashCode, equals e toString, getter e setter
@NoArgsConstructor // crea il costruttore vuoto
@AllArgsConstructor // crea il costruttore con paramentri
public class Gioco {
	@Column(name = "id_gioco")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_gioco;

	@Column(name = "titolo")
	private String titolo;

	@Column(name = "descrizione")
	private String descrizione;

	@Column(name = "meta_info")
	private String meta_info;

}
