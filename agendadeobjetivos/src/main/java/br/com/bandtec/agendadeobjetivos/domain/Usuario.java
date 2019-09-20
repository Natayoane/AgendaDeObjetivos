package br.com.bandtec.agendadeobjetivos.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "tbUsuario")
public class Usuario {
	private String nome;
	private Integer idade;

	@Id
	@GeneratedValue
	private Long IdUsuario;

	@Column(name = "loginUsuario")
	@JsonProperty
	private String login;

	@Column(name = "senhaUsuario")
	@JsonProperty
	private String senha;

	public Usuario(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}

	public Long getIdUsuario() { return IdUsuario; }

	public String getLogin() { return login; }

	public String getSenha() { return senha; }
}
