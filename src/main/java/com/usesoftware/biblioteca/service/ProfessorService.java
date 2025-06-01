package com.usesoftware.biblioteca.service;

import org.springframework.stereotype.Service;
import com.usesoftware.biblioteca.model.Professor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfessorService {
private final UsuarioService usuarioService = new UsuarioService();
	
	public String cadastrar(Professor professor) {
		this.usuarioService.cadastrar(professor);
		return "Usuário cadastrado com sucesso.";
	}
}
