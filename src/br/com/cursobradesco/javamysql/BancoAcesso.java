package br.com.cursobradesco.javamysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BancoAcesso {
	
	public static void main(String[] args) throws Exception {

		ConnectionFactory fac = new ConnectionFactory();
		Connection con = fac.recupercarConexao();
		
		String sql = "select codigo, nome, sexo from Pessoa";

		PreparedStatement pstm = con.prepareStatement(sql);
		ResultSet rst = pstm.executeQuery();

		while (rst.next()) {
			System.out.println(rst.getString("nome"));
		}
	}
}
