package aplicação;

import java.util.Scanner;

import entidades.Conta;

public class Banco {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Informe o Numero da Conta: ");
		String numeroConta = sc.next();
		
		sc.nextLine();
		
		System.out.println("Agora informe o titular da conta : ");
		String titular =  sc.next();
		
		sc.nextLine();
		
		System.out.println("tera deposito inicial? s para sim e n para não");
		char resposta = sc.next().charAt(0);
		
		if (resposta=='s') 
		{
			System.out.println("informe o valor do deposito inicial");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, titular,depositoInicial);
		}
		else 
		{
			conta = new Conta(numeroConta, titular);
		}
	}

}
