package br.com.prog2.tf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;


import br.com.prog2.tf.model.Hospedagem;;

public class HospedagemDAO {
	public void cadastrarHospedagem(Hospedagem hospedagem) throws ExceptionDAO{
		String sql = "insert into hospedagem (codChale, estado, dataInicio, dataFim, qtdPessoas, desconto, valorFinal) value (?,?,?,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;
		
		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, hospedagem.getCodChale());
			pStatement.setString(2, hospedagem.getEstado());
			pStatement.setDate(3, new Date(hospedagem.getDataInicio().getTime()));
			pStatement.setDate(4, new Date(hospedagem.getDataFim().getTime()));
			pStatement.setInt(5, hospedagem.getQtdPessoas());
			pStatement.setDouble(6, hospedagem.getDesconto());
			pStatement.setDouble(7, hospedagem.getValorFinal());
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
