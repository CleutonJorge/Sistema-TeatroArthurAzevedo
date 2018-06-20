package com.example.SistemaDeLivraria.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConexaoComponente {
	

	private final static Log LOG = LogFactory.getLog(ConexaoComponente.class ); 
	
	
	public Connection obterConexaoJDBC() {
		
//		try {
//			return DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-04.cleardb.net/heroku_7c4f250985cf99d?reconnect=true", "b86e56554df6e3", "565d1530" );
//		} catch (SQLException e) {
//			LOG.error("Erro ao obter conexão JDBC");
//			LOG.error("Código de erro: " + e.getErrorCode() );
//			LOG.error("Causa do erro: " + e.getCause() );
//			LOG.error("Mensagem de erro: " + e.getMessage() );
//			
//			throw new RuntimeException(e );
//		}
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/sistemataa?useSSL=false", "root", "root" );
		
		} catch (SQLException e) {
			LOG.error("Erro ao obter conexão JDBC");
			LOG.error("Código de erro: " + e.getErrorCode() );
			LOG.error("Causa do erro: " + e.getCause() );
			LOG.error("Mensagem de erro: " + e.getMessage() );
			
			throw new RuntimeException(e );
		}
	}	


}
