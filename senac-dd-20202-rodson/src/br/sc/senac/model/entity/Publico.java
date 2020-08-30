package br.sc.senac.model.entity;

import java.time.LocalDate;

public class Publico extends Pessoa {
	
	private int idPublico;
	private boolean voluntario;
	public Publico() {
		super();
		
	}
	public Publico(int idPessoa, String nome, LocalDate dataNascimento, String sexo, String cpf, int avaliacaoPessoa) {
		super(idPessoa, nome, dataNascimento, sexo, cpf, avaliacaoPessoa);

	}
	public Publico(int idPublico, boolean voluntario) {
		super();
		this.idPublico = idPublico;
		this.voluntario = voluntario;
	}
	public int getIdPublico() {
		return idPublico;
	}
	public void setIdPublico(int idPublico) {
		this.idPublico = idPublico;
	}
	public boolean isVoluntario() {
		return voluntario;
	}
	public void setVacinado(boolean voluntario) {
		this.voluntario = voluntario;
	}
	@Override
	public String toString() {
		return "Publico [idPublico=" + idPublico + ", voluntario=" + voluntario + "]";
	}

}
