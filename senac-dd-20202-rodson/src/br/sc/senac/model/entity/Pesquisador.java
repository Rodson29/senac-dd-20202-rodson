package br.sc.senac.model.entity;

import java.time.LocalDate;

public class Pesquisador extends Pessoa {
	
    private int idPesquisador;
	private String instituicao_associada;
	public Pesquisador() {
		super();
		
	}
	public Pesquisador(int idPessoa, String nome, LocalDate dataNascimento, String sexo, String cpf,
			int avaliacaoPessoa) {
		super(idPessoa, nome, dataNascimento, sexo, cpf, avaliacaoPessoa);
	
	}
	public Pesquisador(int idPesquisador, String instituicao_associada) {
		super();
		this.idPesquisador = idPesquisador;
		this.instituicao_associada = instituicao_associada;
	}
	public int getIdPesquisador() {
		return idPesquisador;
	}
	public void setIdPesquisador(int idPesquisador) {
		this.idPesquisador = idPesquisador;
	}
	public String getInstituicao_associada() {
		return instituicao_associada;
	}
	public void setInstituicao_associada(String instituicao_associada) {
		this.instituicao_associada = instituicao_associada;
	}
	@Override
	public String toString() {
		return "Pesquisador [idPesquisador=" + idPesquisador + ", instituicao_associada=" + instituicao_associada + "]";
	}


}