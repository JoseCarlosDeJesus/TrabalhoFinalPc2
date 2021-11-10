package br.com.prog2.tf.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.prog2.tf.model.Cliente;


public class ClienteDAO {
	public void cadastrarCliente(Cliente cliente) throws ExceptionDAO{
		String sql = "insert into cliente (nomeCliente, rgCliente, enderecoCliente, bairroCliente, cidadeCliente, estadoCliente, CEPCliente, nascimentoCliente) value (?,?,?,?,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;
		
		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			//pStatement.setInt(1, cliente.getCodCliente());
			pStatement.setString(1, cliente.getNomeCliente());
			pStatement.setString(2, cliente.getRgCliente());
			pStatement.setString(3, cliente.getEnderecoCliente());
			pStatement.setString(4, cliente.getBairroCliente());
			pStatement.setString(5, cliente.getCidadeCliente());
			pStatement.setString(6, cliente.getEstadoCliente());
			pStatement.setString(7, cliente.getCEPCliente());
			pStatement.setDate(8, new Date(cliente.getNascimentoCliente().getTime()));
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
	
	public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO{
		String sql = "Select *from cliente where nomeCliente like '%"+ nome + "%' order by codCliente";
		
		Connection connection = null;
		PreparedStatement pStatement = null;
		ArrayList<Cliente> clientes = null;
		
		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			ResultSet rs = pStatement.executeQuery(sql);
			if(rs != null) {
				clientes = new ArrayList<Cliente>();
				while(rs.next()) {
					Cliente cliente = new Cliente();
					cliente.setCodCliente(rs.getInt("CodCliente"));
					cliente.setNomeCliente(rs.getString("nomeCliente"));
					cliente.setRgCliente(rs.getString("rgCliente"));
					cliente.setEnderecoCliente(rs.getString("enderecoCliente"));
					cliente.setBairroCliente(rs.getString("bairroCliente"));
					cliente.setCidadeCliente(rs.getString("cidadeCliente"));
					cliente.setEstadoCliente(rs.getString("estadoCliente"));
					cliente.setCEPCliente(rs.getString("CEPCliente"));
					cliente.setNascimentoCliente(rs.getDate("nascimentoCliente"));
					clientes.add(cliente);
				}
			}
			
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao consultar Clientes: " + e);
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
		return clientes;
		
	}
}

