package br.com.bandtec.agendadeobjetivos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.agendadeobjetivos.domain.Usuario;

@RestController
public class UsuariosController {
	
	private List<Usuario> usuarios;
	
	public UsuariosController() {
		this.usuarios = obterTodosUsuarios();
	}
	
	@GetMapping("/usuarios/nome/{nomeDoUsuario}")
	public ResponseEntity<List<Usuario>> obterPorNome (@PathVariable("nomeDoUsuario") String nome) {
		ArrayList<Usuario> usuariosEncontrados = new ArrayList<Usuario>();
		for(Usuario user : usuarios) {
			if(nome.equals(user.getNome())) {
				usuariosEncontrados.add(user);	 
			}	
		}
		if(usuariosEncontrados.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} else {
			return ResponseEntity.ok(usuariosEncontrados);
		}
		
	}	
	
		
	private List<Usuario> obterTodosUsuarios(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Rodrigo", 18));
		usuarios.add(new Usuario("Rodrigo", 10));
		usuarios.add(new Usuario("Natalia", 17));
		usuarios.add(new Usuario("Tayoane", 16));
		return usuarios;
	}
}
