package com.cbritosp.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cbritosp.app.model.Detalle;
import com.cbritosp.app.repository.DetallesRepository;

// Registramos esta clase como un Bean en nuestro Root ApplicationContext.
@Service
public class DetallesServiceJPA implements IDetallesService{

	// Inyectamos una instancia desde nuestro Root ApplicationContext.
    @Autowired
	private DetallesRepository detallesRepo;
		
	@Override
	public void insertar(Detalle detalle) {
		detallesRepo.save(detalle);
	}

	@Override
	public void eliminar(int idDetalle) {
		// detallesRepo.delete(idDetalle); // Spring 4.3
		detallesRepo.deleteById(idDetalle);
	}

}
