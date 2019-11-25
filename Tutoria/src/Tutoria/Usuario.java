package Tutoria;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
	
	
	private int id;
	

	private String nome;
	private String email;
	private String senha;
	private int matricula;
	private String vinculo;
	private int reuniao;
	

	private List<String> topico = new ArrayList<String>();
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReuniao() {
		return reuniao;
	}
	public void setReuniao(int reuniao) {
		this.reuniao = reuniao;
	}
	public void setTopico(List<String> topico) {
		this.topico = topico;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getVinculo() {
		return vinculo;
	}
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	
}
