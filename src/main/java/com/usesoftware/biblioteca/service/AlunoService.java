package com.usesoftware.biblioteca.service;

import org.springframework.stereotype.Service;

import com.usesoftware.biblioteca.model.Aluno;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunoService {
	private final UsuarioService usuarioService = new UsuarioService();
	
	public String cadastrar(Aluno aluno) {
		this.usuarioService.cadastrar(aluno);
		return "Usuário cadastrado com sucesso.";
	}
}
