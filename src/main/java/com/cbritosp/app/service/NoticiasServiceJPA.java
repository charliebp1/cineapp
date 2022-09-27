package com.cbritosp.app.service;

import java.util.List;
import java.util.Optional;
import com.cbritosp.app.model.Noticia;
import com.cbritosp.app.repository.NoticiasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// Registramos esta clase como un Bean en nuestro Root ApplicationContext.
@Service
@Primary
public class NoticiasServiceJPA implements INoticiasService{
	
	// Inyectamos una instancia desde nuestro Root ApplicationContext.
    @Autowired
	private NoticiasRepository noticiasRepo;
		
    @Override
	public List<Noticia> buscarUltimas() {
		List<Noticia> noticias = noticiasRepo.findTop3ByEstatusOrderByIdDesc("Activa");		
		return noticias;
	}

	@Override
	public void guardar(Noticia noticia) {
		noticiasRepo.save(noticia);		
	}

	@Override
	public List<Noticia> buscarTodas() {		
		return noticiasRepo.findAll();
	}

	@Override
	public void eliminar(int idNoticia) {
		// noticiasRepo.delete(idNoticia); // Spring 4.3
		noticiasRepo.deleteById(idNoticia);
	}

	// Spring 4.3
//	@Override
//	public Noticia buscarPorId(int idNoticia) {
//		return noticiasRepo.findOne(idNoticia); 
//	}
	
	@Override
	public Noticia buscarPorId(int idNoticia) {
		Optional<Noticia> optional = noticiasRepo.findById(idNoticia);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

}
