package com.pfa.quickLinker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.repository.ProfileRepository;


@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	ProfileRepository profileRepository;

	@Override
	public Profile add(Profile profile) {
		// TODO Auto-generated method stub
		return profileRepository.save(profile);
	}

	@Override
	public void deleteById(Long idProfile) {
		// TODO Auto-generated method stub
		profileRepository.deleteById(idProfile);
		
	}

	@Override
	public Profile findById(Long id) {
		// TODO Auto-generated method stub
		return profileRepository.findById(id).get();
	}

	@Override
	public List<Profile> findAll() {
		// TODO Auto-generated method stub
		return profileRepository.findAll();
	}

	@Override
	public List<Profile> findByName(String name) {
		// TODO Auto-generated method stub
		return profileRepository.findByNomProfile(name);
	}

	@Override
	public List<Profile> findByNameContains(String c) {
		// TODO Auto-generated method stub
		return profileRepository.findByNomProfileContains(c);
	}

	@Override
	public List<Profile> findByTel(String tel) {
		// TODO Auto-generated method stub
		return null;
	}

}
