package BACKEND;

import java.util.HashMap;

public class RepositorioUtilizadores {
    
    private HashMap<String, Object> listaUtilizadores;
    
    public RepositorioUtilizadores(){
	this.listaUtilizadores = new HashMap<>();
    }
    
    public void adicionar(Object u, String username){
	listaUtilizadores.put(username, u);
    }
    
    public Object getByUsername(String username){
	return listaUtilizadores.get(username);
    }
}
