package pruebascrudrepo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbritosp.app.model.Noticia;
import com.cbritosp.app.repository.NoticiasRepository;

public class AppFindAllById {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiasRepository repo = context.getBean("noticiasRepository", NoticiasRepository.class);
		
		// Recuperar varios registros por Id (metoodo findAllById del repositorio)
		List<Integer> ids = new LinkedList<Integer>();
		ids.add(7);
		ids.add(9);
		ids.add(11);
		
		Iterable <Noticia> it = repo.findAllById(ids);
		
		for(Noticia n : it) {
			System.out.println(n);
		}
		
		context.close();

	}

}
