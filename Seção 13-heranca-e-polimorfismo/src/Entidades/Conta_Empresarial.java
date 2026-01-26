package Entidades;

import basico.Conta;

public class Conta_Empresarial extends CONTA {
	
	private Double limite_de_emprestimo;
	
    public Conta_Empresarial() {super();}

	public Conta_Empresarial(Integer n, String titular, Double saldo, Double limite_de_emprestimo) {
		super(n, titular, saldo);
		this.limite_de_emprestimo = limite_de_emprestimo;
	}

    public Double getLimite() {return limite_de_emprestimo;}
    public void setLimite(Double limite_de_emprestimo) {this.limite_de_emprestimo = limite_de_emprestimo;}
    
    public void emprestimo (double valor) 
    {
    	if(valor<=limite_de_emprestimo) {
    	//deposito(valor);
    		saldo = saldo + valor -10.00;
    	}
    }
    //USANDO O SUPER
    @Override
    public void saque(double valor) 
    {
	  super.saque(valor);
	  saldo -= 2.0;
    }
    
}
/*Suponhaqueemumnegóciorelacionadoabanco, apenas
contas poupança e contas para empresas sãopermitidas.
Nãoexistecontacomum.
Para garantir que contas comuns não possam ser
instanciadas, bastaacrescentarmosapalavra"abstract"na
declaraçãodaclasse.
•Demo:suponhaquevocêqueira:
• Totalizarosaldodetodasascontas.
• Depositar10.00emtodasascontas.*/