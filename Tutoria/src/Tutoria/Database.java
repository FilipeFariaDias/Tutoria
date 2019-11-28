package Tutoria;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Reunião {


	SimpleIntegerProperty id;
	SimpleStringProperty topico;
	SimpleStringProperty data;
	SimpleStringProperty hora;
	SimpleStringProperty duracao;
	
	public int getId() {
		return id.get();
	}

	public String getTopico() {
		return topico.get();
	}

	public String getData() {
		return data.get();
	}

	public String getHora() {
		return hora.get();
	}

	public String getDuracao() {
		return duracao.get();
	}

	public Reunião(Integer id, String topico, String data,
			String hora, String duracao) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.topico = new SimpleStringProperty(topico);
		this.data = new SimpleStringProperty(data);
		this.hora = new SimpleStringProperty(hora);
		this.duracao = new SimpleStringProperty(duracao);
	}
	
	


	
	
	
	
}
