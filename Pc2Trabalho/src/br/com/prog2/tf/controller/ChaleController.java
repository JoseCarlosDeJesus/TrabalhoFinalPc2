package br.com.prog2.tf.controller;

import br.com.prog2.tf.dao.ExceptionDAO;
import br.com.prog2.tf.model.Chale;

public class ChaleController {
	static Integer codChale = 1;
	public boolean cadastrarChale(String localizacao, Integer capacidade, 
									Double valorAltaEstacao, Double valorBaixaEstacao) throws ExceptionDAO
	{
		if(codChale >0 && localizacao != null && localizacao.length() >0) {
			Chale chale = new Chale(codChale, localizacao, capacidade, valorAltaEstacao, valorBaixaEstacao);
			codChale++;
			chale.cadastrarChale(chale);
			return true;
		}
		return false;
	}
}
