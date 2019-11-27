package Tutoria;

public class Reunião {


	int id;
	String topico;
	String data;
	String hora;
	String duracao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopico() {
		return topico;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public Reunião(int id, String topico, String data, String hora, String duracao) {
		super();
		this.id = id;
		this.topico = topico;
		this.data = data;
		this.hora = hora;
		this.duracao = duracao;
	}
	
	
	
	
}
