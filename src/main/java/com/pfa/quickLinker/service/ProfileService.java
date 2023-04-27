package com.pfa.quickLinker.service;

import java.util.List;

import com.pfa.quickLinker.model.Adresse;
import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.model.Tel;

public interface ProfileService {
	
			Profile add(Profile profile);
			void deleteById(Long idProfile);
			Profile findById(Long id);
			List<Profile>findAll();	
			List<Profile> findByName(String name);
			List<Profile>findByNameContains(String c);
			//jpql
			List<Profile>findByTel(String tel);
			
			
			
}
