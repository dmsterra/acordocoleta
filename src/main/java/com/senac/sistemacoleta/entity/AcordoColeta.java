package com.senac.sistemacoleta.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@javax.persistence.Entity
@Getter
@Setter
@javax.persistence.Table(name = "acordo_coleta")
public class AcordoColeta {

	@javax.persistence.Id
	@javax.persistence.Column(name = "acordo_coleta_id")
	private Long id;
	
	@javax.persistence.Column(name = "acordo_coleta_data_solicitacao")
	private LocalDateTime DataSolicitacao;
	
	@javax.persistence.Column(name = "acordo_coleta_data_coleta")
	private LocalDateTime DataColeta;
	
	@javax.persistence.Column(name = "acordo_coleta_status")
	private int status;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
		DataSolicitacao = dataSolicitacao;
	}

	public LocalDateTime getDataColeta() {
		return DataColeta;
	}

	public void setDataColeta(LocalDateTime dataColeta) {
		DataColeta = dataColeta;
	}


	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}	
