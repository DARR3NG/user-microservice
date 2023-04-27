package com.pfa.quickLinker.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Profile {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfile;
	
	private String nomProfile;
	private String descProfile;
	private List<String>urls;
	@ManyToOne
	@JoinColumn(name = "idAdresse")
	@JsonIgnore
	private Adresse adresse;
	
	
	@ManyToOne
	@JoinColumn(name = "idTel")
	@JsonIgnore
	private Tel tel;
	

	


}
