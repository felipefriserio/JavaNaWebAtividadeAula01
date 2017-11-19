package br.com.fiap.javaWeb.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/cadastroContato")
public class AtividadeAula1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String conteudo = "nome: "+req.getParameter("Nome")+
						  " idade: "+req.getParameter("Idade")+	
						  " email: "+req.getParameter("Email")+
						  " telefone: "+req.getParameter("Telefone"); 

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/logonrm/Desktop/cadastroContato.txt"))) {
			bw.write(conteudo);
			System.out.println("Processo concluido.");
			
			resp.getWriter().append("Arquivo criado com sucesso.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
