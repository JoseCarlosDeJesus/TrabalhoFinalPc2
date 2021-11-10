package br.com.prog2.tf.model;

import br.com.prog2.tf.dao.ChaleDAO;
import br.com.prog2.tf.dao.ExceptionDAO;

public class Chale {
	private Integer codChale;
	private String localizacao;
	private Integer capacidade;
	private Double valorAltaEstacao;
	private Double valorBaixaEstacao;
	private Hospedagem hospedagem;
	
	public Integer getCodChale() {
		return codChale;
	}
	public void setCodChale(Integer codChale) {
		this.codChale = codChale;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public Integer getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	public Double getValorAltaEstacao() {
		return valorAltaEstacao;
	}
	public void setValorAltaEstacao(Double valorAltaEstacao) {
		this.valorAltaEstacao = valorAltaEstacao;
	}
	public Double getValorBaixaEstacao() {
		return valorBaixaEstacao;
	}
	public void setValorBaixaEstacao(Double valorBaixaEstacao) {
		this.valorBaixaEstacao = valorBaixaEstacao;
	}
	public Hospedagem getHospedagem() {
		return hospedagem;
	}
	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}
	
	
	public Chale(Integer codChale, String localizacao, Integer capacidade, Double valorAltaEstacao,
			Double valorBaixaEstacao) {
		this.codChale = codChale;
		this.localizacao = localizacao;
		this.capacidade = capacidade;
		this.valorAltaEstacao = valorAltaEstacao;
		this.valorBaixaEstacao = valorBaixaEstacao;
	}
	public void cadastrarChale(Chale chale) throws ExceptionDAO {
		new ChaleDAO().cadastrarChale(chale);
	}
	
}
