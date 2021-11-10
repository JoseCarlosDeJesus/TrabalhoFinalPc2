package br.com.prog2.tf.controller;

import java.util.Date;

import br.com.prog2.tf.dao.ExceptionDAO;
import br.com.prog2.tf.model.Hospedagem;

public class HospedagemController {
	static Integer codHospedagem = 1;
	public boolean cadastrarHospedagem(Integer codChale, String estado, Date dataInicio, 
									Date dataFim, Integer qtdPessoa, Double desconto, Double valorFinal) throws ExceptionDAO
	{
		if(codChale >0 && estado != null && estado.length() >0 && 
			dataInicio != null && dataFim != null && qtdPessoa > 0) {
			Hospedagem hospedagem = new Hospedagem(codHospedagem, codChale, estado, dataInicio, dataFim,
													qtdPessoa, desconto, valorFinal);
			codHospedagem++;
			hospedagem.cadastrarHospedagem(hospedagem);
			return true;
		}
		return false;
	}
}
