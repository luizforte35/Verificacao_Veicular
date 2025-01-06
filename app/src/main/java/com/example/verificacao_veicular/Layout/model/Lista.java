package com.example.verificacao_veicular.Layout.model;

public class Lista {

	private String Nome;
	private String Descricao;
	private String Status;



	public Lista(String nome, String descricao) {
		Nome = nome;
		Descricao = descricao;
		Status = status;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}

