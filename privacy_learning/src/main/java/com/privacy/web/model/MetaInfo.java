package com.privacy.web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "meta_info")
@Data // crea i metodi hashCode, equals e toString, getter e setter s
@NoArgsConstructor // crea il costruttore vuoto
@AllArgsConstructor // crea il costruttore con paramentri

public class MetaInfo {
	@Column(name = "keyword")
	@Id
	private String keyword;
}
