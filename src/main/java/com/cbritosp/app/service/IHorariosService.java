package com.cbritosp.app.service;

import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.cbritosp.app.model.Horario;

public interface IHorariosService {
	List<Horario> buscarPorIdPelicula(int idPelicula, Date fecha);
	void insertar(Horario horario);
	List<Horario> buscarTodos();
	Page<Horario> buscarTodos(Pageable page);
	void eliminar(int idHorario);
	Horario buscarPorId(int idHorario);
}
