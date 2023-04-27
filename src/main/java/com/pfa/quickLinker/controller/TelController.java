package com.pfa.quickLinker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.model.Tel;
import com.pfa.quickLinker.repository.ProfileRepository;
import com.pfa.quickLinker.repository.TelRepository;

@RestController
@RequestMapping("/tel")
@CrossOrigin("*")
public class TelController {

	@Autowired
	TelRepository telRepository;
	
	@Autowired
	ProfileRepository profileRepository;
	/*
	Tel add(Tel tel);
	void deleteById(Long id);
	Tel findById(Long id);
	Tel update(Tel tel);
	List<Tel>findAll();
	void addTelToProfile(Long id,Tel tel);

	 */
	
	@PostMapping("/add")
	public Tel add(@RequestBody Tel tel) {
		return telRepository.save(tel);
		
	}
	
	
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable Long id) {
		telRepository.deleteById(id);
	}
	
	
	@GetMapping("/{id}")
	public Tel findById(@PathVariable Long id) {
		return telRepository.findById(id).get();
	}
	
	@PutMapping("/update")
	public Tel updateTel(@RequestBody Tel tel) {
		return telRepository.save(tel);
	}
	
	@GetMapping("/all")
	public List<Tel>findAll(){
		return telRepository.findAll();
	}
	
	@PostMapping("/addTelToProfile/{id}")
	public void addTelToProfile(@RequestBody Tel tel,@PathVariable Long id) {
		
		Profile p=profileRepository.findById(id).get();
		p.setTel(tel);
		telRepository.save(tel);
		profileRepository.save(p);
	}
	@PostMapping("/addTelToProfile/{idP}/{idT}")
	public void addTelToProfile(@PathVariable Long idT,@PathVariable Long idP) {
		
		Profile p=profileRepository.findById(idP).get();
		p.setTel(telRepository.findById(idT).get());
		profileRepository.save(p);
	}
}
