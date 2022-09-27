package com.cbritosp.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cbritosp.app.model.Noticia;

@Service
public class NoticiasServiceImpl implements INoticiasService {

	
	public void guardar(Noticia noticia) {
		// TODO Auto-generated method stub
		System.out.println(noticia);
	}

	public List<Noticia> buscarUltimas() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Noticia> buscarTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminar(int idNoticia) {
		// TODO Auto-generated method stub
		
	}

	public Noticia buscarPorId(int idNoticia) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Noticia> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
