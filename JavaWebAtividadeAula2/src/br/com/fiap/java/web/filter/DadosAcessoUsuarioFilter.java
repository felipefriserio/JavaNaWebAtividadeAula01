package br.com.fiap.java.web.filter;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.com.fiap.java.web.bean.DadosAcessoContato;

/**
 * Servlet Filter implementation class DadosAcessoUsuarioFilter
 */
@WebFilter("/*")
public class DadosAcessoUsuarioFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DadosAcessoUsuarioFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest requisicao = (HttpServletRequest) request;
		DadosAcessoContato dadosContato = (DadosAcessoContato) requisicao.getSession().getAttribute("dadosContato");
		
		//captura hora atual
		Calendar data = Calendar.getInstance();
		int hora = data.get(Calendar.HOUR_OF_DAY); 
		int min = data.get(Calendar.MINUTE);
		int sec = data.get(Calendar.SECOND);
		
		// controle de atualizacao
		if (dadosContato == null) {
			dadosContato = new DadosAcessoContato();
			dadosContato.setDataPrimeiroAcesso(hora+":"+min+":"+sec);
			dadosContato.setDataUltimoAcesso(hora+":"+min+":"+sec);
		}else
			dadosContato.setDataUltimoAcesso(hora+":"+min+":"+sec);
		
		// seta dados em sessao
		requisicao.getSession().setAttribute("dadosContato", dadosContato);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
