package br.com.bandtec.agendadeobjetivos.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.bandtec.agendadeobjetivos.domain.TodosUsuarios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.bandtec.agendadeobjetivos.domain.Usuario;

@RestController
public class UsuariosController {

    //	private List<Usuario> usuarios;
    private TodosUsuarios todosUsuarios;

    public UsuariosController() {

        // this.usuarios = obterTodosUsuarios();
        this.todosUsuarios = todosUsuarios;
    }

    @GetMapping("/usuarios/nome/{nomeDoUsuario}")
    public ResponseEntity<List<Usuario>> obterPorNome(@PathVariable("nomeDoUsuario") String nome) {
        List<Usuario> usuarios = todosUsuarios.obterPorNome(nome);
        if (usuarios.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(usuarios);
        }

    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
        todosUsuarios.save(usuario);
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }


//	private List<Usuario> obterTodosUsuarios(){
//		List<Usuario> usuarios = new ArrayList<Usuario>();
//		usuarios.add(new Usuario("Rodrigo", 18));
//		usuarios.add(new Usuario("Rodrigo", 10));
//		usuarios.add(new Usuario("Natalia", 17));
//		usuarios.add(new Usuario("Tayoane", 16));
//		return usuarios;
//	}
}
