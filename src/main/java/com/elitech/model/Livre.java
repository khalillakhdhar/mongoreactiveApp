package com.elitech.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Livre {
	@Id
private String id;
private String titre;
private String genre;
	
@DBRef
private Auteur auteur; // reference de l'auteur

}
