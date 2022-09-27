package pruebascrudrepo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbritosp.app.model.Noticia;
import com.cbritosp.app.repository.NoticiasRepository;

public class AppFindAll {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiasRepository repo = context.getBean("noticiasRepository", NoticiasRepository.class);

		// Recuperar todos los registros (método findAll del repositosio)
		Iterable <Noticia> it = repo.findAll();
		
		for(Noticia n : it) {
			System.out.println(n);
		}
		
		
		context.close();
	}

}
