package Model.Entidades;

import Model.Execeções.ContaExceção;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void deposito(Double valor) {
		saldo = saldo + valor;
	}
	
	public void saque(Double valor) {
		validarSaque(valor);
		
		saldo = saldo + valor;
		
	}
	
	public void validarSaque (Double valor) {
		if(valor>getSaldo() ) 
		{
			throw new ContaExceção("Erro, saldo insuficiente");// isso aqui joga essa frase na variavel msg da classe de exceção ai pra usar o getMessenge depois
		}
		if(valor>getLimiteSaque()) 
		{
		    throw new ContaExceção("Erro, valor superior ao limite");	
		}
	}
}
