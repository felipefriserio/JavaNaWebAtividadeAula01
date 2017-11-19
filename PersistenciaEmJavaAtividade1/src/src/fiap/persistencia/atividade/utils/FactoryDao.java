package src.fiap.persistencia.atividade.utils;

import src.fiap.persistencia.atividade.mySqlDao.MySqlClienteDao;
import src.fiap.persistencia.atividade.mySqlDao.MySqlPedidoDao;

public class FactoryDao {
	public static MySqlClienteDao getClienteDao(){
		return new MySqlClienteDao();
	}
	
	public static MySqlPedidoDao getPedidoDao(){
		return new MySqlPedidoDao();
	}

}
