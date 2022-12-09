package BACKEND;

import java.util.Date;

public class Album {
    
    private String titulo;
    private Date dataEdicao;
    private String estilo;
    private Produtor produtor;

    public Album(String titulo, Date dataEdicao, String estilo, Produtor produtor) {
	this.titulo = titulo;
	this.dataEdicao = dataEdicao;
	this.estilo = estilo;
	this.produtor = produtor;
    }

    public Produtor getProdutor() {
	return produtor;
    }

    public void setProdutor(Produtor produtor) {
	this.produtor = produtor;
    }

    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }

    public Date getDataEdicao() {
	return dataEdicao;
    }

    public void setDataEdicao(Date dataEdicao) {
	this.dataEdicao = dataEdicao;
    }

    public String getEstilo() {
	return estilo;
    }

    public void setEstilo(String estilo) {
	this.estilo = estilo;
    }
}
