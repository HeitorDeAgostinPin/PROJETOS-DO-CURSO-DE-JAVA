package aplicação;

import java.util.Scanner;

import entidades.AlunoHotelVetor;

public class VetorHotelAluno {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		A dona de um pensionato possui dez quartos para alugar para estudantes,
		sendo esses quartos identificados pelos números 0 a 9.

		Fazer um programa que inicie com todos os dez quartos vazios, e depois
		leia uma quantidade N representando o número de estudantes que vão
		alugar quartos (N pode ser de 1 a 10).

		Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel,
		informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9).
		Suponha que seja escolhido um quarto vago.

		Ao final, seu programa deve imprimir um relatório de todas as ocupações do pensionato,
		por ordem de quarto, conforme exemplo.
		*/

		
		
		Scanner sc;
		sc = new Scanner(System.in);
	
		
		AlunoHotelVetor[] quartos =  new AlunoHotelVetor[10];
		
		int i;
		System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
		
	for(i = 1;i<=n;i++) 
	{
		 System.out.println();
		    System.out.println("Aluguel #" + i + ":");
		    
		    System.out.println("Nome: ");
		    sc.nextLine();
		    String nome = sc.nextLine();
		    
		    System.out.println("Email: ");
		    String email = sc.nextLine();
		    
		    System.out.println("Quarto( de 0 a 9): ");
		    int quarto = sc.nextInt();
		    
		    
		    
		    quartos[quarto] = new AlunoHotelVetor(nome,email);
	}
	
	System.out.println();
	
		System.out.println("Quartos ocupados: ");
		for(i = 0;i<quartos.length;i++)
		{
			if(quartos[i] !=null) 
			{
				System.out.println(i + ": "+ quartos[i]);
			}
		}
		
	sc.close(); }
	
	

}
