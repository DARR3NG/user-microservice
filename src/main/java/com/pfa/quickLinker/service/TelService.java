package com.pfa.quickLinker.service;

import java.util.List;

import com.pfa.quickLinker.model.Tel;

public interface TelService {

	Tel add(Tel tel);
	void deleteById(Long id);
	Tel findById(Long id);
	Tel update(Tel tel);
	List<Tel>findAll();
	void addTelToProfile(Long id,Tel tel);
	void addTelToProfile(Long idP,Long idT);


}
