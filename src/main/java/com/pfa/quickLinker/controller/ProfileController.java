package com.pfa.quickLinker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.repository.ProfileRepository;


@RestController
@RequestMapping("/profile")
@CrossOrigin("*")
public class ProfileController {
	
	@Autowired
	ProfileRepository profileRepository;
	
	/*
	  		Profile add(Profile profile);
			void deleteById(Long idProfile);
			Profile findById(Long id);
			List<Profile>findAll();	
			List<Profile> findByName(String name);
			List<Profile>findByNameContains(String c);
			//jpql
			List<Profile>findByTel(String tel);
			
	 */
	
	@PostMapping("/add")
	public Profile add(@RequestBody Profile profile) {
		return profileRepository.save(profile);
	}
	
	@GetMapping("/all")
	public List<Profile>findAll(){
		return profileRepository.findAll();
	}
	
	@DeleteMapping("/delete/{idProfile}")
	public void deleteById(@PathVariable Long idProfile) {
		profileRepository.deleteById(idProfile);
		
	}
	
	@GetMapping("/{idProfile}")
	public Profile findById(@PathVariable Long idProfile) {
		return profileRepository.findById(idProfile).get();
	}
	
	@GetMapping("/name/{name}")
	public List<Profile>findByName(@PathVariable("name") String name){
		return profileRepository.findByNomProfile(name);
	}

}
