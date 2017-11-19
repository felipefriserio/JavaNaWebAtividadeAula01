package src.fiap.persistencia.atividade.main;

import java.sql.SQLException;

import src.fiap.persistencia.atividade.utils.FactoryDao;

public class MainCliente {
	public static void main(String[] args) {
		try {
			int id = 2;
			String nome  = "Teste nome";
			String email = "Teste email";		
			
			// testa insert 
			System.out.println((FactoryDao.getClienteDao().insert(id, nome, email)) ? "cliente inserido" : "erro ao inserir");
						
			// testa busca
			System.out.println(FactoryDao.getClienteDao().get(id).toString());
						
			//testa update 
			System.out.println(FactoryDao.getClienteDao().update(id, nome+" atualizado", email+" atualizado") ? "cliente atualizado" : "erro ao atualizar");
			System.out.println(FactoryDao.getClienteDao().get(id).toString());
			
			// testa delete 
			System.out.println((FactoryDao.getClienteDao().delete(id)) ? "cliente deletado" : "erro ao deletar");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
