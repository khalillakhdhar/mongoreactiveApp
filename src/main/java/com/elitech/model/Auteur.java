package com.elitech.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document // équivalent de @Entity
public class Auteur {
	@Id
	private String id;
	private String nom;
	private String prenom;
	

}
