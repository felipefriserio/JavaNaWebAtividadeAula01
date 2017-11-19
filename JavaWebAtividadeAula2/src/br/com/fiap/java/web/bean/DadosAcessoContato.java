package br.com.fiap.java.web.bean;


public class DadosAcessoContato {

	private String dataPrimeiroAcesso;
	private String dataUltimoAcesso;
	
	public String getDataPrimeiroAcesso() {
		return dataPrimeiroAcesso;
	}
	public void setDataPrimeiroAcesso(String dataPrimeiroAcesso) {
		this.dataPrimeiroAcesso = "Primeiro acesso > "+dataPrimeiroAcesso;
	}
	public String getDataUltimoAcesso() {
		return dataUltimoAcesso;
	}
	public void setDataUltimoAcesso(String dataUltimoAcesso) {
		this.dataUltimoAcesso = "Ultimo acesso >" +dataUltimoAcesso;
	}
}
