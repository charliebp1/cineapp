package com.cbritosp.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.cbritosp.app.model.Banner;
import com.cbritosp.app.repository.BannersRepository;

// Registramos esta clase como un Bean en nuestro Root ApplicationContext.
@Service
@Primary
public class BannersServiceJPA implements IBannersService{

	// Inyectamos una instancia desde nuestro Root ApplicationContext.
	@Autowired
	private BannersRepository bannersRepo;
	
	@Override
	public void insertar(Banner banner) {
		bannersRepo.save(banner);
	}

	@Override
	public List<Banner> buscarActivos() {		
		return bannersRepo.findByEstatusOrderByIdDesc("Activo");
	}

	@Override
	public void eliminar(int idBanner) {
		bannersRepo.deleteById(idBanner);		
	}

	@Override
	public Banner buscarPorId(int idBanner) {
		Optional<Banner> optional = bannersRepo.findById(idBanner);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public List<Banner> buscarTodos() {
		return bannersRepo.findAll();
	}

}
