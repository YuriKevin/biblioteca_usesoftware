package com.usesoftware.biblioteca.model;

public class Livro {
	private Long id;
	private String titulo;
	private int valorCredito;
	private boolean disponivel;
	private Usuario emprestadoPara;
	
	public Livro(String titulo, int valorCredito, boolean disponivel, Usuario emprestadoPara) {
		this.titulo = titulo;
		this.valorCredito = valorCredito;
		this.disponivel = disponivel;
		this.emprestadoPara = emprestadoPara;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Usuario getEmprestadoPara() {
		return emprestadoPara;
	}
	public void setEmprestadoPara(Usuario emprestadoPara) {
		this.emprestadoPara = emprestadoPara;
	}
	
	
}
