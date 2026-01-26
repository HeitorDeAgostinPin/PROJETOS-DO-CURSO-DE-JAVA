package Entidades;

import basico.Conta;

public /*final*/ class Conta_Corrente extends CONTA{
    private Double taxaJuros;
    
    public Conta_Corrente() {super();}
    
    public Conta_Corrente(Integer n,String titular,Double saldo,Double taxaJuros)
    {
   	 super(n,titular,saldo);
   	 this.taxaJuros = taxaJuros;
    }
    
    public Double getTaxaJuros() {return taxaJuros;}
    public void setTaxaJuros(Double taxaJuros) {this.taxaJuros = taxaJuros;}
    
    public void atualizarSaldo() 
    {
   	saldo = saldo * taxaJuros; 
    }
    
    @Override
    public void  saque(double valor) 
    {
	  saldo = saldo - valor;//sem a taxa agora
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