package br.sc.senac.model.entity;

import java.time.LocalDate;

public class Aplicacao_Vacina {
	 
	private int idAplicacao_vacina;
	private int avaliacao;
	private LocalDate data_aplicacao;
	private Vacina vacina;
	private Pessoa pessoa;
	
	public Aplicacao_Vacina() {
		super();
		
	}
	public Aplicacao_Vacina(int idAplicacao_vacina, int avaliacao, LocalDate data_aplicacao, Vacina vacina,
			Pessoa pessoa) {
		super();
		this.idAplicacao_vacina = idAplicacao_vacina;
		this.avaliacao = avaliacao;
		this.data_aplicacao = data_aplicacao;
		this.vacina = vacina;
		this.pessoa = pessoa;
	}
	public int getIdAplicacao_vacina() {
		return idAplicacao_vacina;
	}
	public void setIdAplicacao_vacina(int idAplicacao_vacina) {
		this.idAplicacao_vacina = idAplicacao_vacina;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public LocalDate getData_aplicacao() {
		return data_aplicacao;
	}
	public void setData_aplicacao(LocalDate data_aplicacao) {
		this.data_aplicacao = data_aplicacao;
	}
	public Vacina getVacina() {
		return vacina;
	}
	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	@Override
	public String toString() {
		return "Aplicacao_Vacina [idAplicacao_vacina=" + idAplicacao_vacina + ", avaliacao=" + avaliacao
				+ ", data_aplicacao=" + data_aplicacao + ", vacina=" + vacina + ", pessoa=" + pessoa + "]";
	}

}
