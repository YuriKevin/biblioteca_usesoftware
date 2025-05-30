package com.usesoftware.biblioteca.model;

public class Aluno extends Usuario{
	private int creditos;
	
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
}
