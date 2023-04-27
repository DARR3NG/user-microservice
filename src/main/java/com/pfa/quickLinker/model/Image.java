package com.pfa.quickLinker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Image {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY) 
	private Long idImage;
	private String name;
	private String type;
	@Column(name = "image",length = 4048576)
	@Lob
	private byte[] image;
	
	@ManyToOne
	@JoinColumn(name = "adresse_id")
	
	private Adresse adresse;
	

	
	

}
