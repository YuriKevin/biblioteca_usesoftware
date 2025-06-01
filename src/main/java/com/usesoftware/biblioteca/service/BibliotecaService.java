package com.usesoftware.biblioteca.service;

import com.usesoftware.biblioteca.model.Aluno;
import com.usesoftware.biblioteca.model.Biblioteca;
import com.usesoftware.biblioteca.model.Livro;
import com.usesoftware.biblioteca.model.Usuario;

public class BibliotecaService {
	Biblioteca biblioteca = new Biblioteca();
	
	public void iniciarDados() {
		biblioteca.adicionarLivro(new Livro("Livro A", 1, true, null));
		biblioteca.adicionarLivro(new Livro("Livro B", 2, true, null));
		biblioteca.adicionarLivro(new Livro("Livro C", 3, true, null));
	}
	
	public String emprestarLivro(Usuario usuario, Livro livro) {
		
		if(livro.getEmprestadoPara()!=null) {
			return "Livro já está emprestado.";
		}
		
		if(usuario instanceof Aluno) {
			Aluno aluno = (Aluno) usuario;
			
			if (aluno.getCreditos()<=0) {
				return "Créditos insuficientes.";
			}
			if(aluno.isPossuiLivro()) {
				return "Você precisa devolver o livro atual antes de pegar um outro.";
			}
			aluno.setCreditos(aluno.getCreditos()-1);
			aluno.setPossuiLivro(true);
		}
		
		livro.setEmprestadoPara(usuario);
		biblioteca.removerLivro(livro);
		return "Você reservou o livro";
	}
	
	public String devolverLivro(Livro livro, Usuario usuario) {
		livro.setEmprestadoPara(null);

		if(usuario instanceof Aluno) {
			Aluno aluno = (Aluno) usuario;
			aluno.setCreditos(aluno.getCreditos()+1);
			aluno.setPossuiLivro(false);
		}
		biblioteca.adicionarLivro(livro);
		return "Você devolveu o livro.";
	}
}
