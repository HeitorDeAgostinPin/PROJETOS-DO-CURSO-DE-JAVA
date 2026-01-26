package Entidades;

public abstract class CONTA {
	  private  Integer n;
	  private String titular;
	  protected Double saldo;

	  public CONTA(){};
	  public CONTA(Integer n,String titular,Double saldo){this.n = n;this.titular = titular;this.saldo = saldo;}
	  
	  public  Integer getNumero() {return n;}
	  public void setNumero(Integer n) {this.n = n;}
	  
	  public String getTitular() {return titular;}
	  public void setTitular(String titular) {this.titular = titular;}
	  
	  public Double getSaldo() {return saldo;}
	  //public void setSaldo(Double saldo) {this.saldo = saldo;}
	  
	  public void saque(double valor) 
	    {
		  saldo = saldo - (valor + 5.0);
	    }
	  
	  public void deposito(double valor)
	   {
		  saldo = saldo + valor;
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
