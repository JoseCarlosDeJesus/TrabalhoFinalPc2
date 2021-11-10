package br.com.prog2.tf.model;

import java.util.ArrayList;
import java.util.Date;

import br.com.prog2.tf.dao.ChaleDAO;
import br.com.prog2.tf.dao.ExceptionDAO;
import br.com.prog2.tf.dao.HospedagemDAO;

public class Hospedagem {
	private Integer codHospedagem;
	private Integer codChale;
	private String estado;
	private Date dataInicio;
	private Date dataFim;
	private Integer qtdPessoas;
	private Double desconto;
	private Double valorFinal;
	private ArrayList<Cliente> hospedes = new ArrayList<Cliente>();
	

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Integer getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(Integer qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public ArrayList<Cliente> getHospedes() {
		return hospedes;
	}
	public void setHospedes(ArrayList<Cliente> hospedes) {
		this.hospedes = hospedes;
	}
	
	public Integer getCodHospedagem() {
		return codHospedagem;
	}
	public void setCodHospedagem(Integer codHospedagem) {
		this.codHospedagem = codHospedagem;
	}
	public Integer getCodChale() {
		return codChale;
	}
	public void setCodChale(Integer codChale) {
		this.codChale = codChale;
	}
	
	public Hospedagem(Integer codHospedagem, Integer codChale, String estado, Date dataInicio, Date dataFim,
			Integer qtdPessoas, Double desconto, Double valorFinal) {
		this.setCodHospedagem(codHospedagem);
		this.setCodChale(codChale);
		this.estado = estado;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.qtdPessoas = qtdPessoas;
		this.desconto = desconto;
		this.valorFinal = valorFinal;
	}

	public void cadastrarHospedagem(Hospedagem hospedagem) throws ExceptionDAO {
		new HospedagemDAO().cadastrarHospedagem(hospedagem);
	}

}
