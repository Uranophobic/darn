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
@Table(name = "argomento_studio")
@Data // crea i metodi hashCode, equals e toString, getter e setter
@NoArgsConstructor // crea il costruttore vuoto
@AllArgsConstructor // crea il costruttore con paramentri
public class ArgomentoStudio {
	@Column(name = "id_studio")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_studio;

	@Column(name = "titolo")
	private String titolo;

	@Column(name = "descrizione")
	private String descrizione;

	@Column(name = "link_video")
	private String linkvideo;

	@Column(name = "meta_info")
	private String meta_info;
}
