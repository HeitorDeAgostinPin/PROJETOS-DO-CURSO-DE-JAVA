package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutosVetor;

public class VetorProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         //Fazer um programa para ler um número inteiro N e os dados (nome e
				 //preço) de N Produtos. Armazene os N produtos em umvetor. Em
				 //seguida,mostrar o preço médio dos produtos.
		//TIPO CLASSE
		
	
		
		Scanner sc;
		 sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);

		 
		 int n = sc.nextInt();//vai ser o tamanho do vetor
		 
		 ProdutosVetor[] vetor = new ProdutosVetor[n];
		 
		 for(int i=0;i<n;i++)// melhor usar o vetor.lenght no lugar do n, de todos  
		 {
			
			 String nome = sc.nextLine();
			 double preco = sc.nextDouble();
			 
			 vetor[i] = new ProdutosVetor(nome, preco);
		 }
		 
		 double soma = 0;
		 
		 for(int i = 0;i<n;i++) 
		 {
			 soma = soma + vetor[i].getPreco();// soma todos os produtos, esse i indica a posição atual do vetor
		 }
		 
		 double media = soma/n;
		 
		 System.out.printf("media de preços : %.2f%n", media);
		 
		 sc.close();
	}

}
