package com.usesoftware.biblioteca.service;

import org.springframework.stereotype.Service;
import com.usesoftware.biblioteca.model.Livro;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LivroService {
	private BibliotecaService bibliotecaService = new BibliotecaService();
	private Long ultimoIdGerado = 0L;
	
	public String cadastrar(Livro livro) {
		this.ultimoIdGerado += 1;
		livro.setId(ultimoIdGerado);
		this.bibliotecaService.livrosCadastrados.adicionarLivro(livro);
		return "Livro cadastrado com sucesso.";
	}
}
