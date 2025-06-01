package com.usesoftware.biblioteca.service;
import org.springframework.stereotype.Service;
import com.usesoftware.biblioteca.model.Aluno;
import com.usesoftware.biblioteca.model.Biblioteca;
import com.usesoftware.biblioteca.model.Livro;
import com.usesoftware.biblioteca.model.Usuario;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BibliotecaService {
	Biblioteca livrosCadastrados = new Biblioteca();
	Biblioteca biblioteca = new Biblioteca();
	
	public void iniciarDados() {
		livrosCadastrados.adicionarLivro(new Livro("Livro A", 1, true, null));
		livrosCadastrados.adicionarLivro(new Livro("Livro B", 2, true, null));
		livrosCadastrados.adicionarLivro(new Livro("Livro D", 3, true, null));
		livrosCadastrados.adicionarLivro(new Livro("Livro E", 4, true, null));
		livrosCadastrados.adicionarLivro(new Livro("Livro F", 5, true, null));
		livrosCadastrados.adicionarLivro(new Livro("Livro G", 6, true, null));
		livrosCadastrados.adicionarLivro(new Livro("Livro H", 7, true, null));
		livrosCadastrados.adicionarLivro(new Livro("Livro I", 8, true, null));
		livrosCadastrados.adicionarLivro(new Livro("Livro J", 9, true, null));
		for (Livro livro : livrosCadastrados.getLivros().values()) {
			biblioteca.adicionarLivro(livro);
		}
	
	}
	
	public String emprestarLivro(Usuario usuario, Livro livro) {
		if(livro.getEmprestadoPara()!=null) {
			return "O livro selecionado já está emprestado.";
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
