package br.sc.senac.model.entity;

import java.time.LocalDate;

public class Publico extends Pessoa {
	
	private int idPublico;
	private boolean vacinado;
	public Publico() {
		super();
		
	}
	public Publico(int idPessoa, String nome, LocalDate dataNascimento, String sexo, String cpf, int avaliacaoPessoa) {
		super(idPessoa, nome, dataNascimento, sexo, cpf, avaliacaoPessoa);

	}
	public Publico(int idPublico, boolean vacinado) {
		super();
		this.idPublico = idPublico;
		this.vacinado = vacinado;
	}
	public int getIdPublico() {
		return idPublico;
	}
	public void setIdPublico(int idPublico) {
		this.idPublico = idPublico;
	}
	public boolean isVacinado() {
		return vacinado;
	}
	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}
	@Override
	public String toString() {
		return "Publico [idPublico=" + idPublico + ", vacinado=" + vacinado + "]";
	}

}
