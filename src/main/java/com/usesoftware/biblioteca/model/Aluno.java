package com.usesoftware.biblioteca.model;

public class Aluno extends Usuario{
	private int creditos;
	private boolean possuiLivro;
	
	public Aluno(Long id, String nome, int creditos) {
		super(id, nome);
		this.creditos = creditos;
		
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public boolean isPossuiLivro() {
		return possuiLivro;
	}

	public void setPossuiLivro(boolean possuiLivro) {
		this.possuiLivro = possuiLivro;
	}
	
	
}
