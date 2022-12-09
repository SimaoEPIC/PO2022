package BACKEND;

import java.util.Date;

public class Musico extends Utilizador{
    
    private String nome;
    private Date dataNascimento;
    private String morada;
    private long numeroCC;
    //lista instrumentos

    public Musico(String nome, String morada, long numeroCC, String username, String password) {
	super(username, password);
	this.nome = nome;
	this.dataNascimento = dataNascimento;
	this.morada = morada;
	this.numeroCC = numeroCC;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Date getDataNascimento() {
	return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
    }

    public String getMorada() {
	return morada;
    }

    public void setMorada(String morada) {
	this.morada = morada;
    }

    public long getNumeroCC() {
	return numeroCC;
    }

    public void setNumeroCC(long numeroCC) {
	this.numeroCC = numeroCC;
    }
}
