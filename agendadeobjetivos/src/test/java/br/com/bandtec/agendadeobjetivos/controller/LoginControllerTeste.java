package br.com.bandtec.agendadeobjetivos.controller;
import javax.xml.ws.Response;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class LoginControllerTeste {
	
	@Test
	public void loginComSucesso() {
		LoginController controller = new LoginController();

		ResponseEntity<String> resposta  = controller.validarLogin(new Credenciais("login", "login"));

		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		assertEquals("sucesso", resposta.getBody());

	}
	
	
	@Test
	public void loginComFalha() {
		LoginController controller = new LoginController();
		
		ResponseEntity<String> resposta = controller.validarLogin(new Credenciais("login", "senha"));
		
		assertEquals(HttpStatus.UNAUTHORIZED, resposta.getStatusCode());
		assertEquals("erro", resposta.getBody());

	}

}
