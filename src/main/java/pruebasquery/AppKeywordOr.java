package pruebasquery;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbritosp.app.model.Noticia;
import com.cbritosp.app.repository.NoticiasRepository;

public class AppKeywordOr {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiasRepository repo = context.getBean("noticiasRepository", NoticiasRepository.class);
		
		// Ejemplo keyword And
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		List<Noticia> lista = null;
		try {
			lista = repo.findByEstatusOrFecha("Inactiva", format.parse("2017-10-08"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		for(Noticia n: lista) {
			System.out.println(n);
		}
	}

}
