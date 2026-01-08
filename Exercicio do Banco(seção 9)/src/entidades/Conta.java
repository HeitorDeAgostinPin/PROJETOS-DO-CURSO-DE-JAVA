package entidades;

public class Conta {

	 
		// TODO Auto-generated method stub
        private int numeroConta;
        private String donoConta;
        private double saldo;
        
        
        public Conta(int numeroConta, String donoConta) 
        {
        	this.numeroConta = numeroConta;
        	this.donoConta = donoConta;
        }
	
	    public Conta(int numeroConta, String donoConta, double depositoInicial) 
	    {
	    	this.numeroConta = numeroConta;
        	this.donoConta = donoConta;
        	depositar(depositoInicial);
	    }
	
	    public int getNumeroConta() 
	    {
	    	return numeroConta;
	    }
	    
	    public String getDonoConta() 
	    {
	    	return donoConta;
	    }
	    
	    public String setDonoConta() 
	    {
	    	return donoConta;
	    }
	    
	    public double getSaldo() 
	    {
	       return saldo;	
	    }
	    
	    public void depositar(double valorDeposito) 
	    {
	    	saldo += valorDeposito;
	    }
	    
	    public void sacar(double valorSaque) 
	    {
	       saldo = saldo - valorSaque + 5;	
	    }
	    
	    public String toString() 
	    {
	    	return "Numero da Conta :" + numeroConta + ",Dono da Conta :" + donoConta + ", Saldo: R$" + String.format("%.2f", saldo);
	    }
     }
