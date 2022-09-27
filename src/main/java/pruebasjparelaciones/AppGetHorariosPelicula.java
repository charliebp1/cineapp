package pruebasjparelaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbritosp.app.model.Pelicula;
import com.cbritosp.app.repository.PeliculasRepository;

public class AppGetHorariosPelicula {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		//Recuperar todas las entidades tipo Pelicula
		PeliculasRepository repo = context.getBean("peliculasRepository", PeliculasRepository.class);
		
		Optional<Pelicula> optional = repo.findById(7);
		
		// System.out.println(optional.get().getHorarios().size());
		
		context.close();

	}

}
