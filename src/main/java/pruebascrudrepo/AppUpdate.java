package pruebascrudrepo;

import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbritosp.app.model.Noticia;
import com.cbritosp.app.repository.NoticiasRepository;

public class AppUpdate {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiasRepository repo = context.getBean("noticiasRepository", NoticiasRepository.class);
		
		// Operaci?n CRUD - Update (m?todo save del repositorio)
		
		// 1. Primero buscamos la entidad que vamos a modificar (findById)
		Optional<Noticia> optional = repo.findById(1);
		
		// 2. Modificamos la entidad y la guardamos
		if(optional.isPresent()) {
			Noticia noticia = optional.get();
			noticia.setEstatus("Inactiva");
			repo.save(noticia);
		}
	}

}
