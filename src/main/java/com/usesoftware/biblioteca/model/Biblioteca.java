package com.usesoftware.biblioteca.model;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
	private Map<Long, Livro> livros = new HashMap<>();
	
	public Biblioteca() {
        
    }
	
	public Map<Long, Livro> listarLivros() {
		return this.livros;
	}
	
	public void adicionarLivro(Livro livro) {
		this.livros.put(livro.getId(), livro);
	}
	
	public void removerLivro(Livro livro) {
		this.livros.remove(livro.getId(), livro);
	}

	public Map<Long, Livro> getLivros() {
		return livros;
	}

	public void setLivros(Map<Long, Livro> livros) {
		this.livros = livros;
	}
	
	
}
