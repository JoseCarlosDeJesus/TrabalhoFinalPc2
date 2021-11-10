package br.com.prog2.tf.controller;

import java.util.ArrayList;
import java.util.Date;

import br.com.prog2.tf.dao.ClienteDAO;
import br.com.prog2.tf.dao.ExceptionDAO;
import br.com.prog2.tf.model.Cliente;
public class ClienteController {

	static Integer codCliente = 1;
	public boolean cadastrarCliente(String nomeCliente, String rgCliente, String enderecoCliente, 
									String bairroCliente, String cidadeCliente, String estadoCliente,
									String CEPCliente, Date nascimentoCLiente) throws ExceptionDAO
	{
		if(nomeCliente != null && nomeCliente.length() > 0 && rgCliente != null && rgCliente.length() > 0 && 
			enderecoCliente != null && enderecoCliente.length() > 0 && bairroCliente != null && bairroCliente.length() > 0 &&
			cidadeCliente != null && cidadeCliente.length() > 0 && estadoCliente != null && estadoCliente.length() >0 &&
			CEPCliente != null && CEPCliente.length() > 0 && nascimentoCLiente != null) {
			Cliente cliente = new Cliente(codCliente, nomeCliente, rgCliente, enderecoCliente, bairroCliente, cidadeCliente, estadoCliente,
											CEPCliente, nascimentoCLiente);
			codCliente++;
			cliente.cadastrarCliente(cliente);
			return true;
		}
		return false;
	}
	public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO{
		return new ClienteDAO().listarClientes(nome);
	}
}
