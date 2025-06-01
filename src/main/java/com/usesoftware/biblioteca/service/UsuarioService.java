package com.usesoftware.biblioteca.service;

import java.util.HashMap;
import java.util.Map;
import com.usesoftware.biblioteca.model.Usuario;

public class UsuarioService {
	private Map<Long, Usuario> usuarios = new HashMap<>();
	private Long ultimoIdGerado = 0L;
	
	public String cadastrar(Usuario usuario) {
		this.usuarios.put(this.gerarIdUsuario(), usuario);
		return "Usuário cadastrado com sucesso.";
	}
	
	public Long gerarIdUsuario(){
		this.ultimoIdGerado += 1;
		return this.ultimoIdGerado;
	}
}
