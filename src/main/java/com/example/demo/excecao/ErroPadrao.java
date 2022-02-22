package com.example.demo.excecao;

public class ErroPadrao {
	private long data_hora;
	private Integer status;
	private String erro;
	
	public ErroPadrao() {
		super();		
	}

	public ErroPadrao(long data_hora, Integer status, String erro) {
		super();
		this.data_hora = data_hora;
		this.status = status;
		this.erro = erro;
	}

	public long getData_hora() {
		return data_hora;
	}

	public void setData_hora(long data_hora) {
		this.data_hora = data_hora;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}
}
