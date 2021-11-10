package br.com.prog2.tf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.prog2.tf.model.Chale;


public class ChaleDAO {
	public void cadastrarChale(Chale chale) throws ExceptionDAO{
	String sql = "insert into chale (localizacao, capacidade, valorAltaEstacao, valorBaixaEstacao) value (?,?,?,?)";
	PreparedStatement pStatement = null;
	Connection connection = null;
	
	try {
		connection = new ConnectionMVC().getConnection();
		pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, chale.getLocalizacao());
		pStatement.setInt(2, chale.getCapacidade());
		pStatement.setDouble(3, chale.getValorAltaEstacao());
		pStatement.setDouble(4, chale.getValorBaixaEstacao());
		pStatement.execute();
	}catch (SQLException e) {
		throw new ExceptionDAO("Erro ao cadastrar cliente: " + e);
	}finally {
		try {
			if(pStatement != null) {
				pStatement.close();
			}
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
		}try {
			if(connection != null) {
				connection.close();
			}
		}
			catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
			}
	}
}
}
