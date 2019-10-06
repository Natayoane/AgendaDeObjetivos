package br.com.bandtec.agendadeobjetivos.domain;

import br.com.bandtec.agendadeobjetivos.controller.Credenciais;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbUsuario")
public class Usuario {
	private String nome;
	private Integer idade;

	@Id
	@GeneratedValue
	private Long IdUsuario;

	@Embedded
	private Credenciais credenciais;

	@OneToMany(mappedBy = "usuariozx")
	private List<Objetivo> objetivos;

	public Usuario(){}


	public Usuario(String nome, Integer idade, Credenciais credenciais, List<Objetivo> objetivos) {
		this.nome = nome;
		this.idade = idade;
		this.credenciais = credenciais;
		this.objetivos = objetivos;
	}

	public Integer getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}

	public Long getIdUsuario() { return IdUsuario; }

}
