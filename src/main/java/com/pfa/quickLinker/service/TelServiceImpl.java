package com.pfa.quickLinker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.quickLinker.model.Adresse;
import com.pfa.quickLinker.model.Image;
import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.model.Tel;
import com.pfa.quickLinker.repository.ProfileRepository;
import com.pfa.quickLinker.repository.TelRepository;

@Service
public class TelServiceImpl implements TelService {

	@Autowired
	TelRepository telRepository;
	@Autowired
	ProfileRepository profileRepository;
	
	@Override
	public Tel add(Tel tel) {
		// TODO Auto-generated method stub
		return telRepository.save(tel);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		telRepository.deleteById(id);
		
	}

	@Override
	public Tel findById(Long id) {
		// TODO Auto-generated method stub
		return telRepository.findById(id).get();
	}

	@Override
	public Tel update(Tel tel) {
		// TODO Auto-generated method stub
		return telRepository.save(tel);
	}

	@Override
	public List<Tel> findAll() {
		// TODO Auto-generated method stub
		return telRepository.findAll();
	}

	@Override
	public void addTelToProfile(Long id, Tel tel) {
		// TODO Auto-generated method stub
		
		/* 
		 *Adresse a=new Adresse();
		a.setIdAdresse(idAdresse);
		return imageRepository.save(Image.builder()
				.name(file.getOriginalFilename())
				.type(file.getContentType())
				.image(file.getBytes())
				.adresse(a).build()); 
		 */
		
		
		Profile p=profileRepository.findById(id).get();
		p.setTel(tel);
		profileRepository.save(p);
	//	p.set
		 
		
	}

	@Override
	public void addTelToProfile(Long idP, Long idT) {
		// TODO Auto-generated method stub
		
		Profile p=profileRepository.findById(idP).get();
		p.setTel(telRepository.findById(idT).get());
		profileRepository.save(p);
		
	}
	

}
