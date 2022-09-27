package com.cbritosp.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbritosp.app.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {
	public List<Usuario> findByActivo(int activo);
}
