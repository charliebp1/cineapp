package pruebascrudrepo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbritosp.app.model.Noticia;
import com.cbritosp.app.repository.NoticiasRepository;

public class AppCreate {

	public static void main(String[] args) {

		Noticia noticia = new Noticia();
		noticia.setTitulo("Black Phone.");
		noticia.setDetalle("Un sádico asesino secuestra a Finney Shaw, un chico tímido e inteligente de 13 años, y le encierra en un sótano insonorizado donde de nada sirven sus gritos.");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiasRepository repo = context.getBean("noticiasRepository", NoticiasRepository.class);
		
		repo.save(noticia);
		
		context.close();

	}

}
