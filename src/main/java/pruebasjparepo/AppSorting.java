package pruebasjparepo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Sort;

import com.cbritosp.app.model.Noticia;
import com.cbritosp.app.repository.NoticiasRepository;

public class AppSorting {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiasRepository repo = context.getBean("noticiasRepository", NoticiasRepository.class);
		// Obtener todas las entidades (metodo findAll) ordenado por título
		// List<Noticia> lista = repo.findAll(Sort.by("titulo").descending());
		
		// Obtener todas las entidades (metodo findAll) ordenadas por dos campos
		List<Noticia> lista = repo.findAll(Sort.by("fecha").descending().and(Sort.by("titulo").ascending()));
		
		for(Noticia n : lista) {
			System.out.println(n);
		}
		
		context.close();


	}

}
