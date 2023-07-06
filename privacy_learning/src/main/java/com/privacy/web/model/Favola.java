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
@Table(name = "favola")
@Data // crea i metodi hashCode, equals e toString, getter e setter
@NoArgsConstructor // crea il costruttore vuoto
@AllArgsConstructor // crea il costruttore con paramentri
public class Favola {
	@Column(name = "id_favola")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_favola;

	@Column(name = "titolo_favola")
	private String titolofavola;

	@Column(name = "testo_favola")
	private String testofavola;

	@Column(name = "image_path")
	private String image_path;

	@Column(name = "meta_info")
	private String meta_info;
}
