package entidades;

public class Conta {

	private String numeroConta;
	private String titular;
	private double saldo;
	
	
	   public Conta(String numeroConta,String titular)
	   {
		   this.numeroConta = numeroConta;
		   this.titular = titular;
	   }
	   
	   public Conta(String numeroConta,String titular, double depositoInicial)
	   {
		   this.numeroConta = numeroConta;
		   this.titular = titular;
		   depositar(depositoInicial);
	   }

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	   
	    public void depositar(double valorDeposito)
	    {
	    	saldo = saldo + valorDeposito  ;
	    }
	
	    public void sacar(double valorSaque)
	    {
	    	saldo = saldo + valorSaque - 5  ;
	    }
	
	    
	    public String ToString() 
	    {
	    	return "O numero da Conta é: " + numeroConta + ", o Titular desta conta é : " + "e o saldo é de R$" + String.format("%.2f", saldo);
	    }

}
