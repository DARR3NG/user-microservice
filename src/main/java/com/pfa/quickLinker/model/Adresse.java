package com.pfa.quickLinker.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.type.descriptor.java.ByteArrayJavaType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data @ToString
@Builder
public class Adresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAdresse;
	private String localisation;
	private String desciption;
 
	@JsonIgnore
	@OneToMany(mappedBy = "adresse")
	private List<Image>images;

}
