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
@Table(name = "articolo")
@Data // crea i metodi hashCode, equals e toString, getter e setter
@NoArgsConstructor // crea il costruttore vuoto
@AllArgsConstructor // crea il costruttore con paramentri
public class Articolo {
	@Column(name = "id_articolo")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_articolo;

	@Column(name = "link")
	private String link;

	@Column(name = "titolo_articolo")
	private String titolo;

	@Column(name = "meta_info")
	private String meta_info;

}
