package com.cbritosp.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbritosp.app.model.Usuario;
import com.cbritosp.app.repository.UsuariosRepository;

@Service
public class UsuariosServiceJPA implements IUsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepo;
	
	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		usuariosRepo.save(usuario);
	}

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return usuariosRepo.findAll();
	}

	@Override
	public Usuario buscarPorId(int idUsuario) {
		// TODO Auto-generated method stub
		Optional<Usuario> optionalUser = usuariosRepo.findById(idUsuario);
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		}
			
		return null;
	}

	@Override
	public void eliminar(int idUsuario) {
		// TODO Auto-generated method stub
		usuariosRepo.deleteById(idUsuario);
	}

	@Override
	public List<Usuario> buscarActivos() {
		List<Usuario> usuarios = null;
		usuarios = usuariosRepo.findByActivo(1);
		
		return usuarios;
	}
}
