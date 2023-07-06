package com.privacy.web.model;

import jakarta.persistence.Column;

/*
 * Entity per le domande
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "domanda")
@Data // crea i metodi hashCode, equals e toString, getter e setter
@NoArgsConstructor // crea il costruttore vuoto
@AllArgsConstructor // crea il costruttore con paramentri

public class Domanda {
	@Column(name = "id_domanda")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_domanda;

	@Column(name = "testo")
	private String testo;

	@Column(name = "meta_info")
	private String meta_info;

	@Column(name = "risposta1")
	private String risposta1;

	@Column(name = "risposta2")
	private String risposta2;

	@Column(name = "risposta3")
	private String risposta3;

	@Column(name = "risposta4")
	private String risposta4;

	@Column(name = "risposta_corretta")
	private int risposta_corretta;

	@Column(name = "id_test")
	private int id_test;
}
