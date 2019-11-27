package Tutoria;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private final List<Reunião> reuniões;
	private final List<String> topicos;
	public final List<Usuario> usuario;

	
	public Database(boolean initdata) {
		
		this.reuniões = new ArrayList<Reunião>();
		this.topicos = new ArrayList<String>();
		this.usuario = new ArrayList<Usuario>();
		
		if(initdata) {
			initdata();
		}
	}
	
	
	private void initdata() {
		Reunião r1 = new Reunião(1,"Orientação Profissional","25/12/2019","15:00","45 min");
		Reunião r2 = new Reunião(2,"Matricula","25/12/2019","15:45","20 min");
		Reunião r3 = new Reunião(3,"Outros","25/12/2019","16:00","40 min");
		save(r1);
		save(r2);
		save(r3);
		this.topicos.add("Orientação Profissional");
		this.topicos.add("Matricula");
		this.topicos.add("Outros");
		
		Usuario user1 = new Usuario(1, "Jose", "jose@tutoria.com","jose",123456,"Docente", reuniões, topicos);
		save(user1);
		
	
	}
	
	
	public List<Usuario> getUsuario() {
		return usuario;
	}


	private void save(Reunião reunião) {
		this.reuniões.add(reunião);
	}
	
	private void save(Usuario usuario) {
		this.usuario.add(usuario);
	}
}
