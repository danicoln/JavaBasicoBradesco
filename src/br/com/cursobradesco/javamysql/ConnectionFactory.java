package br.com.cursobradesco.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource combo = new ComboPooledDataSource();
		combo.setJdbcUrl("jdbc:mysql://localhost/cursobradesco?useTimezone=true&serverTimezone=UTC");
		combo.setUser("root");
		combo.setPassword("lincoln10");
		
		this.dataSource = combo;
	}
	
	public Connection recupercarConexao() {
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
