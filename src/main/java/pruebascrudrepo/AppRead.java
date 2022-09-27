package pruebascrudrepo;

import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbritosp.app.model.Noticia;
import com.cbritosp.app.repository.NoticiasRepository;

public class AppRead {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiasRepository repo = context.getBean("noticiasRepository", NoticiasRepository.class);
		
		// Operación CRUD - Read (metodo findById del repositorio)
		Optional<Noticia> noticia = repo.findById(1);
		System.out.println(noticia.get());
		
		context.close();

	}

}
