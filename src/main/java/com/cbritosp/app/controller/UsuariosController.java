package com.cbritosp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cbritosp.app.model.Perfil;
import com.cbritosp.app.model.Usuario;
import com.cbritosp.app.service.IPerfilesService;
import com.cbritosp.app.service.IUsuariosService;

@Controller
@RequestMapping(value = "/usuarios")
public class UsuariosController {
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private IUsuariosService usuariosService;
	
	@Autowired
	private IPerfilesService perfilesService;
	
	@GetMapping(value = "/create")
	public String crear(@ModelAttribute Usuario usuario) {
		return "usuarios/formUsuario";
	}

	@GetMapping(value = "/index")
	public String index(Model model) {
		List<Usuario> listUsuarios = usuariosService.buscarTodos();
		model.addAttribute("usuarios", listUsuarios);
		return "usuarios/listUsuarios";
	}
	
	@PostMapping(value = "/save")
	public String guardar(@ModelAttribute Usuario usuario, @RequestParam("perfil") String perfil) {
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Perfil: " + perfil);
		
		String tmpPass = usuario.getPwd();
		String encriptado = encoder.encode(tmpPass);
		usuario.setPwd(encriptado);
		usuario.setActivo(1);
		
		usuariosService.guardar(usuario);
		
		
		Perfil perfilUsuario = new Perfil();
		
		perfilUsuario.setPerfil(perfil);
		perfilUsuario.setCuenta(usuario.getCuenta());
		
		perfilesService.guardar(perfilUsuario);
		
		
		return "redirect:/usuarios/index";
	}
	
	@GetMapping("/demo-bcrypt")
	public String pruebaBcrypt() {
		String password = "luis123";
		String encriptado = encoder.encode(password);
		System.out.println("Password encriptado: " + encriptado);
		return "usuarios/demo";
	}

}
