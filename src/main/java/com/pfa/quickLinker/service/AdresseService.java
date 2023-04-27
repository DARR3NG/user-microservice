package com.pfa.quickLinker.service;

import java.util.List;

import com.pfa.quickLinker.model.Adresse;

public interface AdresseService {
	
	Adresse addAdresse(Adresse adresse);
	void deleteById(Long id);
	Adresse findById(Long id);
	List<Adresse>findAll();
	Adresse update(Adresse adresse);
	void addAdresseToProfile(Long idProfile,Adresse adresse);

}
