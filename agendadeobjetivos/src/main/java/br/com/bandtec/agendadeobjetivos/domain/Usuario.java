package br.com.bandtec.agendadeobjetivos.domain;

public class Usuario {
	private String nome;
	private Integer idade;
	
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
}
