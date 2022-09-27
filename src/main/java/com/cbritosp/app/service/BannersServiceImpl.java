package com.cbritosp.app.service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cbritosp.app.model.Banner;

@Service
public class BannersServiceImpl implements IBannersService {

	private List<Banner> lista = null; 
	/**
	 * En el constructor creamos una lista enlazada con objetos de tipo Banner
	 */
	public BannersServiceImpl() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		
		try {
			// Ejercicio: Crear una nueva lista enlazada		
			lista = new LinkedList<Banner>();
				
			// Ejercicio: Crear algunos objetos de tipo Banner (estaticos)
			Banner banner1 = new Banner();
			banner1.setArchivo("banner1.jpg");
			banner1.setEstatus("Activo");
			banner1.setId(1);
			banner1.setTitulo("Vengadores");
			banner1.setFecha(formatter.parse("10-06-2022"));
			
			Banner banner2 = new Banner();
			banner2.setArchivo("banner2.jpg");
			banner2.setEstatus("Activo");
			banner2.setId(2);
			banner2.setTitulo("Joker");
			banner2.setFecha(formatter.parse("12-06-2022"));
			
			Banner banner3 = new Banner();
			banner3.setArchivo("banner3.jpg");
			banner3.setEstatus("Inactivo");
			banner3.setId(3);
			banner3.setTitulo("Resident Evil 5");
			banner3.setFecha(formatter.parse("14-06-2022"));
			
			
			
			Banner banner4 = new Banner();
			banner4.setArchivo("banner4.jpg");
			banner4.setEstatus("Activo");
			banner4.setId(4);
			banner4.setTitulo("Gangster Squad");
			banner4.setFecha(new Date());
			
			Banner banner5 = new Banner();
			banner5.setArchivo("default.jpg");
			banner5.setEstatus("Inactivo");
			banner5.setId(5);
			banner5.setTitulo("Cinema");
			banner5.setFecha(formatter.parse("16-06-2022"));
			
			// Ejercicio: Agregar los objetos Banner a la lista
			lista.add(banner1);
			lista.add(banner2);
			lista.add(banner3);
			lista.add(banner4);
			// lista.add(banner5);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}	
	}

	/**
	 * Insertamos un objeto de tipo Banner a la lista
	 */
	public void insertar(Banner banner) {
		
		// Ejercicio: Implementar metodo
		lista.add(banner);
	}

	/**
	 * Regresamos la lista de objetos Banner
	 */
	public List<Banner> buscarTodos() {
		
		// Ejercicio: Implementar metodo
		return lista;
		
	}

	public List<Banner> buscarActivos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminar(int idBanner) {
		// TODO Auto-generated method stub
		
	}

	public Banner buscarPorId(int idBanner) {
		// TODO Auto-generated method stub
		return null;
	}

}
