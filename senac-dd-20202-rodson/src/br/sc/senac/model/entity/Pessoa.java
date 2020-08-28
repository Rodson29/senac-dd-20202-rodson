package br.sc.senac.model.entity;

import java.time.LocalDate;

public abstract class Pessoa {
	private int idPessoa;
	private String nome;
	private LocalDate dataNascimento;
	private String sexo;
	private String cpf;
	private int avaliacaoPessoa;
	
	public Pessoa() {
		
		super();
		
	}

	public Pessoa(int idPessoa, String nome, LocalDate dataNascimento, String sexo, String cpf, int avaliacaoPessoa) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.avaliacaoPessoa = avaliacaoPessoa;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAvaliacaoPessoa() {
		return avaliacaoPessoa;
	}

	public void setAvaliacaoPessoa(int avaliacaoPessoa) {
		this.avaliacaoPessoa = avaliacaoPessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo="
				+ sexo + ", cpf=" + cpf + ", avaliacaoPessoa=" + avaliacaoPessoa + "]";
	}



	

}
