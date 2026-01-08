package aplicacao;

import java.util.Scanner;

import entidades.Conta;


public class Banco {

	public static void main(String[] args) 
	{
		
       Scanner sc = new Scanner(System.in);
	   Conta conta ;
	
	System.out.println("Informe o numero da conta : ");
	int numeroConta = sc.nextInt();
	
	sc.nextLine();	
	System.out.println("Digite o nome do Titular da Conta");
	String donoConta = sc.next();
	
	System.out.print("Haverá depósito inicial (s/n)? ");//char resposta = sc.next().charAt(0) → lê apenas o primeiro caractere digitado (s ou n)
	char resposta = sc.next().charAt(0);
	
	if(resposta=='y') 
	{
		System.out.println("valor do deposito inicial :");
		double depositoInicial = sc.nextDouble();
		conta = new Conta(numeroConta, donoConta, depositoInicial);
				
	}else 
	{
		conta = new Conta(numeroConta, donoConta);
	}

	System.out.println();
	System.out.println("Dados da Conta");
	System.out.println(conta);
	
	

	System.out.println();
	

	System.out.println("Informe o valor do Deposito");
	double valorDeposito = sc.nextDouble();
	conta.depositar(valorDeposito);
	System.out.println("Dados Atualizados");
	
	System.out.println("Informe o valor do Saque");
	double valorSaque = sc.nextDouble();
	conta.sacar(valorSaque);
	System.out.println("Dados Atualizados");
	

	
	sc.close();
	
	
	}

}
