package com.cbritosp.app.service;

import java.util.List;

import com.cbritosp.app.model.Usuario;

public interface IUsuariosService {
	
	void guardar(Usuario usuario);
	
	List<Usuario> buscarTodos();
	
	List<Usuario> buscarActivos();
	
	Usuario buscarPorId(int idUsuario);
	
	void eliminar(int idUsuario);
}
