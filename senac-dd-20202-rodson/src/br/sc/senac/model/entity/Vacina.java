package br.sc.senac.model.entity;

import java.time.LocalDate;

public class Vacina {
    
	private int idVacina;
	private String paisOrigem;
	private int estagioVacina;
	private LocalDate dt_inicio;

	public Vacina() {
		super();
		
	}

	public int getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(int idVacina) {
		this.idVacina = idVacina;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public int getEstagioVacina() {
		return estagioVacina;
	}

	public void setEstagioVacina(int estagioVacina) {
		this.estagioVacina = estagioVacina;
	}

	public LocalDate getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(LocalDate dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public Vacina(int idVacina, String paisOrigem, int estagioVacina, LocalDate dt_inicio) {
		super();
		this.idVacina = idVacina;
		this.paisOrigem = paisOrigem;
		this.estagioVacina = estagioVacina;
		this.dt_inicio = dt_inicio;
	}

	@Override
	public String toString() {
		return "Vacina [idVacina=" + idVacina + ", paisOrigem=" + paisOrigem + ", estagioVacina=" + estagioVacina
				+ ", dt_inicio=" + dt_inicio + "]";
	}
}