package com.pfa.quickLinker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.quickLinker.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{
	List<Profile> findByNomProfileContains(String nomProfile);
	
	List<Profile>findByNomProfile(String nomProfile);


}
