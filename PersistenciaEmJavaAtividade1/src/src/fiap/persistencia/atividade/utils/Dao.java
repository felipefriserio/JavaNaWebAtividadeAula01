package src.fiap.persistencia.atividade.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	public Connection openConnection(){
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:8889/PersistenciaJava", "sistema", "fiap");
		}  catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
		}
		return null;
	}
}
