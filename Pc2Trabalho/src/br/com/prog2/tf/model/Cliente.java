package br.com.prog2.tf.model;

import java.util.ArrayList;
import java.util.Date;

import br.com.prog2.tf.dao.ClienteDAO;
import br.com.prog2.tf.dao.ExceptionDAO;

public class Cliente {
	private Integer codCliente;
	private String nomeCliente;
	private String rgCliente;
	private String enderecoCliente;
	private String bairroCliente;
	private String cidadeCliente;
	private String estadoCliente;
	private String CEPCliente;
	private Date nascimentoCliente;
	
	private ArrayList<Hospedagem> hospedagens = new ArrayList<Hospedagem>();
	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getRgCliente() {
		return rgCliente;
	}
	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getBairroCliente() {
		return bairroCliente;
	}
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public String getEstadoCliente() {
		return estadoCliente;
	}
	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}
	public String getCEPCliente() {
		return CEPCliente;
	}
	public void setCEPCliente(String cEPCliente) {
		CEPCliente = cEPCliente;
	}
	public ArrayList<Hospedagem> getHospedagens() {
		return hospedagens;
	}
	public void setHospedagens(ArrayList<Hospedagem> hospedagens) {
		this.hospedagens = hospedagens;
	}
	
	public Date getNascimentoCliente() {
		return nascimentoCliente;
	}
	public void setNascimentoCliente(Date nascimentoCliente) {
		this.nascimentoCliente = nascimentoCliente;
	}
	
	public Cliente() {
		
	}
	public Cliente(Integer codCliente, String nomeCliente, String rgCliente, String enderecoCliente,
			String bairroCliente, String cidadeCliente, String estadoCliente, String cEPCliente, Date nascimentoCliente) {
		this.codCliente = codCliente;
		this.nomeCliente = nomeCliente;
		this.rgCliente = rgCliente;
		this.enderecoCliente = enderecoCliente;
		this.bairroCliente = bairroCliente;
		this.cidadeCliente = cidadeCliente;
		this.estadoCliente = estadoCliente;
		this.CEPCliente = cEPCliente;
		this.setNascimentoCliente(nascimentoCliente);
	}
	public void cadastrarCliente(Cliente cliente) throws ExceptionDAO {
		new ClienteDAO().cadastrarCliente(cliente);
	}
	
	public ArrayList<Cliente> listarFilmes(String nome) throws ExceptionDAO{
		return new ClienteDAO().listarClientes(nome);
	}
	
}
