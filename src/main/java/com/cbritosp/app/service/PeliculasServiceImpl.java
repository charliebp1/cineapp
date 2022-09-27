package com.cbritosp.app.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cbritosp.app.model.Pelicula;

@Service
public class PeliculasServiceImpl implements IPeliculasService {

	private List<Pelicula> lista = null;
	
	public PeliculasServiceImpl() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			lista = new LinkedList<Pelicula>();
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setId(1);
			pelicula1.setTitulo("Power Rangers");
			pelicula1.setDuracion(120);
			pelicula1.setClasificacion("B");
			pelicula1.setGenero("Aventura");
			pelicula1.setFechaEstreno(formatter.parse("02-05-2017"));
			// imagen = "cinema.png";
			// estatus = "Activa";
			
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(2);
			pelicula2.setTitulo("La Bella y la Bestia");
			pelicula2.setDuracion(132);
			pelicula2.setClasificacion("B");
			pelicula2.setGenero("Infantil");
			pelicula2.setFechaEstreno(formatter.parse("20-05-2017"));
			pelicula2.setImagen("bella.png");
			
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setId(3);
			pelicula3.setTitulo("Contratiempo");
			pelicula3.setDuracion(106);
			pelicula3.setClasificacion("B");
			pelicula3.setGenero("Thriller");
			pelicula3.setFechaEstreno(formatter.parse("28-05-2017"));
			pelicula3.setImagen("contratiempo.png");
			
			Pelicula pelicula4 = new Pelicula();
			pelicula4.setId(4);
			pelicula4.setTitulo("Kong La Isla Calavera");
			pelicula4.setDuracion(118);
			pelicula4.setClasificacion("B");
			pelicula4.setGenero("Acción y aventura");
			pelicula4.setFechaEstreno(formatter.parse("08-06-2017"));
			pelicula4.setImagen("kong.png");
			pelicula4.setEstatus("Inactiva");
			
			Pelicula pelicula5 = new Pelicula();
			pelicula5.setId(5);
			pelicula5.setTitulo("Life: Vida Inteligente");
			pelicula5.setDuracion(104);
			pelicula5.setClasificacion("B");
			pelicula5.setGenero("Drama");
			pelicula5.setFechaEstreno(formatter.parse("10-06-2017"));
			pelicula5.setImagen("estreno5.png");
			
			
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);
			lista.add(pelicula4);
			lista.add(pelicula5);
			
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
			
		}
	}
	
	public List<Pelicula> buscarTodas() {
		
		return lista;
	}


	public Pelicula buscarPorId(int idPelicula) {
		
		for(Pelicula p : lista) {
			if(p.getId() == idPelicula) {
				return p;
			}
		}
		return null;
	}

	public void insertar(Pelicula pelicula) {
		lista.add(pelicula);
	}

	public List<String> buscarGeneros() {
		
		// Nota: esta lista podria ser obtenida de una BD
		List<String> generos = new LinkedList<String>();
		generos.add("Acción");
		generos.add("Aventura");
		generos.add("Clásicas");
		generos.add("Comedia Romántica");
		generos.add("Drama");
		generos.add("Terror");
		generos.add("Infantil");
		generos.add("Acción y Aventura");
		generos.add("Romántica");
		generos.add("Ciencia Ficción");
		
		return generos;
	}

	public void eliminar(int idPelicula) {
		// TODO Auto-generated method stub
		
	}

	public Page<Pelicula> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pelicula> buscarActivas() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pelicula> buscarPorFecha(Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}
}
