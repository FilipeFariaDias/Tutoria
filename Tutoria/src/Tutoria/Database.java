package Tutoria;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private final List<Reuni�o> reuni�es;
	private final List<String> topicos;
	public final List<Usuario> usuario;

	
	public Database(boolean initdata) {
		
		this.reuni�es = new ArrayList<Reuni�o>();
		this.topicos = new ArrayList<String>();
		this.usuario = new ArrayList<Usuario>();
		
		if(initdata) {
			initdata();
		}
	}
	
	
	private void initdata() {
		Reuni�o r1 = new Reuni�o(1,"Orienta��o Profissional","25/12/2019","15:00","45 min");
		Reuni�o r2 = new Reuni�o(2,"Matricula","25/12/2019","15:45","20 min");
		Reuni�o r3 = new Reuni�o(3,"Outros","25/12/2019","16:00","40 min");
		save(r1);
		save(r2);
		save(r3);
		this.topicos.add("Orienta��o Profissional");
		this.topicos.add("Matricula");
		this.topicos.add("Outros");
		
		Usuario user1 = new Usuario(1, "Jose", "jose@tutoria.com","jose",123456,"Docente", reuni�es, topicos);
		save(user1);
		
	
	}
	
	
	public List<Usuario> getUsuario() {
		return usuario;
	}


	private void save(Reuni�o reuni�o) {
		this.reuni�es.add(reuni�o);
	}
	
	private void save(Usuario usuario) {
		this.usuario.add(usuario);
	}
}
