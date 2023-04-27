package com.pfa.quickLinker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Tel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTel;
	private String nomTel;
	@Column(length = 10)
	private String numTel;
	
	
}
