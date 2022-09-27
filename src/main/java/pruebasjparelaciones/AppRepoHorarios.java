package pruebasjparelaciones;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbritosp.app.model.Horario;
import com.cbritosp.app.repository.HorariosRepository;

public class AppRepoHorarios {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		HorariosRepository repo = context.getBean("horariosRepository", HorariosRepository.class);
		
		List<Horario> lista = repo.findAll();
		
		System.out.println("Número de entidades: " + lista.size());
		for(Horario h : lista){
			System.out.println(h);
		}
		
		context.close();
	}

}
