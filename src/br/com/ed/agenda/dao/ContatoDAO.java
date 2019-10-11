package br.com.ed.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.ed.agenda.conexao.Conexao;
import br.com.ed.agenda.model.Contato;
import br.com.ed.agenda.model.Contato;

public class ContatoDAO{
	private Connection conexao;
	private PreparedStatement stmt;
	
	public ContatoDAO() {
		this.conexao = new Conexao().getConexao();
	}
	
	/*public void inserir(Conta conta, String tipo, Cliente cliente) {
		String sql = "insert into conta (numero, saldo,situacao,tipo, cliente_idcliente) values (?,?,?,?,?)";
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1,conta.getNumero() );
			stmt.setDouble(2, conta.getSaldo());
			stmt.setBoolean(3, conta.getSituacao());
			stmt.setString(4,tipo);
			stmt.setInt(5, cliente.getIdcliente());
			stmt.execute();
			stmt.close();
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}*/
}