package com.cbritosp.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbritosp.app.model.Perfil;
import com.cbritosp.app.repository.PerfilesRepository;

@Service
public class PerfilesServiceJPA implements IPerfilesService {

	@Autowired
	private PerfilesRepository perfilesRepo;
	
	@Override
	public void guardar(Perfil perfil) {
		// TODO Auto-generated method stub
		perfilesRepo.save(perfil);
	}

}
