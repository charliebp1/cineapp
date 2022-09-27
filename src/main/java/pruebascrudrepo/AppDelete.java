package pruebascrudrepo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbritosp.app.repository.NoticiasRepository;

public class AppDelete {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiasRepository repo = context.getBean("noticiasRepository", NoticiasRepository.class);
		
		// Operación CRUD - Delete (Método deleteById del repositorio)
		int idNoticia = 2;
		
		//repo.deleteById(idNoticia);
		if(repo.equals(idNoticia)) {
			repo.deleteById(idNoticia);
		} 
		
		context.close();

	}

}
