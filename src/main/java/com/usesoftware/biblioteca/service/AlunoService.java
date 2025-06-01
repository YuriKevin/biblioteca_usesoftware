package com.usesoftware.biblioteca.service;

import com.usesoftware.biblioteca.model.Aluno;

public class AlunoService {
	private final UsuarioService usuarioService = new UsuarioService();
	
	public String cadastrar(Aluno aluno) {
		this.usuarioService.cadastrar(aluno);
		return "Usuário cadastrado com sucesso.";
	}
}
