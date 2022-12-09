/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BACKEND;

/**
 *
 * @author simao
 */
public class ProjetoPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Musico m = new Musico("simao", "rua", 30075706, "simao", "1234");
	RepositorioUtilizadores lista = new RepositorioUtilizadores();
	lista.adicionar(m, m.getUsername());
	
	if(lista.getByUsername("simao") instanceof Musico musico){
	    System.out.println("É musico!! de " + musico.getNumeroCC());
	    
	}
    }
    
}
