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
		
		try {
			return DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-05.cleardb.net/heroku_ac77cc65b91ce6b?reconnect=true", "b12e2c5b6d1bc3", "a5ece82f" );
		
		} catch (SQLException e) {
			LOG.error("Erro ao obter conexão JDBC");
			LOG.error("Código de erro: " + e.getErrorCode() );
			LOG.error("Causa do erro: " + e.getCause() );
			LOG.error("Mensagem de erro: " + e.getMessage() );
			
			throw new RuntimeException(e );
		}
		
		/*try {
			return DriverManager.getConnection("jdbc:mysql://localhost/booknet?useSSL=false", "root", "root" );
		
		} catch (SQLException e) {
			LOG.error("Erro ao obter conexão JDBC");
			LOG.error("Código de erro: " + e.getErrorCode() );
			LOG.error("Causa do erro: " + e.getCause() );
			LOG.error("Mensagem de erro: " + e.getMessage() );
			
			throw new RuntimeException(e );
		}*/
	}	


}
