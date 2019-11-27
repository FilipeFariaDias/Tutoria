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
	private List<Reunião> reunião;
	private List<String> topicos;

	
	
	
	public List<Reunião> getReunião() {
		return reunião;
	}
	public void setReunião(List<Reunião> reunião) {
		this.reunião = reunião;
	}
	public List<String> getTopicos() {
		return topicos;
	}
	public void setTopicos(List<String> topicos) {
		this.topicos = topicos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Usuario(int id, String nome, String email, String senha, int matricula, String vinculo,
			List<Reunião> reunião, List<String> topicos) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.matricula = matricula;
		this.vinculo = vinculo;
		this.reunião = reunião;
		this.topicos = topicos;
	}
	



	
}
